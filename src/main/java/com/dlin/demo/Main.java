package com.dlin.demo;

import com.dlin.bootstrap.CustomizedKeywordCodeGenerator;
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
        CustomizedKeywordCodeGenerator ddlCodeGenerator = new CustomizedKeywordCodeGenerator();
        ddlCodeGenerator.setDdlName("ddl.sql").setWorkspacePath("/Users/wuhuilin/Documents/gen-codes");
        ddlCodeGenerator.execute(
                EmbedTemplates.DO_POJO,
                EmbedTemplates.EXAMPLE,
                EmbedTemplates.SER_REPOSITORY,
                EmbedTemplates.SER_IMPL_REPOSITORY,
                EmbedTemplates.MYBATIS_XML_MAPPER,
                EmbedTemplates.MYBATIS_MAPPER
        );
//        DdlCodeGenerator ddlCodeGenerator1 = new DdlCodeGenerator();
//        ddlCodeGenerator1.setDdlName("ddl.sql").setWorkspacePath("/Users/wangxiandui/Documents/gen-codes");
//        ddlCodeGenerator1.execute(
//                EmbedTemplates.MYBATIS_XML_MAPPER,
//                EmbedTemplates.MYBATIS_MAPPER
//        );
    }

}
