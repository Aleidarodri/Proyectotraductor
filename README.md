# Proyecto traductor
# Compilador

Como sabemos un compilador es un pequeño programa informático,  que se encarga de traducir un el código fuente ,este es un 
software que se encarga de traducir el programa hecho en lenguaje de programación, a un lenguaje de máquina que pueda ser 
comprendido por el equipo y pueda ser procesado o ejecutado por este.
Acontinuacion se presentara el proceso de la creación de un traductor de lenguaje C a la creacion de un lenguaje propio,en este caso se tradujo frances y 
al finalizar con un lenguaje de Maquina(jasmine)


# Creación de cascarón

Creación de un cascarón para una interfaz con la que se empezara el proyecto para comenzar a usar nuestro propio lenguaje.

  ![interfaz](https://user-images.githubusercontent.com/93956966/204643194-8fdeca79-6076-47e4-8e78-bb60130d4d0e.png)

Figura 1:Cascarón de interfaz para creación para uso de nuestro lenguaje

Declaración de tokens para iniciar un lenguaje basico void main(),para uso de operaciones basicas de matematicas multiplicación, división, suma y resta

  ![tokens](https://user-images.githubusercontent.com/93956966/204643470-524fc3f6-ab3c-4191-a548-5c07bdb77e69.png)

Figura 2:Declaración de tokens para inicar un lenguaje básico 
  
 Creación de una expresión básica de matematicas con un metodo  basico void  main() con declaración de expresión.
 
 ![metodo](https://user-images.githubusercontent.com/93956966/204644094-81dfda11-d6c1-42c3-8749-0c4d99696cb9.png)

Figura 3: metodo de declaración de operaciones

Visita a BaseVisitor a los metodos para realizar cada operación en MyVisitor,con declaración estableciendo limite en dos operaciones del mismo nivel,como Multiplicación y división o Suma y resta 

  ![limite](https://user-images.githubusercontent.com/93956966/204644283-0cfa9e6e-391d-44f6-a272-af628ece7270.png)

Figura 4:Visita a los metodos de limitación para cada una de las operaciones 

Prueba de metodo Void main (){} en intefaz con resultado de declaración de variable con asignación e impresión de la misma 

  ![prueba1](https://user-images.githubusercontent.com/93956966/204644778-c5776ae3-ba59-4816-9f01-42d25c4090ad.png)

Figura 5: Declaracion de variables e impresión de la mismas.

Metodo para que en caso de que se declaren dos varibales iguales,salga un error en pantalla donde te diga que ya hay una variable asignada con el mismo nombre 

  ![error](https://user-images.githubusercontent.com/93956966/204645737-e2850eaa-1a3b-4add-a689-8bed084069ca.png)

Figura 6:Declaración de error en dos variables iguales   

  ![errorint](https://user-images.githubusercontent.com/93956966/204645895-f129edb7-7d21-4fc2-a918-bcea35268918.png)

Figura 7: Declaración de error en dos variables iguales en la intefaz   

 Prueba de potencia de un numero e impresión de la potencia con el metodo Math.pow.(ex,num)  ,donde ex=exponente y num=numero del que quieres sacar su exponente 
 
  ![potencia](https://user-images.githubusercontent.com/93956966/204651638-aa93d714-e0a7-438e-b784-4c8c885251ac.png)

Figura 8: Declaracion de variables e impresión de la potencia


# Creación de traductor

 Inicio de una nueva gramatica G4 para empezar a traducir de lenguaje C al lenguaje  propio con los mismos tokens pero ahora declarados para el lenguaje C

  ![tokens 2](https://user-images.githubusercontent.com/93956966/204685855-08c9fa87-60fd-4fa6-ae01-fb41ff65e063.png)

Figura 1:Declaración de tokens en c para empezar la traducción

 Inicio de una nueva gramatica G4 para empezar a traducir de lenguaje C Visita a la base visitor de la nueva gramatica visitando los campos importantes como son las declaraciones,asignaciones,expresiones e impresion de las misma
 
 ![traductorA](https://user-images.githubusercontent.com/93956966/204686142-865da38b-6c9f-498d-8002-d6c8b0b56782.png)

Figura 2:Visita al BaseVisitor de la 2da gramatica  traducción 

En este caso cada una de las visitas de manejaron como String y en la principal se manejaba como double o como objeto,pero para poder traducir se necesita en String

  ![string](https://user-images.githubusercontent.com/93956966/204686692-5026469e-1b5a-4610-aada-0398757dfb49.png)

Figura 3:Declarar visitas como String

 Para cada visita depende de lo que pida,en caso de ser un numero entero se pide el como esta escrito,en "=" para saber que es una asignacion,en todas son casos distintos pero en la mayoria se pide el id(Aller),en cada caso tambien se pone el como debe pasar de un lenguaje a otro,en caso de un numero float se pone el floteur o en un int se pone un entier,va detectando los tockens de la segunda gramatica 

  ![id](https://user-images.githubusercontent.com/93956966/204686769-75c8c479-a819-42c3-851f-73ed7f2320cc.png)

Figura 4: Visita a la segunda gramatica para poder crear la traducion de el lenguaje C a el propio

 Prueba de metodo vacio void main() \{\} para traducción sencilla del lenguaje C al propio
   ![traduccion](https://user-images.githubusercontent.com/93956966/204687045-a265af4e-f4e6-4180-9ebb-f00d3dd6735f.png)
   
   Figura 5: Metodo vacio para prueba de traducción de lenguaje c al propio.
   
Prueba de metodo sencillo void main() \{\} para traducción sencilla del lenguaje C al propio con declaración y asiganación de variables para traducción e impresión de resultados    
  ![expresionS](https://user-images.githubusercontent.com/93956966/204687213-72f4dcfc-ea98-43ba-869d-e78cf4e0efa7.png)

Figura 6: Metodo sencillo para prueba de traducción de lenguaje c al propio con impresión

Prueba de metodo sencillo void main() \{\} para traducción sencilla del lenguaje C al propio con declaración y asignación de variables para traducción e impresión de resultados con variable repetida.

  ![rep](https://user-images.githubusercontent.com/93956966/204687488-a724c492-0b8d-478f-83cf-3128c055d1fb.png)

Figura 7: Metodo sencillo para prueba de traducción de lenguaje c al propio con impresión de variable repetida


# Creación de If y variables

Para el metodo if se hizo una modificación de la gramatica inicial,agregando las condiciones < , > ,<= ,>= ,!=,==,TRUE,FALSE"



If Creación de un if sencillo donde sabemos que tiene que cumplir una condición donde es su resultado es true o false,una vez cumpla una condición,se hara el contenido de dicha expresion.

 ![ifsolito](https://user-images.githubusercontent.com/93956966/204687962-29dad5ee-2c33-4335-9f5a-f55d56971d26.png)

Figura 1: Declaración de if,con declaración de tokens y condiciones que tiene que tener para funcionar


![ifvisita](https://user-images.githubusercontent.com/93956966/204688178-949c3add-e7d6-4d6d-8ca3-3a8318c42abc.png)

Figura 2: Visita a metodo if.

if Creación de un if sencillo donde sabemos que tiene que cumplir una condición donde es su resultado es true o false,una vez cumpla una condición,se hara el contenido de dicha expresion.

  ![if](https://user-images.githubusercontent.com/93956966/204688357-cb80816b-cca1-42fa-b8f0-ea15c19cde4d.png)

Figura 2: Tester de un if sencillo


if else  Creación de un if else sencillo donde sabemos que tiene que cumplir una condición donde es su resultado es true o false,una vez cumpla una condición,se hara el contenido de dicha expresion.,una vez dada la condición el caso de que no se haga,hace la otra condición del else 

  ![condielse](https://user-images.githubusercontent.com/93956966/204688566-ff18fbdc-feb2-463d-bcf1-25ba691b7658.png)

Figura 3: Tester de un if else sencillo con condiciones

  ![if](https://user-images.githubusercontent.com/93956966/204688985-1cd72618-7e35-4f88-9921-d62483518b63.png)

Figura 4:Tester de un if else sencillo con condiciones

if else if creación de un if else  if sencillo donde sabemos que tiene que cumplir una condición donde es su resultado es true o false,una vez cumpla una condición,se hara el contenido de dicha expresión;una vez dada la condición el caso de que no se haga,hace la otra condición del else se agrego un if que tiene que cumplir la condición del ultimo if 


  ![condicionalifel](https://user-images.githubusercontent.com/93956966/204689298-59d34939-e838-4871-98a8-85e2304b2497.png)

Figura 5:Para la condicional if else if se necesita visitar al if para verificar que tenga la condición,en caso de que este vacio no se cumplira y no se podra hacer el if else if 


  ![ifelse](https://user-images.githubusercontent.com/93956966/204689574-01eecac2-3f8d-40e9-aafd-a03a38bca47c.png)
  
  Figura 6: Tester de un if else if sencillo con condiciones


# Creación de ciclo For
for Creación del ciclo for sabemos que es el que se encarga de repetir e implementar un cierto numero de veces una condición que sea la que se implementa 


for Creación del ciclo ,sabemos que el ciclo for tiene dos condiciones de "++" de incremento o "--" que es lo que indica cuantas veces se hara el la repeticion del ciclo,para la visita al ciclo primero verifica si se declara la variable en el ciclo o la variable esta declarada fuera de el comprueba que las variables esten declaradas ,despues visita la condición de la instrucción y comprueba que sea verdad ya una vez comprobado,depende de cual sea el caso hara  lo que se pida 

  ![condicionalfor](https://user-images.githubusercontent.com/93956966/204690023-cb10de18-53e0-48a3-a9c9-51bea4dc604d.png)
  
  Figura 1: Visita al condicional for
  
  ![forsolito](https://user-images.githubusercontent.com/93956966/204690625-9793028d-13d4-4361-86c4-2fc39e8734b3.png)
 
 Figura 2:Prueba sencilla solo for
 
![if-forcito](https://user-images.githubusercontent.com/93956966/204690821-31db6b15-694d-4523-b903-a8259977002a.png)

Figura 3: Tester de condicional if-for


Implementacion de condiciones utilizando operadores lógicos,los operadores logicos que se implementaron fueron and (&&) y or (!!) ,para este caso se hizo una nueva condición ,donde se preguntaba que tipo de operador logico se estaba utilizando,una vez que tenia cual era, verifica si la condición esta bien implentada,una vez comprobada,hace el metodo y verifica cada uno de los pasos para que sea una correcta implementación.

  ![andyor](https://user-images.githubusercontent.com/93956966/204691315-63469f93-f9f4-465b-b339-3dfb72b3fb40.png)

Figura 4: Tester de condicional if-for con condicionales

  ![if-forcito](https://user-images.githubusercontent.com/93956966/204691876-7bdf0afb-ebbd-4b24-9cc7-8431b2968a49.png)

Figura 5: Tester de condicional if-for con condicional "&&"

# Implementacion de Scoppe

Para la implementacion del Scoppe de varariables se necesitan dos mapas,donde uno sera la memoria permantente de las variable y otro sera una memoria temporal,que guarde las variables del primer nivel para que cuando sean solicitadas en ese nivel,esten guardadas en la segunda memoria temporal.

![mapita](https://user-images.githubusercontent.com/93956966/204692132-96a4657b-66f1-4495-81e8-9c1d89a325e5.png)

Figura 1:  Creacion de los mapas,el mapa general llamado "mapital" y el mapa temporal llamado "anterior".


Una vez teniendo ambos mapas ,se crearon 4 metodos donde cada uno se encarga de verificar cada uno de los datos ,para ver detectar si una variable esta repetida,declarada o no declarada o sin valor,en caso de llegue a ver una,los metodos detectaran cual es y mandaran un aviso para informar


El primer metodo es el que se encarga de verificar si una variable esta declarada,donde pregunta si el id(aller) ya tiene un valor,en caso de que si regresara un true y en caso de que la varible este declarada un nivel mas abajo,se llamara a la memoria temporal para saber si ya esta declarada en caso de que si,se tomara el valor se ahi.

  ![declarada](https://user-images.githubusercontent.com/93956966/204692389-e8085c49-3271-46b3-a327-00fae031205f.png)
  
  Figura 2: Metodo donde revisa si la variable ya esta declarada en cualquier de los niveles
  
  
El segundo metodo es el que se encarga de regresar si el valor de las variables,donde primero pregunta el id(aller),despues verifica que el id sea diferente a null,donde en caso de que sea diferente regresa el valor de aller ,en caso de que sea igual null,te dira que la variable esta vacia y que necesita un valor,por otro caso en caso de que se quiera hacer alguna acción con una variable no declarada,buscara en la memoria temporal si no esta te mandara un mensaje donde dira que la variable  no esta declarada.

![regresa](https://user-images.githubusercontent.com/93956966/204692531-66a74ffb-7ca9-40d6-a8fd-a2c97dae970e.png)

Figura 3: Metodo donde regresa dos mensajes diferentes ,donde uno es que la variable no tiene valor y otro donde se marca que la variable no a sido declarada

El tercer  metodo es el que se encarga de guardar las variables temporales de apartir del nivel 2,ya que se van declarando dentro de los metodos como en if,if-else, y for,son variables que solo se pueden usar en ese bloque,este ve que la variable y el valor es diferente a null,la guarda en la memoria temporral,en caso de que se declare un variable igual,te mostrara un mensaje de que la variable ya esta declarada

  ![nd](https://user-images.githubusercontent.com/93956966/204692660-b7aa4734-13e0-4015-a9b7-9178dc9c9eb3.png)
  
  Figura 4: Metodo donde regresa dos mensajes diferentes ,donde uno es que la variable no tiene valor y otro donde se marca que la variable no a sido declarada


El cuarto  metodo es el verifica que las variables esten con un asigadas y con un valor,donde primero verifica que la variable este declarada y despues verifica que tiene un valor diferente a null,una vez que verifica que tiene un valor diferente a null,ya guarda en la memora temporal ,en caso de que la variable no este declarada,esta mandara un mensaje de que no esta declarada.

  ![asignar](https://user-images.githubusercontent.com/93956966/204692885-25a1cecb-eaf7-492b-bf77-dea7e3121be9.png)
  
Figura 4: Metodo donde regresa dos mensajes diferentes ,donde uno es que la variable no tiene valor y otro donde se marca que la variable no a sido declarada.

  ![errorscope](https://user-images.githubusercontent.com/93956966/204693117-44758c22-b5f3-4bf8-87ea-af4a84231f5a.png)

Figura 5: Metodo donde regresa el mensaje de que hay algo fuera de la ultima llave ,donde al estar fuera de la estructura principal,es un error e eso hace que no se pueda ejecutar

# Jasmine
Jasmine es un ensamblador para la máquina virtual de Java. Toma descripciones ASCII de las clases de Java, escritas en una sintaxis similar a la de un ensamblador simple utilizando el conjunto de instrucciones de la máquina virtual de Java. Los convierte en archivos binarios de clase Java, adecuados para cargar mediante un sistema de tiempo de ejecución Java.


El primer ejemplo que se nos pidio fue crear una clase sencilla al momento de traducirlo ,primero solo era que llegara a tener una variable y que la imprima.

Para empezar para crear el archivo ".j"se tiene que hacer una visita a la cabeza en la que se puede decir que tiene el metodo "void main()",una vez que se tiene la visita,tenemos que con el boton de enviar  ,tiene imprimir el lenguaje ensamblador ,en vez de traducirlo te dara como la "traduccion " a el lenguaje ensamblador

  ![1jas](https://user-images.githubusercontent.com/93956966/204693520-869b9d3b-e9bb-4447-87e8-43d13dd84532.png)
  Figura 1: "traduccion" a lenguaje ensamblador con el boton de enviar"

  ![2jas](https://user-images.githubusercontent.com/93956966/204693608-d1709362-d703-48f6-82be-f4be876f443a.png)
  Figura 2:  traduccion a lenguaje ensamblador de metedo vacio
  
  ![3jas](https://user-images.githubusercontent.com/93956966/204693739-1fd56db1-5076-4ad4-ae14-6806fc283f04.png)
  Figura 3: Creaciond de archivo .j
  
El segundo ejemplo fue la creacion del metodo if con impresion 
sabemos que tiene que para ir  hacia un goto y un label, este caso en jasmine se utilizo un contador para que cada se hiciera la condicional 

  ![ifjas](https://user-images.githubusercontent.com/93956966/204696049-90fcf09b-0fd3-4a75-abcc-1ebd963e5047.png)
  
  Figura 4:Codigo de condicional if en jasmine 
  
La creacion del ciclo for,para la creación del cilo for ,sabemos que se tiene que ir al goto resultado + al actual con un contador  donde primero visita si la asignación es diferente a null,
despues visita asiganacion o en caso de que no cumpla,esta visita a declaración.
  ![forjas](https://user-images.githubusercontent.com/93956966/204697489-8a996922-3223-45c3-af64-21c280692d19.png)
  
  Figura 4: Codigo maquina para el ciclo for 
  
  ![pruebajas](https://user-images.githubusercontent.com/93956966/204698070-af483c47-4aaa-45f4-99d3-95907d9e1148.png)

Figura 5: Muestra de una traducción e implementación de el los diferentes metedos e implementaciones de ciclos e operacion que se realizarón a lo largo de todo el semestre 

Para finalizar,la implementación de que se cree el archivo y se compile y el resultado se implemete en la interfaz 


![jasmine](https://user-images.githubusercontent.com/93956966/204698685-38ebf698-edf8-4e54-a74d-8af69d2a736e.png)

Figura 6: Codigo para creación de archivo.j y la implementación para que el resultado ya sea mostrado en la intefaz final.

# Conclusión


Como pudimos observar en proceso de creacion de un compilador es  un proceso donde lo principal se necesita el conocimiento de como funciona cada uno de los proceso ,entender como se estructura de los mismos.
Como vemos los procesos mas dificiles fueron la creacion el Scoppe ya que este es el que se encarga de verificar cada nivel de la estructura y en caso de que la estructura no este bien hecha,no puede funcionar de una manera adecuada,tambien, 
el recordar que la declaracion de los tokens se le de arriba para abajo y eso es uno de los puntos mas importantes ya que de eso dependera de como el programa lo ira leyendo y eso puede afectar toda el proceso.
Y para finalizar el lenguaje ensamblador es un proceso muy grande ya que se tiene que hacer paso a paso ya que es muy complejo y se tiene varios comandos para cada una de las actividades,y tienes que conocer saber cual es el proceso que se necesita.
