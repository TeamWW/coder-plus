package com.lucifiere.render;

import com.lucifiere.extract.Model;
import com.lucifiere.templates.TemplateInstant;

public abstract class FreemarkerRender extends AbstractRender {

    public FreemarkerRender(String templateId) {
        super(templateId);
    }

    @Override
    protected String doRender(Model model, TemplateInstant template) {
        return null;
    }

}
