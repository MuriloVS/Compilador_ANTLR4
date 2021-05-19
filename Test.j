.source Test.src
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static factorial(I)I

    iload 0
    ldc 1
    if_icmpgt NOT_IF_0
    ldc 1
    ireturn

NOT_IF_0:

    iload 0
    iload 0
    ldc 1
    isub
    invokestatic Test/factorial(I)I

    imul
    ireturn

    return
.limit stack 4
.limit locals 2
.end method

; symbol_table: n n-1 
; type_table: i i 
; used_table: n n-1 

.method public static main([Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc 5
    invokestatic Test/factorial(I)I

    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

    return
.limit stack 2
.limit locals 1
.end method

; symbol_table: 5 
; type_table: i 
; used_table: 5 
