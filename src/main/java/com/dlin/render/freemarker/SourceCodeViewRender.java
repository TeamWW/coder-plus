package com.dlin.render.freemarker;

import cn.hutool.core.util.StrUtil;
import com.google.common.base.Preconditions;
import com.dlin.model.Model;
import com.dlin.model.TableModel;
import com.dlin.render.View;
import com.dlin.render.views.SourceCodeView;

public class SourceCodeViewRender extends FreemarkerRender {

    public SourceCodeViewRender(String templateId) {
        super(templateId);
    }

    @Override
    protected void processModelBeforeRender(Model model) {
        super.processModelBeforeRender(model);
    }

    @Override
    protected View createView(String content, Model model) {
        Preconditions.checkArgument(StrUtil.isNotBlank(content));
        Preconditions.checkArgument(model instanceof TableModel);
        SourceCodeView sourceCodeView = new SourceCodeView();
        sourceCodeView.setContent(content);
        sourceCodeView.setFileSetting(templateInstant.getTemplateSpec().getFileSetting());
        sourceCodeView.setName(model.getKeyword());
        return sourceCodeView;
    }

}
