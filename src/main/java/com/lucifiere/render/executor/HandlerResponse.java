package com.lucifiere.render.executor;

import com.lucifiere.render.View;

import java.util.List;

/**
 * 节点执行结果收集
 *
 * @author XD.Wang
 * Date 2020/7/25.
 */
public class HandlerResponse {

    /**
     * 是否执行成功
     */
    private boolean success;

    /**
     * 解析出来的视图
     */
    private List<View> views;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<View> getViews() {
        return views;
    }

    public void setViews(List<View> views) {
        this.views = views;
    }
}
