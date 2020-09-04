package com.lucifiere.extract.table;

import com.google.common.base.Joiner;
import com.lucifiere.extract.AbstractExtractor;
import com.lucifiere.io.NioTextFileAccessor;
import com.lucifiere.model.Model;
import com.lucifiere.resovler.antlr.AntlrResolverReq;

/**
 * 表数据提取器
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public class TableExtractor extends AbstractExtractor {

    @Override
    public Model extract() {
        var ddlPath = Joiner.on("/").join(globalContext.workspacePath(), globalContext.inputPath(), globalContext.ddlName());
        var ddlStr = NioTextFileAccessor.loadText(ddlPath);
        var model = globalContext.resolver().resolve(new AntlrResolverReq(ddlStr));
        loadCustomizedAttrs(model);
        return model;
    }

}
