.source Test.src
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static fw()V


    return
.limit stack 0
.end method

; symbol_table: 
; type_table: 
; used_table: 

.method public static fx(I)V


    return
.limit stack 0
.limit locals 1
.end method

; symbol_table: a 
; type_table: i 
; used_table: a 

.method public static fy(II)V


    return
.limit stack 0
.limit locals 2
.end method

; symbol_table: b c 
; type_table: i i 
; used_table: b c 

.method public static fz(I)V


    return
.limit stack 0
.limit locals 1
.end method

; symbol_table: d 
; type_table: i 
; used_table: d 

.method public static main([Ljava/lang/String;)V

    ldc 1
    ldc 1
    ldc 2
    ldc 1
    ldc 2
    ldc 3
    ldc "ab"
    invokestatic Test/fx(I)V

    ldc 1
    ldc "ab"
    invokestatic Test/fy(II)V

    ldc "ab"
    ldc 2
    invokestatic Test/fy(II)V

    return
.limit stack 8
.limit locals 8
.end method

; symbol_table: 1 1 1 1 1 1 1 "ab" 
; type_table: i i i i i i i i 
; used_table: 1 1 1 1 1 1 1 "ab" 
