package com.lucifiere.render;

import cn.hutool.log.StaticLog;
import com.lucifiere.extract.Model;
import com.lucifiere.templates.Template;

public abstract class AbstractRender implements Render {

    protected Template template;

    public AbstractRender(Template template) {
        this.template = template;
    }

    @Override
    public View rend(final Model model) {
        String content = rendContent(model);
        StaticLog.info("渲染内容 --> {}" + content);
        return createView(content, model);
    }

    protected abstract String rendContent(Model model);

    protected abstract View createView(String content, Model model);

}
