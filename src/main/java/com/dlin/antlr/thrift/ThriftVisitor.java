// Generated from /Users/wangxiandui/Documents/Codes/coder-plus/src/main/resources/g4/Thrift.g4 by ANTLR 4.8
package com.dlin.antlr.thrift;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ThriftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ThriftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ThriftParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(ThriftParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(ThriftParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(ThriftParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(ThriftParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#cpp_include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_include(ThriftParser.Cpp_includeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(ThriftParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#const_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_rule(ThriftParser.Const_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#typedef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef(ThriftParser.TypedefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#enum_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_rule(ThriftParser.Enum_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#enum_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_field(ThriftParser.Enum_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#senum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenum(ThriftParser.SenumContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(ThriftParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(ThriftParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#exception}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException(ThriftParser.ExceptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService(ThriftParser.ServiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(ThriftParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#field_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_id(ThriftParser.Field_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#field_req}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_req(ThriftParser.Field_reqContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ThriftParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#oneway}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneway(ThriftParser.OnewayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_type(ThriftParser.Function_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#throws_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_list(ThriftParser.Throws_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#type_annotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_annotations(ThriftParser.Type_annotationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_annotation(ThriftParser.Type_annotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#annotation_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation_value(ThriftParser.Annotation_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#field_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_type(ThriftParser.Field_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#base_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type(ThriftParser.Base_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#container_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_type(ThriftParser.Container_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#map_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_type(ThriftParser.Map_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#set_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_type(ThriftParser.Set_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#list_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_type(ThriftParser.List_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#cpp_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_type(ThriftParser.Cpp_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#const_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_value(ThriftParser.Const_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(ThriftParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#const_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_list(ThriftParser.Const_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#const_map_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_map_entry(ThriftParser.Const_map_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#const_map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_map(ThriftParser.Const_mapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#list_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_separator(ThriftParser.List_separatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ThriftParser#real_base_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_base_type(ThriftParser.Real_base_typeContext ctx);
}