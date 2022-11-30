grammar Gramatica;

calculatrice:tete ouver contenu fermet  EOF #cont; //calculadora:void main() {}

ouver:'{' ;//abrir llave

numflotteur:FLOTTEUR ALLER';';//NUMERO numero float (FLOAT)

numentier:ENTIER ALLER';';//NUMERO entero (int)

fermet:'}' ;//cerrar llave

tete:ANNULER PRINCIPALE '(' ')'; //cabeza:void main ()

declaration: numflotteur #numFlott
           | numentier   #numEnt;

decla:  FLOTTEUR ALLER '=' express';'#declaracionFlou
      | ENTIER ALLER '=' express ';'  #declaracionEnt;




asignation: (ALLER '=' express)';' #mission ;//asignacion
imprimer: IMPRIMER '(' (express | STRING) ')' ';' #impr;//impresion de expresión

 contenu: (express //expresion
      |   declaration
      |   decla
      |   asignation
      |   imprimer
      |   conditionalIf
      |   condicionalfor
      |   incremento
      )*;

conditionalIf: 'if' '(' condition ')' ouver contenu fermet conditionalelseif* conditionalelse? ;

conditionalelse:'else' ouver contenu fermet;

conditionalelseif:'else' 'if''('condition ')'ouver contenu fermet ; //'(' (ID '=' express|INT ID '=' express) ';' condicion ';' ID op = ('++'|'--') ')' abrirll contenido cll

condicionalfor: FOR'(' (asignation|decla)   condition ';' incremento ')' ouver contenu fermet;

condition:
    condition co=(ET|OU) condition #andyor
   |express co=(AGE|MINEURE) express #mayMen
   |express co=(PLUS|MOINS)express #mayMenig
   |express co=(DIFF|EGAL) express #difIg
   |VRAI #true
   |FAUX #flase
   |'('condition ')' #condicion
   | ALLER #id

   ;

express:
     express PONTENTIEL NUM  #poten
    |express op= (PAR|DIVISE) express #mulDiv
    |express op=(SOMME|SOUSTRAIRE)  express #soMRes

       | NUM #num
       |ALLER #aller
       ;

incremento:
    ALLER '++';


//TOKEEENNSSS
FOR :'for';
FLOTTEUR :'flotteur';//float
ENTIER :'entier';//int
ANNULER :'annuler';//VOID
PRINCIPALE :'principale';//MAIN
NUM:[0-9]+('.'[0-9]+)?;//num
IMPRIMER: 'imprimer';//imprimir
PAR:  '*';//multiplicacion
DIVISE:   '/';//division
SOMME:  '+';//suma
SOUSTRAIRE:  '-';//resta
PONTENTIEL:'^';
VRAI: 'true';
FAUX:'false';


AGE:'>';
MINEURE: '<';
PLUS:'>=';
MOINS:'<=';
DIFF:'!=';
EGAL:'==';
ET :'&&';
OU :'||';
MAS:'++';
MENOS:'--';



ALLER: [a-zA-Z]+;//id
STRING: '"'('\\"'| . )*?'"';
COM : '//' ~[\r\n]*  ->skip;
IGNORE: [ \t\r\n] + -> skip;//ignorar


/*
num = num
print = imprimer
por * = par
div= divise
suma=somme
resta = soustraire
salto = saut
id = aller
ws = ignore
calculadora = calculatrice
contenido = contenu
expr=express
asignacion=mission
void = annuler
main = principale
float=flotteur
int = entier
valor=valeurs
*/








