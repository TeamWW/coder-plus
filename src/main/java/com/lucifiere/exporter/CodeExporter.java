package com.lucifiere.exporter;

import com.google.common.base.Preconditions;
import com.lucifiere.render.View;
import com.lucifiere.render.views.CodeView;

import java.util.List;

/**
 * 代码输出工具
 *
 * @author XD.Wang
 * Date 2020-8-2.
 */
public class CodeExporter implements Exporter {

    @Override
    public void export(List<View> views) {
        checkViewType(views);
    }

    private void checkViewType(List<View> views) {
        Preconditions.checkNotNull(views);
        Preconditions.checkArgument(views.stream().allMatch(v -> v instanceof CodeView));
    }

}
