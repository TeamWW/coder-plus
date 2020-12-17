package com.dlin.resovler.antlr;

import org.antlr.v4.runtime.tree.ParseTree;

/**
 * 基于Antlr的源码解析会用到的工具
 *
 * @author created by XD.Wang
 * Date 2020/12/16.
 */
final public class AntlrUtils {

    public static String extractSqlContent(ParseTree treeNode) {
        String field = extractContent(treeNode);
        if (field == null) {
            return null;
        }
        field = field.toLowerCase();
        final String fieldDef = "`";
        final String commentDef = "'";
        if (field.startsWith(fieldDef) || field.startsWith(commentDef)) {
            field = field.substring(1);
        }
        if (field.endsWith(fieldDef) || field.endsWith(commentDef)) {
            field = field.substring(0, field.length() - 1);
        }
        return field;
    }

    public static String extractContent(ParseTree treeNode) {
        return treeNode == null ? null : treeNode.getText();
    }

}
