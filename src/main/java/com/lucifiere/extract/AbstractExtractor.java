package com.lucifiere.extract;

import com.lucifiere.common.GlobalContext;

/**
 * @author created by XD.Wang
 * Date 2020/7/12.
 */
public abstract class AbstractExtractor implements Extractor {

    protected final GlobalContext context;

    public AbstractExtractor(GlobalContext globalContext) {
        this.context = globalContext;
    }

}
