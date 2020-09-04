package com.lucifiere.render.freemarker;

import com.lucifiere.extract.Model;
import com.lucifiere.render.AbstractRender;
import com.lucifiere.templates.TemplateInstant;
import freemarker.template.Configuration;

public abstract class FreemarkerRender extends AbstractRender {

    public FreemarkerRender(String templateId) {
        super(templateId);
    }

    @Override
    protected String doRender(Model model, TemplateInstant template) {
        return null;
    }

}
