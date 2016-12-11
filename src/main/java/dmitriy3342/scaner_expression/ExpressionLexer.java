// Generated from D:/Учёба/4 Курс/СПО/lab_2/src/main/java\Expression.g4 by ANTLR 4.5.3
package dmitriy3342.scaner_expression;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, DATE=7, ACCORD=8, IDENTIFIER=9, 
		STRING=10, PLUS=11, MINUS=12, DEL=13, MUL=14, LPAM=15, RPAM=16, NUMBER=17, 
		SEP=18, NEWLINE=19, WS=20, COMMENT=21, LINE_COMMENT=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "DATE", "ACCORD", "IDENTIFIER", 
		"STRING", "PLUS", "MINUS", "DEL", "MUL", "LPAM", "RPAM", "NUMBER", "EXP", 
		"INT", "SEP", "NEWLINE", "WS", "COMMENT", "LINE_COMMENT"
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


	public ExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00bd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\5\bP\n\b\3\b\3\b\3\b"+
		"\5\bU\n\b\3\b\3\b\3\t\3\t\5\t[\n\t\3\n\6\n^\n\n\r\n\16\n_\3\n\7\nc\n\n"+
		"\f\n\16\nf\13\n\3\13\3\13\7\13j\n\13\f\13\16\13m\13\13\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\5\22\u0081\n\22\3\22\3\22\3\22\3\22\5\22\u0087\n\22\3\23\3\23\5\23\u008b"+
		"\n\23\3\23\3\23\3\24\6\24\u0090\n\24\r\24\16\24\u0091\3\25\6\25\u0095"+
		"\n\25\r\25\16\25\u0096\3\26\6\26\u009a\n\26\r\26\16\26\u009b\3\27\6\27"+
		"\u009f\n\27\r\27\16\27\u00a0\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00a9"+
		"\n\30\f\30\16\30\u00ac\13\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\7\31\u00b7\n\31\f\31\16\31\u00ba\13\31\3\31\3\31\5k\u0096\u00aa\2"+
		"\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\2\'\2)\24+\25-\26/\27\61\30\3\2\16\3\2\62\65\3\2\62"+
		";\3\2\62\63\3\2CJ\4\2%%dd\5\2C\\aac|\6\2\62;C\\aac|\4\2GGgg\4\2--//\4"+
		"\2\13\13\"\"\4\2\f\f\17\17\5\2\13\f\16\17\"\"\u00ca\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7"+
		"\67\3\2\2\2\t>\3\2\2\2\13@\3\2\2\2\rF\3\2\2\2\17O\3\2\2\2\21X\3\2\2\2"+
		"\23]\3\2\2\2\25g\3\2\2\2\27p\3\2\2\2\31r\3\2\2\2\33t\3\2\2\2\35v\3\2\2"+
		"\2\37x\3\2\2\2!z\3\2\2\2#\u0086\3\2\2\2%\u0088\3\2\2\2\'\u008f\3\2\2\2"+
		")\u0094\3\2\2\2+\u0099\3\2\2\2-\u009e\3\2\2\2/\u00a4\3\2\2\2\61\u00b2"+
		"\3\2\2\2\63\64\7=\2\2\64\4\3\2\2\2\65\66\7`\2\2\66\6\3\2\2\2\678\7r\2"+
		"\289\7t\2\29:\7k\2\2:;\7p\2\2;<\7v\2\2<=\7*\2\2=\b\3\2\2\2>?\7?\2\2?\n"+
		"\3\2\2\2@A\7f\2\2AB\7c\2\2BC\7v\2\2CD\7g\2\2DE\7*\2\2E\f\3\2\2\2FG\7c"+
		"\2\2GH\7e\2\2HI\7e\2\2IJ\7q\2\2JK\7t\2\2KL\7f\2\2LM\7*\2\2M\16\3\2\2\2"+
		"NP\t\2\2\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\t\3\2\2RT\7\60\2\2SU\t\4\2"+
		"\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\t\3\2\2W\20\3\2\2\2XZ\t\5\2\2Y[\t\6"+
		"\2\2ZY\3\2\2\2Z[\3\2\2\2[\22\3\2\2\2\\^\t\7\2\2]\\\3\2\2\2^_\3\2\2\2_"+
		"]\3\2\2\2_`\3\2\2\2`d\3\2\2\2ac\t\b\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2e\24\3\2\2\2fd\3\2\2\2gk\7$\2\2hj\13\2\2\2ih\3\2\2\2jm\3\2\2"+
		"\2kl\3\2\2\2ki\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7$\2\2o\26\3\2\2\2pq\7-\2"+
		"\2q\30\3\2\2\2rs\7/\2\2s\32\3\2\2\2tu\7\61\2\2u\34\3\2\2\2vw\7,\2\2w\36"+
		"\3\2\2\2xy\7*\2\2y \3\2\2\2z{\7+\2\2{\"\3\2\2\2|}\5\'\24\2}~\7\60\2\2"+
		"~\u0080\5\'\24\2\177\u0081\5%\23\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\u0087\3\2\2\2\u0082\u0083\5\'\24\2\u0083\u0084\5%\23\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0087\5\'\24\2\u0086|\3\2\2\2\u0086\u0082\3\2\2\2"+
		"\u0086\u0085\3\2\2\2\u0087$\3\2\2\2\u0088\u008a\t\t\2\2\u0089\u008b\t"+
		"\n\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\5\'\24\2\u008d&\3\2\2\2\u008e\u0090\t\3\2\2\u008f\u008e\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092(\3"+
		"\2\2\2\u0093\u0095\t\13\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097*\3\2\2\2\u0098\u009a\t\f\2\2"+
		"\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c,\3\2\2\2\u009d\u009f\t\r\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a3\b\27\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6"+
		"\7,\2\2\u00a6\u00aa\3\2\2\2\u00a7\u00a9\13\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7,\2\2\u00ae\u00af\7\61\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\b\30\2\2\u00b1\60\3\2\2\2\u00b2\u00b3\7\61"+
		"\2\2\u00b3\u00b4\7\61\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b7\n\f\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\b\31\2\2\u00bc"+
		"\62\3\2\2\2\22\2OTZ_dk\u0080\u0086\u008a\u0091\u0096\u009b\u00a0\u00aa"+
		"\u00b8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}