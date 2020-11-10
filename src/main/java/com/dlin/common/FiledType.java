package com.dlin.common;

import com.google.common.base.Joiner;
import com.dlin.utils.EnumUtils;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 字段类型
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public enum FiledType {

    NUM_TINYINT(Integer.class, "TINYINT", "TINYINT"),
    NUM_SMALLINT(Integer.class, "SMALLINT", "SMALLINT"),
    NUM_MEDIUMINT(Integer.class, "MEDIUMINT", "INTEGER"),
    NUM_INT(Integer.class, "INT", "INTEGER"),
    NUM_BIGINT(Long.class, "BIGINT", "BIGINT"),
    NUM_FLOAT(Float.class, "FLOAT", "FLOAT"),
    NUM_DOUBLE(Double.class, "DOUBLE", "DOUBLE"),
    NUM_DECIMAL(BigDecimal.class, "DECIMAL", "DECIMAL"),
    TIME_DATE(Date.class, "DATE", "DATE"),
    TIME_DATETIME(Date.class, "DATETIME", "TIMESTAMP"),
    TIME_TIMESTAMP(Date.class, "TIMESTAMP", "TIMESTAMP"),
    TIME_TIME(Date.class, "TIME", "TIME"),
    STR_CHAR(String.class, "CHAR", "CHAR"),
    STR_VARCHAR(String.class, "VARCHAR", "VARCHAR"),
    STR_TEXT(String.class, "TEXT", "VARCHAR"),
    LONG_TEXT(String.class, "LONGTEXT", "VARCHAR"),
    BYTE_BLOB(Byte[].class, "BLOB", "BLOB");

    private final Class<?> javaType;

    private final String sqlType;

    private final String jdbcType;

    FiledType(Class<?> javaType, String sqlType, String jdbcType) {
        this.javaType = javaType;
        this.sqlType = sqlType;
        this.jdbcType = jdbcType;
    }

    public String getJavaType() {
        return javaType.getSimpleName();
    }
    
    public String getStandardJavaType() {
        return javaType.getName();
    }

    public String getSqlType() {
        return sqlType;
    }

    public String getJdbcType() {
        return jdbcType;
    }

    public static FiledType getByJdbcType(String type) {
        return EnumUtils.getByValOrThrow(type, FiledType::getJdbcType, FiledType.values());
    }

    public static FiledType getBySqlType(String type) {
        return EnumUtils.getByValOrThrow(type, FiledType::getSqlType, FiledType.values());
    }

    public static FiledType getByJavaType(String type) {
        return EnumUtils.getByValOrThrow(type, FiledType::getJavaType, FiledType.values());
    }

    @Override
    public String toString() {
        return Joiner.on("|").join(javaType, jdbcType, sqlType);
    }

}
