package com.kosta.antlr.svet;
// Generated from svet.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link svetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface svetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link svetParser#svet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSvet(@NotNull svetParser.SvetContext ctx);

	/**
	 * Visit a parse tree produced by {@link svetParser#ToLamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToLamp(@NotNull svetParser.ToLampContext ctx);

	/**
	 * Visit a parse tree produced by {@link svetParser#ToAmount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToAmount(@NotNull svetParser.ToAmountContext ctx);

	/**
	 * Visit a parse tree produced by {@link svetParser#ToInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToInt(@NotNull svetParser.ToIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link svetParser#ToRab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToRab(@NotNull svetParser.ToRabContext ctx);

	/**
	 * Visit a parse tree produced by {@link svetParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(@NotNull svetParser.InputContext ctx);

	/**
	 * Visit a parse tree produced by {@link svetParser#ToN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToN(@NotNull svetParser.ToNContext ctx);

	/**
	 * Visit a parse tree produced by {@link svetParser#ToTel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToTel(@NotNull svetParser.ToTelContext ctx);

	/**
	 * Visit a parse tree produced by {@link svetParser#ToRub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToRub(@NotNull svetParser.ToRubContext ctx);

	/**
	 * Visit a parse tree produced by {@link svetParser#ToComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToComp(@NotNull svetParser.ToCompContext ctx);

	/**
	 * Visit a parse tree produced by {@link svetParser#ToRefrig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToRefrig(@NotNull svetParser.ToRefrigContext ctx);

	/**
	 * Visit a parse tree produced by {@link svetParser#ToKolVat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToKolVat(@NotNull svetParser.ToKolVatContext ctx);

	/**
	 * Visit a parse tree produced by {@link svetParser#ToDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToDouble(@NotNull svetParser.ToDoubleContext ctx);
}