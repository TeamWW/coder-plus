package com.lucifiere.render.freemarker;

import com.lucifiere.container.GlobalContextAware;
import com.lucifiere.io.NioTextFileAccessor;
import com.lucifiere.container.GlobalContext;
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
public class FreemarkerTemplateManager extends StringTemplateLoader implements GlobalContextAware {

    private final Configuration configuration;

    private GlobalContext globalContext;

    private static volatile FreemarkerTemplateManager INSTANT;

    @Override
    public void setGlobalContext(GlobalContext globalContext) {
        this.globalContext = globalContext;
    }

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
        var allSpec = globalContext.getAllTemplates();
        allSpec.forEach(spec -> {
            var content = NioTextFileAccessor.loadText(spec.getPath());
            super.putTemplate(spec.getId(), content);
        });
    }

    public Template getTemplate(String templateId) throws IOException {
        return configuration.getTemplate(templateId);
    }

}
