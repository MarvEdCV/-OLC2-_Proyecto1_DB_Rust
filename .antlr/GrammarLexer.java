// Generated from c:\Users\marvi\OneDrive\Escritorio\USAC\Primer Semestre 2022\ORGANIZACION DE LENGUAJES Y COMPILADORES 2 D\Laboratorio\Proyecto1_DB_Rust\GrammarLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONSOLE=1, LOG=2, P_NUMBER=3, P_STRING=4, P_IF=5, P_WHILE=6, NUMBER=7, 
		STRING=8, ID=9, PUNTO=10, PTCOMA=11, COMA=12, DIFERENTE=13, IGUAL=14, 
		MAYORIGUAL=15, MENORIGUAL=16, MAYOR=17, MENOR=18, MUL=19, DIV=20, ADD=21, 
		SUB=22, PARIZQ=23, PARDER=24, LLAVEIZQ=25, LLAVEDER=26, CORIZQ=27, CORDER=28, 
		WHITESPACE=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONSOLE", "LOG", "P_NUMBER", "P_STRING", "P_IF", "P_WHILE", "NUMBER", 
			"STRING", "ID", "PUNTO", "PTCOMA", "COMA", "DIFERENTE", "IGUAL", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "PARIZQ", 
			"PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'console'", "'log'", "'number'", "'string'", "'if'", "'while'", 
			null, null, null, "'.'", "';'", "','", "'!'", "'='", "'>='", "'<='", 
			"'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONSOLE", "LOG", "P_NUMBER", "P_STRING", "P_IF", "P_WHILE", "NUMBER", 
			"STRING", "ID", "PUNTO", "PTCOMA", "COMA", "DIFERENTE", "IGUAL", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "PARIZQ", 
			"PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "WHITESPACE"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\6\bd\n\b\r\b\16\be\3\t\3\t\7\tj\n\t\f\t\16\tm\13\t\3\t\3\t\3\n\3\n\7"+
		"\ns\n\n\f\n\16\nv\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\6\36\u00a1\n\36\r\36\16\36\u00a2\3\36\3\36\3\37\3\37\3\37"+
		"\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37=\2\3\2\b\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\6\2\13\f\17\17\""+
		"\"^^\t\2\"#%%--/\60<<BB]_\2\u00ab\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3?\3\2\2\2\5G\3\2\2\2\7K\3\2\2"+
		"\2\tR\3\2\2\2\13Y\3\2\2\2\r\\\3\2\2\2\17c\3\2\2\2\21g\3\2\2\2\23p\3\2"+
		"\2\2\25w\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35\177\3\2\2\2\37"+
		"\u0081\3\2\2\2!\u0084\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2\2\2\'\u008b\3"+
		"\2\2\2)\u008d\3\2\2\2+\u008f\3\2\2\2-\u0091\3\2\2\2/\u0093\3\2\2\2\61"+
		"\u0095\3\2\2\2\63\u0097\3\2\2\2\65\u0099\3\2\2\2\67\u009b\3\2\2\29\u009d"+
		"\3\2\2\2;\u00a0\3\2\2\2=\u00a6\3\2\2\2?@\7e\2\2@A\7q\2\2AB\7p\2\2BC\7"+
		"u\2\2CD\7q\2\2DE\7n\2\2EF\7g\2\2F\4\3\2\2\2GH\7n\2\2HI\7q\2\2IJ\7i\2\2"+
		"J\6\3\2\2\2KL\7p\2\2LM\7w\2\2MN\7o\2\2NO\7d\2\2OP\7g\2\2PQ\7t\2\2Q\b\3"+
		"\2\2\2RS\7u\2\2ST\7v\2\2TU\7t\2\2UV\7k\2\2VW\7p\2\2WX\7i\2\2X\n\3\2\2"+
		"\2YZ\7k\2\2Z[\7h\2\2[\f\3\2\2\2\\]\7y\2\2]^\7j\2\2^_\7k\2\2_`\7n\2\2`"+
		"a\7g\2\2a\16\3\2\2\2bd\t\2\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2"+
		"f\20\3\2\2\2gk\7$\2\2hj\n\3\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2"+
		"\2ln\3\2\2\2mk\3\2\2\2no\7$\2\2o\22\3\2\2\2pt\t\4\2\2qs\t\5\2\2rq\3\2"+
		"\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\24\3\2\2\2vt\3\2\2\2wx\7\60\2\2x\26"+
		"\3\2\2\2yz\7=\2\2z\30\3\2\2\2{|\7.\2\2|\32\3\2\2\2}~\7#\2\2~\34\3\2\2"+
		"\2\177\u0080\7?\2\2\u0080\36\3\2\2\2\u0081\u0082\7@\2\2\u0082\u0083\7"+
		"?\2\2\u0083 \3\2\2\2\u0084\u0085\7>\2\2\u0085\u0086\7?\2\2\u0086\"\3\2"+
		"\2\2\u0087\u0088\7@\2\2\u0088$\3\2\2\2\u0089\u008a\7>\2\2\u008a&\3\2\2"+
		"\2\u008b\u008c\7,\2\2\u008c(\3\2\2\2\u008d\u008e\7\61\2\2\u008e*\3\2\2"+
		"\2\u008f\u0090\7-\2\2\u0090,\3\2\2\2\u0091\u0092\7/\2\2\u0092.\3\2\2\2"+
		"\u0093\u0094\7*\2\2\u0094\60\3\2\2\2\u0095\u0096\7+\2\2\u0096\62\3\2\2"+
		"\2\u0097\u0098\7}\2\2\u0098\64\3\2\2\2\u0099\u009a\7\177\2\2\u009a\66"+
		"\3\2\2\2\u009b\u009c\7]\2\2\u009c8\3\2\2\2\u009d\u009e\7_\2\2\u009e:\3"+
		"\2\2\2\u009f\u00a1\t\6\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\36"+
		"\2\2\u00a5<\3\2\2\2\u00a6\u00a7\7^\2\2\u00a7\u00a8\t\7\2\2\u00a8>\3\2"+
		"\2\2\7\2ekt\u00a2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}