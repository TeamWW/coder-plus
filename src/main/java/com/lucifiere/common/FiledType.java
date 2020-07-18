package com.lucifiere.common;

import com.google.common.base.Preconditions;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public enum FiledType {

    NUM_TINYINT(Short.class, "tinyint", "TINYINT"),
    NUM_SMALLINT(Integer.class, "smallint", "SMALLINT"),
    NUM_MEDIUMINT(Integer.class, "mediumint", "INTEGER"),
    NUM_INT(Integer.class, "int", "INTEGER"),
    NUM_BIGINT(Long.class, "bigint", "BIGINT"),
    NUM_FLOAT(Float.class, "float", "FLOAT"),
    NUM_DOUBLE(Double.class, "double", "DOUBLE"),
    NUM_DECIMAL(BigDecimal.class, "decimal", "DECIMAL"),
    TIME_DATE(Date.class, "date", "DATE"),
    TIME_DATETIME(Date.class, "datetime", "TIMESTAMP"),
    TIME_TIMESTAMP(Date.class, "timestamp", "TIMESTAMP"),
    TIME_TIME(Date.class, "time", "TIME"),
    STR_CHAR(String.class, "char", "CHAR"),
    STR_VARCHAR(String.class, "varchar", "VARCHAR"),
    STR_TEXT(String.class, "text", "VARCHAR"),
    BYTE_BLOB(Byte[].class, "blob", "BLOB");

    private final Class<?> javaType;

    private final String sqlType;

    private final String jdbcType;

    FiledType(Class<?> javaType, String sqlType, String jdbcType) {
        this.javaType = javaType;
        this.sqlType = sqlType;
        this.jdbcType = jdbcType;
    }

    public Class<?> getJavaType() {
        return javaType;
    }

    public String getSqlType() {
        return sqlType;
    }

    public String getJdbcType() {
        return jdbcType;
    }

    private static <T> FiledType getByTypeOrThrow(T type, Function<FiledType, T> category) {
        Preconditions.checkNotNull(type, "类型值不能为空！");
        return Stream.of(FiledType.values()).filter(t -> Objects.equals(type, category.apply(t))).findAny().orElseThrow(() -> new IllegalArgumentException("不支持的字段类型！"));
    }

    public static FiledType getByJdbcType(String type) {
        return getByTypeOrThrow(type, FiledType::getJdbcType);
    }

    public static FiledType getBySqlType(String type) {
        return getByTypeOrThrow(type, FiledType::getSqlType);
    }

    public static FiledType getJavaType(Class<?> type) {
        return getByTypeOrThrow(type, FiledType::getJavaType);
    }

}
