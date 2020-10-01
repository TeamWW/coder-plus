package com.lucifiere.exporter;

import cn.hutool.core.util.StrUtil;
import com.google.common.base.Preconditions;
import com.lucifiere.common.FileSetting;
import com.lucifiere.common.FileType;
import com.lucifiere.container.GlobalContext;
import com.lucifiere.container.GlobalContextAware;
import com.lucifiere.container.ManagedBean;
import com.lucifiere.io.NioTextFileAccessor;
import com.lucifiere.render.View;
import com.lucifiere.render.views.CodeView;
import com.lucifiere.utils.CodeStyle;
import com.lucifiere.utils.ExceptionUtils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * 代码输出工具
 *
 * @author XD.Wang
 * Date 2020-8-2.
 */
@ManagedBean
public class CodeExporter implements Exporter, GlobalContextAware {

    private GlobalContext context;

    @Override
    public void export(List<View> views) {
        checkViewType(views);
        String outPath = getOutputPath();
        views.stream().map(view -> (CodeView) view).forEach(ExceptionUtils.ioConsumer(view -> {
            if (StrUtil.isNotBlank(view.getFileSetting().getFileDir())) {
                Path path = Paths.get(getOutputPath() + view.getFileSetting().getFileDir());
                if (!Files.exists(path)) {
                    Files.createDirectory(path);
                }
            }
            NioTextFileAccessor.createFile(view.getContent(), outPath, createFilePath(view));
        }));
    }

    @Override
    public String getOutputPath() {
        return context.getConfig().getWorkspacePath() + "/" + context.getConfig().getOutputDir();
    }

    private void checkViewType(List<View> views) {
        Preconditions.checkNotNull(views);
        Preconditions.checkArgument(views.stream().allMatch(v -> v instanceof CodeView));
    }

    private String createFilePath(CodeView view) {
        FileSetting fileSetting = view.getFileSetting();
        if (StrUtil.isNotBlank(fileSetting.getFileName())) {
            return fileSetting.getFileName();
        }
        String fileDir = Optional.ofNullable(view.getFileSetting().getFileDir()).orElse("");
        if (Objects.equals(fileSetting.getFileType(), FileType.MYBATIS_XML)) {
            String fileName = CodeStyle.ofUlCode(view.getName()).toStyle(CodeStyle.NamedStyle.CAMEL).toStyle(CodeStyle.NamedStyle.CAP_FIRST).toString();
            fileDir += fileSetting.getPrefix() + fileName + fileSetting.getSuffix() + fileSetting.getFileType().getExt();
        } else if (Objects.equals(fileSetting.getFileType(), FileType.JAVA)) {
            fileDir += fileSetting.getPrefix() + getJavaClassName(view.getContent()) + fileSetting.getSuffix();
        }
        return fileDir;
    }

    private String getJavaClassName(String codeContent) {
        int keywordIdx = Stream.of(codeContent.indexOf("class"), codeContent.indexOf("interface"), codeContent.indexOf("enum"))
                .filter(it -> it > 0).mapToInt(it -> it).min().orElse(-1);
        int nextBracketIdx = Stream.of(codeContent.indexOf("{", keywordIdx), codeContent.indexOf("implements", keywordIdx), codeContent.indexOf("extends", keywordIdx))
                .filter(it -> it > 0).mapToInt(it -> it).min().orElse(-1);
        if (keywordIdx == -1 || nextBracketIdx == -1) {
            throw new RuntimeException("not a standard java file!");
        }
        return codeContent.substring(codeContent.indexOf(" ", keywordIdx), nextBracketIdx).trim() + FileType.JAVA.getExt();
    }

    @Override
    public void setGlobalContext(GlobalContext globalContext) {
        this.context = globalContext;
    }

}
