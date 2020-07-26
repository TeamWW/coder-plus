package com.lucifiere.extract.table;

import com.google.common.base.Joiner;
import com.lucifiere.extract.AbstractExtractor;
import com.lucifiere.extract.Model;
import com.lucifiere.io.TextFileAccessor;
import com.lucifiere.resovler.Resolver;
import com.lucifiere.resovler.antlr.AntlrResolverReq;

/**
 * 表数据提取器
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public class TableExtractor extends AbstractExtractor {

    private final TextFileAccessor textFileAccessor;

    private final Resolver resolver;

    public TableExtractor() {
        this.textFileAccessor = globalContext.textFileAccessor();
        this.resolver = globalContext.resolver();
    }

    public Model extract() {
        var ddlPath = Joiner.on("/").join(globalContext.workspacePath(), globalContext.inputPath(), globalContext.ddlName());
        var ddlStr = textFileAccessor.loadText(ddlPath);
        return resolver.resolve(new AntlrResolverReq(ddlStr));
    }

}
