package com.dlin.templates.embed;

import com.dlin.common.FileSetting;
import com.dlin.templates.spec.Template;
import com.dlin.templates.spec.TemplateSpec;
import com.dlin.templates.spec.Templates;

import static com.dlin.templates.embed.EmbedTemplates.*;

/**
 * @author created by XD.Wang
 * Date 2020/9/4.
 */
@Templates
public class BaseModelTemplatesConfig {

    private static final String SERVICE_POJO_TPL_PATH = "/ftl/pojo.ftl";

    private static final String SERVICE_EXAMPLE_TPL_PATH = "/ftl/example.ftl";

    @Template(MODEL)
    public TemplateSpec pojoTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("MODEL");
        spec.setPath(SERVICE_POJO_TPL_PATH);
        spec.addAttr("modelType", "");
        spec.setFileSetting(FileSetting.ofJavaFile());
        return spec;
    }

    @Template(DO_POJO)
    public TemplateSpec modelTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("DO-POJO");
        spec.setPath(SERVICE_POJO_TPL_PATH);
        spec.addAttr("modelType", "DO");
        spec.setFileSetting(FileSetting.ofJavaFile());
        return spec;
    }

    @Template(BIZ_POJO)
    public TemplateSpec bizTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("BIZ_POJO");
        spec.setPath(SERVICE_POJO_TPL_PATH);
        spec.addAttr("modelType", "VO");
        spec.setFileSetting(FileSetting.ofJavaFile());
        return spec;
    }

    @Template(QUERY_POJO)
    public TemplateSpec queryTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("QUERY_POJO");
        spec.setPath(SERVICE_POJO_TPL_PATH);
        spec.addAttr("modelType", "Query");
        spec.setFileSetting(FileSetting.ofJavaFile());
        return spec;
    }

    @Template(DTO_POJO)
    public TemplateSpec dtoTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("DTO_POJO");
        spec.setPath(SERVICE_POJO_TPL_PATH);
        spec.addAttr("modelType", "DTO");
        spec.setFileSetting(FileSetting.ofJavaFile());
        return spec;
    }

    @Template(EXAMPLE)
    public TemplateSpec exampleTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("EXAMPLE");
        spec.setPath(SERVICE_EXAMPLE_TPL_PATH);
        spec.setFileSetting(FileSetting.ofJavaFile());
        return spec;
    }

}
