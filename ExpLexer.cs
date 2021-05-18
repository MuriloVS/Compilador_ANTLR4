//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from Exp.g4 by ANTLR 4.9.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419


    #pragma warning disable 3021

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.1")]
[System.CLSCompliant(false)]
public partial class ExpLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		COMMENT=1, SPACE=2, PLUS=3, MINUS=4, TIMES=5, OVER=6, REM=7, OP_PAR=8, 
		CL_PAR=9, ATTRIB=10, COMMA=11, OP_CUR=12, CL_CUR=13, EQ=14, NE=15, GT=16, 
		GE=17, LT=18, LE=19, PRINT=20, READ_INT=21, READ_STR=22, IF=23, ELSE=24, 
		WHILE=25, BREAK=26, CONTINUE=27, PUSH=28, LENGTH=29, OP_BRA=30, CL_BRA=31, 
		DOT=32, DEF=33, INT=34, RETURN=35, NUMBER=36, NAME=37, STRING=38;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"COMMENT", "SPACE", "PLUS", "MINUS", "TIMES", "OVER", "REM", "OP_PAR", 
		"CL_PAR", "ATTRIB", "COMMA", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", 
		"LT", "LE", "PRINT", "READ_INT", "READ_STR", "IF", "ELSE", "WHILE", "BREAK", 
		"CONTINUE", "PUSH", "LENGTH", "OP_BRA", "CL_BRA", "DOT", "DEF", "INT", 
		"RETURN", "NUMBER", "NAME", "STRING"
	};


	public ExpLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public ExpLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", 
		"','", "'{'", "'}'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'print'", 
		"'read_int'", "'read_str'", "'if'", "'else'", "'while'", "'break'", "'continue'", 
		"'push'", "'length'", "'['", "']'", "'.'", "'def'", "'int'", "'return'"
	};
	private static readonly string[] _SymbolicNames = {
		null, "COMMENT", "SPACE", "PLUS", "MINUS", "TIMES", "OVER", "REM", "OP_PAR", 
		"CL_PAR", "ATTRIB", "COMMA", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", 
		"LT", "LE", "PRINT", "READ_INT", "READ_STR", "IF", "ELSE", "WHILE", "BREAK", 
		"CONTINUE", "PUSH", "LENGTH", "OP_BRA", "CL_BRA", "DOT", "DEF", "INT", 
		"RETURN", "NUMBER", "NAME", "STRING"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "Exp.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static ExpLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '(', '\xEE', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x4', 
		'\x11', '\t', '\x11', '\x4', '\x12', '\t', '\x12', '\x4', '\x13', '\t', 
		'\x13', '\x4', '\x14', '\t', '\x14', '\x4', '\x15', '\t', '\x15', '\x4', 
		'\x16', '\t', '\x16', '\x4', '\x17', '\t', '\x17', '\x4', '\x18', '\t', 
		'\x18', '\x4', '\x19', '\t', '\x19', '\x4', '\x1A', '\t', '\x1A', '\x4', 
		'\x1B', '\t', '\x1B', '\x4', '\x1C', '\t', '\x1C', '\x4', '\x1D', '\t', 
		'\x1D', '\x4', '\x1E', '\t', '\x1E', '\x4', '\x1F', '\t', '\x1F', '\x4', 
		' ', '\t', ' ', '\x4', '!', '\t', '!', '\x4', '\"', '\t', '\"', '\x4', 
		'#', '\t', '#', '\x4', '$', '\t', '$', '\x4', '%', '\t', '%', '\x4', '&', 
		'\t', '&', '\x4', '\'', '\t', '\'', '\x3', '\x2', '\x3', '\x2', '\a', 
		'\x2', 'R', '\n', '\x2', '\f', '\x2', '\xE', '\x2', 'U', '\v', '\x2', 
		'\x3', '\x2', '\x3', '\x2', '\x3', '\x3', '\x6', '\x3', 'Z', '\n', '\x3', 
		'\r', '\x3', '\xE', '\x3', '[', '\x3', '\x3', '\x3', '\x3', '\x3', '\x4', 
		'\x3', '\x4', '\x3', '\x5', '\x3', '\x5', '\x3', '\x6', '\x3', '\x6', 
		'\x3', '\a', '\x3', '\a', '\x3', '\b', '\x3', '\b', '\x3', '\t', '\x3', 
		'\t', '\x3', '\n', '\x3', '\n', '\x3', '\v', '\x3', '\v', '\x3', '\f', 
		'\x3', '\f', '\x3', '\r', '\x3', '\r', '\x3', '\xE', '\x3', '\xE', '\x3', 
		'\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\x10', '\x3', '\x10', '\x3', 
		'\x10', '\x3', '\x11', '\x3', '\x11', '\x3', '\x12', '\x3', '\x12', '\x3', 
		'\x12', '\x3', '\x13', '\x3', '\x13', '\x3', '\x14', '\x3', '\x14', '\x3', 
		'\x14', '\x3', '\x15', '\x3', '\x15', '\x3', '\x15', '\x3', '\x15', '\x3', 
		'\x15', '\x3', '\x15', '\x3', '\x16', '\x3', '\x16', '\x3', '\x16', '\x3', 
		'\x16', '\x3', '\x16', '\x3', '\x16', '\x3', '\x16', '\x3', '\x16', '\x3', 
		'\x16', '\x3', '\x17', '\x3', '\x17', '\x3', '\x17', '\x3', '\x17', '\x3', 
		'\x17', '\x3', '\x17', '\x3', '\x17', '\x3', '\x17', '\x3', '\x17', '\x3', 
		'\x18', '\x3', '\x18', '\x3', '\x18', '\x3', '\x19', '\x3', '\x19', '\x3', 
		'\x19', '\x3', '\x19', '\x3', '\x19', '\x3', '\x1A', '\x3', '\x1A', '\x3', 
		'\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1B', '\x3', 
		'\x1B', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', '\x3', 
		'\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', 
		'\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1D', '\x3', 
		'\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1E', '\x3', 
		'\x1E', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1E', '\x3', 
		'\x1E', '\x3', '\x1F', '\x3', '\x1F', '\x3', ' ', '\x3', ' ', '\x3', '!', 
		'\x3', '!', '\x3', '\"', '\x3', '\"', '\x3', '\"', '\x3', '\"', '\x3', 
		'#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '$', '\x3', '$', '\x3', 
		'$', '\x3', '$', '\x3', '$', '\x3', '$', '\x3', '$', '\x3', '%', '\x6', 
		'%', '\xDD', '\n', '%', '\r', '%', '\xE', '%', '\xDE', '\x3', '&', '\x6', 
		'&', '\xE2', '\n', '&', '\r', '&', '\xE', '&', '\xE3', '\x3', '\'', '\x3', 
		'\'', '\a', '\'', '\xE8', '\n', '\'', '\f', '\'', '\xE', '\'', '\xEB', 
		'\v', '\'', '\x3', '\'', '\x3', '\'', '\x2', '\x2', '(', '\x3', '\x3', 
		'\x5', '\x4', '\a', '\x5', '\t', '\x6', '\v', '\a', '\r', '\b', '\xF', 
		'\t', '\x11', '\n', '\x13', '\v', '\x15', '\f', '\x17', '\r', '\x19', 
		'\xE', '\x1B', '\xF', '\x1D', '\x10', '\x1F', '\x11', '!', '\x12', '#', 
		'\x13', '%', '\x14', '\'', '\x15', ')', '\x16', '+', '\x17', '-', '\x18', 
		'/', '\x19', '\x31', '\x1A', '\x33', '\x1B', '\x35', '\x1C', '\x37', '\x1D', 
		'\x39', '\x1E', ';', '\x1F', '=', ' ', '?', '!', '\x41', '\"', '\x43', 
		'#', '\x45', '$', 'G', '%', 'I', '&', 'K', '\'', 'M', '(', '\x3', '\x2', 
		'\x5', '\x3', '\x2', '\f', '\f', '\x5', '\x2', '\v', '\f', '\xF', '\xF', 
		'\"', '\"', '\x3', '\x2', '$', '$', '\x2', '\xF2', '\x2', '\x3', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x5', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\a', '\x3', '\x2', '\x2', '\x2', '\x2', '\t', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\v', '\x3', '\x2', '\x2', '\x2', '\x2', '\r', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\xF', '\x3', '\x2', '\x2', '\x2', '\x2', '\x11', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x13', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x15', '\x3', '\x2', '\x2', '\x2', '\x2', '\x17', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x19', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1B', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x1D', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x1F', '\x3', '\x2', '\x2', '\x2', '\x2', '!', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '#', '\x3', '\x2', '\x2', '\x2', '\x2', '%', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\'', '\x3', '\x2', '\x2', '\x2', '\x2', ')', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '+', '\x3', '\x2', '\x2', '\x2', '\x2', '-', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '/', '\x3', '\x2', '\x2', '\x2', '\x2', '\x31', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x33', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x35', '\x3', '\x2', '\x2', '\x2', '\x2', '\x37', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x39', '\x3', '\x2', '\x2', '\x2', '\x2', ';', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '=', '\x3', '\x2', '\x2', '\x2', '\x2', '?', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x41', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x43', '\x3', '\x2', '\x2', '\x2', '\x2', '\x45', '\x3', '\x2', 
		'\x2', '\x2', '\x2', 'G', '\x3', '\x2', '\x2', '\x2', '\x2', 'I', '\x3', 
		'\x2', '\x2', '\x2', '\x2', 'K', '\x3', '\x2', '\x2', '\x2', '\x2', 'M', 
		'\x3', '\x2', '\x2', '\x2', '\x3', 'O', '\x3', '\x2', '\x2', '\x2', '\x5', 
		'Y', '\x3', '\x2', '\x2', '\x2', '\a', '_', '\x3', '\x2', '\x2', '\x2', 
		'\t', '\x61', '\x3', '\x2', '\x2', '\x2', '\v', '\x63', '\x3', '\x2', 
		'\x2', '\x2', '\r', '\x65', '\x3', '\x2', '\x2', '\x2', '\xF', 'g', '\x3', 
		'\x2', '\x2', '\x2', '\x11', 'i', '\x3', '\x2', '\x2', '\x2', '\x13', 
		'k', '\x3', '\x2', '\x2', '\x2', '\x15', 'm', '\x3', '\x2', '\x2', '\x2', 
		'\x17', 'o', '\x3', '\x2', '\x2', '\x2', '\x19', 'q', '\x3', '\x2', '\x2', 
		'\x2', '\x1B', 's', '\x3', '\x2', '\x2', '\x2', '\x1D', 'u', '\x3', '\x2', 
		'\x2', '\x2', '\x1F', 'x', '\x3', '\x2', '\x2', '\x2', '!', '{', '\x3', 
		'\x2', '\x2', '\x2', '#', '}', '\x3', '\x2', '\x2', '\x2', '%', '\x80', 
		'\x3', '\x2', '\x2', '\x2', '\'', '\x82', '\x3', '\x2', '\x2', '\x2', 
		')', '\x85', '\x3', '\x2', '\x2', '\x2', '+', '\x8B', '\x3', '\x2', '\x2', 
		'\x2', '-', '\x94', '\x3', '\x2', '\x2', '\x2', '/', '\x9D', '\x3', '\x2', 
		'\x2', '\x2', '\x31', '\xA0', '\x3', '\x2', '\x2', '\x2', '\x33', '\xA5', 
		'\x3', '\x2', '\x2', '\x2', '\x35', '\xAB', '\x3', '\x2', '\x2', '\x2', 
		'\x37', '\xB1', '\x3', '\x2', '\x2', '\x2', '\x39', '\xBA', '\x3', '\x2', 
		'\x2', '\x2', ';', '\xBF', '\x3', '\x2', '\x2', '\x2', '=', '\xC6', '\x3', 
		'\x2', '\x2', '\x2', '?', '\xC8', '\x3', '\x2', '\x2', '\x2', '\x41', 
		'\xCA', '\x3', '\x2', '\x2', '\x2', '\x43', '\xCC', '\x3', '\x2', '\x2', 
		'\x2', '\x45', '\xD0', '\x3', '\x2', '\x2', '\x2', 'G', '\xD4', '\x3', 
		'\x2', '\x2', '\x2', 'I', '\xDC', '\x3', '\x2', '\x2', '\x2', 'K', '\xE1', 
		'\x3', '\x2', '\x2', '\x2', 'M', '\xE5', '\x3', '\x2', '\x2', '\x2', 'O', 
		'S', '\a', '%', '\x2', '\x2', 'P', 'R', '\n', '\x2', '\x2', '\x2', 'Q', 
		'P', '\x3', '\x2', '\x2', '\x2', 'R', 'U', '\x3', '\x2', '\x2', '\x2', 
		'S', 'Q', '\x3', '\x2', '\x2', '\x2', 'S', 'T', '\x3', '\x2', '\x2', '\x2', 
		'T', 'V', '\x3', '\x2', '\x2', '\x2', 'U', 'S', '\x3', '\x2', '\x2', '\x2', 
		'V', 'W', '\b', '\x2', '\x2', '\x2', 'W', '\x4', '\x3', '\x2', '\x2', 
		'\x2', 'X', 'Z', '\t', '\x3', '\x2', '\x2', 'Y', 'X', '\x3', '\x2', '\x2', 
		'\x2', 'Z', '[', '\x3', '\x2', '\x2', '\x2', '[', 'Y', '\x3', '\x2', '\x2', 
		'\x2', '[', '\\', '\x3', '\x2', '\x2', '\x2', '\\', ']', '\x3', '\x2', 
		'\x2', '\x2', ']', '^', '\b', '\x3', '\x2', '\x2', '^', '\x6', '\x3', 
		'\x2', '\x2', '\x2', '_', '`', '\a', '-', '\x2', '\x2', '`', '\b', '\x3', 
		'\x2', '\x2', '\x2', '\x61', '\x62', '\a', '/', '\x2', '\x2', '\x62', 
		'\n', '\x3', '\x2', '\x2', '\x2', '\x63', '\x64', '\a', ',', '\x2', '\x2', 
		'\x64', '\f', '\x3', '\x2', '\x2', '\x2', '\x65', '\x66', '\a', '\x31', 
		'\x2', '\x2', '\x66', '\xE', '\x3', '\x2', '\x2', '\x2', 'g', 'h', '\a', 
		'\'', '\x2', '\x2', 'h', '\x10', '\x3', '\x2', '\x2', '\x2', 'i', 'j', 
		'\a', '*', '\x2', '\x2', 'j', '\x12', '\x3', '\x2', '\x2', '\x2', 'k', 
		'l', '\a', '+', '\x2', '\x2', 'l', '\x14', '\x3', '\x2', '\x2', '\x2', 
		'm', 'n', '\a', '?', '\x2', '\x2', 'n', '\x16', '\x3', '\x2', '\x2', '\x2', 
		'o', 'p', '\a', '.', '\x2', '\x2', 'p', '\x18', '\x3', '\x2', '\x2', '\x2', 
		'q', 'r', '\a', '}', '\x2', '\x2', 'r', '\x1A', '\x3', '\x2', '\x2', '\x2', 
		's', 't', '\a', '\x7F', '\x2', '\x2', 't', '\x1C', '\x3', '\x2', '\x2', 
		'\x2', 'u', 'v', '\a', '?', '\x2', '\x2', 'v', 'w', '\a', '?', '\x2', 
		'\x2', 'w', '\x1E', '\x3', '\x2', '\x2', '\x2', 'x', 'y', '\a', '#', '\x2', 
		'\x2', 'y', 'z', '\a', '?', '\x2', '\x2', 'z', ' ', '\x3', '\x2', '\x2', 
		'\x2', '{', '|', '\a', '@', '\x2', '\x2', '|', '\"', '\x3', '\x2', '\x2', 
		'\x2', '}', '~', '\a', '@', '\x2', '\x2', '~', '\x7F', '\a', '?', '\x2', 
		'\x2', '\x7F', '$', '\x3', '\x2', '\x2', '\x2', '\x80', '\x81', '\a', 
		'>', '\x2', '\x2', '\x81', '&', '\x3', '\x2', '\x2', '\x2', '\x82', '\x83', 
		'\a', '>', '\x2', '\x2', '\x83', '\x84', '\a', '?', '\x2', '\x2', '\x84', 
		'(', '\x3', '\x2', '\x2', '\x2', '\x85', '\x86', '\a', 'r', '\x2', '\x2', 
		'\x86', '\x87', '\a', 't', '\x2', '\x2', '\x87', '\x88', '\a', 'k', '\x2', 
		'\x2', '\x88', '\x89', '\a', 'p', '\x2', '\x2', '\x89', '\x8A', '\a', 
		'v', '\x2', '\x2', '\x8A', '*', '\x3', '\x2', '\x2', '\x2', '\x8B', '\x8C', 
		'\a', 't', '\x2', '\x2', '\x8C', '\x8D', '\a', 'g', '\x2', '\x2', '\x8D', 
		'\x8E', '\a', '\x63', '\x2', '\x2', '\x8E', '\x8F', '\a', '\x66', '\x2', 
		'\x2', '\x8F', '\x90', '\a', '\x61', '\x2', '\x2', '\x90', '\x91', '\a', 
		'k', '\x2', '\x2', '\x91', '\x92', '\a', 'p', '\x2', '\x2', '\x92', '\x93', 
		'\a', 'v', '\x2', '\x2', '\x93', ',', '\x3', '\x2', '\x2', '\x2', '\x94', 
		'\x95', '\a', 't', '\x2', '\x2', '\x95', '\x96', '\a', 'g', '\x2', '\x2', 
		'\x96', '\x97', '\a', '\x63', '\x2', '\x2', '\x97', '\x98', '\a', '\x66', 
		'\x2', '\x2', '\x98', '\x99', '\a', '\x61', '\x2', '\x2', '\x99', '\x9A', 
		'\a', 'u', '\x2', '\x2', '\x9A', '\x9B', '\a', 'v', '\x2', '\x2', '\x9B', 
		'\x9C', '\a', 't', '\x2', '\x2', '\x9C', '.', '\x3', '\x2', '\x2', '\x2', 
		'\x9D', '\x9E', '\a', 'k', '\x2', '\x2', '\x9E', '\x9F', '\a', 'h', '\x2', 
		'\x2', '\x9F', '\x30', '\x3', '\x2', '\x2', '\x2', '\xA0', '\xA1', '\a', 
		'g', '\x2', '\x2', '\xA1', '\xA2', '\a', 'n', '\x2', '\x2', '\xA2', '\xA3', 
		'\a', 'u', '\x2', '\x2', '\xA3', '\xA4', '\a', 'g', '\x2', '\x2', '\xA4', 
		'\x32', '\x3', '\x2', '\x2', '\x2', '\xA5', '\xA6', '\a', 'y', '\x2', 
		'\x2', '\xA6', '\xA7', '\a', 'j', '\x2', '\x2', '\xA7', '\xA8', '\a', 
		'k', '\x2', '\x2', '\xA8', '\xA9', '\a', 'n', '\x2', '\x2', '\xA9', '\xAA', 
		'\a', 'g', '\x2', '\x2', '\xAA', '\x34', '\x3', '\x2', '\x2', '\x2', '\xAB', 
		'\xAC', '\a', '\x64', '\x2', '\x2', '\xAC', '\xAD', '\a', 't', '\x2', 
		'\x2', '\xAD', '\xAE', '\a', 'g', '\x2', '\x2', '\xAE', '\xAF', '\a', 
		'\x63', '\x2', '\x2', '\xAF', '\xB0', '\a', 'm', '\x2', '\x2', '\xB0', 
		'\x36', '\x3', '\x2', '\x2', '\x2', '\xB1', '\xB2', '\a', '\x65', '\x2', 
		'\x2', '\xB2', '\xB3', '\a', 'q', '\x2', '\x2', '\xB3', '\xB4', '\a', 
		'p', '\x2', '\x2', '\xB4', '\xB5', '\a', 'v', '\x2', '\x2', '\xB5', '\xB6', 
		'\a', 'k', '\x2', '\x2', '\xB6', '\xB7', '\a', 'p', '\x2', '\x2', '\xB7', 
		'\xB8', '\a', 'w', '\x2', '\x2', '\xB8', '\xB9', '\a', 'g', '\x2', '\x2', 
		'\xB9', '\x38', '\x3', '\x2', '\x2', '\x2', '\xBA', '\xBB', '\a', 'r', 
		'\x2', '\x2', '\xBB', '\xBC', '\a', 'w', '\x2', '\x2', '\xBC', '\xBD', 
		'\a', 'u', '\x2', '\x2', '\xBD', '\xBE', '\a', 'j', '\x2', '\x2', '\xBE', 
		':', '\x3', '\x2', '\x2', '\x2', '\xBF', '\xC0', '\a', 'n', '\x2', '\x2', 
		'\xC0', '\xC1', '\a', 'g', '\x2', '\x2', '\xC1', '\xC2', '\a', 'p', '\x2', 
		'\x2', '\xC2', '\xC3', '\a', 'i', '\x2', '\x2', '\xC3', '\xC4', '\a', 
		'v', '\x2', '\x2', '\xC4', '\xC5', '\a', 'j', '\x2', '\x2', '\xC5', '<', 
		'\x3', '\x2', '\x2', '\x2', '\xC6', '\xC7', '\a', ']', '\x2', '\x2', '\xC7', 
		'>', '\x3', '\x2', '\x2', '\x2', '\xC8', '\xC9', '\a', '_', '\x2', '\x2', 
		'\xC9', '@', '\x3', '\x2', '\x2', '\x2', '\xCA', '\xCB', '\a', '\x30', 
		'\x2', '\x2', '\xCB', '\x42', '\x3', '\x2', '\x2', '\x2', '\xCC', '\xCD', 
		'\a', '\x66', '\x2', '\x2', '\xCD', '\xCE', '\a', 'g', '\x2', '\x2', '\xCE', 
		'\xCF', '\a', 'h', '\x2', '\x2', '\xCF', '\x44', '\x3', '\x2', '\x2', 
		'\x2', '\xD0', '\xD1', '\a', 'k', '\x2', '\x2', '\xD1', '\xD2', '\a', 
		'p', '\x2', '\x2', '\xD2', '\xD3', '\a', 'v', '\x2', '\x2', '\xD3', '\x46', 
		'\x3', '\x2', '\x2', '\x2', '\xD4', '\xD5', '\a', 't', '\x2', '\x2', '\xD5', 
		'\xD6', '\a', 'g', '\x2', '\x2', '\xD6', '\xD7', '\a', 'v', '\x2', '\x2', 
		'\xD7', '\xD8', '\a', 'w', '\x2', '\x2', '\xD8', '\xD9', '\a', 't', '\x2', 
		'\x2', '\xD9', '\xDA', '\a', 'p', '\x2', '\x2', '\xDA', 'H', '\x3', '\x2', 
		'\x2', '\x2', '\xDB', '\xDD', '\x4', '\x32', ';', '\x2', '\xDC', '\xDB', 
		'\x3', '\x2', '\x2', '\x2', '\xDD', '\xDE', '\x3', '\x2', '\x2', '\x2', 
		'\xDE', '\xDC', '\x3', '\x2', '\x2', '\x2', '\xDE', '\xDF', '\x3', '\x2', 
		'\x2', '\x2', '\xDF', 'J', '\x3', '\x2', '\x2', '\x2', '\xE0', '\xE2', 
		'\x4', '\x63', '|', '\x2', '\xE1', '\xE0', '\x3', '\x2', '\x2', '\x2', 
		'\xE2', '\xE3', '\x3', '\x2', '\x2', '\x2', '\xE3', '\xE1', '\x3', '\x2', 
		'\x2', '\x2', '\xE3', '\xE4', '\x3', '\x2', '\x2', '\x2', '\xE4', 'L', 
		'\x3', '\x2', '\x2', '\x2', '\xE5', '\xE9', '\a', '$', '\x2', '\x2', '\xE6', 
		'\xE8', '\n', '\x4', '\x2', '\x2', '\xE7', '\xE6', '\x3', '\x2', '\x2', 
		'\x2', '\xE8', '\xEB', '\x3', '\x2', '\x2', '\x2', '\xE9', '\xE7', '\x3', 
		'\x2', '\x2', '\x2', '\xE9', '\xEA', '\x3', '\x2', '\x2', '\x2', '\xEA', 
		'\xEC', '\x3', '\x2', '\x2', '\x2', '\xEB', '\xE9', '\x3', '\x2', '\x2', 
		'\x2', '\xEC', '\xED', '\a', '$', '\x2', '\x2', '\xED', 'N', '\x3', '\x2', 
		'\x2', '\x2', '\b', '\x2', 'S', '[', '\xDE', '\xE3', '\xE9', '\x3', '\b', 
		'\x2', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
