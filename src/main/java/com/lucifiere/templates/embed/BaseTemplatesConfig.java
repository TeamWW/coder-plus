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

    private static final String SERVICE_TPL_PATH = "/ftl/service.ftl";

    private static final String SERVICE_IMPL_TPL_PATH = "/ftl/service-impl.ftl";

    private static final String SERVICE_POJO_TPL_PATH = "/ftl/pojo.ftl";

    private static final String MYBATIS_MAPPER_TPL_PATH = "/ftl/mapper.ftl";

    private static final String SERVICE_EXAMPLE_TPL_PATH = "/ftl/example.ftl";

    public static final String POJO = "pojo";

    @Template(POJO)
    public TemplateSpec pojoTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("POJO");
        spec.setPath(SERVICE_POJO_TPL_PATH);
        spec.addAttr("modelType", "");
        spec.setFileSetting(FileSetting.ofJavaFile("/model/", "", ""));
        return spec;
    }

    public static final String PO_POJO = "po-pojo";

    @Template(PO_POJO)
    public TemplateSpec modelTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("PO-POJO");
        spec.setPath(SERVICE_POJO_TPL_PATH);
        spec.addAttr("modelType", "PO");
        spec.setFileSetting(FileSetting.ofJavaFile("/model/", "", ""));
        return spec;
    }

    public static final String DOMAIN_POJO = "domain-pojo";

    @Template(DOMAIN_POJO)
    public TemplateSpec domainTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("DOMAIN_POJO");
        spec.setPath(SERVICE_POJO_TPL_PATH);
        spec.addAttr("modelType", "DO");
        spec.setFileSetting(FileSetting.ofJavaFile("/model/", "", ""));
        return spec;
    }

    public static final String PARAM_POJO = "param-pojo";

    @Template(PARAM_POJO)
    public TemplateSpec paramTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("PARAM_POJO");
        spec.setPath(SERVICE_POJO_TPL_PATH);
        spec.addAttr("modelType", "Param");
        spec.setFileSetting(FileSetting.ofJavaFile("/model/", "", ""));
        return spec;
    }

    public static final String VALUE_POJO = "vo-pojo";

    @Template(VALUE_POJO)
    public TemplateSpec voTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("VALUE_POJO");
        spec.setPath(SERVICE_POJO_TPL_PATH);
        spec.addAttr("modelType", "VO");
        spec.setFileSetting(FileSetting.ofJavaFile("/model/", "", ""));
        return spec;
    }

    public static final String SERVICE = "service";

    @Template(SERVICE)
    public TemplateSpec serviceTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("SERVICE");
        spec.setPath(SERVICE_TPL_PATH);
        spec.addAttr("serviceType", "Service");
        spec.addAttr("serviceOutSuf", "DO");
        spec.addAttr("serviceInSuf", "Param");
        spec.setFileSetting(FileSetting.ofJavaFile("/service/", "", ""));
        return spec;
    }

    public static final String SER_REPOSITORY = "ser_repository";

    @Template(SER_REPOSITORY)
    public TemplateSpec repositoryTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("SER_REPOSITORY");
        spec.setPath(SERVICE_TPL_PATH);
        spec.addAttr("serviceType", "Repository");
        spec.addAttr("serviceOutSuf", "PO");
        spec.addAttr("serviceInSuf", "Param");
        spec.setFileSetting(FileSetting.ofJavaFile("/repository/", "", ""));
        return spec;
    }

    public static final String SER_MANAGER = "ser_manager";

    @Template(SER_MANAGER)
    public TemplateSpec managerTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("SER_MANAGER");
        spec.setPath(SERVICE_TPL_PATH);
        spec.addAttr("serviceType", "Manager");
        spec.addAttr("serviceOutSuf", "");
        spec.addAttr("serviceInSuf", "Param");
        spec.setFileSetting(FileSetting.ofJavaFile("/manager/", "", ""));
        return spec;
    }

    public static final String SER_THRIFT = "ser_thrift";

    @Template(SER_THRIFT)
    public TemplateSpec thriftTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("SER_THRIFT");
        spec.setPath(SERVICE_TPL_PATH);
        spec.addAttr("serviceType", "ThriftApi");
        spec.addAttr("serviceOutSuf", "");
        spec.addAttr("serviceInSuf", "");
        spec.setFileSetting(FileSetting.ofJavaFile("/api/", "", ""));
        return spec;
    }

    public static final String SERVICE_IMPL = "service_impl";

    @Template(SERVICE_IMPL)
    public TemplateSpec serviceImplTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("SERVICE_IMPL");
        spec.setPath(SERVICE_IMPL_TPL_PATH);
        spec.addAttr("subServiceType", "Repository");
        spec.addAttr("serviceType", "Service");
        spec.addAttr("serviceOutSuf", "DO");
        spec.addAttr("serviceInSuf", "Param");
        spec.setFileSetting(FileSetting.ofJavaFile("/service/impl/", "", ""));
        return spec;
    }

    public static final String SER_IMPL_REPOSITORY = "ser_impl_repository";

    @Template(SER_IMPL_REPOSITORY)
    public TemplateSpec repositoryImplTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("SER_IMPL_REPOSITORY");
        spec.setPath(SERVICE_IMPL_TPL_PATH);
        spec.addAttr("subServiceType", "Mapper");
        spec.addAttr("serviceType", "Repository");
        spec.addAttr("serviceOutSuf", "PO");
        spec.addAttr("serviceInSuf", "Param");
        spec.setFileSetting(FileSetting.ofJavaFile("/repository/impl/", "", ""));
        return spec;
    }

    public static final String SER_IMPL_MANAGER = "ser_impl_manager";

    @Template(SER_IMPL_MANAGER)
    public TemplateSpec managerImplTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("SER_IMPL_MANAGER");
        spec.setPath(SERVICE_IMPL_TPL_PATH);
        spec.addAttr("serviceType", "Manager");
        spec.addAttr("subServiceType", "Service");
        spec.addAttr("serviceOutSuf", "");
        spec.addAttr("serviceInSuf", "");
        spec.setFileSetting(FileSetting.ofJavaFile("/manager/impl/", "", ""));
        return spec;
    }

    public static final String SER_IMPL_THRIFT = "ser_impl_thrift";

    @Template(SER_IMPL_THRIFT)
    public TemplateSpec apiImplTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("SER_IMPL_THRIFT");
        spec.setPath(SERVICE_IMPL_TPL_PATH);
        spec.addAttr("serviceType", "ThriftApi");
        spec.addAttr("subServiceType", "Manager");
        spec.addAttr("serviceOutSuf", "");
        spec.addAttr("serviceInSuf", "");
        spec.setFileSetting(FileSetting.ofJavaFile("/api/impl/", "", ""));
        return spec;
    }

    public static final String MYBATIS_MAPPER = "ser_impl_thrift";

    @Template(MYBATIS_MAPPER)
    public TemplateSpec mapperImplTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("MYBATIS_MAPPER");
        spec.setPath(MYBATIS_MAPPER_TPL_PATH);
        spec.addAttr("serviceOutSuf", "PO");
        spec.addAttr("serviceInSuf", "Param");
        spec.setFileSetting(FileSetting.ofJavaFile("/mapper/", "", ""));
        return spec;
    }

    public static final String EXAMPLE = "example";

    @Template(EXAMPLE)
    public TemplateSpec exampleTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("EXAMPLE");
        spec.setPath(SERVICE_EXAMPLE_TPL_PATH);
        spec.setFileSetting(FileSetting.JAVA_FILE);
        return spec;
    }

}
