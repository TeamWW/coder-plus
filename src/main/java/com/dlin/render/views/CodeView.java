package com.dlin.render.views;

import com.dlin.common.FileSetting;
import com.dlin.render.Render;
import com.dlin.render.View;

public class CodeView implements View {

    private Class<? extends Render> render;

    private String content;

    private FileSetting fileSetting;

    private String name;

    public Class<? extends Render> getRender() {
        return render;
    }

    public void setRender(Class<? extends Render> render) {
        this.render = render;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileSetting getFileSetting() {
        return fileSetting;
    }

    public void setFileSetting(FileSetting fileSetting) {
        this.fileSetting = fileSetting;
    }
}
