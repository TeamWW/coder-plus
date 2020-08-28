package com.lucifiere.utils;

import cn.hutool.core.util.StrUtil;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 代码格式工具
 *
 * @author created by XD.Wang
 * Date 2020/7/19.
 */
public class CodeStyle {

    private String source;

    private NamedStyle style;

    public CodeStyle(String source, NamedStyle style) {
        this.source = source;
        this.style = style;
    }

    public CodeStyle ofCamelCode(String source) {
        return new CodeStyle(source, NamedStyle.CAMEL);
    }

    public CodeStyle ofUlCode(String source) {
        return new CodeStyle(source, NamedStyle.UNDERLINE);
    }

    public CodeStyle ofCapCode(String source) {
        return new CodeStyle(source, NamedStyle.CAP_FIRST);
    }

    public enum NamedStyle {
        /**
         * 驼峰风格
         */
        CAMEL,
        /**
         * 下划线风格
         */
        UNDERLINE,
        /**
         * 首字母大写的驼峰风格
         */
        CAP_FIRST
    }
    
    public String switchNamedStyle(NamedStyle targetStyle) {
        return switch (targetStyle) {
            case CAMEL -> StrUtil.toCamelCase(source);
            case UNDERLINE -> StrUtil.toUnderlineCase(source);
            case CAP_FIRST -> StrUtil.upperFirstAndAddPre(source, "");
        };
    }

}
