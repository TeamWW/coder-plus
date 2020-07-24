package com.lucifiere.common;

import com.google.common.base.Joiner;
import com.lucifiere.utils.EnumUtils;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 字段类型
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public enum FiledType {

    NUM_TINYINT(Short.class.getSimpleName(), "TINYINT", "TINYINT"),
    NUM_SMALLINT(Integer.class.getSimpleName(), "SMALLINT", "SMALLINT"),
    NUM_MEDIUMINT(Integer.class.getSimpleName(), "MEDIUMINT", "INTEGER"),
    NUM_INT(Integer.class.getSimpleName(), "INT", "INTEGER"),
    NUM_BIGINT(Long.class.getSimpleName(), "BIGINT", "BIGINT"),
    NUM_FLOAT(Float.class.getSimpleName(), "FLOAT", "FLOAT"),
    NUM_DOUBLE(Double.class.getSimpleName(), "DOUBLE", "DOUBLE"),
    NUM_DECIMAL(BigDecimal.class.getSimpleName(), "DECIMAL", "DECIMAL"),
    TIME_DATE(Date.class.getSimpleName(), "DATE", "DATE"),
    TIME_DATETIME(Date.class.getSimpleName(), "DATETIME", "TIMESTAMP"),
    TIME_TIMESTAMP(Date.class.getSimpleName(), "TIMESTAMP", "TIMESTAMP"),
    TIME_TIME(Date.class.getSimpleName(), "TIME", "TIME"),
    STR_CHAR(String.class.getSimpleName(), "CHAR", "CHAR"),
    STR_VARCHAR(String.class.getSimpleName(), "VARCHAR", "VARCHAR"),
    STR_TEXT(String.class.getSimpleName(), "TEXT", "VARCHAR"),
    BYTE_BLOB(Byte[].class.getSimpleName(), "BLOB", "BLOB");

    private final String javaType;

    private final String sqlType;

    private final String jdbcType;

    FiledType(String javaType, String sqlType, String jdbcType) {
        this.javaType = javaType;
        this.sqlType = sqlType;
        this.jdbcType = jdbcType;
    }

    public String getJavaType() {
        return javaType;
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
