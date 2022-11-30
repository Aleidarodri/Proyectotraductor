package com.example.main;

import com.example.parser.GramaticaBaseVisitor;
import com.example.parser.GramaticaParser;

import java.util.ArrayList;




public class MyVisitor  extends GramaticaBaseVisitor {


    int contador=0;

    Mapitas mapita = new Mapitas(null);

    @Override public String visitTete(GramaticaParser.TeteContext ctx) {

        HelloController.añadir(".class public Hola \n .super java/lang/Object");
        HelloController.añadir(".method public static main([Ljava/lang/String;)V ");
        HelloController.añadir(".limit stack 10 \n"+".limit locals 10\n");
        //definir el numero de variables que puedes usar
        return null;
    }
     @Override
    public Double visitAller(GramaticaParser.AllerContext ctx) throws Exception {
        int pos = new ArrayList<String>(mapita.mapita.keySet()).indexOf(ctx.ALLER().getText());
         HelloController.añadir("iload "+pos+"\n");
        return mapita.regresar(ctx.ALLER().getText());
    }
    @Override
    public Double visitMission(GramaticaParser.MissionContext ctx) throws Exception {
        {
            String aller = ctx.ALLER().getText();
            double valeurs = (double) visit(ctx.express());
            if (mapita.declarada(aller)) {     //containsKey =declarada
                mapita.asignar(aller, valeurs);   // replace =asignar
                int pos = new ArrayList<String>(mapita.mapita.keySet()).indexOf(ctx.ALLER().getText());
                HelloController.añadir("istore "+pos);
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
        System.out.println("ola");
        visit(ctx.numentier());
        return null; }
    @Override
    public Double visitImpr(GramaticaParser.ImprContext ctx) {


        if(ctx.express()!= null)
        {
            HelloController.añadir( "getstatic java/lang/System/out Ljava/io/PrintStream;");
            visit(ctx.express());
            HelloController.añadir("invokevirtual java/io/PrintStream/println(I)V");
        }
        else {
            HelloController.añadir( "getstatic java/lang/System/out Ljava/io/PrintStream;");
            HelloController.añadir("ldc "+ctx.STRING().getText());
            HelloController.añadir("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");

        }
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
            HelloController.añadir("imul \n");
            return izq * dere;
        }
        HelloController.añadir("idiv \n");
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
            HelloController.añadir("iadd \n");
            return izq + dere;
        }
        HelloController.añadir("isub \n");
        return izq - dere;
    }
    @Override public Double visitNum(GramaticaParser.NumContext ctx) {
     /////aqui
        HelloController.añadir("bipush "+ctx.NUM().getText());
        return Double.valueOf(ctx.NUM().getText());
    }
    @Override public Double visitDeclaracionFlou(GramaticaParser.DeclaracionFlouContext ctx) throws Exception {
       //aquiiii
        {
            String aller = ctx.ALLER().getText();
            Double valeurs = (double)visit(ctx.express());

            if (!mapita.declarada(aller)) {  //containsKey =declarada
                mapita.nuevadeclarada(aller); // replace =nueva declarada
                mapita.asignar(aller, valeurs);  // put = asignar
                int pos = new ArrayList<String>(mapita.mapita.keySet()).indexOf(ctx.ALLER().getText());
                HelloController.añadir("fstore "+pos);

            } else {
                throw new Exception("Variable no declarada:" + aller);

            }



            return null;
        }
    }
    @Override public Double visitDeclaracionEnt(GramaticaParser.DeclaracionEntContext ctx) throws Exception {
        //aquiiiii

        {
            String aller = ctx.ALLER().getText();
            double valeurs = (double) visit(ctx.express());
            if (!mapita.declarada(aller)) {  //containsKey =declarada
                mapita.nuevadeclarada(aller);
                mapita.asignar(aller, valeurs);
                int pos = new ArrayList<String>(mapita.mapita.keySet()).indexOf(ctx.ALLER().getText());
                HelloController.añadir("istore "+pos);
            } else {
                throw new Exception("Variable no declarada:" + aller);
            }
            return null;
        } }

    @Override public Double visitConditionalIf(GramaticaParser.ConditionalIfContext ctx) {
    int actual=contador;


        HelloController controller = new HelloController();
        Boolean cond = (boolean) visit(ctx.condition());


        if (ctx.conditionalelse() != null) {
            visit(ctx.conditionalelse());
        } else {
            HelloController.añadir("goto resultado"+actual);
        }
        //si se cumple el if
        HelloController.añadir("label"+actual+":");
        contador++;
        visit(ctx.contenu());
        //para que no se cicle el if
        HelloController.añadir("resultado"+actual +":");



        return null;


     /*   if ((boolean) visit(ctx.condition())){

            mapita = new Mapitas(mapita);
            visit(ctx.contenu());

            mapita = mapita.anterio;
            return null;
        }
        else if(ctx.conditionalelseif()!=null){

            for (GramaticaParser.ConditionalelseifContext c : ctx.conditionalelseif()) {
                boolean cumplido = (boolean)visit(c);
                if(cumplido) {
                    return null;
                }
            }
        }
        if(ctx.conditionalelse()!=null){
            visit(ctx.conditionalelse());
            return null;
        }

        return null; */
    }

    @Override public Boolean visitMayMen(GramaticaParser.MayMenContext ctx) {

        double izq = (double) visit(ctx.express(0));
        double dere = (double) visit(ctx.express(1));
        if (ctx.co.getText().equals("<")) {
            HelloController.añadir("if_icmplt label"+contador);
            return izq < dere;
        }
        HelloController.añadir("if_icmpgt label"+contador);
        return izq > dere;}

    @Override public Boolean visitMayMenig(GramaticaParser.MayMenigContext ctx) {
        double izq = (double) visit(ctx.express(0));
        double dere = (double) visit(ctx.express(1));
        if (ctx.co.getText().equals("<=")) {
            HelloController.añadir("if_icmple label"+contador);
            return izq <= dere;
        }
        HelloController.añadir("if_icmpge label"+contador);
        return izq >= dere;}

    @Override public Boolean visitDifIg(GramaticaParser.DifIgContext ctx) {
        double izq = (double) visit(ctx.express(0));
        double dere = (double) visit(ctx.express(1));
        if (ctx.co.getText().equals("==")) {
            HelloController.añadir("if_icmpeq label"+contador);  //
            return izq == dere;
        }
        HelloController.añadir("if_icmpne label"+contador); //
        return izq != dere;}
    @Override public Boolean visitConditionalelse(GramaticaParser.ConditionalelseContext ctx) {

        int actual=contador;
        HelloController controller = new HelloController();
        contador++;
        visit(ctx.contenu());
        controller.añadir("goto resultado"+actual);
        return null;


      /*  mapita = new Mapitas(mapita);
        visit(ctx.contenu());

        mapita = mapita.anterio;
        return null; */

    }
    @Override public Boolean visitConditionalelseif(GramaticaParser.ConditionalelseifContext ctx) {

        if ((boolean) visit(ctx.condition())){
            mapita = new Mapitas(mapita);
            visit(ctx.contenu());
            mapita = mapita.anterio;
            return true;
        }
        return false; }

    @Override public Boolean visitTrue(GramaticaParser.TrueContext ctx) {

        return true; }
    @Override public Boolean visitFlase(GramaticaParser.FlaseContext ctx) {

        return false; }

    @Override public Boolean visitCondicionalfor(GramaticaParser.CondicionalforContext ctx) throws Exception {

        int actual=contador;

        if(ctx.asignation()!=null){
            visit(ctx.asignation());
        }
        else {
            visit(ctx.decla());

        }
        HelloController.añadir("ciclo"+actual+":");
        visit(ctx.condition());
        HelloController.añadir("goto resultado"+actual);

        //si se cumple el if
        HelloController.añadir("label"+ actual + ":");
        contador++;
        visit(ctx.contenu());
        visit(ctx.incremento());
        HelloController.añadir("goto ciclo" + actual);
        //para que no se cicle el if
        HelloController.añadir("resultado"+actual+":");

/*
        if(ctx.asignation()!= null) {
            if (ctx.op.getText().equals("++")) {

                for (visit(ctx.asignation()); (boolean) visit(ctx.condition()); mapita.asignar(ctx.ALLER().getText(), mapita.regresar(ctx.ALLER().getText()) + 1)) {
                    mapita = new Mapitas(mapita);
                    visit(ctx.contenu());
                    mapita = mapita.anterio;
                }
            } else {
                for (visit(ctx.asignation()); (boolean) visit(ctx.condition()); mapita.asignar(ctx.ALLER().getText(), mapita.regresar(ctx.ALLER().getText()) - 1)) {
                    mapita = new Mapitas(mapita);
                    visit(ctx.contenu());
                    mapita = mapita.anterio;
                }
            }
        }
        else {
            if (ctx.op.getText().equals("++")) {

                for (visit(ctx.decla()); (boolean) visit(ctx.condition()); mapita.asignar(ctx.ALLER().getText(), mapita.regresar(ctx.ALLER().getText()) + 1)) {
                    mapita = new Mapitas(mapita);
                    visit(ctx.contenu());
                    mapita = mapita.anterio;
                }
            } else {
                for (visit(ctx.decla()); (boolean) visit(ctx.condition()); mapita.asignar(ctx.ALLER().getText(), mapita.regresar(ctx.ALLER().getText()) - 1)) {
                    mapita = new Mapitas(mapita);
                    visit(ctx.contenu());
                    mapita = mapita.anterio;
                }
            }
        }
*/
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

    @Override public Boolean visitIncremento(GramaticaParser.IncrementoContext ctx) {
        int pos = new ArrayList<String>(mapita.mapita.keySet()).indexOf(ctx.ALLER().getText());
        HelloController.añadir("iinc "+pos+" 1\n");
        return null;
    }
    @Override public Boolean visitCondicion(GramaticaParser.CondicionContext ctx) {
        return (boolean) visit(ctx.condition()); }
    @Override
    public Boolean visitId(GramaticaParser.IdContext ctx) throws Exception {
        int pos = new ArrayList<String>(mapita.mapita.keySet()).indexOf(ctx.ALLER().getText());
        HelloController.añadir("iload "+pos+"\n");
        HelloController.añadir("ifne label \n");
        double valor = mapita.regresar(ctx.ALLER().getText());
        return valor != 0;

    }
}













