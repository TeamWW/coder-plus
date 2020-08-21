package com.lucifiere.render.executor;

import com.lucifiere.render.Render;
import com.lucifiere.render.View;

/**
 * 渲染节点基类
 *
 * @author XD.Wang
 * Date 2020/7/25.
 */
public class DefaultRenderWrapper extends RenderWrapper {

    public DefaultRenderWrapper(Render render) {
        super(render);
    }

    /**
     * 调用渲染器的渲染逻辑
     *
     * @param req  渲染逻辑必要上下文
     * @param resp 执行结果
     * @return 是否执行成功
     */
    @Override
    protected boolean rend(HandlerRequest req, HandlerResponse resp) {
        View view = render.rend(req.getModel());
        resp.addView(view);
        return true;
    }

    /**
     * 渲染前触发
     *
     * @param req 业务逻辑入参
     */
    @Override
    protected void actionBeforeRend(HandlerRequest req) {
        // todo 能做啥
    }

    /**
     * 渲染后触发
     *
     * @param req 业务逻辑入参
     */
    @Override
    protected void actionAfterRend(HandlerRequest req) {
        // todo 能做啥
    }

}
