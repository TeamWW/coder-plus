package com.dlin.extract.table;

import com.dlin.container.ManagedBean;
import com.dlin.extract.CustomizedAttrExtractor;
import com.dlin.io.NioTextFileAccessor;
import com.dlin.model.Model;
import com.google.common.base.Joiner;

import java.util.Optional;

/**
 * 源文件提取器
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
@ManagedBean
public class SourceCodeExtractor extends CustomizedAttrExtractor {

    @Override
    public Model extract() {
        String ddlPath = Joiner.on("/").join(globalContext.getConfig().getWorkspacePath(), globalContext.getConfig().getInputFileName());
        String ddlStr = NioTextFileAccessor.loadFile(ddlPath);
        Model model = globalContext.calByComponent(globalContext.getConfig().getResolver(), resolver -> resolver.resolve(ddlStr));
        Optional.ofNullable(globalContext.getConfig().getRemovePrefixIfExist()).ifPresent(prefix -> model.setKeyword(model.getKeyword().replaceAll(prefix, "")));
        model.merge(super.extract());
        return model;
    }

}
