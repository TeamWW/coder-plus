package com.lucifiere.model.enums;

import java.util.Arrays;
import java.util.Objects;

/**
 * 内建属性
 *
 * @author created by XD.Wang
 * Date 2020/9/4.
 */
public enum TableModelBuiltInAttr {

    /**
     * 业务模型名
     */
    MODEL("_m"),
    /**
     * 业务模型前缀
     */
    MODEL_PREFIX("_m_pref"),
    /**
     * 业务模型解释
     */
    MODEL_DESC("_m_comment"),
    /**
     * 业务实体名-驼峰
     */
    MODEL_CAMEL_NAME("_m_c"),
    /**
     * 业务实体名-首字母大写
     */
    MODEL_CAPTAl_FIRST_NAME("_m_cf"),
    /**
     * 业务实体名-下划线
     */
    MODEL_UNDERLINE_NAME("_m_u"),
    /**
     * 业务实体域
     */
    FIELD("_f"),
    /**
     * 业务实体域-驼峰
     */
    FIELD_CAMEL_NAME("_f_c"),
    /**
     * 业务实体域-首字母大写
     */
    FIELD_CAPTAl_FIRST_NAME("_f_cf"),
    /**
     * 业务实体域-字段说明
     */
    FIELD_DESC("_f_comment"),
    /**
     * 业务实体域的java类型
     */
    FIELD_J_TYPE("_f_jt"),
    ;

    private final String key;

    TableModelBuiltInAttr(String key) {
        this.key = key;
    }

    public String key() {
        return key;
    }

    public static boolean contain(String l) {
        return Arrays.stream(TableModelBuiltInAttr.values()).map(TableModelBuiltInAttr::key).allMatch(it -> Objects.equals(l, it));
    }

}
