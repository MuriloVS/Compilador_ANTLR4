// Generated from c:\Users\mvs_r\OneDrive\Documents\GitHub\3 - Compiladores\Compilador_ANTLR4\Exp.g4 by ANTLR 4.8

    #pragma warning disable 3021

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, SPACE=2, PLUS=3, MINUS=4, TIMES=5, OVER=6, REM=7, OP_PAR=8, 
		CL_PAR=9, ATTRIB=10, COMMA=11, OP_CUR=12, CL_CUR=13, EQ=14, NE=15, GT=16, 
		GE=17, LT=18, LE=19, PRINT=20, READ_INT=21, READ_STR=22, IF=23, ELSE=24, 
		WHILE=25, BREAK=26, CONTINUE=27, PUSH=28, LENGTH=29, OP_BRA=30, CL_BRA=31, 
		DOT=32, DEF=33, NUMBER=34, NAME=35, STRING=36;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_parameters = 2, RULE_main = 3, 
		RULE_statement = 4, RULE_st_print = 5, RULE_st_if = 6, RULE_st_while = 7, 
		RULE_st_break = 8, RULE_st_continue = 9, RULE_st_array_new = 10, RULE_st_array_push = 11, 
		RULE_st_array_set = 12, RULE_st_attib = 13, RULE_comparison = 14, RULE_expression = 15, 
		RULE_term = 16, RULE_factor = 17, RULE_st_call = 18, RULE_arguments = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "parameters", "main", "statement", "st_print", 
			"st_if", "st_while", "st_break", "st_continue", "st_array_new", "st_array_push", 
			"st_array_set", "st_attib", "comparison", "expression", "term", "factor", 
			"st_call", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", 
			"','", "'{'", "'}'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'print'", 
			"'read_int'", "'read_str'", "'if'", "'else'", "'while'", "'break'", "'continue'", 
			"'push'", "'length'", "'['", "']'", "'.'", "'def'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "SPACE", "PLUS", "MINUS", "TIMES", "OVER", "REM", "OP_PAR", 
			"CL_PAR", "ATTRIB", "COMMA", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", 
			"LT", "LE", "PRINT", "READ_INT", "READ_STR", "IF", "ELSE", "WHILE", "BREAK", 
			"CONTINUE", "PUSH", "LENGTH", "OP_BRA", "CL_BRA", "DOT", "DEF", "NUMBER", 
			"NAME", "STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Exp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    List<string> symbol_table = new List<string>();
	    List<char> type_table = new List<char>();
	    List<string> used_table = new List<string>();

	    string func_modifier = "";

	    int stack_max = 0;
	    int stack_curr = 0;
	    
	    int if_global = 0;
	    // int has_else = 0;
	    // int else_global = 0;

	    int while_break_continue = 0;
	    int while_global = 0;
	    bool inside_while = false;

	    int arguments_count = 0;
	    int parameters_count = 0;

	    List<int> else_local = new List<int>();

	    List<string> functions_list = new List<string>();

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

	public ExpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        System.Console.WriteLine(".source Test.src");
			        System.Console.WriteLine(".class  public Test");
			        System.Console.WriteLine(".super  java/lang/Object\n");
			        System.Console.WriteLine(".method public <init>()V");
			        System.Console.WriteLine("    aload_0");
			        System.Console.WriteLine("    invokenonvirtual java/lang/Object/<init>()V");
			        System.Console.WriteLine("    return");
			        System.Console.WriteLine(".end method\n");
			    
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(41);
				function();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Token NAME;
		public TerminalNode DEF() { return getToken(ExpParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode OP_PAR() { return getToken(ExpParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(ExpParser.CL_PAR, 0); }
		public TerminalNode OP_CUR() { return getToken(ExpParser.OP_CUR, 0); }
		public TerminalNode CL_CUR() { return getToken(ExpParser.CL_CUR, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(DEF);
			setState(50);
			((FunctionContext)_localctx).NAME = match(NAME);
			setState(51);
			match(OP_PAR);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(52);
				parameters();
				}
			}


			        // declarando duas vezes a mesma função
			        // Console.Error.WriteLine(symbol_table.Count);
			        if (functions_list.Contains((((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null))) {                
			            Console.Error.WriteLine("# error - function '" + (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + "' already declared - line " + (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getLine():0));             
			            // System.Environment.Exit(1);
			        } else {
			            for (int i = 0; i < symbol_table.Count; i++) {
			                func_modifier += "I";
			            }

			            string func_name = (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + "(" + func_modifier + ")V";
			            functions_list.Add(func_name);

			            System.Console.WriteLine(".method public static " + func_name+ "\n"); 
			        }        
			    
			setState(56);
			match(CL_PAR);
			setState(57);
			match(OP_CUR);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				statement();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << NAME))) != 0) );
			setState(63);
			match(CL_CUR);

			        // limpar as tabelas aqui   
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
			        System.Console.WriteLine("\n");

			        func_modifier = "";
			        symbol_table.Clear();
			        type_table.Clear();
			        used_table.Clear();
			        stack_curr = 0;
			        stack_max = 0;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public Token NAME;
		public List<TerminalNode> NAME() { return getTokens(ExpParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ExpParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExpParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			((ParametersContext)_localctx).NAME = match(NAME);
			        
			        if (!symbol_table.Contains((((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null))) {
			            symbol_table.Add((((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null));
			            used_table.Add((((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null));
			            type_table.Add('i');
			        } 
			    
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(68);
				match(COMMA);
				setState(69);
				((ParametersContext)_localctx).NAME = match(NAME);

				        if (!symbol_table.Contains((((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null))) {
				            symbol_table.Add((((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null));
				            used_table.Add((((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null));
				            type_table.Add('i');
				        }
				    
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        // Console.Error.WriteLine("parametros no final de parameters " + symbol_table.Count);       
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        System.Console.WriteLine(".method public static main([Ljava/lang/String;)V\n");               
			    
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				statement();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << NAME))) != 0) );

			        foreach (string s in symbol_table)
			        {
			            if (!used_table.Contains(s))
			            {                
			                Console.Error.WriteLine("ERROR - variable not used: '" + s + "'");             
			                // System.Environment.Exit(1);
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public St_printContext st_print() {
			return getRuleContext(St_printContext.class,0);
		}
		public St_attibContext st_attib() {
			return getRuleContext(St_attibContext.class,0);
		}
		public St_ifContext st_if() {
			return getRuleContext(St_ifContext.class,0);
		}
		public St_whileContext st_while() {
			return getRuleContext(St_whileContext.class,0);
		}
		public St_breakContext st_break() {
			return getRuleContext(St_breakContext.class,0);
		}
		public St_continueContext st_continue() {
			return getRuleContext(St_continueContext.class,0);
		}
		public St_array_newContext st_array_new() {
			return getRuleContext(St_array_newContext.class,0);
		}
		public St_array_pushContext st_array_push() {
			return getRuleContext(St_array_pushContext.class,0);
		}
		public St_array_setContext st_array_set() {
			return getRuleContext(St_array_setContext.class,0);
		}
		public St_callContext st_call() {
			return getRuleContext(St_callContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				st_print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				st_attib();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				st_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				st_while();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				st_break();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				st_continue();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				st_array_new();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				st_array_push();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(94);
				st_array_set();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(95);
				st_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_printContext extends ParserRuleContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode PRINT() { return getToken(ExpParser.PRINT, 0); }
		public TerminalNode OP_PAR() { return getToken(ExpParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(ExpParser.CL_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExpParser.COMMA, i);
		}
		public St_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_print; }
	}

	public final St_printContext st_print() throws RecognitionException {
		St_printContext _localctx = new St_printContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_st_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(PRINT);
			setState(99);
			match(OP_PAR);

			        Emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1);
			    
			setState(101);
			((St_printContext)_localctx).e1 = expression();

			        if (((St_printContext)_localctx).e1.type == 'i') {
			            Emit("invokevirtual java/io/PrintStream/print(I)V", -2);
			        } else if (((St_printContext)_localctx).e1.type == 's') {
			            Emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", -2);        
			        } else if (((St_printContext)_localctx).e1.type == 'a') {            
			            Emit("invokevirtual Array/string()Ljava/lang/String;", 0);        
			            Emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", 0);        
			        } else {
			            Console.Error.WriteLine("teste: " + ((St_printContext)_localctx).e1.type);            
			            Console.Error.WriteLine("\nERROR - Type error in 'e1'.\n");         
			            //System.Environment.Exit(1);
			        }
			    
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(103);
				match(COMMA);

				        Emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1);
				    
				setState(105);
				((St_printContext)_localctx).e2 = expression();

				        if (((St_printContext)_localctx).e2.type == 'i') {
				            Emit("invokevirtual java/io/PrintStream/print(I)V", -2);
				        } else if (((St_printContext)_localctx).e2.type == 's') {
				            Emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", 1);        
				        } else {
				            Console.Error.WriteLine("\nERROR - Type error in 'e2'.\n");         
				            //System.Environment.Exit(1);
				        }
				    
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(CL_PAR);

			        Emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1);
			        Emit("invokevirtual java/io/PrintStream/println()V\n", -1);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ExpParser.IF, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public List<TerminalNode> OP_CUR() { return getTokens(ExpParser.OP_CUR); }
		public TerminalNode OP_CUR(int i) {
			return getToken(ExpParser.OP_CUR, i);
		}
		public List<TerminalNode> CL_CUR() { return getTokens(ExpParser.CL_CUR); }
		public TerminalNode CL_CUR(int i) {
			return getToken(ExpParser.CL_CUR, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ExpParser.ELSE, 0); }
		public St_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_if; }
	}

	public final St_ifContext st_if() throws RecognitionException {
		St_ifContext _localctx = new St_ifContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_st_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(IF);
			setState(117);
			comparison();

			        int if_local = if_global;
			        if_global++;        
			        Emit("NOT_IF_" + if_local, -2); 
			    
			setState(119);
			match(OP_CUR);
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				statement();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << NAME))) != 0) );
			setState(125);
			match(CL_CUR);

			        Emit("goto END_ELSE_" + if_local, 0);
			        System.Console.WriteLine("NOT_IF_" + if_local + ":");
			    
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(127);
				match(ELSE);
				setState(128);
				match(OP_CUR);
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					statement();
					}
					}
					setState(132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << NAME))) != 0) );
				setState(134);
				match(CL_CUR);
				}
			}

			       
			        System.Console.WriteLine("END_ELSE_" + if_local + ":");
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ExpParser.WHILE, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode OP_CUR() { return getToken(ExpParser.OP_CUR, 0); }
		public TerminalNode CL_CUR() { return getToken(ExpParser.CL_CUR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public St_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_while; }
	}

	public final St_whileContext st_while() throws RecognitionException {
		St_whileContext _localctx = new St_whileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_st_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(WHILE);

			        inside_while = true;
			        int while_local = while_global;
			        while_break_continue = while_local;
			        while_global++;       
			        System.Console.WriteLine("\n    BEGIN_WHILE_" + while_local + ":\n");
			    
			setState(142);
			comparison();

			        Emit("END_WHILE_" + while_local, 0); 
			    
			setState(144);
			match(OP_CUR);
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				statement();
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << NAME))) != 0) );
			setState(150);
			match(CL_CUR);

			        Emit("goto BEGIN_WHILE_" + while_local, 0);
			        System.Console.WriteLine("\n    END_WHILE_" + while_local + ":\n");
			        inside_while = false;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_breakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(ExpParser.BREAK, 0); }
		public St_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_break; }
	}

	public final St_breakContext st_break() throws RecognitionException {
		St_breakContext _localctx = new St_breakContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_st_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(BREAK);

			        if (!inside_while) {
			            Console.Error.WriteLine("\nERROR - Trying to use 'break' outside a loop.\n");         
			            //System.Environment.Exit(1);
			        }
			        
			        Emit("goto END_WHILE_" +  while_break_continue, 0);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_continueContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(ExpParser.CONTINUE, 0); }
		public St_continueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_continue; }
	}

	public final St_continueContext st_continue() throws RecognitionException {
		St_continueContext _localctx = new St_continueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_st_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(CONTINUE);

			        if (!inside_while) {
			            Console.Error.WriteLine("ERROR - Trying to use 'continue' outside a loop.\n");         
			            //System.Environment.Exit(1);
			        }

			        Emit("goto BEGIN_WHILE_" + while_break_continue, 0);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_array_newContext extends ParserRuleContext {
		public Token NAME;
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode ATTRIB() { return getToken(ExpParser.ATTRIB, 0); }
		public TerminalNode OP_BRA() { return getToken(ExpParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(ExpParser.CL_BRA, 0); }
		public St_array_newContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_array_new; }
	}

	public final St_array_newContext st_array_new() throws RecognitionException {
		St_array_newContext _localctx = new St_array_newContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_st_array_new);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((St_array_newContext)_localctx).NAME = match(NAME);
			setState(160);
			match(ATTRIB);
			setState(161);
			match(OP_BRA);
			setState(162);
			match(CL_BRA);

			        if (!symbol_table.Contains((((St_array_newContext)_localctx).NAME!=null?((St_array_newContext)_localctx).NAME.getText():null))) {
			            symbol_table.Add((((St_array_newContext)_localctx).NAME!=null?((St_array_newContext)_localctx).NAME.getText():null));
			            type_table.Add('a');

			            Emit("new Array", 1);
			            Emit("dup", 1);
			            Emit("invokespecial Array/<init>()V", -1);

			            int index = symbol_table.IndexOf((((St_array_newContext)_localctx).NAME!=null?((St_array_newContext)_localctx).NAME.getText():null));
			            Emit("astore " + index + "\n", 1);            
			        } else {
			            Console.Error.WriteLine("# error: '" + (((St_array_newContext)_localctx).NAME!=null?((St_array_newContext)_localctx).NAME.getText():null) + "' is already declared - line " + (((St_array_newContext)_localctx).NAME!=null?((St_array_newContext)_localctx).NAME.getLine():0));         
			            //System.Environment.Exit(1);
			        }        
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_array_pushContext extends ParserRuleContext {
		public Token NAME;
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(ExpParser.DOT, 0); }
		public TerminalNode PUSH() { return getToken(ExpParser.PUSH, 0); }
		public TerminalNode OP_PAR() { return getToken(ExpParser.OP_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(ExpParser.CL_PAR, 0); }
		public St_array_pushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_array_push; }
	}

	public final St_array_pushContext st_array_push() throws RecognitionException {
		St_array_pushContext _localctx = new St_array_pushContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_st_array_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((St_array_pushContext)_localctx).NAME = match(NAME);
			   
			        if (!symbol_table.Contains((((St_array_pushContext)_localctx).NAME!=null?((St_array_pushContext)_localctx).NAME.getText():null))) {
			            Console.Error.WriteLine("\nERROR - Variable does not exist - 'st_array_push' expression.\n");         
			            //System.Environment.Exit(1);
			        }

			        if (!used_table.Contains((((St_array_pushContext)_localctx).NAME!=null?((St_array_pushContext)_localctx).NAME.getText():null))) {
			            used_table.Add((((St_array_pushContext)_localctx).NAME!=null?((St_array_pushContext)_localctx).NAME.getText():null)); 
			        }
			        int index = symbol_table.IndexOf((((St_array_pushContext)_localctx).NAME!=null?((St_array_pushContext)_localctx).NAME.getText():null));                    
			        Emit("aload " + index, 1);        
			    
			setState(167);
			match(DOT);
			setState(168);
			match(PUSH);
			setState(169);
			match(OP_PAR);
			setState(170);
			expression();
			   
			        Emit("invokevirtual Array/push(I)V\n", -2);        
			    
			setState(172);
			match(CL_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_array_setContext extends ParserRuleContext {
		public Token NAME;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode OP_BRA() { return getToken(ExpParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(ExpParser.CL_BRA, 0); }
		public TerminalNode ATTRIB() { return getToken(ExpParser.ATTRIB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public St_array_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_array_set; }
	}

	public final St_array_setContext st_array_set() throws RecognitionException {
		St_array_setContext _localctx = new St_array_setContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_st_array_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			((St_array_setContext)_localctx).NAME = match(NAME);

			        if (!symbol_table.Contains((((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getText():null))) {
			            Console.Error.WriteLine("# error: '" + (((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getText():null) + "' not defined - line " + (((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getLine():0));
			        } else {
			            int index = symbol_table.IndexOf((((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getText():null));
			            char type = type_table[index];
			            if (type != 'a') {
			                Console.Error.WriteLine("# error: '" + (((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getText():null) + "' is not array - line " + (((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getLine():0));                    
			            } else {
			                Emit("aload " + index, -1);      
			            }
			        }
			    
			setState(176);
			match(OP_BRA);
			setState(177);
			((St_array_setContext)_localctx).e1 = expression();
			setState(178);
			match(CL_BRA);
			setState(179);
			match(ATTRIB);
			setState(180);
			((St_array_setContext)_localctx).e2 = expression();
			              
			        if (((St_array_setContext)_localctx).e1.type != 'i') {
			            Console.Error.WriteLine("# error: array index must be integer - line " + (((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getLine():0));         
			        } else if (((St_array_setContext)_localctx).e2.type != 'i') {
			            Console.Error.WriteLine("# error: '" + (((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getText():null) + "' is array - line " + (((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getLine():0));         
			            //System.Environment.Exit(1);
			        // } else if (((St_array_setContext)_localctx).e2.type != 'i') {
			        //     Console.Error.WriteLine("# error: cannot mix types - array element assignement");         
			        //     //System.Environment.Exit(1);
			        }

			        Emit("invokevirtual Array/set(II)V\n", -3);        
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_attibContext extends ParserRuleContext {
		public Token NAME;
		public ExpressionContext expression;
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode ATTRIB() { return getToken(ExpParser.ATTRIB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public St_attibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_attib; }
	}

	public final St_attibContext st_attib() throws RecognitionException {
		St_attibContext _localctx = new St_attibContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_st_attib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((St_attibContext)_localctx).NAME = match(NAME);
			setState(184);
			match(ATTRIB);
			setState(185);
			((St_attibContext)_localctx).expression = expression();

			        if (!symbol_table.Contains((((St_attibContext)_localctx).NAME!=null?((St_attibContext)_localctx).NAME.getText():null))) {
			            symbol_table.Add((((St_attibContext)_localctx).NAME!=null?((St_attibContext)_localctx).NAME.getText():null));
			            type_table.Add(((St_attibContext)_localctx).expression.type);            
			        }
			        
			        int index = symbol_table.IndexOf((((St_attibContext)_localctx).NAME!=null?((St_attibContext)_localctx).NAME.getText():null));
			        char type = type_table[index];

			        if (type == 'a') {
			            Console.Error.WriteLine("# error: '" + (((St_attibContext)_localctx).NAME!=null?((St_attibContext)_localctx).NAME.getText():null) + "' is integer - line " + (((St_attibContext)_localctx).NAME!=null?((St_attibContext)_localctx).NAME.getLine():0));
			        } else if (type == 'i') {
			            if (((St_attibContext)_localctx).expression.type == type) {
			                Emit("istore " + index + "\n", -1);
			            } else {
			                Console.Error.WriteLine("# error: '" + (((St_attibContext)_localctx).NAME!=null?((St_attibContext)_localctx).NAME.getText():null) + "' is integer - line " + (((St_attibContext)_localctx).NAME!=null?((St_attibContext)_localctx).NAME.getLine():0));
			                //System.Environment.Exit(1);
			            }            
			        } else if (type == 's') {
			            if (((St_attibContext)_localctx).expression.type == type) {
			                Emit("astore " + index + "\n", -1);
			            } else {
			                Console.Error.WriteLine("# error: '" + (((St_attibContext)_localctx).NAME!=null?((St_attibContext)_localctx).NAME.getText():null) + "' is string  - line " + (((St_attibContext)_localctx).NAME!=null?((St_attibContext)_localctx).NAME.getLine():0));
			                //System.Environment.Exit(1);
			            }             
			        } else {
			            Console.Error.WriteLine("# error: '" + (((St_attibContext)_localctx).NAME!=null?((St_attibContext)_localctx).NAME.getText():null) + "' is array - line " + (((St_attibContext)_localctx).NAME!=null?((St_attibContext)_localctx).NAME.getLine():0));         
			            //System.Environment.Exit(1);
			        }        
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ExpParser.EQ, 0); }
		public TerminalNode NE() { return getToken(ExpParser.NE, 0); }
		public TerminalNode GT() { return getToken(ExpParser.GT, 0); }
		public TerminalNode GE() { return getToken(ExpParser.GE, 0); }
		public TerminalNode LT() { return getToken(ExpParser.LT, 0); }
		public TerminalNode LE() { return getToken(ExpParser.LE, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			((ComparisonContext)_localctx).e1 = expression();
			setState(189);
			((ComparisonContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
				((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(190);
			((ComparisonContext)_localctx).e2 = expression();

			        if (((ComparisonContext)_localctx).e1.type != 'i' || ((ComparisonContext)_localctx).e2.type  != 'i') {
			            Console.Error.WriteLine("# error: cannot mix types - comparison - line " + (((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getLine():0));         
			            //System.Environment.Exit(1);
			        }
			        if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == EQ) {            
			            System.Console.Write("    if_icmpne ");          
			        } else if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == NE) {
			            System.Console.Write("    if_icmpeq ");          
			        } else if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == GT) {
			            System.Console.Write("    if_icmple ");          
			        } else if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == GE) {
			            System.Console.Write("    if_icmplt ");          
			        } else if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == LT) {
			            System.Console.Write("    if_icmpge ");          
			        } else if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == LE) {
			            System.Console.Write("    if_icmpgt ");          
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public char type;
		public TermContext t1;
		public Token op;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ExpParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ExpParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ExpParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ExpParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			((ExpressionContext)_localctx).t1 = term();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(194);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(195);
				((ExpressionContext)_localctx).t2 = term();

				        if (((ExpressionContext)_localctx).t1.type != 'i' || ((ExpressionContext)_localctx).t2.type != 'i') {
				            Console.Error.WriteLine("# error: cannot mix types - plus or minus - line " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));         
				            ////System.Environment.Exit(1);
				        }
				        if ((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == PLUS ) {
				            Emit("iadd", -1);
				        } else {
				            Emit("isub", -1);
				        }        
				    
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        ((ExpressionContext)_localctx).type =  ((ExpressionContext)_localctx).t1.type;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public char type;
		public FactorContext f1;
		public Token op;
		public FactorContext f2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(ExpParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(ExpParser.TIMES, i);
		}
		public List<TerminalNode> OVER() { return getTokens(ExpParser.OVER); }
		public TerminalNode OVER(int i) {
			return getToken(ExpParser.OVER, i);
		}
		public List<TerminalNode> REM() { return getTokens(ExpParser.REM); }
		public TerminalNode REM(int i) {
			return getToken(ExpParser.REM, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			((TermContext)_localctx).f1 = factor();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REM))) != 0)) {
				{
				{
				setState(206);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REM))) != 0)) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(207);
				((TermContext)_localctx).f2 = factor();

				        if (((TermContext)_localctx).f1.type != 'i' || ((TermContext)_localctx).f2.type != 'i') {
				            Console.Error.WriteLine("# error: cannot mix types - times, over or rem - line " + (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getLine():0));         
				            //System.Environment.Exit(1);
				        }
				        if ((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == TIMES ) {
				            Emit("imul", -1);
				        } else if ((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == OVER ) {
				            Emit("idiv", -1);
				        } else {
				            Emit("irem", -1);
				        }
				    
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        ((TermContext)_localctx).type =  ((TermContext)_localctx).f1.type;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public char type;
		public Token NUMBER;
		public Token STRING;
		public ExpressionContext expression;
		public Token NAME;
		public TerminalNode NUMBER() { return getToken(ExpParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ExpParser.STRING, 0); }
		public TerminalNode OP_PAR() { return getToken(ExpParser.OP_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(ExpParser.CL_PAR, 0); }
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode READ_INT() { return getToken(ExpParser.READ_INT, 0); }
		public TerminalNode READ_STR() { return getToken(ExpParser.READ_STR, 0); }
		public TerminalNode DOT() { return getToken(ExpParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(ExpParser.LENGTH, 0); }
		public TerminalNode OP_BRA() { return getToken(ExpParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(ExpParser.CL_BRA, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				((FactorContext)_localctx).NUMBER = match(NUMBER);

				        Emit("ldc " + (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), 1);
				        ((FactorContext)_localctx).type =  'i';
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				((FactorContext)_localctx).STRING = match(STRING);

				        Emit("ldc " + (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), 1);
				        ((FactorContext)_localctx).type =  's';
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(OP_PAR);
				setState(222);
				((FactorContext)_localctx).expression = expression();
				setState(223);
				match(CL_PAR);

				        ((FactorContext)_localctx).type =  ((FactorContext)_localctx).expression.type;
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				((FactorContext)_localctx).NAME = match(NAME);

				        if (!symbol_table.Contains((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))) {
				            Console.Error.WriteLine("\nERROR - variable not found: '" + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + "'\n");         
				            //System.Environment.Exit(1);
				        }       

				        // vai auxiliar no controle das variáveis usadas        
				        if (!used_table.Contains((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))) {
				            used_table.Add((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)); 
				        }

				        int index = symbol_table.IndexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null));            
				        char type = type_table[index];

				        if (type == 'i') {
				            Emit("iload " + index, 1);
				            ((FactorContext)_localctx).type =  'i';
				        } else if (type == 's') {
				            Emit("aload " + index, 1);
				            ((FactorContext)_localctx).type =  's';
				        } else if (type == 'a') {
				            Emit("aload " + index, 1);
				            ((FactorContext)_localctx).type =  'a';
				        } else {
				            Console.Error.WriteLine("\nERROR - Type error in factor NAME.\n");         
				            // System.Environment.Exit(1);
				        }       
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				match(READ_INT);
				setState(229);
				match(OP_PAR);
				setState(230);
				match(CL_PAR);

				        Emit("invokestatic Runtime/readInt()I", 1);
				        ((FactorContext)_localctx).type =  'i';
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				match(READ_STR);
				setState(233);
				match(OP_PAR);
				setState(234);
				match(CL_PAR);

				        Emit("invokestatic Runtime/readString()Ljava/lang/String;", 1);        
				        ((FactorContext)_localctx).type =  's';
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(236);
				((FactorContext)_localctx).NAME = match(NAME);

				        if (!symbol_table.Contains((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))) {
				            Console.Error.WriteLine("# error: '" + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + "' not defined - line " + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getLine():0));
				        } else {
				            int index = symbol_table.IndexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null));
				            char type = type_table[index];

				            if (type != 'a') {
				                Console.Error.WriteLine("# error: '" + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + "' is not array - line " + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getLine():0));
				                
				            } else {
				                Emit("aload " + index, 1);        
				            }
				        }        
				    
				setState(238);
				match(DOT);
				setState(239);
				match(LENGTH);
				       
				        Emit("invokevirtual Array/length()I", 0);                
				        ((FactorContext)_localctx).type =  'i';     
				    
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(241);
				((FactorContext)_localctx).NAME = match(NAME);

				        if (!symbol_table.Contains((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))) {
				            Console.Error.WriteLine("# error: '" + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + "' not defined - line " + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getLine():0));
				        } else {
				            int index = symbol_table.IndexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null));
				            char type = type_table[index];
				            if (type != 'a') {
				                Console.Error.WriteLine("# error: '" + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + "' is not array - line " + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getLine():0));
				            } else {
				                Emit("aload " + index, 1);
				            }
				        }
				    
				setState(243);
				match(OP_BRA);
				setState(244);
				expression();
				setState(245);
				match(CL_BRA);
				   
				        Emit("invokevirtual Array/get(I)I", -1);        
				        ((FactorContext)_localctx).type =  'i';   
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_callContext extends ParserRuleContext {
		public Token NAME;
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode OP_PAR() { return getToken(ExpParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(ExpParser.CL_PAR, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public St_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_call; }
	}

	public final St_callContext st_call() throws RecognitionException {
		St_callContext _localctx = new St_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_st_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			((St_callContext)_localctx).NAME = match(NAME);
			setState(251);
			match(OP_PAR);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PAR) | (1L << READ_INT) | (1L << READ_STR) | (1L << NUMBER) | (1L << NAME) | (1L << STRING))) != 0)) {
				{
				setState(252);
				arguments();
				}
			}


			        for (int i = 0; i < arguments_count; i++) {
			            func_modifier += "I";
			        }        
			        
			        string function_name = (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null) + "(" + func_modifier + ")V";
			        arguments_count = 0;
			        func_modifier = "";
			    
			setState(256);
			match(CL_PAR);

			        if (!functions_list.Contains(function_name)) {
			            Console.Error.WriteLine("# error: function '" + function_name + "' was never declared - line " + (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getLine():0));
			        } else {
			            Emit("invokestatic Test/" + function_name + "\n", 0);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExpParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			((ArgumentsContext)_localctx).e1 = expression();
			        
			        symbol_table.Add((((ArgumentsContext)_localctx).e1!=null?_input.getText(((ArgumentsContext)_localctx).e1.start,((ArgumentsContext)_localctx).e1.stop):null));
			        used_table.Add((((ArgumentsContext)_localctx).e1!=null?_input.getText(((ArgumentsContext)_localctx).e1.start,((ArgumentsContext)_localctx).e1.stop):null));
			        type_table.Add('i');        

			        arguments_count++;
			    
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(261);
				match(COMMA);
				setState(262);
				((ArgumentsContext)_localctx).e2 = expression();
				        
				            symbol_table.Add((((ArgumentsContext)_localctx).e2!=null?_input.getText(((ArgumentsContext)_localctx).e2.start,((ArgumentsContext)_localctx).e2.stop):null));
				            used_table.Add((((ArgumentsContext)_localctx).e2!=null?_input.getText(((ArgumentsContext)_localctx).e2.start,((ArgumentsContext)_localctx).e2.stop):null));
				            type_table.Add('i');
				            arguments_count++;
				        
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\5\38\n\3\3\3\3\3\3\3\3\3\6\3>\n\3\r\3\16\3?\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\3\5\3\5\6\5S"+
		"\n\5\r\5\16\5T\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6c\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7o\n\7\f\7\16\7r\13\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\6\b|\n\b\r\b\16\b}\3\b\3\b\3\b\3\b\3\b\6"+
		"\b\u0085\n\b\r\b\16\b\u0086\3\b\3\b\5\b\u008b\n\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\6\t\u0095\n\t\r\t\16\t\u0096\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00c9\n\21\f\21"+
		"\16\21\u00cc\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u00d5\n\22"+
		"\f\22\16\22\u00d8\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00fb\n\23\3\24"+
		"\3\24\3\24\5\24\u0100\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u010c\n\25\f\25\16\25\u010f\13\25\3\25\2\2\26\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(\2\5\3\2\20\25\3\2\5\6\3\2\7\t\2\u011a\2"+
		"*\3\2\2\2\4\63\3\2\2\2\6D\3\2\2\2\bP\3\2\2\2\nb\3\2\2\2\fd\3\2\2\2\16"+
		"v\3\2\2\2\20\u008e\3\2\2\2\22\u009b\3\2\2\2\24\u009e\3\2\2\2\26\u00a1"+
		"\3\2\2\2\30\u00a7\3\2\2\2\32\u00b0\3\2\2\2\34\u00b9\3\2\2\2\36\u00be\3"+
		"\2\2\2 \u00c3\3\2\2\2\"\u00cf\3\2\2\2$\u00fa\3\2\2\2&\u00fc\3\2\2\2(\u0105"+
		"\3\2\2\2*.\b\2\1\2+-\5\4\3\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2"+
		"/\61\3\2\2\2\60.\3\2\2\2\61\62\5\b\5\2\62\3\3\2\2\2\63\64\7#\2\2\64\65"+
		"\7%\2\2\65\67\7\n\2\2\668\5\6\4\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\2"+
		"9:\b\3\1\2:;\7\13\2\2;=\7\16\2\2<>\5\n\6\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2"+
		"\2?@\3\2\2\2@A\3\2\2\2AB\7\17\2\2BC\b\3\1\2C\5\3\2\2\2DE\7%\2\2EK\b\4"+
		"\1\2FG\7\r\2\2GH\7%\2\2HJ\b\4\1\2IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2"+
		"\2\2LN\3\2\2\2MK\3\2\2\2NO\b\4\1\2O\7\3\2\2\2PR\b\5\1\2QS\5\n\6\2RQ\3"+
		"\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\b\5\1\2W\t\3\2\2\2Xc"+
		"\5\f\7\2Yc\5\34\17\2Zc\5\16\b\2[c\5\20\t\2\\c\5\22\n\2]c\5\24\13\2^c\5"+
		"\26\f\2_c\5\30\r\2`c\5\32\16\2ac\5&\24\2bX\3\2\2\2bY\3\2\2\2bZ\3\2\2\2"+
		"b[\3\2\2\2b\\\3\2\2\2b]\3\2\2\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2"+
		"\2c\13\3\2\2\2de\7\26\2\2ef\7\n\2\2fg\b\7\1\2gh\5 \21\2hp\b\7\1\2ij\7"+
		"\r\2\2jk\b\7\1\2kl\5 \21\2lm\b\7\1\2mo\3\2\2\2ni\3\2\2\2or\3\2\2\2pn\3"+
		"\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\13\2\2tu\b\7\1\2u\r\3\2\2\2v"+
		"w\7\31\2\2wx\5\36\20\2xy\b\b\1\2y{\7\16\2\2z|\5\n\6\2{z\3\2\2\2|}\3\2"+
		"\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\17\2\2\u0080\u008a\b"+
		"\b\1\2\u0081\u0082\7\32\2\2\u0082\u0084\7\16\2\2\u0083\u0085\5\n\6\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\17\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0081\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\b"+
		"\1\2\u008d\17\3\2\2\2\u008e\u008f\7\33\2\2\u008f\u0090\b\t\1\2\u0090\u0091"+
		"\5\36\20\2\u0091\u0092\b\t\1\2\u0092\u0094\7\16\2\2\u0093\u0095\5\n\6"+
		"\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\17\2\2\u0099\u009a\b\t\1\2"+
		"\u009a\21\3\2\2\2\u009b\u009c\7\34\2\2\u009c\u009d\b\n\1\2\u009d\23\3"+
		"\2\2\2\u009e\u009f\7\35\2\2\u009f\u00a0\b\13\1\2\u00a0\25\3\2\2\2\u00a1"+
		"\u00a2\7%\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4\7 \2\2\u00a4\u00a5\7!\2"+
		"\2\u00a5\u00a6\b\f\1\2\u00a6\27\3\2\2\2\u00a7\u00a8\7%\2\2\u00a8\u00a9"+
		"\b\r\1\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab\7\36\2\2\u00ab\u00ac\7\n\2\2"+
		"\u00ac\u00ad\5 \21\2\u00ad\u00ae\b\r\1\2\u00ae\u00af\7\13\2\2\u00af\31"+
		"\3\2\2\2\u00b0\u00b1\7%\2\2\u00b1\u00b2\b\16\1\2\u00b2\u00b3\7 \2\2\u00b3"+
		"\u00b4\5 \21\2\u00b4\u00b5\7!\2\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\5 \21"+
		"\2\u00b7\u00b8\b\16\1\2\u00b8\33\3\2\2\2\u00b9\u00ba\7%\2\2\u00ba\u00bb"+
		"\7\f\2\2\u00bb\u00bc\5 \21\2\u00bc\u00bd\b\17\1\2\u00bd\35\3\2\2\2\u00be"+
		"\u00bf\5 \21\2\u00bf\u00c0\t\2\2\2\u00c0\u00c1\5 \21\2\u00c1\u00c2\b\20"+
		"\1\2\u00c2\37\3\2\2\2\u00c3\u00ca\5\"\22\2\u00c4\u00c5\t\3\2\2\u00c5\u00c6"+
		"\5\"\22\2\u00c6\u00c7\b\21\1\2\u00c7\u00c9\3\2\2\2\u00c8\u00c4\3\2\2\2"+
		"\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\b\21\1\2\u00ce!\3\2\2\2\u00cf"+
		"\u00d6\5$\23\2\u00d0\u00d1\t\4\2\2\u00d1\u00d2\5$\23\2\u00d2\u00d3\b\22"+
		"\1\2\u00d3\u00d5\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d9\u00da\b\22\1\2\u00da#\3\2\2\2\u00db\u00dc\7$\2\2\u00dc\u00fb"+
		"\b\23\1\2\u00dd\u00de\7&\2\2\u00de\u00fb\b\23\1\2\u00df\u00e0\7\n\2\2"+
		"\u00e0\u00e1\5 \21\2\u00e1\u00e2\7\13\2\2\u00e2\u00e3\b\23\1\2\u00e3\u00fb"+
		"\3\2\2\2\u00e4\u00e5\7%\2\2\u00e5\u00fb\b\23\1\2\u00e6\u00e7\7\27\2\2"+
		"\u00e7\u00e8\7\n\2\2\u00e8\u00e9\7\13\2\2\u00e9\u00fb\b\23\1\2\u00ea\u00eb"+
		"\7\30\2\2\u00eb\u00ec\7\n\2\2\u00ec\u00ed\7\13\2\2\u00ed\u00fb\b\23\1"+
		"\2\u00ee\u00ef\7%\2\2\u00ef\u00f0\b\23\1\2\u00f0\u00f1\7\"\2\2\u00f1\u00f2"+
		"\7\37\2\2\u00f2\u00fb\b\23\1\2\u00f3\u00f4\7%\2\2\u00f4\u00f5\b\23\1\2"+
		"\u00f5\u00f6\7 \2\2\u00f6\u00f7\5 \21\2\u00f7\u00f8\7!\2\2\u00f8\u00f9"+
		"\b\23\1\2\u00f9\u00fb\3\2\2\2\u00fa\u00db\3\2\2\2\u00fa\u00dd\3\2\2\2"+
		"\u00fa\u00df\3\2\2\2\u00fa\u00e4\3\2\2\2\u00fa\u00e6\3\2\2\2\u00fa\u00ea"+
		"\3\2\2\2\u00fa\u00ee\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fb%\3\2\2\2\u00fc"+
		"\u00fd\7%\2\2\u00fd\u00ff\7\n\2\2\u00fe\u0100\5(\25\2\u00ff\u00fe\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b\24\1\2\u0102"+
		"\u0103\7\13\2\2\u0103\u0104\b\24\1\2\u0104\'\3\2\2\2\u0105\u0106\5 \21"+
		"\2\u0106\u010d\b\25\1\2\u0107\u0108\7\r\2\2\u0108\u0109\5 \21\2\u0109"+
		"\u010a\b\25\1\2\u010a\u010c\3\2\2\2\u010b\u0107\3\2\2\2\u010c\u010f\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e)\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\22.\67?KTbp}\u0086\u008a\u0096\u00ca\u00d6\u00fa\u00ff\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}