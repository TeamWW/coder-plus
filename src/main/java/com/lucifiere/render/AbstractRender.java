package com.lucifiere.render;

import cn.hutool.log.StaticLog;
import com.lucifiere.model.Model;
import com.lucifiere.templates.TemplateInstant;
import com.lucifiere.templates.spec.TemplateSpec;
import com.lucifiere.utils.GlobalContextHolder;

import java.util.function.Function;

public abstract class AbstractRender implements Render {

    protected final TemplateInstant templateInstant;

    protected static Function<Model, Model> MODEL_ATTR_PROCESSOR = (m) -> m;

    public static void setModelAttrProcessor(Function<Model, Model> modelAttrProcessor) {
        MODEL_ATTR_PROCESSOR = modelAttrProcessor;
    }

    public AbstractRender(String templateId) {
        this.templateInstant = getTemplate(templateId);
    }

    private TemplateInstant getTemplate(String templateId) {
        TemplateSpec spec = GlobalContextHolder.globalContext.getTemplateById(templateId);
        TemplateInstant instant = new TemplateInstant();
        instant.setTemplateSpec(spec);
        return instant;
    }

    @Override
    public View render(final Model model) {
        processModelBeforeRender(model);
        String templateId = templateInstant.getTemplateSpec().getId();
        String content = doRender(model);
        String templateId = templateInstant.getTemplateSpec().getId();
        if (content == null) {
            throw new RuntimeException("render template -- " + templateId + " -- failed！");
        }
        StaticLog.info("rendering template -- {} -- completed!", templateId);
        return createView(content, model);
    }

    protected void processModelBeforeRender(Model model) {
        MODEL_ATTR_PROCESSOR.apply(model);
    }

    protected abstract String doRender(Model model);

    protected abstract View createView(String content, Model model);

}
