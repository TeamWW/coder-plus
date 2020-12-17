package com.dlin.bootstrap;

import com.dlin.common.GlobalConfig;
import com.dlin.exporter.CodeExporter;
import com.dlin.extract.table.SourceCodeExtractor;
import com.dlin.resovler.antlr.AntlrSqlResolver;
import com.dlin.resovler.antlr.AntlrThriftResolver;

/**
 * 预制好组件实现类型的启动器
 *
 * @author XD.Wang
 */
public class IdlBasedCodeGenerator extends Bootstrap {

    protected final GlobalConfig.Creator creator = new GlobalConfig.Creator();

    public IdlBasedCodeGenerator setWorkspacePath(String workspacePath) {
        creator.setWorkspacePath(workspacePath);
        return this;
    }

    public IdlBasedCodeGenerator setOutputDir(String outputPath) {
        creator.setOutputDir(outputPath);
        return this;
    }

    public IdlBasedCodeGenerator setIdlName(String idlName) {
        creator.setInputFileName(idlName);
        return this;
    }

    public IdlBasedCodeGenerator setTemplatesPath(String templatesPath) {
        creator.setTemplatesPath(templatesPath);
        return this;
    }

    public IdlBasedCodeGenerator setRemovePrefixIfExist(String removePrefixIfExist) {
        creator.setRemovePrefixIfExist(removePrefixIfExist);
        return this;
    }

    @Override
    protected GlobalConfig configureContext() {
        return creator.setExporter(CodeExporter.class)
                .setExtractor(SourceCodeExtractor.class)
                .setResolver(AntlrThriftResolver.class)
                .init();
    }

}
