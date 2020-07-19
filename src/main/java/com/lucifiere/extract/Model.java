package com.lucifiere.extract;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;

import java.util.LinkedHashMap;

public abstract class Model {

    protected LinkedHashMap<String, String> attrs = Maps.newLinkedHashMap();

    public Model addAttr(String attrName, String attrVal) {
        Preconditions.checkNotNull(attrName, "自定义属性的键不能为空！");
        Preconditions.checkNotNull(attrVal, "自定义属性的值不能为空！");
        attrs.put(attrName, attrVal);
        return this;
    }

}
