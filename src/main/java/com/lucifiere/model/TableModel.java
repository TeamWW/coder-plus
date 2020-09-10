package com.lucifiere.model;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.lucifiere.extract.table.TableField;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static com.lucifiere.model.enums.TableModelBuiltInAttr.*;
import static com.lucifiere.utils.CodeStyle.*;

/**
 * 存放表模型数据
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public class TableModel extends Model {

    private String name;

    private String desc;

    private String bizPrefix;

    private final Set<TableField> fields = Sets.newHashSet();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

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

    @Override
    public Map<String, Object> extractAttrs() {
        // extract table attrs
        addBuiltInAttr(MODEL.key(), ofUlCode(name).toStyle(NamedStyle.CAMEL).toString())
                .addBuiltInAttr(MODEL_DESC.key(), Optional.ofNullable(desc).orElse(""))
                .addBuiltInAttr(MODEL_PREFIX.key(), Optional.ofNullable(bizPrefix).orElse(""))
                .addBuiltInAttr(MODEL_CAPTAl_FIRST_NAME.key(), ofUlCode(name).toStyle(NamedStyle.CAMEL).toStyle(NamedStyle.CAP_FIRST).toString())
                .addBuiltInAttr(MODEL_CAMEL_NAME.key(), ofUlCode(name).toStyle(NamedStyle.CAMEL).toString())
                .addBuiltInAttr(MODEL_UNDERLINE_NAME.key(), ofUlCode(name).toString())
                // extract table filed attrs
                .addBuiltInAttr(FIELD.key(), Objects.requireNonNull(fields).stream().map(f -> {
                    Map<String, Object> fieldsAttrs = Maps.newHashMap();
                    fieldsAttrs.put(FIELD_CAMEL_NAME.key(), ofUlCode(f.getName()).toStyle(NamedStyle.CAMEL).toString());
                    fieldsAttrs.put(FIELD_CAPTAl_FIRST_NAME.key(), f.getCfName());
                    fieldsAttrs.put(FIELD_DESC.key(), Optional.ofNullable(f.getComment()).orElse(""));
                    fieldsAttrs.put(FIELD_J_TYPE.key(), f.getType().getJavaType());
                    return fieldsAttrs;
                }).collect(Collectors.toList()));
        return super.extractAttrs();
    }
}
