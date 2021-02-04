package com.dlin.model;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.dlin.model.meta.Field;
import com.dlin.utils.CommonUtils;
import com.google.common.base.Joiner;
import com.google.common.collect.Sets;

import java.util.*;
import java.util.stream.Collectors;

import static com.dlin.model.enums.ModelBuiltInAttr.*;
import static com.dlin.utils.CodeStyle.NamedStyle;
import static com.dlin.utils.CodeStyle.ofUlCode;

/**
 * 存放表模型数据
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public class TableModel extends Model {

    private String comment;

    private String prefix;

    private final Map<String, Field> fields = new HashMap<>();

    private final Set<String> primaryKeys = Sets.newHashSet();

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void addTableFiled(Field field) {
        fields.put(field.getName(), field);
    }

    public Set<Field> getFields() {
        return new HashSet<>(fields.values());
    }

    public void addTablePrimaryKey(String field) {
        primaryKeys.add(field);
    }

    public Set<String> getPrimaryKey() {
        return primaryKeys;
    }

    @Override
    public String toString() {
        return Joiner.on("\n").join(fields.values().stream().map(Field::toString).collect(Collectors.toList()));
    }

    @Override
    public Map<String, Object> toAttrMap() {
        // extract table attrs
        addBuiltInAttr(MODEL.key(), ofUlCode(keyword).toStyle(NamedStyle.CAMEL).toString())
                .addBuiltInAttr(MODEL_DESC.key(), Optional.ofNullable(comment).orElse(""))
                .addBuiltInAttr(MODEL_PREFIX.key(), Optional.ofNullable(prefix).orElse(""))
                .addBuiltInAttr(MODEL_CAPTAl_FIRST_NAME.key(), ofUlCode(keyword).toStyle(NamedStyle.CAMEL).toStyle(NamedStyle.CAP_FIRST).toString())
                .addBuiltInAttr(MODEL_CAMEL_NAME.key(), ofUlCode(keyword).toStyle(NamedStyle.CAMEL).toString())
                .addBuiltInAttr(MODEL_UNDERLINE_NAME.key(), ofUlCode(keyword).toString())
                // extract table filed attrs
                .addBuiltInAttr(FIELD.key(), Objects.requireNonNull(fields.values()).stream().map(this::createFiledMap).filter(Objects::nonNull).collect(Collectors.toList()));
        // extract single primary key
        String singleKey = CommonUtils.getOne(this.primaryKeys);
        if (StrUtil.isBlank(singleKey)) {
            singleKey = "id";
        }
        addBuiltInAttr(SINGLE_PRIMARY_KEY.key(), createFiledMap(fields.get(singleKey)));
        return super.toAttrMap();
    }

    @Override
    public boolean isEmpty() {
        return StrUtil.isBlank(comment) && StrUtil.isBlank(keyword) && CollUtil.isEmpty(fields);
    }

}
