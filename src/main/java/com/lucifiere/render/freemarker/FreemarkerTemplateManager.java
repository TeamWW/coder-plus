package com.lucifiere.render.freemarker;

import com.lucifiere.common.TemplateContainerAware;
import com.lucifiere.io.NioTextFileAccessor;
import com.lucifiere.templates.TemplateContainer;
import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;

/**
 * 基于TEMPLATE-SPEC去加载模板
 *
 * @author created by XD.Wang
 * Date 2020/9/4.
 */
public class FreemarkerTemplateManager extends StringTemplateLoader implements TemplateContainerAware {

    private Configuration configuration;

    private TemplateContainer templateContainer;

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
        init();
        configuration.setTemplateLoader(this);
    }

    public void init() {
        var allSpec = templateContainer.getAllTemplates();
        allSpec.forEach(spec -> {
            var content = NioTextFileAccessor.loadText(spec.getPath());
            super.putTemplate(spec.getId(), content);
        });
    }

    @Override
    public void setTemplateContainer(TemplateContainer templateContainer) {
        this.templateContainer = templateContainer;
    }

}
