package com.lucifiere.antlr;

public class DDLListener extends MySqlParserBaseListener {

    private

    @Override
    public void enterTableName(MySqlParser.TableNameContext ctx) {
        super.enterTableName(ctx);
    }

    @Override
    public void enterTableOptionComment(MySqlParser.TableOptionCommentContext ctx) {
        super.enterTableOptionComment(ctx);
    }

    @Override
    public void exitColumnDefinition(MySqlParser.ColumnDefinitionContext ctx) {
        super.exitColumnDefinition(ctx);
    }

    @Override
    public void enterColumnDefinition(MySqlParser.ColumnDefinitionContext ctx) {
        super.enterColumnDefinition(ctx);
    }

}
