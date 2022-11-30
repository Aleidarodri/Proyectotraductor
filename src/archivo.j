.class public Hola 
 .super java/lang/Object
.method public static main([Ljava/lang/String;)V 
.limit stack 10 
.limit locals 10

bipush 20
istore 0
bipush 0
istore 1
ciclo0:
iload 1

iload 0

if_icmplt label0
goto resultado0
label0:
iload 1

bipush 10
if_icmplt label1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Grrr..."
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto resultado1
label1:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Yeii..."
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
resultado1:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1

invokevirtual java/io/PrintStream/println(I)V
iinc 1 1

goto ciclo0
resultado0:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Fin..."
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method