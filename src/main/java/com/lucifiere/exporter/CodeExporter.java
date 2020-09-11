package com.lucifiere.exporter;

import cn.hutool.core.util.NumberUtil;
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

import java.util.List;
import java.util.Objects;

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
        views.stream().map(view -> (CodeView) view).forEach(view -> NioTextFileAccessor.createFile(view.getContent(), outPath, createFileName(view)));
    }

    @Override
    public String getOutputPath() {
        return context.getConfig().getWorkspacePath() + "/" + context.getConfig().getOutputDir();
    }

    private void checkViewType(List<View> views) {
        Preconditions.checkNotNull(views);
        Preconditions.checkArgument(views.stream().allMatch(v -> v instanceof CodeView));
    }

    private String createFileName(CodeView view) {
        FileSetting fileSetting = view.getFileSetting();
        if (StrUtil.isNotBlank(fileSetting.getCustomizedFileName())) {
            return fileSetting.getCustomizedFileName();
        }
        if (Objects.equals(fileSetting.getFileType(), FileType.MYBATIS_XML)) {
            String fileName = CodeStyle.ofUlCode(view.getName()).toStyle(CodeStyle.NamedStyle.CAMEL).toStyle(CodeStyle.NamedStyle.CAP_FIRST).toString();
            return fileSetting.getPrefix() + fileName + fileSetting.getFileType().getExt();
        } else if (Objects.equals(fileSetting.getFileType(), FileType.JAVA)) {
            return getJavaClassName(view.getContent());
        } else {
            return "temp-file";
        }
    }

    private String getJavaClassName(String codeContent) {
        int keywordIdx = NumberUtil.max(codeContent.indexOf("class"), codeContent.indexOf("interface"), codeContent.indexOf("enum"));
        int nextBracketIdx = codeContent.indexOf("{", keywordIdx);
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
