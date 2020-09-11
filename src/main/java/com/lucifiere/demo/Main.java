package com.lucifiere.demo;

import com.lucifiere.bootstrap.CodeGenerator;
import com.lucifiere.templates.embed.BaseTemplatesConfig;

import static com.lucifiere.templates.embed.BaseTemplatesConfig.EXAMPLE;

@SuppressWarnings("Duplicates")
public class Main {

    /**
     * 使用代码生成器来生成内容时，至少要配置工作目录在哪里，以及sql文件叫什么，sql文件需要放在工作目录文件夹里
     * 如果要使用你自己定义的模板，需要制定模板位置templatesPath
     *
     * @param args args
     */
    public static void main(String[] args) {
        CodeGenerator codeGenerator = new CodeGenerator();
<<<<<<< HEAD
        codeGenerator.setDdlName("ddl.sql").setWorkspacePath("/Users/wuhuilin/teamWW/coder-plus/sql");
        codeGenerator.execute(EXAMPLE);
=======
        codeGenerator.setDdlName("ddl.sql").setWorkspacePath("/Users/wangxiandui/Documents/gen-codes");
        codeGenerator.execute(
                BaseTemplatesConfig.POJO,
                BaseTemplatesConfig.VALUE_POJO,
                BaseTemplatesConfig.DTO_POJO,
                BaseTemplatesConfig.DOMAIN_POJO,
                BaseTemplatesConfig.SERVICE,
                BaseTemplatesConfig.SER_REPOSITORY,
                BaseTemplatesConfig.SER_MANAGER,
                BaseTemplatesConfig.SER_THRIFT
        );
>>>>>>> df6bb567cac5b109896810ad9b4f7d5cdb557090
    }

}
