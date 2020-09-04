package com.lucifiere.extract.table;

import com.google.common.base.Joiner;
import com.lucifiere.extract.AbstractExtractor;
import com.lucifiere.model.Model;
import com.lucifiere.io.NioTextFileAccessor;
import com.lucifiere.resovler.Resolver;
import com.lucifiere.resovler.antlr.AntlrResolverReq;

/**
 * 表数据提取器
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public class TableExtractor extends AbstractExtractor {

    private final Resolver resolver;

    public TableExtractor() {
        this.resolver = globalContext.resolver();
    }

    @Override
    public Model extract() {
        var ddlPath = Joiner.on("/").join(globalContext.workspacePath(), globalContext.inputPath(), globalContext.ddlName());
        var ddlStr = NioTextFileAccessor.loadText(ddlPath);
        var model = resolver.resolve(new AntlrResolverReq(ddlStr));
        loadCustomizedAttrs(model);
        return model;
    }

}
