.source Test.src
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static square(I)V

    iload 0
    iload 0
    imul
    istore 1

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "The square is "
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 1
    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

    return
.limit stack 2
.limit locals 2
.end method

; symbol_table: x y 
; type_table: i i 
; used_table: x y 

.method public static check(III)V

    iload 0
    iload 1
    iadd
    iload 2
    iadd
    iload 0
    iload 1
    imul
    iload 2
    imul
    if_icmpne NOT_IF_0
    ldc "equal to"
    astore 3

    goto END_ELSE_0
NOT_IF_0:
    ldc "different from"
    astore 3

END_ELSE_0:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "The sum is "
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    aload 3
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc " the product"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

    return
.limit stack 7
.limit locals 4
.end method

; symbol_table: x y z msg 
; type_table: i i i s 
; used_table: x y z msg 

.method public static main([Ljava/lang/String;)V

    ldc "Summary:"
    astore 0

    getstatic java/lang/System/out Ljava/io/PrintStream;
    aload 0
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

    ldc 8
    invokestatic Test/square(I)V

    ldc 1
    ldc 2
    ldc 3
    invokestatic Test/check(III)V

    return
.limit stack 4
.limit locals 5
.end method

; symbol_table: y 8 1 2 3 
; type_table: s i i i i 
; used_table: y 8 1 2 3 
