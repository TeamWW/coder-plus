package com.lucifiere.bootstrap;

import com.lucifiere.common.GlobalConfig;
import com.lucifiere.exporter.CodeExporter;
import com.lucifiere.extract.table.TableExtractor;
import com.lucifiere.resovler.antlr.AntlrResolver;

/**
 * 预制好组件实现类型的启动器
 *
 * @author XD.Wang
 */
public class CodeGenerator extends Bootstrap {

    private final GlobalConfig.Creator creator = new GlobalConfig.Creator();

    public CodeGenerator setWorkspacePath(String workspacePath) {
        creator.setWorkspacePath(workspacePath);
        return this;
    }

    public CodeGenerator setOutputDir(String outputPath) {
        creator.setOutputDir(outputPath);
        return this;
    }

    public CodeGenerator setDdlName(String ddlName) {
        creator.setDdlName(ddlName);
        return this;
    }

    public CodeGenerator setTemplatesPath(String templatesPath) {
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
