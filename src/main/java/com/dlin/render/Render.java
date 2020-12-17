package com.dlin.render;

import com.dlin.model.Model;

/**
 * 渲染器
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public interface Render {

    /**
     * 渲染
     *
     * @param model 要渲染的mode
     * @return 渲染后的视图
     */
    View render(Model model);

}
