package com.dlin.resovler.antlr;

import com.dlin.antlr.sql.MySqlLexer;
import com.dlin.antlr.sql.MySqlParser;
import com.dlin.antlr.sql.MySqlParserBaseListener;
import com.dlin.common.FiledType;
import com.dlin.container.ManagedBean;
import com.dlin.model.meta.Field;
import com.dlin.model.Model;
import com.dlin.model.TableModel;
import com.dlin.resovler.Resolver;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
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
public class AntlrSqlResolver extends MySqlParserBaseListener implements Resolver {

    private TableModel tableModel;

    private Field cursor;

    private Field getCursor() {
        cursor = Optional.ofNullable(cursor).orElse(new Field());
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
        tableModel.setKeyword(AntlrUtils.extractSqlContent(ctx));
    }

    @Override
    public void enterColumnDeclaration(MySqlParser.ColumnDeclarationContext ctx) {
        Field currentFiled = getCursor();
        ParseTree nameNode = ctx.getChild(MySqlParser.UidContext.class, 0);
        currentFiled.setName(AntlrUtils.extractSqlContent(nameNode));
    }

    @Override
    public void exitColumnDeclaration(MySqlParser.ColumnDeclarationContext ctx) {
        tableModel.addTableFiled(getCursor());
        resetCursor();
    }

    @Override
    public void enterColumnDefinition(MySqlParser.ColumnDefinitionContext ctx) {
        Field currentFiled = getCursor();
        ParseTree dataTypeNode = ctx.getChild(MySqlParser.DataTypeContext.class, 0);
        ParseTree dataTypeNameNode = dataTypeNode.getChild(0);
        Optional.ofNullable(dataTypeNameNode).ifPresent(node -> currentFiled.setType(FiledType.getBySqlType(AntlrUtils.extractSqlContent(node))));
        ParseTree commentNode = ctx.getChild(MySqlParser.CommentColumnConstraintContext.class, 0);
        Optional.ofNullable(commentNode).ifPresent(node -> currentFiled.setComment(AntlrUtils.extractSqlContent(node.getChild(1))));
    }

    @Override
    public void enterTableOptionComment(MySqlParser.TableOptionCommentContext ctx) {
        ParseTree tbCommentNode = ctx.getChild(2);
        Optional.ofNullable(tbCommentNode).ifPresent(node -> tableModel.setComment(AntlrUtils.extractSqlContent(node)));
    }

    @Override
    public void enterPrimaryKeyColumnConstraint(MySqlParser.PrimaryKeyColumnConstraintContext ctx) {
        super.enterPrimaryKeyColumnConstraint(ctx);
    }

    @Override
    public void enterPrimaryKeyTableConstraint(MySqlParser.PrimaryKeyTableConstraintContext ctx) {
        MySqlParser.IndexColumnNamesContext pkContext = ctx.getChild(MySqlParser.IndexColumnNamesContext.class, 0);
        Optional.ofNullable(pkContext).ifPresent(c -> tableModel.addTablePrimaryKey(AntlrUtils.extractSqlContent(c.getChild(MySqlParser.IndexColumnNameContext.class, 0))));
    }

    @Override
    public Model resolve(String sourceCode) {
        CodePointCharStream input = CharStreams.fromString(sourceCode.toUpperCase());
        MySqlLexer lexer = new MySqlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MySqlParser parser = new MySqlParser(tokens);
        MySqlParser.CreateTableContext ctDdlTree = parser.createTable();
        ParseTreeWalker walker = new ParseTreeWalker();
        TableModel model = new TableModel();
        this.setTableModel(model);
        walker.walk(this, ctDdlTree);
        return model;
    }

}
