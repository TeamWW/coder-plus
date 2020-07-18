// Generated from F:/coder-plus/src/main/resources/g4\MySqlParser.g4 by ANTLR 4.8
package com.lucifiere.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MySqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface MySqlParserVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link MySqlParser#root}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRoot(MySqlParser.RootContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#sqlStatements}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSqlStatements(MySqlParser.SqlStatementsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#sqlStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSqlStatement(MySqlParser.SqlStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#emptyStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitEmptyStatement(MySqlParser.EmptyStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#ddlStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDdlStatement(MySqlParser.DdlStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#dmlStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDmlStatement(MySqlParser.DmlStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#transactionStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTransactionStatement(MySqlParser.TransactionStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#replicationStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitReplicationStatement(MySqlParser.ReplicationStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#preparedStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPreparedStatement(MySqlParser.PreparedStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#compoundStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCompoundStatement(MySqlParser.CompoundStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#administrationStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAdministrationStatement(MySqlParser.AdministrationStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#utilityStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUtilityStatement(MySqlParser.UtilityStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#createDatabase}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCreateDatabase(MySqlParser.CreateDatabaseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#createEvent}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCreateEvent(MySqlParser.CreateEventContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#createIndex}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCreateIndex(MySqlParser.CreateIndexContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#createLogfileGroup}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCreateLogfileGroup(MySqlParser.CreateLogfileGroupContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#createProcedure}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCreateProcedure(MySqlParser.CreateProcedureContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#createFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCreateFunction(MySqlParser.CreateFunctionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#createServer}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCreateServer(MySqlParser.CreateServerContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code copyCreateTable}
     * labeled alternative in {@link MySqlParser#createTable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCopyCreateTable(MySqlParser.CopyCreateTableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code queryCreateTable}
     * labeled alternative in {@link MySqlParser#createTable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitQueryCreateTable(MySqlParser.QueryCreateTableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code columnCreateTable}
     * labeled alternative in {@link MySqlParser#createTable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitColumnCreateTable(MySqlParser.ColumnCreateTableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#createTablespaceInnodb}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCreateTablespaceInnodb(MySqlParser.CreateTablespaceInnodbContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#createTablespaceNdb}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCreateTablespaceNdb(MySqlParser.CreateTablespaceNdbContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#createTrigger}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCreateTrigger(MySqlParser.CreateTriggerContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#createView}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCreateView(MySqlParser.CreateViewContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#createDatabaseOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCreateDatabaseOption(MySqlParser.CreateDatabaseOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#ownerStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitOwnerStatement(MySqlParser.OwnerStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code preciseSchedule}
     * labeled alternative in {@link MySqlParser#scheduleExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPreciseSchedule(MySqlParser.PreciseScheduleContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code intervalSchedule}
     * labeled alternative in {@link MySqlParser#scheduleExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIntervalSchedule(MySqlParser.IntervalScheduleContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#timestampValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTimestampValue(MySqlParser.TimestampValueContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#intervalExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIntervalExpr(MySqlParser.IntervalExprContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#intervalType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIntervalType(MySqlParser.IntervalTypeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#enableType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitEnableType(MySqlParser.EnableTypeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#indexType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIndexType(MySqlParser.IndexTypeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#indexOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIndexOption(MySqlParser.IndexOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#procedureParameter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitProcedureParameter(MySqlParser.ProcedureParameterContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#functionParameter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitFunctionParameter(MySqlParser.FunctionParameterContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code routineComment}
     * labeled alternative in {@link MySqlParser#routineOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRoutineComment(MySqlParser.RoutineCommentContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code routineLanguage}
     * labeled alternative in {@link MySqlParser#routineOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRoutineLanguage(MySqlParser.RoutineLanguageContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code routineBehavior}
     * labeled alternative in {@link MySqlParser#routineOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRoutineBehavior(MySqlParser.RoutineBehaviorContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code routineData}
     * labeled alternative in {@link MySqlParser#routineOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRoutineData(MySqlParser.RoutineDataContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code routineSecurity}
     * labeled alternative in {@link MySqlParser#routineOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRoutineSecurity(MySqlParser.RoutineSecurityContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#serverOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitServerOption(MySqlParser.ServerOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#createDefinitions}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCreateDefinitions(MySqlParser.CreateDefinitionsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code columnDeclaration}
     * labeled alternative in {@link MySqlParser#createDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitColumnDeclaration(MySqlParser.ColumnDeclarationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code constraintDeclaration}
     * labeled alternative in {@link MySqlParser#createDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitConstraintDeclaration(MySqlParser.ConstraintDeclarationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code indexDeclaration}
     * labeled alternative in {@link MySqlParser#createDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIndexDeclaration(MySqlParser.IndexDeclarationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#columnDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitColumnDefinition(MySqlParser.ColumnDefinitionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code nullColumnConstraint}
     * labeled alternative in {@link MySqlParser#columnConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitNullColumnConstraint(MySqlParser.NullColumnConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code defaultColumnConstraint}
     * labeled alternative in {@link MySqlParser#columnConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDefaultColumnConstraint(MySqlParser.DefaultColumnConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code autoIncrementColumnConstraint}
     * labeled alternative in {@link MySqlParser#columnConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAutoIncrementColumnConstraint(MySqlParser.AutoIncrementColumnConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code primaryKeyColumnConstraint}
     * labeled alternative in {@link MySqlParser#columnConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPrimaryKeyColumnConstraint(MySqlParser.PrimaryKeyColumnConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code uniqueKeyColumnConstraint}
     * labeled alternative in {@link MySqlParser#columnConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUniqueKeyColumnConstraint(MySqlParser.UniqueKeyColumnConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code commentColumnConstraint}
     * labeled alternative in {@link MySqlParser#columnConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCommentColumnConstraint(MySqlParser.CommentColumnConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code formatColumnConstraint}
     * labeled alternative in {@link MySqlParser#columnConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitFormatColumnConstraint(MySqlParser.FormatColumnConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code storageColumnConstraint}
     * labeled alternative in {@link MySqlParser#columnConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitStorageColumnConstraint(MySqlParser.StorageColumnConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code referenceColumnConstraint}
     * labeled alternative in {@link MySqlParser#columnConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitReferenceColumnConstraint(MySqlParser.ReferenceColumnConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code collateColumnConstraint}
     * labeled alternative in {@link MySqlParser#columnConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCollateColumnConstraint(MySqlParser.CollateColumnConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code generatedColumnConstraint}
     * labeled alternative in {@link MySqlParser#columnConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitGeneratedColumnConstraint(MySqlParser.GeneratedColumnConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code serialDefaultColumnConstraint}
     * labeled alternative in {@link MySqlParser#columnConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSerialDefaultColumnConstraint(MySqlParser.SerialDefaultColumnConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code primaryKeyTableConstraint}
     * labeled alternative in {@link MySqlParser#tableConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPrimaryKeyTableConstraint(MySqlParser.PrimaryKeyTableConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code uniqueKeyTableConstraint}
     * labeled alternative in {@link MySqlParser#tableConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUniqueKeyTableConstraint(MySqlParser.UniqueKeyTableConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code foreignKeyTableConstraint}
     * labeled alternative in {@link MySqlParser#tableConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitForeignKeyTableConstraint(MySqlParser.ForeignKeyTableConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code checkTableConstraint}
     * labeled alternative in {@link MySqlParser#tableConstraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCheckTableConstraint(MySqlParser.CheckTableConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#referenceDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitReferenceDefinition(MySqlParser.ReferenceDefinitionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#referenceAction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitReferenceAction(MySqlParser.ReferenceActionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#referenceControlType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitReferenceControlType(MySqlParser.ReferenceControlTypeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code simpleIndexDeclaration}
     * labeled alternative in {@link MySqlParser#indexColumnDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSimpleIndexDeclaration(MySqlParser.SimpleIndexDeclarationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code specialIndexDeclaration}
     * labeled alternative in {@link MySqlParser#indexColumnDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSpecialIndexDeclaration(MySqlParser.SpecialIndexDeclarationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionEngine}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionEngine(MySqlParser.TableOptionEngineContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionAutoIncrement}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionAutoIncrement(MySqlParser.TableOptionAutoIncrementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionAverage}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionAverage(MySqlParser.TableOptionAverageContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionCharset}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionCharset(MySqlParser.TableOptionCharsetContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionChecksum}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionChecksum(MySqlParser.TableOptionChecksumContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionCollate}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionCollate(MySqlParser.TableOptionCollateContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionComment}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionComment(MySqlParser.TableOptionCommentContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionCompression}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionCompression(MySqlParser.TableOptionCompressionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionConnection}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionConnection(MySqlParser.TableOptionConnectionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionDataDirectory}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionDataDirectory(MySqlParser.TableOptionDataDirectoryContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionDelay}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionDelay(MySqlParser.TableOptionDelayContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionEncryption}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionEncryption(MySqlParser.TableOptionEncryptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionIndexDirectory}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionIndexDirectory(MySqlParser.TableOptionIndexDirectoryContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionInsertMethod}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionInsertMethod(MySqlParser.TableOptionInsertMethodContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionKeyBlockSize}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionKeyBlockSize(MySqlParser.TableOptionKeyBlockSizeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionMaxRows}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionMaxRows(MySqlParser.TableOptionMaxRowsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionMinRows}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionMinRows(MySqlParser.TableOptionMinRowsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionPackKeys}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionPackKeys(MySqlParser.TableOptionPackKeysContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionPassword}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionPassword(MySqlParser.TableOptionPasswordContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionRowFormat}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionRowFormat(MySqlParser.TableOptionRowFormatContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionRecalculation}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionRecalculation(MySqlParser.TableOptionRecalculationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionPersistent}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionPersistent(MySqlParser.TableOptionPersistentContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionSamplePage}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionSamplePage(MySqlParser.TableOptionSamplePageContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionTablespace}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionTablespace(MySqlParser.TableOptionTablespaceContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableOptionUnion}
     * labeled alternative in {@link MySqlParser#tableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableOptionUnion(MySqlParser.TableOptionUnionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#tablespaceStorage}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTablespaceStorage(MySqlParser.TablespaceStorageContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#partitionDefinitions}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionDefinitions(MySqlParser.PartitionDefinitionsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code partitionFunctionHash}
     * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionFunctionHash(MySqlParser.PartitionFunctionHashContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code partitionFunctionKey}
     * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionFunctionKey(MySqlParser.PartitionFunctionKeyContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code partitionFunctionRange}
     * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionFunctionRange(MySqlParser.PartitionFunctionRangeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code partitionFunctionList}
     * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionFunctionList(MySqlParser.PartitionFunctionListContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code subPartitionFunctionHash}
     * labeled alternative in {@link MySqlParser#subpartitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSubPartitionFunctionHash(MySqlParser.SubPartitionFunctionHashContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code subPartitionFunctionKey}
     * labeled alternative in {@link MySqlParser#subpartitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSubPartitionFunctionKey(MySqlParser.SubPartitionFunctionKeyContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code partitionComparision}
     * labeled alternative in {@link MySqlParser#partitionDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionComparision(MySqlParser.PartitionComparisionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code partitionListAtom}
     * labeled alternative in {@link MySqlParser#partitionDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionListAtom(MySqlParser.PartitionListAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code partitionListVector}
     * labeled alternative in {@link MySqlParser#partitionDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionListVector(MySqlParser.PartitionListVectorContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code partitionSimple}
     * labeled alternative in {@link MySqlParser#partitionDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionSimple(MySqlParser.PartitionSimpleContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#partitionDefinerAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionDefinerAtom(MySqlParser.PartitionDefinerAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#partitionDefinerVector}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionDefinerVector(MySqlParser.PartitionDefinerVectorContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#subpartitionDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSubpartitionDefinition(MySqlParser.SubpartitionDefinitionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code partitionOptionEngine}
     * labeled alternative in {@link MySqlParser#partitionOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionOptionEngine(MySqlParser.PartitionOptionEngineContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code partitionOptionComment}
     * labeled alternative in {@link MySqlParser#partitionOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionOptionComment(MySqlParser.PartitionOptionCommentContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code partitionOptionDataDirectory}
     * labeled alternative in {@link MySqlParser#partitionOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionOptionDataDirectory(MySqlParser.PartitionOptionDataDirectoryContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code partitionOptionIndexDirectory}
     * labeled alternative in {@link MySqlParser#partitionOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionOptionIndexDirectory(MySqlParser.PartitionOptionIndexDirectoryContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code partitionOptionMaxRows}
     * labeled alternative in {@link MySqlParser#partitionOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionOptionMaxRows(MySqlParser.PartitionOptionMaxRowsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code partitionOptionMinRows}
     * labeled alternative in {@link MySqlParser#partitionOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionOptionMinRows(MySqlParser.PartitionOptionMinRowsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code partitionOptionTablespace}
     * labeled alternative in {@link MySqlParser#partitionOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionOptionTablespace(MySqlParser.PartitionOptionTablespaceContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code partitionOptionNodeGroup}
     * labeled alternative in {@link MySqlParser#partitionOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPartitionOptionNodeGroup(MySqlParser.PartitionOptionNodeGroupContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterSimpleDatabase}
     * labeled alternative in {@link MySqlParser#alterDatabase}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterSimpleDatabase(MySqlParser.AlterSimpleDatabaseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterUpgradeName}
     * labeled alternative in {@link MySqlParser#alterDatabase}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterUpgradeName(MySqlParser.AlterUpgradeNameContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#alterEvent}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterEvent(MySqlParser.AlterEventContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#alterFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterFunction(MySqlParser.AlterFunctionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#alterInstance}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterInstance(MySqlParser.AlterInstanceContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#alterLogfileGroup}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterLogfileGroup(MySqlParser.AlterLogfileGroupContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#alterProcedure}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterProcedure(MySqlParser.AlterProcedureContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#alterServer}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterServer(MySqlParser.AlterServerContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#alterTable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterTable(MySqlParser.AlterTableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#alterTablespace}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterTablespace(MySqlParser.AlterTablespaceContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#alterView}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterView(MySqlParser.AlterViewContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByTableOption}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByTableOption(MySqlParser.AlterByTableOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByAddColumn}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByAddColumn(MySqlParser.AlterByAddColumnContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByAddColumns}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByAddColumns(MySqlParser.AlterByAddColumnsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByAddIndex}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByAddIndex(MySqlParser.AlterByAddIndexContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByAddPrimaryKey}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByAddPrimaryKey(MySqlParser.AlterByAddPrimaryKeyContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByAddUniqueKey}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByAddUniqueKey(MySqlParser.AlterByAddUniqueKeyContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByAddSpecialIndex}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByAddSpecialIndex(MySqlParser.AlterByAddSpecialIndexContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByAddForeignKey}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByAddForeignKey(MySqlParser.AlterByAddForeignKeyContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByAddCheckTableConstraint}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByAddCheckTableConstraint(MySqlParser.AlterByAddCheckTableConstraintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterBySetAlgorithm}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterBySetAlgorithm(MySqlParser.AlterBySetAlgorithmContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByChangeDefault}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByChangeDefault(MySqlParser.AlterByChangeDefaultContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByChangeColumn}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByChangeColumn(MySqlParser.AlterByChangeColumnContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByRenameColumn}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByRenameColumn(MySqlParser.AlterByRenameColumnContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByLock}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByLock(MySqlParser.AlterByLockContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByModifyColumn}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByModifyColumn(MySqlParser.AlterByModifyColumnContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByDropColumn}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByDropColumn(MySqlParser.AlterByDropColumnContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByDropPrimaryKey}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByDropPrimaryKey(MySqlParser.AlterByDropPrimaryKeyContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByRenameIndex}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByRenameIndex(MySqlParser.AlterByRenameIndexContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByDropIndex}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByDropIndex(MySqlParser.AlterByDropIndexContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByDropForeignKey}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByDropForeignKey(MySqlParser.AlterByDropForeignKeyContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByDisableKeys}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByDisableKeys(MySqlParser.AlterByDisableKeysContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByEnableKeys}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByEnableKeys(MySqlParser.AlterByEnableKeysContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByRename}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByRename(MySqlParser.AlterByRenameContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByOrder}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByOrder(MySqlParser.AlterByOrderContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByConvertCharset}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByConvertCharset(MySqlParser.AlterByConvertCharsetContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByDefaultCharset}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByDefaultCharset(MySqlParser.AlterByDefaultCharsetContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByDiscardTablespace}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByDiscardTablespace(MySqlParser.AlterByDiscardTablespaceContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByImportTablespace}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByImportTablespace(MySqlParser.AlterByImportTablespaceContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByForce}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByForce(MySqlParser.AlterByForceContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByValidate}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByValidate(MySqlParser.AlterByValidateContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByAddPartition}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByAddPartition(MySqlParser.AlterByAddPartitionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByDropPartition}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByDropPartition(MySqlParser.AlterByDropPartitionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByDiscardPartition}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByDiscardPartition(MySqlParser.AlterByDiscardPartitionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByImportPartition}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByImportPartition(MySqlParser.AlterByImportPartitionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByTruncatePartition}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByTruncatePartition(MySqlParser.AlterByTruncatePartitionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByCoalescePartition}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByCoalescePartition(MySqlParser.AlterByCoalescePartitionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByReorganizePartition}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByReorganizePartition(MySqlParser.AlterByReorganizePartitionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByExchangePartition}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByExchangePartition(MySqlParser.AlterByExchangePartitionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByAnalyzePartition}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByAnalyzePartition(MySqlParser.AlterByAnalyzePartitionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByCheckPartition}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByCheckPartition(MySqlParser.AlterByCheckPartitionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByOptimizePartition}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByOptimizePartition(MySqlParser.AlterByOptimizePartitionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByRebuildPartition}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByRebuildPartition(MySqlParser.AlterByRebuildPartitionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByRepairPartition}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByRepairPartition(MySqlParser.AlterByRepairPartitionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByRemovePartitioning}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByRemovePartitioning(MySqlParser.AlterByRemovePartitioningContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterByUpgradePartitioning}
     * labeled alternative in {@link MySqlParser#alterSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterByUpgradePartitioning(MySqlParser.AlterByUpgradePartitioningContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#dropDatabase}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDropDatabase(MySqlParser.DropDatabaseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#dropEvent}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDropEvent(MySqlParser.DropEventContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#dropIndex}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDropIndex(MySqlParser.DropIndexContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#dropLogfileGroup}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDropLogfileGroup(MySqlParser.DropLogfileGroupContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#dropProcedure}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDropProcedure(MySqlParser.DropProcedureContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#dropFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDropFunction(MySqlParser.DropFunctionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#dropServer}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDropServer(MySqlParser.DropServerContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#dropTable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDropTable(MySqlParser.DropTableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#dropTablespace}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDropTablespace(MySqlParser.DropTablespaceContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#dropTrigger}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDropTrigger(MySqlParser.DropTriggerContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#dropView}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDropView(MySqlParser.DropViewContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#renameTable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRenameTable(MySqlParser.RenameTableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#renameTableClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRenameTableClause(MySqlParser.RenameTableClauseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#truncateTable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTruncateTable(MySqlParser.TruncateTableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#callStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCallStatement(MySqlParser.CallStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#deleteStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDeleteStatement(MySqlParser.DeleteStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#doStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDoStatement(MySqlParser.DoStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#handlerStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitHandlerStatement(MySqlParser.HandlerStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#insertStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitInsertStatement(MySqlParser.InsertStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#loadDataStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLoadDataStatement(MySqlParser.LoadDataStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#loadXmlStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLoadXmlStatement(MySqlParser.LoadXmlStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#replaceStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitReplaceStatement(MySqlParser.ReplaceStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code simpleSelect}
     * labeled alternative in {@link MySqlParser#selectStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSimpleSelect(MySqlParser.SimpleSelectContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code parenthesisSelect}
     * labeled alternative in {@link MySqlParser#selectStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitParenthesisSelect(MySqlParser.ParenthesisSelectContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code unionSelect}
     * labeled alternative in {@link MySqlParser#selectStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUnionSelect(MySqlParser.UnionSelectContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code unionParenthesisSelect}
     * labeled alternative in {@link MySqlParser#selectStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUnionParenthesisSelect(MySqlParser.UnionParenthesisSelectContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#updateStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUpdateStatement(MySqlParser.UpdateStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#insertStatementValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitInsertStatementValue(MySqlParser.InsertStatementValueContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#updatedElement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUpdatedElement(MySqlParser.UpdatedElementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#assignmentField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAssignmentField(MySqlParser.AssignmentFieldContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#lockClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLockClause(MySqlParser.LockClauseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#singleDeleteStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSingleDeleteStatement(MySqlParser.SingleDeleteStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#multipleDeleteStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitMultipleDeleteStatement(MySqlParser.MultipleDeleteStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#handlerOpenStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitHandlerOpenStatement(MySqlParser.HandlerOpenStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#handlerReadIndexStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitHandlerReadIndexStatement(MySqlParser.HandlerReadIndexStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#handlerReadStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitHandlerReadStatement(MySqlParser.HandlerReadStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#handlerCloseStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitHandlerCloseStatement(MySqlParser.HandlerCloseStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#singleUpdateStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSingleUpdateStatement(MySqlParser.SingleUpdateStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#multipleUpdateStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitMultipleUpdateStatement(MySqlParser.MultipleUpdateStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#orderByClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitOrderByClause(MySqlParser.OrderByClauseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#orderByExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitOrderByExpression(MySqlParser.OrderByExpressionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#tableSources}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableSources(MySqlParser.TableSourcesContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableSourceBase}
     * labeled alternative in {@link MySqlParser#tableSource}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableSourceBase(MySqlParser.TableSourceBaseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableSourceNested}
     * labeled alternative in {@link MySqlParser#tableSource}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableSourceNested(MySqlParser.TableSourceNestedContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code atomTableItem}
     * labeled alternative in {@link MySqlParser#tableSourceItem}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAtomTableItem(MySqlParser.AtomTableItemContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code subqueryTableItem}
     * labeled alternative in {@link MySqlParser#tableSourceItem}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSubqueryTableItem(MySqlParser.SubqueryTableItemContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableSourcesItem}
     * labeled alternative in {@link MySqlParser#tableSourceItem}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableSourcesItem(MySqlParser.TableSourcesItemContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#indexHint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIndexHint(MySqlParser.IndexHintContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#indexHintType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIndexHintType(MySqlParser.IndexHintTypeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code innerJoin}
     * labeled alternative in {@link MySqlParser#joinPart}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitInnerJoin(MySqlParser.InnerJoinContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code straightJoin}
     * labeled alternative in {@link MySqlParser#joinPart}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitStraightJoin(MySqlParser.StraightJoinContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code outerJoin}
     * labeled alternative in {@link MySqlParser#joinPart}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitOuterJoin(MySqlParser.OuterJoinContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code naturalJoin}
     * labeled alternative in {@link MySqlParser#joinPart}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitNaturalJoin(MySqlParser.NaturalJoinContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#queryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitQueryExpression(MySqlParser.QueryExpressionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#queryExpressionNointo}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitQueryExpressionNointo(MySqlParser.QueryExpressionNointoContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#querySpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitQuerySpecification(MySqlParser.QuerySpecificationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#querySpecificationNointo}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitQuerySpecificationNointo(MySqlParser.QuerySpecificationNointoContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#unionParenthesis}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUnionParenthesis(MySqlParser.UnionParenthesisContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#unionStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUnionStatement(MySqlParser.UnionStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#selectSpec}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSelectSpec(MySqlParser.SelectSpecContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#selectElements}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSelectElements(MySqlParser.SelectElementsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code selectStarElement}
     * labeled alternative in {@link MySqlParser#selectElement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSelectStarElement(MySqlParser.SelectStarElementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code selectColumnElement}
     * labeled alternative in {@link MySqlParser#selectElement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSelectColumnElement(MySqlParser.SelectColumnElementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code selectFunctionElement}
     * labeled alternative in {@link MySqlParser#selectElement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSelectFunctionElement(MySqlParser.SelectFunctionElementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code selectExpressionElement}
     * labeled alternative in {@link MySqlParser#selectElement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSelectExpressionElement(MySqlParser.SelectExpressionElementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code selectIntoVariables}
     * labeled alternative in {@link MySqlParser#selectIntoExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSelectIntoVariables(MySqlParser.SelectIntoVariablesContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code selectIntoDumpFile}
     * labeled alternative in {@link MySqlParser#selectIntoExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSelectIntoDumpFile(MySqlParser.SelectIntoDumpFileContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code selectIntoTextFile}
     * labeled alternative in {@link MySqlParser#selectIntoExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSelectIntoTextFile(MySqlParser.SelectIntoTextFileContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#selectFieldsInto}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSelectFieldsInto(MySqlParser.SelectFieldsIntoContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#selectLinesInto}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSelectLinesInto(MySqlParser.SelectLinesIntoContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#fromClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitFromClause(MySqlParser.FromClauseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#groupByItem}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitGroupByItem(MySqlParser.GroupByItemContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#limitClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLimitClause(MySqlParser.LimitClauseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#limitClauseAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLimitClauseAtom(MySqlParser.LimitClauseAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#startTransaction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitStartTransaction(MySqlParser.StartTransactionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#beginWork}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitBeginWork(MySqlParser.BeginWorkContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#commitWork}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCommitWork(MySqlParser.CommitWorkContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#rollbackWork}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRollbackWork(MySqlParser.RollbackWorkContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#savepointStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSavepointStatement(MySqlParser.SavepointStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#rollbackStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRollbackStatement(MySqlParser.RollbackStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#releaseStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitReleaseStatement(MySqlParser.ReleaseStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#lockTables}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLockTables(MySqlParser.LockTablesContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#unlockTables}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUnlockTables(MySqlParser.UnlockTablesContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#setAutocommitStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSetAutocommitStatement(MySqlParser.SetAutocommitStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#setTransactionStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSetTransactionStatement(MySqlParser.SetTransactionStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#transactionMode}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTransactionMode(MySqlParser.TransactionModeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#lockTableElement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLockTableElement(MySqlParser.LockTableElementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#lockAction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLockAction(MySqlParser.LockActionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#transactionOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTransactionOption(MySqlParser.TransactionOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#transactionLevel}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTransactionLevel(MySqlParser.TransactionLevelContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#changeMaster}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitChangeMaster(MySqlParser.ChangeMasterContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#changeReplicationFilter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitChangeReplicationFilter(MySqlParser.ChangeReplicationFilterContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#purgeBinaryLogs}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPurgeBinaryLogs(MySqlParser.PurgeBinaryLogsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#resetMaster}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitResetMaster(MySqlParser.ResetMasterContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#resetSlave}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitResetSlave(MySqlParser.ResetSlaveContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#startSlave}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitStartSlave(MySqlParser.StartSlaveContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#stopSlave}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitStopSlave(MySqlParser.StopSlaveContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#startGroupReplication}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitStartGroupReplication(MySqlParser.StartGroupReplicationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#stopGroupReplication}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitStopGroupReplication(MySqlParser.StopGroupReplicationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code masterStringOption}
     * labeled alternative in {@link MySqlParser#masterOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitMasterStringOption(MySqlParser.MasterStringOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code masterDecimalOption}
     * labeled alternative in {@link MySqlParser#masterOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitMasterDecimalOption(MySqlParser.MasterDecimalOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code masterBoolOption}
     * labeled alternative in {@link MySqlParser#masterOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitMasterBoolOption(MySqlParser.MasterBoolOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code masterRealOption}
     * labeled alternative in {@link MySqlParser#masterOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitMasterRealOption(MySqlParser.MasterRealOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code masterUidListOption}
     * labeled alternative in {@link MySqlParser#masterOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitMasterUidListOption(MySqlParser.MasterUidListOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#stringMasterOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitStringMasterOption(MySqlParser.StringMasterOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#decimalMasterOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDecimalMasterOption(MySqlParser.DecimalMasterOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#boolMasterOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitBoolMasterOption(MySqlParser.BoolMasterOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#channelOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitChannelOption(MySqlParser.ChannelOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code doDbReplication}
     * labeled alternative in {@link MySqlParser#replicationFilter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDoDbReplication(MySqlParser.DoDbReplicationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code ignoreDbReplication}
     * labeled alternative in {@link MySqlParser#replicationFilter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIgnoreDbReplication(MySqlParser.IgnoreDbReplicationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code doTableReplication}
     * labeled alternative in {@link MySqlParser#replicationFilter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDoTableReplication(MySqlParser.DoTableReplicationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code ignoreTableReplication}
     * labeled alternative in {@link MySqlParser#replicationFilter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIgnoreTableReplication(MySqlParser.IgnoreTableReplicationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code wildDoTableReplication}
     * labeled alternative in {@link MySqlParser#replicationFilter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitWildDoTableReplication(MySqlParser.WildDoTableReplicationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code wildIgnoreTableReplication}
     * labeled alternative in {@link MySqlParser#replicationFilter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitWildIgnoreTableReplication(MySqlParser.WildIgnoreTableReplicationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code rewriteDbReplication}
     * labeled alternative in {@link MySqlParser#replicationFilter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRewriteDbReplication(MySqlParser.RewriteDbReplicationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#tablePair}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTablePair(MySqlParser.TablePairContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#threadType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitThreadType(MySqlParser.ThreadTypeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code gtidsUntilOption}
     * labeled alternative in {@link MySqlParser#untilOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitGtidsUntilOption(MySqlParser.GtidsUntilOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code masterLogUntilOption}
     * labeled alternative in {@link MySqlParser#untilOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitMasterLogUntilOption(MySqlParser.MasterLogUntilOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code relayLogUntilOption}
     * labeled alternative in {@link MySqlParser#untilOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRelayLogUntilOption(MySqlParser.RelayLogUntilOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code sqlGapsUntilOption}
     * labeled alternative in {@link MySqlParser#untilOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSqlGapsUntilOption(MySqlParser.SqlGapsUntilOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code userConnectionOption}
     * labeled alternative in {@link MySqlParser#connectionOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUserConnectionOption(MySqlParser.UserConnectionOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code passwordConnectionOption}
     * labeled alternative in {@link MySqlParser#connectionOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPasswordConnectionOption(MySqlParser.PasswordConnectionOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code defaultAuthConnectionOption}
     * labeled alternative in {@link MySqlParser#connectionOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDefaultAuthConnectionOption(MySqlParser.DefaultAuthConnectionOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code pluginDirConnectionOption}
     * labeled alternative in {@link MySqlParser#connectionOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPluginDirConnectionOption(MySqlParser.PluginDirConnectionOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#gtuidSet}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitGtuidSet(MySqlParser.GtuidSetContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#xaStartTransaction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitXaStartTransaction(MySqlParser.XaStartTransactionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#xaEndTransaction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitXaEndTransaction(MySqlParser.XaEndTransactionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#xaPrepareStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitXaPrepareStatement(MySqlParser.XaPrepareStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#xaCommitWork}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitXaCommitWork(MySqlParser.XaCommitWorkContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#xaRollbackWork}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitXaRollbackWork(MySqlParser.XaRollbackWorkContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#xaRecoverWork}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitXaRecoverWork(MySqlParser.XaRecoverWorkContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#prepareStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPrepareStatement(MySqlParser.PrepareStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#executeStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitExecuteStatement(MySqlParser.ExecuteStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#deallocatePrepare}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDeallocatePrepare(MySqlParser.DeallocatePrepareContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#routineBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRoutineBody(MySqlParser.RoutineBodyContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#blockStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitBlockStatement(MySqlParser.BlockStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#caseStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCaseStatement(MySqlParser.CaseStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#ifStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIfStatement(MySqlParser.IfStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#iterateStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIterateStatement(MySqlParser.IterateStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#leaveStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLeaveStatement(MySqlParser.LeaveStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#loopStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLoopStatement(MySqlParser.LoopStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#repeatStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRepeatStatement(MySqlParser.RepeatStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#returnStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitReturnStatement(MySqlParser.ReturnStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#whileStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitWhileStatement(MySqlParser.WhileStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code CloseCursor}
     * labeled alternative in {@link MySqlParser#cursorStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCloseCursor(MySqlParser.CloseCursorContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code FetchCursor}
     * labeled alternative in {@link MySqlParser#cursorStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitFetchCursor(MySqlParser.FetchCursorContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code OpenCursor}
     * labeled alternative in {@link MySqlParser#cursorStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitOpenCursor(MySqlParser.OpenCursorContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#declareVariable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDeclareVariable(MySqlParser.DeclareVariableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#declareCondition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDeclareCondition(MySqlParser.DeclareConditionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#declareCursor}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDeclareCursor(MySqlParser.DeclareCursorContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#declareHandler}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDeclareHandler(MySqlParser.DeclareHandlerContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code handlerConditionCode}
     * labeled alternative in {@link MySqlParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitHandlerConditionCode(MySqlParser.HandlerConditionCodeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code handlerConditionState}
     * labeled alternative in {@link MySqlParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitHandlerConditionState(MySqlParser.HandlerConditionStateContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code handlerConditionName}
     * labeled alternative in {@link MySqlParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitHandlerConditionName(MySqlParser.HandlerConditionNameContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code handlerConditionWarning}
     * labeled alternative in {@link MySqlParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitHandlerConditionWarning(MySqlParser.HandlerConditionWarningContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code handlerConditionNotfound}
     * labeled alternative in {@link MySqlParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitHandlerConditionNotfound(MySqlParser.HandlerConditionNotfoundContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code handlerConditionException}
     * labeled alternative in {@link MySqlParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitHandlerConditionException(MySqlParser.HandlerConditionExceptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#procedureSqlStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitProcedureSqlStatement(MySqlParser.ProcedureSqlStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#caseAlternative}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCaseAlternative(MySqlParser.CaseAlternativeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#elifAlternative}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitElifAlternative(MySqlParser.ElifAlternativeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterUserMysqlV56}
     * labeled alternative in {@link MySqlParser#alterUser}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterUserMysqlV56(MySqlParser.AlterUserMysqlV56Context ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code alterUserMysqlV57}
     * labeled alternative in {@link MySqlParser#alterUser}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAlterUserMysqlV57(MySqlParser.AlterUserMysqlV57Context ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code createUserMysqlV56}
     * labeled alternative in {@link MySqlParser#createUser}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCreateUserMysqlV56(MySqlParser.CreateUserMysqlV56Context ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code createUserMysqlV57}
     * labeled alternative in {@link MySqlParser#createUser}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCreateUserMysqlV57(MySqlParser.CreateUserMysqlV57Context ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#dropUser}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDropUser(MySqlParser.DropUserContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#grantStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitGrantStatement(MySqlParser.GrantStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#grantProxy}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitGrantProxy(MySqlParser.GrantProxyContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#renameUser}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRenameUser(MySqlParser.RenameUserContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code detailRevoke}
     * labeled alternative in {@link MySqlParser#revokeStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDetailRevoke(MySqlParser.DetailRevokeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code shortRevoke}
     * labeled alternative in {@link MySqlParser#revokeStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShortRevoke(MySqlParser.ShortRevokeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#revokeProxy}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRevokeProxy(MySqlParser.RevokeProxyContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#setPasswordStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSetPasswordStatement(MySqlParser.SetPasswordStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#userSpecification}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUserSpecification(MySqlParser.UserSpecificationContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code passwordAuthOption}
     * labeled alternative in {@link MySqlParser#userAuthOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPasswordAuthOption(MySqlParser.PasswordAuthOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code stringAuthOption}
     * labeled alternative in {@link MySqlParser#userAuthOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitStringAuthOption(MySqlParser.StringAuthOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code hashAuthOption}
     * labeled alternative in {@link MySqlParser#userAuthOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitHashAuthOption(MySqlParser.HashAuthOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code simpleAuthOption}
     * labeled alternative in {@link MySqlParser#userAuthOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSimpleAuthOption(MySqlParser.SimpleAuthOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#tlsOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTlsOption(MySqlParser.TlsOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#userResourceOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUserResourceOption(MySqlParser.UserResourceOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#userPasswordOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUserPasswordOption(MySqlParser.UserPasswordOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#userLockOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUserLockOption(MySqlParser.UserLockOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#privelegeClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPrivelegeClause(MySqlParser.PrivelegeClauseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#privilege}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPrivilege(MySqlParser.PrivilegeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code currentSchemaPriviLevel}
     * labeled alternative in {@link MySqlParser#privilegeLevel}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCurrentSchemaPriviLevel(MySqlParser.CurrentSchemaPriviLevelContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code globalPrivLevel}
     * labeled alternative in {@link MySqlParser#privilegeLevel}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitGlobalPrivLevel(MySqlParser.GlobalPrivLevelContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code definiteSchemaPrivLevel}
     * labeled alternative in {@link MySqlParser#privilegeLevel}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDefiniteSchemaPrivLevel(MySqlParser.DefiniteSchemaPrivLevelContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code definiteFullTablePrivLevel}
     * labeled alternative in {@link MySqlParser#privilegeLevel}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDefiniteFullTablePrivLevel(MySqlParser.DefiniteFullTablePrivLevelContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code definiteFullTablePrivLevel2}
     * labeled alternative in {@link MySqlParser#privilegeLevel}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDefiniteFullTablePrivLevel2(MySqlParser.DefiniteFullTablePrivLevel2Context ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code definiteTablePrivLevel}
     * labeled alternative in {@link MySqlParser#privilegeLevel}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDefiniteTablePrivLevel(MySqlParser.DefiniteTablePrivLevelContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#renameUserClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRenameUserClause(MySqlParser.RenameUserClauseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#analyzeTable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAnalyzeTable(MySqlParser.AnalyzeTableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#checkTable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCheckTable(MySqlParser.CheckTableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#checksumTable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitChecksumTable(MySqlParser.ChecksumTableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#optimizeTable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitOptimizeTable(MySqlParser.OptimizeTableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#repairTable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRepairTable(MySqlParser.RepairTableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#checkTableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCheckTableOption(MySqlParser.CheckTableOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#createUdfunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCreateUdfunction(MySqlParser.CreateUdfunctionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#installPlugin}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitInstallPlugin(MySqlParser.InstallPluginContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#uninstallPlugin}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUninstallPlugin(MySqlParser.UninstallPluginContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code setVariable}
     * labeled alternative in {@link MySqlParser#setStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSetVariable(MySqlParser.SetVariableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code setCharset}
     * labeled alternative in {@link MySqlParser#setStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSetCharset(MySqlParser.SetCharsetContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code setNames}
     * labeled alternative in {@link MySqlParser#setStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSetNames(MySqlParser.SetNamesContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code setPassword}
     * labeled alternative in {@link MySqlParser#setStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSetPassword(MySqlParser.SetPasswordContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code setTransaction}
     * labeled alternative in {@link MySqlParser#setStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSetTransaction(MySqlParser.SetTransactionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code setAutocommit}
     * labeled alternative in {@link MySqlParser#setStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSetAutocommit(MySqlParser.SetAutocommitContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code setNewValueInsideTrigger}
     * labeled alternative in {@link MySqlParser#setStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSetNewValueInsideTrigger(MySqlParser.SetNewValueInsideTriggerContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showMasterLogs}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowMasterLogs(MySqlParser.ShowMasterLogsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showLogEvents}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowLogEvents(MySqlParser.ShowLogEventsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showObjectFilter}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowObjectFilter(MySqlParser.ShowObjectFilterContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showColumns}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowColumns(MySqlParser.ShowColumnsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showCreateDb}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowCreateDb(MySqlParser.ShowCreateDbContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showCreateFullIdObject}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowCreateFullIdObject(MySqlParser.ShowCreateFullIdObjectContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showCreateUser}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowCreateUser(MySqlParser.ShowCreateUserContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showEngine}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowEngine(MySqlParser.ShowEngineContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showGlobalInfo}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowGlobalInfo(MySqlParser.ShowGlobalInfoContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showErrors}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowErrors(MySqlParser.ShowErrorsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showCountErrors}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowCountErrors(MySqlParser.ShowCountErrorsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showSchemaFilter}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowSchemaFilter(MySqlParser.ShowSchemaFilterContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showRoutine}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowRoutine(MySqlParser.ShowRoutineContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showGrants}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowGrants(MySqlParser.ShowGrantsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showIndexes}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowIndexes(MySqlParser.ShowIndexesContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showOpenTables}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowOpenTables(MySqlParser.ShowOpenTablesContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showProfile}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowProfile(MySqlParser.ShowProfileContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code showSlaveStatus}
     * labeled alternative in {@link MySqlParser#showStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowSlaveStatus(MySqlParser.ShowSlaveStatusContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#variableClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitVariableClause(MySqlParser.VariableClauseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#showCommonEntity}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowCommonEntity(MySqlParser.ShowCommonEntityContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#showFilter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowFilter(MySqlParser.ShowFilterContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#showGlobalInfoClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowGlobalInfoClause(MySqlParser.ShowGlobalInfoClauseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#showSchemaEntity}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowSchemaEntity(MySqlParser.ShowSchemaEntityContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#showProfileType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShowProfileType(MySqlParser.ShowProfileTypeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#binlogStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitBinlogStatement(MySqlParser.BinlogStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#cacheIndexStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCacheIndexStatement(MySqlParser.CacheIndexStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#flushStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitFlushStatement(MySqlParser.FlushStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#killStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitKillStatement(MySqlParser.KillStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#loadIndexIntoCache}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLoadIndexIntoCache(MySqlParser.LoadIndexIntoCacheContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#resetStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitResetStatement(MySqlParser.ResetStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#shutdownStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitShutdownStatement(MySqlParser.ShutdownStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#tableIndexes}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableIndexes(MySqlParser.TableIndexesContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code simpleFlushOption}
     * labeled alternative in {@link MySqlParser#flushOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSimpleFlushOption(MySqlParser.SimpleFlushOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code channelFlushOption}
     * labeled alternative in {@link MySqlParser#flushOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitChannelFlushOption(MySqlParser.ChannelFlushOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code tableFlushOption}
     * labeled alternative in {@link MySqlParser#flushOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableFlushOption(MySqlParser.TableFlushOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#flushTableOption}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitFlushTableOption(MySqlParser.FlushTableOptionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#loadedTableIndexes}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLoadedTableIndexes(MySqlParser.LoadedTableIndexesContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#simpleDescribeStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSimpleDescribeStatement(MySqlParser.SimpleDescribeStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#fullDescribeStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitFullDescribeStatement(MySqlParser.FullDescribeStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#helpStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitHelpStatement(MySqlParser.HelpStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#useStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUseStatement(MySqlParser.UseStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code describeStatements}
     * labeled alternative in {@link MySqlParser#describeObjectClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDescribeStatements(MySqlParser.DescribeStatementsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code describeConnection}
     * labeled alternative in {@link MySqlParser#describeObjectClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDescribeConnection(MySqlParser.DescribeConnectionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#fullId}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitFullId(MySqlParser.FullIdContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#tableName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTableName(MySqlParser.TableNameContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#fullColumnName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitFullColumnName(MySqlParser.FullColumnNameContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#indexColumnName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIndexColumnName(MySqlParser.IndexColumnNameContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#userName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUserName(MySqlParser.UserNameContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#mysqlVariable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitMysqlVariable(MySqlParser.MysqlVariableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#charsetName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCharsetName(MySqlParser.CharsetNameContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#collationName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCollationName(MySqlParser.CollationNameContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#engineName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitEngineName(MySqlParser.EngineNameContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#uuidSet}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUuidSet(MySqlParser.UuidSetContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#xid}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitXid(MySqlParser.XidContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#xuidStringId}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitXuidStringId(MySqlParser.XuidStringIdContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#authPlugin}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAuthPlugin(MySqlParser.AuthPluginContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#uid}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUid(MySqlParser.UidContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#simpleId}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSimpleId(MySqlParser.SimpleIdContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#dottedId}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDottedId(MySqlParser.DottedIdContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#decimalLiteral}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDecimalLiteral(MySqlParser.DecimalLiteralContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#fileSizeLiteral}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitFileSizeLiteral(MySqlParser.FileSizeLiteralContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#stringLiteral}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitStringLiteral(MySqlParser.StringLiteralContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#booleanLiteral}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitBooleanLiteral(MySqlParser.BooleanLiteralContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#hexadecimalLiteral}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitHexadecimalLiteral(MySqlParser.HexadecimalLiteralContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#nullNotnull}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitNullNotnull(MySqlParser.NullNotnullContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitConstant(MySqlParser.ConstantContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code stringDataType}
     * labeled alternative in {@link MySqlParser#dataType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitStringDataType(MySqlParser.StringDataTypeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code nationalStringDataType}
     * labeled alternative in {@link MySqlParser#dataType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitNationalStringDataType(MySqlParser.NationalStringDataTypeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code nationalVaryingStringDataType}
     * labeled alternative in {@link MySqlParser#dataType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitNationalVaryingStringDataType(MySqlParser.NationalVaryingStringDataTypeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code dimensionDataType}
     * labeled alternative in {@link MySqlParser#dataType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDimensionDataType(MySqlParser.DimensionDataTypeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code simpleDataType}
     * labeled alternative in {@link MySqlParser#dataType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSimpleDataType(MySqlParser.SimpleDataTypeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code collectionDataType}
     * labeled alternative in {@link MySqlParser#dataType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCollectionDataType(MySqlParser.CollectionDataTypeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code spatialDataType}
     * labeled alternative in {@link MySqlParser#dataType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSpatialDataType(MySqlParser.SpatialDataTypeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#collectionOptions}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCollectionOptions(MySqlParser.CollectionOptionsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#convertedDataType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitConvertedDataType(MySqlParser.ConvertedDataTypeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#lengthOneDimension}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLengthOneDimension(MySqlParser.LengthOneDimensionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#lengthTwoDimension}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLengthTwoDimension(MySqlParser.LengthTwoDimensionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#lengthTwoOptionalDimension}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLengthTwoOptionalDimension(MySqlParser.LengthTwoOptionalDimensionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#uidList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUidList(MySqlParser.UidListContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#tables}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTables(MySqlParser.TablesContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#indexColumnNames}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIndexColumnNames(MySqlParser.IndexColumnNamesContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#expressions}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitExpressions(MySqlParser.ExpressionsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#expressionsWithDefaults}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitExpressionsWithDefaults(MySqlParser.ExpressionsWithDefaultsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#constants}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitConstants(MySqlParser.ConstantsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#simpleStrings}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSimpleStrings(MySqlParser.SimpleStringsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#userVariables}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUserVariables(MySqlParser.UserVariablesContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#defaultValue}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDefaultValue(MySqlParser.DefaultValueContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#currentTimestamp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCurrentTimestamp(MySqlParser.CurrentTimestampContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#expressionOrDefault}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitExpressionOrDefault(MySqlParser.ExpressionOrDefaultContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#ifExists}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIfExists(MySqlParser.IfExistsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#ifNotExists}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIfNotExists(MySqlParser.IfNotExistsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code specificFunctionCall}
     * labeled alternative in {@link MySqlParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSpecificFunctionCall(MySqlParser.SpecificFunctionCallContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code aggregateFunctionCall}
     * labeled alternative in {@link MySqlParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAggregateFunctionCall(MySqlParser.AggregateFunctionCallContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code scalarFunctionCall}
     * labeled alternative in {@link MySqlParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitScalarFunctionCall(MySqlParser.ScalarFunctionCallContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code udfFunctionCall}
     * labeled alternative in {@link MySqlParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUdfFunctionCall(MySqlParser.UdfFunctionCallContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code passwordFunctionCall}
     * labeled alternative in {@link MySqlParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPasswordFunctionCall(MySqlParser.PasswordFunctionCallContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code simpleFunctionCall}
     * labeled alternative in {@link MySqlParser#specificFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSimpleFunctionCall(MySqlParser.SimpleFunctionCallContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code dataTypeFunctionCall}
     * labeled alternative in {@link MySqlParser#specificFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDataTypeFunctionCall(MySqlParser.DataTypeFunctionCallContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code valuesFunctionCall}
     * labeled alternative in {@link MySqlParser#specificFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitValuesFunctionCall(MySqlParser.ValuesFunctionCallContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code caseFunctionCall}
     * labeled alternative in {@link MySqlParser#specificFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCaseFunctionCall(MySqlParser.CaseFunctionCallContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code charFunctionCall}
     * labeled alternative in {@link MySqlParser#specificFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCharFunctionCall(MySqlParser.CharFunctionCallContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code positionFunctionCall}
     * labeled alternative in {@link MySqlParser#specificFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPositionFunctionCall(MySqlParser.PositionFunctionCallContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code substrFunctionCall}
     * labeled alternative in {@link MySqlParser#specificFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSubstrFunctionCall(MySqlParser.SubstrFunctionCallContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code trimFunctionCall}
     * labeled alternative in {@link MySqlParser#specificFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTrimFunctionCall(MySqlParser.TrimFunctionCallContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code weightFunctionCall}
     * labeled alternative in {@link MySqlParser#specificFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitWeightFunctionCall(MySqlParser.WeightFunctionCallContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code extractFunctionCall}
     * labeled alternative in {@link MySqlParser#specificFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitExtractFunctionCall(MySqlParser.ExtractFunctionCallContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code getFormatFunctionCall}
     * labeled alternative in {@link MySqlParser#specificFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitGetFormatFunctionCall(MySqlParser.GetFormatFunctionCallContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#caseFuncAlternative}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCaseFuncAlternative(MySqlParser.CaseFuncAlternativeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code levelWeightList}
     * labeled alternative in {@link MySqlParser#levelsInWeightString}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLevelWeightList(MySqlParser.LevelWeightListContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code levelWeightRange}
     * labeled alternative in {@link MySqlParser#levelsInWeightString}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLevelWeightRange(MySqlParser.LevelWeightRangeContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#levelInWeightListElement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLevelInWeightListElement(MySqlParser.LevelInWeightListElementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#aggregateWindowedFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitAggregateWindowedFunction(MySqlParser.AggregateWindowedFunctionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#scalarFunctionName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitScalarFunctionName(MySqlParser.ScalarFunctionNameContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#passwordFunctionClause}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPasswordFunctionClause(MySqlParser.PasswordFunctionClauseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#functionArgs}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitFunctionArgs(MySqlParser.FunctionArgsContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#functionArg}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitFunctionArg(MySqlParser.FunctionArgContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code isExpression}
     * labeled alternative in {@link MySqlParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIsExpression(MySqlParser.IsExpressionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code notExpression}
     * labeled alternative in {@link MySqlParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitNotExpression(MySqlParser.NotExpressionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code logicalExpression}
     * labeled alternative in {@link MySqlParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLogicalExpression(MySqlParser.LogicalExpressionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code predicateExpression}
     * labeled alternative in {@link MySqlParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPredicateExpression(MySqlParser.PredicateExpressionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code soundsLikePredicate}
     * labeled alternative in {@link MySqlParser#predicate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSoundsLikePredicate(MySqlParser.SoundsLikePredicateContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code expressionAtomPredicate}
     * labeled alternative in {@link MySqlParser#predicate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitExpressionAtomPredicate(MySqlParser.ExpressionAtomPredicateContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code inPredicate}
     * labeled alternative in {@link MySqlParser#predicate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitInPredicate(MySqlParser.InPredicateContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code subqueryComparasionPredicate}
     * labeled alternative in {@link MySqlParser#predicate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSubqueryComparasionPredicate(MySqlParser.SubqueryComparasionPredicateContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code betweenPredicate}
     * labeled alternative in {@link MySqlParser#predicate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitBetweenPredicate(MySqlParser.BetweenPredicateContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code binaryComparasionPredicate}
     * labeled alternative in {@link MySqlParser#predicate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitBinaryComparasionPredicate(MySqlParser.BinaryComparasionPredicateContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code isNullPredicate}
     * labeled alternative in {@link MySqlParser#predicate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIsNullPredicate(MySqlParser.IsNullPredicateContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code likePredicate}
     * labeled alternative in {@link MySqlParser#predicate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLikePredicate(MySqlParser.LikePredicateContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code regexpPredicate}
     * labeled alternative in {@link MySqlParser#predicate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitRegexpPredicate(MySqlParser.RegexpPredicateContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code unaryExpressionAtom}
     * labeled alternative in {@link MySqlParser#expressionAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUnaryExpressionAtom(MySqlParser.UnaryExpressionAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code collateExpressionAtom}
     * labeled alternative in {@link MySqlParser#expressionAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCollateExpressionAtom(MySqlParser.CollateExpressionAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code subqueryExpessionAtom}
     * labeled alternative in {@link MySqlParser#expressionAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitSubqueryExpessionAtom(MySqlParser.SubqueryExpessionAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code mysqlVariableExpressionAtom}
     * labeled alternative in {@link MySqlParser#expressionAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitMysqlVariableExpressionAtom(MySqlParser.MysqlVariableExpressionAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code nestedExpressionAtom}
     * labeled alternative in {@link MySqlParser#expressionAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitNestedExpressionAtom(MySqlParser.NestedExpressionAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code nestedRowExpressionAtom}
     * labeled alternative in {@link MySqlParser#expressionAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitNestedRowExpressionAtom(MySqlParser.NestedRowExpressionAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code mathExpressionAtom}
     * labeled alternative in {@link MySqlParser#expressionAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitMathExpressionAtom(MySqlParser.MathExpressionAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code intervalExpressionAtom}
     * labeled alternative in {@link MySqlParser#expressionAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIntervalExpressionAtom(MySqlParser.IntervalExpressionAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code existsExpessionAtom}
     * labeled alternative in {@link MySqlParser#expressionAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitExistsExpessionAtom(MySqlParser.ExistsExpessionAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code constantExpressionAtom}
     * labeled alternative in {@link MySqlParser#expressionAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitConstantExpressionAtom(MySqlParser.ConstantExpressionAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code functionCallExpressionAtom}
     * labeled alternative in {@link MySqlParser#expressionAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitFunctionCallExpressionAtom(MySqlParser.FunctionCallExpressionAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code binaryExpressionAtom}
     * labeled alternative in {@link MySqlParser#expressionAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitBinaryExpressionAtom(MySqlParser.BinaryExpressionAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code fullColumnNameExpressionAtom}
     * labeled alternative in {@link MySqlParser#expressionAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitFullColumnNameExpressionAtom(MySqlParser.FullColumnNameExpressionAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code bitExpressionAtom}
     * labeled alternative in {@link MySqlParser#expressionAtom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitBitExpressionAtom(MySqlParser.BitExpressionAtomContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#unaryOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitUnaryOperator(MySqlParser.UnaryOperatorContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#comparisonOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitComparisonOperator(MySqlParser.ComparisonOperatorContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#logicalOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitLogicalOperator(MySqlParser.LogicalOperatorContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#bitOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitBitOperator(MySqlParser.BitOperatorContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#mathOperator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitMathOperator(MySqlParser.MathOperatorContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#charsetNameBase}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitCharsetNameBase(MySqlParser.CharsetNameBaseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#transactionLevelBase}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitTransactionLevelBase(MySqlParser.TransactionLevelBaseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#privilegesBase}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitPrivilegesBase(MySqlParser.PrivilegesBaseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#intervalTypeBase}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitIntervalTypeBase(MySqlParser.IntervalTypeBaseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#dataTypeBase}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitDataTypeBase(MySqlParser.DataTypeBaseContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#keywordsCanBeId}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitKeywordsCanBeId(MySqlParser.KeywordsCanBeIdContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link MySqlParser#functionNameBase}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    default T visitFunctionNameBase(MySqlParser.FunctionNameBaseContext ctx) {
        return null;
    }
}