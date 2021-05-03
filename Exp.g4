grammar Exp;

/*---------------- COMPILER INTERNALS ----------------*/

@lexer::header  {
    #pragma warning disable 3021
}

@parser::header {
    #pragma warning disable 3021
}

@parser::members
{
    List<string> symbol_table = new List<string>();
    List<char> type_table = new List<char>();
    List<string> used_table = new List<string>();

    int stack_max = 0;
    int stack_curr = 0;
    
    int if_global = 0;
    // int has_else = 0;
    // int else_global = 0;
   
    int while_break_continue = 0;
    int while_global = 0;
    bool inside_while = false;

    List<int> else_local = new List<int>();

    void Emit(string s, int n)
    {
        stack_curr += n;

        if (stack_curr > stack_max) {
            stack_max = stack_curr;
        }

        // if só para melhorar o visual, o espaço extra não influenciava em nada
        if(s[0] != 'N' && s[0] != 'B' && s[0] != 'E') {
            System.Console.WriteLine("    " + s);
        } else {
            System.Console.WriteLine(s);
        }
    }
}

/*---------------- LEXER RULES ----------------*/

COMMENT: '#' ~('\n')*          -> skip ;
SPACE  : (' '|'\t'|'\r'|'\n')+ -> skip ;

PLUS  : '+' ;
MINUS : '-' ;
TIMES : '*' ;
OVER  : '/' ;
REM   : '%' ;
OP_PAR: '(' ;
CL_PAR: ')' ;
ATTRIB: '=' ;
COMMA : ',' ;
OP_CUR: '{' ;
CL_CUR: '}' ;
EQ    : '==' ;
NE    : '!=' ;
GT    : '>'  ;
GE    : '>=' ;
LT    : '<'  ;
LE    : '<=' ;


PRINT   : 'print' ;
READ_INT: 'read_int' ;
READ_STR: 'read_str' ;
IF      : 'if' ;
ELSE    : 'else' ;
WHILE   : 'while' ;
BREAK   : 'break' ;
CONTINUE: 'continue' ;

PUSH    : 'push' ;
LENGTH  : 'length' ;
OP_BRA   : '[';
CL_BRA   : ']';
DOT   : '.'  ;

NUMBER: '0'..'9'+ ;
NAME  : 'a'..'z'+ ;
STRING: '"'~('"')*'"' ;

/*---------------- PARSER RULES ----------------*/

program:
    {
        System.Console.WriteLine(".source Test.src");
        System.Console.WriteLine(".class  public Test");
        System.Console.WriteLine(".super  java/lang/Object\n");
        System.Console.WriteLine(".method public <init>()V");
        System.Console.WriteLine("    aload_0");
        System.Console.WriteLine("    invokenonvirtual java/lang/Object/<init>()V");
        System.Console.WriteLine("    return");
        System.Console.WriteLine(".end method\n");
    }
    main ;

main:
    {
        System.Console.WriteLine(".method public static main([Ljava/lang/String;)V\n");               
    }
    ( statement )+
    {
        foreach (string s in symbol_table)
        {
            if (!used_table.Contains(s))
            {                
                Console.Error.WriteLine("\nERROR - variable not used: '" + s + "'\n");             
                ////System.Environment.Exit(1);
            }
        }        

        System.Console.WriteLine("    return");
        System.Console.WriteLine(".limit stack " + stack_max); 
              
        if (symbol_table.Count > 0) {
            System.Console.WriteLine(".limit locals " + symbol_table.Count);
        }    

        System.Console.WriteLine(".end method");
        System.Console.Write("\n; symbol_table: ");
        foreach (string s in symbol_table) {
             System.Console.Write(s + " ");
        }
        System.Console.Write("\n; type_table: ");
        foreach (char c in type_table) {
             System.Console.Write(c + " ");
        }        
        System.Console.Write("\n; used_table: ");
        foreach (string s in used_table) {
             System.Console.Write(s + " ");
        }
    }
    ;

statement: st_print | st_attib | st_if | st_while | st_break | st_continue |
           st_array_new | st_array_push | st_array_set ; 

st_print: PRINT OP_PAR
    {
        Emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1);
    }    
    e1 = expression   
    {
        if ($e1.type == 'i') {
            Emit("invokevirtual java/io/PrintStream/print(I)V", -2);
        } else if ($e1.type == 's') {
            Emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", -2);        
        } else if ($e1.type == 'a') {            
            Emit("invokevirtual Array/string()Ljava/lang/String;", 0);        
            Emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", 0);        
        } else {
            Console.Error.WriteLine("teste: " + $e1.type);            
            Console.Error.WriteLine("\nERROR - Type error in 'e1'.\n");         
            ////System.Environment.Exit(1);
        }
    }    
    ( COMMA 
    {
        Emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1);
    }
    e2 = expression
    {
        if ($e2.type == 'i') {
            Emit("invokevirtual java/io/PrintStream/print(I)V", -2);
        } else if ($e2.type == 's') {
            Emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", 1);        
        } else {
            Console.Error.WriteLine("\nERROR - Type error in 'e2'.\n");         
            ////System.Environment.Exit(1);
        }
    }
    )*
    CL_PAR
    {
        Emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1);
        Emit("invokevirtual java/io/PrintStream/println()V\n", -1);
    };

st_if: IF comparison
    {
        int if_local = if_global;
        if_global++;        
        Emit("NOT_IF_" + if_local, -2); 
    }
    OP_CUR ( statement )+ CL_CUR 
    {
        Emit("goto END_ELSE_" + if_local, 0);
        System.Console.WriteLine("NOT_IF_" + if_local + ":");
    }
    ( ELSE OP_CUR ( statement )+ CL_CUR )?
    {       
        System.Console.WriteLine("END_ELSE_" + if_local + ":");
    };  


st_while: WHILE
    {
        inside_while = true;
        int while_local = while_global;
        while_break_continue = while_local;
        while_global++;       
        System.Console.WriteLine("\n    BEGIN_WHILE_" + while_local + ":\n");
    }
    comparison
    {
        Emit("END_WHILE_" + while_local, 0); 
    }
    OP_CUR ( statement )+ CL_CUR
    {
        Emit("goto BEGIN_WHILE_" + while_local, 0);
        System.Console.WriteLine("\n    END_WHILE_" + while_local + ":\n");
        inside_while = false;
    };

st_break: BREAK
    {
        if (!inside_while) {
            Console.Error.WriteLine("\nERROR - Trying to use 'break' outside a loop.\n");         
            //System.Environment.Exit(1);
        }
        
        Emit("goto END_WHILE_" +  while_break_continue, 0);
    };

st_continue: CONTINUE
    {
        if (!inside_while) {
            Console.Error.WriteLine("ERROR - Trying to use 'continue' outside a loop.\n");         
            //System.Environment.Exit(1);
        }

        Emit("goto BEGIN_WHILE_" + while_break_continue, 0);
    };

st_array_new: NAME ATTRIB OP_BRA CL_BRA
    {
        if (!symbol_table.Contains($NAME.text)) {
            symbol_table.Add($NAME.text);
            type_table.Add('a');

            Emit("new Array", 1);
            Emit("dup", 1);
            Emit("invokespecial Array/<init>()V", -1);

            int index = symbol_table.IndexOf($NAME.text);
            Emit("astore " + index + "\n", 1);            
        } else {
            Console.Error.WriteLine("# error: '" + $NAME.text + "' is already declared - line " + $NAME.line);         
            //System.Environment.Exit(1);
        }        
    };

st_array_push: NAME
    {   
        if (!symbol_table.Contains($NAME.text)) {
            Console.Error.WriteLine("\nERROR - Variable does not exist - 'st_array_push' expression.\n");         
            //System.Environment.Exit(1);
        }

        if (!used_table.Contains($NAME.text)) {
            used_table.Add($NAME.text); 
        }
        int index = symbol_table.IndexOf($NAME.text);                    
        Emit("aload " + index, 1);        
    }
    DOT PUSH OP_PAR expression 
    {   
        Emit("invokevirtual Array/push(I)V\n", -2);        
    }
    CL_PAR;
    

st_array_set: NAME
    {
        int index = symbol_table.IndexOf($NAME.text);                    
        Emit("aload " + index, -1);      
    }
    OP_BRA e1 = expression CL_BRA ATTRIB e2 = expression
    {              
        if ($e1.type != 'i') {
            Console.Error.WriteLine("# error: array index must be integer - line " + $NAME.line);         
        } else if ($e2.type != 'i') {
            Console.Error.WriteLine("# error: '" + $NAME.text + "' is array - line " + $NAME.line);         
            //System.Environment.Exit(1);
        // } else if ($e2.type != 'i') {
        //     Console.Error.WriteLine("# error: cannot mix types - array element assignement");         
        //     //System.Environment.Exit(1);
        }

        Emit("invokevirtual Array/set(II)V\n", -3);        
    };

st_attib: NAME ATTRIB expression
    {
        if (!symbol_table.Contains($NAME.text)) {
            symbol_table.Add($NAME.text);
            type_table.Add($expression.type);            
        }
        
        int index = symbol_table.IndexOf($NAME.text);
        char type = type_table[index];
        
        if (type == 'i') {
            if ($expression.type == type) {
                Emit("istore " + index + "\n", -1);
            } else {
                Console.Error.WriteLine("# error: '" + $NAME.text + "' is integer");
                //System.Environment.Exit(1);
            }            
        } else if (type == 's') {
            if ($expression.type == type) {
                Emit("astore " + index + "\n", -1);
            } else {
                Console.Error.WriteLine("# error: '" + $NAME.text + "' is string");
                //System.Environment.Exit(1);
            }             
        } else {
            Console.Error.WriteLine("# error: " + $NAME.text + "' is array - line " + $NAME.line);         
            ////System.Environment.Exit(1);
        }        
    };


comparison: e1 = expression op = ( EQ | NE | GT | GE | LT | LE ) e2 = expression
    {
        if ($e1.type != 'i' || $e2.type  != 'i') {
            Console.Error.WriteLine("# error: cannot mix types - comparison");         
            //System.Environment.Exit(1);
        }
        if ($op.type == EQ) {            
            System.Console.Write("    if_icmpne ");          
        } else if ($op.type == NE) {
            System.Console.Write("    if_icmpeq ");          
        } else if ($op.type == GT) {
            System.Console.Write("    if_icmple ");          
        } else if ($op.type == GE) {
            System.Console.Write("    if_icmplt ");          
        } else if ($op.type == LT) {
            System.Console.Write("    if_icmpge ");          
        } else if ($op.type == LE) {
            System.Console.Write("    if_icmpgt ");          
        }
    };

expression returns [char type] : t1 = term ( op = ( PLUS | MINUS ) t2 = term
    {
        if ($t1.type != 'i' || $t2.type != 'i') {
            Console.Error.WriteLine("# error: cannot mix types - plus or minus");         
            ////System.Environment.Exit(1);
        }
        if ($op.type == PLUS ) {
            Emit("iadd", -1);
        } else {
            Emit("isub", -1);
        }        
    }
    )*
    {
        $type = $t1.type;
    };

term returns [char type]: f1 = factor ( op = ( TIMES | OVER | REM ) f2 = factor
    {
        if ($f1.type != 'i' || $f2.type != 'i') {
            Console.Error.WriteLine("# error: cannot mix types - times, over or rem");         
            //System.Environment.Exit(1);
        }
        if ($op.type == TIMES ) {
            Emit("imul", -1);
        } else if ($op.type == OVER ) {
            Emit("idiv", -1);
        } else {
            Emit("irem", -1);
        }
    }
    )*
    {
        $type = $f1.type;
    };

factor returns [char type]: 
    NUMBER
    {
        Emit("ldc " + $NUMBER.text, 1);
        $type = 'i';
    }
    | STRING
    {
        Emit("ldc " + $STRING.text, 1);
        $type = 's';
    }
    | OP_PAR expression CL_PAR
    {
        $type = $expression.type;
    }
    | NAME
    {
        if (!symbol_table.Contains($NAME.text)) {
            Console.Error.WriteLine("\nERROR - variable not found: '" + $NAME.text + "'\n");         
            //System.Environment.Exit(1);
        }       

        // vai auxiliar no controle das variáveis usadas        
        if (!used_table.Contains($NAME.text)) {
            used_table.Add($NAME.text); 
        }

        int index = symbol_table.IndexOf($NAME.text);            
        char type = type_table[index];

        if (type == 'i') {
            Emit("iload " + index, 1);
            $type = 'i';
        } else if (type == 's') {
            Emit("aload " + index, 1);
            $type = 's';
         } else if (type == 'a') {
            Emit("aload " + index, 1);
            $type = 'a';
        } else {
            Console.Error.WriteLine("\nERROR - Type error in factor NAME.\n");         
            ////System.Environment.Exit(1);
        }       
    }
    | READ_INT OP_PAR CL_PAR
    {
        Emit("invokestatic Runtime/readInt()I", 1);
        $type = 'i';
    }
    | READ_STR OP_PAR CL_PAR
    {
        Emit("invokestatic Runtime/readString()Ljava/lang/String;", 1);        
        $type = 's';
    }
    | NAME
    {
        int index = symbol_table.IndexOf($NAME.text); 
        Emit("aload " + index, -1);        
    }
    DOT LENGTH
    {       
        Emit("invokevirtual Array/length()I", 0);                
        $type = 'i';     
    }
    | NAME
    {
        if (!symbol_table.Contains($NAME.text)) {
            Console.Error.WriteLine("# error: '" + $NAME.text + "' not defined - line " + $NAME.line);
        } else {
            int index = symbol_table.IndexOf($NAME.text);
            char type = type_table[index];
            if (type != 'a') {
                Console.Error.WriteLine("# error: '" + $NAME.text + "' is not array - line " + $NAME.line);
            }
            Emit("aload " + index, -1);
        }
        
    }
    OP_BRA expression CL_BRA
    {   
        Emit("invokevirtual Array/get(I)I", -1);        
        $type = 'i';   
    };
 