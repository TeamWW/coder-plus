package com.lucifiere.resovler.antlr;

import com.lucifiere.antlr.MySqlLexer;
import com.lucifiere.antlr.MySqlParser;
import com.lucifiere.antlr.MySqlParserBaseListener;
import com.lucifiere.common.FiledType;
import com.lucifiere.container.ManagedBean;
import com.lucifiere.model.Model;
import com.lucifiere.extract.table.TableField;
import com.lucifiere.model.TableModel;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Optional;

/**
 * 基于ANTLR的属性值解析工具
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
@ManagedBean
public class AntlrResolver extends MySqlParserBaseListener {

    private TableModel tableModel;

    private TableField cursor;

    private TableField getCursor() {
        cursor = Optional.ofNullable(cursor).orElse(new TableField());
        return cursor;
    }

    private void resetCursor() {
        cursor = null;
    }

    public void setTableModel(TableModel tableModel) {
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
        String field = treeNode == null ? null : treeNode.getText().toLowerCase();
        if (field == null) {
            return null;
        }
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

    @Override
    public Model resolve(String sourceCode) {
        var input = CharStreams.fromString(sourceCode.toUpperCase());
        var lexer = new MySqlLexer(input);
        var tokens = new CommonTokenStream(lexer);
        var parser = new MySqlParser(tokens);
        MySqlParser.CreateTableContext ctDdlTree = parser.createTable();
        var walker = new ParseTreeWalker();
        var model = new TableModel();
        this.setTableModel(model);
        walker.walk(this, ctDdlTree);
        return model;
    }

}
