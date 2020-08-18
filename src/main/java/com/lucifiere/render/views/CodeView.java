package com.lucifiere.render.views;

import com.lucifiere.render.Render;
import com.lucifiere.render.View;

public class CodeView implements View {

    private Class<? extends Render> render;

    private String content;

    private String fileSuffix;

    private String filePrefix;

    private String fileExt;

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

    public String getFileSuffix() {
        return fileSuffix;
    }

    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }

    public String getFilePrefix() {
        return filePrefix;
    }

    public void setFilePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }
}
