grammar Traductor;

calculadora:cabeza abrirll contenido cll EOF #cont; //calculadora:void main() {}

abrirll:'{' ;//abrir llave

numfloat:FLOAT ID';';//NUMERO numero float (FLOAT)

numInt:INT ID';';//NUMERO entero (int)

cll:'}' ;//cerrar llave

cabeza:VOID MAIN '(' ')'; //cabeza:void main ()

declaracion: numInt #numin
           | numfloat #numflot ;


decla: FLOAT ID '=' express ';' #declaracionFloat
        | INT ID '=' express ';' #declaracionInt;

asignacion: (ID '=' express ) ';' #asig; //asignacion

impresion: IMPRIMIR '(' (express | STRING)  ')' ';' #impr;//impresion de expresión

 contenido: (express //expresion
      | declaracion
      | decla
      | asignacion
      | impresion
      | condicionalIf
      | condicionalfor)* ;

condicionalIf: 'if' '(' condicion ')' abrirll contenido cll condicionalelseif* condicionalelse? ;

condicionalelse:'else' abrirll contenido cll;

condicionalelseif:'else' 'if''('condicion ')'abrirll contenido cll ;

condicionalfor: '(' (ID '=' express|INT ID '=' express) ';' condicion ';' ID op = ('++'|'--') ')' abrirll contenido cll ;

condicion:
    condicion co=(AND|OR) condicion #andyor
   |express co=(MAYOR|MENOR) express #mayMen
   |express co=(MAYORIG|MENORIG)express #mayMenig
   |express co=(DIF|IGUAL) express #difIg
   |TRUE #true
   |FALSE  #false
   |'('condicion ')' #condic
   | ID #variable

   ;

express:
     express PONTENCIA NUM  #poten
    |express op= (MUL|DIV) express #mulDiv
    |express op=(SUMA |RESTA)  express #suMRes

       | NUM #num
       |ID #id
       ;




//TOKEEENNSSS
FLOAT:'float';//float
INT :'int';//int
VOID:'void';//VOID
MAIN :'main';//MAIN
NUM:[0-9]+('.'[0-9]+)?;//num
IMPRIMIR: 'printf';//imprimir
MUL:  '*';//multiplicacion
DIV:   '/';//division
SUMA:  '+';//suma
RESTA:  '-';//resta
PONTENCIA:'^';
TRUE :'true';
FALSE :'false';
MAYOR:'>';
MENOR: '<';
MAYORIG:'>=';
MENORIG:'<=';
DIF:'!=';
IGUAL:'==';
AND :'&&';
OR :'||';


ID: [a-zA-Z]+;//id
STRING: '"'('\\"'| . )*?'"';
COM : '//' ~[\r\n]*  ->skip;
WS: [ \t\r\n] + -> skip;//ignorar

