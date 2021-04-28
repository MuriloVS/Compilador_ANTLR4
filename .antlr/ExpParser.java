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
		DOT=32, NUMBER=33, NAME=34, STRING=35;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_statement = 2, RULE_st_print = 3, 
		RULE_st_if = 4, RULE_st_while = 5, RULE_st_break = 6, RULE_st_continue = 7, 
		RULE_st_array_new = 8, RULE_st_array_push = 9, RULE_st_array_set = 10, 
		RULE_st_attib = 11, RULE_comparison = 12, RULE_expression = 13, RULE_term = 14, 
		RULE_factor = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "statement", "st_print", "st_if", "st_while", "st_break", 
			"st_continue", "st_array_new", "st_array_push", "st_array_set", "st_attib", 
			"comparison", "expression", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", 
			"','", "'{'", "'}'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'print'", 
			"'read_int'", "'read_str'", "'if'", "'else'", "'while'", "'break'", "'continue'", 
			"'push'", "'length'", "'['", "']'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "SPACE", "PLUS", "MINUS", "TIMES", "OVER", "REM", "OP_PAR", 
			"CL_PAR", "ATTRIB", "COMMA", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", 
			"LT", "LE", "PRINT", "READ_INT", "READ_STR", "IF", "ELSE", "WHILE", "BREAK", 
			"CONTINUE", "PUSH", "LENGTH", "OP_BRA", "CL_BRA", "DOT", "NUMBER", "NAME", 
			"STRING"
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

	public ExpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
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
			    
			setState(33);
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
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        System.Console.WriteLine(".method public static main([Ljava/lang/String;)V\n");               
			    
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				statement();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << NAME))) != 0) );

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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				st_print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				st_attib();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				st_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				st_while();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				st_break();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				st_continue();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(49);
				st_array_new();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(50);
				st_array_push();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(51);
				st_array_set();
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
		enterRule(_localctx, 6, RULE_st_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(PRINT);
			setState(55);
			match(OP_PAR);

			        Emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1);
			    
			setState(57);
			((St_printContext)_localctx).e1 = expression();

			        if (((St_printContext)_localctx).e1.type == 'i') {
			            Emit("invokevirtual java/io/PrintStream/print(I)V", -2);
			        } else if (((St_printContext)_localctx).e1.type == 's') {
			            Emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", -2);        
			        } else if (((St_printContext)_localctx).e1.type == 'a') {            
			            Emit("invokevirtual Array/string()Ljava/lang/String;", 0);        
			            Emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", 0);        
			        } else {
			            //Emit("teste" + ((St_printContext)_localctx).e1.type, 0);
			            Console.Error.WriteLine("\nERROR - Type error in 'e1'.\n");         
			            ////System.Environment.Exit(1);
			        }
			    
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(59);
				match(COMMA);

				        Emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1);
				    
				setState(61);
				((St_printContext)_localctx).e2 = expression();

				        if (((St_printContext)_localctx).e2.type == 'i') {
				            Emit("invokevirtual java/io/PrintStream/print(I)V", -2);
				        } else if (((St_printContext)_localctx).e2.type == 's') {
				            Emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", 1);        
				        } else {
				            Console.Error.WriteLine("\nERROR - Type error in 'e2'.\n");         
				            ////System.Environment.Exit(1);
				        }
				    
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
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
		enterRule(_localctx, 8, RULE_st_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(IF);
			setState(73);
			comparison();

			        int if_local = if_global;
			        if_global++;        
			        Emit("NOT_IF_" + if_local, -2); 
			    
			setState(75);
			match(OP_CUR);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				statement();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << NAME))) != 0) );
			setState(81);
			match(CL_CUR);

			        Emit("goto END_ELSE_" + if_local, 0);
			        System.Console.WriteLine("NOT_IF_" + if_local + ":");
			    
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(83);
				match(ELSE);
				setState(84);
				match(OP_CUR);
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(85);
					statement();
					}
					}
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << NAME))) != 0) );
				setState(90);
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
		enterRule(_localctx, 10, RULE_st_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(WHILE);

			        inside_while = true;
			        int while_local = while_global;
			        while_break_continue = while_local;
			        while_global++;       
			        System.Console.WriteLine("\n    BEGIN_WHILE_" + while_local + ":\n");
			    
			setState(98);
			comparison();

			        Emit("END_WHILE_" + while_local, 0); 
			    
			setState(100);
			match(OP_CUR);
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				statement();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << NAME))) != 0) );
			setState(106);
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
		enterRule(_localctx, 12, RULE_st_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
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
		enterRule(_localctx, 14, RULE_st_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(CONTINUE);

			        if (!inside_while) {
			            Console.Error.WriteLine("\nERROR - Trying to use 'continue' outside a loop.\n");         
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
		enterRule(_localctx, 16, RULE_st_array_new);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((St_array_newContext)_localctx).NAME = match(NAME);
			setState(116);
			match(ATTRIB);
			setState(117);
			match(OP_BRA);
			setState(118);
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
			            Console.Error.WriteLine("\nERROR - Variable already exisis - 'st_array_new' expression.\n");         
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
		enterRule(_localctx, 18, RULE_st_array_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
			    
			setState(123);
			match(DOT);
			setState(124);
			match(PUSH);
			setState(125);
			match(OP_PAR);
			setState(126);
			expression();
			   
			        Emit("invokevirtual Array/push(I)V\n", -2);        
			    
			setState(128);
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
		enterRule(_localctx, 20, RULE_st_array_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((St_array_setContext)_localctx).NAME = match(NAME);

			        int index = symbol_table.IndexOf((((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getText():null));                    
			        Emit("aload " + index, -1);      
			    
			setState(132);
			match(OP_BRA);
			setState(133);
			((St_array_setContext)_localctx).e1 = expression();
			setState(134);
			match(CL_BRA);
			setState(135);
			match(ATTRIB);
			setState(136);
			((St_array_setContext)_localctx).e2 = expression();

			        if (((St_array_setContext)_localctx).e1.type != 'i' || ((St_array_setContext)_localctx).e2.type != 'i') {
			            Console.Error.WriteLine("\n# error: cannot mix types - array element assignement");         
			            //System.Environment.Exit(1);
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
		enterRule(_localctx, 22, RULE_st_attib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((St_attibContext)_localctx).NAME = match(NAME);
			setState(140);
			match(ATTRIB);
			setState(141);
			((St_attibContext)_localctx).expression = expression();

			        if (!symbol_table.Contains((((St_attibContext)_localctx).NAME!=null?((St_attibContext)_localctx).NAME.getText():null))) {
			            symbol_table.Add((((St_attibContext)_localctx).NAME!=null?((St_attibContext)_localctx).NAME.getText():null));
			            type_table.Add(((St_attibContext)_localctx).expression.type);            
			        }
			        
			        int index = symbol_table.IndexOf((((St_attibContext)_localctx).NAME!=null?((St_attibContext)_localctx).NAME.getText():null));
			        char type = type_table[index];
			        
			        if (type == 'i') {
			            if (((St_attibContext)_localctx).expression.type == type) {
			                Emit("istore " + index + "\n", -1);
			            } else {
			                Console.Error.WriteLine("# error: " + (((St_attibContext)_localctx).NAME!=null?((St_attibContext)_localctx).NAME.getText():null) + " is integer");
			                //System.Environment.Exit(1);
			            }            
			        } else if (type == 's') {
			            if (((St_attibContext)_localctx).expression.type == type) {
			                Emit("astore " + index + "\n", -1);
			            } else {
			                Console.Error.WriteLine("# error: " + (((St_attibContext)_localctx).NAME!=null?((St_attibContext)_localctx).NAME.getText():null) + " is string");
			                //System.Environment.Exit(1);
			            }             
			        } else {
			            Console.Error.WriteLine("\nERROR - Type error in 'st_attib' expression.\n");         
			            ////System.Environment.Exit(1);
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
		enterRule(_localctx, 24, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((ComparisonContext)_localctx).e1 = expression();
			setState(145);
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
			setState(146);
			((ComparisonContext)_localctx).e2 = expression();

			        if (((ComparisonContext)_localctx).e1.type != 'i' || ((ComparisonContext)_localctx).e2.type  != 'i') {
			            Console.Error.WriteLine("\n# error: cannot mix types - comparison");         
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
		enterRule(_localctx, 26, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			((ExpressionContext)_localctx).t1 = term();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(150);
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
				setState(151);
				((ExpressionContext)_localctx).t2 = term();

				        if (((ExpressionContext)_localctx).t1.type != 'i' || ((ExpressionContext)_localctx).t2.type != 'i') {
				            Console.Error.WriteLine("\n# error: cannot mix types - plus or minus");         
				            ////System.Environment.Exit(1);
				        }
				        if ((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == PLUS ) {
				            Emit("iadd", -1);
				        } else {
				            Emit("isub", -1);
				        }        
				    
				}
				}
				setState(158);
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
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((TermContext)_localctx).f1 = factor();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REM))) != 0)) {
				{
				{
				setState(162);
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
				setState(163);
				((TermContext)_localctx).f2 = factor();

				        if (((TermContext)_localctx).f1.type != 'i' || ((TermContext)_localctx).f2.type != 'i') {
				            Console.Error.WriteLine("\n# error: cannot mix types - times, over or rem");         
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
				setState(170);
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
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				((FactorContext)_localctx).NUMBER = match(NUMBER);

				        Emit("ldc " + (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), 1);
				        ((FactorContext)_localctx).type =  'i';
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				((FactorContext)_localctx).STRING = match(STRING);

				        Emit("ldc " + (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), 1);
				        ((FactorContext)_localctx).type =  's';
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(OP_PAR);
				setState(178);
				((FactorContext)_localctx).expression = expression();
				setState(179);
				match(CL_PAR);

				        ((FactorContext)_localctx).type =  ((FactorContext)_localctx).expression.type;
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
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
				            ////System.Environment.Exit(1);
				        }       
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				match(READ_INT);
				setState(185);
				match(OP_PAR);
				setState(186);
				match(CL_PAR);

				        Emit("invokestatic Runtime/readInt()I", 1);
				        ((FactorContext)_localctx).type =  'i';
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(READ_STR);
				setState(189);
				match(OP_PAR);
				setState(190);
				match(CL_PAR);

				        Emit("invokestatic Runtime/readString()Ljava/lang/String;", 1);        
				        ((FactorContext)_localctx).type =  's';
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(192);
				((FactorContext)_localctx).NAME = match(NAME);
				setState(193);
				match(DOT);
				setState(194);
				match(LENGTH);

				        int index = symbol_table.IndexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)); 
				        char type = 'i';
				        Emit("aload " + index, -1);
				        Emit("invokevirtual Array/length()I", 0);        
				        Emit("invokevirtual java/io/PrintStream/print(I)V\n", 0);      
				    
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(196);
				((FactorContext)_localctx).NAME = match(NAME);
				setState(197);
				match(OP_BRA);
				setState(198);
				expression();
				setState(199);
				match(CL_BRA);

				        int index = symbol_table.IndexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null));
				        char type = type_table[index];
				        Emit("aload " + index, -1);
				        Emit("invokevirtual Array/get(I)I", -1);
				        Emit("invokevirtual java/io/PrintStream/print(I)V\n", 0); 
				    
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\6\3(\n\3\r\3\16\3)\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\67\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5C\n\5\f\5\16"+
		"\5F\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\6\6P\n\6\r\6\16\6Q\3\6\3\6\3"+
		"\6\3\6\3\6\6\6Y\n\6\r\6\16\6Z\3\6\3\6\5\6_\n\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\6\7i\n\7\r\7\16\7j\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u009d\n\17\f\17\16\17\u00a0\13\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u00a9\n\20\f\20\16\20\u00ac\13"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00cd\n\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \2\5\3\2\20\25\3\2\5\6\3\2\7\t\2\u00d5\2\"\3\2\2\2\4%"+
		"\3\2\2\2\6\66\3\2\2\2\b8\3\2\2\2\nJ\3\2\2\2\fb\3\2\2\2\16o\3\2\2\2\20"+
		"r\3\2\2\2\22u\3\2\2\2\24{\3\2\2\2\26\u0084\3\2\2\2\30\u008d\3\2\2\2\32"+
		"\u0092\3\2\2\2\34\u0097\3\2\2\2\36\u00a3\3\2\2\2 \u00cc\3\2\2\2\"#\b\2"+
		"\1\2#$\5\4\3\2$\3\3\2\2\2%\'\b\3\1\2&(\5\6\4\2\'&\3\2\2\2()\3\2\2\2)\'"+
		"\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\b\3\1\2,\5\3\2\2\2-\67\5\b\5\2.\67\5\30"+
		"\r\2/\67\5\n\6\2\60\67\5\f\7\2\61\67\5\16\b\2\62\67\5\20\t\2\63\67\5\22"+
		"\n\2\64\67\5\24\13\2\65\67\5\26\f\2\66-\3\2\2\2\66.\3\2\2\2\66/\3\2\2"+
		"\2\66\60\3\2\2\2\66\61\3\2\2\2\66\62\3\2\2\2\66\63\3\2\2\2\66\64\3\2\2"+
		"\2\66\65\3\2\2\2\67\7\3\2\2\289\7\26\2\29:\7\n\2\2:;\b\5\1\2;<\5\34\17"+
		"\2<D\b\5\1\2=>\7\r\2\2>?\b\5\1\2?@\5\34\17\2@A\b\5\1\2AC\3\2\2\2B=\3\2"+
		"\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\13\2\2HI\b"+
		"\5\1\2I\t\3\2\2\2JK\7\31\2\2KL\5\32\16\2LM\b\6\1\2MO\7\16\2\2NP\5\6\4"+
		"\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\17\2\2T^\b\6"+
		"\1\2UV\7\32\2\2VX\7\16\2\2WY\5\6\4\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3"+
		"\2\2\2[\\\3\2\2\2\\]\7\17\2\2]_\3\2\2\2^U\3\2\2\2^_\3\2\2\2_`\3\2\2\2"+
		"`a\b\6\1\2a\13\3\2\2\2bc\7\33\2\2cd\b\7\1\2de\5\32\16\2ef\b\7\1\2fh\7"+
		"\16\2\2gi\5\6\4\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm"+
		"\7\17\2\2mn\b\7\1\2n\r\3\2\2\2op\7\34\2\2pq\b\b\1\2q\17\3\2\2\2rs\7\35"+
		"\2\2st\b\t\1\2t\21\3\2\2\2uv\7$\2\2vw\7\f\2\2wx\7 \2\2xy\7!\2\2yz\b\n"+
		"\1\2z\23\3\2\2\2{|\7$\2\2|}\b\13\1\2}~\7\"\2\2~\177\7\36\2\2\177\u0080"+
		"\7\n\2\2\u0080\u0081\5\34\17\2\u0081\u0082\b\13\1\2\u0082\u0083\7\13\2"+
		"\2\u0083\25\3\2\2\2\u0084\u0085\7$\2\2\u0085\u0086\b\f\1\2\u0086\u0087"+
		"\7 \2\2\u0087\u0088\5\34\17\2\u0088\u0089\7!\2\2\u0089\u008a\7\f\2\2\u008a"+
		"\u008b\5\34\17\2\u008b\u008c\b\f\1\2\u008c\27\3\2\2\2\u008d\u008e\7$\2"+
		"\2\u008e\u008f\7\f\2\2\u008f\u0090\5\34\17\2\u0090\u0091\b\r\1\2\u0091"+
		"\31\3\2\2\2\u0092\u0093\5\34\17\2\u0093\u0094\t\2\2\2\u0094\u0095\5\34"+
		"\17\2\u0095\u0096\b\16\1\2\u0096\33\3\2\2\2\u0097\u009e\5\36\20\2\u0098"+
		"\u0099\t\3\2\2\u0099\u009a\5\36\20\2\u009a\u009b\b\17\1\2\u009b\u009d"+
		"\3\2\2\2\u009c\u0098\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\b\17"+
		"\1\2\u00a2\35\3\2\2\2\u00a3\u00aa\5 \21\2\u00a4\u00a5\t\4\2\2\u00a5\u00a6"+
		"\5 \21\2\u00a6\u00a7\b\20\1\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3\2\2\2"+
		"\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\b\20\1\2\u00ae\37\3\2\2\2\u00af"+
		"\u00b0\7#\2\2\u00b0\u00cd\b\21\1\2\u00b1\u00b2\7%\2\2\u00b2\u00cd\b\21"+
		"\1\2\u00b3\u00b4\7\n\2\2\u00b4\u00b5\5\34\17\2\u00b5\u00b6\7\13\2\2\u00b6"+
		"\u00b7\b\21\1\2\u00b7\u00cd\3\2\2\2\u00b8\u00b9\7$\2\2\u00b9\u00cd\b\21"+
		"\1\2\u00ba\u00bb\7\27\2\2\u00bb\u00bc\7\n\2\2\u00bc\u00bd\7\13\2\2\u00bd"+
		"\u00cd\b\21\1\2\u00be\u00bf\7\30\2\2\u00bf\u00c0\7\n\2\2\u00c0\u00c1\7"+
		"\13\2\2\u00c1\u00cd\b\21\1\2\u00c2\u00c3\7$\2\2\u00c3\u00c4\7\"\2\2\u00c4"+
		"\u00c5\7\37\2\2\u00c5\u00cd\b\21\1\2\u00c6\u00c7\7$\2\2\u00c7\u00c8\7"+
		" \2\2\u00c8\u00c9\5\34\17\2\u00c9\u00ca\7!\2\2\u00ca\u00cb\b\21\1\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00af\3\2\2\2\u00cc\u00b1\3\2\2\2\u00cc\u00b3\3\2"+
		"\2\2\u00cc\u00b8\3\2\2\2\u00cc\u00ba\3\2\2\2\u00cc\u00be\3\2\2\2\u00cc"+
		"\u00c2\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cd!\3\2\2\2\f)\66DQZ^j\u009e\u00aa"+
		"\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}