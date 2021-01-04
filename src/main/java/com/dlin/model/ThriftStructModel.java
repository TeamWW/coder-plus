package com.dlin.model;

import com.dlin.model.meta.Field;
import com.google.common.base.Joiner;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.dlin.model.enums.ModelBuiltInAttr.*;
import static com.dlin.model.enums.BaseBuiltInAttr.*;
import static com.dlin.utils.CodeStyle.NamedStyle;
import static com.dlin.utils.CodeStyle.*;

/**
 * 存放ThriftDto模型数据
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public class ThriftStructModel extends ThriftModel {

    private final Map<String, Field> fields = new HashMap<>();

    public void addTableFiled(Field field) {
        fields.put(field.getName(), field);
    }

    @Override
    public String toString() {
        return Joiner.on("\n").join(fields.values().stream().map(Field::toString).collect(Collectors.toList()));
    }

    @Override
    public Map<String, Object> toAttrMap() {
        // extract table attrs
        Map<String, Object> m = super.toAttrMap();
        addBuiltInAttr(MODEL.key(), ofUlCode(keyword).toStyle(NamedStyle.CAMEL).toString())
                .addBuiltInAttr(MODEL_CAPTAl_FIRST_NAME.key(), ofUlCode(keyword).toStyle(NamedStyle.CAMEL).toStyle(NamedStyle.CAP_FIRST).toString())
                .addBuiltInAttr(MODEL_CAMEL_NAME.key(), ofUlCode(keyword).toStyle(NamedStyle.CAMEL).toString())
                .addBuiltInAttr(MODEL_UNDERLINE_NAME.key(), ofUlCode(keyword).toString())
                .addBuiltInAttr(BASE_PACKAGE.key(), ofUlCode(nameSpace).toString())
                // extract table filed attrs
                .addBuiltInAttr(FIELD.key(), Objects.requireNonNull(fields.values()).stream().map(this::createFiledMap).collect(Collectors.toList()));
        // extract single primary key
        return m;
    }

}
