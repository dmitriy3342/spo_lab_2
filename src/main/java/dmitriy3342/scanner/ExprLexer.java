// Generated from D:/Учёба/4 Курс/СПО/lab_2/src/main/java\Expr.g4 by ANTLR 4.5.3
package dmitriy3342.scanner;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NEWLINE=8, NUMBER=9, 
		WS=10, COMMENT=11, LINE_COMMENT=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NEWLINE", "NUMBER", 
		"EXP", "INT", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'*'", "'/'", "'+'", "'-'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "NEWLINE", "NUMBER", "WS", 
		"COMMENT", "LINE_COMMENT"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16i\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\t/\n\t\r\t\16\t\60\3\n\3\n\3\n\3\n\5"+
		"\n\67\n\n\3\n\3\n\3\n\3\n\5\n=\n\n\3\13\3\13\5\13A\n\13\3\13\3\13\3\f"+
		"\6\fF\n\f\r\f\16\fG\3\r\6\rK\n\r\r\r\16\rL\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\7\16U\n\16\f\16\16\16X\13\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\7\17c\n\17\f\17\16\17f\13\17\3\17\3\17\3V\2\20\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\2\27\2\31\f\33\r\35\16\3\2\7\4\2\f\f\17\17\4"+
		"\2GGgg\4\2--//\3\2\62;\4\2\13\f\17\17o\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2"+
		"\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2\2\2\r)\3\2\2\2\17+\3\2\2\2\21.\3\2"+
		"\2\2\23<\3\2\2\2\25>\3\2\2\2\27E\3\2\2\2\31J\3\2\2\2\33P\3\2\2\2\35^\3"+
		"\2\2\2\37 \7=\2\2 \4\3\2\2\2!\"\7,\2\2\"\6\3\2\2\2#$\7\61\2\2$\b\3\2\2"+
		"\2%&\7-\2\2&\n\3\2\2\2\'(\7/\2\2(\f\3\2\2\2)*\7*\2\2*\16\3\2\2\2+,\7+"+
		"\2\2,\20\3\2\2\2-/\t\2\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2"+
		"\2\2\61\22\3\2\2\2\62\63\5\27\f\2\63\64\7\60\2\2\64\66\5\27\f\2\65\67"+
		"\5\25\13\2\66\65\3\2\2\2\66\67\3\2\2\2\67=\3\2\2\289\5\27\f\29:\5\25\13"+
		"\2:=\3\2\2\2;=\5\27\f\2<\62\3\2\2\2<8\3\2\2\2<;\3\2\2\2=\24\3\2\2\2>@"+
		"\t\3\2\2?A\t\4\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\5\27\f\2C\26\3\2\2"+
		"\2DF\t\5\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\30\3\2\2\2IK\t\6"+
		"\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\b\r\2\2O\32\3"+
		"\2\2\2PQ\7\61\2\2QR\7,\2\2RV\3\2\2\2SU\13\2\2\2TS\3\2\2\2UX\3\2\2\2VW"+
		"\3\2\2\2VT\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7,\2\2Z[\7\61\2\2[\\\3\2\2\2"+
		"\\]\b\16\2\2]\34\3\2\2\2^_\7\61\2\2_`\7\61\2\2`d\3\2\2\2ac\n\2\2\2ba\3"+
		"\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\b\17\2\2h\36"+
		"\3\2\2\2\13\2\60\66<@GLVd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}