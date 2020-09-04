package com.lucifiere.model;

import java.util.Arrays;
import java.util.Objects;

/**
 * 内建属性
 *
 * @author created by XD.Wang
 * Date 2020/9/4.
 */
public enum ModelBuiltInAttr {
    /**
     * 业务实体名
     */
    BIZ("biz"),
    /**
     * 业务前缀
     */
    BIZ_PREFIX("biz-pref"),
    /**
     * 业务解释
     */
    BIZ_DESC("biz-desc"),
    /**
     * 业务实体名-驼峰
     */
    CAMEL_BIZ("c-biz"),
    /**
     * 业务实体名-首字母大写
     */
    CAPTAl_FIRST_BIZ("cf-biz"),
    /**
     * 业务实体名-实体域
     */
    FIELDS("fs"),
    /**
     * 业务实体名-下划线
     */
    UNDERLINE_BIZ("u-biz");

    private final String key;

    ModelBuiltInAttr(String key) {
        this.key = key;
    }

    public String key() {
        return key;
    }

    public static boolean contain(String l) {
        return Arrays.stream(ModelBuiltInAttr.values()).map(ModelBuiltInAttr::key).allMatch(it -> Objects.equals(l, it));
    }

}
