package com.example.main;

import com.example.parser.GramaticaBaseVisitor;
import com.example.parser.GramaticaParser;

public class MyTraductorC  extends GramaticaBaseVisitor<String> {

    @Override
    public String visitNumflotteur(GramaticaParser.NumflotteurContext ctx) {

        HelloController.lenguaje("float " + ctx.ALLER().getText() + ";");
        return visitChildren(ctx);
    }

    @Override
    public String visitNumentier(GramaticaParser.NumentierContext ctx) {
        HelloController.lenguaje("int " + ctx.ALLER().getText() + ";");
        return visitChildren(ctx);
    }

    @Override
    public String visitTete(GramaticaParser.TeteContext ctx) {
        HelloController.lenguaje("void main () {");
        return visitChildren(ctx);
    }

    @Override
    public String visitSoMRes(GramaticaParser.SoMResContext ctx) {
        return visit(ctx.express(0)) + ctx.op.getText() + visit(ctx.express(1));
    }

    @Override
    public String visitMission(GramaticaParser.MissionContext ctx) {
        HelloController.lenguaje(ctx.ALLER().getText() + " = " + visit(ctx.express()) + ";");
        return visitChildren(ctx);
    }

    @Override
    public String visitImpr(GramaticaParser.ImprContext ctx) {

        if (ctx.express() != null) {
            HelloController.lenguaje("printf (" + visit(ctx.express()) + ");");
        } else {
            HelloController.lenguaje("printf (" + ctx.STRING().getText() + ");");
        }

        return null;
    }

    @Override
    public String visitPoten(GramaticaParser.PotenContext ctx) {
        return visit(ctx.express()) + "^" + ctx.NUM().getText();
    }

    @Override
    public String visitNum(GramaticaParser.NumContext ctx) {
        return ctx.NUM().getText();
    }

    @Override
    public String visitAller(GramaticaParser.AllerContext ctx) {

        return ctx.ALLER().getText();
    }

    @Override
    public String visitMulDiv(GramaticaParser.MulDivContext ctx) {
        return visit(ctx.express(0)) + ctx.op.getText() + visit(ctx.express(1));
    }

    @Override
    public String visitDeclaracionFlou(GramaticaParser.DeclaracionFlouContext ctx) {
        HelloController.lenguaje("float " + ctx.ALLER().getText() + " = " + visit(ctx.express()) + ";");
        return visitChildren(ctx);
    }


    @Override
    public String visitDeclaracionEnt(GramaticaParser.DeclaracionEntContext ctx) {
        HelloController.lenguaje("int " + ctx.ALLER().getText() + " = " + visit(ctx.express()) + ";");
        return visitChildren(ctx);
    }

    @Override
    public String visitConditionalIf(GramaticaParser.ConditionalIfContext ctx) {
        HelloController.lenguaje("if (" + visit(ctx.condition()) + ") {");
        visit(ctx.contenu());
        HelloController.lenguaje("}");

        if (ctx.conditionalelseif() != null) {
            for (GramaticaParser.ConditionalelseifContext c : ctx.conditionalelseif()) {
                visit(c);
            }
        }
        if (ctx.conditionalelse() != null) {
            visit(ctx.conditionalelse());
            ;
        }

        return null;

    }

    @Override
    public String visitMayMen(GramaticaParser.MayMenContext ctx) {
        return visit(ctx.express(0)) + ctx.co.getText() + visit(ctx.express(1));
    }

    @Override
    public String visitMayMenig(GramaticaParser.MayMenigContext ctx) {
        return visit(ctx.express(0)) + ctx.co.getText() + visit(ctx.express(1));
    }

    @Override
    public String visitDifIg(GramaticaParser.DifIgContext ctx) {
        return visit(ctx.express(0)) + ctx.co.getText() + visit(ctx.express(1));
    }

    @Override
    public String visitConditionalelse(GramaticaParser.ConditionalelseContext ctx) {
        HelloController.lenguaje("else  {");
        visit(ctx.contenu());
        HelloController.lenguaje("}");
        return null;

    }

    @Override
    public String visitConditionalelseif(GramaticaParser.ConditionalelseifContext ctx) {

        HelloController.lenguaje(" else if (" + visit(ctx.condition()) + ") {");
        visit(ctx.contenu());
        HelloController.lenguaje("}");
        return null;
    }

    @Override
    public String visitTrue(GramaticaParser.TrueContext ctx) {

        return "true";
    }

    @Override
    public String visitFlase(GramaticaParser.FlaseContext ctx) {

        return "false";
    }

    @Override
    public String visitCondicionalfor(GramaticaParser.CondicionalforContext ctx) {


        if (ctx.asignation()!= null) {
            HelloController.lenguaje(" for (" + ctx.asignation().getText() + visit(ctx.condition()) + ";" +visit(ctx.incremento()) + "){");
            visit(ctx.contenu());
            HelloController.lenguaje("}");
        } else {
            HelloController.lenguaje(" for (" + ctx.decla().getText() + visit(ctx.condition()) + ";" + visit(ctx.incremento().ALLER()) +"){");
            visit(ctx.contenu());
            HelloController.lenguaje("}");
        }

        return null;
    }


    @Override
    public String visitAndyor(GramaticaParser.AndyorContext ctx) {
        return visit(ctx.condition(0)) + ctx.co.getText() + visit(ctx.condition(1));


    }

    @Override
    public String visitCondicion(GramaticaParser.CondicionContext ctx) {

        return "("+visit(ctx.condition())+")";
    }

    @Override public String visitId(GramaticaParser.IdContext ctx)
    {
        return ctx.ALLER().getText(); }

    @Override public String visitIncremento(GramaticaParser.IncrementoContext ctx) {
        return ctx.ALLER().getText() +"++";
    }
}





