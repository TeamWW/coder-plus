package com.lucifiere.templates.embed;

import com.lucifiere.common.FileSetting;
import com.lucifiere.templates.spec.Template;
import com.lucifiere.templates.spec.TemplateSpec;
import com.lucifiere.templates.spec.Templates;

/**
 * @author created by XD.Wang
 * Date 2020/9/4.
 */
@Templates
public class BaseTemplatesConfig {

    public static final String BASE_POJO = "base-pojo";

    @Template(BASE_POJO)
    public TemplateSpec pojoTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("最基本的POJO");
        spec.setPath("/ftl/pojo.ftl");
        spec.setFileSetting(FileSetting.JAVA_FILE);
        return spec;
    }

}
