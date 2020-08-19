package com.lucifiere.render;

import cn.hutool.log.StaticLog;
import com.lucifiere.extract.Model;
import com.lucifiere.templates.Template;

public abstract class AbstractRender implements Render {

    @Override
    public View rend(final Model model, Template template) {
        String content = rendContent(model, template);
        StaticLog.info("渲染内容 --> {}" + content);
        return createView(content, model);
    }

    protected abstract String rendContent(Model model, Template template);

    protected abstract View createView(String content, Model model);

}
