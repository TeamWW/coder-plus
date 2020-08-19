package com.lucifiere.render;

import com.lucifiere.extract.Model;
import com.lucifiere.templates.Template;

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
     * @param model
     * @param template
     * @return
     */
    View rend(Model model, Template template);

}
