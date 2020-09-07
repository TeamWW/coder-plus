package com.lucifiere.extract;

import com.google.common.collect.Lists;
import com.lucifiere.common.GlobalConfig;
import com.lucifiere.container.GlobalContext;
import com.lucifiere.container.GlobalContextAware;
import com.lucifiere.model.Model;
import com.lucifiere.model.loader.ModelAttrLoader;
import com.lucifiere.model.loader.UserAttrLoader;

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
            new UserAttrLoader()
    );

    protected void loadCustomizedAttrs(Model model) {
        modelAttrLoaderList.forEach(loader -> {
            loader.loadTo(model);
        });
    }

}
