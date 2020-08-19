package com.lucifiere.utils;

import cn.hutool.core.util.StrUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * 代码格式工具
 *
 * @author created by XD.Wang
 * Date 2020/7/19.
 */
public class CodeUtils {

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

    public static String switchNamedStyle(String source, NamedStyle targetStyle) {
        return switch (targetStyle) {
            case CAMEL -> StrUtil.toCamelCase(source);
            case UNDERLINE -> StrUtil.toUnderlineCase(source);
            case CAP_FIRST -> StringUtils.capitalize(source);
        };
    }

}
