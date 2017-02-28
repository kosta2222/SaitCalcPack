package com.kosta.antlr.svet;
// Generated from svet.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class svetParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, INT=15, DOUBLE=16, COMMENT=17, 
		WS=18;
	public static final String[] tokenNames = {
		"<INVALID>", "'telic'", "'svet'", "'rub'", "':'", "'['", "'='", "']'", 
		"'('", "'comp'", "')'", "'lamp'", "'refrig'", "','", "'N'", "INT", "DOUBLE", 
		"COMMENT", "WS"
	};
	public static final int
		RULE_input = 0, RULE_svet = 1, RULE_lamp = 2, RULE_comp = 3, RULE_refrig = 4, 
		RULE_telic = 5, RULE_rub = 6, RULE_n = 7, RULE_kolvoVat = 8, RULE_amount = 9, 
		RULE_rab = 10, RULE_atom = 11;
	public static final String[] ruleNames = {
		"input", "svet", "lamp", "comp", "refrig", "telic", "rub", "n", "kolvoVat", 
		"amount", "rab", "atom"
	};

	@Override
	public String getGrammarFileName() { return "svet.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public svetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputContext extends ParserRuleContext {
		public SvetContext svet() {
			return getRuleContext(SvetContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svetVisitor ) return ((svetVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); svet();
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

	public static class SvetContext extends ParserRuleContext {
		public TelicContext telic() {
			return getRuleContext(TelicContext.class,0);
		}
		public LampContext lamp() {
			return getRuleContext(LampContext.class,0);
		}
		public RubContext rub() {
			return getRuleContext(RubContext.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public RefrigContext refrig() {
			return getRuleContext(RefrigContext.class,0);
		}
		public SvetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_svet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svetVisitor ) return ((svetVisitor<? extends T>)visitor).visitSvet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SvetContext svet() throws RecognitionException {
		SvetContext _localctx = new SvetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_svet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(2);
			setState(27); match(4);
			{
			setState(29);
			_la = _input.LA(1);
			if (_la==11) {
				{
				setState(28); lamp();
				}
			}

			setState(32);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(31); comp();
				}
			}

			setState(35);
			_la = _input.LA(1);
			if (_la==12) {
				{
				setState(34); refrig();
				}
			}

			setState(38);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(37); telic();
				}
			}

			}
			setState(40); rub();
			setState(41); n();
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

	public static class LampContext extends ParserRuleContext {
		public LampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lamp; }
	 
		public LampContext() { }
		public void copyFrom(LampContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToLampContext extends LampContext {
		public KolvoVatContext kolvoVat() {
			return getRuleContext(KolvoVatContext.class,0);
		}
		public RabContext rab() {
			return getRuleContext(RabContext.class,0);
		}
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public ToLampContext(LampContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svetVisitor ) return ((svetVisitor<? extends T>)visitor).visitToLamp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LampContext lamp() throws RecognitionException {
		LampContext _localctx = new LampContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lamp);
		try {
			_localctx = new ToLampContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(11);
			setState(44); match(8);
			setState(45); kolvoVat();
			setState(46); match(13);
			setState(47); amount();
			setState(48); match(10);
			setState(49); match(5);
			setState(50); rab();
			setState(51); match(7);
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

	public static class CompContext extends ParserRuleContext {
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
	 
		public CompContext() { }
		public void copyFrom(CompContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToCompContext extends CompContext {
		public KolvoVatContext kolvoVat() {
			return getRuleContext(KolvoVatContext.class,0);
		}
		public RabContext rab() {
			return getRuleContext(RabContext.class,0);
		}
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public ToCompContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svetVisitor ) return ((svetVisitor<? extends T>)visitor).visitToComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comp);
		try {
			_localctx = new ToCompContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(9);
			setState(54); match(8);
			setState(55); kolvoVat();
			setState(56); match(13);
			setState(57); amount();
			setState(58); match(10);
			setState(59); match(5);
			setState(60); rab();
			setState(61); match(7);
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

	public static class RefrigContext extends ParserRuleContext {
		public RefrigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refrig; }
	 
		public RefrigContext() { }
		public void copyFrom(RefrigContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToRefrigContext extends RefrigContext {
		public KolvoVatContext kolvoVat() {
			return getRuleContext(KolvoVatContext.class,0);
		}
		public RabContext rab() {
			return getRuleContext(RabContext.class,0);
		}
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public ToRefrigContext(RefrigContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svetVisitor ) return ((svetVisitor<? extends T>)visitor).visitToRefrig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefrigContext refrig() throws RecognitionException {
		RefrigContext _localctx = new RefrigContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_refrig);
		try {
			_localctx = new ToRefrigContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(12);
			setState(64); match(8);
			setState(65); kolvoVat();
			setState(66); match(13);
			setState(67); amount();
			setState(68); match(10);
			setState(69); match(5);
			setState(70); rab();
			setState(71); match(7);
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

	public static class TelicContext extends ParserRuleContext {
		public TelicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_telic; }
	 
		public TelicContext() { }
		public void copyFrom(TelicContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToTelContext extends TelicContext {
		public KolvoVatContext kolvoVat() {
			return getRuleContext(KolvoVatContext.class,0);
		}
		public RabContext rab() {
			return getRuleContext(RabContext.class,0);
		}
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public ToTelContext(TelicContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svetVisitor ) return ((svetVisitor<? extends T>)visitor).visitToTel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TelicContext telic() throws RecognitionException {
		TelicContext _localctx = new TelicContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_telic);
		try {
			_localctx = new ToTelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(1);
			setState(74); match(8);
			setState(75); kolvoVat();
			setState(76); match(13);
			setState(77); amount();
			setState(78); match(10);
			setState(79); match(5);
			setState(80); rab();
			setState(81); match(7);
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

	public static class RubContext extends ParserRuleContext {
		public RubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rub; }
	 
		public RubContext() { }
		public void copyFrom(RubContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToRubContext extends RubContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ToRubContext(RubContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svetVisitor ) return ((svetVisitor<? extends T>)visitor).visitToRub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RubContext rub() throws RecognitionException {
		RubContext _localctx = new RubContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rub);
		try {
			_localctx = new ToRubContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(3);
			setState(84); match(6);
			setState(85); atom();
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

	public static class NContext extends ParserRuleContext {
		public NContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n; }
	 
		public NContext() { }
		public void copyFrom(NContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToNContext extends NContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ToNContext(NContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svetVisitor ) return ((svetVisitor<? extends T>)visitor).visitToN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NContext n() throws RecognitionException {
		NContext _localctx = new NContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_n);
		try {
			_localctx = new ToNContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(14);
			setState(88); match(6);
			setState(89); atom();
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

	public static class KolvoVatContext extends ParserRuleContext {
		public KolvoVatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kolvoVat; }
	 
		public KolvoVatContext() { }
		public void copyFrom(KolvoVatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToKolVatContext extends KolvoVatContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ToKolVatContext(KolvoVatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svetVisitor ) return ((svetVisitor<? extends T>)visitor).visitToKolVat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KolvoVatContext kolvoVat() throws RecognitionException {
		KolvoVatContext _localctx = new KolvoVatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_kolvoVat);
		try {
			_localctx = new ToKolVatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91); atom();
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

	public static class AmountContext extends ParserRuleContext {
		public AmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amount; }
	 
		public AmountContext() { }
		public void copyFrom(AmountContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToAmountContext extends AmountContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ToAmountContext(AmountContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svetVisitor ) return ((svetVisitor<? extends T>)visitor).visitToAmount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmountContext amount() throws RecognitionException {
		AmountContext _localctx = new AmountContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_amount);
		try {
			_localctx = new ToAmountContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93); atom();
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

	public static class RabContext extends ParserRuleContext {
		public RabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rab; }
	 
		public RabContext() { }
		public void copyFrom(RabContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToRabContext extends RabContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ToRabContext(RabContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svetVisitor ) return ((svetVisitor<? extends T>)visitor).visitToRab(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RabContext rab() throws RecognitionException {
		RabContext _localctx = new RabContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rab);
		try {
			_localctx = new ToRabContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95); atom();
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToIntContext extends AtomContext {
		public TerminalNode INT() { return getToken(svetParser.INT, 0); }
		public ToIntContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svetVisitor ) return ((svetVisitor<? extends T>)visitor).visitToInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToDoubleContext extends AtomContext {
		public TerminalNode DOUBLE() { return getToken(svetParser.DOUBLE, 0); }
		public ToDoubleContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svetVisitor ) return ((svetVisitor<? extends T>)visitor).visitToDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atom);
		try {
			setState(99);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new ToIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97); match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new ToDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98); match(DOUBLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\5\3 \n\3\3\3\5\3#\n\3\3\3\5\3&\n\3"+
		"\3\3\5\3)\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\5\rf\n\r\3\r\2\2\16\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\2\2`\2\32\3\2\2\2\4\34\3\2\2\2\6-\3\2\2\2\b\67"+
		"\3\2\2\2\nA\3\2\2\2\fK\3\2\2\2\16U\3\2\2\2\20Y\3\2\2\2\22]\3\2\2\2\24"+
		"_\3\2\2\2\26a\3\2\2\2\30e\3\2\2\2\32\33\5\4\3\2\33\3\3\2\2\2\34\35\7\4"+
		"\2\2\35\37\7\6\2\2\36 \5\6\4\2\37\36\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!#"+
		"\5\b\5\2\"!\3\2\2\2\"#\3\2\2\2#%\3\2\2\2$&\5\n\6\2%$\3\2\2\2%&\3\2\2\2"+
		"&(\3\2\2\2\')\5\f\7\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\5\16\b\2+,\5\20"+
		"\t\2,\5\3\2\2\2-.\7\r\2\2./\7\n\2\2/\60\5\22\n\2\60\61\7\17\2\2\61\62"+
		"\5\24\13\2\62\63\7\f\2\2\63\64\7\7\2\2\64\65\5\26\f\2\65\66\7\t\2\2\66"+
		"\7\3\2\2\2\678\7\13\2\289\7\n\2\29:\5\22\n\2:;\7\17\2\2;<\5\24\13\2<="+
		"\7\f\2\2=>\7\7\2\2>?\5\26\f\2?@\7\t\2\2@\t\3\2\2\2AB\7\16\2\2BC\7\n\2"+
		"\2CD\5\22\n\2DE\7\17\2\2EF\5\24\13\2FG\7\f\2\2GH\7\7\2\2HI\5\26\f\2IJ"+
		"\7\t\2\2J\13\3\2\2\2KL\7\3\2\2LM\7\n\2\2MN\5\22\n\2NO\7\17\2\2OP\5\24"+
		"\13\2PQ\7\f\2\2QR\7\7\2\2RS\5\26\f\2ST\7\t\2\2T\r\3\2\2\2UV\7\5\2\2VW"+
		"\7\b\2\2WX\5\30\r\2X\17\3\2\2\2YZ\7\20\2\2Z[\7\b\2\2[\\\5\30\r\2\\\21"+
		"\3\2\2\2]^\5\30\r\2^\23\3\2\2\2_`\5\30\r\2`\25\3\2\2\2ab\5\30\r\2b\27"+
		"\3\2\2\2cf\7\21\2\2df\7\22\2\2ec\3\2\2\2ed\3\2\2\2f\31\3\2\2\2\7\37\""+
		"%(e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}