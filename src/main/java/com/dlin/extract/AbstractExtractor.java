package com.dlin.extract;

import com.dlin.container.GlobalContext;
import com.dlin.container.GlobalContextAware;

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

}
