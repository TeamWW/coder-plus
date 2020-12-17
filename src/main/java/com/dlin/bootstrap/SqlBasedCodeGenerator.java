package com.dlin.bootstrap;

import com.dlin.common.GlobalConfig;
import com.dlin.exporter.CodeExporter;
import com.dlin.extract.table.SourceCodeExtractor;
import com.dlin.resovler.antlr.AntlrSqlResolver;

/**
 * 预制好组件实现类型的启动器
 *
 * @author XD.Wang
 */
public class SqlBasedCodeGenerator extends Bootstrap {

    protected final GlobalConfig.Creator creator = new GlobalConfig.Creator();

    public SqlBasedCodeGenerator setWorkspacePath(String workspacePath) {
        creator.setWorkspacePath(workspacePath);
        return this;
    }

    public SqlBasedCodeGenerator setOutputDir(String outputPath) {
        creator.setOutputDir(outputPath);
        return this;
    }

    public SqlBasedCodeGenerator setDdlName(String ddlName) {
        creator.setInputFileName(ddlName);
        return this;
    }

    public SqlBasedCodeGenerator setTemplatesPath(String templatesPath) {
        creator.setTemplatesPath(templatesPath);
        return this;
    }

    public SqlBasedCodeGenerator setRemovePrefixIfExist(String removePrefixIfExist) {
        creator.setRemovePrefixIfExist(removePrefixIfExist);
        return this;
    }

    @Override
    protected GlobalConfig configureContext() {
        return creator.setExporter(CodeExporter.class)
                .setExtractor(SourceCodeExtractor.class)
                .setResolver(AntlrSqlResolver.class)
                .init();
    }

}
