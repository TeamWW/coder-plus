package com.lucifiere.render;

import cn.hutool.log.StaticLog;
import com.lucifiere.common.TemplateContainerAware;
import com.lucifiere.extract.Model;
import com.lucifiere.io.NioTextFileAccessor;
import com.lucifiere.templates.TemplateContainer;
import com.lucifiere.templates.TemplateInstant;
import com.lucifiere.templates.spec.TemplateSpec;

import java.util.function.Function;

public abstract class AbstractRender implements Render, TemplateContainerAware {

    private TemplateContainer templateContainer;

    private final String templateId;

    protected static Function<Model, Model> MODEL_ATTR_PROCESSOR = (m) -> m;

    public static void setModelAttrProcessor(Function<Model, Model> modelAttrProcessor) {
        MODEL_ATTR_PROCESSOR = modelAttrProcessor;
    }

    public AbstractRender(String templateId) {
        this.templateId = templateId;
    }

    @Override
    public void setTemplateContainer(TemplateContainer templateContainer) {
        this.templateContainer = templateContainer;
    }

    private TemplateInstant getTemplate() {
        var spec = templateContainer.getTemplateById(templateId);
        var templateContent = loadTemplateContent(spec);
        var instant = new TemplateInstant();
        instant.setContent(templateContent);
        instant.setTemplateSpec(spec);
        return instant;
    }

    @Override
    public View render(final Model model) {
        var template = getTemplate();
        processModelBeforeRender(model);
        var content = doRender(model, template);
        StaticLog.info("渲染内容 --> {}" + content);
        return createView(content, model, template);
    }

    private static String loadTemplateContent(TemplateSpec spec) {
        var accessor = new NioTextFileAccessor();
        return accessor.loadText(spec.getPath());
    }

    protected void processModelBeforeRender(Model model) {
        MODEL_ATTR_PROCESSOR.apply(model);
    }

    protected abstract String doRender(Model model, TemplateInstant template);

    protected abstract View createView(String content, Model model, TemplateInstant template);

}
