package com.lucifiere.render.freemarker;

import cn.hutool.core.util.StrUtil;
import com.google.common.base.Preconditions;
import com.lucifiere.extract.Model;
import com.lucifiere.extract.table.TableModel;
import com.lucifiere.render.View;
import com.lucifiere.render.views.CodeView;

import static com.lucifiere.utils.CodeStyle.NamedStyle;
import static com.lucifiere.utils.CodeStyle.ofCamelCode;

public class CodeViewRender extends FreemarkerRender {

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
        super.processModelBeforeRender(model);
        if (model instanceof TableModel tableModel) {
            model.addAttr(BIZ, ofCamelCode(tableModel.getName()).toString());
            model.addAttr(BIZ_PREFIX, tableModel.getBizPrefix());
            model.addAttr(CAPTAl_FIRST_BIZ, ofCamelCode(tableModel.getName()).toStyle(NamedStyle.CAP_FIRST).toString());
            model.addAttr(CAMEL_BIZ, ofCamelCode(tableModel.getName()).toString());
            model.addAttr(UNDERLINE_BIZ, ofCamelCode(tableModel.getName()).toString());
        }
    }

    @Override
    protected View createView(String content, Model model) {
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
