package com.lucifiere.render.executor;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 责任链管理
 *
 * @author XD.Wang
 * Date 2020/7/25.
 */
public class HandlerChainFactory {

    private static final List<RenderWrapper> DEFAULT_RENDER_CHAIN = Lists.newArrayList();

    private static RenderWrapper chaining(List<RenderWrapper> handlers) {
        for (int i = 0; i < handlers.size() - 1; i++) {
            handlers.get(i).nextIs(handlers.get(i + 1));
        }
        return handlers.get(0);
    }

    public static RenderWrapper defaultRenderChain() {
        return chaining(DEFAULT_RENDER_CHAIN);
    }

}
