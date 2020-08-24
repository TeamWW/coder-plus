package com.lucifiere.exporter;

import com.google.common.base.Preconditions;
import com.lucifiere.common.FileSetting;
import com.lucifiere.common.GlobalContext;
import com.lucifiere.common.GlobalContextAware;
import com.lucifiere.io.NioTextFileAccessor;
import com.lucifiere.render.View;
import com.lucifiere.render.views.CodeView;

import java.util.List;

/**
 * 代码输出工具
 *
 * @author XD.Wang
 * Date 2020-8-2.
 */
public class CodeExporter implements Exporter, GlobalContextAware {

    private final NioTextFileAccessor nioTextFileAccessor = new NioTextFileAccessor();

    private GlobalContext context;

    @Override
    public void export(List<View> views) {
        checkViewType(views);
        views.parallelStream().map(view -> (CodeView) view).forEach(view -> nioTextFileAccessor.createFile(view.getContent(), context.outputPath(), createFileName(view)));
    }

    private void checkViewType(List<View> views) {
        Preconditions.checkNotNull(views);
        Preconditions.checkArgument(views.stream().allMatch(v -> v instanceof CodeView));
    }

    private String createFileName(CodeView view) {
        var fileSetting = view.getFileSetting();
        return fileSetting.getPrefix() + view.getName() + view.getName() + fileSetting.getExt();
    }

    @Override
    public void setGlobalContext(GlobalContext globalContext) {
        this.context = globalContext;
    }

}
