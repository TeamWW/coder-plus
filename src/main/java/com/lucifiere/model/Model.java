package com.lucifiere.model;

import cn.hutool.core.convert.Convert;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.lucifiere.model.enums.TableModelBuiltInAttr;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 业务数据的表示模型
 *
 * Created By XD.Wang
 * Date：2020-24
 */
public abstract class Model {

    protected LinkedHashMap<String, Object> attrs = Maps.newLinkedHashMap();

    public Model addAttr(String attrName, Object attrVal) {
        Preconditions.checkNotNull(attrName, "自定义属性的键不能为空！");
        Preconditions.checkNotNull(attrVal, "自定义属性的值不能为空！");
        Preconditions.checkArgument(!TableModelBuiltInAttr.contain(attrName), "不能使用内建属性名称！");
        attrs.put(attrName, attrVal);
        return this;
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

    public Map<String, Object> extractAttrs() {
        Map<String, Object> foldAttrs = Maps.newLinkedHashMap();
        foldAttrs.putAll(attrs);
        return foldAttrs;
    }

}
