package com.lucifiere.render;

import com.lucifiere.extract.Model;
import com.lucifiere.templates.spec.TemplateSpec;

public abstract class StringTemplateRender extends AbstractRender {

    public StringTemplateRender(String templateId) {
        super(templateId);
    }

    @Override
    protected String rendContent(Model model, TemplateSpec template, String templateContent) {
        return null;
    }

}
