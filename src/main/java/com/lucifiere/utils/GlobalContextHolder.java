package com.lucifiere.utils;

import com.lucifiere.container.GlobalContext;
import com.lucifiere.container.GlobalContextAware;
import com.lucifiere.container.ManagedBean;

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
