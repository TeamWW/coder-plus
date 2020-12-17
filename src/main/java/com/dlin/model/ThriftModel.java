package com.dlin.model;

import com.dlin.model.meta.CompoundModel;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * 存放ThriftDto模型数据
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public class ThriftModel extends Model implements CompoundModel {

    protected String nameSpace;

    private final List<ThriftStructModel> structModels = Lists.newArrayList();

    public void addThriftStructModel(ThriftStructModel model) {
        structModels.add(model);
    }

    @Override
    public List<? extends Model> getMemberModels() {
        return structModels;
    }

    public String getNameSpace() {
        return nameSpace;
    }

    public ThriftModel setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }

    @Override
    public String toString() {
        return "namespace -> " + nameSpace;
    }

}
