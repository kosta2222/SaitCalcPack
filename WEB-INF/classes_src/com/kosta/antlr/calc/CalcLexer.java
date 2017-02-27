// Generated from Calc.g4 by ANTLR 4.2.2
package com.kosta.antlr.calc;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, INT=11, ID=12, COMMENT=13, End=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'sin'", "'tan'", "'('", "')'", "'*'", "'cos'", "'+'", "'-'", "'='", 
		"INT", "ID", "COMMENT", "End", "WS"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "INT", "ID", "COMMENT", "End", "WS"
	};


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\6\f=\n\f\r\f\16\f>\3\r\3\r\6\rC\n\r\r\r\16\rD\3\16"+
		"\3\16\3\16\3\16\6\16K\n\16\r\16\16\16L\3\16\5\16P\n\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\6\20Y\n\20\r\20\16\20Z\3\20\3\20\3L\2\21\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3"+
		"\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3\3\f\f\5\2\13\f\17\17\"\"a\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2"+
		"\7\'\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\65\3\2"+
		"\2\2\23\67\3\2\2\2\259\3\2\2\2\27<\3\2\2\2\31@\3\2\2\2\33F\3\2\2\2\35"+
		"S\3\2\2\2\37X\3\2\2\2!\"\7\61\2\2\"\4\3\2\2\2#$\7u\2\2$%\7k\2\2%&\7p\2"+
		"\2&\6\3\2\2\2\'(\7v\2\2()\7c\2\2)*\7p\2\2*\b\3\2\2\2+,\7*\2\2,\n\3\2\2"+
		"\2-.\7+\2\2.\f\3\2\2\2/\60\7,\2\2\60\16\3\2\2\2\61\62\7e\2\2\62\63\7q"+
		"\2\2\63\64\7u\2\2\64\20\3\2\2\2\65\66\7-\2\2\66\22\3\2\2\2\678\7/\2\2"+
		"8\24\3\2\2\29:\7?\2\2:\26\3\2\2\2;=\t\2\2\2<;\3\2\2\2=>\3\2\2\2><\3\2"+
		"\2\2>?\3\2\2\2?\30\3\2\2\2@B\t\3\2\2AC\t\4\2\2BA\3\2\2\2CD\3\2\2\2DB\3"+
		"\2\2\2DE\3\2\2\2E\32\3\2\2\2FG\7\61\2\2GH\7\61\2\2HJ\3\2\2\2IK\13\2\2"+
		"\2JI\3\2\2\2KL\3\2\2\2LM\3\2\2\2LJ\3\2\2\2MO\3\2\2\2NP\t\5\2\2ON\3\2\2"+
		"\2PQ\3\2\2\2QR\b\16\2\2R\34\3\2\2\2ST\7\2\2\3TU\3\2\2\2UV\b\17\2\2V\36"+
		"\3\2\2\2WY\t\6\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2"+
		"\\]\b\20\2\2] \3\2\2\2\b\2>DLOZ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}