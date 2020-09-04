package com.lucifiere.model;

import cn.hutool.core.convert.Convert;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 存放自定义属性值
 * <p>
 * Created By XD.Wang
 * Date：2020-24
 */
public abstract class Model {

    protected LinkedHashMap<String, Object> attrs = Maps.newLinkedHashMap();

    public Model addAttr(String attrName, Object attrVal) {
        Preconditions.checkNotNull(attrName, "自定义属性的键不能为空！");
        Preconditions.checkNotNull(attrVal, "自定义属性的值不能为空！");
        Preconditions.checkArgument(!ModelBuiltInAttr.contain(attrName), "不能使用内建属性名称！");
        attrs.put(attrName, attrVal);
        return this;
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

}
