// Generated from Traductor.g4 by ANTLR 4.7.2
package com.example.traductor;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TraductorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TraductorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code cont}
	 * labeled alternative in {@link TraductorParser#calculadora}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCont(TraductorParser.ContContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#abrirll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbrirll(TraductorParser.AbrirllContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#numfloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumfloat(TraductorParser.NumfloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#numInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumInt(TraductorParser.NumIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#cll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCll(TraductorParser.CllContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#cabeza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabeza(TraductorParser.CabezaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numin}
	 * labeled alternative in {@link TraductorParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumin(TraductorParser.NuminContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numflot}
	 * labeled alternative in {@link TraductorParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumflot(TraductorParser.NumflotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracionFloat}
	 * labeled alternative in {@link TraductorParser#decla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionFloat(TraductorParser.DeclaracionFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracionInt}
	 * labeled alternative in {@link TraductorParser#decla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionInt(TraductorParser.DeclaracionIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asig}
	 * labeled alternative in {@link TraductorParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(TraductorParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impr}
	 * labeled alternative in {@link TraductorParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpr(TraductorParser.ImprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#contenido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenido(TraductorParser.ContenidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#condicionalIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalIf(TraductorParser.CondicionalIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#condicionalelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalelse(TraductorParser.CondicionalelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#condicionalelseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalelseif(TraductorParser.CondicionalelseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#condicionalfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalfor(TraductorParser.CondicionalforContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condic}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondic(TraductorParser.CondicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andyor}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndyor(TraductorParser.AndyorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(TraductorParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(TraductorParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(TraductorParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayMenig}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayMenig(TraductorParser.MayMenigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code difIg}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifIg(TraductorParser.DifIgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayMen}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayMen(TraductorParser.MayMenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code poten}
	 * labeled alternative in {@link TraductorParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoten(TraductorParser.PotenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link TraductorParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(TraductorParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code suMRes}
	 * labeled alternative in {@link TraductorParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuMRes(TraductorParser.SuMResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link TraductorParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(TraductorParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link TraductorParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(TraductorParser.MulDivContext ctx);
}