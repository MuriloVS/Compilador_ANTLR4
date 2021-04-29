.source Test.src
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

    ldc 2
    istore 0

    new Array
    dup
    invokespecial Array/<init>()V
    astore 1

    aload 1
    ldc 1
    invokevirtual Array/push(I)V

    ldc "Z"
    astore 2

    ldc 2
    ldc "X"
    aload 1
    aload 1
    ldc 2
    invokevirtual Array/set(II)V

    aload 1
    aload 2
    ldc 2
    invokevirtual Array/set(II)V

    aload 0
    ldc 0
    ldc 2
    invokevirtual Array/set(II)V

    aload 1
    ldc 0
    aload 1
    invokevirtual Array/set(II)V

    aload 1
    ldc 0
    aload 2
    invokevirtual Array/set(II)V

    aload 2
    ldc 0
    ldc 2
    invokevirtual Array/set(II)V

    aload -1
    ldc 0
    ldc 2
    invokevirtual Array/set(II)V

    aload 1
    aload 0
    ldc 0
    invokevirtual Array/get(I)I
    istore 0

    aload 2
    ldc 0
    invokevirtual Array/get(I)I
    istore 0

    aload -1
    ldc 0
    invokevirtual Array/get(I)I
    istore 0

    aload 0
    invokevirtual Array/length()I
    istore 0

    aload 2
    invokevirtual Array/length()I
    istore 0

    aload -1
    invokevirtual Array/length()I
    istore 0

    aload 1
    getstatic java/lang/System/out Ljava/io/PrintStream;
    aload 1
    aload 1
    iadd
    invokevirtual Array/string()Ljava/lang/String;
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    aload 1
    iload 0
    isub
    invokevirtual Array/string()Ljava/lang/String;
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 0
    aload 1
    imul
    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    aload 1
    aload 2
    idiv
    invokevirtual Array/string()Ljava/lang/String;
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc 8
    aload 1
    irem
    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V


    BEGIN_WHILE_0:

    aload 1
    ldc 2
    if_icmple END_WHILE_0
    ldc 1
    istore 0

    goto BEGIN_WHILE_0

    END_WHILE_0:

    ldc 2
    aload 1
    if_icmpgt NOT_IF_0
    ldc 2
    istore 0

    goto END_ELSE_0
NOT_IF_0:
END_ELSE_0:
    aload 1
    aload 1
    if_icmpne NOT_IF_1
    ldc 3
    istore 0

    goto END_ELSE_1
NOT_IF_1:
END_ELSE_1:
    return
.limit stack 5
.limit locals 3
.end method

; symbol_table: i a s 
; type_table: i a s 
; used_table: a s i 
