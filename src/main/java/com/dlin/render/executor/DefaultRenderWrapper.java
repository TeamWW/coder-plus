package com.dlin.render.executor;

import com.dlin.model.Model;
import com.dlin.model.meta.CompoundModel;
import com.dlin.render.Render;
import com.dlin.render.View;

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
    protected boolean render(HandlerRequest req, HandlerResponse resp) {
        Model model = req.getModel();
        // get real model for render
        if (model instanceof CompoundModel) {
            CompoundModel compoundModel = (CompoundModel) model;
            for (Model m : compoundModel.getMemberModels()) {
                resp.addView(render.render(m));
            }
            return true;
        }
        View view = render.render(model);
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
    }

    /**
     * 渲染后触发
     *
     * @param req 业务逻辑入参
     */
    @Override
    protected void actionAfterRend(HandlerRequest req) {
    }

}
