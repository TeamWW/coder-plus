package com.dlin.extract.table;

import com.google.common.base.Joiner;
import com.dlin.container.ManagedBean;
import com.dlin.extract.AbstractExtractor;
import com.dlin.io.NioTextFileAccessor;
import com.dlin.model.Model;

import java.util.Optional;

/**
 * 表数据提取器
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
@ManagedBean
public class TableExtractor extends AbstractExtractor {

    @Override
    public Model extract() {
        String ddlPath = Joiner.on("/").join(globalContext.getConfig().getWorkspacePath(), globalContext.getConfig().getDdlName());
        String ddlStr = NioTextFileAccessor.loadFile(ddlPath);
        Model model = globalContext.calByComponent(globalContext.getConfig().getResolver(), resolver -> resolver.resolve(ddlStr));
        processModelBeforeUsed(model);
        return model;
    }

    protected void processModelBeforeUsed(Model model) {
        Optional.ofNullable(globalContext.getConfig().getRemovePrefixIfExist()).ifPresent(prefix -> model.setName(model.getName().replaceAll(prefix, "")));
        loadCustomizedAttrs(model);
    }

}
