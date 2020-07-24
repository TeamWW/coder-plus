package com.lucifiere.extract.table;

import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import com.lucifiere.extract.Model;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * 存放表模型数据
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public class TableModel extends Model {

    private String name;

    private String bizPrefix;

    private final Set<TableField> fields = Sets.newHashSet();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBizPrefix() {
        return bizPrefix;
    }

    public void setBizPrefix(String bizPrefix) {
        this.bizPrefix = bizPrefix;
    }

    public void addTableFiled(TableField field) {
        fields.add(field);
    }

    public Set<TableField> getFields() {
        return fields;
    }

    @Override
    public String toString() {
        return Joiner.on("\n").join(fields.stream().map(TableField::toString).collect(Collectors.toList()));
    }
}
