package com.dlin.bootstrap;

import com.dlin.common.GlobalConfig;
import com.dlin.exporter.CodeExporter;
import com.dlin.extract.table.CustomizedModelNamedExtractor;
import com.dlin.resovler.antlr.AntlrSqlResolver;

/**
 * 预制好组件实现类型的启动器
 *
 * @author XD.Wang
 */
public class CustomizedKeywordCodeGenerator extends SqlBasedCodeGenerator {

    @Override
    protected GlobalConfig configureContext() {
        return creator.setExporter(CodeExporter.class)
                .setExtractor(CustomizedModelNamedExtractor.class)
                .setResolver(AntlrSqlResolver.class)
                .init();
    }

}
