package com.lucifiere.render;

import cn.hutool.log.StaticLog;
import com.lucifiere.common.TemplateContainerAware;
import com.lucifiere.model.Model;
import com.lucifiere.io.NioTextFileAccessor;
import com.lucifiere.templates.TemplateSpecContainer;
import com.lucifiere.templates.TemplateInstant;
import com.lucifiere.templates.spec.TemplateSpec;

import java.util.function.Function;

public abstract class AbstractRender implements Render, TemplateContainerAware {

    private TemplateSpecContainer templateSpecContainer;

    protected final TemplateInstant template;

    protected static Function<Model, Model> MODEL_ATTR_PROCESSOR = (m) -> m;

    public static void setModelAttrProcessor(Function<Model, Model> modelAttrProcessor) {
        MODEL_ATTR_PROCESSOR = modelAttrProcessor;
    }

    public AbstractRender(String templateId) {
        this.template = getTemplate(templateId);
    }

    @Override
    public void setTemplateSpecContainer(TemplateSpecContainer templateSpecContainer) {
        this.templateSpecContainer = templateSpecContainer;
    }

    private TemplateInstant getTemplate(String templateId) {
        var spec = templateSpecContainer.getTemplateById(templateId);
        var templateContent = loadTemplateContent(spec);
        var instant = new TemplateInstant();
        instant.setContent(templateContent);
        instant.setTemplateSpec(spec);
        return instant;
    }

    @Override
    public View render(final Model model) {
        processModelBeforeRender(model);
        var content = doRender(model);
        StaticLog.info("渲染内容 --> {}" + content);
        return createView(content, model);
    }

    private static String loadTemplateContent(TemplateSpec spec) {
        return NioTextFileAccessor.loadText(spec.getPath());
    }

    protected void processModelBeforeRender(Model model) {
        MODEL_ATTR_PROCESSOR.apply(model);
    }

    protected abstract String doRender(Model model);

    protected abstract View createView(String content, Model model);

}
