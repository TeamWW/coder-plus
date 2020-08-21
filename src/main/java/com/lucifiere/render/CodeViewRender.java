package com.lucifiere.render;

import com.google.common.base.Preconditions;
import com.lucifiere.extract.Model;
import com.lucifiere.extract.table.TableModel;
import com.lucifiere.render.views.CodeView;
import com.lucifiere.templates.spec.TemplateSpec;
import org.apache.commons.lang3.StringUtils;

public class CodeViewRender extends StringTemplateRender {

    public CodeViewRender(String templateId) {
        super(templateId);
    }

    @Override
    protected View createView(String content, Model model, TemplateSpec spec) {
        Preconditions.checkArgument(StringUtils.isNotBlank(content));
        Preconditions.checkArgument(model instanceof TableModel);
        CodeView codeView = new CodeView();
        codeView.setContent(content);
        codeView.setFileSetting(spec.getFileSetting());
        TableModel tableModel = (TableModel) model;
        codeView.setName(tableModel.getName());
        return codeView;
    }

}
