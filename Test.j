.source Test.src
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static test()V

    ldc 1
    istore 0

    return
.limit stack 1
.limit locals 1
.end method

    ldc 1
    istore 0

    return
.limit stack 1
.limit locals 1
.end method

.method public static main([Ljava/lang/String;)V

    invokestatic Test/test()V

    return
.limit stack 0
.end method

; symbol_table: 
; type_table: 
; used_table: 
