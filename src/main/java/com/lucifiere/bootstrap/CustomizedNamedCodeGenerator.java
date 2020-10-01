package com.lucifiere.bootstrap;

import com.lucifiere.common.GlobalConfig;
import com.lucifiere.exporter.CodeExporter;
import com.lucifiere.extract.table.CustomizedNamedExtractor;
import com.lucifiere.extract.table.TableExtractor;
import com.lucifiere.resovler.antlr.AntlrResolver;

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
