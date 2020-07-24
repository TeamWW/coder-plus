package com.lucifiere.extract.table;

import com.lucifiere.common.FiledType;

/**
 * 表字段
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public class TableField {

    private String name;

    private FiledType type;

    private String comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
