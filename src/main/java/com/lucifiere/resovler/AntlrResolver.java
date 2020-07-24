package com.lucifiere.resovler;

import com.lucifiere.antlr.MySqlParser;
import com.lucifiere.antlr.MySqlParserBaseListener;
import com.lucifiere.common.FiledType;
import com.lucifiere.extract.Model;
import com.lucifiere.extract.table.TableField;
import com.lucifiere.extract.table.TableModel;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Optional;

/**
 * 基于ANTLR的属性值解析工具
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public class AntlrResolver extends MySqlParserBaseListener {

    private final TableModel tableModel;

    private TableField cursor;

    private TableField getCursor() {
        cursor = Optional.ofNullable(cursor).orElse(new TableField());
        return cursor;
    }

    private void resetCursor() {
        cursor = null;
    }

    public AntlrResolver(TableModel tableModel) {
        this.tableModel = tableModel;
    }

    public TableModel getTableModel() {
        return tableModel;
    }

    @Override
    public void enterTableName(MySqlParser.TableNameContext ctx) {
        tableModel.setName(extractContent(ctx));
    }

    @Override
    public void enterColumnDeclaration(MySqlParser.ColumnDeclarationContext ctx) {
        var currentFiled = getCursor();
        var nameNode = ctx.getChild(MySqlParser.UidContext.class, 0);
        currentFiled.setName(extractContent(nameNode));
    }

    @Override
    public void exitColumnDeclaration(MySqlParser.ColumnDeclarationContext ctx) {
        tableModel.addTableFiled(getCursor());
        resetCursor();
    }

    @Override
    public void enterColumnDefinition(MySqlParser.ColumnDefinitionContext ctx) {
        var currentFiled = getCursor();
        var dataTypeNode = ctx.getChild(MySqlParser.DataTypeContext.class, 0);
        var dataTypeNameNode = dataTypeNode.getChild(0);
        Optional.ofNullable(dataTypeNameNode).ifPresent(node -> currentFiled.setType(FiledType.getBySqlType(extractContent(node))));
        var commentNode = ctx.getChild(MySqlParser.CommentColumnConstraintContext.class, 0);
        Optional.ofNullable(commentNode).ifPresent(node -> currentFiled.setComment(extractContent(node.getChild(1))));
    }

    @Override
    public void exitColumnDefinition(MySqlParser.ColumnDefinitionContext ctx) {
    }

    private String extractContent(ParseTree treeNode) {
        return treeNode == null ? null : treeNode.getText().toLowerCase();
    }

    @Override
    public Model resolve() {
        return null;
    }

}
