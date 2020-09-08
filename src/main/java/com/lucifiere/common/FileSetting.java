package com.lucifiere.common;

import cn.hutool.core.util.StrUtil;

/**
 * @author created by XD.Wang
 * Date 2020/8/18.
 */
public class FileSetting {

    private String prefix;

    private String suffix;

    private String ext;

    public static final FileSetting EMPTY = of(StrUtil.EMPTY, StrUtil.EMPTY, StrUtil.EMPTY);

    public static final FileSetting JAVA_FILE = of(StrUtil.EMPTY, StrUtil.EMPTY, ".java");

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public static FileSetting of(String prefix, String suffix, String ext) {
        FileSetting setting = new FileSetting();
        setting.setExt(ext);
        setting.setPrefix(prefix);
        setting.setSuffix(suffix);
        return setting;
    }

}
