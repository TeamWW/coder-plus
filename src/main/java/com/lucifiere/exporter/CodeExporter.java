package com.lucifiere.exporter;

import com.google.common.base.Preconditions;
import com.lucifiere.container.GlobalContext;
import com.lucifiere.container.GlobalContextAware;
import com.lucifiere.container.ManagedBean;
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
@ManagedBean
public class CodeExporter implements Exporter, GlobalContextAware {

    private GlobalContext context;

    @Override
    public void export(List<View> views) {
        checkViewType(views);
        String outPath = context.getConfig().workspacePath() + "/" + context.getConfig().outputPath();
        views.parallelStream().map(view -> (CodeView) view).forEach(view -> NioTextFileAccessor.createFile(view.getContent(), outPath, createFileName(view)));
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
