package com.lucifiere.render;

import cn.hutool.core.util.StrUtil;
import com.google.common.base.Preconditions;
import com.lucifiere.extract.Model;
import com.lucifiere.extract.table.TableModel;
import com.lucifiere.render.views.CodeView;
import com.lucifiere.templates.TemplateInstant;
import com.lucifiere.utils.CodeStyle;

public class CodeViewRender extends StringTemplateRender {

    private static final String BIZ = "biz";

    private static final String BIZ_PREFIX = "biz-pref";

    private static final String CAPTAl_FIRST_BIZ = "cf-biz";

    private static final String CAMEL_BIZ = "c-biz";

    private static final String UNDERLINE_BIZ = "u-biz";

    public CodeViewRender(String templateId) {
        super(templateId);
    }

    @Override
    protected void processModelBeforeRender(Model model) {
        if (model instanceof TableModel tableModel) {
            super.processModelBeforeRender(model);
            model.addAttr(BIZ, CodeStyle.switchNamedStyle(tableModel.getName(), CodeStyle.NamedStyle.CAMEL));
        }
    }

    @Override
    protected View createView(String content, Model model, TemplateInstant template) {
        Preconditions.checkArgument(StrUtil.isNotBlank(content));
        Preconditions.checkArgument(model instanceof TableModel);
        var codeView = new CodeView();
        codeView.setContent(content);
        codeView.setFileSetting(template.getTemplateSpec().getFileSetting());
        var tableModel = (TableModel) model;
        codeView.setName(tableModel.getName());
        return codeView;
    }

}
