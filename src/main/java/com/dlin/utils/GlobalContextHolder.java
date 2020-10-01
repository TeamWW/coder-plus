package com.dlin.utils;

import com.dlin.container.GlobalContext;
import com.dlin.container.GlobalContextAware;
import com.dlin.container.ManagedBean;

/**
 * @author created by XD.Wang
 * Date 2020/9/7.
 */
@ManagedBean
final public class GlobalContextHolder implements GlobalContextAware {

    public static GlobalContext globalContext;

    @Override
    public void setGlobalContext(GlobalContext c) {
        globalContext = c;
    }

}
