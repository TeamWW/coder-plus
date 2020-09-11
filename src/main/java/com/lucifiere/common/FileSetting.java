package com.lucifiere.common;

import cn.hutool.core.util.StrUtil;

/**
 * @author created by XD.Wang
 * Date 2020/8/18.
 */
public class FileSetting {

    private String prefix;

    private String suffix;

    private String customizedFileName;

    private FileType fileType;

    public static final FileSetting JAVA_FILE = of(StrUtil.EMPTY, StrUtil.EMPTY, StrUtil.EMPTY, FileType.JAVA);

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

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public String getCustomizedFileName() {
        return customizedFileName;
    }

    public void setCustomizedFileName(String customizedFileName) {
        this.customizedFileName = customizedFileName;
    }

    public static FileSetting of(String prefix, String suffix, String customizedFileName, FileType ext) {
        FileSetting setting = new FileSetting();
        setting.setFileType(ext);
        setting.setPrefix(prefix);
        setting.setSuffix(suffix);
        setting.setCustomizedFileName(customizedFileName);
        return setting;
    }

}
