package com.lucifiere.render.freemarker;

import cn.hutool.core.util.StrUtil;
import com.google.common.base.Preconditions;
import com.lucifiere.model.Model;
import com.lucifiere.model.TableModel;
import com.lucifiere.render.View;
import com.lucifiere.render.views.CodeView;

import static com.lucifiere.model.ModelBuiltInAttr.*;
import static com.lucifiere.utils.CodeStyle.NamedStyle;
import static com.lucifiere.utils.CodeStyle.ofCamelCode;

public class CodeViewRender extends FreemarkerRender {

    public CodeViewRender(String templateId) {
        super(templateId);
    }

    @Override
    protected void processModelBeforeRender(Model model) {
        super.processModelBeforeRender(model);
        if (model instanceof TableModel tableModel) {
            model.addBuiltInAttr(BIZ.key(), ofCamelCode(tableModel.getName()).toString())
                    .addBuiltInAttr(BIZ_DESC.key(), tableModel.getDesc())
                    .addBuiltInAttr(BIZ_PREFIX.key(), tableModel.getBizPrefix())
                    .addBuiltInAttr(CAPTAl_FIRST_BIZ.key(), ofCamelCode(tableModel.getName()).toStyle(NamedStyle.CAP_FIRST).toString())
                    .addBuiltInAttr(CAMEL_BIZ.key(), ofCamelCode(tableModel.getName()).toString())
                    .addBuiltInAttr(UNDERLINE_BIZ.key(), ofCamelCode(tableModel.getName()).toString())
                    .addBuiltInAttr(FIELDS.key(), tableModel.getFields());
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
