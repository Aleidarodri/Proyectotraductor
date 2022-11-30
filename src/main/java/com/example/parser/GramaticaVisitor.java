// Generated from Gramatica.g4 by ANTLR 4.7.2
package com.example.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code cont}
	 * labeled alternative in {@link GramaticaParser#calculatrice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCont(GramaticaParser.ContContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ouver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuver(GramaticaParser.OuverContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#numflotteur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumflotteur(GramaticaParser.NumflotteurContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#numentier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumentier(GramaticaParser.NumentierContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#fermet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFermet(GramaticaParser.FermetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#tete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTete(GramaticaParser.TeteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numFlott}
	 * labeled alternative in {@link GramaticaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumFlott(GramaticaParser.NumFlottContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numEnt}
	 * labeled alternative in {@link GramaticaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumEnt(GramaticaParser.NumEntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracionFlou}
	 * labeled alternative in {@link GramaticaParser#decla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionFlou(GramaticaParser.DeclaracionFlouContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by the {@code declaracionEnt}
	 * labeled alternative in {@link GramaticaParser#decla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionEnt(GramaticaParser.DeclaracionEntContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by the {@code mission}
	 * labeled alternative in {@link GramaticaParser#asignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMission(GramaticaParser.MissionContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by the {@code impr}
	 * labeled alternative in {@link GramaticaParser#imprimer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpr(GramaticaParser.ImprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#contenu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenu(GramaticaParser.ContenuContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#conditionalIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalIf(GramaticaParser.ConditionalIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#conditionalelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalelse(GramaticaParser.ConditionalelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#conditionalelseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalelseif(GramaticaParser.ConditionalelseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#condicionalfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalfor(GramaticaParser.CondicionalforContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by the {@code flase}
	 * labeled alternative in {@link GramaticaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlase(GramaticaParser.FlaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andyor}
	 * labeled alternative in {@link GramaticaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndyor(GramaticaParser.AndyorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link GramaticaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(GramaticaParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link GramaticaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(GramaticaParser.IdContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by the {@code mayMenig}
	 * labeled alternative in {@link GramaticaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayMenig(GramaticaParser.MayMenigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code difIg}
	 * labeled alternative in {@link GramaticaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifIg(GramaticaParser.DifIgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicion}
	 * labeled alternative in {@link GramaticaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(GramaticaParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayMen}
	 * labeled alternative in {@link GramaticaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayMen(GramaticaParser.MayMenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code poten}
	 * labeled alternative in {@link GramaticaParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoten(GramaticaParser.PotenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code soMRes}
	 * labeled alternative in {@link GramaticaParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoMRes(GramaticaParser.SoMResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link GramaticaParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(GramaticaParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aller}
	 * labeled alternative in {@link GramaticaParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAller(GramaticaParser.AllerContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link GramaticaParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(GramaticaParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(GramaticaParser.IncrementoContext ctx) throws Exception;
}