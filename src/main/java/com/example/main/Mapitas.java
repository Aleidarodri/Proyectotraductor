package com.example.main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mapitas {

    Map<String,Double> mapita  = new HashMap<>(); // este es el que guarda ya las variables en el visitor
    Mapitas anterio;                                // este es el nivel anterior que guarda las varaibles temporales


    public Mapitas(Mapitas anterio){
        this.mapita= new LinkedHashMap<>(); // este es la memoria que se crea para que guarde en caso de que se crea un nuevo objeto tipo mapa
        this.anterio=anterio; // // esta es la variable que la el mapita del nivel anterior

    }
    public Boolean declarada (String aller) throws Exception {

        if (this.mapita.containsKey(aller)){
            return true;
        }
        else if(this.anterio!=null) {
            return this.anterio.declarada(aller);
        }
        return false;
    }
public double regresar(String aller) throws Exception {
    if(this.mapita.containsKey(aller)){
        if(this.mapita.get(aller)!=null) {
            return this.mapita.get(aller);
        }
        else{
            throw new Exception("Variable sin valor: " + aller);
        }
    }
    else if (this.anterio!=null){
        return this.anterio.regresar(aller);
    }
    else {
        throw new Exception("Variable no declarada: " + aller);
    }
    }



    public void nuevadeclarada (String aller) throws Exception {

        if (!this.declarada(aller)){
            ;this.mapita.put(aller,null);
        }
        else {
            throw new Exception("Variable ya declarada");

        }

    }


    public void asignar(String aller,double valor ) throws Exception {

        if (this.mapita.containsKey(aller)){
           this.mapita.replace(aller,valor);
        }
        else if (this.anterio!=null){
                this.anterio.asignar(aller,valor);
        }
        else {
            throw new Exception("Variable no declarada: " + aller);
        }

    }


}
