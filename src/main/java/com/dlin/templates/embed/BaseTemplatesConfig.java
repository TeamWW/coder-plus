package com.dlin.templates.embed;

import com.dlin.common.FileSetting;
import com.dlin.templates.spec.Template;
import com.dlin.templates.spec.TemplateSpec;
import com.dlin.templates.spec.Templates;

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

    private static final String MYBATIS_MAPPER_XML_TPL_PATH = "/ftl/mapper-xml.ftl";

    private static final String SERVICE_EXAMPLE_TPL_PATH = "/ftl/example.ftl";

    public static final String POJO = "pojo";

    @Template(POJO)
    public TemplateSpec pojoTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("POJO");
        spec.setPath(SERVICE_POJO_TPL_PATH);
        spec.addAttr("modelType", "");
        spec.setFileSetting(FileSetting.ofJavaFile("/model/"));
        return spec;
    }

    public static final String DO_POJO = "do_pojo";

    @Template(DO_POJO)
    public TemplateSpec modelTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("DO-POJO");
        spec.setPath(SERVICE_POJO_TPL_PATH);
        spec.addAttr("modelType", "DO");
        spec.setFileSetting(FileSetting.ofJavaFile("/model/"));
        return spec;
    }

    public static final String BIZ_POJO = "biz-pojo";

    @Template(BIZ_POJO)
    public TemplateSpec bizTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("BIZ_POJO");
        spec.setPath(SERVICE_POJO_TPL_PATH);
        spec.addAttr("modelType", "BO");
        spec.setFileSetting(FileSetting.ofJavaFile("/model/"));
        return spec;
    }

    public static final String QUERY_POJO = "query_pojo";

    @Template(QUERY_POJO)
    public TemplateSpec queryTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("QUERY_POJO");
        spec.setPath(SERVICE_POJO_TPL_PATH);
        spec.addAttr("modelType", "Query");
        spec.setFileSetting(FileSetting.ofJavaFile("/model/"));
        return spec;
    }

    public static final String DTO_POJO = "dto-pojo";

    @Template(DTO_POJO)
    public TemplateSpec dtoTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("DTO_POJO");
        spec.setPath(SERVICE_POJO_TPL_PATH);
        spec.addAttr("modelType", "DTO");
        spec.setFileSetting(FileSetting.ofJavaFile("/model/"));
        return spec;
    }

    public static final String SERVICE = "service";

    @Template(SERVICE)
    public TemplateSpec serviceTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("SERVICE");
        spec.setPath(SERVICE_TPL_PATH);
        spec.addAttr("serviceType", "Service");
        spec.addAttr("serviceOutSuf", "BO");
        spec.addAttr("serviceInSuf", "Query");
        spec.setFileSetting(FileSetting.ofJavaFile("/service/"));
        return spec;
    }

    public static final String SER_REPOSITORY = "ser_repository";

    @Template(SER_REPOSITORY)
    public TemplateSpec repositoryTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("SER_REPOSITORY");
        spec.setPath(SERVICE_TPL_PATH);
        spec.addAttr("serviceType", "Repository");
        spec.addAttr("serviceOutSuf", "DO");
        spec.addAttr("serviceInSuf", "Query");
        spec.setFileSetting(FileSetting.ofJavaFile("/repository/"));
        return spec;
    }

    public static final String SER_MANAGER = "ser_manager";

    @Template(SER_MANAGER)
    public TemplateSpec managerTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("SER_MANAGER");
        spec.setPath(SERVICE_TPL_PATH);
        spec.addAttr("serviceType", "Manager");
        spec.addAttr("serviceOutSuf", "DTO");
        spec.addAttr("serviceInSuf", "Query");
        spec.setFileSetting(FileSetting.ofJavaFile("/manager/"));
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
        spec.addAttr("serviceOutSuf", "BO");
        spec.addAttr("serviceInSuf", "Query");
        spec.setFileSetting(FileSetting.ofJavaFile("/service/impl/"));
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
        spec.addAttr("serviceOutSuf", "DO");
        spec.addAttr("serviceInSuf", "Query");
        spec.setFileSetting(FileSetting.ofJavaFile("/repository/impl/"));
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
        spec.addAttr("serviceOutSuf", "DTO");
        spec.addAttr("serviceInSuf", "Req");
        spec.setFileSetting(FileSetting.ofJavaFile("/manager/impl/"));
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
        spec.setFileSetting(FileSetting.ofJavaFile("/api/impl/"));
        return spec;
    }

    public static final String MYBATIS_MAPPER = "mybatis_mapper_thrift";

    @Template(MYBATIS_MAPPER)
    public TemplateSpec mapperTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("MYBATIS_MAPPER");
        spec.setPath(MYBATIS_MAPPER_TPL_PATH);
        spec.addAttr("serviceOutSuf", "DO");
        spec.addAttr("serviceInSuf", "Query");
        spec.setFileSetting(FileSetting.ofJavaFile("/mapper/"));
        return spec;
    }

    public static final String MYBATIS_XML_MAPPER = "mybatis_mapper_xml_thrift";

    @Template(MYBATIS_XML_MAPPER)
    public TemplateSpec mapperXmlTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("MYBATIS_XML_MAPPER");
        spec.setPath(MYBATIS_MAPPER_XML_TPL_PATH);
        spec.setFileSetting(FileSetting.ofMyBatisXmlFile("/mapper/gen/", "", "Mapper.xml"));
        return spec;
    }

    public static final String EXAMPLE = "example";

    @Template(EXAMPLE)
    public TemplateSpec exampleTemplate() {
        TemplateSpec spec = new TemplateSpec();
        spec.setDescription("EXAMPLE");
        spec.setPath(SERVICE_EXAMPLE_TPL_PATH);
        spec.setFileSetting(FileSetting.ofJavaFile("/example/"));
        return spec;
    }

}
