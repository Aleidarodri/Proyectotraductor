package com.example.main;

import com.example.parser.GramaticaLexer;
import com.example.parser.GramaticaParser;
import com.example.traductor.TraductorLexer;
import com.example.traductor.TraductorParser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.Scanner;


public class HelloController {

    @FXML
    private TextArea entradatxt;

    @FXML
    private TextArea salidatxt;

    @FXML
    private TextArea traducciontxt;

    @FXML
    private Button eliminar;

    @FXML
    private Button enviar;
    @FXML
    private Button borrar;

    @FXML
    private Button traducir;

    @FXML
    private Button compilar;

    public static String resultado = "";
    public static String traduccion="";
    public static String traductor="";


    public static void añadir(String t){resultado+= t+"\n";
    }

    public static void traducir(String t){traduccion+= t+"\n";
    }
   public static void lenguaje (String to){traductor+= to+"\n";
    }

    @FXML
    void mandar(ActionEvent event) {

        GramaticaParser syntactic;
        try {
            System.out.println("");
            CharStream input = CharStreams.fromString(traducciontxt.getText());
            GramaticaLexer lexico = new GramaticaLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexico);
            syntactic = new GramaticaParser(tokens);


            syntactic.removeErrorListeners();
            syntactic.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg, RecognitionException e)
                        throws ParseCancellationException {
                    throw new ParseCancellationException("Error, verifique que su entrada a ejecutar sea correcta (linea " + line +
                            ", caracter " + charPositionInLine + ")."+" "+msg);
                }
            });

        ParseTree arbol = syntactic.calculatrice();
        Verificar verificacion = new Verificar();
        verificacion.visit(arbol);

        MyVisitor visits = new MyVisitor();
        visits.visit(arbol);

            //crear archivo
            File miarchivo = new File("src\\archivo.j");
            FileWriter miarchivo2 = new FileWriter(miarchivo.getAbsolutePath());
            System.out.println(resultado);
            miarchivo2.write(resultado);

            miarchivo2.write("return\n.end method");
            miarchivo2.close();
            Process crear = Runtime.getRuntime().exec(" java -jar jasmin.jar archivo.j",null, new File("src\\")
            );
            crear.waitFor();
            Process impresion =Runtime.getRuntime().exec("java Hola",null, new File("src\\")
            );
            BufferedReader salida = new BufferedReader(new InputStreamReader(impresion.getInputStream()));
            String line;
            while ((line= salida.readLine())!=null){
                salidatxt.appendText(line+ "\n");
            }
            salida.close();
            crear.destroy();
            impresion.destroy();

      //  salidatxt.setText(resultado);
        resultado="";

    }
        catch (Exception e) {
           salidatxt.setText(e.getMessage());
            resultado = "";
        }
    }

    @FXML
    void traduce(ActionEvent event) {
        try {
            System.out.println("");
            CharStream input = CharStreams.fromString(entradatxt.getText());
            TraductorLexer lexico = new TraductorLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexico);
            TraductorParser syntactic = new TraductorParser(tokens);

            ParseTree arbol = syntactic.calculadora();
            MyTraductor visits = new MyTraductor();

            visits.visit(arbol);

            traducciontxt.setText(traduccion+"}");
            traduccion = "";
        }
        catch (Exception e) {
            salidatxt.setText(e.getMessage());
        }
    }
    @FXML
    void traducir  (ActionEvent event) {
        try {
            System.out.println("");
            CharStream input = CharStreams.fromString(traducciontxt.getText());
            GramaticaLexer lexico = new GramaticaLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexico);
            GramaticaParser syntactic = new GramaticaParser(tokens);

            ParseTree arbol = syntactic.calculatrice();
            MyTraductorC visits = new MyTraductorC();

            visits.visit(arbol);

            entradatxt.setText(traductor+"}");
            traductor = "";
        }
        catch (Exception e) {
            salidatxt.setText(e.getMessage());
        }
    }

    @FXML
    void subirTexto(ActionEvent event)
    {
        borrarEntrada(event);
        FileChooser selector = new FileChooser();
        selector.setInitialDirectory(new File(System.getProperty("user.home")));
        File archivo = selector.showOpenDialog(null);
        if(archivo!=null)
        {
            try {
                Scanner entrada = new Scanner(new File(archivo.getAbsolutePath()));
                while (entrada.hasNext())
                {
                    entradatxt.appendText(entrada.nextLine()+"\n");
                }
                entrada.close();
            }
            catch (FileNotFoundException nfe )
            {
                System.out.println("El archivo no se encontro");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
    @FXML
    void borrarEntrada(ActionEvent event) {
        entradatxt.clear();
    }

    @FXML
    void borrarTraduccion(ActionEvent event) {
        traducciontxt.clear();
    }

    @FXML
    void compilar(ActionEvent event) {


        ;
    }


}