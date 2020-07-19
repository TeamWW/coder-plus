package com.lucifiere.resovler;

import com.lucifiere.antlr.MySqlParser;
import com.lucifiere.antlr.MySqlParserBaseListener;
import com.lucifiere.common.FiledType;
import com.lucifiere.extract.Model;
import com.lucifiere.extract.table.TableField;
import com.lucifiere.extract.table.TableModel;

import java.util.Optional;

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

    @Override
    public void enterTableName(MySqlParser.TableNameContext ctx) {
        tableModel.setName(ctx.getText());
    }

    @Override
    public void enterColumnDeclaration(MySqlParser.ColumnDeclarationContext ctx) {
        var currentFiled = getCursor();
        var nameNode = ctx.getChild(MySqlParser.UidContext.class, 0);
        currentFiled.setName(nameNode.getText());
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
        currentFiled.setType(FiledType.getBySqlType(dataTypeNode.getText()));
        var commentNode = ctx.getChild(MySqlParser.TableOptionCommentContext.class, 0);
        currentFiled.setComment(commentNode.getText());
    }

    @Override
    public void exitColumnDefinition(MySqlParser.ColumnDefinitionContext ctx) {
        super.exitColumnDefinition(ctx);
    }

    @Override
    public Model resolve() {
        return null;
    }

}
