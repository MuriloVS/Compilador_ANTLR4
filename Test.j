.source Test.src
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Enter array size:"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

    invokestatic Runtime/readInt()I
    istore 0

    new Array
    dup
    invokespecial Array/<init>()V
    astore 1

    ldc 0
    istore 2


    BEGIN_WHILE_0:

    iload 2
    iload 0
    if_icmpge END_WHILE_0
    aload 1
    iload 2
    ldc 1
    iadd
    invokevirtual Array/push(I)V

    iload 2
    ldc 1
    iadd
    istore 2

    goto BEGIN_WHILE_0

    END_WHILE_0:

    getstatic java/lang/System/out Ljava/io/PrintStream;
    aload 1
    invokevirtual Array/string()Ljava/lang/String;
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

    aload 1
    ldc 2
    ldc 999
    invokevirtual Array/set(II)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    aload 1
    invokevirtual Array/string()Ljava/lang/String;
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

    return
.limit stack 11
.limit locals 3
.end method

; symbol_table: n a i 
; type_table: i a i 
; used_table: i n a 
