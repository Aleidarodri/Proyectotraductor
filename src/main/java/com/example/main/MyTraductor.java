package com.example.main;

import com.example.traductor.TraductorBaseVisitor;
import com.example.traductor.TraductorParser;

public class MyTraductor extends TraductorBaseVisitor<String> {

    @Override public String visitNumfloat(TraductorParser.NumfloatContext ctx) {
        HelloController.traducir("flotteur "+ctx.ID().getText()+";");
        return visitChildren(ctx);
    }
    @Override public String visitNumInt(TraductorParser.NumIntContext ctx) {
        HelloController.traducir("entier "+ctx.ID().getText()+";");
        return visitChildren(ctx);
    }
    @Override public String visitNumin(TraductorParser.NuminContext ctx) {
        visit(ctx.numInt());
        return null; }
    @Override public String visitNumflot(TraductorParser.NumflotContext ctx) {
        visit(ctx.numfloat());
        return null; }
    @Override public String visitCabeza(TraductorParser.CabezaContext ctx) {
        HelloController.traducir("annuler principale () {");
        return visitChildren(ctx);
    }
    @Override public String visitAsig(TraductorParser.AsigContext ctx) {
        HelloController.traducir(ctx.ID().getText()+" = "+visit(ctx.express())+";");
        return visitChildren(ctx);
    }
    @Override public String visitImpr(TraductorParser.ImprContext ctx) {
        if(ctx.express()!= null)
        {
            HelloController.traducir("imprimer ("+visit(ctx.express())+");");
        }
        else {
            HelloController.traducir("imprimer ("+ctx.STRING().getText()+");");
        }
        return null;
    }
    @Override public String visitPoten(TraductorParser.PotenContext ctx) {
        return visit(ctx.express())+"^"+ctx.NUM().getText();
    }
    @Override public String visitNum(TraductorParser.NumContext ctx) {
        return ctx.NUM().getText(); }
    @Override public String visitSuMRes(TraductorParser.SuMResContext ctx) {
        return visit(ctx.express(0))+ctx.op.getText()+visit(ctx.express(1));
    }
    @Override public String visitId(TraductorParser.IdContext ctx) {
        return ctx.ID().getText(); }
    @Override public String visitMulDiv(TraductorParser.MulDivContext ctx) {
        return visit(ctx.express(0))+ctx.op.getText()+visit(ctx.express(1));
    }
    @Override public String visitDeclaracionFloat(TraductorParser.DeclaracionFloatContext ctx) {
        HelloController.traducir("flotteur "+ctx.ID().getText()+" = "+visit(ctx.express())+";");
        return visitChildren(ctx); }
    @Override public String visitDeclaracionInt(TraductorParser.DeclaracionIntContext ctx) {
        HelloController.traducir("entier "+ctx.ID().getText()+" = "+visit(ctx.express())+";");
        return visitChildren(ctx);}
    @Override public String visitCondicionalIf(TraductorParser.CondicionalIfContext ctx) {
        HelloController.traducir("if ("+visit(ctx.condicion())+") {");
        visit(ctx.contenido());
        HelloController.traducir("}");

        if(ctx.condicionalelseif()!=null){
            for (TraductorParser.CondicionalelseifContext c : ctx.condicionalelseif()) {
                visit(c);
            }
        }
        if(ctx.condicionalelse()!=null){
            visit(ctx.condicionalelse());
            ;
        }

        return null;

    }
    @Override public String visitMayMen(TraductorParser.MayMenContext ctx) {
        return visit(ctx.express(0))+ctx.co.getText()+visit(ctx.express(1)); }

    @Override public String visitMayMenig(TraductorParser.MayMenigContext ctx) {
        return visit(ctx.express(0))+ctx.co.getText()+visit(ctx.express(1));
    }

    @Override public String visitDifIg(TraductorParser.DifIgContext ctx) {
        return visit(ctx.express(0))+ctx.co.getText()+visit(ctx.express(1));
    }
    @Override public String  visitCondicionalelse(TraductorParser.CondicionalelseContext ctx) {
        HelloController.traducir("else  {");
        visit(ctx.contenido());
        HelloController.traducir("}");
        return null;

    }
    @Override public String  visitCondicionalelseif(TraductorParser.CondicionalelseifContext ctx) {
        HelloController.traducir("else if ("+visit(ctx.condicion())+") {");
        visit(ctx.contenido());
        HelloController.traducir("}");
        return null; }
    @Override public String visitTrue(TraductorParser.TrueContext ctx) {
        return "true"; }
    @Override public String visitFalse(TraductorParser.FalseContext ctx) {
        return "false"; }
    @Override public String visitCondicionalfor(TraductorParser.CondicionalforContext ctx) {

        if (ctx.INT()== null) {
            HelloController.traducir(" for (" + ctx.ID(0).getText() + "=" + visit(ctx.express())+ ";"+ visit(ctx.condicion()) + ";" + ctx.ID(1).getText() + ctx.op.getText() + "){");
        }
        else {
            HelloController.traducir(" for (" + "entier " + ctx.ID(0).getText() + "=" + visit(ctx.express())+ ";" + visit(ctx.condicion()) + ";" + ctx.ID(1).getText() + ctx.op.getText() + "){");
        }
        visit(ctx.contenido());
        HelloController.traducir("}");

        return null ;}

    @Override public String visitAndyor(TraductorParser.AndyorContext ctx) {
        return  visit(ctx.condicion(0))+ctx.co.getText()+visit(ctx.condicion(1));
    }

   @Override public String visitCondic(TraductorParser.CondicContext ctx) {

   return "("+visit(ctx.condicion())+")";
    }

    @Override public String visitVariable(TraductorParser.VariableContext ctx)
    {
        return ctx.ID().getText();

    }






}

