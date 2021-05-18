.source Test.src
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static fw()I

    ldc "ab"

    return
.limit stack 1
.end method

; symbol_table: 
; type_table: 
; used_table: 

.method public static fx(I)I

    ldc 0
    ireturn

    return
.limit stack 1
.limit locals 1
.end method

; symbol_table: a 
; type_table: i 
; used_table: a 

.method public static fy(II)I

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 0
    iload 1
    iadd
    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V


    return
.limit stack 3
.limit locals 2
.end method

; symbol_table: b c 
; type_table: i i 
; used_table: b c 

.method public static main([Ljava/lang/String;)V

    ldc 1
    invokestatic Test/fx(I)I

    istore 1
    ldc 1
    ldc 2
    ldc "ab"
    astore 4

    ldc 1
    ldc 2
    invokestatic Test/fy(II)I

    return
.limit stack 4
.limit locals 7
.end method

; symbol_table: 1 e 1 1 f 1 1 
; type_table: i i i i s i i 
; used_table: 1 1 1 1 1 
