// Generated from TailspinParser.g4 by ANTLR 4.7.1
package tailspin.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TailspinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StartComment=1, Stdout=2, Stdin=3, Def=4, Dereference=5, StartArrayDereference=6, 
		FieldDereference=7, FieldArrayDereference=8, To=9, ResultMarker=10, Colon=11, 
		Comma=12, Deconstructor=13, LeftParen=14, RightParen=15, LeftBracket=16, 
		RightBracket=17, LeftBrace=18, RightBrace=19, Key=20, StartMatcher=21, 
		StartTemplatesDefinition=22, StartComposerDefinition=23, EndDefinition=24, 
		TemplateMatch=25, StartDereference=26, Range=27, AdditiveOperator=28, 
		MultiplicativeOperator=29, Zero=30, NonZeroInteger=31, START_STRING=32, 
		IDENTIFIER=33, WS=34, StartStringEvaluate=35, StartStringInterpolate=36, 
		STRING_TEXT=37, END_STRING=38, EndInterpolate=39, InterpolateArray=40, 
		InterpolateIdentifier=41, InterpolateField=42, StartSubMatcher=43, EndMatcher=44, 
		InvertMatch=45, MatchInteger=46, RangeMatch=47, START_REGEXP=48, StartStructureMatch=49, 
		EndStructureMatch=50, StartArrayMatch=51, EndArrayMatch=52, StructureKey=53, 
		MatchDereference=54, MatchArrayDereference=55, MatchFieldDereference=56, 
		MatcherIgnoreWS=57, Comment=58, ComposerEndDefinition=59, StartComposerMatch=60, 
		EndComposerMatch=61, Optional=62, START_REGEX=63, StartSkipRule=64, EndSkipRule=65, 
		StartBuildArray=66, EndBuildArray=67, ComposerId=68, ComposerIgnoreWS=69, 
		REGEX_TEXT=70, END_REGEX=71;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_source = 2, RULE_dereferenceValue = 3, 
		RULE_structureDereference = 4, RULE_arrayDereference = 5, RULE_arrayLiteral = 6, 
		RULE_structureLiteral = 7, RULE_keyValue = 8, RULE_templates = 9, RULE_templatesBody = 10, 
		RULE_matchTemplate = 11, RULE_block = 12, RULE_blockExpression = 13, RULE_valueChain = 14, 
		RULE_transform = 15, RULE_collector = 16, RULE_matcher = 17, RULE_condition = 18, 
		RULE_lowerBound = 19, RULE_upperBound = 20, RULE_matchArithmeticExpression = 21, 
		RULE_matchDereferenceValue = 22, RULE_matchStructureDereference = 23, 
		RULE_rangeLiteral = 24, RULE_integerLiteral = 25, RULE_stringLiteral = 26, 
		RULE_stringContent = 27, RULE_stringInterpolate = 28, RULE_interpolateEvaluate = 29, 
		RULE_interpolateDereferenceValue = 30, RULE_interpolateStructureDereference = 31, 
		RULE_sink = 32, RULE_arithmeticExpression = 33, RULE_composerBody = 34, 
		RULE_compositionSequence = 35, RULE_compositionMatcher = 36;
	public static final String[] ruleNames = {
		"program", "statement", "source", "dereferenceValue", "structureDereference", 
		"arrayDereference", "arrayLiteral", "structureLiteral", "keyValue", "templates", 
		"templatesBody", "matchTemplate", "block", "blockExpression", "valueChain", 
		"transform", "collector", "matcher", "condition", "lowerBound", "upperBound", 
		"matchArithmeticExpression", "matchDereferenceValue", "matchStructureDereference", 
		"rangeLiteral", "integerLiteral", "stringLiteral", "stringContent", "stringInterpolate", 
		"interpolateEvaluate", "interpolateDereferenceValue", "interpolateStructureDereference", 
		"sink", "arithmeticExpression", "composerBody", "compositionSequence", 
		"compositionMatcher"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'//'", "'stdout'", "'stdin'", null, null, null, null, null, "'->'", 
		"'!'", "':'", "','", "'...'", null, null, null, null, "'{'", "'}'", null, 
		null, "'templates'", "'composer'", null, "'#'", null, "'..'", null, null, 
		"'0'", null, null, null, null, "'$('", null, null, null, "';'", null, 
		null, null, null, null, "'~'", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "StartComment", "Stdout", "Stdin", "Def", "Dereference", "StartArrayDereference", 
		"FieldDereference", "FieldArrayDereference", "To", "ResultMarker", "Colon", 
		"Comma", "Deconstructor", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
		"LeftBrace", "RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", 
		"StartComposerDefinition", "EndDefinition", "TemplateMatch", "StartDereference", 
		"Range", "AdditiveOperator", "MultiplicativeOperator", "Zero", "NonZeroInteger", 
		"START_STRING", "IDENTIFIER", "WS", "StartStringEvaluate", "StartStringInterpolate", 
		"STRING_TEXT", "END_STRING", "EndInterpolate", "InterpolateArray", "InterpolateIdentifier", 
		"InterpolateField", "StartSubMatcher", "EndMatcher", "InvertMatch", "MatchInteger", 
		"RangeMatch", "START_REGEXP", "StartStructureMatch", "EndStructureMatch", 
		"StartArrayMatch", "EndArrayMatch", "StructureKey", "MatchDereference", 
		"MatchArrayDereference", "MatchFieldDereference", "MatcherIgnoreWS", "Comment", 
		"ComposerEndDefinition", "StartComposerMatch", "EndComposerMatch", "Optional", 
		"START_REGEX", "StartSkipRule", "EndSkipRule", "StartBuildArray", "EndBuildArray", 
		"ComposerId", "ComposerIgnoreWS", "REGEX_TEXT", "END_REGEX"
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
	public String getGrammarFileName() { return "TailspinParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TailspinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EOF() { return getToken(TailspinParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			statement();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Stdin) | (1L << Def) | (1L << Dereference) | (1L << StartArrayDereference) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartTemplatesDefinition) | (1L << StartComposerDefinition) | (1L << AdditiveOperator) | (1L << Zero) | (1L << NonZeroInteger) | (1L << START_STRING) | (1L << START_REGEXP))) != 0)) {
				{
				{
				setState(75);
				statement();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(EOF);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TemplatesDefinitionContext extends StatementContext {
		public TerminalNode StartTemplatesDefinition() { return getToken(TailspinParser.StartTemplatesDefinition, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TailspinParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TailspinParser.IDENTIFIER, i);
		}
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public TemplatesDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTemplatesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueChainToSinkContext extends StatementContext {
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public SinkContext sink() {
			return getRuleContext(SinkContext.class,0);
		}
		public ValueChainToSinkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitValueChainToSink(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComposerDefinitionContext extends StatementContext {
		public TerminalNode StartComposerDefinition() { return getToken(TailspinParser.StartComposerDefinition, 0); }
		public TerminalNode ComposerId() { return getToken(TailspinParser.ComposerId, 0); }
		public ComposerBodyContext composerBody() {
			return getRuleContext(ComposerBodyContext.class,0);
		}
		public TerminalNode ComposerEndDefinition() { return getToken(TailspinParser.ComposerEndDefinition, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public ComposerDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitComposerDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefinitionContext extends StatementContext {
		public TerminalNode Def() { return getToken(TailspinParser.Def, 0); }
		public TerminalNode Key() { return getToken(TailspinParser.Key, 0); }
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public DefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(Def);
				setState(84);
				match(Key);
				setState(85);
				valueChain();
				}
				break;
			case Stdin:
			case Dereference:
			case StartArrayDereference:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case AdditiveOperator:
			case Zero:
			case NonZeroInteger:
			case START_STRING:
			case START_REGEXP:
				_localctx = new ValueChainToSinkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				valueChain();
				setState(87);
				match(To);
				setState(88);
				sink();
				}
				break;
			case StartTemplatesDefinition:
				_localctx = new TemplatesDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(StartTemplatesDefinition);
				setState(91);
				match(IDENTIFIER);
				setState(92);
				templatesBody();
				setState(93);
				match(EndDefinition);
				setState(94);
				match(IDENTIFIER);
				}
				break;
			case StartComposerDefinition:
				_localctx = new ComposerDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				match(StartComposerDefinition);
				setState(97);
				match(ComposerId);
				setState(98);
				composerBody();
				setState(99);
				match(ComposerEndDefinition);
				setState(100);
				match(IDENTIFIER);
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

	public static class SourceContext extends ParserRuleContext {
		public TerminalNode Stdin() { return getToken(TailspinParser.Stdin, 0); }
		public DereferenceValueContext dereferenceValue() {
			return getRuleContext(DereferenceValueContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public RangeLiteralContext rangeLiteral() {
			return getRuleContext(RangeLiteralContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public StructureLiteralContext structureLiteral() {
			return getRuleContext(StructureLiteralContext.class,0);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_source);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(Stdin);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				dereferenceValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				arithmeticExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				rangeLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				arrayLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				structureLiteral();
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

	public static class DereferenceValueContext extends ParserRuleContext {
		public TerminalNode Dereference() { return getToken(TailspinParser.Dereference, 0); }
		public List<StructureDereferenceContext> structureDereference() {
			return getRuleContexts(StructureDereferenceContext.class);
		}
		public StructureDereferenceContext structureDereference(int i) {
			return getRuleContext(StructureDereferenceContext.class,i);
		}
		public TerminalNode StartArrayDereference() { return getToken(TailspinParser.StartArrayDereference, 0); }
		public ArrayDereferenceContext arrayDereference() {
			return getRuleContext(ArrayDereferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public DereferenceValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dereferenceValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDereferenceValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DereferenceValueContext dereferenceValue() throws RecognitionException {
		DereferenceValueContext _localctx = new DereferenceValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dereferenceValue);
		try {
			int _alt;
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dereference:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(Dereference);
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(114);
						structureDereference();
						}
						} 
					}
					setState(119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case StartArrayDereference:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(StartArrayDereference);
				setState(121);
				arrayDereference();
				setState(122);
				match(RightParen);
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(123);
						structureDereference();
						}
						} 
					}
					setState(128);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
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

	public static class StructureDereferenceContext extends ParserRuleContext {
		public List<TerminalNode> FieldDereference() { return getTokens(TailspinParser.FieldDereference); }
		public TerminalNode FieldDereference(int i) {
			return getToken(TailspinParser.FieldDereference, i);
		}
		public TerminalNode FieldArrayDereference() { return getToken(TailspinParser.FieldArrayDereference, 0); }
		public ArrayDereferenceContext arrayDereference() {
			return getRuleContext(ArrayDereferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public StructureDereferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureDereference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureDereference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureDereferenceContext structureDereference() throws RecognitionException {
		StructureDereferenceContext _localctx = new StructureDereferenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_structureDereference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					match(FieldDereference);
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FieldDereference:
				{
				setState(137);
				match(FieldDereference);
				}
				break;
			case FieldArrayDereference:
				{
				{
				setState(138);
				match(FieldArrayDereference);
				setState(139);
				arrayDereference();
				setState(140);
				match(RightParen);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArrayDereferenceContext extends ParserRuleContext {
		public TerminalNode NonZeroInteger() { return getToken(TailspinParser.NonZeroInteger, 0); }
		public RangeLiteralContext rangeLiteral() {
			return getRuleContext(RangeLiteralContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public DereferenceValueContext dereferenceValue() {
			return getRuleContext(DereferenceValueContext.class,0);
		}
		public ArrayDereferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDereference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayDereference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDereferenceContext arrayDereference() throws RecognitionException {
		ArrayDereferenceContext _localctx = new ArrayDereferenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayDereference);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(NonZeroInteger);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				rangeLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				arrayLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				dereferenceValue();
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

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public List<ValueChainContext> valueChain() {
			return getRuleContexts(ValueChainContext.class);
		}
		public ValueChainContext valueChain(int i) {
			return getRuleContext(ValueChainContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrayLiteral);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(LeftBracket);
				setState(151);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(LeftBracket);
				setState(153);
				valueChain();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Stdin) | (1L << Dereference) | (1L << StartArrayDereference) | (1L << Comma) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << AdditiveOperator) | (1L << Zero) | (1L << NonZeroInteger) | (1L << START_STRING) | (1L << START_REGEXP))) != 0)) {
					{
					{
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(154);
						match(Comma);
						}
					}

					setState(157);
					valueChain();
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
				match(RightBracket);
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

	public static class StructureLiteralContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public StructureLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureLiteralContext structureLiteral() throws RecognitionException {
		StructureLiteralContext _localctx = new StructureLiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_structureLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(LeftBrace);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Key) {
				{
				{
				setState(168);
				keyValue();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(169);
					match(Comma);
					}
				}

				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(RightBrace);
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

	public static class KeyValueContext extends ParserRuleContext {
		public TerminalNode Key() { return getToken(TailspinParser.Key, 0); }
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(Key);
			setState(180);
			valueChain();
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

	public static class TemplatesContext extends ParserRuleContext {
		public TemplatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templates; }
	 
		public TemplatesContext() { }
		public void copyFrom(TemplatesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralTemplatesContext extends TemplatesContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public LiteralTemplatesContext(TemplatesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLiteralTemplates(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallDefinedTransformContext extends TemplatesContext {
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public CallDefinedTransformContext(TemplatesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCallDefinedTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayTemplatesContext extends TemplatesContext {
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public ArrayTemplatesContext(TemplatesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayTemplates(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTemplatesContext extends TemplatesContext {
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public InlineTemplatesContext(TemplatesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitInlineTemplates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatesContext templates() throws RecognitionException {
		TemplatesContext _localctx = new TemplatesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_templates);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new LiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				source();
				}
				break;
			case 2:
				_localctx = new InlineTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(LeftParen);
				setState(184);
				templatesBody();
				setState(185);
				match(RightParen);
				}
				break;
			case 3:
				_localctx = new CallDefinedTransformContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new ArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(LeftBracket);
				setState(189);
				match(IDENTIFIER);
				setState(190);
				match(RightBracket);
				setState(191);
				match(LeftParen);
				setState(192);
				templatesBody();
				setState(193);
				match(RightParen);
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

	public static class TemplatesBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<MatchTemplateContext> matchTemplate() {
			return getRuleContexts(MatchTemplateContext.class);
		}
		public MatchTemplateContext matchTemplate(int i) {
			return getRuleContext(MatchTemplateContext.class,i);
		}
		public TemplatesBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatesBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTemplatesBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatesBodyContext templatesBody() throws RecognitionException {
		TemplatesBodyContext _localctx = new TemplatesBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_templatesBody);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Stdin:
			case Def:
			case Dereference:
			case StartArrayDereference:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case StartTemplatesDefinition:
			case StartComposerDefinition:
			case AdditiveOperator:
			case Zero:
			case NonZeroInteger:
			case START_STRING:
			case START_REGEXP:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				block();
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StartMatcher || _la==StartSubMatcher) {
					{
					{
					setState(198);
					matchTemplate();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case StartMatcher:
			case StartSubMatcher:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(204);
					matchTemplate();
					}
					}
					setState(207); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StartMatcher || _la==StartSubMatcher );
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

	public static class MatchTemplateContext extends ParserRuleContext {
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MatchTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchTemplate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMatchTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchTemplateContext matchTemplate() throws RecognitionException {
		MatchTemplateContext _localctx = new MatchTemplateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_matchTemplate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			matcher();
			setState(212);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockExpressionContext> blockExpression() {
			return getRuleContexts(BlockExpressionContext.class);
		}
		public BlockExpressionContext blockExpression(int i) {
			return getRuleContext(BlockExpressionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				blockExpression();
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Stdin) | (1L << Def) | (1L << Dereference) | (1L << StartArrayDereference) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartTemplatesDefinition) | (1L << StartComposerDefinition) | (1L << AdditiveOperator) | (1L << Zero) | (1L << NonZeroInteger) | (1L << START_STRING) | (1L << START_REGEXP))) != 0) );
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

	public static class BlockExpressionContext extends ParserRuleContext {
		public BlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpression; }
	 
		public BlockExpressionContext() { }
		public void copyFrom(BlockExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SendToTemplatesContext extends BlockExpressionContext {
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public TerminalNode TemplateMatch() { return getToken(TailspinParser.TemplateMatch, 0); }
		public SendToTemplatesContext(BlockExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitSendToTemplates(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResultValueContext extends BlockExpressionContext {
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode ResultMarker() { return getToken(TailspinParser.ResultMarker, 0); }
		public ResultValueContext(BlockExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitResultValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StateAssignmentContext extends BlockExpressionContext {
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public StateAssignmentContext(BlockExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStateAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatementContext extends BlockExpressionContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(BlockExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockExpressionContext blockExpression() throws RecognitionException {
		BlockExpressionContext _localctx = new BlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_blockExpression);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ResultValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				valueChain();
				setState(220);
				match(ResultMarker);
				}
				break;
			case 2:
				_localctx = new SendToTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				valueChain();
				setState(223);
				match(To);
				setState(224);
				match(TemplateMatch);
				}
				break;
			case 3:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				statement();
				}
				break;
			case 4:
				_localctx = new StateAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				valueChain();
				setState(228);
				match(To);
				setState(229);
				match(Colon);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(230);
					match(IDENTIFIER);
					}
				}

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

	public static class ValueChainContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public ValueChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueChain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitValueChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueChainContext valueChain() throws RecognitionException {
		ValueChainContext _localctx = new ValueChainContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valueChain);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				source();
				setState(237);
				transform();
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

	public static class TransformContext extends ParserRuleContext {
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public TemplatesContext templates() {
			return getRuleContext(TemplatesContext.class,0);
		}
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public TerminalNode Deconstructor() { return getToken(TailspinParser.Deconstructor, 0); }
		public CollectorContext collector() {
			return getRuleContext(CollectorContext.class,0);
		}
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_transform);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(To);
				setState(242);
				templates();
				setState(244);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(243);
					transform();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(Deconstructor);
				setState(248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(247);
					transform();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(To);
				setState(251);
				match(Deconstructor);
				setState(252);
				collector();
				setState(254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(253);
					transform();
					}
					break;
				}
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

	public static class CollectorContext extends ParserRuleContext {
		public DereferenceValueContext dereferenceValue() {
			return getRuleContext(DereferenceValueContext.class,0);
		}
		public TerminalNode START_STRING() { return getToken(TailspinParser.START_STRING, 0); }
		public TerminalNode END_STRING() { return getToken(TailspinParser.END_STRING, 0); }
		public CollectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCollector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectorContext collector() throws RecognitionException {
		CollectorContext _localctx = new CollectorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_collector);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dereference:
			case StartArrayDereference:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				dereferenceValue();
				}
				break;
			case START_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(START_STRING);
				setState(260);
				match(END_STRING);
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

	public static class MatcherContext extends ParserRuleContext {
		public TerminalNode EndMatcher() { return getToken(TailspinParser.EndMatcher, 0); }
		public TerminalNode StartMatcher() { return getToken(TailspinParser.StartMatcher, 0); }
		public TerminalNode StartSubMatcher() { return getToken(TailspinParser.StartSubMatcher, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public MatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matcher; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatcherContext matcher() throws RecognitionException {
		MatcherContext _localctx = new MatcherContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==StartMatcher || _la==StartSubMatcher) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << START_STRING) | (1L << InvertMatch) | (1L << MatchInteger) | (1L << RangeMatch) | (1L << START_REGEXP) | (1L << StartStructureMatch) | (1L << StartArrayMatch) | (1L << MatchDereference))) != 0)) {
				{
				setState(264);
				condition();
				}
			}

			setState(267);
			match(EndMatcher);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RangeMatchContext extends ConditionContext {
		public TerminalNode RangeMatch() { return getToken(TailspinParser.RangeMatch, 0); }
		public LowerBoundContext lowerBound() {
			return getRuleContext(LowerBoundContext.class,0);
		}
		public UpperBoundContext upperBound() {
			return getRuleContext(UpperBoundContext.class,0);
		}
		public RangeMatchContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitRangeMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayMatchContext extends ConditionContext {
		public TerminalNode StartArrayMatch() { return getToken(TailspinParser.StartArrayMatch, 0); }
		public TerminalNode EndArrayMatch() { return getToken(TailspinParser.EndArrayMatch, 0); }
		public TerminalNode MatchArrayDereference() { return getToken(TailspinParser.MatchArrayDereference, 0); }
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode Range() { return getToken(TailspinParser.Range, 0); }
		public ArrayMatchContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegexpMatchContext extends ConditionContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public RegexpMatchContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitRegexpMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerEqualsContext extends ConditionContext {
		public MatchArithmeticExpressionContext matchArithmeticExpression() {
			return getRuleContext(MatchArithmeticExpressionContext.class,0);
		}
		public IntegerEqualsContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitIntegerEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructureMatchContext extends ConditionContext {
		public TerminalNode StartStructureMatch() { return getToken(TailspinParser.StartStructureMatch, 0); }
		public TerminalNode EndStructureMatch() { return getToken(TailspinParser.EndStructureMatch, 0); }
		public List<TerminalNode> StructureKey() { return getTokens(TailspinParser.StructureKey); }
		public TerminalNode StructureKey(int i) {
			return getToken(TailspinParser.StructureKey, i);
		}
		public List<MatcherContext> matcher() {
			return getRuleContexts(MatcherContext.class);
		}
		public MatcherContext matcher(int i) {
			return getRuleContext(MatcherContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public StructureMatchContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvertMatchContext extends ConditionContext {
		public TerminalNode InvertMatch() { return getToken(TailspinParser.InvertMatch, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InvertMatchContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitInvertMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new IntegerEqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				matchArithmeticExpression();
				}
				break;
			case 2:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MatchInteger || _la==MatchDereference) {
					{
					setState(270);
					lowerBound();
					}
				}

				setState(273);
				match(RangeMatch);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MatchInteger || _la==MatchDereference) {
					{
					setState(274);
					upperBound();
					}
				}

				}
				break;
			case 3:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				stringLiteral();
				}
				break;
			case 4:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				match(StartStructureMatch);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StructureKey) {
					{
					{
					setState(279);
					match(StructureKey);
					setState(280);
					matcher();
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(281);
						match(Comma);
						}
					}

					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(289);
				match(EndStructureMatch);
				}
				break;
			case 5:
				_localctx = new InvertMatchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				match(InvertMatch);
				setState(291);
				condition();
				}
				break;
			case 6:
				_localctx = new ArrayMatchContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(292);
				match(StartArrayMatch);
				setState(293);
				match(EndArrayMatch);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MatchArrayDereference) {
					{
					setState(294);
					match(MatchArrayDereference);
					setState(296);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(295);
						arithmeticExpression(0);
						}
						break;
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Range) {
						{
						setState(298);
						match(Range);
						}
					}

					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Dereference) | (1L << StartArrayDereference) | (1L << LeftParen) | (1L << AdditiveOperator) | (1L << Zero) | (1L << NonZeroInteger))) != 0)) {
						{
						setState(301);
						arithmeticExpression(0);
						}
					}

					setState(304);
					match(RightParen);
					}
				}

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

	public static class LowerBoundContext extends ParserRuleContext {
		public MatchArithmeticExpressionContext matchArithmeticExpression() {
			return getRuleContext(MatchArithmeticExpressionContext.class,0);
		}
		public LowerBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowerBound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLowerBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowerBoundContext lowerBound() throws RecognitionException {
		LowerBoundContext _localctx = new LowerBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lowerBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			matchArithmeticExpression();
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

	public static class UpperBoundContext extends ParserRuleContext {
		public MatchArithmeticExpressionContext matchArithmeticExpression() {
			return getRuleContext(MatchArithmeticExpressionContext.class,0);
		}
		public UpperBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upperBound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitUpperBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpperBoundContext upperBound() throws RecognitionException {
		UpperBoundContext _localctx = new UpperBoundContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_upperBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			matchArithmeticExpression();
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

	public static class MatchArithmeticExpressionContext extends ParserRuleContext {
		public TerminalNode MatchInteger() { return getToken(TailspinParser.MatchInteger, 0); }
		public MatchDereferenceValueContext matchDereferenceValue() {
			return getRuleContext(MatchDereferenceValueContext.class,0);
		}
		public MatchArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArithmeticExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMatchArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArithmeticExpressionContext matchArithmeticExpression() throws RecognitionException {
		MatchArithmeticExpressionContext _localctx = new MatchArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_matchArithmeticExpression);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MatchInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(MatchInteger);
				}
				break;
			case MatchDereference:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				matchDereferenceValue();
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

	public static class MatchDereferenceValueContext extends ParserRuleContext {
		public TerminalNode MatchDereference() { return getToken(TailspinParser.MatchDereference, 0); }
		public TerminalNode MatchArrayDereference() { return getToken(TailspinParser.MatchArrayDereference, 0); }
		public ArrayDereferenceContext arrayDereference() {
			return getRuleContext(ArrayDereferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<MatchStructureDereferenceContext> matchStructureDereference() {
			return getRuleContexts(MatchStructureDereferenceContext.class);
		}
		public MatchStructureDereferenceContext matchStructureDereference(int i) {
			return getRuleContext(MatchStructureDereferenceContext.class,i);
		}
		public MatchDereferenceValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchDereferenceValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMatchDereferenceValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchDereferenceValueContext matchDereferenceValue() throws RecognitionException {
		MatchDereferenceValueContext _localctx = new MatchDereferenceValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_matchDereferenceValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(MatchDereference);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MatchArrayDereference) {
				{
				setState(318);
				match(MatchArrayDereference);
				setState(319);
				arrayDereference();
				setState(320);
				match(RightParen);
				}
			}

			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MatchFieldDereference) {
				{
				{
				setState(324);
				matchStructureDereference();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MatchStructureDereferenceContext extends ParserRuleContext {
		public List<TerminalNode> MatchFieldDereference() { return getTokens(TailspinParser.MatchFieldDereference); }
		public TerminalNode MatchFieldDereference(int i) {
			return getToken(TailspinParser.MatchFieldDereference, i);
		}
		public TerminalNode MatchArrayDereference() { return getToken(TailspinParser.MatchArrayDereference, 0); }
		public ArrayDereferenceContext arrayDereference() {
			return getRuleContext(ArrayDereferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public MatchStructureDereferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchStructureDereference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMatchStructureDereference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchStructureDereferenceContext matchStructureDereference() throws RecognitionException {
		MatchStructureDereferenceContext _localctx = new MatchStructureDereferenceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_matchStructureDereference);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(330);
					match(MatchFieldDereference);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(333); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MatchArrayDereference) {
				{
				setState(335);
				match(MatchArrayDereference);
				setState(336);
				arrayDereference();
				setState(337);
				match(RightParen);
				}
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

	public static class RangeLiteralContext extends ParserRuleContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode Range() { return getToken(TailspinParser.Range, 0); }
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public RangeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitRangeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeLiteralContext rangeLiteral() throws RecognitionException {
		RangeLiteralContext _localctx = new RangeLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			arithmeticExpression(0);
			setState(342);
			match(Range);
			setState(343);
			arithmeticExpression(0);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(344);
				match(Colon);
				setState(345);
				arithmeticExpression(0);
				}
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode Zero() { return getToken(TailspinParser.Zero, 0); }
		public TerminalNode NonZeroInteger() { return getToken(TailspinParser.NonZeroInteger, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !(_la==Zero || _la==NonZeroInteger) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode END_STRING() { return getToken(TailspinParser.END_STRING, 0); }
		public TerminalNode START_STRING() { return getToken(TailspinParser.START_STRING, 0); }
		public TerminalNode START_REGEXP() { return getToken(TailspinParser.START_REGEXP, 0); }
		public List<StringContentContext> stringContent() {
			return getRuleContexts(StringContentContext.class);
		}
		public StringContentContext stringContent(int i) {
			return getRuleContext(StringContentContext.class,i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !(_la==START_STRING || _la==START_REGEXP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartStringEvaluate) | (1L << StartStringInterpolate) | (1L << STRING_TEXT))) != 0)) {
				{
				{
				setState(351);
				stringContent();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			match(END_STRING);
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

	public static class StringContentContext extends ParserRuleContext {
		public StringInterpolateContext stringInterpolate() {
			return getRuleContext(StringInterpolateContext.class,0);
		}
		public TerminalNode STRING_TEXT() { return getToken(TailspinParser.STRING_TEXT, 0); }
		public StringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStringContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContentContext stringContent() throws RecognitionException {
		StringContentContext _localctx = new StringContentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stringContent);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringEvaluate:
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(STRING_TEXT);
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

	public static class StringInterpolateContext extends ParserRuleContext {
		public InterpolateEvaluateContext interpolateEvaluate() {
			return getRuleContext(InterpolateEvaluateContext.class,0);
		}
		public InterpolateDereferenceValueContext interpolateDereferenceValue() {
			return getRuleContext(InterpolateDereferenceValueContext.class,0);
		}
		public StringInterpolateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringInterpolate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStringInterpolate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringInterpolateContext stringInterpolate() throws RecognitionException {
		StringInterpolateContext _localctx = new StringInterpolateContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stringInterpolate);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringEvaluate:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				interpolateEvaluate();
				}
				break;
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				interpolateDereferenceValue();
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

	public static class InterpolateEvaluateContext extends ParserRuleContext {
		public TerminalNode StartStringEvaluate() { return getToken(TailspinParser.StartStringEvaluate, 0); }
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public InterpolateEvaluateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolateEvaluate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitInterpolateEvaluate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolateEvaluateContext interpolateEvaluate() throws RecognitionException {
		InterpolateEvaluateContext _localctx = new InterpolateEvaluateContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interpolateEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(StartStringEvaluate);
			setState(368);
			valueChain();
			setState(369);
			match(RightParen);
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

	public static class InterpolateDereferenceValueContext extends ParserRuleContext {
		public TerminalNode StartStringInterpolate() { return getToken(TailspinParser.StartStringInterpolate, 0); }
		public TerminalNode InterpolateIdentifier() { return getToken(TailspinParser.InterpolateIdentifier, 0); }
		public TerminalNode EndInterpolate() { return getToken(TailspinParser.EndInterpolate, 0); }
		public TerminalNode InterpolateArray() { return getToken(TailspinParser.InterpolateArray, 0); }
		public ArrayDereferenceContext arrayDereference() {
			return getRuleContext(ArrayDereferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<InterpolateStructureDereferenceContext> interpolateStructureDereference() {
			return getRuleContexts(InterpolateStructureDereferenceContext.class);
		}
		public InterpolateStructureDereferenceContext interpolateStructureDereference(int i) {
			return getRuleContext(InterpolateStructureDereferenceContext.class,i);
		}
		public InterpolateDereferenceValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolateDereferenceValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitInterpolateDereferenceValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolateDereferenceValueContext interpolateDereferenceValue() throws RecognitionException {
		InterpolateDereferenceValueContext _localctx = new InterpolateDereferenceValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interpolateDereferenceValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(StartStringInterpolate);
			setState(372);
			match(InterpolateIdentifier);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==InterpolateArray) {
				{
				setState(373);
				match(InterpolateArray);
				setState(374);
				arrayDereference();
				setState(375);
				match(RightParen);
				}
			}

			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==InterpolateField) {
				{
				{
				setState(379);
				interpolateStructureDereference();
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(385);
			match(EndInterpolate);
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

	public static class InterpolateStructureDereferenceContext extends ParserRuleContext {
		public List<TerminalNode> InterpolateField() { return getTokens(TailspinParser.InterpolateField); }
		public TerminalNode InterpolateField(int i) {
			return getToken(TailspinParser.InterpolateField, i);
		}
		public TerminalNode InterpolateArray() { return getToken(TailspinParser.InterpolateArray, 0); }
		public ArrayDereferenceContext arrayDereference() {
			return getRuleContext(ArrayDereferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public InterpolateStructureDereferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolateStructureDereference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitInterpolateStructureDereference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolateStructureDereferenceContext interpolateStructureDereference() throws RecognitionException {
		InterpolateStructureDereferenceContext _localctx = new InterpolateStructureDereferenceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interpolateStructureDereference);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(387);
					match(InterpolateField);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(390); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==InterpolateArray) {
				{
				setState(392);
				match(InterpolateArray);
				setState(393);
				arrayDereference();
				setState(394);
				match(RightParen);
				}
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

	public static class SinkContext extends ParserRuleContext {
		public TerminalNode Stdout() { return getToken(TailspinParser.Stdout, 0); }
		public SinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sink; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitSink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinkContext sink() throws RecognitionException {
		SinkContext _localctx = new SinkContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(Stdout);
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public DereferenceValueContext dereferenceValue() {
			return getRuleContext(DereferenceValueContext.class,0);
		}
		public TerminalNode AdditiveOperator() { return getToken(TailspinParser.AdditiveOperator, 0); }
		public TerminalNode MultiplicativeOperator() { return getToken(TailspinParser.MultiplicativeOperator, 0); }
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		return arithmeticExpression(0);
	}

	private ArithmeticExpressionContext arithmeticExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, _parentState);
		ArithmeticExpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
			case NonZeroInteger:
				{
				setState(401);
				integerLiteral();
				}
				break;
			case LeftParen:
				{
				setState(402);
				match(LeftParen);
				setState(403);
				arithmeticExpression(0);
				setState(404);
				match(RightParen);
				}
				break;
			case Dereference:
			case StartArrayDereference:
			case AdditiveOperator:
				{
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AdditiveOperator) {
					{
					setState(406);
					match(AdditiveOperator);
					}
				}

				setState(409);
				dereferenceValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(418);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(412);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(413);
						match(MultiplicativeOperator);
						setState(414);
						arithmeticExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(415);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(416);
						match(AdditiveOperator);
						setState(417);
						arithmeticExpression(2);
						}
						break;
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class ComposerBodyContext extends ParserRuleContext {
		public CompositionSequenceContext compositionSequence() {
			return getRuleContext(CompositionSequenceContext.class,0);
		}
		public ComposerBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composerBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitComposerBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComposerBodyContext composerBody() throws RecognitionException {
		ComposerBodyContext _localctx = new ComposerBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_composerBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			compositionSequence();
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

	public static class CompositionSequenceContext extends ParserRuleContext {
		public List<CompositionMatcherContext> compositionMatcher() {
			return getRuleContexts(CompositionMatcherContext.class);
		}
		public CompositionMatcherContext compositionMatcher(int i) {
			return getRuleContext(CompositionMatcherContext.class,i);
		}
		public CompositionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionSequence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionSequenceContext compositionSequence() throws RecognitionException {
		CompositionSequenceContext _localctx = new CompositionSequenceContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_compositionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(425);
				compositionMatcher();
				}
				}
				setState(428); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (StartComposerMatch - 60)) | (1L << (StartSkipRule - 60)) | (1L << (StartBuildArray - 60)))) != 0) );
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

	public static class CompositionMatcherContext extends ParserRuleContext {
		public TerminalNode StartComposerMatch() { return getToken(TailspinParser.StartComposerMatch, 0); }
		public TerminalNode ComposerId() { return getToken(TailspinParser.ComposerId, 0); }
		public TerminalNode EndComposerMatch() { return getToken(TailspinParser.EndComposerMatch, 0); }
		public TerminalNode Optional() { return getToken(TailspinParser.Optional, 0); }
		public TerminalNode START_REGEX() { return getToken(TailspinParser.START_REGEX, 0); }
		public TerminalNode REGEX_TEXT() { return getToken(TailspinParser.REGEX_TEXT, 0); }
		public TerminalNode END_REGEX() { return getToken(TailspinParser.END_REGEX, 0); }
		public TerminalNode StartSkipRule() { return getToken(TailspinParser.StartSkipRule, 0); }
		public CompositionSequenceContext compositionSequence() {
			return getRuleContext(CompositionSequenceContext.class,0);
		}
		public TerminalNode EndSkipRule() { return getToken(TailspinParser.EndSkipRule, 0); }
		public TerminalNode StartBuildArray() { return getToken(TailspinParser.StartBuildArray, 0); }
		public TerminalNode EndBuildArray() { return getToken(TailspinParser.EndBuildArray, 0); }
		public CompositionMatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionMatcher; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionMatcherContext compositionMatcher() throws RecognitionException {
		CompositionMatcherContext _localctx = new CompositionMatcherContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_compositionMatcher);
		int _la;
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(StartComposerMatch);
				setState(431);
				match(ComposerId);
				setState(432);
				match(EndComposerMatch);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Optional) {
					{
					setState(433);
					match(Optional);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(StartComposerMatch);
				setState(437);
				match(START_REGEX);
				setState(438);
				match(REGEX_TEXT);
				setState(439);
				match(END_REGEX);
				setState(440);
				match(EndComposerMatch);
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Optional) {
					{
					setState(441);
					match(Optional);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				match(StartSkipRule);
				setState(445);
				compositionSequence();
				setState(446);
				match(EndSkipRule);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				match(StartBuildArray);
				setState(449);
				compositionSequence();
				setState(450);
				match(EndBuildArray);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 33:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u01c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\7\2O\n\2\f\2\16\2R\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3i\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4r\n\4\3\5\3\5\7\5"+
		"v\n\5\f\5\16\5y\13\5\3\5\3\5\3\5\3\5\7\5\177\n\5\f\5\16\5\u0082\13\5\5"+
		"\5\u0084\n\5\3\6\7\6\u0087\n\6\f\6\16\6\u008a\13\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u0091\n\6\3\7\3\7\3\7\3\7\5\7\u0097\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u009e"+
		"\n\b\3\b\7\b\u00a1\n\b\f\b\16\b\u00a4\13\b\3\b\3\b\5\b\u00a8\n\b\3\t\3"+
		"\t\3\t\5\t\u00ad\n\t\7\t\u00af\n\t\f\t\16\t\u00b2\13\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00c6\n\13\3\f\3\f\7\f\u00ca\n\f\f\f\16\f\u00cd\13\f\3\f\6\f\u00d0"+
		"\n\f\r\f\16\f\u00d1\5\f\u00d4\n\f\3\r\3\r\3\r\3\16\6\16\u00da\n\16\r\16"+
		"\16\16\u00db\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00ea\n\17\5\17\u00ec\n\17\3\20\3\20\3\20\3\20\5\20\u00f2\n\20"+
		"\3\21\3\21\3\21\5\21\u00f7\n\21\3\21\3\21\5\21\u00fb\n\21\3\21\3\21\3"+
		"\21\3\21\5\21\u0101\n\21\5\21\u0103\n\21\3\22\3\22\3\22\5\22\u0108\n\22"+
		"\3\23\3\23\5\23\u010c\n\23\3\23\3\23\3\24\3\24\5\24\u0112\n\24\3\24\3"+
		"\24\5\24\u0116\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u011d\n\24\7\24\u011f"+
		"\n\24\f\24\16\24\u0122\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u012b"+
		"\n\24\3\24\5\24\u012e\n\24\3\24\5\24\u0131\n\24\3\24\5\24\u0134\n\24\5"+
		"\24\u0136\n\24\3\25\3\25\3\26\3\26\3\27\3\27\5\27\u013e\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0145\n\30\3\30\7\30\u0148\n\30\f\30\16\30\u014b"+
		"\13\30\3\31\6\31\u014e\n\31\r\31\16\31\u014f\3\31\3\31\3\31\3\31\5\31"+
		"\u0156\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u015d\n\32\3\33\3\33\3\34\3"+
		"\34\7\34\u0163\n\34\f\34\16\34\u0166\13\34\3\34\3\34\3\35\3\35\5\35\u016c"+
		"\n\35\3\36\3\36\5\36\u0170\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 "+
		"\5 \u017c\n \3 \7 \u017f\n \f \16 \u0182\13 \3 \3 \3!\6!\u0187\n!\r!\16"+
		"!\u0188\3!\3!\3!\3!\5!\u018f\n!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\5#\u019a"+
		"\n#\3#\5#\u019d\n#\3#\3#\3#\3#\3#\3#\7#\u01a5\n#\f#\16#\u01a8\13#\3$\3"+
		"$\3%\6%\u01ad\n%\r%\16%\u01ae\3&\3&\3&\3&\5&\u01b5\n&\3&\3&\3&\3&\3&\3"+
		"&\5&\u01bd\n&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01c7\n&\3&\2\3D\'\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\5\4\2\27"+
		"\27--\3\2 !\4\2\"\"\62\62\2\u01f2\2L\3\2\2\2\4h\3\2\2\2\6q\3\2\2\2\b\u0083"+
		"\3\2\2\2\n\u0088\3\2\2\2\f\u0096\3\2\2\2\16\u00a7\3\2\2\2\20\u00a9\3\2"+
		"\2\2\22\u00b5\3\2\2\2\24\u00c5\3\2\2\2\26\u00d3\3\2\2\2\30\u00d5\3\2\2"+
		"\2\32\u00d9\3\2\2\2\34\u00eb\3\2\2\2\36\u00f1\3\2\2\2 \u0102\3\2\2\2\""+
		"\u0107\3\2\2\2$\u0109\3\2\2\2&\u0135\3\2\2\2(\u0137\3\2\2\2*\u0139\3\2"+
		"\2\2,\u013d\3\2\2\2.\u013f\3\2\2\2\60\u014d\3\2\2\2\62\u0157\3\2\2\2\64"+
		"\u015e\3\2\2\2\66\u0160\3\2\2\28\u016b\3\2\2\2:\u016f\3\2\2\2<\u0171\3"+
		"\2\2\2>\u0175\3\2\2\2@\u0186\3\2\2\2B\u0190\3\2\2\2D\u019c\3\2\2\2F\u01a9"+
		"\3\2\2\2H\u01ac\3\2\2\2J\u01c6\3\2\2\2LP\5\4\3\2MO\5\4\3\2NM\3\2\2\2O"+
		"R\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\2\2\3T\3\3\2\2\2"+
		"UV\7\6\2\2VW\7\26\2\2Wi\5\36\20\2XY\5\36\20\2YZ\7\13\2\2Z[\5B\"\2[i\3"+
		"\2\2\2\\]\7\30\2\2]^\7#\2\2^_\5\26\f\2_`\7\32\2\2`a\7#\2\2ai\3\2\2\2b"+
		"c\7\31\2\2cd\7F\2\2de\5F$\2ef\7=\2\2fg\7#\2\2gi\3\2\2\2hU\3\2\2\2hX\3"+
		"\2\2\2h\\\3\2\2\2hb\3\2\2\2i\5\3\2\2\2jr\7\5\2\2kr\5\b\5\2lr\5\66\34\2"+
		"mr\5D#\2nr\5\62\32\2or\5\16\b\2pr\5\20\t\2qj\3\2\2\2qk\3\2\2\2ql\3\2\2"+
		"\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\7\3\2\2\2sw\7\7\2\2tv\5\n"+
		"\6\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\u0084\3\2\2\2yw\3\2\2\2"+
		"z{\7\b\2\2{|\5\f\7\2|\u0080\7\21\2\2}\177\5\n\6\2~}\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083s\3\2\2\2\u0083z\3\2\2\2\u0084\t\3\2\2\2\u0085\u0087"+
		"\7\t\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u0090\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0091\7\t"+
		"\2\2\u008c\u008d\7\n\2\2\u008d\u008e\5\f\7\2\u008e\u008f\7\21\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0091\13\3\2\2"+
		"\2\u0092\u0097\7!\2\2\u0093\u0097\5\62\32\2\u0094\u0097\5\16\b\2\u0095"+
		"\u0097\5\b\5\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0095\3\2\2\2\u0097\r\3\2\2\2\u0098\u0099\7\22\2\2\u0099\u00a8"+
		"\7\23\2\2\u009a\u009b\7\22\2\2\u009b\u00a2\5\36\20\2\u009c\u009e\7\16"+
		"\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a1\5\36\20\2\u00a0\u009d\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\7\23\2\2\u00a6\u00a8\3\2\2\2\u00a7\u0098\3\2\2\2\u00a7\u009a\3"+
		"\2\2\2\u00a8\17\3\2\2\2\u00a9\u00b0\7\24\2\2\u00aa\u00ac\5\22\n\2\u00ab"+
		"\u00ad\7\16\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3"+
		"\2\2\2\u00ae\u00aa\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\25"+
		"\2\2\u00b4\21\3\2\2\2\u00b5\u00b6\7\26\2\2\u00b6\u00b7\5\36\20\2\u00b7"+
		"\23\3\2\2\2\u00b8\u00c6\5\6\4\2\u00b9\u00ba\7\20\2\2\u00ba\u00bb\5\26"+
		"\f\2\u00bb\u00bc\7\21\2\2\u00bc\u00c6\3\2\2\2\u00bd\u00c6\7#\2\2\u00be"+
		"\u00bf\7\22\2\2\u00bf\u00c0\7#\2\2\u00c0\u00c1\7\23\2\2\u00c1\u00c2\7"+
		"\20\2\2\u00c2\u00c3\5\26\f\2\u00c3\u00c4\7\21\2\2\u00c4\u00c6\3\2\2\2"+
		"\u00c5\u00b8\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00be"+
		"\3\2\2\2\u00c6\25\3\2\2\2\u00c7\u00cb\5\32\16\2\u00c8\u00ca\5\30\r\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00d4\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\5\30\r\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00c7\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4"+
		"\27\3\2\2\2\u00d5\u00d6\5$\23\2\u00d6\u00d7\5\32\16\2\u00d7\31\3\2\2\2"+
		"\u00d8\u00da\5\34\17\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\33\3\2\2\2\u00dd\u00de\5\36\20\2\u00de"+
		"\u00df\7\f\2\2\u00df\u00ec\3\2\2\2\u00e0\u00e1\5\36\20\2\u00e1\u00e2\7"+
		"\13\2\2\u00e2\u00e3\7\33\2\2\u00e3\u00ec\3\2\2\2\u00e4\u00ec\5\4\3\2\u00e5"+
		"\u00e6\5\36\20\2\u00e6\u00e7\7\13\2\2\u00e7\u00e9\7\r\2\2\u00e8\u00ea"+
		"\7#\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00dd\3\2\2\2\u00eb\u00e0\3\2\2\2\u00eb\u00e4\3\2\2\2\u00eb\u00e5\3\2"+
		"\2\2\u00ec\35\3\2\2\2\u00ed\u00f2\5\6\4\2\u00ee\u00ef\5\6\4\2\u00ef\u00f0"+
		"\5 \21\2\u00f0\u00f2\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2"+
		"\37\3\2\2\2\u00f3\u00f4\7\13\2\2\u00f4\u00f6\5\24\13\2\u00f5\u00f7\5 "+
		"\21\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u0103\3\2\2\2\u00f8"+
		"\u00fa\7\17\2\2\u00f9\u00fb\5 \21\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3"+
		"\2\2\2\u00fb\u0103\3\2\2\2\u00fc\u00fd\7\13\2\2\u00fd\u00fe\7\17\2\2\u00fe"+
		"\u0100\5\"\22\2\u00ff\u0101\5 \21\2\u0100\u00ff\3\2\2\2\u0100\u0101\3"+
		"\2\2\2\u0101\u0103\3\2\2\2\u0102\u00f3\3\2\2\2\u0102\u00f8\3\2\2\2\u0102"+
		"\u00fc\3\2\2\2\u0103!\3\2\2\2\u0104\u0108\5\b\5\2\u0105\u0106\7\"\2\2"+
		"\u0106\u0108\7(\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0108#\3\2"+
		"\2\2\u0109\u010b\t\2\2\2\u010a\u010c\5&\24\2\u010b\u010a\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7.\2\2\u010e%\3\2\2\2\u010f"+
		"\u0136\5,\27\2\u0110\u0112\5(\25\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0115\7\61\2\2\u0114\u0116\5*\26\2\u0115"+
		"\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0136\3\2\2\2\u0117\u0136\5\66"+
		"\34\2\u0118\u0120\7\63\2\2\u0119\u011a\7\67\2\2\u011a\u011c\5$\23\2\u011b"+
		"\u011d\7\16\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3"+
		"\2\2\2\u011e\u0119\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0136\7\64"+
		"\2\2\u0124\u0125\7/\2\2\u0125\u0136\5&\24\2\u0126\u0127\7\65\2\2\u0127"+
		"\u0133\7\66\2\2\u0128\u012a\79\2\2\u0129\u012b\5D#\2\u012a\u0129\3\2\2"+
		"\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012e\7\35\2\2\u012d"+
		"\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u0131\5D"+
		"#\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0134\7\21\2\2\u0133\u0128\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3"+
		"\2\2\2\u0135\u010f\3\2\2\2\u0135\u0111\3\2\2\2\u0135\u0117\3\2\2\2\u0135"+
		"\u0118\3\2\2\2\u0135\u0124\3\2\2\2\u0135\u0126\3\2\2\2\u0136\'\3\2\2\2"+
		"\u0137\u0138\5,\27\2\u0138)\3\2\2\2\u0139\u013a\5,\27\2\u013a+\3\2\2\2"+
		"\u013b\u013e\7\60\2\2\u013c\u013e\5.\30\2\u013d\u013b\3\2\2\2\u013d\u013c"+
		"\3\2\2\2\u013e-\3\2\2\2\u013f\u0144\78\2\2\u0140\u0141\79\2\2\u0141\u0142"+
		"\5\f\7\2\u0142\u0143\7\21\2\2\u0143\u0145\3\2\2\2\u0144\u0140\3\2\2\2"+
		"\u0144\u0145\3\2\2\2\u0145\u0149\3\2\2\2\u0146\u0148\5\60\31\2\u0147\u0146"+
		"\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"/\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\7:\2\2\u014d\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0155\3\2"+
		"\2\2\u0151\u0152\79\2\2\u0152\u0153\5\f\7\2\u0153\u0154\7\21\2\2\u0154"+
		"\u0156\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0156\3\2\2\2\u0156\61\3\2\2"+
		"\2\u0157\u0158\5D#\2\u0158\u0159\7\35\2\2\u0159\u015c\5D#\2\u015a\u015b"+
		"\7\r\2\2\u015b\u015d\5D#\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\63\3\2\2\2\u015e\u015f\t\3\2\2\u015f\65\3\2\2\2\u0160\u0164\t\4\2\2\u0161"+
		"\u0163\58\35\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2"+
		"\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167"+
		"\u0168\7(\2\2\u0168\67\3\2\2\2\u0169\u016c\5:\36\2\u016a\u016c\7\'\2\2"+
		"\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c9\3\2\2\2\u016d\u0170\5"+
		"<\37\2\u016e\u0170\5> \2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170"+
		";\3\2\2\2\u0171\u0172\7%\2\2\u0172\u0173\5\36\20\2\u0173\u0174\7\21\2"+
		"\2\u0174=\3\2\2\2\u0175\u0176\7&\2\2\u0176\u017b\7+\2\2\u0177\u0178\7"+
		"*\2\2\u0178\u0179\5\f\7\2\u0179\u017a\7\21\2\2\u017a\u017c\3\2\2\2\u017b"+
		"\u0177\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u0180\3\2\2\2\u017d\u017f\5@"+
		"!\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7)"+
		"\2\2\u0184?\3\2\2\2\u0185\u0187\7,\2\2\u0186\u0185\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018e\3\2\2\2\u018a"+
		"\u018b\7*\2\2\u018b\u018c\5\f\7\2\u018c\u018d\7\21\2\2\u018d\u018f\3\2"+
		"\2\2\u018e\u018a\3\2\2\2\u018e\u018f\3\2\2\2\u018fA\3\2\2\2\u0190\u0191"+
		"\7\4\2\2\u0191C\3\2\2\2\u0192\u0193\b#\1\2\u0193\u019d\5\64\33\2\u0194"+
		"\u0195\7\20\2\2\u0195\u0196\5D#\2\u0196\u0197\7\21\2\2\u0197\u019d\3\2"+
		"\2\2\u0198\u019a\7\36\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019d\5\b\5\2\u019c\u0192\3\2\2\2\u019c\u0194\3\2"+
		"\2\2\u019c\u0199\3\2\2\2\u019d\u01a6\3\2\2\2\u019e\u019f\f\4\2\2\u019f"+
		"\u01a0\7\37\2\2\u01a0\u01a5\5D#\5\u01a1\u01a2\f\3\2\2\u01a2\u01a3\7\36"+
		"\2\2\u01a3\u01a5\5D#\4\u01a4\u019e\3\2\2\2\u01a4\u01a1\3\2\2\2\u01a5\u01a8"+
		"\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7E\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a9\u01aa\5H%\2\u01aaG\3\2\2\2\u01ab\u01ad\5J&\2\u01ac"+
		"\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01afI\3\2\2\2\u01b0\u01b1\7>\2\2\u01b1\u01b2\7F\2\2\u01b2\u01b4"+
		"\7?\2\2\u01b3\u01b5\7@\2\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01c7\3\2\2\2\u01b6\u01b7\7>\2\2\u01b7\u01b8\7A\2\2\u01b8\u01b9\7H\2"+
		"\2\u01b9\u01ba\7I\2\2\u01ba\u01bc\7?\2\2\u01bb\u01bd\7@\2\2\u01bc\u01bb"+
		"\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c7\3\2\2\2\u01be\u01bf\7B\2\2\u01bf"+
		"\u01c0\5H%\2\u01c0\u01c1\7C\2\2\u01c1\u01c7\3\2\2\2\u01c2\u01c3\7D\2\2"+
		"\u01c3\u01c4\5H%\2\u01c4\u01c5\7E\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01b0"+
		"\3\2\2\2\u01c6\u01b6\3\2\2\2\u01c6\u01be\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c7"+
		"K\3\2\2\2<Phqw\u0080\u0083\u0088\u0090\u0096\u009d\u00a2\u00a7\u00ac\u00b0"+
		"\u00c5\u00cb\u00d1\u00d3\u00db\u00e9\u00eb\u00f1\u00f6\u00fa\u0100\u0102"+
		"\u0107\u010b\u0111\u0115\u011c\u0120\u012a\u012d\u0130\u0133\u0135\u013d"+
		"\u0144\u0149\u014f\u0155\u015c\u0164\u016b\u016f\u017b\u0180\u0188\u018e"+
		"\u0199\u019c\u01a4\u01a6\u01ae\u01b4\u01bc\u01c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}