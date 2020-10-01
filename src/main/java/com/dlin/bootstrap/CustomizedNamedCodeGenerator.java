package com.dlin.bootstrap;

import com.dlin.common.GlobalConfig;
import com.dlin.exporter.CodeExporter;
import com.dlin.extract.table.CustomizedNamedExtractor;
import com.dlin.resovler.antlr.AntlrResolver;

/**
 * 预制好组件实现类型的启动器
 *
 * @author XD.Wang
 */
public class CustomizedNamedCodeGenerator extends DdlCodeGenerator {

    @Override
    protected GlobalConfig configureContext() {
        return creator.setExporter(CodeExporter.class)
                .setExtractor(CustomizedNamedExtractor.class)
                .setResolver(AntlrResolver.class)
                .init();
    }

}
