package com.lucifiere.demo;

import com.lucifiere.bootstrap.Bootstrap;
import com.lucifiere.common.GlobalContext;

public class DefaultBootstrap extends Bootstrap {

    @Override
    protected GlobalContext acquireContext() {
        return null;
    }

}
