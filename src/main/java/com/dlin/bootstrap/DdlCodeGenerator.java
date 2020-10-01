package com.dlin.bootstrap;

import com.dlin.common.GlobalConfig;
import com.dlin.exporter.CodeExporter;
import com.dlin.extract.table.TableExtractor;
import com.dlin.resovler.antlr.AntlrResolver;

/**
 * 预制好组件实现类型的启动器
 *
 * @author XD.Wang
 */
public class DdlCodeGenerator extends Bootstrap {

    protected final GlobalConfig.Creator creator = new GlobalConfig.Creator();

    public DdlCodeGenerator setWorkspacePath(String workspacePath) {
        creator.setWorkspacePath(workspacePath);
        return this;
    }

    public DdlCodeGenerator setOutputDir(String outputPath) {
        creator.setOutputDir(outputPath);
        return this;
    }

    public DdlCodeGenerator setDdlName(String ddlName) {
        creator.setDdlName(ddlName);
        return this;
    }

    public DdlCodeGenerator setTemplatesPath(String templatesPath) {
        creator.setTemplatesPath(templatesPath);
        return this;
    }

    @Override
    protected GlobalConfig configureContext() {
        return creator.setExporter(CodeExporter.class)
                .setExtractor(TableExtractor.class)
                .setResolver(AntlrResolver.class)
                .init();
    }

}
