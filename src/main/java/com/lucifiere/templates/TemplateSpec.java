package com.lucifiere.templates;

import com.lucifiere.common.FileSetting;

/**
 * @author created by XD.Wang
 * Date 2020/8/7.
 */
public class TemplateSpec {

    protected String code;

    protected FileSetting fileSetting;

    protected String content;

    protected String description;

    public static TemplateSpec of(FileSetting fileSetting, String code, String content, String description) {
        TemplateSpec spec = new TemplateSpec();
        spec.setCode(code);
        spec.setContent(content);
        spec.setDescription(description);
        spec.setFileSetting(fileSetting);
        return spec;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public FileSetting getFileSetting() {
        return fileSetting;
    }

    public void setFileSetting(FileSetting fileSetting) {
        this.fileSetting = fileSetting;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
