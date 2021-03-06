package com.kosta.antlr.svet;
// Generated from svet.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class svetLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, INT=15, DOUBLE=16, COMMENT=17, 
		WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'telic'", "'svet'", "'rub'", "':'", "'['", "'='", "']'", "'('", "'comp'", 
		"')'", "'lamp'", "'refrig'", "','", "'N'", "INT", "DOUBLE", "COMMENT", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "INT", "DOUBLE", "COMMENT", "WS"
	};


	public svetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "svet.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\6\20Y\n\20\r\20\16\20Z\3\21\6\21^\n\21\r\21\16\21_\3\21\3\21\6\21"+
		"d\n\21\r\21\16\21e\3\22\3\22\3\22\3\22\6\22l\n\22\r\22\16\22m\3\22\5\22"+
		"q\n\22\3\22\3\22\3\23\6\23v\n\23\r\23\16\23w\3\23\3\23\3m\2\24\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\3\2\5\3\2\62;\3\3\f\f\5\2\13\f\16\17\"\"\177\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3"+
		"\'\3\2\2\2\5-\3\2\2\2\7\62\3\2\2\2\t\66\3\2\2\2\138\3\2\2\2\r:\3\2\2\2"+
		"\17<\3\2\2\2\21>\3\2\2\2\23@\3\2\2\2\25E\3\2\2\2\27G\3\2\2\2\31L\3\2\2"+
		"\2\33S\3\2\2\2\35U\3\2\2\2\37X\3\2\2\2!]\3\2\2\2#g\3\2\2\2%u\3\2\2\2\'"+
		"(\7v\2\2()\7g\2\2)*\7n\2\2*+\7k\2\2+,\7e\2\2,\4\3\2\2\2-.\7u\2\2./\7x"+
		"\2\2/\60\7g\2\2\60\61\7v\2\2\61\6\3\2\2\2\62\63\7t\2\2\63\64\7w\2\2\64"+
		"\65\7d\2\2\65\b\3\2\2\2\66\67\7<\2\2\67\n\3\2\2\289\7]\2\29\f\3\2\2\2"+
		":;\7?\2\2;\16\3\2\2\2<=\7_\2\2=\20\3\2\2\2>?\7*\2\2?\22\3\2\2\2@A\7e\2"+
		"\2AB\7q\2\2BC\7o\2\2CD\7r\2\2D\24\3\2\2\2EF\7+\2\2F\26\3\2\2\2GH\7n\2"+
		"\2HI\7c\2\2IJ\7o\2\2JK\7r\2\2K\30\3\2\2\2LM\7t\2\2MN\7g\2\2NO\7h\2\2O"+
		"P\7t\2\2PQ\7k\2\2QR\7i\2\2R\32\3\2\2\2ST\7.\2\2T\34\3\2\2\2UV\7P\2\2V"+
		"\36\3\2\2\2WY\t\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[ \3\2\2"+
		"\2\\^\t\2\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\7\60"+
		"\2\2bd\t\2\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\"\3\2\2\2gh\7"+
		"\61\2\2hi\7\61\2\2ik\3\2\2\2jl\13\2\2\2kj\3\2\2\2lm\3\2\2\2mn\3\2\2\2"+
		"mk\3\2\2\2np\3\2\2\2oq\t\3\2\2po\3\2\2\2qr\3\2\2\2rs\b\22\2\2s$\3\2\2"+
		"\2tv\t\4\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\23"+
		"\2\2z&\3\2\2\2\t\2Z_empw\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}