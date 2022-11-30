package com.example.main;

import com.example.parser.GramaticaBaseVisitor;
import com.example.parser.GramaticaParser;

public class Verificar  extends GramaticaBaseVisitor {


    Mapitas mapita = new Mapitas(null) ;

    @Override
    public Double visitAller(GramaticaParser.AllerContext ctx) throws Exception {

        return mapita.regresar(ctx.ALLER().getText());
    }
    @Override
    public Double visitMission(GramaticaParser.MissionContext ctx) throws Exception {
        {
            String aller = ctx.ALLER().getText();
            double valeurs = (double) visit(ctx.express());

            if (mapita.declarada(aller)) {     //containsKey =declarada
                mapita.asignar(aller, valeurs);   // replace =asignar
            } else {
                throw new Exception("Variable no declarada:" + aller);
            }
            return null;
        }
    }
    @Override
    public Double visitNumflotteur(GramaticaParser.NumflotteurContext ctx) throws Exception {
        String aller = ctx.ALLER().getText();
        //  Double valeurs = visit(ctx.express());
        if (!mapita.declarada(aller)) {  //containsKey =declarada
            mapita.nuevadeclarada(aller);     // put = nueva declarada
        } else {
            throw new Exception("Variable repetida:"+aller);
        }
        return null;
    }

    @Override
    public Double visitNumentier(GramaticaParser.NumentierContext ctx) throws Exception {
        String aller = ctx.ALLER().getText();
        System.out.println("ola");
        //  Double valeurs = visit(ctx.express());
        if (!mapita.declarada(aller)) {  //containsKey =declarada
            mapita.nuevadeclarada(aller);     // put = nueva declarada
        } else {
            throw new Exception("Variable repetida:"+aller);
        }
        return null;
    }

    @Override public Double visitNumFlott(GramaticaParser.NumFlottContext ctx) {
        visit(ctx.numflotteur());
        return null;
    }

    @Override public Double visitNumEnt(GramaticaParser.NumEntContext ctx) {
        visit(ctx.numentier());
        return null; }

    @Override
    public Double visitImpr(GramaticaParser.ImprContext ctx) {

        visit(ctx.IMPRIMER());
        return null;

    }
    @Override
    public Double visitPoten(GramaticaParser.PotenContext ctx) {
        Double ex = (Double) visit(ctx.express());
        Double num = Double.valueOf(Integer.parseInt(ctx.NUM().getText()));

        return Math.pow(ex, num);
    }
    @Override
    public Double visitMulDiv(GramaticaParser.MulDivContext ctx) {
        double izq = (double) visit(ctx.express(0));
        double dere =(double) visit(ctx.express(1));
        // con el op se establece el limete de la operacion en este caso pues el div y el mul, con el text se optiene
        // la el "*"|"/" y con el equals se lo reconoce,en caso de ser igual se hace la operacion del mismo "*" "/" en
        //caso de que no se hace el return fue del if que es la operacion contraria al if
        if (ctx.op.getText().equals("*")) {
            return izq * dere;
        }
        return izq / dere;
    }
    @Override
    public Double visitSoMRes(GramaticaParser.SoMResContext ctx) {
        // con el op se establece el limete de la operacion en este caso pues el Sum y el res, con el text se optiene
        //  el "+""-" y con el equals se lo reconoce,en caso de ser igual se hace la operacion del mismo "+""-" en
        //caso de que no se hace el return fue del if que es la operacion contraria al if

        double izq = (double) visit(ctx.express(0));
        double dere = (double) visit(ctx.express(1));
        if (ctx.op.getText().equals("+")) {
            return izq + dere;
        }
        return izq - dere;
    }
    @Override public Double visitNum(GramaticaParser.NumContext ctx) {

        return Double.valueOf(ctx.NUM().getText());
    }
    @Override public Double visitDeclaracionFlou(GramaticaParser.DeclaracionFlouContext ctx) throws Exception {
        {
            String aller = ctx.ALLER().getText();
            Double valeurs = (double)visit(ctx.express());

            if (!mapita.declarada(aller)) {  //containsKey =declarada
                mapita.nuevadeclarada(aller); // replace =
                mapita.asignar(aller, valeurs);  // put = nueva declarada
            } else {
                throw new Exception("Variable no declarada:" + aller);
            }
            return null;
        }
    }
    @Override public Double visitDeclaracionEnt(GramaticaParser.DeclaracionEntContext ctx) throws Exception {
        {
            String aller = ctx.ALLER().getText();
            double valeurs = (double) visit(ctx.express());
            if (!mapita.declarada(aller)) {  //containsKey =declarada
                mapita.nuevadeclarada(aller);
                mapita.asignar(aller, valeurs);
            } else {
                throw new Exception("Variable no declarada:" + aller);
            }
            return null;
        } }

    @Override public Boolean visitConditionalIf(GramaticaParser.ConditionalIfContext ctx) {
        visit(ctx.condition());
        mapita = new Mapitas(mapita);
        visit(ctx.contenu());
        mapita = mapita.anterio;


        if (ctx.conditionalelseif()!=null){
            for (GramaticaParser.ConditionalelseifContext c: ctx.conditionalelseif()) {
                boolean condicion = (boolean)visit(c);
                if (condicion){
                    return null;
                }
            }
        }
        if(ctx.conditionalelse()!=null){
            visit(ctx.conditionalelse());
        }
        return true;
        }



    @Override public Boolean visitMayMen(GramaticaParser.MayMenContext ctx) {
        double izq = (double) visit(ctx.express(0));
        double dere = (double) visit(ctx.express(1));
        if (ctx.co.getText().equals("<")) {
            return izq < dere;
        }
        return izq > dere;}

    @Override public Boolean visitMayMenig(GramaticaParser.MayMenigContext ctx) {
        double izq = (double) visit(ctx.express(0));
        double dere = (double) visit(ctx.express(1));
        if (ctx.co.getText().equals("<=")) {
            return izq <= dere;
        }
        return izq >= dere;}

    @Override public Boolean visitDifIg(GramaticaParser.DifIgContext ctx) {
        double izq = (double) visit(ctx.express(0));
        double dere = (double) visit(ctx.express(1));
        if (ctx.co.getText().equals("==")) {
            return izq == dere;
        }
        return izq != dere;}

    @Override public Boolean visitConditionalelse(GramaticaParser.ConditionalelseContext ctx) {
        mapita = new Mapitas(mapita);
        visit(ctx.contenu());
        mapita = mapita.anterio;
        return null; }


    @Override public Boolean visitConditionalelseif(GramaticaParser.ConditionalelseifContext ctx) {

         visit(ctx.condition());
            mapita = new Mapitas(mapita);
            visit(ctx.contenu());
            mapita = mapita.anterio;
            return true;
    }

    @Override public Boolean visitTrue(GramaticaParser.TrueContext ctx) {

        return true; }

    @Override public Boolean visitFlase(GramaticaParser.FlaseContext ctx) {

        return false; }

    @Override public Boolean visitCondicionalfor(GramaticaParser.CondicionalforContext ctx) throws Exception {

        if(ctx.decla()!=null) {
            visit(ctx.decla());
        }
        else {
            visit(ctx.asignation());
        }
        visit(ctx.condition());
        visit(ctx.incremento());
        mapita = new Mapitas(mapita);
        visit(ctx.contenu());
        mapita = mapita.anterio;
        return null;
    }


    @Override public Boolean visitAndyor(GramaticaParser.AndyorContext ctx) {

        boolean izq = (boolean) visit(ctx.condition(0));
        boolean dere = (boolean) visit(ctx.condition(1));
        if (ctx.co.getText().equals("&&")) {
            return izq && dere;
        } else {
            return izq || dere;
        }
    }


    @Override public Boolean visitCondicion(GramaticaParser.CondicionContext ctx) {
        return (boolean) visit(ctx.condition()); }

    @Override
    public Double visitId(GramaticaParser.IdContext ctx) throws Exception{
        visit(ctx.ALLER());
        return null;
    }

    @Override public String visitIncremento(GramaticaParser.IncrementoContext ctx) throws Exception {
        mapita.regresar(ctx.ALLER().getText());
        return null;
    }

}