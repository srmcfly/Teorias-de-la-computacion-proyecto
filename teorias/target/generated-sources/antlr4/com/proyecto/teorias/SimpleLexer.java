// Generated from com\proyecto\teorias\Simple.g4 by ANTLR 4.5.1
package com.proyecto.teorias;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, IMPR=3, SUMA=4, RESTA=5, MULT=6, DIV=7, Y=8, O=9, NO=10, 
		MAQ=11, MNQ=12, MAIQ=13, MNIQ=14, IQ=15, NIQ=16, SI=17, SINO=18, ASIGNAR=19, 
		BRACKET_ABRIR=20, BRACKET_CERRAR=21, PAR_ABRIR=22, PAR_CERRAR=23, PUNTOCOMA=24, 
		ID=25, NUMERO=26, FLOAT=27, ESPACIO=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PROGRAM", "VAR", "IMPR", "SUMA", "RESTA", "MULT", "DIV", "Y", "O", "NO", 
		"MAQ", "MNQ", "MAIQ", "MNIQ", "IQ", "NIQ", "SI", "SINO", "ASIGNAR", "BRACKET_ABRIR", 
		"BRACKET_CERRAR", "PAR_ABRIR", "PAR_CERRAR", "PUNTOCOMA", "ID", "NUMERO", 
		"FLOAT", "ESPACIO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'var'", "'println'", "'+'", "'-'", "'*'", "'/'", "'&&'", 
		"'||'", "'!'", "'>'", "'<'", "'>=='", "'<=='", "'=='", "'!='", "'if'", 
		"'else'", "'='", "'{'", "'}'", "'('", "')'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM", "VAR", "IMPR", "SUMA", "RESTA", "MULT", "DIV", "Y", "O", 
		"NO", "MAQ", "MNQ", "MAIQ", "MNIQ", "IQ", "NIQ", "SI", "SINO", "ASIGNAR", 
		"BRACKET_ABRIR", "BRACKET_CERRAR", "PAR_ABRIR", "PAR_CERRAR", "PUNTOCOMA", 
		"ID", "NUMERO", "FLOAT", "ESPACIO"
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


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\7\32\u0088\n\32\f\32\16\32\u008b"+
		"\13\32\3\33\6\33\u008e\n\33\r\33\16\33\u008f\3\34\3\34\3\34\6\34\u0095"+
		"\n\34\r\34\16\34\u0096\3\35\6\35\u009a\n\35\r\35\16\35\u009b\3\35\3\35"+
		"\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u00a2"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3"+
		"\2\2\2\5C\3\2\2\2\7G\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2"+
		"\2\2\21W\3\2\2\2\23Z\3\2\2\2\25]\3\2\2\2\27_\3\2\2\2\31a\3\2\2\2\33c\3"+
		"\2\2\2\35g\3\2\2\2\37k\3\2\2\2!n\3\2\2\2#q\3\2\2\2%t\3\2\2\2\'y\3\2\2"+
		"\2){\3\2\2\2+}\3\2\2\2-\177\3\2\2\2/\u0081\3\2\2\2\61\u0083\3\2\2\2\63"+
		"\u0085\3\2\2\2\65\u008d\3\2\2\2\67\u0091\3\2\2\29\u0099\3\2\2\2;<\7r\2"+
		"\2<=\7t\2\2=>\7q\2\2>?\7i\2\2?@\7t\2\2@A\7c\2\2AB\7o\2\2B\4\3\2\2\2CD"+
		"\7x\2\2DE\7c\2\2EF\7t\2\2F\6\3\2\2\2GH\7r\2\2HI\7t\2\2IJ\7k\2\2JK\7p\2"+
		"\2KL\7v\2\2LM\7n\2\2MN\7p\2\2N\b\3\2\2\2OP\7-\2\2P\n\3\2\2\2QR\7/\2\2"+
		"R\f\3\2\2\2ST\7,\2\2T\16\3\2\2\2UV\7\61\2\2V\20\3\2\2\2WX\7(\2\2XY\7("+
		"\2\2Y\22\3\2\2\2Z[\7~\2\2[\\\7~\2\2\\\24\3\2\2\2]^\7#\2\2^\26\3\2\2\2"+
		"_`\7@\2\2`\30\3\2\2\2ab\7>\2\2b\32\3\2\2\2cd\7@\2\2de\7?\2\2ef\7?\2\2"+
		"f\34\3\2\2\2gh\7>\2\2hi\7?\2\2ij\7?\2\2j\36\3\2\2\2kl\7?\2\2lm\7?\2\2"+
		"m \3\2\2\2no\7#\2\2op\7?\2\2p\"\3\2\2\2qr\7k\2\2rs\7h\2\2s$\3\2\2\2tu"+
		"\7g\2\2uv\7n\2\2vw\7u\2\2wx\7g\2\2x&\3\2\2\2yz\7?\2\2z(\3\2\2\2{|\7}\2"+
		"\2|*\3\2\2\2}~\7\177\2\2~,\3\2\2\2\177\u0080\7*\2\2\u0080.\3\2\2\2\u0081"+
		"\u0082\7+\2\2\u0082\60\3\2\2\2\u0083\u0084\7=\2\2\u0084\62\3\2\2\2\u0085"+
		"\u0089\t\2\2\2\u0086\u0088\t\3\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\64\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u008e\t\4\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\66\3\2\2\2\u0091\u0092\t\4\2"+
		"\2\u0092\u0094\13\2\2\2\u0093\u0095\t\4\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u00978\3\2\2\2"+
		"\u0098\u009a\t\5\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\35\2\2"+
		"\u009e:\3\2\2\2\7\2\u0089\u008f\u0096\u009b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}