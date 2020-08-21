package com.lucifiere.render;

import cn.hutool.log.StaticLog;
import com.lucifiere.common.TemplateContainerAware;
import com.lucifiere.extract.Model;
import com.lucifiere.io.NioTextFileAccessor;
import com.lucifiere.templates.TemplateContainer;
import com.lucifiere.templates.spec.TemplateSpec;

public abstract class AbstractRender implements Render, TemplateContainerAware {

    private TemplateContainer templateContainer;

    private final String templateId;

    public AbstractRender(String templateId) {
        this.templateId = templateId;
    }

    @Override
    public void setTemplateContainer(TemplateContainer templateContainer) {
        this.templateContainer = templateContainer;
    }

    @Override
    public View rend(final Model model) {
        TemplateSpec templateSpec = templateContainer.getTemplateById(templateId);
        String templateContent = loadTemplateContent(templateSpec);
        String content = rendContent(model, templateSpec, templateContent);
        StaticLog.info("渲染内容 --> {}" + content);
        return createView(content, model, templateSpec);
    }

    private static String loadTemplateContent(TemplateSpec spec) {
        NioTextFileAccessor accessor = new NioTextFileAccessor();
        return accessor.loadText(spec.getPath());
    }

    protected abstract String rendContent(Model model, TemplateSpec template, String templateContent);

    protected abstract View createView(String content, Model model, TemplateSpec template);

}
