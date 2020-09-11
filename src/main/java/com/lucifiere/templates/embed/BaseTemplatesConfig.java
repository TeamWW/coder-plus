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

    public static final String POJO = "pojo";

    @Template(POJO)
    public TemplateSpec pojoTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("POJO");
        spec.setPath("/ftl/pojo.ftl");
        spec.addAttr("modelType", "");
        spec.setFileSetting(FileSetting.JAVA_FILE);
        return spec;
    }

    public static final String SERVICE = "service";

    @Template(SERVICE)
    public TemplateSpec serviceTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("SERVICE");
        spec.setPath("/ftl/service.ftl");
        spec.setFileSetting(FileSetting.JAVA_FILE);
        spec.addAttr("serviceType", "");
        spec.addAttr("serviceOutSuf", "");
        spec.addAttr("serviceInSuf", "");
        return spec;
    }

    public static final String SER_REPOSITORY = "base_repository";

    @Template(SER_REPOSITORY)
    public TemplateSpec repositoryTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("SER_REPOSITORY");
        spec.setPath("/ftl/service.ftl");
        spec.setFileSetting(FileSetting.JAVA_FILE);
        spec.addAttr("serviceType", "");
        spec.addAttr("serviceOutSuf", "");
        spec.addAttr("serviceInSuf", "");
        return spec;
    }

    public static final String SER_MANAGER = "ser_manager";

    @Template(SER_MANAGER)
    public TemplateSpec managerTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("SER_MANAGER");
        spec.setPath("/ftl/service.ftl");
        spec.setFileSetting(FileSetting.JAVA_FILE);
        spec.addAttr("serviceType", "");
        spec.addAttr("serviceOutSuf", "");
        spec.addAttr("serviceInSuf", "");
        return spec;
    }

    public static final String SER_THRIFT = "ser_thrift";

    @Template(SER_THRIFT)
    public TemplateSpec managerThrift() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("SER_THRIFT");
        spec.setPath("/ftl/service.ftl");
        spec.setFileSetting(FileSetting.JAVA_FILE);
        spec.addAttr("serviceType", "");
        spec.addAttr("serviceOutSuf", "");
        spec.addAttr("serviceInSuf", "");
        return spec;
    }

    public static final String MODEL_POJO = "model-pojo";

    @Template(MODEL_POJO)
    public TemplateSpec modelTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("MODEL_POJO");
        spec.setPath("/ftl/pojo.ftl");
        spec.addAttr("modelType", "Model");
        spec.setFileSetting(FileSetting.JAVA_FILE);
        return spec;
    }

    public static final String DOMAIN_POJO = "domain-pojo";

    @Template(DOMAIN_POJO)
    public TemplateSpec domainTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("DOMAIN_POJO");
        spec.setPath("/ftl/pojo.ftl");
        spec.addAttr("modelType", "DO");
        spec.setFileSetting(FileSetting.JAVA_FILE);
        return spec;
    }

    public static final String DTO_POJO = "dto-pojo";

    @Template(DTO_POJO)
    public TemplateSpec dtoTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("DOMAIN_POJO");
        spec.setPath("/ftl/pojo.ftl");
        spec.addAttr("modelType", "DTO");
        spec.setFileSetting(FileSetting.JAVA_FILE);
        return spec;
    }

    public static final String VALUE_POJO = "vo-pojo";

    @Template(VALUE_POJO)
    public TemplateSpec voTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("VALUE_POJO");
        spec.setPath("/ftl/pojo.ftl");
        spec.addAttr("modelType", "VO");
        spec.setFileSetting(FileSetting.JAVA_FILE);
        return spec;
    }

}
