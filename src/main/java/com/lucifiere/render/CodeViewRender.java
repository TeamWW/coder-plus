package com.lucifiere.render;

import com.google.common.base.Preconditions;
import com.lucifiere.extract.Model;
import com.lucifiere.render.views.CodeView;
import com.lucifiere.templates.Template;
import org.apache.commons.lang3.StringUtils;

public class CodeViewRender extends StringTemplateRender {

    public CodeViewRender(Template template) {
        super(template);
    }

    @Override
    protected View createView(String content, Model model) {
        return null;
    }

    @Override
    protected String rendContent(Model model) {
        return null;
    }

    private CodeView createCodeView(String c) {
        Preconditions.checkArgument(StringUtils.isNotBlank(c));
        CodeView codeView = new CodeView();
        codeView.setContent(c);
        codeView.setFileExt("");
        codeView.setFileSuffix("");
        codeView.setFilePrefix("");
        codeView.setName("");
        return codeView;
    }

}
