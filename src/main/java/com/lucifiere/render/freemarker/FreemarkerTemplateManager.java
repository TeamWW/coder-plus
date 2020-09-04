package com.lucifiere.render.freemarker;

import com.lucifiere.common.TemplateContainerAware;
import com.lucifiere.io.NioTextFileAccessor;
import com.lucifiere.templates.TemplateSpecContainer;
import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.IOException;

/**
 * 基于TEMPLATE-SPEC去加载模板
 *
 * @author created by XD.Wang
 * Date 2020/9/4.
 */
public class FreemarkerTemplateManager extends StringTemplateLoader implements TemplateContainerAware {

    private final Configuration configuration;

    private TemplateSpecContainer templateSpecContainer;

    private static volatile FreemarkerTemplateManager INSTANT;

    public static FreemarkerTemplateManager getManager() {
        if (INSTANT == null) {
            INSTANT = new FreemarkerTemplateManager();
        }
        return INSTANT;
    }

    private FreemarkerTemplateManager() {
        this.configuration = new Configuration(Configuration.VERSION_2_3_28);
        configuration.setDefaultEncoding("UTF-8");
        initStringTemplateLoader();
        configuration.setTemplateLoader(this);
        configuration.setTemplateExceptionHandler((te, env, out) -> {

        });
    }

    public void initStringTemplateLoader() {
        var allSpec = templateSpecContainer.getAllTemplates();
        allSpec.forEach(spec -> {
            var content = NioTextFileAccessor.loadText(spec.getPath());
            super.putTemplate(spec.getId(), content);
        });
    }

    public Template getTemplate(String templateId) throws IOException {
        return configuration.getTemplate(templateId);
    }

    @Override
    public void setTemplateSpecContainer(TemplateSpecContainer templateSpecContainer) {
        this.templateSpecContainer = templateSpecContainer;
    }

}
