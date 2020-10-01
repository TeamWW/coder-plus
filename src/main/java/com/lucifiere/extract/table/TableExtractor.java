package com.lucifiere.extract.table;

import com.google.common.base.Joiner;
import com.lucifiere.container.ManagedBean;
import com.lucifiere.extract.AbstractExtractor;
import com.lucifiere.io.NioTextFileAccessor;
import com.lucifiere.model.Model;

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
        loadCustomizedAttrs(model);
        return model;
    }

}
