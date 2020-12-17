package com.dlin.common;

import com.dlin.utils.EnumUtils;
import com.google.common.base.Joiner;
import com.google.common.collect.Sets;

import java.util.Set;

/**
 * 字段类型
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public class FiledType {

    public static final FiledType NUM_TINYINT = new FiledType("java.lang.Integer", "TINYINT", "TINYINT", "i16");
    public static final FiledType NUM_SMALLINT = new FiledType("java.lang.Integer", "SMALLINT", "SMALLINT", "i32");
    public static final FiledType NUM_MEDIUMINT = new FiledType("java.lang.Integer", "MEDIUMINT", "INTEGER", "i32");
    public static final FiledType NUM_INT = new FiledType("java.lang.Integer", "INT", "INTEGER", "i32");
    public static final FiledType NUM_BIGINT = new FiledType("java.lang.Long", "BIGINT", "BIGINT", "i64");
    public static final FiledType NUM_FLOAT = new FiledType("java.lang.Float", "FLOAT", "FLOAT", "i64");
    public static final FiledType NUM_DOUBLE = new FiledType("java.lang.Double", "DOUBLE", "DOUBLE", "double");
    public static final FiledType NUM_DECIMAL = new FiledType("java.math.BigDecimal", "DECIMAL", "DECIMAL", "double");
    public static final FiledType TIME_DATE = new FiledType("java.util.Date", "DATE", "DATE", "");
    public static final FiledType TIME_DATETIME = new FiledType("java.util.Date", "DATETIME", "TIMESTAMP", "");
    public static final FiledType TIME_TIMESTAMP = new FiledType("java.util.Date", "TIMESTAMP", "TIMESTAMP", "");
    public static final FiledType TIME_TIME = new FiledType("java.util.Date", "TIME", "TIME", "");
    public static final FiledType STR_CHAR = new FiledType("java.lang.String", "CHAR", "CHAR", "string");
    public static final FiledType STR_VARCHAR = new FiledType("java.lang.String", "VARCHAR", "VARCHAR", "string");
    public static final FiledType STR_TEXT = new FiledType("java.lang.String", "TEXT", "VARCHAR", "string");
    public static final FiledType LONG_TEXT = new FiledType("java.lang.String", "LONGTEXT", "VARCHAR", "string");
    public static final FiledType BYTE_BLOB = new FiledType("java.lang.Byte", "BLOB", "BLOB", "binary");
    public static final FiledType BOOL = new FiledType("java.lang.Boolean", "BIT", "BIT", "bool");

    private final static Set<FiledType> BUILT_IN_TYPE = Sets.newHashSet(
            NUM_TINYINT,
            NUM_SMALLINT,
            NUM_MEDIUMINT,
            NUM_INT,
            NUM_BIGINT,
            NUM_FLOAT,
            NUM_DOUBLE,
            NUM_DECIMAL,
            TIME_DATE,
            TIME_DATETIME,
            TIME_TIMESTAMP,
            TIME_TIME,
            STR_CHAR,
            STR_VARCHAR,
            STR_TEXT,
            LONG_TEXT,
            BYTE_BLOB
    );

    private final String javaType;

    private final String sqlType;

    private final String jdbcType;

    private final String thriftType;

    public FiledType(String javaType, String sqlType, String jdbcType, String thriftType) {
        this.javaType = javaType;
        this.sqlType = sqlType;
        this.jdbcType = jdbcType;
        this.thriftType = thriftType;
    }

    public String getJavaType() {
        if (!javaType.contains(".")) {
            return javaType;
        }
        return javaType.substring(javaType.lastIndexOf(".") + 1);
    }

    public String getStandardJavaType() {
        return javaType;
    }

    public String getSqlType() {
        return sqlType;
    }

    public String getJdbcType() {
        return jdbcType;
    }

    public String getThriftType() {
        return thriftType;
    }

    public static FiledType getByJdbcType(String type) {
        return EnumUtils.getFieldTypeByVal(type, FiledType::getJdbcType, BUILT_IN_TYPE);
    }

    public static FiledType getBySqlType(String type) {
        return EnumUtils.getFieldTypeByVal(type, FiledType::getSqlType, FiledType.BUILT_IN_TYPE);
    }

    public static FiledType getByJavaType(String type) {
        return EnumUtils.getFieldTypeByVal(type, FiledType::getJavaType, FiledType.BUILT_IN_TYPE);
    }

    public static FiledType getByThriftType(String type) {
        return EnumUtils.getFieldTypeByVal(type, FiledType::getThriftType, FiledType.BUILT_IN_TYPE);
    }

    @Override
    public String toString() {
        return Joiner.on("|").join(javaType, jdbcType, sqlType, thriftType);
    }

}
