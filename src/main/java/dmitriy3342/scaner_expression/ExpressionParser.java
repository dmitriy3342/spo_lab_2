// Generated from D:/Учёба/4 Курс/СПО/lab_2/src/main/java\Expression.g4 by ANTLR 4.5.3
package dmitriy3342.scaner_expression;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, DATE=7, ACCORD=8, IDENTIFIER=9, 
		STRING=10, PLUS=11, MINUS=12, DEL=13, MUL=14, LPAM=15, RPAM=16, NUMBER=17, 
		SEP=18, NEWLINE=19, WS=20, COMMENT=21, LINE_COMMENT=22;
	public static final int
		RULE_start = 0, RULE_exprBlock = 1, RULE_exprLine = 2, RULE_expr = 3, 
		RULE_print = 4, RULE_elementAssignment = 5, RULE_elementValue = 6, RULE_date = 7, 
		RULE_accord = 8, RULE_atom = 9;
	public static final String[] ruleNames = {
		"start", "exprBlock", "exprLine", "expr", "print", "elementAssignment", 
		"elementValue", "date", "accord", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'^'", "'print('", "'='", "'date('", "'accord('", null, null, 
		null, null, "'+'", "'-'", "'/'", "'*'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "DATE", "ACCORD", "IDENTIFIER", 
		"STRING", "PLUS", "MINUS", "DEL", "MUL", "LPAM", "RPAM", "NUMBER", "SEP", 
		"NEWLINE", "WS", "COMMENT", "LINE_COMMENT"
	};
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
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ExprBlockContext exprBlock() {
			return getRuleContext(ExprBlockContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			exprBlock();
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

	public static class ExprBlockContext extends ParserRuleContext {
		public List<ExprLineContext> exprLine() {
			return getRuleContexts(ExprLineContext.class);
		}
		public ExprLineContext exprLine(int i) {
			return getRuleContext(ExprLineContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExpressionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExpressionParser.NEWLINE, i);
		}
		public ExprBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExprBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExprBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitExprBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprBlockContext exprBlock() throws RecognitionException {
		ExprBlockContext _localctx = new ExprBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exprBlock);
		int _la;
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				exprLine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				exprLine();
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(24);
					match(NEWLINE);
					setState(25);
					exprLine();
					}
					}
					setState(28); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
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

	public static class ExprLineContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExprLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExprLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitExprLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprLineContext exprLine() throws RecognitionException {
		ExprLineContext _localctx = new ExprLineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exprLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			expr(0);
			setState(33);
			match(T__0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext left;
		public ExprContext exprCenter;
		public Token op;
		public ExprContext right;
		public List<TerminalNode> SEP() { return getTokens(ExpressionParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(ExpressionParser.SEP, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAM() { return getToken(ExpressionParser.LPAM, 0); }
		public TerminalNode RPAM() { return getToken(ExpressionParser.RPAM, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ElementAssignmentContext elementAssignment() {
			return getRuleContext(ElementAssignmentContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public AccordContext accord() {
			return getRuleContext(AccordContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExpressionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExpressionParser.NEWLINE, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(36);
				match(SEP);
				setState(37);
				expr(0);
				setState(38);
				match(SEP);
				}
				break;
			case 3:
				{
				setState(40);
				match(SEP);
				setState(41);
				expr(14);
				}
				break;
			case 4:
				{
				setState(42);
				match(LPAM);
				setState(43);
				((ExprContext)_localctx).exprCenter = expr(0);
				setState(44);
				match(RPAM);
				}
				break;
			case 5:
				{
				setState(46);
				print();
				}
				break;
			case 6:
				{
				setState(47);
				elementAssignment();
				}
				break;
			case 7:
				{
				setState(48);
				elementValue();
				}
				break;
			case 8:
				{
				setState(49);
				date();
				}
				break;
			case 9:
				{
				setState(50);
				accord();
				}
				break;
			case 10:
				{
				setState(51);
				atom();
				}
				break;
			case 11:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(55);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(56);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DEL || _la==MUL) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(57);
						((ExprContext)_localctx).right = expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(58);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(59);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(60);
						((ExprContext)_localctx).right = expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(61);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(62);
						((ExprContext)_localctx).op = match(T__1);
						setState(63);
						((ExprContext)_localctx).right = expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(64);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(65);
						match(SEP);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(69); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(67);
								match(NEWLINE);
								setState(68);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(71); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__2);
			setState(79);
			expr(0);
			setState(80);
			match(RPAM);
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

	public static class ElementAssignmentContext extends ParserRuleContext {
		public List<TerminalNode> SEP() { return getTokens(ExpressionParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(ExpressionParser.SEP, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(ExpressionParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElementAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterElementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitElementAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitElementAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAssignmentContext elementAssignment() throws RecognitionException {
		ElementAssignmentContext _localctx = new ElementAssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elementAssignment);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(SEP);
				setState(83);
				match(IDENTIFIER);
				setState(84);
				match(SEP);
				setState(85);
				match(T__3);
				setState(86);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(IDENTIFIER);
				setState(88);
				match(SEP);
				setState(89);
				match(T__3);
				setState(90);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(IDENTIFIER);
				setState(92);
				match(T__3);
				setState(93);
				expr(0);
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

	public static class ElementValueContext extends ParserRuleContext {
		public TerminalNode SEP() { return getToken(ExpressionParser.SEP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExpressionParser.IDENTIFIER, 0); }
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elementValue);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(SEP);
				setState(97);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(IDENTIFIER);
				setState(99);
				match(SEP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(IDENTIFIER);
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

	public static class DateContext extends ParserRuleContext {
		public Token d;
		public TerminalNode DATE() { return getToken(ExpressionParser.DATE, 0); }
		public List<TerminalNode> SEP() { return getTokens(ExpressionParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(ExpressionParser.SEP, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__4);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(104);
				match(SEP);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			((DateContext)_localctx).d = match(DATE);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(111);
				match(SEP);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(RPAM);
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

	public static class AccordContext extends ParserRuleContext {
		public Token ac;
		public TerminalNode ACCORD() { return getToken(ExpressionParser.ACCORD, 0); }
		public List<TerminalNode> SEP() { return getTokens(ExpressionParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(ExpressionParser.SEP, i);
		}
		public AccordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterAccord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitAccord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitAccord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccordContext accord() throws RecognitionException {
		AccordContext _localctx = new AccordContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_accord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__5);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(120);
				match(SEP);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			((AccordContext)_localctx).ac = match(ACCORD);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(127);
				match(SEP);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(RPAM);
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
		public TerminalNode NUMBER() { return getToken(ExpressionParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ExpressionParser.STRING, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u008c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\3\3\3\3\3\3\3\6\3\35\n\3\r\3\16\3\36\5\3!\n\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\58\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\6\5H\n\5\r\5\16\5I\7\5L\n\5\f\5\16\5O\13\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\5\bh\n\b\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\3\t\3\t\7\ts\n\t\f\t\16\tv\13"+
		"\t\3\t\3\t\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\n\3\n\7\n\u0083\n\n\f"+
		"\n\16\n\u0086\13\n\3\n\3\n\3\13\3\13\3\13\2\3\b\f\2\4\6\b\n\f\16\20\22"+
		"\24\2\5\3\2\17\20\3\2\r\16\4\2\f\f\23\23\u009b\2\26\3\2\2\2\4 \3\2\2\2"+
		"\6\"\3\2\2\2\b\67\3\2\2\2\nP\3\2\2\2\f`\3\2\2\2\16g\3\2\2\2\20i\3\2\2"+
		"\2\22y\3\2\2\2\24\u0089\3\2\2\2\26\27\5\4\3\2\27\3\3\2\2\2\30!\5\6\4\2"+
		"\31\34\5\6\4\2\32\33\7\25\2\2\33\35\5\6\4\2\34\32\3\2\2\2\35\36\3\2\2"+
		"\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \30\3\2\2\2 \31\3\2\2\2!\5"+
		"\3\2\2\2\"#\5\b\5\2#$\7\3\2\2$\7\3\2\2\2%8\b\5\1\2&\'\7\24\2\2\'(\5\b"+
		"\5\2()\7\24\2\2)8\3\2\2\2*+\7\24\2\2+8\5\b\5\20,-\7\21\2\2-.\5\b\5\2."+
		"/\7\22\2\2/8\3\2\2\2\608\5\n\6\2\618\5\f\7\2\628\5\16\b\2\638\5\20\t\2"+
		"\648\5\22\n\2\658\5\24\13\2\668\3\2\2\2\67%\3\2\2\2\67&\3\2\2\2\67*\3"+
		"\2\2\2\67,\3\2\2\2\67\60\3\2\2\2\67\61\3\2\2\2\67\62\3\2\2\2\67\63\3\2"+
		"\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28M\3\2\2\29:\f\r\2\2:;\t"+
		"\2\2\2;L\5\b\5\16<=\f\f\2\2=>\t\3\2\2>L\5\b\5\r?@\f\13\2\2@A\7\4\2\2A"+
		"L\5\b\5\fBC\f\17\2\2CL\7\24\2\2DG\f\16\2\2EF\7\25\2\2FH\5\b\5\2GE\3\2"+
		"\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2K9\3\2\2\2K<\3\2\2\2K?\3\2"+
		"\2\2KB\3\2\2\2KD\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\t\3\2\2\2OM\3"+
		"\2\2\2PQ\7\5\2\2QR\5\b\5\2RS\7\22\2\2S\13\3\2\2\2TU\7\24\2\2UV\7\13\2"+
		"\2VW\7\24\2\2WX\7\6\2\2Xa\5\b\5\2YZ\7\13\2\2Z[\7\24\2\2[\\\7\6\2\2\\a"+
		"\5\b\5\2]^\7\13\2\2^_\7\6\2\2_a\5\b\5\2`T\3\2\2\2`Y\3\2\2\2`]\3\2\2\2"+
		"a\r\3\2\2\2bc\7\24\2\2ch\7\13\2\2de\7\13\2\2eh\7\24\2\2fh\7\13\2\2gb\3"+
		"\2\2\2gd\3\2\2\2gf\3\2\2\2h\17\3\2\2\2im\7\7\2\2jl\7\24\2\2kj\3\2\2\2"+
		"lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pt\7\t\2\2qs\7\24\2"+
		"\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\22"+
		"\2\2x\21\3\2\2\2y}\7\b\2\2z|\7\24\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2"+
		"}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0084\7\n\2\2\u0081\u0083"+
		"\7\24\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088"+
		"\7\22\2\2\u0088\23\3\2\2\2\u0089\u008a\t\4\2\2\u008a\25\3\2\2\2\16\36"+
		" \67IKM`gmt}\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}