package com.dlin.model.meta;

import com.dlin.common.FiledType;
import com.dlin.utils.CodeStyle;

import java.util.Objects;

/**
 * 表字段
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public class Field {

    private String name;

    private FiledType type;

    private String comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCfName() {
        return CodeStyle.ofUlCode(name).toStyle(CodeStyle.NamedStyle.CAMEL).toStyle(CodeStyle.NamedStyle.CAP_FIRST).toString();
    }

    public FiledType getType() {
        return type;
    }

    public void setType(FiledType type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "TableField{" +
                "name=" + name +
                ",type=" + type +
                ",comment=" + comment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field that = (Field) o;
        return Objects.equals(name, that.name) &&
                type == that.type &&
                Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, comment);
    }
}
