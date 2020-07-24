package com.lucifiere.extract;

import com.lucifiere.common.GlobalContext;

/**
 * 预置数据提取器
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public abstract class AbstractExtractor implements Extractor {

    protected final GlobalContext context;

    public AbstractExtractor(GlobalContext globalContext) {
        this.context = globalContext;
    }

}
