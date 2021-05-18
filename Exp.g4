grammar Exp;

/*---------------- COMPILER INTERNALS ----------------*/

@lexer::header {
    #pragma warning disable 3021
}

@parser::header {
    #pragma warning disable 3021
}

@parser::members {
    List<string> symbol_table = new List<string>();
    List<char> type_table = new List<char>();
    List<string> used_table = new List<string>();

    string params_modifier = "";
    string return_modifier = "";

    int stack_max = 0;
    int stack_curr = 0;
    
    int if_global = 0;
    // List<int> ifs = new List<int>();
   
    int while_global = 0;  
    List<int> whiles = new List<int>();  

    int arguments_global = 0;
    //List<int>arguments_local = new List<int>();

    List<string> functions_list = new List<string>();

    bool has_error = false;
    bool has_return = false;

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

COMMENT: '#' ~('\n')* -> skip;
SPACE: (' ' | '\t' | '\r' | '\n')+ -> skip;

PLUS: '+';
MINUS: '-';
TIMES: '*';
OVER: '/';
REM: '%';
OP_PAR: '(';
CL_PAR: ')';
ATTRIB: '=';
COMMA: ',';
OP_CUR: '{';
CL_CUR: '}';
EQ: '==';
NE: '!=';
GT: '>';
GE: '>=';
LT: '<';
LE: '<=';

PRINT: 'print';
READ_INT: 'read_int';
READ_STR: 'read_str';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
BREAK: 'break';
CONTINUE: 'continue';

PUSH: 'push';
LENGTH: 'length';
OP_BRA: '[';
CL_BRA: ']';
DOT: '.';

DEF: 'def';
INT: 'int';
RETURN: 'return';

NUMBER: '0' ..'9'+;
NAME: 'a' ..'z'+;
STRING: '"' ~('"')* '"';

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
    } (function)* main;

function:
	DEF NAME OP_PAR (parameters)? CL_PAR (
		INT {
        has_return = true;
    }
	)? {
        for (int i = 0; i < symbol_table.Count; i++) {
            params_modifier += "I";
        }

        return_modifier = has_return ? "I" : "V";
        
        string func_name = $NAME.text + "(" + params_modifier + ")" + return_modifier;

        if (functions_list.Contains(func_name)) {
            Console.Error.WriteLine("# error - function '" + $NAME.text + "' already declared - line " + $NAME.line);             
            has_error = true;
        } else {
            functions_list.Add(func_name);
            System.Console.WriteLine(".method public static " + func_name + "\n"); 
        }
    } OP_CUR (statement)* CL_CUR {
        // if (has_return) {
        //     Emit("ireturn", -1);
        //     has_return = false;
        // }

        System.Console.WriteLine("\n    return");
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
        System.Console.WriteLine("\n");

        params_modifier = "";
        symbol_table.Clear();
        type_table.Clear();
        used_table.Clear();
        stack_curr = 0;
        stack_max = 0;
    };

parameters:
	NAME {
        if (!symbol_table.Contains($NAME.text)) {
            symbol_table.Add($NAME.text);
            used_table.Add($NAME.text);
            type_table.Add('i');
        } else {
            Console.Error.WriteLine("# error: parameter names must be unique - line " + $NAME.line);    
            has_error = true;
        }
    } (
		COMMA NAME {
        if (!symbol_table.Contains($NAME.text)) {
            symbol_table.Add($NAME.text);
            used_table.Add($NAME.text);
            type_table.Add('i');
        } else {
            Console.Error.WriteLine("# error: parameter names must be unique - line " + $NAME.line); 
            has_error = true;
        }
    }
	)*;

main:
	{
        System.Console.WriteLine(".method public static main([Ljava/lang/String;)V\n");               
    } (statement)+ {
        foreach (string s in symbol_table)
        {
            if (!used_table.Contains(s))
            {
                Console.Error.WriteLine("# error: variable not used: '" + s + "'");             
                has_error = true;
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

        if (has_error) {
            System.Environment.Exit(1);
        }
    };

statement:
	st_print
	| st_attib
	| st_if
	| st_while
	| st_break
	| st_continue
	| st_array_new
	| st_array_push
	| st_array_set
	| st_call
	| st_return;

st_print:
	PRINT OP_PAR {
        Emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1);
    } e1 = expression {
        if ($e1.type == 'i') {
            Emit("invokevirtual java/io/PrintStream/print(I)V", -2);
        } else if ($e1.type == 's') {
            Emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", -2);        
        } else if ($e1.type == 'a') {
            Emit("invokevirtual Array/string()Ljava/lang/String;", 0);        
            Emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", 0);        
        } else {
            Console.Error.WriteLine("# error: type error in 'e1' expression.\n");         
            has_error = true;
        }
    } (
		COMMA {
        Emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1);
    } e2 = expression {
        if ($e2.type == 'i') {
            Emit("invokevirtual java/io/PrintStream/print(I)V", -2);
        } else if ($e2.type == 's') {
            Emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", 1);        
        } else {
            Console.Error.WriteLine("# error: type error in 'e2' expression\n");         
            has_error = true;
        }
    }
	)* CL_PAR {
        Emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1);
        Emit("invokevirtual java/io/PrintStream/println()V\n", -1);
    };

st_if:
	IF comparison {
        int if_local = if_global;
        if_global++;        
        Emit("NOT_IF_" + if_local, -2); 
    } OP_CUR (statement)+ CL_CUR {
        Emit("goto END_ELSE_" + if_local, 0);
        System.Console.WriteLine("NOT_IF_" + if_local + ":");
    } (ELSE OP_CUR ( statement)+ CL_CUR)? {       
        System.Console.WriteLine("END_ELSE_" + if_local + ":");
    };

st_while:
	WHILE {     
        whiles.Add(while_global);
        while_global++;    
        
        System.Console.WriteLine("\n    BEGIN_WHILE_" + whiles[whiles.Count - 1] + ":\n");        
    } comparison {
        Emit("END_WHILE_" + whiles[whiles.Count - 1], 0); 
    } OP_CUR (statement)+ {
        if (whiles.Count > 0) {
            Emit("goto BEGIN_WHILE_" + whiles[whiles.Count - 1], 0);        
            System.Console.WriteLine("\n    END_WHILE_" + whiles[whiles.Count - 1] + ":\n");
            whiles.RemoveAt(whiles.Count - 1);
        }        
    } CL_CUR;

st_break:
	BREAK {
        if (whiles.Count == 0) {
            Console.Error.WriteLine("# error: trying to use 'break' outside a loop.");         
            has_error = true;
        } else {
            Emit("goto END_WHILE_" +  whiles[whiles.Count - 1], 0);
        }
    };

st_continue:
	CONTINUE {
        if (whiles.Count == 0) {
            Console.Error.WriteLine("# error: trying to use 'continue' outside a loop.");         
            has_error = true;
        } else {
            Emit("goto BEGIN_WHILE_" + whiles[whiles.Count - 1], 0);
        }
    };

st_array_new:
	NAME ATTRIB OP_BRA CL_BRA {
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
            has_error = true;
        }        
    };

st_array_push:
	NAME {   
        if (!symbol_table.Contains($NAME.text)) {
            Console.Error.WriteLine("# error: variable '" + $NAME.text + "' does not exist - line " + $NAME.line);         
            has_error = true;
        }

        if (!used_table.Contains($NAME.text)) {
            used_table.Add($NAME.text); 
        }
        int index = symbol_table.IndexOf($NAME.text);                    
        Emit("aload " + index, 1);        
    } DOT PUSH OP_PAR expression {   
        Emit("invokevirtual Array/push(I)V\n", -2);        
    } CL_PAR;

st_array_set:
	NAME {
        if (!symbol_table.Contains($NAME.text)) {
            Console.Error.WriteLine("# error: '" + $NAME.text + "' not defined - line " + $NAME.line);
            has_error = true;
        } else {
            int index = symbol_table.IndexOf($NAME.text);
            char type = type_table[index];
            if (type != 'a') {
                Console.Error.WriteLine("# error: '" + $NAME.text + "' is not array - line " + $NAME.line);  
                has_error = true;                  
            } else {
                Emit("aload " + index, -1);      
            }
        }
    } OP_BRA e1 = expression CL_BRA ATTRIB e2 = expression {              
        if ($e1.type != 'i') {
            Console.Error.WriteLine("# error: array index must be integer - line " + $NAME.line);         
            has_error = true;
        } else if ($e2.type != 'i') {
            Console.Error.WriteLine("# error: '" + $NAME.text + "' is array - line " + $NAME.line);         
            has_error = true;        
        }

        Emit("invokevirtual Array/set(II)V\n", -3);        
    };

st_attib:
	NAME ATTRIB expression {
        if (!symbol_table.Contains($NAME.text)) {
            symbol_table.Add($NAME.text);
            type_table.Add($expression.type);            
        }
        
        int index = symbol_table.IndexOf($NAME.text);
        char type = type_table[index];

        if (type == 'a') {
            Console.Error.WriteLine("# error: '" + $NAME.text + "' is integer - line " + $NAME.line);
            has_error = true;
        } else if (type == 'i') {
            if ($expression.type == type) {
                Emit("istore " + index, -1);
            } else {
                Console.Error.WriteLine("# error: '" + $NAME.text + "' is integer - line " + $NAME.line);
                has_error = true;
            }            
        } else if (type == 's') {
            if ($expression.type == type) {
                Emit("astore " + index + "\n", -1);
            } else {
                Console.Error.WriteLine("# error: '" + $NAME.text + "' is string  - line " + $NAME.line);
                has_error = true;
            }             
        } else {
            Console.Error.WriteLine("# error: '" + $NAME.text + "' is array - line " + $NAME.line);         
            has_error = true;
        }        
    };

comparison:
	e1 = expression op = (EQ | NE | GT | GE | LT | LE) e2 = expression {
        if ($e1.type != 'i' || $e2.type  != 'i') {
            Console.Error.WriteLine("# error: cannot mix types - comparison - line " + $op.line);         
            has_error = true;
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

expression
	returns[char type]:
	t1 = term (
		op = (PLUS | MINUS) t2 = term {
        if ($t1.type != 'i' || $t2.type != 'i') {
            Console.Error.WriteLine("# error: cannot mix types - plus or minus - line " + $op.line);         
            has_error = true;
        }
        if ($op.type == PLUS ) {
            Emit("iadd", -1);
        } else {
            Emit("isub", -1);
        }        
    }
	)* {
        $type = $t1.type;
    };

term
	returns[char type]:
	f1 = factor (
		op = (TIMES | OVER | REM) f2 = factor {
        if ($f1.type != 'i' || $f2.type != 'i') {
            Console.Error.WriteLine("# error: cannot mix types - times, over or rem - line " + $op.line);         
            has_error = true;
        }
        if ($op.type == TIMES ) {
            Emit("imul", -1);
        } else if ($op.type == OVER ) {
            Emit("idiv", -1);
        } else {
            Emit("irem", -1);
        }
    }
	)* {
        $type = $f1.type;
    };

factor
	returns[char type]:
	NUMBER {
        Emit("ldc " + $NUMBER.text, 1);
        $type = 'i';
    }
	| STRING {
        Emit("ldc " + $STRING.text, 1);
        $type = 's';
    }
	| OP_PAR expression CL_PAR {
        $type = $expression.type;
    }
	| NAME {
        if (!symbol_table.Contains($NAME.text)) {
            Console.Error.WriteLine("# error: variable not declared: '" + $NAME.text + "'");         
            has_error = true;
        } else {
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
                Console.Error.WriteLine("# error: type error in factor - line " + $NAME.line);         
                has_error = true;
            }
        }
    }
	| READ_INT OP_PAR CL_PAR {
        Emit("invokestatic Runtime/readInt()I", 1);
        $type = 'i';
    }
	| READ_STR OP_PAR CL_PAR {
        Emit("invokestatic Runtime/readString()Ljava/lang/String;", 1);        
        $type = 's';
    }
	| NAME {
        if (!symbol_table.Contains($NAME.text)) {
            Console.Error.WriteLine("# error: '" + $NAME.text + "' not defined - line " + $NAME.line);
            has_error = true;
        } else {
            int index = symbol_table.IndexOf($NAME.text);
            char type = type_table[index];

            if (type != 'a') {
                Console.Error.WriteLine("# error: '" + $NAME.text + "' is not array - line " + $NAME.line);
                has_error = true;
            } else {
                Emit("aload " + index, 1);        
            }
        }        
    } DOT LENGTH {       
        Emit("invokevirtual Array/length()I", 0);                
        $type = 'i';     
    }
	| NAME {
        if (!symbol_table.Contains($NAME.text)) {
            Console.Error.WriteLine("# error: '" + $NAME.text + "' not defined - line " + $NAME.line);
            has_error = true;
        } else {
            int index = symbol_table.IndexOf($NAME.text);
            char type = type_table[index];
            if (type != 'a') {
                Console.Error.WriteLine("# error: '" + $NAME.text + "' is not array - line " + $NAME.line);
                has_error = true;
            } else {
                Emit("aload " + index, 1);
            }
        }
    } OP_BRA expression CL_BRA {   
        Emit("invokevirtual Array/get(I)I", -1);        
        $type = 'i';   
    }
	| NAME OP_PAR (arguments)? {       
        params_modifier = "";

        for (int i = 0; i < arguments_global; i++) {
            params_modifier += "I";
        }
        
        int aux = arguments_global;        
         
        string function_name = $NAME.text + "(" + params_modifier + ")I";        
        
        arguments_global = 0;      
    } CL_PAR {              
        if (!functions_list.Contains(function_name)) {            
            Console.Error.WriteLine("# error: function '" + function_name + "' was never declared or wrong number of arguments - line " + $NAME.line);
            has_error = true;
        } else {
            Emit("invokestatic Test/" + function_name + "\n", -aux + 1);            
        }
        
        $type = 'i';
    };

st_call:
	NAME OP_PAR (arguments)? {
        params_modifier = "";

        for (int i = 0; i < arguments_global; i++) {
            params_modifier += "I";
        }        

        int aux = arguments_global;
        
        string function_name = $NAME.text + "(" + params_modifier + ")V";    

        arguments_global = 0;        
    } CL_PAR {
        if (!functions_list.Contains(function_name)) {            
            Console.Error.WriteLine("# error: function '" + function_name + "' was never declared or wrong number of arguments - line " + $NAME.line);
            has_error = true;
        } else {
            Emit("invokestatic Test/" + function_name + "\n", -aux);
        }
    };

arguments:
	e1 = expression { 
        if ($e1.type != 'i') {
            Console.Error.WriteLine("# error: all arguments must be integer");
            has_error = true;
        } else {
            symbol_table.Add($e1.text);
            used_table.Add($e1.text);
            type_table.Add('i');        
        }
        arguments_global++;
    } (
		COMMA e2 = expression {        
            if ($e2.type != 'i') {
                Console.Error.WriteLine("# error: all arguments must be integer");
                has_error = true;
            } else {
                symbol_table.Add($e1.text);
                used_table.Add($e1.text);
                type_table.Add('i');        
            }
            arguments_global++;
        }
	)*;

st_return:
	RETURN e1 = expression {
        if ($e1.type != 'i') {
            Console.Error.WriteLine("# error: return value must be of integer type");
            has_error = true;
        } else {
            Emit("ireturn", 0); 
        }
    };