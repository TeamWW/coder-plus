package com.lucifiere.extract;

import com.google.common.base.Preconditions;

import java.util.LinkedHashMap;

public abstract class Model extends LinkedHashMap<String, String> {

    public Model addAttr(String attrName, String attrVal) {
        Preconditions.checkNotNull(attrName, "自定义属性的键不能为空！");
        Preconditions.checkNotNull(attrVal, "自定义属性的值不能为空！");
        this.put(attrName, attrVal);
        return this;
    }

}
