package com.lucifiere.common;

import cn.hutool.core.date.DateUtil;

import java.util.Date;
import java.util.Optional;

/**
 * 全局配置
 *
 * @author created by XD.Wang
 * Date 2020/7/12.
 */
public record GlobalContext(String workspacePath, String inputPath, String outputPath, String ddlName) {

    public GlobalContext {
        this.workspacePath = workspacePath;
        this.inputPath = Optional.ofNullable(inputPath).orElse("input");
        this.outputPath = Optional.ofNullable(outputPath).orElse("output");
        this.ddlName = Optional.ofNullable(outputPath).orElse("ddl.sql");
    }

    public static void main(String[] args) {
        DateUtil.beginOfDay(new Date()).toJdkDate();
    }

}
