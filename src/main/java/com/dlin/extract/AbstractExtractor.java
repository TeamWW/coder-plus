package com.dlin.extract;

import com.dlin.model.loader.PropertiesAttrLoader;
import com.google.common.collect.Lists;
import com.dlin.container.GlobalContext;
import com.dlin.container.GlobalContextAware;
import com.dlin.model.Model;
import com.dlin.model.loader.ModelAttrLoader;
import com.dlin.model.loader.DefaultGlobalAttrLoader;

import java.util.List;

/**
 * 预置数据提取器
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public abstract class AbstractExtractor implements Extractor, GlobalContextAware {

    protected GlobalContext globalContext;

    @Override
    public void setGlobalContext(GlobalContext globalContext) {
        this.globalContext = globalContext;
    }

    private final List<ModelAttrLoader> modelAttrLoaderList = Lists.newArrayList(
            PropertiesAttrLoader.getLoader()
    );

    protected void loadCustomizedAttrs(Model model) {
        modelAttrLoaderList.forEach(loader -> {
            loader.loadTo(model);
        });
    }

}
