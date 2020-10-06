package com.dlin.demo;

import com.dlin.bootstrap.CustomizedNamedCodeGenerator;
import com.dlin.bootstrap.DdlCodeGenerator;
import com.dlin.templates.embed.EmbedTemplates;

@SuppressWarnings("Duplicates")
public class Main {

    /**
     * 使用代码生成器来生成内容时，至少要配置工作目录在哪里，以及sql文件叫什么，sql文件需要放在工作目录文件夹里
     * 如果要使用你自己定义的模板，需要制定模板位置templatesPath
     *
     * @param args args
     */
    public static void main(String[] args) {
        CustomizedNamedCodeGenerator ddlCodeGenerator = new CustomizedNamedCodeGenerator();
        ddlCodeGenerator.setDdlName("ddl.sql").setWorkspacePath("/Users/wangxiandui/Documents/gen-codes");
        ddlCodeGenerator.execute(
                EmbedTemplates.DTO_POJO,
                EmbedTemplates.QUERY_POJO,
                EmbedTemplates.BIZ_POJO,
                EmbedTemplates.DO_POJO,
                EmbedTemplates.SERVICE,
                EmbedTemplates.SER_REPOSITORY,
                EmbedTemplates.SER_MANAGER,
                EmbedTemplates.SERVICE_IMPL,
                EmbedTemplates.SER_IMPL_REPOSITORY,
                EmbedTemplates.SER_IMPL_MANAGER
        );
        DdlCodeGenerator ddlCodeGenerator1 = new DdlCodeGenerator();
        ddlCodeGenerator1.setDdlName("ddl.sql").setWorkspacePath("/Users/wangxiandui/Documents/gen-codes");
        ddlCodeGenerator1.execute(
                EmbedTemplates.MYBATIS_XML_MAPPER,
                EmbedTemplates.MYBATIS_MAPPER
        );
    }

}
