package com.dlin.model;

import cn.hutool.core.convert.Convert;
import com.dlin.model.meta.Field;
import com.dlin.model.enums.ModelBuiltInAttr;
import com.dlin.utils.CodeStyle;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

import static com.dlin.model.enums.ModelBuiltInAttr.*;
import static com.dlin.utils.CodeStyle.ofUlCode;

/**
 * 业务数据的表示模型
 * <p>
 * Created By @author XD.Wang
 * Date：2020-24
 */
public class Model {

    protected String keyword;

    protected LinkedHashMap<String, Object> attrs = Maps.newLinkedHashMap();

    public Model() {
    }

    public void merge(Model model1) {
        attrs.putAll(model1.attrs);
    }

    public Model addAttr(String attrName, Object attrVal) {
        Preconditions.checkNotNull(attrName, "自定义属性的键不能为空！");
        Preconditions.checkNotNull(attrVal, "自定义属性的值不能为空！");
        Preconditions.checkArgument(!ModelBuiltInAttr.contain(attrName), "不能使用内建属性名称！");
        attrs.put(attrName, attrVal);
        return this;
    }

    protected Map<String, Object> createFiledMap(Field f) {
        Map<String, Object> fieldsAttrs = Maps.newHashMap();
        fieldsAttrs.put(FIELD_CAMEL_NAME.key(), ofUlCode(f.getName()).toStyle(CodeStyle.NamedStyle.CAMEL).toString());
        fieldsAttrs.put(FIELD_CAPTAl_FIRST_NAME.key(), f.getCfName());
        fieldsAttrs.put(FIELD_DESC.key(), Optional.ofNullable(f.getComment()).orElse(""));
        fieldsAttrs.put(FIELD_J_TYPE.key(), f.getType().getJavaType());
        fieldsAttrs.put(FIELD_J_STANDARD_TYPE.key(), f.getType().getStandardJavaType());
        fieldsAttrs.put(FIELD_JDBC_TYPE.key(), f.getType().getJdbcType());
        fieldsAttrs.put(FIELD_UNDERLINE_NAME.key(), ofUlCode(f.getName()).toString());
        return fieldsAttrs;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Map<String, Object> getAttrs() {
        return attrs;
    }

    public Model addBuiltInAttr(String attrName, Object attrVal) {
        attrs.put(attrName, attrVal);
        return this;
    }

    private static <T> T get(Map<?, ?> map, Object key, Class<T> type) {
        return null == map ? null : Convert.convert(type, map.get(key));
    }

    public String getStrAttr(String attrName) {
        return get(attrs, attrName, String.class);
    }

    public Map<String, Object> toAttrMap() {
        Map<String, Object> foldAttrs = Maps.newLinkedHashMap();
        foldAttrs.putAll(attrs);
        return foldAttrs;
    }

}
