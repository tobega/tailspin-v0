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
		EndStructureMatch=50, StructureKey=51, MatchDereference=52, MatchArrayDereference=53, 
		MatchFieldDereference=54, MatcherIgnoreWS=55, Comment=56, ComposerEndDefinition=57, 
		StartComposerMatch=58, EndComposerMatch=59, START_REGEX=60, StartSkipRule=61, 
		EndSkipRule=62, ComposerId=63, ComposerIgnoreWS=64, REGEX_TEXT=65, END_REGEX=66;
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
		null, "':'", "','", "'...'", null, null, "'['", "']'", "'{'", "'}'", null, 
		null, "'templates'", "'composer'", null, "'#'", null, "'..'", null, null, 
		"'0'", null, null, null, null, "'$('", null, null, null, "';'"
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
		"StructureKey", "MatchDereference", "MatchArrayDereference", "MatchFieldDereference", 
		"MatcherIgnoreWS", "Comment", "ComposerEndDefinition", "StartComposerMatch", 
		"EndComposerMatch", "START_REGEX", "StartSkipRule", "EndSkipRule", "ComposerId", 
		"ComposerIgnoreWS", "REGEX_TEXT", "END_REGEX"
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
		public List<ValueChainContext> valueChain() {
			return getRuleContexts(ValueChainContext.class);
		}
		public ValueChainContext valueChain(int i) {
			return getRuleContext(ValueChainContext.class,i);
		}
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(LeftBracket);
			setState(151);
			valueChain();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Stdin) | (1L << Dereference) | (1L << StartArrayDereference) | (1L << Comma) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << AdditiveOperator) | (1L << Zero) | (1L << NonZeroInteger) | (1L << START_STRING) | (1L << START_REGEXP))) != 0)) {
				{
				{
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(152);
					match(Comma);
					}
				}

				setState(155);
				valueChain();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(RightBracket);
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
			setState(163);
			match(LeftBrace);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Key) {
				{
				{
				setState(164);
				keyValue();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(165);
					match(Comma);
					}
				}

				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
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
			setState(175);
			match(Key);
			setState(176);
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
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new LiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				source();
				}
				break;
			case 2:
				_localctx = new InlineTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(LeftParen);
				setState(180);
				templatesBody();
				setState(181);
				match(RightParen);
				}
				break;
			case 3:
				_localctx = new CallDefinedTransformContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new ArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(LeftBracket);
				setState(185);
				match(IDENTIFIER);
				setState(186);
				match(RightBracket);
				setState(187);
				match(LeftParen);
				setState(188);
				templatesBody();
				setState(189);
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
			setState(205);
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
				setState(193);
				block();
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StartMatcher || _la==StartSubMatcher) {
					{
					{
					setState(194);
					matchTemplate();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case StartMatcher:
			case StartSubMatcher:
				enterOuterAlt(_localctx, 2);
				{
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(200);
					matchTemplate();
					}
					}
					setState(203); 
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
			setState(207);
			matcher();
			setState(208);
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
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				blockExpression();
				}
				}
				setState(213); 
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
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ResultValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				valueChain();
				setState(216);
				match(ResultMarker);
				}
				break;
			case 2:
				_localctx = new SendToTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				valueChain();
				setState(219);
				match(To);
				setState(220);
				match(TemplateMatch);
				}
				break;
			case 3:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				statement();
				}
				break;
			case 4:
				_localctx = new StateAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				valueChain();
				setState(224);
				match(To);
				setState(225);
				match(Colon);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(226);
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
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				source();
				setState(233);
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
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(To);
				setState(238);
				templates();
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(239);
					transform();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(Deconstructor);
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(To);
				setState(247);
				match(Deconstructor);
				setState(248);
				collector();
				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(249);
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
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dereference:
			case StartArrayDereference:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				dereferenceValue();
				}
				break;
			case START_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(START_STRING);
				setState(256);
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
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==StartMatcher || _la==StartSubMatcher) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << START_STRING) | (1L << InvertMatch) | (1L << MatchInteger) | (1L << RangeMatch) | (1L << START_REGEXP) | (1L << StartStructureMatch) | (1L << MatchDereference))) != 0)) {
				{
				setState(260);
				condition();
				}
			}

			setState(263);
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
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new IntegerEqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				matchArithmeticExpression();
				}
				break;
			case 2:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MatchInteger || _la==MatchDereference) {
					{
					setState(266);
					lowerBound();
					}
				}

				setState(269);
				match(RangeMatch);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MatchInteger || _la==MatchDereference) {
					{
					setState(270);
					upperBound();
					}
				}

				}
				break;
			case 3:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				stringLiteral();
				}
				break;
			case 4:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				match(StartStructureMatch);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StructureKey) {
					{
					{
					setState(275);
					match(StructureKey);
					setState(276);
					matcher();
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(277);
						match(Comma);
						}
					}

					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				match(EndStructureMatch);
				}
				break;
			case 5:
				_localctx = new InvertMatchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(InvertMatch);
				setState(287);
				condition();
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
			setState(290);
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
			setState(292);
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
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MatchInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(MatchInteger);
				}
				break;
			case MatchDereference:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
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
			setState(298);
			match(MatchDereference);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MatchArrayDereference) {
				{
				setState(299);
				match(MatchArrayDereference);
				setState(300);
				arrayDereference();
				setState(301);
				match(RightParen);
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MatchFieldDereference) {
				{
				{
				setState(305);
				matchStructureDereference();
				}
				}
				setState(310);
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
			setState(312); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(311);
					match(MatchFieldDereference);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(314); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MatchArrayDereference) {
				{
				setState(316);
				match(MatchArrayDereference);
				setState(317);
				arrayDereference();
				setState(318);
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
			setState(322);
			arithmeticExpression(0);
			setState(323);
			match(Range);
			setState(324);
			arithmeticExpression(0);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(325);
				match(Colon);
				setState(326);
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
			setState(329);
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
			setState(331);
			_la = _input.LA(1);
			if ( !(_la==START_STRING || _la==START_REGEXP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartStringEvaluate) | (1L << StartStringInterpolate) | (1L << STRING_TEXT))) != 0)) {
				{
				{
				setState(332);
				stringContent();
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
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
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringEvaluate:
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
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
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringEvaluate:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				interpolateEvaluate();
				}
				break;
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
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
			setState(348);
			match(StartStringEvaluate);
			setState(349);
			valueChain();
			setState(350);
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
			setState(352);
			match(StartStringInterpolate);
			setState(353);
			match(InterpolateIdentifier);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==InterpolateArray) {
				{
				setState(354);
				match(InterpolateArray);
				setState(355);
				arrayDereference();
				setState(356);
				match(RightParen);
				}
			}

			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==InterpolateField) {
				{
				{
				setState(360);
				interpolateStructureDereference();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
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
			setState(369); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(368);
					match(InterpolateField);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(371); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(379);
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
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
			case NonZeroInteger:
				{
				setState(382);
				integerLiteral();
				}
				break;
			case LeftParen:
				{
				setState(383);
				match(LeftParen);
				setState(384);
				arithmeticExpression(0);
				setState(385);
				match(RightParen);
				}
				break;
			case Dereference:
			case StartArrayDereference:
			case AdditiveOperator:
				{
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AdditiveOperator) {
					{
					setState(387);
					match(AdditiveOperator);
					}
				}

				setState(390);
				dereferenceValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(399);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(393);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(394);
						match(MultiplicativeOperator);
						setState(395);
						arithmeticExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(396);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(397);
						match(AdditiveOperator);
						setState(398);
						arithmeticExpression(2);
						}
						break;
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
			setState(404);
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
			setState(407); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(406);
				compositionMatcher();
				}
				}
				setState(409); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StartComposerMatch || _la==StartSkipRule );
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
		public TerminalNode START_REGEX() { return getToken(TailspinParser.START_REGEX, 0); }
		public TerminalNode REGEX_TEXT() { return getToken(TailspinParser.REGEX_TEXT, 0); }
		public TerminalNode END_REGEX() { return getToken(TailspinParser.END_REGEX, 0); }
		public TerminalNode StartSkipRule() { return getToken(TailspinParser.StartSkipRule, 0); }
		public CompositionSequenceContext compositionSequence() {
			return getRuleContext(CompositionSequenceContext.class,0);
		}
		public TerminalNode EndSkipRule() { return getToken(TailspinParser.EndSkipRule, 0); }
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
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(StartComposerMatch);
				setState(412);
				match(ComposerId);
				setState(413);
				match(EndComposerMatch);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(StartComposerMatch);
				setState(415);
				match(START_REGEX);
				setState(416);
				match(REGEX_TEXT);
				setState(417);
				match(END_REGEX);
				setState(418);
				match(EndComposerMatch);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				match(StartSkipRule);
				setState(420);
				compositionSequence();
				setState(421);
				match(EndSkipRule);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u01ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\7\2O\n\2\f\2\16\2R\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3i\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4r\n\4\3\5\3\5\7\5"+
		"v\n\5\f\5\16\5y\13\5\3\5\3\5\3\5\3\5\7\5\177\n\5\f\5\16\5\u0082\13\5\5"+
		"\5\u0084\n\5\3\6\7\6\u0087\n\6\f\6\16\6\u008a\13\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u0091\n\6\3\7\3\7\3\7\3\7\5\7\u0097\n\7\3\b\3\b\3\b\5\b\u009c\n\b"+
		"\3\b\7\b\u009f\n\b\f\b\16\b\u00a2\13\b\3\b\3\b\3\t\3\t\3\t\5\t\u00a9\n"+
		"\t\7\t\u00ab\n\t\f\t\16\t\u00ae\13\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c2\n\13\3\f"+
		"\3\f\7\f\u00c6\n\f\f\f\16\f\u00c9\13\f\3\f\6\f\u00cc\n\f\r\f\16\f\u00cd"+
		"\5\f\u00d0\n\f\3\r\3\r\3\r\3\16\6\16\u00d6\n\16\r\16\16\16\u00d7\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e6\n\17"+
		"\5\17\u00e8\n\17\3\20\3\20\3\20\3\20\5\20\u00ee\n\20\3\21\3\21\3\21\5"+
		"\21\u00f3\n\21\3\21\3\21\5\21\u00f7\n\21\3\21\3\21\3\21\3\21\5\21\u00fd"+
		"\n\21\5\21\u00ff\n\21\3\22\3\22\3\22\5\22\u0104\n\22\3\23\3\23\5\23\u0108"+
		"\n\23\3\23\3\23\3\24\3\24\5\24\u010e\n\24\3\24\3\24\5\24\u0112\n\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u0119\n\24\7\24\u011b\n\24\f\24\16\24\u011e"+
		"\13\24\3\24\3\24\3\24\5\24\u0123\n\24\3\25\3\25\3\26\3\26\3\27\3\27\5"+
		"\27\u012b\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0132\n\30\3\30\7\30\u0135"+
		"\n\30\f\30\16\30\u0138\13\30\3\31\6\31\u013b\n\31\r\31\16\31\u013c\3\31"+
		"\3\31\3\31\3\31\5\31\u0143\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u014a\n"+
		"\32\3\33\3\33\3\34\3\34\7\34\u0150\n\34\f\34\16\34\u0153\13\34\3\34\3"+
		"\34\3\35\3\35\5\35\u0159\n\35\3\36\3\36\5\36\u015d\n\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \5 \u0169\n \3 \7 \u016c\n \f \16 \u016f\13 \3"+
		" \3 \3!\6!\u0174\n!\r!\16!\u0175\3!\3!\3!\3!\5!\u017c\n!\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\5#\u0187\n#\3#\5#\u018a\n#\3#\3#\3#\3#\3#\3#\7#\u0192"+
		"\n#\f#\16#\u0195\13#\3$\3$\3%\6%\u019a\n%\r%\16%\u019b\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\5&\u01aa\n&\3&\2\3D\'\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\5\4\2\27\27--\3\2 !\4\2"+
		"\"\"\62\62\2\u01cc\2L\3\2\2\2\4h\3\2\2\2\6q\3\2\2\2\b\u0083\3\2\2\2\n"+
		"\u0088\3\2\2\2\f\u0096\3\2\2\2\16\u0098\3\2\2\2\20\u00a5\3\2\2\2\22\u00b1"+
		"\3\2\2\2\24\u00c1\3\2\2\2\26\u00cf\3\2\2\2\30\u00d1\3\2\2\2\32\u00d5\3"+
		"\2\2\2\34\u00e7\3\2\2\2\36\u00ed\3\2\2\2 \u00fe\3\2\2\2\"\u0103\3\2\2"+
		"\2$\u0105\3\2\2\2&\u0122\3\2\2\2(\u0124\3\2\2\2*\u0126\3\2\2\2,\u012a"+
		"\3\2\2\2.\u012c\3\2\2\2\60\u013a\3\2\2\2\62\u0144\3\2\2\2\64\u014b\3\2"+
		"\2\2\66\u014d\3\2\2\28\u0158\3\2\2\2:\u015c\3\2\2\2<\u015e\3\2\2\2>\u0162"+
		"\3\2\2\2@\u0173\3\2\2\2B\u017d\3\2\2\2D\u0189\3\2\2\2F\u0196\3\2\2\2H"+
		"\u0199\3\2\2\2J\u01a9\3\2\2\2LP\5\4\3\2MO\5\4\3\2NM\3\2\2\2OR\3\2\2\2"+
		"PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\2\2\3T\3\3\2\2\2UV\7\6\2"+
		"\2VW\7\26\2\2Wi\5\36\20\2XY\5\36\20\2YZ\7\13\2\2Z[\5B\"\2[i\3\2\2\2\\"+
		"]\7\30\2\2]^\7#\2\2^_\5\26\f\2_`\7\32\2\2`a\7#\2\2ai\3\2\2\2bc\7\31\2"+
		"\2cd\7A\2\2de\5F$\2ef\7;\2\2fg\7#\2\2gi\3\2\2\2hU\3\2\2\2hX\3\2\2\2h\\"+
		"\3\2\2\2hb\3\2\2\2i\5\3\2\2\2jr\7\5\2\2kr\5\b\5\2lr\5\66\34\2mr\5D#\2"+
		"nr\5\62\32\2or\5\16\b\2pr\5\20\t\2qj\3\2\2\2qk\3\2\2\2ql\3\2\2\2qm\3\2"+
		"\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\7\3\2\2\2sw\7\7\2\2tv\5\n\6\2ut\3"+
		"\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\u0084\3\2\2\2yw\3\2\2\2z{\7\b\2"+
		"\2{|\5\f\7\2|\u0080\7\21\2\2}\177\5\n\6\2~}\3\2\2\2\177\u0082\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0083s\3\2\2\2\u0083z\3\2\2\2\u0084\t\3\2\2\2\u0085\u0087\7\t\2"+
		"\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u0090\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0091\7\t\2\2\u008c"+
		"\u008d\7\n\2\2\u008d\u008e\5\f\7\2\u008e\u008f\7\21\2\2\u008f\u0091\3"+
		"\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0091\13\3\2\2\2\u0092"+
		"\u0097\7!\2\2\u0093\u0097\5\62\32\2\u0094\u0097\5\16\b\2\u0095\u0097\5"+
		"\b\5\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\r\3\2\2\2\u0098\u0099\7\22\2\2\u0099\u00a0\5\36\20"+
		"\2\u009a\u009c\7\16\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\5\36\20\2\u009e\u009b\3\2\2\2\u009f\u00a2\3"+
		"\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a4\7\23\2\2\u00a4\17\3\2\2\2\u00a5\u00ac\7\24"+
		"\2\2\u00a6\u00a8\5\22\n\2\u00a7\u00a9\7\16\2\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab\u00ae\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b0\7\25\2\2\u00b0\21\3\2\2\2\u00b1\u00b2\7\26"+
		"\2\2\u00b2\u00b3\5\36\20\2\u00b3\23\3\2\2\2\u00b4\u00c2\5\6\4\2\u00b5"+
		"\u00b6\7\20\2\2\u00b6\u00b7\5\26\f\2\u00b7\u00b8\7\21\2\2\u00b8\u00c2"+
		"\3\2\2\2\u00b9\u00c2\7#\2\2\u00ba\u00bb\7\22\2\2\u00bb\u00bc\7#\2\2\u00bc"+
		"\u00bd\7\23\2\2\u00bd\u00be\7\20\2\2\u00be\u00bf\5\26\f\2\u00bf\u00c0"+
		"\7\21\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00b4\3\2\2\2\u00c1\u00b5\3\2\2\2"+
		"\u00c1\u00b9\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c2\25\3\2\2\2\u00c3\u00c7"+
		"\5\32\16\2\u00c4\u00c6\5\30\r\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2"+
		"\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00d0\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\u00cc\5\30\r\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c3"+
		"\3\2\2\2\u00cf\u00cb\3\2\2\2\u00d0\27\3\2\2\2\u00d1\u00d2\5$\23\2\u00d2"+
		"\u00d3\5\32\16\2\u00d3\31\3\2\2\2\u00d4\u00d6\5\34\17\2\u00d5\u00d4\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\33\3\2\2\2\u00d9\u00da\5\36\20\2\u00da\u00db\7\f\2\2\u00db\u00e8\3\2"+
		"\2\2\u00dc\u00dd\5\36\20\2\u00dd\u00de\7\13\2\2\u00de\u00df\7\33\2\2\u00df"+
		"\u00e8\3\2\2\2\u00e0\u00e8\5\4\3\2\u00e1\u00e2\5\36\20\2\u00e2\u00e3\7"+
		"\13\2\2\u00e3\u00e5\7\r\2\2\u00e4\u00e6\7#\2\2\u00e5\u00e4\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00d9\3\2\2\2\u00e7\u00dc\3\2"+
		"\2\2\u00e7\u00e0\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e8\35\3\2\2\2\u00e9\u00ee"+
		"\5\6\4\2\u00ea\u00eb\5\6\4\2\u00eb\u00ec\5 \21\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00e9\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\37\3\2\2\2\u00ef\u00f0\7\13\2"+
		"\2\u00f0\u00f2\5\24\13\2\u00f1\u00f3\5 \21\2\u00f2\u00f1\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00ff\3\2\2\2\u00f4\u00f6\7\17\2\2\u00f5\u00f7\5"+
		" \21\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00ff\3\2\2\2\u00f8"+
		"\u00f9\7\13\2\2\u00f9\u00fa\7\17\2\2\u00fa\u00fc\5\"\22\2\u00fb\u00fd"+
		"\5 \21\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00ef\3\2\2\2\u00fe\u00f4\3\2\2\2\u00fe\u00f8\3\2\2\2\u00ff!\3\2\2\2"+
		"\u0100\u0104\5\b\5\2\u0101\u0102\7\"\2\2\u0102\u0104\7(\2\2\u0103\u0100"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0104#\3\2\2\2\u0105\u0107\t\2\2\2\u0106"+
		"\u0108\5&\24\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\u010a\7.\2\2\u010a%\3\2\2\2\u010b\u0123\5,\27\2\u010c\u010e"+
		"\5(\25\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0111\7\61\2\2\u0110\u0112\5*\26\2\u0111\u0110\3\2\2\2\u0111\u0112\3"+
		"\2\2\2\u0112\u0123\3\2\2\2\u0113\u0123\5\66\34\2\u0114\u011c\7\63\2\2"+
		"\u0115\u0116\7\65\2\2\u0116\u0118\5$\23\2\u0117\u0119\7\16\2\2\u0118\u0117"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0115\3\2\2\2\u011b"+
		"\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2"+
		"\2\2\u011e\u011c\3\2\2\2\u011f\u0123\7\64\2\2\u0120\u0121\7/\2\2\u0121"+
		"\u0123\5&\24\2\u0122\u010b\3\2\2\2\u0122\u010d\3\2\2\2\u0122\u0113\3\2"+
		"\2\2\u0122\u0114\3\2\2\2\u0122\u0120\3\2\2\2\u0123\'\3\2\2\2\u0124\u0125"+
		"\5,\27\2\u0125)\3\2\2\2\u0126\u0127\5,\27\2\u0127+\3\2\2\2\u0128\u012b"+
		"\7\60\2\2\u0129\u012b\5.\30\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2"+
		"\u012b-\3\2\2\2\u012c\u0131\7\66\2\2\u012d\u012e\7\67\2\2\u012e\u012f"+
		"\5\f\7\2\u012f\u0130\7\21\2\2\u0130\u0132\3\2\2\2\u0131\u012d\3\2\2\2"+
		"\u0131\u0132\3\2\2\2\u0132\u0136\3\2\2\2\u0133\u0135\5\60\31\2\u0134\u0133"+
		"\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"/\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b\78\2\2\u013a\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0142\3\2"+
		"\2\2\u013e\u013f\7\67\2\2\u013f\u0140\5\f\7\2\u0140\u0141\7\21\2\2\u0141"+
		"\u0143\3\2\2\2\u0142\u013e\3\2\2\2\u0142\u0143\3\2\2\2\u0143\61\3\2\2"+
		"\2\u0144\u0145\5D#\2\u0145\u0146\7\35\2\2\u0146\u0149\5D#\2\u0147\u0148"+
		"\7\r\2\2\u0148\u014a\5D#\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\63\3\2\2\2\u014b\u014c\t\3\2\2\u014c\65\3\2\2\2\u014d\u0151\t\4\2\2\u014e"+
		"\u0150\58\35\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0155\7(\2\2\u0155\67\3\2\2\2\u0156\u0159\5:\36\2\u0157\u0159\7\'\2\2"+
		"\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u01599\3\2\2\2\u015a\u015d\5"+
		"<\37\2\u015b\u015d\5> \2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d"+
		";\3\2\2\2\u015e\u015f\7%\2\2\u015f\u0160\5\36\20\2\u0160\u0161\7\21\2"+
		"\2\u0161=\3\2\2\2\u0162\u0163\7&\2\2\u0163\u0168\7+\2\2\u0164\u0165\7"+
		"*\2\2\u0165\u0166\5\f\7\2\u0166\u0167\7\21\2\2\u0167\u0169\3\2\2\2\u0168"+
		"\u0164\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016d\3\2\2\2\u016a\u016c\5@"+
		"!\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7)"+
		"\2\2\u0171?\3\2\2\2\u0172\u0174\7,\2\2\u0173\u0172\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u017b\3\2\2\2\u0177"+
		"\u0178\7*\2\2\u0178\u0179\5\f\7\2\u0179\u017a\7\21\2\2\u017a\u017c\3\2"+
		"\2\2\u017b\u0177\3\2\2\2\u017b\u017c\3\2\2\2\u017cA\3\2\2\2\u017d\u017e"+
		"\7\4\2\2\u017eC\3\2\2\2\u017f\u0180\b#\1\2\u0180\u018a\5\64\33\2\u0181"+
		"\u0182\7\20\2\2\u0182\u0183\5D#\2\u0183\u0184\7\21\2\2\u0184\u018a\3\2"+
		"\2\2\u0185\u0187\7\36\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u018a\5\b\5\2\u0189\u017f\3\2\2\2\u0189\u0181\3\2"+
		"\2\2\u0189\u0186\3\2\2\2\u018a\u0193\3\2\2\2\u018b\u018c\f\4\2\2\u018c"+
		"\u018d\7\37\2\2\u018d\u0192\5D#\5\u018e\u018f\f\3\2\2\u018f\u0190\7\36"+
		"\2\2\u0190\u0192\5D#\4\u0191\u018b\3\2\2\2\u0191\u018e\3\2\2\2\u0192\u0195"+
		"\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194E\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0196\u0197\5H%\2\u0197G\3\2\2\2\u0198\u019a\5J&\2\u0199"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019cI\3\2\2\2\u019d\u019e\7<\2\2\u019e\u019f\7A\2\2\u019f\u01aa"+
		"\7=\2\2\u01a0\u01a1\7<\2\2\u01a1\u01a2\7>\2\2\u01a2\u01a3\7C\2\2\u01a3"+
		"\u01a4\7D\2\2\u01a4\u01aa\7=\2\2\u01a5\u01a6\7?\2\2\u01a6\u01a7\5H%\2"+
		"\u01a7\u01a8\7@\2\2\u01a8\u01aa\3\2\2\2\u01a9\u019d\3\2\2\2\u01a9\u01a0"+
		"\3\2\2\2\u01a9\u01a5\3\2\2\2\u01aaK\3\2\2\2\65Phqw\u0080\u0083\u0088\u0090"+
		"\u0096\u009b\u00a0\u00a8\u00ac\u00c1\u00c7\u00cd\u00cf\u00d7\u00e5\u00e7"+
		"\u00ed\u00f2\u00f6\u00fc\u00fe\u0103\u0107\u010d\u0111\u0118\u011c\u0122"+
		"\u012a\u0131\u0136\u013c\u0142\u0149\u0151\u0158\u015c\u0168\u016d\u0175"+
		"\u017b\u0186\u0189\u0191\u0193\u019b\u01a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}