// Generated from TailspinParser.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StartComment=1, Include=2, Void=3, Def=4, When=5, Do=6, Otherwise=7, DataDefinition=8, 
		To=9, ResultMarker=10, SourceMarker=11, DeleteMarker=12, Reflexive=13, 
		And=14, Slash=15, Colon=16, Message=17, FieldReference=18, EndStringInterpolate=19, 
		SemiColon=20, Comma=21, Deconstructor=22, Invert=23, LeftParen=24, RightParen=25, 
		LeftBracket=26, RightBracket=27, LeftBrace=28, RightBrace=29, StartBytes=30, 
		StartMatcher=31, Quote=32, Lambda=33, StartTemplatesDefinition=34, StartSourceDefinition=35, 
		StartSinkDefinition=36, StartComposerDefinition=37, StartProcessorDefinition=38, 
		StartOperatorDefinition=39, StartStateDefinition=40, EndDefinition=41, 
		Rule=42, First=43, Last=44, TemplateMatch=45, Range=46, Plus=47, Minus=48, 
		Star=49, TruncateDivide=50, Mod=51, Question=52, Equal=53, Else=54, EndMatcher=55, 
		BeginCondition=56, StartTestDefinition=57, Assert=58, CoreSystem=59, With=60, 
		Provided=61, Modified=62, Shadowed=63, Inherited=64, From=65, StandAlone=66, 
		Use=67, Program=68, Modify=69, By=70, Collect=71, Zero=72, PositiveInteger=73, 
		START_STRING=74, STATE_IDENTIFIER=75, IDENTIFIER=76, WS=77, Comment=78, 
		REGEX_TEXT=79, END_REGEX=80, StartCharacterCode=81, StartStringInterpolate=82, 
		STRING_TEXT=83, END_STRING=84, Bytes=85, Bytes_WS=86, EndBytes=87;
	public static final int
		RULE_program = 0, RULE_inclusion = 1, RULE_statement = 2, RULE_definition = 3, 
		RULE_valueChainToSink = 4, RULE_templatesDefinition = 5, RULE_processorDefinition = 6, 
		RULE_typestateDefinition = 7, RULE_messageDefinition = 8, RULE_composerDefinition = 9, 
		RULE_testDefinition = 10, RULE_operatorDefinition = 11, RULE_dataDefinition = 12, 
		RULE_key = 13, RULE_parameterDefinitions = 14, RULE_source = 15, RULE_sourceReference = 16, 
		RULE_reference = 17, RULE_structureReference = 18, RULE_lens = 19, RULE_dimensionReference = 20, 
		RULE_simpleDimension = 21, RULE_multiValueDimension = 22, RULE_projection = 23, 
		RULE_grouping = 24, RULE_collectedValue = 25, RULE_arrayLiteral = 26, 
		RULE_valueProduction = 27, RULE_structureLiteral = 28, RULE_relationLiteral = 29, 
		RULE_bytesLiteral = 30, RULE_byteValue = 31, RULE_structures = 32, RULE_arrayExpansion = 33, 
		RULE_structureExpansion = 34, RULE_keyValue = 35, RULE_templates = 36, 
		RULE_arrayIndexDecomposition = 37, RULE_sink = 38, RULE_templatesReference = 39, 
		RULE_parameterValues = 40, RULE_parameterValue = 41, RULE_templatesBody = 42, 
		RULE_matchTemplate = 43, RULE_block = 44, RULE_blockExpression = 45, RULE_resultValue = 46, 
		RULE_blockStatement = 47, RULE_sendToTemplates = 48, RULE_stateAssignment = 49, 
		RULE_stateSink = 50, RULE_valueChain = 51, RULE_collectorChain = 52, RULE_transform = 53, 
		RULE_matcher = 54, RULE_criterion = 55, RULE_typeMatch = 56, RULE_structureContentMatcher = 57, 
		RULE_arrayContentMatcher = 58, RULE_sequenceMatch = 59, RULE_literalMatch = 60, 
		RULE_rangeBounds = 61, RULE_condition = 62, RULE_lowerBound = 63, RULE_upperBound = 64, 
		RULE_rangeLiteral = 65, RULE_integerLiteral = 66, RULE_unit = 67, RULE_measureProduct = 68, 
		RULE_measureDenominator = 69, RULE_nonZeroInteger = 70, RULE_stringLiteral = 71, 
		RULE_stringContent = 72, RULE_stringInterpolate = 73, RULE_characterCode = 74, 
		RULE_interpolateEvaluate = 75, RULE_arithmeticValue = 76, RULE_arithmeticExpression = 77, 
		RULE_termArithmeticOperation = 78, RULE_additiveOperator = 79, RULE_multiplicativeOperator = 80, 
		RULE_term = 81, RULE_operatorExpression = 82, RULE_operand = 83, RULE_composerBody = 84, 
		RULE_definedCompositionSequence = 85, RULE_compositionSequence = 86, RULE_compositionComponents = 87, 
		RULE_compositionComponent = 88, RULE_compositionMatcher = 89, RULE_structureMemberMatchers = 90, 
		RULE_structureMemberMatcher = 91, RULE_tokenMatcher = 92, RULE_compositionToken = 93, 
		RULE_literalComposition = 94, RULE_multiplier = 95, RULE_compositionSkipRule = 96, 
		RULE_compositionCapture = 97, RULE_compositionKeyValue = 98, RULE_compositionKey = 99, 
		RULE_localIdentifier = 100, RULE_stateIdentifier = 101, RULE_externalIdentifier = 102, 
		RULE_anyIdentifier = 103, RULE_arithmeticContextKeyword = 104, RULE_keyword = 105, 
		RULE_testBody = 106, RULE_testBlock = 107, RULE_assertion = 108, RULE_dependencyProvision = 109, 
		RULE_moduleConfiguration = 110, RULE_moduleIdentifier = 111, RULE_useModule = 112, 
		RULE_programModification = 113;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "inclusion", "statement", "definition", "valueChainToSink", 
			"templatesDefinition", "processorDefinition", "typestateDefinition", 
			"messageDefinition", "composerDefinition", "testDefinition", "operatorDefinition", 
			"dataDefinition", "key", "parameterDefinitions", "source", "sourceReference", 
			"reference", "structureReference", "lens", "dimensionReference", "simpleDimension", 
			"multiValueDimension", "projection", "grouping", "collectedValue", "arrayLiteral", 
			"valueProduction", "structureLiteral", "relationLiteral", "bytesLiteral", 
			"byteValue", "structures", "arrayExpansion", "structureExpansion", "keyValue", 
			"templates", "arrayIndexDecomposition", "sink", "templatesReference", 
			"parameterValues", "parameterValue", "templatesBody", "matchTemplate", 
			"block", "blockExpression", "resultValue", "blockStatement", "sendToTemplates", 
			"stateAssignment", "stateSink", "valueChain", "collectorChain", "transform", 
			"matcher", "criterion", "typeMatch", "structureContentMatcher", "arrayContentMatcher", 
			"sequenceMatch", "literalMatch", "rangeBounds", "condition", "lowerBound", 
			"upperBound", "rangeLiteral", "integerLiteral", "unit", "measureProduct", 
			"measureDenominator", "nonZeroInteger", "stringLiteral", "stringContent", 
			"stringInterpolate", "characterCode", "interpolateEvaluate", "arithmeticValue", 
			"arithmeticExpression", "termArithmeticOperation", "additiveOperator", 
			"multiplicativeOperator", "term", "operatorExpression", "operand", "composerBody", 
			"definedCompositionSequence", "compositionSequence", "compositionComponents", 
			"compositionComponent", "compositionMatcher", "structureMemberMatchers", 
			"structureMemberMatcher", "tokenMatcher", "compositionToken", "literalComposition", 
			"multiplier", "compositionSkipRule", "compositionCapture", "compositionKeyValue", 
			"compositionKey", "localIdentifier", "stateIdentifier", "externalIdentifier", 
			"anyIdentifier", "arithmeticContextKeyword", "keyword", "testBody", "testBlock", 
			"assertion", "dependencyProvision", "moduleConfiguration", "moduleIdentifier", 
			"useModule", "programModification"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'include'", "'VOID'", "'def'", "'when'", "'do'", "'otherwise'", 
			"'data'", "'->'", "'!'", "'$'", "'^'", "'\u00A7'", "'&'", "'/'", "':'", 
			null, null, null, "';'", "','", "'...'", "'~'", null, null, "'['", "']'", 
			"'{'", "'}'", "'[x'", "'<'", "'\"'", "'\\'", "'templates'", "'source'", 
			"'sink'", "'composer'", "'processor'", "'operator'", "'state'", "'end'", 
			"'rule'", "'first'", "'last'", "'#'", "'..'", "'+'", "'-'", "'*'", "'~/'", 
			"'mod'", "'?'", "'='", "'|'", "'>'", null, "'test'", "'assert'", "'core-system/'", 
			"'with'", "'provided'", "'modified'", "'shadowed'", "'inherited'", "'from'", 
			"'stand-alone'", "'use'", "'program'", "'modify'", "'by'", "'collect'", 
			"'0'", null, null, null, null, null, null, null, "'''", null, null, null, 
			null, null, null, "'x]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Include", "Void", "Def", "When", "Do", "Otherwise", 
			"DataDefinition", "To", "ResultMarker", "SourceMarker", "DeleteMarker", 
			"Reflexive", "And", "Slash", "Colon", "Message", "FieldReference", "EndStringInterpolate", 
			"SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "StartBytes", 
			"StartMatcher", "Quote", "Lambda", "StartTemplatesDefinition", "StartSourceDefinition", 
			"StartSinkDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"StartOperatorDefinition", "StartStateDefinition", "EndDefinition", "Rule", 
			"First", "Last", "TemplateMatch", "Range", "Plus", "Minus", "Star", "TruncateDivide", 
			"Mod", "Question", "Equal", "Else", "EndMatcher", "BeginCondition", "StartTestDefinition", 
			"Assert", "CoreSystem", "With", "Provided", "Modified", "Shadowed", "Inherited", 
			"From", "StandAlone", "Use", "Program", "Modify", "By", "Collect", "Zero", 
			"PositiveInteger", "START_STRING", "STATE_IDENTIFIER", "IDENTIFIER", 
			"WS", "Comment", "REGEX_TEXT", "END_REGEX", "StartCharacterCode", "StartStringInterpolate", 
			"STRING_TEXT", "END_STRING", "Bytes", "Bytes_WS", "EndBytes"
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
		public List<UseModuleContext> useModule() {
			return getRuleContexts(UseModuleContext.class);
		}
		public UseModuleContext useModule(int i) {
			return getRuleContext(UseModuleContext.class,i);
		}
		public List<InclusionContext> inclusion() {
			return getRuleContexts(InclusionContext.class);
		}
		public InclusionContext inclusion(int i) {
			return getRuleContext(InclusionContext.class,i);
		}
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
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Use) {
				{
				{
				setState(228);
				useModule();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Include) {
				{
				{
				setState(234);
				inclusion();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			statement();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << StartTestDefinition))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Zero - 72)) | (1L << (PositiveInteger - 72)) | (1L << (START_STRING - 72)))) != 0)) {
				{
				{
				setState(241);
				statement();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
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

	public static class InclusionContext extends ParserRuleContext {
		public TerminalNode Include() { return getToken(TailspinParser.Include, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public TerminalNode From() { return getToken(TailspinParser.From, 0); }
		public InclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitInclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusionContext inclusion() throws RecognitionException {
		InclusionContext _localctx = new InclusionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inclusion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(Include);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (From - 65)) | (1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (By - 65)) | (1L << (Collect - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(250);
				localIdentifier();
				setState(251);
				match(From);
				}
			}

			setState(255);
			stringLiteral();
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
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public ValueChainToSinkContext valueChainToSink() {
			return getRuleContext(ValueChainToSinkContext.class,0);
		}
		public TemplatesDefinitionContext templatesDefinition() {
			return getRuleContext(TemplatesDefinitionContext.class,0);
		}
		public ProcessorDefinitionContext processorDefinition() {
			return getRuleContext(ProcessorDefinitionContext.class,0);
		}
		public ComposerDefinitionContext composerDefinition() {
			return getRuleContext(ComposerDefinitionContext.class,0);
		}
		public TestDefinitionContext testDefinition() {
			return getRuleContext(TestDefinitionContext.class,0);
		}
		public OperatorDefinitionContext operatorDefinition() {
			return getRuleContext(OperatorDefinitionContext.class,0);
		}
		public DataDefinitionContext dataDefinition() {
			return getRuleContext(DataDefinitionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				definition();
				}
				break;
			case SourceMarker:
			case DeleteMarker:
			case Reflexive:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case StartBytes:
			case First:
			case Last:
			case Range:
			case Plus:
			case Minus:
			case Zero:
			case PositiveInteger:
			case START_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				valueChainToSink();
				}
				break;
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				templatesDefinition();
				}
				break;
			case StartProcessorDefinition:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				processorDefinition();
				}
				break;
			case StartComposerDefinition:
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				composerDefinition();
				}
				break;
			case StartTestDefinition:
				enterOuterAlt(_localctx, 6);
				{
				setState(262);
				testDefinition();
				}
				break;
			case StartOperatorDefinition:
				enterOuterAlt(_localctx, 7);
				{
				setState(263);
				operatorDefinition();
				}
				break;
			case DataDefinition:
				enterOuterAlt(_localctx, 8);
				{
				setState(264);
				dataDefinition();
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

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode Def() { return getToken(TailspinParser.Def, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TailspinParser.SemiColon, 0); }
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(Def);
			setState(268);
			key();
			setState(269);
			valueProduction();
			setState(270);
			match(SemiColon);
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

	public static class ValueChainToSinkContext extends ParserRuleContext {
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public SinkContext sink() {
			return getRuleContext(SinkContext.class,0);
		}
		public ValueChainToSinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueChainToSink; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitValueChainToSink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueChainToSinkContext valueChainToSink() throws RecognitionException {
		ValueChainToSinkContext _localctx = new ValueChainToSinkContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valueChainToSink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			valueChain();
			setState(273);
			match(To);
			setState(274);
			sink();
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

	public static class TemplatesDefinitionContext extends ParserRuleContext {
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public TerminalNode StartTemplatesDefinition() { return getToken(TailspinParser.StartTemplatesDefinition, 0); }
		public TerminalNode StartSinkDefinition() { return getToken(TailspinParser.StartSinkDefinition, 0); }
		public TerminalNode StartSourceDefinition() { return getToken(TailspinParser.StartSourceDefinition, 0); }
		public ParameterDefinitionsContext parameterDefinitions() {
			return getRuleContext(ParameterDefinitionsContext.class,0);
		}
		public TemplatesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatesDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTemplatesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatesDefinitionContext templatesDefinition() throws RecognitionException {
		TemplatesDefinitionContext _localctx = new TemplatesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_templatesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(277);
			localIdentifier();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(278);
				parameterDefinitions();
				}
			}

			setState(281);
			templatesBody();
			setState(282);
			match(EndDefinition);
			setState(283);
			localIdentifier();
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

	public static class ProcessorDefinitionContext extends ParserRuleContext {
		public TerminalNode StartProcessorDefinition() { return getToken(TailspinParser.StartProcessorDefinition, 0); }
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public ParameterDefinitionsContext parameterDefinitions() {
			return getRuleContext(ParameterDefinitionsContext.class,0);
		}
		public List<TypestateDefinitionContext> typestateDefinition() {
			return getRuleContexts(TypestateDefinitionContext.class);
		}
		public TypestateDefinitionContext typestateDefinition(int i) {
			return getRuleContext(TypestateDefinitionContext.class,i);
		}
		public ProcessorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processorDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitProcessorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessorDefinitionContext processorDefinition() throws RecognitionException {
		ProcessorDefinitionContext _localctx = new ProcessorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_processorDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(StartProcessorDefinition);
			setState(286);
			localIdentifier();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(287);
				parameterDefinitions();
				}
			}

			setState(290);
			block();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==StartStateDefinition) {
				{
				{
				setState(291);
				typestateDefinition();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(EndDefinition);
			setState(298);
			localIdentifier();
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

	public static class TypestateDefinitionContext extends ParserRuleContext {
		public TerminalNode StartStateDefinition() { return getToken(TailspinParser.StartStateDefinition, 0); }
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public List<MessageDefinitionContext> messageDefinition() {
			return getRuleContexts(MessageDefinitionContext.class);
		}
		public MessageDefinitionContext messageDefinition(int i) {
			return getRuleContext(MessageDefinitionContext.class,i);
		}
		public TypestateDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typestateDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTypestateDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypestateDefinitionContext typestateDefinition() throws RecognitionException {
		TypestateDefinitionContext _localctx = new TypestateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typestateDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(StartStateDefinition);
			setState(301);
			localIdentifier();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition))) != 0)) {
				{
				{
				setState(302);
				messageDefinition();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			match(EndDefinition);
			setState(309);
			localIdentifier();
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

	public static class MessageDefinitionContext extends ParserRuleContext {
		public TemplatesDefinitionContext templatesDefinition() {
			return getRuleContext(TemplatesDefinitionContext.class,0);
		}
		public ProcessorDefinitionContext processorDefinition() {
			return getRuleContext(ProcessorDefinitionContext.class,0);
		}
		public ComposerDefinitionContext composerDefinition() {
			return getRuleContext(ComposerDefinitionContext.class,0);
		}
		public OperatorDefinitionContext operatorDefinition() {
			return getRuleContext(OperatorDefinitionContext.class,0);
		}
		public MessageDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMessageDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageDefinitionContext messageDefinition() throws RecognitionException {
		MessageDefinitionContext _localctx = new MessageDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_messageDefinition);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				templatesDefinition();
				}
				break;
			case StartProcessorDefinition:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				processorDefinition();
				}
				break;
			case StartComposerDefinition:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				composerDefinition();
				}
				break;
			case StartOperatorDefinition:
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				operatorDefinition();
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

	public static class ComposerDefinitionContext extends ParserRuleContext {
		public TerminalNode StartComposerDefinition() { return getToken(TailspinParser.StartComposerDefinition, 0); }
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public ComposerBodyContext composerBody() {
			return getRuleContext(ComposerBodyContext.class,0);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public ParameterDefinitionsContext parameterDefinitions() {
			return getRuleContext(ParameterDefinitionsContext.class,0);
		}
		public ComposerDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composerDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitComposerDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComposerDefinitionContext composerDefinition() throws RecognitionException {
		ComposerDefinitionContext _localctx = new ComposerDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_composerDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(StartComposerDefinition);
			setState(318);
			localIdentifier();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(319);
				parameterDefinitions();
				}
			}

			setState(322);
			composerBody();
			setState(323);
			match(EndDefinition);
			setState(324);
			localIdentifier();
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

	public static class TestDefinitionContext extends ParserRuleContext {
		public TerminalNode StartTestDefinition() { return getToken(TailspinParser.StartTestDefinition, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TestBodyContext testBody() {
			return getRuleContext(TestBodyContext.class,0);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public List<UseModuleContext> useModule() {
			return getRuleContexts(UseModuleContext.class);
		}
		public UseModuleContext useModule(int i) {
			return getRuleContext(UseModuleContext.class,i);
		}
		public ProgramModificationContext programModification() {
			return getRuleContext(ProgramModificationContext.class,0);
		}
		public TestDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTestDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestDefinitionContext testDefinition() throws RecognitionException {
		TestDefinitionContext _localctx = new TestDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_testDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(StartTestDefinition);
			setState(327);
			stringLiteral();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Use) {
				{
				{
				setState(328);
				useModule();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Modify) {
				{
				setState(334);
				programModification();
				}
			}

			setState(337);
			testBody();
			setState(338);
			match(EndDefinition);
			setState(339);
			stringLiteral();
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

	public static class OperatorDefinitionContext extends ParserRuleContext {
		public TerminalNode StartOperatorDefinition() { return getToken(TailspinParser.StartOperatorDefinition, 0); }
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public ParameterDefinitionsContext parameterDefinitions() {
			return getRuleContext(ParameterDefinitionsContext.class,0);
		}
		public OperatorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitOperatorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorDefinitionContext operatorDefinition() throws RecognitionException {
		OperatorDefinitionContext _localctx = new OperatorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operatorDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(StartOperatorDefinition);
			setState(342);
			match(LeftParen);
			setState(343);
			localIdentifier();
			setState(344);
			localIdentifier();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(345);
				parameterDefinitions();
				}
			}

			setState(348);
			localIdentifier();
			setState(349);
			match(RightParen);
			setState(350);
			templatesBody();
			setState(351);
			match(EndDefinition);
			setState(352);
			localIdentifier();
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

	public static class DataDefinitionContext extends ParserRuleContext {
		public TerminalNode DataDefinition() { return getToken(TailspinParser.DataDefinition, 0); }
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public DataDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDataDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDefinitionContext dataDefinition() throws RecognitionException {
		DataDefinitionContext _localctx = new DataDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dataDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(DataDefinition);
			setState(355);
			localIdentifier();
			setState(356);
			matcher();
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

	public static class KeyContext extends ParserRuleContext {
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			localIdentifier();
			setState(359);
			match(Colon);
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

	public static class ParameterDefinitionsContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(TailspinParser.And, 0); }
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public ParameterDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDefinitions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitParameterDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDefinitionsContext parameterDefinitions() throws RecognitionException {
		ParameterDefinitionsContext _localctx = new ParameterDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameterDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(And);
			setState(362);
			match(LeftBrace);
			setState(367); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(363);
				key();
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(364);
					match(Comma);
					}
				}

				}
				}
				setState(369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (From - 65)) | (1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (By - 65)) | (1L << (Collect - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
			setState(371);
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

	public static class SourceContext extends ParserRuleContext {
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public RangeLiteralContext rangeLiteral() {
			return getRuleContext(RangeLiteralContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public RelationLiteralContext relationLiteral() {
			return getRuleContext(RelationLiteralContext.class,0);
		}
		public StructureLiteralContext structureLiteral() {
			return getRuleContext(StructureLiteralContext.class,0);
		}
		public BytesLiteralContext bytesLiteral() {
			return getRuleContext(BytesLiteralContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public KeyValueContext keyValue() {
			return getRuleContext(KeyValueContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public ArithmeticValueContext arithmeticValue() {
			return getRuleContext(ArithmeticValueContext.class,0);
		}
		public OperatorExpressionContext operatorExpression() {
			return getRuleContext(OperatorExpressionContext.class,0);
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
		enterRule(_localctx, 30, RULE_source);
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				sourceReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				stringLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				rangeLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				arrayLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(377);
				relationLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(378);
				structureLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(379);
				bytesLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(380);
				match(LeftParen);
				setState(381);
				keyValue();
				setState(382);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(384);
				arithmeticValue();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(385);
				operatorExpression();
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

	public static class SourceReferenceContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode SourceMarker() { return getToken(TailspinParser.SourceMarker, 0); }
		public TerminalNode Reflexive() { return getToken(TailspinParser.Reflexive, 0); }
		public TerminalNode Message() { return getToken(TailspinParser.Message, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public AnyIdentifierContext anyIdentifier() {
			return getRuleContext(AnyIdentifierContext.class,0);
		}
		public TerminalNode DeleteMarker() { return getToken(TailspinParser.DeleteMarker, 0); }
		public StateIdentifierContext stateIdentifier() {
			return getRuleContext(StateIdentifierContext.class,0);
		}
		public SourceReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitSourceReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceReferenceContext sourceReference() throws RecognitionException {
		SourceReferenceContext _localctx = new SourceReferenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sourceReference);
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
			case Reflexive:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SourceMarker:
					{
					setState(388);
					match(SourceMarker);
					setState(390);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(389);
						anyIdentifier();
						}
						break;
					}
					}
					break;
				case Reflexive:
					{
					setState(392);
					match(Reflexive);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(395);
				reference();
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(396);
					match(Message);
					}
					break;
				}
				setState(400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(399);
					parameterValues();
					}
					break;
				}
				}
				break;
			case DeleteMarker:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(DeleteMarker);
				setState(403);
				stateIdentifier();
				setState(404);
				reference();
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

	public static class ReferenceContext extends ParserRuleContext {
		public LensContext lens() {
			return getRuleContext(LensContext.class,0);
		}
		public List<StructureReferenceContext> structureReference() {
			return getRuleContexts(StructureReferenceContext.class);
		}
		public StructureReferenceContext structureReference(int i) {
			return getRuleContext(StructureReferenceContext.class,i);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_reference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(408);
				lens();
				}
				break;
			}
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(411);
					structureReference();
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class StructureReferenceContext extends ParserRuleContext {
		public TerminalNode FieldReference() { return getToken(TailspinParser.FieldReference, 0); }
		public LensContext lens() {
			return getRuleContext(LensContext.class,0);
		}
		public StructureReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureReferenceContext structureReference() throws RecognitionException {
		StructureReferenceContext _localctx = new StructureReferenceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_structureReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(FieldReference);
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(418);
				lens();
				}
				break;
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

	public static class LensContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public List<DimensionReferenceContext> dimensionReference() {
			return getRuleContexts(DimensionReferenceContext.class);
		}
		public DimensionReferenceContext dimensionReference(int i) {
			return getRuleContext(DimensionReferenceContext.class,i);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(TailspinParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(TailspinParser.SemiColon, i);
		}
		public LensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lens; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LensContext lens() throws RecognitionException {
		LensContext _localctx = new LensContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(LeftParen);
			setState(422);
			dimensionReference();
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(423);
				match(SemiColon);
				setState(424);
				dimensionReference();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
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

	public static class DimensionReferenceContext extends ParserRuleContext {
		public SimpleDimensionContext simpleDimension() {
			return getRuleContext(SimpleDimensionContext.class,0);
		}
		public MultiValueDimensionContext multiValueDimension() {
			return getRuleContext(MultiValueDimensionContext.class,0);
		}
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public GroupingContext grouping() {
			return getRuleContext(GroupingContext.class,0);
		}
		public DimensionReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDimensionReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionReferenceContext dimensionReference() throws RecognitionException {
		DimensionReferenceContext _localctx = new DimensionReferenceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dimensionReference);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				simpleDimension();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				multiValueDimension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				projection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				key();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(436);
				localIdentifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(437);
				grouping();
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

	public static class SimpleDimensionContext extends ParserRuleContext {
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public ArithmeticValueContext arithmeticValue() {
			return getRuleContext(ArithmeticValueContext.class,0);
		}
		public RangeLiteralContext rangeLiteral() {
			return getRuleContext(RangeLiteralContext.class,0);
		}
		public SimpleDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDimension; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitSimpleDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDimensionContext simpleDimension() throws RecognitionException {
		SimpleDimensionContext _localctx = new SimpleDimensionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_simpleDimension);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				sourceReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				arithmeticValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				rangeLiteral();
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

	public static class MultiValueDimensionContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public List<SimpleDimensionContext> simpleDimension() {
			return getRuleContexts(SimpleDimensionContext.class);
		}
		public SimpleDimensionContext simpleDimension(int i) {
			return getRuleContext(SimpleDimensionContext.class,i);
		}
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public MultiValueDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiValueDimension; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMultiValueDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiValueDimensionContext multiValueDimension() throws RecognitionException {
		MultiValueDimensionContext _localctx = new MultiValueDimensionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_multiValueDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(LeftBracket);
			setState(446);
			simpleDimension();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(447);
				match(Comma);
				setState(448);
				simpleDimension();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
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

	public static class ProjectionContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
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
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_projection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(LeftBrace);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (From - 65)) | (1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (By - 65)) | (1L << (Collect - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(457);
					key();
					}
					break;
				case 2:
					{
					setState(458);
					keyValue();
					}
					break;
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(461);
					match(Comma);
					setState(464);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(462);
						key();
						}
						break;
					case 2:
						{
						setState(463);
						keyValue();
						}
						break;
					}
					}
					}
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(473);
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

	public static class GroupingContext extends ParserRuleContext {
		public TerminalNode Collect() { return getToken(TailspinParser.Collect, 0); }
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public List<CollectedValueContext> collectedValue() {
			return getRuleContexts(CollectedValueContext.class);
		}
		public CollectedValueContext collectedValue(int i) {
			return getRuleContext(CollectedValueContext.class,i);
		}
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public TerminalNode By() { return getToken(TailspinParser.By, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public GroupingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitGrouping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingContext grouping() throws RecognitionException {
		GroupingContext _localctx = new GroupingContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_grouping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(Collect);
			setState(476);
			match(LeftBrace);
			setState(477);
			collectedValue();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(478);
				match(Comma);
				setState(479);
				collectedValue();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
			match(RightBrace);
			setState(486);
			match(By);
			setState(487);
			source();
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

	public static class CollectedValueContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TemplatesReferenceContext templatesReference() {
			return getRuleContext(TemplatesReferenceContext.class,0);
		}
		public CollectedValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectedValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCollectedValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectedValueContext collectedValue() throws RecognitionException {
		CollectedValueContext _localctx = new CollectedValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_collectedValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			key();
			setState(490);
			templatesReference();
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
		public List<ArrayExpansionContext> arrayExpansion() {
			return getRuleContexts(ArrayExpansionContext.class);
		}
		public ArrayExpansionContext arrayExpansion(int i) {
			return getRuleContext(ArrayExpansionContext.class,i);
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
		enterRule(_localctx, 52, RULE_arrayLiteral);
		int _la;
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				match(LeftBracket);
				setState(493);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(LeftBracket);
				setState(495);
				arrayExpansion();
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(496);
					match(Comma);
					setState(497);
					arrayExpansion();
					}
					}
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(503);
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

	public static class ValueProductionContext extends ParserRuleContext {
		public SendToTemplatesContext sendToTemplates() {
			return getRuleContext(SendToTemplatesContext.class,0);
		}
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public ValueProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueProduction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitValueProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueProductionContext valueProduction() throws RecognitionException {
		ValueProductionContext _localctx = new ValueProductionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_valueProduction);
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				sendToTemplates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				valueChain();
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
		public List<StructureExpansionContext> structureExpansion() {
			return getRuleContexts(StructureExpansionContext.class);
		}
		public StructureExpansionContext structureExpansion(int i) {
			return getRuleContext(StructureExpansionContext.class,i);
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
		enterRule(_localctx, 56, RULE_structureLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(LeftBrace);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (From - 65)) | (1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (By - 65)) | (1L << (Collect - 65)) | (1L << (Zero - 65)) | (1L << (PositiveInteger - 65)) | (1L << (START_STRING - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(512);
				structureExpansion();
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(513);
					match(Comma);
					setState(514);
					structureExpansion();
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(522);
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

	public static class RelationLiteralContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public List<TerminalNode> Else() { return getTokens(TailspinParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(TailspinParser.Else, i);
		}
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public List<StructuresContext> structures() {
			return getRuleContexts(StructuresContext.class);
		}
		public StructuresContext structures(int i) {
			return getRuleContext(StructuresContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public RelationLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitRelationLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationLiteralContext relationLiteral() throws RecognitionException {
		RelationLiteralContext _localctx = new RelationLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relationLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(LeftBrace);
			setState(525);
			match(Else);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SourceMarker - 11)) | (1L << (DeleteMarker - 11)) | (1L << (Reflexive - 11)) | (1L << (LeftParen - 11)) | (1L << (LeftBracket - 11)) | (1L << (LeftBrace - 11)) | (1L << (StartBytes - 11)) | (1L << (First - 11)) | (1L << (Last - 11)) | (1L << (Range - 11)) | (1L << (Plus - 11)) | (1L << (Minus - 11)) | (1L << (Zero - 11)) | (1L << (PositiveInteger - 11)) | (1L << (START_STRING - 11)))) != 0)) {
				{
				setState(526);
				structures();
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(527);
					match(Comma);
					setState(528);
					structures();
					}
					}
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(536);
			match(Else);
			setState(537);
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

	public static class BytesLiteralContext extends ParserRuleContext {
		public TerminalNode StartBytes() { return getToken(TailspinParser.StartBytes, 0); }
		public List<ByteValueContext> byteValue() {
			return getRuleContexts(ByteValueContext.class);
		}
		public ByteValueContext byteValue(int i) {
			return getRuleContext(ByteValueContext.class,i);
		}
		public TerminalNode EndBytes() { return getToken(TailspinParser.EndBytes, 0); }
		public BytesLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bytesLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitBytesLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BytesLiteralContext bytesLiteral() throws RecognitionException {
		BytesLiteralContext _localctx = new BytesLiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bytesLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(StartBytes);
			setState(540);
			byteValue();
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen || _la==Bytes) {
				{
				{
				setState(541);
				byteValue();
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
			match(EndBytes);
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

	public static class ByteValueContext extends ParserRuleContext {
		public TerminalNode Bytes() { return getToken(TailspinParser.Bytes, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ByteValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byteValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitByteValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ByteValueContext byteValue() throws RecognitionException {
		ByteValueContext _localctx = new ByteValueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_byteValue);
		try {
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bytes:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(Bytes);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				term();
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

	public static class StructuresContext extends ParserRuleContext {
		public StructureLiteralContext structureLiteral() {
			return getRuleContext(StructureLiteralContext.class,0);
		}
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public StructuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structures; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuresContext structures() throws RecognitionException {
		StructuresContext _localctx = new StructuresContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_structures);
		try {
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				structureLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				valueProduction();
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

	public static class ArrayExpansionContext extends ParserRuleContext {
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public TerminalNode By() { return getToken(TailspinParser.By, 0); }
		public ArrayExpansionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpansion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayExpansion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpansionContext arrayExpansion() throws RecognitionException {
		ArrayExpansionContext _localctx = new ArrayExpansionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayExpansion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==By) {
				{
				setState(557);
				match(By);
				}
			}

			setState(560);
			valueProduction();
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

	public static class StructureExpansionContext extends ParserRuleContext {
		public KeyValueContext keyValue() {
			return getRuleContext(KeyValueContext.class,0);
		}
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public TerminalNode By() { return getToken(TailspinParser.By, 0); }
		public StructureExpansionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureExpansion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureExpansion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureExpansionContext structureExpansion() throws RecognitionException {
		StructureExpansionContext _localctx = new StructureExpansionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_structureExpansion);
		int _la;
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				keyValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==By) {
					{
					setState(563);
					match(By);
					}
				}

				setState(566);
				valueProduction();
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

	public static class KeyValueContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
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
		enterRule(_localctx, 70, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			key();
			setState(570);
			valueProduction();
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
		public TemplatesReferenceContext templatesReference() {
			return getRuleContext(TemplatesReferenceContext.class,0);
		}
		public CallDefinedTransformContext(TemplatesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCallDefinedTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaArrayTemplatesContext extends TemplatesContext {
		public List<TerminalNode> Lambda() { return getTokens(TailspinParser.Lambda); }
		public TerminalNode Lambda(int i) {
			return getToken(TailspinParser.Lambda, i);
		}
		public ArrayIndexDecompositionContext arrayIndexDecomposition() {
			return getRuleContext(ArrayIndexDecompositionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public LambdaArrayTemplatesContext(TemplatesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLambdaArrayTemplates(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaTemplatesContext extends TemplatesContext {
		public List<TerminalNode> Lambda() { return getTokens(TailspinParser.Lambda); }
		public TerminalNode Lambda(int i) {
			return getToken(TailspinParser.Lambda, i);
		}
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public LambdaTemplatesContext(TemplatesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLambdaTemplates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatesContext templates() throws RecognitionException {
		TemplatesContext _localctx = new TemplatesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_templates);
		int _la;
		try {
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new CallDefinedTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				templatesReference();
				}
				break;
			case 2:
				_localctx = new LiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				source();
				}
				break;
			case 3:
				_localctx = new LambdaTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				match(Lambda);
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (From - 65)) | (1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (By - 65)) | (1L << (Collect - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(575);
					localIdentifier();
					}
				}

				setState(578);
				match(LeftParen);
				setState(579);
				templatesBody();
				setState(580);
				match(Lambda);
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (From - 65)) | (1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (By - 65)) | (1L << (Collect - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(581);
					localIdentifier();
					}
				}

				setState(584);
				match(RightParen);
				}
				break;
			case 4:
				_localctx = new LambdaArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(586);
				match(Lambda);
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (From - 65)) | (1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (By - 65)) | (1L << (Collect - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(587);
					localIdentifier();
					}
				}

				setState(590);
				arrayIndexDecomposition();
				setState(591);
				match(LeftParen);
				setState(592);
				templatesBody();
				setState(593);
				match(Lambda);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (From - 65)) | (1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (By - 65)) | (1L << (Collect - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(594);
					localIdentifier();
					}
				}

				setState(597);
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

	public static class ArrayIndexDecompositionContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(TailspinParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(TailspinParser.SemiColon, i);
		}
		public ArrayIndexDecompositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndexDecomposition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayIndexDecomposition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexDecompositionContext arrayIndexDecomposition() throws RecognitionException {
		ArrayIndexDecompositionContext _localctx = new ArrayIndexDecompositionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arrayIndexDecomposition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(LeftBracket);
			setState(602);
			localIdentifier();
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(603);
				match(SemiColon);
				setState(604);
				localIdentifier();
				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(610);
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

	public static class SinkContext extends ParserRuleContext {
		public TerminalNode ResultMarker() { return getToken(TailspinParser.ResultMarker, 0); }
		public TerminalNode Void() { return getToken(TailspinParser.Void, 0); }
		public AnyIdentifierContext anyIdentifier() {
			return getRuleContext(AnyIdentifierContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode Message() { return getToken(TailspinParser.Message, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
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
		enterRule(_localctx, 76, RULE_sink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(ResultMarker);
			setState(622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case DataDefinition:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case StartStateDefinition:
			case EndDefinition:
			case Rule:
			case First:
			case Last:
			case Mod:
			case StartTestDefinition:
			case Assert:
			case With:
			case Provided:
			case Modified:
			case Shadowed:
			case From:
			case Use:
			case Program:
			case Modify:
			case By:
			case Collect:
			case STATE_IDENTIFIER:
			case IDENTIFIER:
				{
				{
				setState(613);
				anyIdentifier();
				setState(614);
				reference();
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(615);
					match(Message);
					}
				}

				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(618);
					parameterValues();
					}
				}

				}
				}
				break;
			case Void:
				{
				setState(621);
				match(Void);
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

	public static class TemplatesReferenceContext extends ParserRuleContext {
		public AnyIdentifierContext anyIdentifier() {
			return getRuleContext(AnyIdentifierContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode Message() { return getToken(TailspinParser.Message, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public TemplatesReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatesReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTemplatesReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatesReferenceContext templatesReference() throws RecognitionException {
		TemplatesReferenceContext _localctx = new TemplatesReferenceContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_templatesReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			anyIdentifier();
			setState(625);
			reference();
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Message) {
				{
				setState(626);
				match(Message);
				}
			}

			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(629);
				parameterValues();
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

	public static class ParameterValuesContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(TailspinParser.And, 0); }
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public List<ParameterValueContext> parameterValue() {
			return getRuleContexts(ParameterValueContext.class);
		}
		public ParameterValueContext parameterValue(int i) {
			return getRuleContext(ParameterValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public ParameterValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterValues; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitParameterValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterValuesContext parameterValues() throws RecognitionException {
		ParameterValuesContext _localctx = new ParameterValuesContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parameterValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(And);
			setState(633);
			match(LeftBrace);
			setState(638); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(634);
				parameterValue();
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(635);
					match(Comma);
					}
				}

				}
				}
				setState(640); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (From - 65)) | (1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (By - 65)) | (1L << (Collect - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
			setState(642);
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

	public static class ParameterValueContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TemplatesReferenceContext templatesReference() {
			return getRuleContext(TemplatesReferenceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public LensContext lens() {
			return getRuleContext(LensContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public ParameterValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitParameterValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterValueContext parameterValue() throws RecognitionException {
		ParameterValueContext _localctx = new ParameterValueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parameterValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			key();
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(645);
				valueChain();
				}
				break;
			case 2:
				{
				setState(646);
				templatesReference();
				}
				break;
			case 3:
				{
				setState(652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(647);
					match(Colon);
					setState(648);
					lens();
					}
					break;
				case 2:
					{
					setState(649);
					match(Colon);
					setState(650);
					match(LeftParen);
					setState(651);
					match(RightParen);
					}
					break;
				}
				}
				break;
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
		enterRule(_localctx, 84, RULE_templatesBody);
		int _la;
		try {
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
			case DataDefinition:
			case ResultMarker:
			case SourceMarker:
			case DeleteMarker:
			case Reflexive:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case StartBytes:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case First:
			case Last:
			case Range:
			case Plus:
			case Minus:
			case StartTestDefinition:
			case Zero:
			case PositiveInteger:
			case START_STRING:
			case STATE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				block();
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << When) | (1L << Otherwise) | (1L << StartMatcher))) != 0)) {
					{
					{
					setState(657);
					matchTemplate();
					}
					}
					setState(662);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case When:
			case Otherwise:
			case StartMatcher:
				enterOuterAlt(_localctx, 2);
				{
				setState(664); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(663);
					matchTemplate();
					}
					}
					setState(666); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << When) | (1L << Otherwise) | (1L << StartMatcher))) != 0) );
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
		public TerminalNode When() { return getToken(TailspinParser.When, 0); }
		public TerminalNode Do() { return getToken(TailspinParser.Do, 0); }
		public TerminalNode Otherwise() { return getToken(TailspinParser.Otherwise, 0); }
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
		enterRule(_localctx, 86, RULE_matchTemplate);
		int _la;
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				matcher();
				setState(671);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==When) {
					{
					setState(673);
					match(When);
					}
				}

				setState(676);
				matcher();
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Do) {
					{
					setState(677);
					match(Do);
					}
				}

				setState(680);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				match(Otherwise);
				setState(683);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode ResultMarker() { return getToken(TailspinParser.ResultMarker, 0); }
		public TerminalNode Void() { return getToken(TailspinParser.Void, 0); }
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
		enterRule(_localctx, 88, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
			case DataDefinition:
			case SourceMarker:
			case DeleteMarker:
			case Reflexive:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case StartBytes:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case First:
			case Last:
			case Range:
			case Plus:
			case Minus:
			case StartTestDefinition:
			case Zero:
			case PositiveInteger:
			case START_STRING:
			case STATE_IDENTIFIER:
				{
				setState(687); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(686);
					blockExpression();
					}
					}
					setState(689); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << StartTestDefinition))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Zero - 72)) | (1L << (PositiveInteger - 72)) | (1L << (START_STRING - 72)) | (1L << (STATE_IDENTIFIER - 72)))) != 0) );
				}
				break;
			case ResultMarker:
				{
				{
				setState(691);
				match(ResultMarker);
				setState(692);
				match(Void);
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

	public static class BlockExpressionContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public StateAssignmentContext stateAssignment() {
			return getRuleContext(StateAssignmentContext.class,0);
		}
		public SendToTemplatesContext sendToTemplates() {
			return getRuleContext(SendToTemplatesContext.class,0);
		}
		public ResultValueContext resultValue() {
			return getRuleContext(ResultValueContext.class,0);
		}
		public BlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockExpressionContext blockExpression() throws RecognitionException {
		BlockExpressionContext _localctx = new BlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_blockExpression);
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				stateAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
				sendToTemplates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(698);
				resultValue();
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

	public static class ResultValueContext extends ParserRuleContext {
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode ResultMarker() { return getToken(TailspinParser.ResultMarker, 0); }
		public ResultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitResultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultValueContext resultValue() throws RecognitionException {
		ResultValueContext _localctx = new ResultValueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_resultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			valueChain();
			setState(702);
			match(ResultMarker);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			statement();
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

	public static class SendToTemplatesContext extends ParserRuleContext {
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public TerminalNode TemplateMatch() { return getToken(TailspinParser.TemplateMatch, 0); }
		public SendToTemplatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendToTemplates; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitSendToTemplates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SendToTemplatesContext sendToTemplates() throws RecognitionException {
		SendToTemplatesContext _localctx = new SendToTemplatesContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_sendToTemplates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			valueChain();
			setState(707);
			match(To);
			setState(708);
			match(TemplateMatch);
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

	public static class StateAssignmentContext extends ParserRuleContext {
		public StateSinkContext stateSink() {
			return getRuleContext(StateSinkContext.class,0);
		}
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public StateAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStateAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateAssignmentContext stateAssignment() throws RecognitionException {
		StateAssignmentContext _localctx = new StateAssignmentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_stateAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(710);
				valueChain();
				setState(711);
				match(To);
				}
				break;
			}
			setState(715);
			stateSink();
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

	public static class StateSinkContext extends ParserRuleContext {
		public StateIdentifierContext stateIdentifier() {
			return getRuleContext(StateIdentifierContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TailspinParser.SemiColon, 0); }
		public TerminalNode Range() { return getToken(TailspinParser.Range, 0); }
		public TerminalNode Else() { return getToken(TailspinParser.Else, 0); }
		public StateSinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateSink; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStateSink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateSinkContext stateSink() throws RecognitionException {
		StateSinkContext _localctx = new StateSinkContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_stateSink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Range) {
				{
				setState(717);
				match(Range);
				setState(718);
				match(Else);
				}
			}

			setState(721);
			stateIdentifier();
			setState(722);
			reference();
			setState(723);
			match(Colon);
			setState(724);
			valueProduction();
			setState(725);
			match(SemiColon);
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
		enterRule(_localctx, 102, RULE_valueChain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			source();
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(728);
				transform();
				}
				break;
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

	public static class CollectorChainContext extends ParserRuleContext {
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public TerminalNode Range() { return getToken(TailspinParser.Range, 0); }
		public TerminalNode Equal() { return getToken(TailspinParser.Equal, 0); }
		public TemplatesReferenceContext templatesReference() {
			return getRuleContext(TemplatesReferenceContext.class,0);
		}
		public CollectorChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectorChain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCollectorChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectorChainContext collectorChain() throws RecognitionException {
		CollectorChainContext _localctx = new CollectorChainContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_collectorChain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(To);
			setState(732);
			match(Range);
			setState(733);
			match(Equal);
			setState(734);
			templatesReference();
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
		public CollectorChainContext collectorChain() {
			return getRuleContext(CollectorChainContext.class,0);
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
		enterRule(_localctx, 106, RULE_transform);
		try {
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				match(To);
				setState(737);
				templates();
				setState(739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(738);
					transform();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				match(Deconstructor);
				setState(743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(742);
					transform();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(745);
				collectorChain();
				setState(747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(746);
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

	public static class MatcherContext extends ParserRuleContext {
		public TerminalNode StartMatcher() { return getToken(TailspinParser.StartMatcher, 0); }
		public TerminalNode EndMatcher() { return getToken(TailspinParser.EndMatcher, 0); }
		public List<CriterionContext> criterion() {
			return getRuleContexts(CriterionContext.class);
		}
		public CriterionContext criterion(int i) {
			return getRuleContext(CriterionContext.class,i);
		}
		public TerminalNode Invert() { return getToken(TailspinParser.Invert, 0); }
		public List<TerminalNode> Else() { return getTokens(TailspinParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(TailspinParser.Else, i);
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
		enterRule(_localctx, 108, RULE_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(StartMatcher);
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << Invert) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Quote) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << Equal) | (1L << BeginCondition) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (From - 65)) | (1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (By - 65)) | (1L << (Collect - 65)) | (1L << (Zero - 65)) | (1L << (PositiveInteger - 65)) | (1L << (START_STRING - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Invert) {
					{
					setState(752);
					match(Invert);
					}
				}

				setState(755);
				criterion();
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Else) {
					{
					{
					setState(756);
					match(Else);
					setState(757);
					criterion();
					}
					}
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(765);
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

	public static class CriterionContext extends ParserRuleContext {
		public LiteralMatchContext literalMatch() {
			return getRuleContext(LiteralMatchContext.class,0);
		}
		public TypeMatchContext typeMatch() {
			return getRuleContext(TypeMatchContext.class,0);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public CriterionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criterion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCriterion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriterionContext criterion() throws RecognitionException {
		CriterionContext _localctx = new CriterionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_criterion);
		int _la;
		try {
			setState(782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case DataDefinition:
			case SourceMarker:
			case DeleteMarker:
			case Reflexive:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case Quote:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case StartStateDefinition:
			case EndDefinition:
			case Rule:
			case First:
			case Last:
			case Range:
			case Plus:
			case Minus:
			case Mod:
			case Equal:
			case StartTestDefinition:
			case Assert:
			case With:
			case Provided:
			case Modified:
			case Shadowed:
			case From:
			case Use:
			case Program:
			case Modify:
			case By:
			case Collect:
			case Zero:
			case PositiveInteger:
			case START_STRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Equal:
					{
					setState(767);
					literalMatch();
					}
					break;
				case Include:
				case Def:
				case When:
				case Do:
				case Otherwise:
				case DataDefinition:
				case SourceMarker:
				case DeleteMarker:
				case Reflexive:
				case LeftParen:
				case LeftBracket:
				case LeftBrace:
				case Quote:
				case StartTemplatesDefinition:
				case StartSourceDefinition:
				case StartSinkDefinition:
				case StartComposerDefinition:
				case StartProcessorDefinition:
				case StartOperatorDefinition:
				case StartStateDefinition:
				case EndDefinition:
				case Rule:
				case First:
				case Last:
				case Range:
				case Plus:
				case Minus:
				case Mod:
				case StartTestDefinition:
				case Assert:
				case With:
				case Provided:
				case Modified:
				case Shadowed:
				case From:
				case Use:
				case Program:
				case Modify:
				case By:
				case Collect:
				case Zero:
				case PositiveInteger:
				case START_STRING:
				case IDENTIFIER:
					{
					setState(768);
					typeMatch();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BeginCondition) {
					{
					{
					setState(771);
					condition();
					}
					}
					setState(776);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BeginCondition:
				enterOuterAlt(_localctx, 2);
				{
				setState(778); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(777);
					condition();
					}
					}
					setState(780); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BeginCondition );
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

	public static class TypeMatchContext extends ParserRuleContext {
		public TypeMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeMatch; }
	 
		public TypeMatchContext() { }
		public void copyFrom(TypeMatchContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RangeMatchContext extends TypeMatchContext {
		public RangeBoundsContext rangeBounds() {
			return getRuleContext(RangeBoundsContext.class,0);
		}
		public RangeMatchContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitRangeMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnitMatchContext extends TypeMatchContext {
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public UnitMatchContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitUnitMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayMatchContext extends TypeMatchContext {
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public List<ArrayContentMatcherContext> arrayContentMatcher() {
			return getRuleContexts(ArrayContentMatcherContext.class);
		}
		public ArrayContentMatcherContext arrayContentMatcher(int i) {
			return getRuleContext(ArrayContentMatcherContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public TerminalNode Void() { return getToken(TailspinParser.Void, 0); }
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public RangeBoundsContext rangeBounds() {
			return getRuleContext(RangeBoundsContext.class,0);
		}
		public ArithmeticValueContext arithmeticValue() {
			return getRuleContext(ArithmeticValueContext.class,0);
		}
		public ArrayMatchContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegexpMatchContext extends TypeMatchContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public RegexpMatchContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitRegexpMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructureMatchContext extends TypeMatchContext {
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public List<StructureContentMatcherContext> structureContentMatcher() {
			return getRuleContexts(StructureContentMatcherContext.class);
		}
		public StructureContentMatcherContext structureContentMatcher(int i) {
			return getRuleContext(StructureContentMatcherContext.class,i);
		}
		public TerminalNode Void() { return getToken(TailspinParser.Void, 0); }
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public StructureMatchContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StereotypeMatchContext extends TypeMatchContext {
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public ExternalIdentifierContext externalIdentifier() {
			return getRuleContext(ExternalIdentifierContext.class,0);
		}
		public StereotypeMatchContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStereotypeMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeMatchContext typeMatch() throws RecognitionException {
		TypeMatchContext _localctx = new TypeMatchContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeMatch);
		int _la;
		try {
			int _alt;
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				rangeBounds();
				}
				break;
			case 2:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				stringLiteral();
				}
				break;
			case 3:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(786);
				match(LeftBrace);
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (From - 65)) | (1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (By - 65)) | (1L << (Collect - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					{
					setState(787);
					key();
					setState(788);
					structureContentMatcher();
					setState(790);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						setState(789);
						match(Comma);
						}
						break;
					}
					}
					}
					setState(796);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Void || _la==Comma) {
					{
					setState(798);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(797);
						match(Comma);
						}
					}

					setState(800);
					match(Void);
					}
				}

				setState(803);
				match(RightBrace);
				}
				break;
			case 4:
				_localctx = new ArrayMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(804);
				match(LeftBracket);
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen || _la==StartMatcher) {
					{
					setState(805);
					arrayContentMatcher();
					}
				}

				setState(812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(808);
						match(Comma);
						setState(809);
						arrayContentMatcher();
						}
						} 
					}
					setState(814);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Void || _la==Comma) {
					{
					setState(816);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(815);
						match(Comma);
						}
					}

					setState(818);
					match(Void);
					}
				}

				setState(821);
				match(RightBracket);
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(822);
					match(LeftParen);
					setState(825);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						setState(823);
						rangeBounds();
						}
						break;
					case 2:
						{
						setState(824);
						arithmeticValue();
						}
						break;
					}
					setState(827);
					match(RightParen);
					}
				}

				}
				break;
			case 5:
				_localctx = new StereotypeMatchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(833);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(831);
					localIdentifier();
					}
					break;
				case 2:
					{
					setState(832);
					externalIdentifier();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new UnitMatchContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(835);
				unit();
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

	public static class StructureContentMatcherContext extends ParserRuleContext {
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public TerminalNode Void() { return getToken(TailspinParser.Void, 0); }
		public StructureContentMatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureContentMatcher; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureContentMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureContentMatcherContext structureContentMatcher() throws RecognitionException {
		StructureContentMatcherContext _localctx = new StructureContentMatcherContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_structureContentMatcher);
		try {
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartMatcher:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				matcher();
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
				match(Void);
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

	public static class ArrayContentMatcherContext extends ParserRuleContext {
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public SequenceMatchContext sequenceMatch() {
			return getRuleContext(SequenceMatchContext.class,0);
		}
		public MultiplierContext multiplier() {
			return getRuleContext(MultiplierContext.class,0);
		}
		public ArrayContentMatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayContentMatcher; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayContentMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContentMatcherContext arrayContentMatcher() throws RecognitionException {
		ArrayContentMatcherContext _localctx = new ArrayContentMatcherContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_arrayContentMatcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartMatcher:
				{
				setState(842);
				matcher();
				}
				break;
			case LeftParen:
				{
				setState(843);
				sequenceMatch();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Star) | (1L << Question) | (1L << Equal))) != 0)) {
				{
				setState(846);
				multiplier();
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

	public static class SequenceMatchContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public List<MatcherContext> matcher() {
			return getRuleContexts(MatcherContext.class);
		}
		public MatcherContext matcher(int i) {
			return getRuleContext(MatcherContext.class,i);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<TerminalNode> Colon() { return getTokens(TailspinParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(TailspinParser.Colon, i);
		}
		public SequenceMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceMatch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitSequenceMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceMatchContext sequenceMatch() throws RecognitionException {
		SequenceMatchContext _localctx = new SequenceMatchContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_sequenceMatch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(LeftParen);
			setState(850);
			matcher();
			setState(853); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(851);
				match(Colon);
				setState(852);
				matcher();
				}
				}
				setState(855); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Colon );
			setState(857);
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

	public static class LiteralMatchContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(TailspinParser.Equal, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public LiteralMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalMatch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLiteralMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralMatchContext literalMatch() throws RecognitionException {
		LiteralMatchContext _localctx = new LiteralMatchContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_literalMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(Equal);
			setState(860);
			source();
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

	public static class RangeBoundsContext extends ParserRuleContext {
		public TerminalNode Range() { return getToken(TailspinParser.Range, 0); }
		public LowerBoundContext lowerBound() {
			return getRuleContext(LowerBoundContext.class,0);
		}
		public UpperBoundContext upperBound() {
			return getRuleContext(UpperBoundContext.class,0);
		}
		public RangeBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeBounds; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitRangeBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeBoundsContext rangeBounds() throws RecognitionException {
		RangeBoundsContext _localctx = new RangeBoundsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_rangeBounds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SourceMarker - 11)) | (1L << (DeleteMarker - 11)) | (1L << (Reflexive - 11)) | (1L << (LeftParen - 11)) | (1L << (First - 11)) | (1L << (Last - 11)) | (1L << (Plus - 11)) | (1L << (Minus - 11)) | (1L << (Zero - 11)) | (1L << (PositiveInteger - 11)) | (1L << (START_STRING - 11)))) != 0)) {
				{
				setState(862);
				lowerBound();
				}
			}

			setState(865);
			match(Range);
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SourceMarker - 11)) | (1L << (DeleteMarker - 11)) | (1L << (Reflexive - 11)) | (1L << (Invert - 11)) | (1L << (LeftParen - 11)) | (1L << (First - 11)) | (1L << (Last - 11)) | (1L << (Plus - 11)) | (1L << (Minus - 11)) | (1L << (Zero - 11)) | (1L << (PositiveInteger - 11)) | (1L << (START_STRING - 11)))) != 0)) {
				{
				setState(866);
				upperBound();
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode BeginCondition() { return getToken(TailspinParser.BeginCondition, 0); }
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(BeginCondition);
			setState(870);
			valueChain();
			setState(871);
			matcher();
			setState(872);
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

	public static class LowerBoundContext extends ParserRuleContext {
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public ArithmeticValueContext arithmeticValue() {
			return getRuleContext(ArithmeticValueContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode Invert() { return getToken(TailspinParser.Invert, 0); }
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
		enterRule(_localctx, 126, RULE_lowerBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(874);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(875);
				arithmeticValue();
				}
				break;
			case 3:
				{
				setState(876);
				stringLiteral();
				}
				break;
			case 4:
				{
				setState(877);
				term();
				}
				break;
			}
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(880);
				match(Invert);
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

	public static class UpperBoundContext extends ParserRuleContext {
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public ArithmeticValueContext arithmeticValue() {
			return getRuleContext(ArithmeticValueContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode Invert() { return getToken(TailspinParser.Invert, 0); }
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
		enterRule(_localctx, 128, RULE_upperBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(883);
				match(Invert);
				}
			}

			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(886);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(887);
				arithmeticValue();
				}
				break;
			case 3:
				{
				setState(888);
				stringLiteral();
				}
				break;
			case 4:
				{
				setState(889);
				term();
				}
				break;
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
		public TerminalNode Range() { return getToken(TailspinParser.Range, 0); }
		public LowerBoundContext lowerBound() {
			return getRuleContext(LowerBoundContext.class,0);
		}
		public UpperBoundContext upperBound() {
			return getRuleContext(UpperBoundContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public ArithmeticValueContext arithmeticValue() {
			return getRuleContext(ArithmeticValueContext.class,0);
		}
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
		enterRule(_localctx, 130, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SourceMarker - 11)) | (1L << (DeleteMarker - 11)) | (1L << (Reflexive - 11)) | (1L << (LeftParen - 11)) | (1L << (First - 11)) | (1L << (Last - 11)) | (1L << (Plus - 11)) | (1L << (Minus - 11)) | (1L << (Zero - 11)) | (1L << (PositiveInteger - 11)) | (1L << (START_STRING - 11)))) != 0)) {
				{
				setState(892);
				lowerBound();
				}
			}

			setState(895);
			match(Range);
			setState(897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(896);
				upperBound();
				}
				break;
			}
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(899);
				match(Colon);
				setState(900);
				arithmeticValue();
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
		public NonZeroIntegerContext nonZeroInteger() {
			return getRuleContext(NonZeroIntegerContext.class,0);
		}
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
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
		enterRule(_localctx, 132, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
				{
				setState(903);
				match(Zero);
				}
				break;
			case Plus:
			case Minus:
			case PositiveInteger:
				{
				setState(904);
				nonZeroInteger();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(907);
				unit();
				}
				break;
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

	public static class UnitContext extends ParserRuleContext {
		public List<TerminalNode> Quote() { return getTokens(TailspinParser.Quote); }
		public TerminalNode Quote(int i) {
			return getToken(TailspinParser.Quote, i);
		}
		public MeasureProductContext measureProduct() {
			return getRuleContext(MeasureProductContext.class,0);
		}
		public MeasureDenominatorContext measureDenominator() {
			return getRuleContext(MeasureDenominatorContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(Quote);
			setState(911);
			measureProduct();
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(912);
				measureDenominator();
				}
			}

			setState(915);
			match(Quote);
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

	public static class MeasureProductContext extends ParserRuleContext {
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public MeasureProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measureProduct; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMeasureProduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasureProductContext measureProduct() throws RecognitionException {
		MeasureProductContext _localctx = new MeasureProductContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_measureProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (From - 65)) | (1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (By - 65)) | (1L << (Collect - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(917);
				localIdentifier();
				}
				}
				setState(922);
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

	public static class MeasureDenominatorContext extends ParserRuleContext {
		public TerminalNode Slash() { return getToken(TailspinParser.Slash, 0); }
		public MeasureProductContext measureProduct() {
			return getRuleContext(MeasureProductContext.class,0);
		}
		public MeasureDenominatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measureDenominator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMeasureDenominator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasureDenominatorContext measureDenominator() throws RecognitionException {
		MeasureDenominatorContext _localctx = new MeasureDenominatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_measureDenominator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			match(Slash);
			setState(924);
			measureProduct();
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

	public static class NonZeroIntegerContext extends ParserRuleContext {
		public TerminalNode PositiveInteger() { return getToken(TailspinParser.PositiveInteger, 0); }
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public NonZeroIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonZeroInteger; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitNonZeroInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonZeroIntegerContext nonZeroInteger() throws RecognitionException {
		NonZeroIntegerContext _localctx = new NonZeroIntegerContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_nonZeroInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(926);
				additiveOperator();
				}
			}

			setState(929);
			match(PositiveInteger);
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
		public TerminalNode START_STRING() { return getToken(TailspinParser.START_STRING, 0); }
		public TerminalNode END_STRING() { return getToken(TailspinParser.END_STRING, 0); }
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
		enterRule(_localctx, 142, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			match(START_STRING);
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (StartCharacterCode - 81)) | (1L << (StartStringInterpolate - 81)) | (1L << (STRING_TEXT - 81)))) != 0)) {
				{
				{
				setState(932);
				stringContent();
				}
				}
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(938);
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
		enterRule(_localctx, 144, RULE_stringContent);
		try {
			setState(942);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartCharacterCode:
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(940);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
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
		public CharacterCodeContext characterCode() {
			return getRuleContext(CharacterCodeContext.class,0);
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
		enterRule(_localctx, 146, RULE_stringInterpolate);
		try {
			setState(946);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				interpolateEvaluate();
				}
				break;
			case StartCharacterCode:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				characterCode();
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

	public static class CharacterCodeContext extends ParserRuleContext {
		public TerminalNode StartCharacterCode() { return getToken(TailspinParser.StartCharacterCode, 0); }
		public ArithmeticValueContext arithmeticValue() {
			return getRuleContext(ArithmeticValueContext.class,0);
		}
		public TerminalNode EndStringInterpolate() { return getToken(TailspinParser.EndStringInterpolate, 0); }
		public CharacterCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCharacterCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterCodeContext characterCode() throws RecognitionException {
		CharacterCodeContext _localctx = new CharacterCodeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_characterCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(StartCharacterCode);
			setState(949);
			arithmeticValue();
			setState(950);
			match(EndStringInterpolate);
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
		public TerminalNode StartStringInterpolate() { return getToken(TailspinParser.StartStringInterpolate, 0); }
		public TerminalNode EndStringInterpolate() { return getToken(TailspinParser.EndStringInterpolate, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public TerminalNode TemplateMatch() { return getToken(TailspinParser.TemplateMatch, 0); }
		public AnyIdentifierContext anyIdentifier() {
			return getRuleContext(AnyIdentifierContext.class,0);
		}
		public TerminalNode Message() { return getToken(TailspinParser.Message, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
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
		enterRule(_localctx, 150, RULE_interpolateEvaluate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(StartStringInterpolate);
			setState(965);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case DataDefinition:
			case To:
			case And:
			case Message:
			case FieldReference:
			case EndStringInterpolate:
			case Deconstructor:
			case LeftParen:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case StartStateDefinition:
			case EndDefinition:
			case Rule:
			case First:
			case Last:
			case Mod:
			case StartTestDefinition:
			case Assert:
			case With:
			case Provided:
			case Modified:
			case Shadowed:
			case From:
			case Use:
			case Program:
			case Modify:
			case By:
			case Collect:
			case STATE_IDENTIFIER:
			case IDENTIFIER:
				{
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (From - 65)) | (1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (By - 65)) | (1L << (Collect - 65)) | (1L << (STATE_IDENTIFIER - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(953);
					anyIdentifier();
					}
				}

				setState(956);
				reference();
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(957);
					match(Message);
					}
				}

				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(960);
					parameterValues();
					}
				}

				}
				break;
			case Colon:
				{
				setState(963);
				match(Colon);
				setState(964);
				source();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(967);
				transform();
				}
				break;
			}
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==To) {
				{
				setState(970);
				match(To);
				setState(971);
				match(TemplateMatch);
				}
			}

			setState(974);
			match(EndStringInterpolate);
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

	public static class ArithmeticValueContext extends ParserRuleContext {
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public ArithmeticValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArithmeticValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticValueContext arithmeticValue() throws RecognitionException {
		ArithmeticValueContext _localctx = new ArithmeticValueContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_arithmeticValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			arithmeticExpression(0);
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
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public ArithmeticContextKeywordContext arithmeticContextKeyword() {
			return getRuleContext(ArithmeticContextKeywordContext.class,0);
		}
		public TermArithmeticOperationContext termArithmeticOperation() {
			return getRuleContext(TermArithmeticOperationContext.class,0);
		}
		public MultiplicativeOperatorContext multiplicativeOperator() {
			return getRuleContext(MultiplicativeOperatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
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
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(979);
				integerLiteral();
				}
				break;
			case 2:
				{
				setState(980);
				match(LeftParen);
				setState(981);
				arithmeticExpression(0);
				setState(982);
				match(RightParen);
				setState(984);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(983);
					unit();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Plus || _la==Minus) {
					{
					setState(986);
					additiveOperator();
					}
				}

				setState(989);
				sourceReference();
				}
				break;
			case 4:
				{
				setState(990);
				arithmeticContextKeyword();
				}
				break;
			case 5:
				{
				setState(991);
				termArithmeticOperation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1012);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1010);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(994);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(995);
						multiplicativeOperator();
						setState(996);
						arithmeticExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(998);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(999);
						additiveOperator();
						setState(1000);
						arithmeticExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(1002);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1003);
						multiplicativeOperator();
						setState(1004);
						term();
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(1006);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1007);
						additiveOperator();
						setState(1008);
						term();
						}
						break;
					}
					} 
				}
				setState(1014);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
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

	public static class TermArithmeticOperationContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public MultiplicativeOperatorContext multiplicativeOperator() {
			return getRuleContext(MultiplicativeOperatorContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public TermArithmeticOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termArithmeticOperation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTermArithmeticOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermArithmeticOperationContext termArithmeticOperation() throws RecognitionException {
		TermArithmeticOperationContext _localctx = new TermArithmeticOperationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_termArithmeticOperation);
		try {
			setState(1027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1015);
				term();
				setState(1016);
				multiplicativeOperator();
				setState(1019);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1017);
					term();
					}
					break;
				case 2:
					{
					setState(1018);
					arithmeticExpression(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				term();
				setState(1022);
				additiveOperator();
				setState(1025);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1023);
					term();
					}
					break;
				case 2:
					{
					setState(1024);
					arithmeticExpression(0);
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

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(TailspinParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(TailspinParser.Minus, 0); }
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			_la = _input.LA(1);
			if ( !(_la==Plus || _la==Minus) ) {
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

	public static class MultiplicativeOperatorContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(TailspinParser.Star, 0); }
		public TerminalNode TruncateDivide() { return getToken(TailspinParser.TruncateDivide, 0); }
		public TerminalNode Mod() { return getToken(TailspinParser.Mod, 0); }
		public MultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOperatorContext multiplicativeOperator() throws RecognitionException {
		MultiplicativeOperatorContext _localctx = new MultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << TruncateDivide) | (1L << Mod))) != 0)) ) {
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public OperatorExpressionContext operatorExpression() {
			return getRuleContext(OperatorExpressionContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_term);
		try {
			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				match(LeftParen);
				setState(1034);
				valueProduction();
				setState(1035);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				operatorExpression();
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

	public static class OperatorExpressionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TemplatesReferenceContext templatesReference() {
			return getRuleContext(TemplatesReferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public OperatorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorExpressionContext operatorExpression() throws RecognitionException {
		OperatorExpressionContext _localctx = new OperatorExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(LeftParen);
			setState(1041);
			operand();
			setState(1042);
			templatesReference();
			setState(1043);
			operand();
			setState(1044);
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

	public static class OperandContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_operand);
		try {
			setState(1048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1046);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047);
				term();
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

	public static class ComposerBodyContext extends ParserRuleContext {
		public CompositionSequenceContext compositionSequence() {
			return getRuleContext(CompositionSequenceContext.class,0);
		}
		public StateAssignmentContext stateAssignment() {
			return getRuleContext(StateAssignmentContext.class,0);
		}
		public List<DefinedCompositionSequenceContext> definedCompositionSequence() {
			return getRuleContexts(DefinedCompositionSequenceContext.class);
		}
		public DefinedCompositionSequenceContext definedCompositionSequence(int i) {
			return getRuleContext(DefinedCompositionSequenceContext.class,i);
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
		enterRule(_localctx, 168, RULE_composerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1050);
				stateAssignment();
				}
				break;
			}
			setState(1053);
			compositionSequence();
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Rule) {
				{
				{
				setState(1054);
				definedCompositionSequence();
				}
				}
				setState(1059);
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

	public static class DefinedCompositionSequenceContext extends ParserRuleContext {
		public TerminalNode Rule() { return getToken(TailspinParser.Rule, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public CompositionSequenceContext compositionSequence() {
			return getRuleContext(CompositionSequenceContext.class,0);
		}
		public DefinedCompositionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedCompositionSequence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDefinedCompositionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinedCompositionSequenceContext definedCompositionSequence() throws RecognitionException {
		DefinedCompositionSequenceContext _localctx = new DefinedCompositionSequenceContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_definedCompositionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			match(Rule);
			setState(1061);
			key();
			setState(1062);
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
		public CompositionComponentsContext compositionComponents() {
			return getRuleContext(CompositionComponentsContext.class,0);
		}
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
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
		enterRule(_localctx, 172, RULE_compositionSequence);
		int _la;
		try {
			setState(1070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				compositionComponents();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1065);
					compositionSkipRule();
					}
					}
					setState(1068); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
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

	public static class CompositionComponentsContext extends ParserRuleContext {
		public CompositionComponentContext compositionComponent() {
			return getRuleContext(CompositionComponentContext.class,0);
		}
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
		}
		public CompositionComponentsContext compositionComponents() {
			return getRuleContext(CompositionComponentsContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TailspinParser.Comma, 0); }
		public CompositionComponentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionComponents; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionComponents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionComponentsContext compositionComponents() throws RecognitionException {
		CompositionComponentsContext _localctx = new CompositionComponentsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_compositionComponents);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1072);
					compositionSkipRule();
					}
					} 
				}
				setState(1077);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			setState(1078);
			compositionComponent();
			setState(1083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1079);
					match(Comma);
					}
				}

				setState(1082);
				compositionComponents();
				}
				break;
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

	public static class CompositionComponentContext extends ParserRuleContext {
		public CompositionMatcherContext compositionMatcher() {
			return getRuleContext(CompositionMatcherContext.class,0);
		}
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
		}
		public CompositionComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionComponent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionComponentContext compositionComponent() throws RecognitionException {
		CompositionComponentContext _localctx = new CompositionComponentContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_compositionComponent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			compositionMatcher();
			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1086);
				transform();
				}
				break;
			}
			setState(1092);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1089);
					compositionSkipRule();
					}
					} 
				}
				setState(1094);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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

	public static class CompositionMatcherContext extends ParserRuleContext {
		public TokenMatcherContext tokenMatcher() {
			return getRuleContext(TokenMatcherContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public CompositionSequenceContext compositionSequence() {
			return getRuleContext(CompositionSequenceContext.class,0);
		}
		public CompositionSkipRuleContext compositionSkipRule() {
			return getRuleContext(CompositionSkipRuleContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public StructureMemberMatchersContext structureMemberMatchers() {
			return getRuleContext(StructureMemberMatchersContext.class,0);
		}
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public CompositionKeyValueContext compositionKeyValue() {
			return getRuleContext(CompositionKeyValueContext.class,0);
		}
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
		enterRule(_localctx, 178, RULE_compositionMatcher);
		try {
			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1095);
				tokenMatcher();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1096);
				match(LeftBracket);
				setState(1099);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1097);
					compositionSequence();
					}
					break;
				case 2:
					{
					setState(1098);
					compositionSkipRule();
					}
					break;
				}
				setState(1101);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1102);
				match(LeftBrace);
				setState(1105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1103);
					structureMemberMatchers();
					}
					break;
				case 2:
					{
					setState(1104);
					compositionSkipRule();
					}
					break;
				}
				setState(1107);
				match(RightBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1108);
				source();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1109);
				compositionKeyValue();
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

	public static class StructureMemberMatchersContext extends ParserRuleContext {
		public StructureMemberMatcherContext structureMemberMatcher() {
			return getRuleContext(StructureMemberMatcherContext.class,0);
		}
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
		}
		public StructureMemberMatchersContext structureMemberMatchers() {
			return getRuleContext(StructureMemberMatchersContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TailspinParser.Comma, 0); }
		public StructureMemberMatchersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureMemberMatchers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureMemberMatchers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureMemberMatchersContext structureMemberMatchers() throws RecognitionException {
		StructureMemberMatchersContext _localctx = new StructureMemberMatchersContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_structureMemberMatchers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(1112);
				compositionSkipRule();
				}
				}
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1118);
			structureMemberMatcher();
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << Comma) | (1L << LeftParen) | (1L << StartMatcher) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (From - 65)) | (1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (By - 65)) | (1L << (Collect - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1119);
					match(Comma);
					}
				}

				setState(1122);
				structureMemberMatchers();
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

	public static class StructureMemberMatcherContext extends ParserRuleContext {
		public TokenMatcherContext tokenMatcher() {
			return getRuleContext(TokenMatcherContext.class,0);
		}
		public CompositionKeyValueContext compositionKeyValue() {
			return getRuleContext(CompositionKeyValueContext.class,0);
		}
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
		}
		public StructureMemberMatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureMemberMatcher; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureMemberMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureMemberMatcherContext structureMemberMatcher() throws RecognitionException {
		StructureMemberMatcherContext _localctx = new StructureMemberMatcherContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_structureMemberMatcher);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1125);
				tokenMatcher();
				}
				break;
			case 2:
				{
				setState(1126);
				compositionKeyValue();
				}
				break;
			}
			setState(1132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1129);
					compositionSkipRule();
					}
					} 
				}
				setState(1134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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

	public static class TokenMatcherContext extends ParserRuleContext {
		public TerminalNode StartMatcher() { return getToken(TailspinParser.StartMatcher, 0); }
		public List<CompositionTokenContext> compositionToken() {
			return getRuleContexts(CompositionTokenContext.class);
		}
		public CompositionTokenContext compositionToken(int i) {
			return getRuleContext(CompositionTokenContext.class,i);
		}
		public TerminalNode EndMatcher() { return getToken(TailspinParser.EndMatcher, 0); }
		public TerminalNode Invert() { return getToken(TailspinParser.Invert, 0); }
		public List<TerminalNode> Else() { return getTokens(TailspinParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(TailspinParser.Else, i);
		}
		public MultiplierContext multiplier() {
			return getRuleContext(MultiplierContext.class,0);
		}
		public TokenMatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenMatcher; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTokenMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenMatcherContext tokenMatcher() throws RecognitionException {
		TokenMatcherContext _localctx = new TokenMatcherContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_tokenMatcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(StartMatcher);
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(1136);
				match(Invert);
				}
			}

			setState(1139);
			compositionToken();
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(1140);
				match(Else);
				setState(1141);
				compositionToken();
				}
				}
				setState(1146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1147);
			match(EndMatcher);
			setState(1149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1148);
				multiplier();
				}
				break;
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

	public static class CompositionTokenContext extends ParserRuleContext {
		public LiteralCompositionContext literalComposition() {
			return getRuleContext(LiteralCompositionContext.class,0);
		}
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public CompositionTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionToken; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionTokenContext compositionToken() throws RecognitionException {
		CompositionTokenContext _localctx = new CompositionTokenContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_compositionToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				{
				setState(1151);
				literalComposition();
				}
				break;
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case DataDefinition:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case StartStateDefinition:
			case EndDefinition:
			case Rule:
			case First:
			case Last:
			case Mod:
			case StartTestDefinition:
			case Assert:
			case With:
			case Provided:
			case Modified:
			case Shadowed:
			case From:
			case Use:
			case Program:
			case Modify:
			case By:
			case Collect:
			case IDENTIFIER:
				{
				setState(1152);
				localIdentifier();
				}
				break;
			case START_STRING:
				{
				setState(1153);
				stringLiteral();
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

	public static class LiteralCompositionContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(TailspinParser.Equal, 0); }
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralCompositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalComposition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLiteralComposition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralCompositionContext literalComposition() throws RecognitionException {
		LiteralCompositionContext _localctx = new LiteralCompositionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_literalComposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			match(Equal);
			setState(1159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
			case DeleteMarker:
			case Reflexive:
				{
				setState(1157);
				sourceReference();
				}
				break;
			case START_STRING:
				{
				setState(1158);
				stringLiteral();
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

	public static class MultiplierContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(TailspinParser.Plus, 0); }
		public TerminalNode Star() { return getToken(TailspinParser.Star, 0); }
		public TerminalNode Question() { return getToken(TailspinParser.Question, 0); }
		public TerminalNode Equal() { return getToken(TailspinParser.Equal, 0); }
		public TerminalNode PositiveInteger() { return getToken(TailspinParser.PositiveInteger, 0); }
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public MultiplierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMultiplier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplierContext multiplier() throws RecognitionException {
		MultiplierContext _localctx = new MultiplierContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_multiplier);
		try {
			setState(1169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				match(Plus);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				setState(1162);
				match(Star);
				}
				break;
			case Question:
				enterOuterAlt(_localctx, 3);
				{
				setState(1163);
				match(Question);
				}
				break;
			case Equal:
				enterOuterAlt(_localctx, 4);
				{
				setState(1164);
				match(Equal);
				setState(1167);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PositiveInteger:
					{
					setState(1165);
					match(PositiveInteger);
					}
					break;
				case SourceMarker:
				case DeleteMarker:
				case Reflexive:
					{
					setState(1166);
					sourceReference();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class CompositionSkipRuleContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<CompositionCaptureContext> compositionCapture() {
			return getRuleContexts(CompositionCaptureContext.class);
		}
		public CompositionCaptureContext compositionCapture(int i) {
			return getRuleContext(CompositionCaptureContext.class,i);
		}
		public CompositionSkipRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionSkipRule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionSkipRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionSkipRuleContext compositionSkipRule() throws RecognitionException {
		CompositionSkipRuleContext _localctx = new CompositionSkipRuleContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_compositionSkipRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			match(LeftParen);
			setState(1173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1172);
				compositionCapture();
				}
				}
				setState(1175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartMatcher) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (From - 65)) | (1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (By - 65)) | (1L << (Collect - 65)) | (1L << (Zero - 65)) | (1L << (PositiveInteger - 65)) | (1L << (START_STRING - 65)) | (1L << (STATE_IDENTIFIER - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
			setState(1177);
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

	public static class CompositionCaptureContext extends ParserRuleContext {
		public TerminalNode Def() { return getToken(TailspinParser.Def, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public CompositionMatcherContext compositionMatcher() {
			return getRuleContext(CompositionMatcherContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TailspinParser.SemiColon, 0); }
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public StateSinkContext stateSink() {
			return getRuleContext(StateSinkContext.class,0);
		}
		public StateAssignmentContext stateAssignment() {
			return getRuleContext(StateAssignmentContext.class,0);
		}
		public CompositionCaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionCapture; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionCaptureContext compositionCapture() throws RecognitionException {
		CompositionCaptureContext _localctx = new CompositionCaptureContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_compositionCapture);
		int _la;
		try {
			setState(1196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1179);
				match(Def);
				setState(1180);
				key();
				setState(1181);
				compositionMatcher();
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To || _la==Deconstructor) {
					{
					setState(1182);
					transform();
					}
				}

				setState(1185);
				match(SemiColon);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1187);
				compositionMatcher();
				setState(1193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To || _la==Deconstructor) {
					{
					setState(1189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
					case 1:
						{
						setState(1188);
						transform();
						}
						break;
					}
					setState(1191);
					match(To);
					setState(1192);
					stateSink();
					}
				}

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1195);
				stateAssignment();
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

	public static class CompositionKeyValueContext extends ParserRuleContext {
		public CompositionComponentContext compositionComponent() {
			return getRuleContext(CompositionComponentContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public CompositionKeyContext compositionKey() {
			return getRuleContext(CompositionKeyContext.class,0);
		}
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
		}
		public CompositionKeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionKeyValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionKeyValueContext compositionKeyValue() throws RecognitionException {
		CompositionKeyValueContext _localctx = new CompositionKeyValueContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_compositionKeyValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case DataDefinition:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case StartStateDefinition:
			case EndDefinition:
			case Rule:
			case First:
			case Last:
			case Mod:
			case StartTestDefinition:
			case Assert:
			case With:
			case Provided:
			case Modified:
			case Shadowed:
			case From:
			case Use:
			case Program:
			case Modify:
			case By:
			case Collect:
			case IDENTIFIER:
				{
				setState(1198);
				key();
				}
				break;
			case StartMatcher:
				{
				setState(1199);
				compositionKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1202);
					compositionSkipRule();
					}
					} 
				}
				setState(1207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			setState(1208);
			compositionComponent();
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

	public static class CompositionKeyContext extends ParserRuleContext {
		public TokenMatcherContext tokenMatcher() {
			return getRuleContext(TokenMatcherContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public CompositionKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionKeyContext compositionKey() throws RecognitionException {
		CompositionKeyContext _localctx = new CompositionKeyContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_compositionKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			tokenMatcher();
			setState(1211);
			match(Colon);
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

	public static class LocalIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public LocalIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLocalIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalIdentifierContext localIdentifier() throws RecognitionException {
		LocalIdentifierContext _localctx = new LocalIdentifierContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_localIdentifier);
		try {
			setState(1215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1213);
				match(IDENTIFIER);
				}
				break;
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case DataDefinition:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case StartStateDefinition:
			case EndDefinition:
			case Rule:
			case First:
			case Last:
			case Mod:
			case StartTestDefinition:
			case Assert:
			case With:
			case Provided:
			case Modified:
			case Shadowed:
			case From:
			case Use:
			case Program:
			case Modify:
			case By:
			case Collect:
				enterOuterAlt(_localctx, 2);
				{
				setState(1214);
				keyword();
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

	public static class StateIdentifierContext extends ParserRuleContext {
		public TerminalNode STATE_IDENTIFIER() { return getToken(TailspinParser.STATE_IDENTIFIER, 0); }
		public StateIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStateIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateIdentifierContext stateIdentifier() throws RecognitionException {
		StateIdentifierContext _localctx = new StateIdentifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_stateIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(STATE_IDENTIFIER);
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

	public static class ExternalIdentifierContext extends ParserRuleContext {
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public List<TerminalNode> Slash() { return getTokens(TailspinParser.Slash); }
		public TerminalNode Slash(int i) {
			return getToken(TailspinParser.Slash, i);
		}
		public ExternalIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitExternalIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalIdentifierContext externalIdentifier() throws RecognitionException {
		ExternalIdentifierContext _localctx = new ExternalIdentifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_externalIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			localIdentifier();
			setState(1222); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1220);
					match(Slash);
					setState(1221);
					localIdentifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1224); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AnyIdentifierContext extends ParserRuleContext {
		public StateIdentifierContext stateIdentifier() {
			return getRuleContext(StateIdentifierContext.class,0);
		}
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public ExternalIdentifierContext externalIdentifier() {
			return getRuleContext(ExternalIdentifierContext.class,0);
		}
		public AnyIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitAnyIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyIdentifierContext anyIdentifier() throws RecognitionException {
		AnyIdentifierContext _localctx = new AnyIdentifierContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_anyIdentifier);
		try {
			setState(1229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1226);
				stateIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1227);
				localIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1228);
				externalIdentifier();
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

	public static class ArithmeticContextKeywordContext extends ParserRuleContext {
		public TerminalNode First() { return getToken(TailspinParser.First, 0); }
		public TerminalNode Last() { return getToken(TailspinParser.Last, 0); }
		public ArithmeticContextKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticContextKeyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArithmeticContextKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContextKeywordContext arithmeticContextKeyword() throws RecognitionException {
		ArithmeticContextKeywordContext _localctx = new ArithmeticContextKeywordContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_arithmeticContextKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			_la = _input.LA(1);
			if ( !(_la==First || _la==Last) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Include() { return getToken(TailspinParser.Include, 0); }
		public TerminalNode Def() { return getToken(TailspinParser.Def, 0); }
		public TerminalNode StartTemplatesDefinition() { return getToken(TailspinParser.StartTemplatesDefinition, 0); }
		public TerminalNode StartSourceDefinition() { return getToken(TailspinParser.StartSourceDefinition, 0); }
		public TerminalNode StartSinkDefinition() { return getToken(TailspinParser.StartSinkDefinition, 0); }
		public TerminalNode StartComposerDefinition() { return getToken(TailspinParser.StartComposerDefinition, 0); }
		public TerminalNode StartProcessorDefinition() { return getToken(TailspinParser.StartProcessorDefinition, 0); }
		public TerminalNode StartOperatorDefinition() { return getToken(TailspinParser.StartOperatorDefinition, 0); }
		public TerminalNode StartStateDefinition() { return getToken(TailspinParser.StartStateDefinition, 0); }
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public TerminalNode DataDefinition() { return getToken(TailspinParser.DataDefinition, 0); }
		public TerminalNode Mod() { return getToken(TailspinParser.Mod, 0); }
		public TerminalNode Rule() { return getToken(TailspinParser.Rule, 0); }
		public TerminalNode When() { return getToken(TailspinParser.When, 0); }
		public TerminalNode Do() { return getToken(TailspinParser.Do, 0); }
		public TerminalNode Otherwise() { return getToken(TailspinParser.Otherwise, 0); }
		public ArithmeticContextKeywordContext arithmeticContextKeyword() {
			return getRuleContext(ArithmeticContextKeywordContext.class,0);
		}
		public TerminalNode StartTestDefinition() { return getToken(TailspinParser.StartTestDefinition, 0); }
		public TerminalNode Assert() { return getToken(TailspinParser.Assert, 0); }
		public TerminalNode With() { return getToken(TailspinParser.With, 0); }
		public TerminalNode Provided() { return getToken(TailspinParser.Provided, 0); }
		public TerminalNode Modified() { return getToken(TailspinParser.Modified, 0); }
		public TerminalNode Shadowed() { return getToken(TailspinParser.Shadowed, 0); }
		public TerminalNode From() { return getToken(TailspinParser.From, 0); }
		public TerminalNode Use() { return getToken(TailspinParser.Use, 0); }
		public TerminalNode Program() { return getToken(TailspinParser.Program, 0); }
		public TerminalNode Modify() { return getToken(TailspinParser.Modify, 0); }
		public TerminalNode By() { return getToken(TailspinParser.By, 0); }
		public TerminalNode Collect() { return getToken(TailspinParser.Collect, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_keyword);
		try {
			setState(1262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
				enterOuterAlt(_localctx, 1);
				{
				setState(1233);
				match(Include);
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 2);
				{
				setState(1234);
				match(Def);
				}
				break;
			case StartTemplatesDefinition:
				enterOuterAlt(_localctx, 3);
				{
				setState(1235);
				match(StartTemplatesDefinition);
				}
				break;
			case StartSourceDefinition:
				enterOuterAlt(_localctx, 4);
				{
				setState(1236);
				match(StartSourceDefinition);
				}
				break;
			case StartSinkDefinition:
				enterOuterAlt(_localctx, 5);
				{
				setState(1237);
				match(StartSinkDefinition);
				}
				break;
			case StartComposerDefinition:
				enterOuterAlt(_localctx, 6);
				{
				setState(1238);
				match(StartComposerDefinition);
				}
				break;
			case StartProcessorDefinition:
				enterOuterAlt(_localctx, 7);
				{
				setState(1239);
				match(StartProcessorDefinition);
				}
				break;
			case StartOperatorDefinition:
				enterOuterAlt(_localctx, 8);
				{
				setState(1240);
				match(StartOperatorDefinition);
				}
				break;
			case StartStateDefinition:
				enterOuterAlt(_localctx, 9);
				{
				setState(1241);
				match(StartStateDefinition);
				}
				break;
			case EndDefinition:
				enterOuterAlt(_localctx, 10);
				{
				setState(1242);
				match(EndDefinition);
				}
				break;
			case DataDefinition:
				enterOuterAlt(_localctx, 11);
				{
				setState(1243);
				match(DataDefinition);
				}
				break;
			case Mod:
				enterOuterAlt(_localctx, 12);
				{
				setState(1244);
				match(Mod);
				}
				break;
			case Rule:
				enterOuterAlt(_localctx, 13);
				{
				setState(1245);
				match(Rule);
				}
				break;
			case When:
				enterOuterAlt(_localctx, 14);
				{
				setState(1246);
				match(When);
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 15);
				{
				setState(1247);
				match(Do);
				}
				break;
			case Otherwise:
				enterOuterAlt(_localctx, 16);
				{
				setState(1248);
				match(Otherwise);
				}
				break;
			case First:
			case Last:
				enterOuterAlt(_localctx, 17);
				{
				setState(1249);
				arithmeticContextKeyword();
				}
				break;
			case StartTestDefinition:
				enterOuterAlt(_localctx, 18);
				{
				setState(1250);
				match(StartTestDefinition);
				}
				break;
			case Assert:
				enterOuterAlt(_localctx, 19);
				{
				setState(1251);
				match(Assert);
				}
				break;
			case With:
				enterOuterAlt(_localctx, 20);
				{
				setState(1252);
				match(With);
				}
				break;
			case Provided:
				enterOuterAlt(_localctx, 21);
				{
				setState(1253);
				match(Provided);
				}
				break;
			case Modified:
				enterOuterAlt(_localctx, 22);
				{
				setState(1254);
				match(Modified);
				}
				break;
			case Shadowed:
				enterOuterAlt(_localctx, 23);
				{
				setState(1255);
				match(Shadowed);
				}
				break;
			case From:
				enterOuterAlt(_localctx, 24);
				{
				setState(1256);
				match(From);
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 25);
				{
				setState(1257);
				match(Use);
				}
				break;
			case Program:
				enterOuterAlt(_localctx, 26);
				{
				setState(1258);
				match(Program);
				}
				break;
			case Modify:
				enterOuterAlt(_localctx, 27);
				{
				setState(1259);
				match(Modify);
				}
				break;
			case By:
				enterOuterAlt(_localctx, 28);
				{
				setState(1260);
				match(By);
				}
				break;
			case Collect:
				enterOuterAlt(_localctx, 29);
				{
				setState(1261);
				match(Collect);
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

	public static class TestBodyContext extends ParserRuleContext {
		public List<TestBlockContext> testBlock() {
			return getRuleContexts(TestBlockContext.class);
		}
		public TestBlockContext testBlock(int i) {
			return getRuleContext(TestBlockContext.class,i);
		}
		public TestBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTestBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestBodyContext testBody() throws RecognitionException {
		TestBodyContext _localctx = new TestBodyContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_testBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1264);
				testBlock();
				}
				}
				setState(1267); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << StartTestDefinition) | (1L << Assert))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Zero - 72)) | (1L << (PositiveInteger - 72)) | (1L << (START_STRING - 72)))) != 0) );
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

	public static class TestBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<AssertionContext> assertion() {
			return getRuleContexts(AssertionContext.class);
		}
		public AssertionContext assertion(int i) {
			return getRuleContext(AssertionContext.class,i);
		}
		public TestBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTestBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestBlockContext testBlock() throws RecognitionException {
		TestBlockContext _localctx = new TestBlockContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_testBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << StartTestDefinition))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Zero - 72)) | (1L << (PositiveInteger - 72)) | (1L << (START_STRING - 72)))) != 0)) {
				{
				{
				setState(1269);
				statement();
				}
				}
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1276); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1275);
					assertion();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1278); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AssertionContext extends ParserRuleContext {
		public TerminalNode Assert() { return getToken(TailspinParser.Assert, 0); }
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			match(Assert);
			setState(1281);
			valueChain();
			setState(1282);
			matcher();
			setState(1283);
			stringLiteral();
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

	public static class DependencyProvisionContext extends ParserRuleContext {
		public TerminalNode With() { return getToken(TailspinParser.With, 0); }
		public TerminalNode Provided() { return getToken(TailspinParser.Provided, 0); }
		public List<ModuleConfigurationContext> moduleConfiguration() {
			return getRuleContexts(ModuleConfigurationContext.class);
		}
		public ModuleConfigurationContext moduleConfiguration(int i) {
			return getRuleContext(ModuleConfigurationContext.class,i);
		}
		public DependencyProvisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependencyProvision; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDependencyProvision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependencyProvisionContext dependencyProvision() throws RecognitionException {
		DependencyProvisionContext _localctx = new DependencyProvisionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_dependencyProvision);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			match(With);
			setState(1287); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1286);
					moduleConfiguration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1289); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1291);
			match(Provided);
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

	public static class ModuleConfigurationContext extends ParserRuleContext {
		public ModuleConfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleConfiguration; }
	 
		public ModuleConfigurationContext() { }
		public void copyFrom(ModuleConfigurationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InheritModuleContext extends ModuleConfigurationContext {
		public List<ModuleIdentifierContext> moduleIdentifier() {
			return getRuleContexts(ModuleIdentifierContext.class);
		}
		public ModuleIdentifierContext moduleIdentifier(int i) {
			return getRuleContext(ModuleIdentifierContext.class,i);
		}
		public TerminalNode Inherited() { return getToken(TailspinParser.Inherited, 0); }
		public TerminalNode From() { return getToken(TailspinParser.From, 0); }
		public InheritModuleContext(ModuleConfigurationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitInheritModule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuleModificationContext extends ModuleConfigurationContext {
		public TerminalNode Modified() { return getToken(TailspinParser.Modified, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public ModuleIdentifierContext moduleIdentifier() {
			return getRuleContext(ModuleIdentifierContext.class,0);
		}
		public TerminalNode From() { return getToken(TailspinParser.From, 0); }
		public DependencyProvisionContext dependencyProvision() {
			return getRuleContext(DependencyProvisionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ModuleModificationContext(ModuleConfigurationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitModuleModification(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuleShadowingContext extends ModuleConfigurationContext {
		public TerminalNode Shadowed() { return getToken(TailspinParser.Shadowed, 0); }
		public List<ModuleIdentifierContext> moduleIdentifier() {
			return getRuleContexts(ModuleIdentifierContext.class);
		}
		public ModuleIdentifierContext moduleIdentifier(int i) {
			return getRuleContext(ModuleIdentifierContext.class,i);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public TerminalNode From() { return getToken(TailspinParser.From, 0); }
		public DependencyProvisionContext dependencyProvision() {
			return getRuleContext(DependencyProvisionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ModuleShadowingContext(ModuleConfigurationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitModuleShadowing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuleImportContext extends ModuleConfigurationContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode StandAlone() { return getToken(TailspinParser.StandAlone, 0); }
		public DependencyProvisionContext dependencyProvision() {
			return getRuleContext(DependencyProvisionContext.class,0);
		}
		public ModuleIdentifierContext moduleIdentifier() {
			return getRuleContext(ModuleIdentifierContext.class,0);
		}
		public TerminalNode From() { return getToken(TailspinParser.From, 0); }
		public ModuleImportContext(ModuleConfigurationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitModuleImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleConfigurationContext moduleConfiguration() throws RecognitionException {
		ModuleConfigurationContext _localctx = new ModuleConfigurationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_moduleConfiguration);
		int _la;
		try {
			setState(1345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				_localctx = new ModuleShadowingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1293);
					moduleIdentifier();
					setState(1294);
					match(From);
					}
					break;
				}
				setState(1298);
				match(Shadowed);
				setState(1299);
				moduleIdentifier();
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==With) {
					{
					setState(1300);
					dependencyProvision();
					}
				}

				setState(1304); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1303);
					statement();
					}
					}
					setState(1306); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << StartTestDefinition))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Zero - 72)) | (1L << (PositiveInteger - 72)) | (1L << (START_STRING - 72)))) != 0) );
				setState(1308);
				match(EndDefinition);
				setState(1309);
				moduleIdentifier();
				}
				break;
			case 2:
				_localctx = new InheritModuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1311);
				moduleIdentifier();
				setState(1312);
				match(Inherited);
				setState(1315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1313);
					match(From);
					setState(1314);
					moduleIdentifier();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ModuleModificationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1317);
					moduleIdentifier();
					setState(1318);
					match(From);
					}
					break;
				}
				setState(1322);
				match(Modified);
				setState(1323);
				stringLiteral();
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==With) {
					{
					setState(1324);
					dependencyProvision();
					}
				}

				setState(1328); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1327);
					statement();
					}
					}
					setState(1330); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << StartTestDefinition))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Zero - 72)) | (1L << (PositiveInteger - 72)) | (1L << (START_STRING - 72)))) != 0) );
				setState(1332);
				match(EndDefinition);
				setState(1333);
				stringLiteral();
				}
				break;
			case 4:
				_localctx = new ModuleImportContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << CoreSystem) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (From - 65)) | (1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (By - 65)) | (1L << (Collect - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(1335);
					moduleIdentifier();
					setState(1336);
					match(From);
					}
				}

				setState(1340);
				stringLiteral();
				setState(1343);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case StandAlone:
					{
					setState(1341);
					match(StandAlone);
					}
					break;
				case With:
					{
					setState(1342);
					dependencyProvision();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ModuleIdentifierContext extends ParserRuleContext {
		public TerminalNode CoreSystem() { return getToken(TailspinParser.CoreSystem, 0); }
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public ModuleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitModuleIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleIdentifierContext moduleIdentifier() throws RecognitionException {
		ModuleIdentifierContext _localctx = new ModuleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_moduleIdentifier);
		try {
			setState(1349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CoreSystem:
				enterOuterAlt(_localctx, 1);
				{
				setState(1347);
				match(CoreSystem);
				}
				break;
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case DataDefinition:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case StartStateDefinition:
			case EndDefinition:
			case Rule:
			case First:
			case Last:
			case Mod:
			case StartTestDefinition:
			case Assert:
			case With:
			case Provided:
			case Modified:
			case Shadowed:
			case From:
			case Use:
			case Program:
			case Modify:
			case By:
			case Collect:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1348);
				localIdentifier();
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

	public static class UseModuleContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(TailspinParser.Use, 0); }
		public ModuleConfigurationContext moduleConfiguration() {
			return getRuleContext(ModuleConfigurationContext.class,0);
		}
		public UseModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useModule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitUseModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseModuleContext useModule() throws RecognitionException {
		UseModuleContext _localctx = new UseModuleContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_useModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1351);
			match(Use);
			setState(1352);
			moduleConfiguration();
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

	public static class ProgramModificationContext extends ParserRuleContext {
		public TerminalNode Modify() { return getToken(TailspinParser.Modify, 0); }
		public List<TerminalNode> Program() { return getTokens(TailspinParser.Program); }
		public TerminalNode Program(int i) {
			return getToken(TailspinParser.Program, i);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramModificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programModification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitProgramModification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramModificationContext programModification() throws RecognitionException {
		ProgramModificationContext _localctx = new ProgramModificationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_programModification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			match(Modify);
			setState(1355);
			match(Program);
			setState(1357); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1356);
				statement();
				}
				}
				setState(1359); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << StartTestDefinition))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Zero - 72)) | (1L << (PositiveInteger - 72)) | (1L << (START_STRING - 72)))) != 0) );
			setState(1361);
			match(EndDefinition);
			setState(1362);
			match(Program);
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
		case 77:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Y\u0557\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\3\2\7\2\u00e8\n\2\f"+
		"\2\16\2\u00eb\13\2\3\2\7\2\u00ee\n\2\f\2\16\2\u00f1\13\2\3\2\3\2\7\2\u00f5"+
		"\n\2\f\2\16\2\u00f8\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u0100\n\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u010c\n\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\5\7\u011a\n\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b"+
		"\u0123\n\b\3\b\3\b\7\b\u0127\n\b\f\b\16\b\u012a\13\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\7\t\u0132\n\t\f\t\16\t\u0135\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5"+
		"\n\u013e\n\n\3\13\3\13\3\13\5\13\u0143\n\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\7\f\u014c\n\f\f\f\16\f\u014f\13\f\3\f\5\f\u0152\n\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u015d\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0170\n\20\6\20"+
		"\u0172\n\20\r\20\16\20\u0173\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0185\n\21\3\22\3\22\5\22\u0189"+
		"\n\22\3\22\5\22\u018c\n\22\3\22\3\22\5\22\u0190\n\22\3\22\5\22\u0193\n"+
		"\22\3\22\3\22\3\22\3\22\5\22\u0199\n\22\3\23\5\23\u019c\n\23\3\23\7\23"+
		"\u019f\n\23\f\23\16\23\u01a2\13\23\3\24\3\24\5\24\u01a6\n\24\3\25\3\25"+
		"\3\25\3\25\7\25\u01ac\n\25\f\25\16\25\u01af\13\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u01b9\n\26\3\27\3\27\3\27\5\27\u01be\n\27\3"+
		"\30\3\30\3\30\3\30\7\30\u01c4\n\30\f\30\16\30\u01c7\13\30\3\30\3\30\3"+
		"\31\3\31\3\31\5\31\u01ce\n\31\3\31\3\31\3\31\5\31\u01d3\n\31\7\31\u01d5"+
		"\n\31\f\31\16\31\u01d8\13\31\5\31\u01da\n\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u01e3\n\32\f\32\16\32\u01e6\13\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u01f5\n\34\f\34\16"+
		"\34\u01f8\13\34\3\34\3\34\5\34\u01fc\n\34\3\35\3\35\5\35\u0200\n\35\3"+
		"\36\3\36\3\36\3\36\7\36\u0206\n\36\f\36\16\36\u0209\13\36\5\36\u020b\n"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\7\37\u0214\n\37\f\37\16\37\u0217"+
		"\13\37\5\37\u0219\n\37\3\37\3\37\3\37\3 \3 \3 \7 \u0221\n \f \16 \u0224"+
		"\13 \3 \3 \3!\3!\5!\u022a\n!\3\"\3\"\5\"\u022e\n\"\3#\5#\u0231\n#\3#\3"+
		"#\3$\3$\5$\u0237\n$\3$\5$\u023a\n$\3%\3%\3%\3&\3&\3&\3&\5&\u0243\n&\3"+
		"&\3&\3&\3&\5&\u0249\n&\3&\3&\3&\3&\5&\u024f\n&\3&\3&\3&\3&\3&\5&\u0256"+
		"\n&\3&\3&\5&\u025a\n&\3\'\3\'\3\'\3\'\7\'\u0260\n\'\f\'\16\'\u0263\13"+
		"\'\3\'\3\'\3(\3(\3(\3(\5(\u026b\n(\3(\5(\u026e\n(\3(\5(\u0271\n(\3)\3"+
		")\3)\5)\u0276\n)\3)\5)\u0279\n)\3*\3*\3*\3*\5*\u027f\n*\6*\u0281\n*\r"+
		"*\16*\u0282\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u028f\n+\5+\u0291\n+\3,\3"+
		",\7,\u0295\n,\f,\16,\u0298\13,\3,\6,\u029b\n,\r,\16,\u029c\5,\u029f\n"+
		",\3-\3-\3-\3-\5-\u02a5\n-\3-\3-\5-\u02a9\n-\3-\3-\3-\3-\5-\u02af\n-\3"+
		".\6.\u02b2\n.\r.\16.\u02b3\3.\3.\5.\u02b8\n.\3/\3/\3/\3/\5/\u02be\n/\3"+
		"\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\5\63\u02cc"+
		"\n\63\3\63\3\63\3\64\3\64\5\64\u02d2\n\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\5\65\u02dc\n\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\5\67"+
		"\u02e6\n\67\3\67\3\67\5\67\u02ea\n\67\3\67\3\67\5\67\u02ee\n\67\5\67\u02f0"+
		"\n\67\38\38\58\u02f4\n8\38\38\38\78\u02f9\n8\f8\168\u02fc\138\58\u02fe"+
		"\n8\38\38\39\39\59\u0304\n9\39\79\u0307\n9\f9\169\u030a\139\39\69\u030d"+
		"\n9\r9\169\u030e\59\u0311\n9\3:\3:\3:\3:\3:\3:\5:\u0319\n:\7:\u031b\n"+
		":\f:\16:\u031e\13:\3:\5:\u0321\n:\3:\5:\u0324\n:\3:\3:\3:\5:\u0329\n:"+
		"\3:\3:\7:\u032d\n:\f:\16:\u0330\13:\3:\5:\u0333\n:\3:\5:\u0336\n:\3:\3"+
		":\3:\3:\5:\u033c\n:\3:\3:\5:\u0340\n:\3:\3:\5:\u0344\n:\3:\5:\u0347\n"+
		":\3;\3;\5;\u034b\n;\3<\3<\5<\u034f\n<\3<\5<\u0352\n<\3=\3=\3=\3=\6=\u0358"+
		"\n=\r=\16=\u0359\3=\3=\3>\3>\3>\3?\5?\u0362\n?\3?\3?\5?\u0366\n?\3@\3"+
		"@\3@\3@\3@\3A\3A\3A\3A\5A\u0371\nA\3A\5A\u0374\nA\3B\5B\u0377\nB\3B\3"+
		"B\3B\3B\5B\u037d\nB\3C\5C\u0380\nC\3C\3C\5C\u0384\nC\3C\3C\5C\u0388\n"+
		"C\3D\3D\5D\u038c\nD\3D\5D\u038f\nD\3E\3E\3E\5E\u0394\nE\3E\3E\3F\7F\u0399"+
		"\nF\fF\16F\u039c\13F\3G\3G\3G\3H\5H\u03a2\nH\3H\3H\3I\3I\7I\u03a8\nI\f"+
		"I\16I\u03ab\13I\3I\3I\3J\3J\5J\u03b1\nJ\3K\3K\5K\u03b5\nK\3L\3L\3L\3L"+
		"\3M\3M\5M\u03bd\nM\3M\3M\5M\u03c1\nM\3M\5M\u03c4\nM\3M\3M\5M\u03c8\nM"+
		"\3M\5M\u03cb\nM\3M\3M\5M\u03cf\nM\3M\3M\3N\3N\3O\3O\3O\3O\3O\3O\5O\u03db"+
		"\nO\3O\5O\u03de\nO\3O\3O\3O\5O\u03e3\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\7O\u03f5\nO\fO\16O\u03f8\13O\3P\3P\3P\3P\5P\u03fe\n"+
		"P\3P\3P\3P\3P\5P\u0404\nP\5P\u0406\nP\3Q\3Q\3R\3R\3S\3S\3S\3S\3S\5S\u0411"+
		"\nS\3T\3T\3T\3T\3T\3T\3U\3U\5U\u041b\nU\3V\5V\u041e\nV\3V\3V\7V\u0422"+
		"\nV\fV\16V\u0425\13V\3W\3W\3W\3W\3X\3X\6X\u042d\nX\rX\16X\u042e\5X\u0431"+
		"\nX\3Y\7Y\u0434\nY\fY\16Y\u0437\13Y\3Y\3Y\5Y\u043b\nY\3Y\5Y\u043e\nY\3"+
		"Z\3Z\5Z\u0442\nZ\3Z\7Z\u0445\nZ\fZ\16Z\u0448\13Z\3[\3[\3[\3[\5[\u044e"+
		"\n[\3[\3[\3[\3[\5[\u0454\n[\3[\3[\3[\5[\u0459\n[\3\\\7\\\u045c\n\\\f\\"+
		"\16\\\u045f\13\\\3\\\3\\\5\\\u0463\n\\\3\\\5\\\u0466\n\\\3]\3]\5]\u046a"+
		"\n]\3]\7]\u046d\n]\f]\16]\u0470\13]\3^\3^\5^\u0474\n^\3^\3^\3^\7^\u0479"+
		"\n^\f^\16^\u047c\13^\3^\3^\5^\u0480\n^\3_\3_\3_\5_\u0485\n_\3`\3`\3`\5"+
		"`\u048a\n`\3a\3a\3a\3a\3a\3a\5a\u0492\na\5a\u0494\na\3b\3b\6b\u0498\n"+
		"b\rb\16b\u0499\3b\3b\3c\3c\3c\3c\5c\u04a2\nc\3c\3c\3c\3c\5c\u04a8\nc\3"+
		"c\3c\5c\u04ac\nc\3c\5c\u04af\nc\3d\3d\5d\u04b3\nd\3d\7d\u04b6\nd\fd\16"+
		"d\u04b9\13d\3d\3d\3e\3e\3e\3f\3f\5f\u04c2\nf\3g\3g\3h\3h\3h\6h\u04c9\n"+
		"h\rh\16h\u04ca\3i\3i\3i\5i\u04d0\ni\3j\3j\3k\3k\3k\3k\3k\3k\3k\3k\3k\3"+
		"k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u04f1\n"+
		"k\3l\6l\u04f4\nl\rl\16l\u04f5\3m\7m\u04f9\nm\fm\16m\u04fc\13m\3m\6m\u04ff"+
		"\nm\rm\16m\u0500\3n\3n\3n\3n\3n\3o\3o\6o\u050a\no\ro\16o\u050b\3o\3o\3"+
		"p\3p\3p\5p\u0513\np\3p\3p\3p\5p\u0518\np\3p\6p\u051b\np\rp\16p\u051c\3"+
		"p\3p\3p\3p\3p\3p\3p\5p\u0526\np\3p\3p\3p\5p\u052b\np\3p\3p\3p\5p\u0530"+
		"\np\3p\6p\u0533\np\rp\16p\u0534\3p\3p\3p\3p\3p\3p\5p\u053d\np\3p\3p\3"+
		"p\5p\u0542\np\5p\u0544\np\3q\3q\5q\u0548\nq\3r\3r\3r\3s\3s\3s\6s\u0550"+
		"\ns\rs\16s\u0551\3s\3s\3s\3s\2\3\u009ct\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\2\6\3\2$&\3\2\61\62\3\2\63\65\3\2-.\2\u05ed\2\u00e9\3\2\2"+
		"\2\4\u00fb\3\2\2\2\6\u010b\3\2\2\2\b\u010d\3\2\2\2\n\u0112\3\2\2\2\f\u0116"+
		"\3\2\2\2\16\u011f\3\2\2\2\20\u012e\3\2\2\2\22\u013d\3\2\2\2\24\u013f\3"+
		"\2\2\2\26\u0148\3\2\2\2\30\u0157\3\2\2\2\32\u0164\3\2\2\2\34\u0168\3\2"+
		"\2\2\36\u016b\3\2\2\2 \u0184\3\2\2\2\"\u0198\3\2\2\2$\u019b\3\2\2\2&\u01a3"+
		"\3\2\2\2(\u01a7\3\2\2\2*\u01b8\3\2\2\2,\u01bd\3\2\2\2.\u01bf\3\2\2\2\60"+
		"\u01ca\3\2\2\2\62\u01dd\3\2\2\2\64\u01eb\3\2\2\2\66\u01fb\3\2\2\28\u01ff"+
		"\3\2\2\2:\u0201\3\2\2\2<\u020e\3\2\2\2>\u021d\3\2\2\2@\u0229\3\2\2\2B"+
		"\u022d\3\2\2\2D\u0230\3\2\2\2F\u0239\3\2\2\2H\u023b\3\2\2\2J\u0259\3\2"+
		"\2\2L\u025b\3\2\2\2N\u0266\3\2\2\2P\u0272\3\2\2\2R\u027a\3\2\2\2T\u0286"+
		"\3\2\2\2V\u029e\3\2\2\2X\u02ae\3\2\2\2Z\u02b7\3\2\2\2\\\u02bd\3\2\2\2"+
		"^\u02bf\3\2\2\2`\u02c2\3\2\2\2b\u02c4\3\2\2\2d\u02cb\3\2\2\2f\u02d1\3"+
		"\2\2\2h\u02d9\3\2\2\2j\u02dd\3\2\2\2l\u02ef\3\2\2\2n\u02f1\3\2\2\2p\u0310"+
		"\3\2\2\2r\u0346\3\2\2\2t\u034a\3\2\2\2v\u034e\3\2\2\2x\u0353\3\2\2\2z"+
		"\u035d\3\2\2\2|\u0361\3\2\2\2~\u0367\3\2\2\2\u0080\u0370\3\2\2\2\u0082"+
		"\u0376\3\2\2\2\u0084\u037f\3\2\2\2\u0086\u038b\3\2\2\2\u0088\u0390\3\2"+
		"\2\2\u008a\u039a\3\2\2\2\u008c\u039d\3\2\2\2\u008e\u03a1\3\2\2\2\u0090"+
		"\u03a5\3\2\2\2\u0092\u03b0\3\2\2\2\u0094\u03b4\3\2\2\2\u0096\u03b6\3\2"+
		"\2\2\u0098\u03ba\3\2\2\2\u009a\u03d2\3\2\2\2\u009c\u03e2\3\2\2\2\u009e"+
		"\u0405\3\2\2\2\u00a0\u0407\3\2\2\2\u00a2\u0409\3\2\2\2\u00a4\u0410\3\2"+
		"\2\2\u00a6\u0412\3\2\2\2\u00a8\u041a\3\2\2\2\u00aa\u041d\3\2\2\2\u00ac"+
		"\u0426\3\2\2\2\u00ae\u0430\3\2\2\2\u00b0\u0435\3\2\2\2\u00b2\u043f\3\2"+
		"\2\2\u00b4\u0458\3\2\2\2\u00b6\u045d\3\2\2\2\u00b8\u0469\3\2\2\2\u00ba"+
		"\u0471\3\2\2\2\u00bc\u0484\3\2\2\2\u00be\u0486\3\2\2\2\u00c0\u0493\3\2"+
		"\2\2\u00c2\u0495\3\2\2\2\u00c4\u04ae\3\2\2\2\u00c6\u04b2\3\2\2\2\u00c8"+
		"\u04bc\3\2\2\2\u00ca\u04c1\3\2\2\2\u00cc\u04c3\3\2\2\2\u00ce\u04c5\3\2"+
		"\2\2\u00d0\u04cf\3\2\2\2\u00d2\u04d1\3\2\2\2\u00d4\u04f0\3\2\2\2\u00d6"+
		"\u04f3\3\2\2\2\u00d8\u04fa\3\2\2\2\u00da\u0502\3\2\2\2\u00dc\u0507\3\2"+
		"\2\2\u00de\u0543\3\2\2\2\u00e0\u0547\3\2\2\2\u00e2\u0549\3\2\2\2\u00e4"+
		"\u054c\3\2\2\2\u00e6\u00e8\5\u00e2r\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ef\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00ee\5\4\3\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2\u00f6\5\6\4\2\u00f3\u00f5\5\6\4\2\u00f4\u00f3\3\2"+
		"\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\2\2\3\u00fa\3\3\2\2\2"+
		"\u00fb\u00ff\7\4\2\2\u00fc\u00fd\5\u00caf\2\u00fd\u00fe\7C\2\2\u00fe\u0100"+
		"\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\5\u0090I\2\u0102\5\3\2\2\2\u0103\u010c\5\b\5\2\u0104\u010c\5\n"+
		"\6\2\u0105\u010c\5\f\7\2\u0106\u010c\5\16\b\2\u0107\u010c\5\24\13\2\u0108"+
		"\u010c\5\26\f\2\u0109\u010c\5\30\r\2\u010a\u010c\5\32\16\2\u010b\u0103"+
		"\3\2\2\2\u010b\u0104\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0106\3\2\2\2\u010b"+
		"\u0107\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2"+
		"\2\2\u010c\7\3\2\2\2\u010d\u010e\7\6\2\2\u010e\u010f\5\34\17\2\u010f\u0110"+
		"\58\35\2\u0110\u0111\7\26\2\2\u0111\t\3\2\2\2\u0112\u0113\5h\65\2\u0113"+
		"\u0114\7\13\2\2\u0114\u0115\5N(\2\u0115\13\3\2\2\2\u0116\u0117\t\2\2\2"+
		"\u0117\u0119\5\u00caf\2\u0118\u011a\5\36\20\2\u0119\u0118\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\5V,\2\u011c\u011d\7+\2"+
		"\2\u011d\u011e\5\u00caf\2\u011e\r\3\2\2\2\u011f\u0120\7(\2\2\u0120\u0122"+
		"\5\u00caf\2\u0121\u0123\5\36\20\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0124\3\2\2\2\u0124\u0128\5Z.\2\u0125\u0127\5\20\t\2\u0126"+
		"\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7+\2\2\u012c"+
		"\u012d\5\u00caf\2\u012d\17\3\2\2\2\u012e\u012f\7*\2\2\u012f\u0133\5\u00ca"+
		"f\2\u0130\u0132\5\22\n\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0136\u0137\7+\2\2\u0137\u0138\5\u00caf\2\u0138\21\3\2\2\2\u0139"+
		"\u013e\5\f\7\2\u013a\u013e\5\16\b\2\u013b\u013e\5\24\13\2\u013c\u013e"+
		"\5\30\r\2\u013d\u0139\3\2\2\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2"+
		"\u013d\u013c\3\2\2\2\u013e\23\3\2\2\2\u013f\u0140\7\'\2\2\u0140\u0142"+
		"\5\u00caf\2\u0141\u0143\5\36\20\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0145\5\u00aaV\2\u0145\u0146\7+\2\2\u0146"+
		"\u0147\5\u00caf\2\u0147\25\3\2\2\2\u0148\u0149\7;\2\2\u0149\u014d\5\u0090"+
		"I\2\u014a\u014c\5\u00e2r\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u0150\u0152\5\u00e4s\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\5\u00d6l\2\u0154\u0155\7+\2\2\u0155\u0156\5"+
		"\u0090I\2\u0156\27\3\2\2\2\u0157\u0158\7)\2\2\u0158\u0159\7\32\2\2\u0159"+
		"\u015a\5\u00caf\2\u015a\u015c\5\u00caf\2\u015b\u015d\5\36\20\2\u015c\u015b"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\5\u00caf"+
		"\2\u015f\u0160\7\33\2\2\u0160\u0161\5V,\2\u0161\u0162\7+\2\2\u0162\u0163"+
		"\5\u00caf\2\u0163\31\3\2\2\2\u0164\u0165\7\n\2\2\u0165\u0166\5\u00caf"+
		"\2\u0166\u0167\5n8\2\u0167\33\3\2\2\2\u0168\u0169\5\u00caf\2\u0169\u016a"+
		"\7\22\2\2\u016a\35\3\2\2\2\u016b\u016c\7\20\2\2\u016c\u0171\7\36\2\2\u016d"+
		"\u016f\5\34\17\2\u016e\u0170\7\27\2\2\u016f\u016e\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016d\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\7\37"+
		"\2\2\u0176\37\3\2\2\2\u0177\u0185\5\"\22\2\u0178\u0185\5\u0090I\2\u0179"+
		"\u0185\5\u0084C\2\u017a\u0185\5\66\34\2\u017b\u0185\5<\37\2\u017c\u0185"+
		"\5:\36\2\u017d\u0185\5> \2\u017e\u017f\7\32\2\2\u017f\u0180\5H%\2\u0180"+
		"\u0181\7\33\2\2\u0181\u0185\3\2\2\2\u0182\u0185\5\u009aN\2\u0183\u0185"+
		"\5\u00a6T\2\u0184\u0177\3\2\2\2\u0184\u0178\3\2\2\2\u0184\u0179\3\2\2"+
		"\2\u0184\u017a\3\2\2\2\u0184\u017b\3\2\2\2\u0184\u017c\3\2\2\2\u0184\u017d"+
		"\3\2\2\2\u0184\u017e\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185"+
		"!\3\2\2\2\u0186\u0188\7\r\2\2\u0187\u0189\5\u00d0i\2\u0188\u0187\3\2\2"+
		"\2\u0188\u0189\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u018c\7\17\2\2\u018b"+
		"\u0186\3\2\2\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\5$"+
		"\23\2\u018e\u0190\7\23\2\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0192\3\2\2\2\u0191\u0193\5R*\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2"+
		"\2\u0193\u0199\3\2\2\2\u0194\u0195\7\16\2\2\u0195\u0196\5\u00ccg\2\u0196"+
		"\u0197\5$\23\2\u0197\u0199\3\2\2\2\u0198\u018b\3\2\2\2\u0198\u0194\3\2"+
		"\2\2\u0199#\3\2\2\2\u019a\u019c\5(\25\2\u019b\u019a\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c\u01a0\3\2\2\2\u019d\u019f\5&\24\2\u019e\u019d\3\2\2\2\u019f"+
		"\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1%\3\2\2\2"+
		"\u01a2\u01a0\3\2\2\2\u01a3\u01a5\7\24\2\2\u01a4\u01a6\5(\25\2\u01a5\u01a4"+
		"\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\'\3\2\2\2\u01a7\u01a8\7\32\2\2\u01a8"+
		"\u01ad\5*\26\2\u01a9\u01aa\7\26\2\2\u01aa\u01ac\5*\26\2\u01ab\u01a9\3"+
		"\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\7\33\2\2\u01b1)\3\2\2\2"+
		"\u01b2\u01b9\5,\27\2\u01b3\u01b9\5.\30\2\u01b4\u01b9\5\60\31\2\u01b5\u01b9"+
		"\5\34\17\2\u01b6\u01b9\5\u00caf\2\u01b7\u01b9\5\62\32\2\u01b8\u01b2\3"+
		"\2\2\2\u01b8\u01b3\3\2\2\2\u01b8\u01b4\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9+\3\2\2\2\u01ba\u01be\5\"\22\2"+
		"\u01bb\u01be\5\u009aN\2\u01bc\u01be\5\u0084C\2\u01bd\u01ba\3\2\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be-\3\2\2\2\u01bf\u01c0\7\34\2\2"+
		"\u01c0\u01c5\5,\27\2\u01c1\u01c2\7\27\2\2\u01c2\u01c4\5,\27\2\u01c3\u01c1"+
		"\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7\35\2\2\u01c9/\3\2\2\2"+
		"\u01ca\u01d9\7\36\2\2\u01cb\u01ce\5\34\17\2\u01cc\u01ce\5H%\2\u01cd\u01cb"+
		"\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01d6\3\2\2\2\u01cf\u01d2\7\27\2\2"+
		"\u01d0\u01d3\5\34\17\2\u01d1\u01d3\5H%\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1"+
		"\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01cf\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2"+
		"\2\2\u01d9\u01cd\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01dc\7\37\2\2\u01dc\61\3\2\2\2\u01dd\u01de\7I\2\2\u01de\u01df\7\36\2"+
		"\2\u01df\u01e4\5\64\33\2\u01e0\u01e1\7\27\2\2\u01e1\u01e3\5\64\33\2\u01e2"+
		"\u01e0\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\7\37\2\2\u01e8"+
		"\u01e9\7H\2\2\u01e9\u01ea\5 \21\2\u01ea\63\3\2\2\2\u01eb\u01ec\5\34\17"+
		"\2\u01ec\u01ed\5P)\2\u01ed\65\3\2\2\2\u01ee\u01ef\7\34\2\2\u01ef\u01fc"+
		"\7\35\2\2\u01f0\u01f1\7\34\2\2\u01f1\u01f6\5D#\2\u01f2\u01f3\7\27\2\2"+
		"\u01f3\u01f5\5D#\2\u01f4\u01f2\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4"+
		"\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9"+
		"\u01fa\7\35\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01ee\3\2\2\2\u01fb\u01f0\3"+
		"\2\2\2\u01fc\67\3\2\2\2\u01fd\u0200\5b\62\2\u01fe\u0200\5h\65\2\u01ff"+
		"\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u02009\3\2\2\2\u0201\u020a\7\36\2\2"+
		"\u0202\u0207\5F$\2\u0203\u0204\7\27\2\2\u0204\u0206\5F$\2\u0205\u0203"+
		"\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u0202\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u020c\3\2\2\2\u020c\u020d\7\37\2\2\u020d;\3\2\2\2\u020e\u020f"+
		"\7\36\2\2\u020f\u0218\78\2\2\u0210\u0215\5B\"\2\u0211\u0212\7\27\2\2\u0212"+
		"\u0214\5B\"\2\u0213\u0211\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2"+
		"\2\2\u0215\u0216\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0218"+
		"\u0210\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\78"+
		"\2\2\u021b\u021c\7\37\2\2\u021c=\3\2\2\2\u021d\u021e\7 \2\2\u021e\u0222"+
		"\5@!\2\u021f\u0221\5@!\2\u0220\u021f\3\2\2\2\u0221\u0224\3\2\2\2\u0222"+
		"\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2"+
		"\2\2\u0225\u0226\7Y\2\2\u0226?\3\2\2\2\u0227\u022a\7W\2\2\u0228\u022a"+
		"\5\u00a4S\2\u0229\u0227\3\2\2\2\u0229\u0228\3\2\2\2\u022aA\3\2\2\2\u022b"+
		"\u022e\5:\36\2\u022c\u022e\58\35\2\u022d\u022b\3\2\2\2\u022d\u022c\3\2"+
		"\2\2\u022eC\3\2\2\2\u022f\u0231\7H\2\2\u0230\u022f\3\2\2\2\u0230\u0231"+
		"\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\58\35\2\u0233E\3\2\2\2\u0234"+
		"\u023a\5H%\2\u0235\u0237\7H\2\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2"+
		"\2\u0237\u0238\3\2\2\2\u0238\u023a\58\35\2\u0239\u0234\3\2\2\2\u0239\u0236"+
		"\3\2\2\2\u023aG\3\2\2\2\u023b\u023c\5\34\17\2\u023c\u023d\58\35\2\u023d"+
		"I\3\2\2\2\u023e\u025a\5P)\2\u023f\u025a\5 \21\2\u0240\u0242\7#\2\2\u0241"+
		"\u0243\5\u00caf\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244"+
		"\3\2\2\2\u0244\u0245\7\32\2\2\u0245\u0246\5V,\2\u0246\u0248\7#\2\2\u0247"+
		"\u0249\5\u00caf\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a"+
		"\3\2\2\2\u024a\u024b\7\33\2\2\u024b\u025a\3\2\2\2\u024c\u024e\7#\2\2\u024d"+
		"\u024f\5\u00caf\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250"+
		"\3\2\2\2\u0250\u0251\5L\'\2\u0251\u0252\7\32\2\2\u0252\u0253\5V,\2\u0253"+
		"\u0255\7#\2\2\u0254\u0256\5\u00caf\2\u0255\u0254\3\2\2\2\u0255\u0256\3"+
		"\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\7\33\2\2\u0258\u025a\3\2\2\2\u0259"+
		"\u023e\3\2\2\2\u0259\u023f\3\2\2\2\u0259\u0240\3\2\2\2\u0259\u024c\3\2"+
		"\2\2\u025aK\3\2\2\2\u025b\u025c\7\34\2\2\u025c\u0261\5\u00caf\2\u025d"+
		"\u025e\7\26\2\2\u025e\u0260\5\u00caf\2\u025f\u025d\3\2\2\2\u0260\u0263"+
		"\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263"+
		"\u0261\3\2\2\2\u0264\u0265\7\35\2\2\u0265M\3\2\2\2\u0266\u0270\7\f\2\2"+
		"\u0267\u0268\5\u00d0i\2\u0268\u026a\5$\23\2\u0269\u026b\7\23\2\2\u026a"+
		"\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d\3\2\2\2\u026c\u026e\5R"+
		"*\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0271\3\2\2\2\u026f"+
		"\u0271\7\5\2\2\u0270\u0267\3\2\2\2\u0270\u026f\3\2\2\2\u0271O\3\2\2\2"+
		"\u0272\u0273\5\u00d0i\2\u0273\u0275\5$\23\2\u0274\u0276\7\23\2\2\u0275"+
		"\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0279\5R"+
		"*\2\u0278\u0277\3\2\2\2\u0278\u0279\3\2\2\2\u0279Q\3\2\2\2\u027a\u027b"+
		"\7\20\2\2\u027b\u0280\7\36\2\2\u027c\u027e\5T+\2\u027d\u027f\7\27\2\2"+
		"\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280\u027c"+
		"\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0284\3\2\2\2\u0284\u0285\7\37\2\2\u0285S\3\2\2\2\u0286\u0290\5\34\17"+
		"\2\u0287\u0291\5h\65\2\u0288\u0291\5P)\2\u0289\u028a\7\22\2\2\u028a\u028f"+
		"\5(\25\2\u028b\u028c\7\22\2\2\u028c\u028d\7\32\2\2\u028d\u028f\7\33\2"+
		"\2\u028e\u0289\3\2\2\2\u028e\u028b\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u0287"+
		"\3\2\2\2\u0290\u0288\3\2\2\2\u0290\u028e\3\2\2\2\u0291U\3\2\2\2\u0292"+
		"\u0296\5Z.\2\u0293\u0295\5X-\2\u0294\u0293\3\2\2\2\u0295\u0298\3\2\2\2"+
		"\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029f\3\2\2\2\u0298\u0296"+
		"\3\2\2\2\u0299\u029b\5X-\2\u029a\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c"+
		"\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u0292\3\2"+
		"\2\2\u029e\u029a\3\2\2\2\u029fW\3\2\2\2\u02a0\u02a1\5n8\2\u02a1\u02a2"+
		"\5Z.\2\u02a2\u02af\3\2\2\2\u02a3\u02a5\7\7\2\2\u02a4\u02a3\3\2\2\2\u02a4"+
		"\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8\5n8\2\u02a7\u02a9\7\b\2"+
		"\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab"+
		"\5Z.\2\u02ab\u02af\3\2\2\2\u02ac\u02ad\7\t\2\2\u02ad\u02af\5Z.\2\u02ae"+
		"\u02a0\3\2\2\2\u02ae\u02a4\3\2\2\2\u02ae\u02ac\3\2\2\2\u02afY\3\2\2\2"+
		"\u02b0\u02b2\5\\/\2\u02b1\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b1"+
		"\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b8\3\2\2\2\u02b5\u02b6\7\f\2\2\u02b6"+
		"\u02b8\7\5\2\2\u02b7\u02b1\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8[\3\2\2\2"+
		"\u02b9\u02be\5`\61\2\u02ba\u02be\5d\63\2\u02bb\u02be\5b\62\2\u02bc\u02be"+
		"\5^\60\2\u02bd\u02b9\3\2\2\2\u02bd\u02ba\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd"+
		"\u02bc\3\2\2\2\u02be]\3\2\2\2\u02bf\u02c0\5h\65\2\u02c0\u02c1\7\f\2\2"+
		"\u02c1_\3\2\2\2\u02c2\u02c3\5\6\4\2\u02c3a\3\2\2\2\u02c4\u02c5\5h\65\2"+
		"\u02c5\u02c6\7\13\2\2\u02c6\u02c7\7/\2\2\u02c7c\3\2\2\2\u02c8\u02c9\5"+
		"h\65\2\u02c9\u02ca\7\13\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02c8\3\2\2\2\u02cb"+
		"\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\5f\64\2\u02cee\3\2\2\2"+
		"\u02cf\u02d0\7\60\2\2\u02d0\u02d2\78\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2"+
		"\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\5\u00ccg\2\u02d4\u02d5\5$\23"+
		"\2\u02d5\u02d6\7\22\2\2\u02d6\u02d7\58\35\2\u02d7\u02d8\7\26\2\2\u02d8"+
		"g\3\2\2\2\u02d9\u02db\5 \21\2\u02da\u02dc\5l\67\2\u02db\u02da\3\2\2\2"+
		"\u02db\u02dc\3\2\2\2\u02dci\3\2\2\2\u02dd\u02de\7\13\2\2\u02de\u02df\7"+
		"\60\2\2\u02df\u02e0\7\67\2\2\u02e0\u02e1\5P)\2\u02e1k\3\2\2\2\u02e2\u02e3"+
		"\7\13\2\2\u02e3\u02e5\5J&\2\u02e4\u02e6\5l\67\2\u02e5\u02e4\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02f0\3\2\2\2\u02e7\u02e9\7\30\2\2\u02e8\u02ea\5"+
		"l\67\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02f0\3\2\2\2\u02eb"+
		"\u02ed\5j\66\2\u02ec\u02ee\5l\67\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2"+
		"\2\2\u02ee\u02f0\3\2\2\2\u02ef\u02e2\3\2\2\2\u02ef\u02e7\3\2\2\2\u02ef"+
		"\u02eb\3\2\2\2\u02f0m\3\2\2\2\u02f1\u02fd\7!\2\2\u02f2\u02f4\7\31\2\2"+
		"\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02fa"+
		"\5p9\2\u02f6\u02f7\78\2\2\u02f7\u02f9\5p9\2\u02f8\u02f6\3\2\2\2\u02f9"+
		"\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fe\3\2"+
		"\2\2\u02fc\u02fa\3\2\2\2\u02fd\u02f3\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe"+
		"\u02ff\3\2\2\2\u02ff\u0300\79\2\2\u0300o\3\2\2\2\u0301\u0304\5z>\2\u0302"+
		"\u0304\5r:\2\u0303\u0301\3\2\2\2\u0303\u0302\3\2\2\2\u0304\u0308\3\2\2"+
		"\2\u0305\u0307\5~@\2\u0306\u0305\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306"+
		"\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u0311\3\2\2\2\u030a\u0308\3\2\2\2\u030b"+
		"\u030d\5~@\2\u030c\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030c\3\2\2"+
		"\2\u030e\u030f\3\2\2\2\u030f\u0311\3\2\2\2\u0310\u0303\3\2\2\2\u0310\u030c"+
		"\3\2\2\2\u0311q\3\2\2\2\u0312\u0347\5|?\2\u0313\u0347\5\u0090I\2\u0314"+
		"\u031c\7\36\2\2\u0315\u0316\5\34\17\2\u0316\u0318\5t;\2\u0317\u0319\7"+
		"\27\2\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031b\3\2\2\2\u031a"+
		"\u0315\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2"+
		"\2\2\u031d\u0323\3\2\2\2\u031e\u031c\3\2\2\2\u031f\u0321\7\27\2\2\u0320"+
		"\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0324\7\5"+
		"\2\2\u0323\u0320\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325\3\2\2\2\u0325"+
		"\u0347\7\37\2\2\u0326\u0328\7\34\2\2\u0327\u0329\5v<\2\u0328\u0327\3\2"+
		"\2\2\u0328\u0329\3\2\2\2\u0329\u032e\3\2\2\2\u032a\u032b\7\27\2\2\u032b"+
		"\u032d\5v<\2\u032c\u032a\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2\2"+
		"\2\u032e\u032f\3\2\2\2\u032f\u0335\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u0333"+
		"\7\27\2\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\3\2\2\2"+
		"\u0334\u0336\7\5\2\2\u0335\u0332\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337"+
		"\3\2\2\2\u0337\u033f\7\35\2\2\u0338\u033b\7\32\2\2\u0339\u033c\5|?\2\u033a"+
		"\u033c\5\u009aN\2\u033b\u0339\3\2\2\2\u033b\u033a\3\2\2\2\u033c\u033d"+
		"\3\2\2\2\u033d\u033e\7\33\2\2\u033e\u0340\3\2\2\2\u033f\u0338\3\2\2\2"+
		"\u033f\u0340\3\2\2\2\u0340\u0347\3\2\2\2\u0341\u0344\5\u00caf\2\u0342"+
		"\u0344\5\u00ceh\2\u0343\u0341\3\2\2\2\u0343\u0342\3\2\2\2\u0344\u0347"+
		"\3\2\2\2\u0345\u0347\5\u0088E\2\u0346\u0312\3\2\2\2\u0346\u0313\3\2\2"+
		"\2\u0346\u0314\3\2\2\2\u0346\u0326\3\2\2\2\u0346\u0343\3\2\2\2\u0346\u0345"+
		"\3\2\2\2\u0347s\3\2\2\2\u0348\u034b\5n8\2\u0349\u034b\7\5\2\2\u034a\u0348"+
		"\3\2\2\2\u034a\u0349\3\2\2\2\u034bu\3\2\2\2\u034c\u034f\5n8\2\u034d\u034f"+
		"\5x=\2\u034e\u034c\3\2\2\2\u034e\u034d\3\2\2\2\u034f\u0351\3\2\2\2\u0350"+
		"\u0352\5\u00c0a\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352w\3\2\2"+
		"\2\u0353\u0354\7\32\2\2\u0354\u0357\5n8\2\u0355\u0356\7\22\2\2\u0356\u0358"+
		"\5n8\2\u0357\u0355\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u0357\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\7\33\2\2\u035cy\3\2\2\2"+
		"\u035d\u035e\7\67\2\2\u035e\u035f\5 \21\2\u035f{\3\2\2\2\u0360\u0362\5"+
		"\u0080A\2\u0361\u0360\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363\3\2\2\2"+
		"\u0363\u0365\7\60\2\2\u0364\u0366\5\u0082B\2\u0365\u0364\3\2\2\2\u0365"+
		"\u0366\3\2\2\2\u0366}\3\2\2\2\u0367\u0368\7:\2\2\u0368\u0369\5h\65\2\u0369"+
		"\u036a\5n8\2\u036a\u036b\7\33\2\2\u036b\177\3\2\2\2\u036c\u0371\5\"\22"+
		"\2\u036d\u0371\5\u009aN\2\u036e\u0371\5\u0090I\2\u036f\u0371\5\u00a4S"+
		"\2\u0370\u036c\3\2\2\2\u0370\u036d\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u036f"+
		"\3\2\2\2\u0371\u0373\3\2\2\2\u0372\u0374\7\31\2\2\u0373\u0372\3\2\2\2"+
		"\u0373\u0374\3\2\2\2\u0374\u0081\3\2\2\2\u0375\u0377\7\31\2\2\u0376\u0375"+
		"\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u037c\3\2\2\2\u0378\u037d\5\"\22\2"+
		"\u0379\u037d\5\u009aN\2\u037a\u037d\5\u0090I\2\u037b\u037d\5\u00a4S\2"+
		"\u037c\u0378\3\2\2\2\u037c\u0379\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037b"+
		"\3\2\2\2\u037d\u0083\3\2\2\2\u037e\u0380\5\u0080A\2\u037f\u037e\3\2\2"+
		"\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0383\7\60\2\2\u0382"+
		"\u0384\5\u0082B\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0387"+
		"\3\2\2\2\u0385\u0386\7\22\2\2\u0386\u0388\5\u009aN\2\u0387\u0385\3\2\2"+
		"\2\u0387\u0388\3\2\2\2\u0388\u0085\3\2\2\2\u0389\u038c\7J\2\2\u038a\u038c"+
		"\5\u008eH\2\u038b\u0389\3\2\2\2\u038b\u038a\3\2\2\2\u038c\u038e\3\2\2"+
		"\2\u038d\u038f\5\u0088E\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f"+
		"\u0087\3\2\2\2\u0390\u0391\7\"\2\2\u0391\u0393\5\u008aF\2\u0392\u0394"+
		"\5\u008cG\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2\2"+
		"\2\u0395\u0396\7\"\2\2\u0396\u0089\3\2\2\2\u0397\u0399\5\u00caf\2\u0398"+
		"\u0397\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2"+
		"\2\2\u039b\u008b\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u039e\7\21\2\2\u039e"+
		"\u039f\5\u008aF\2\u039f\u008d\3\2\2\2\u03a0\u03a2\5\u00a0Q\2\u03a1\u03a0"+
		"\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4\7K\2\2\u03a4"+
		"\u008f\3\2\2\2\u03a5\u03a9\7L\2\2\u03a6\u03a8\5\u0092J\2\u03a7\u03a6\3"+
		"\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u03ac\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac\u03ad\7V\2\2\u03ad\u0091\3\2"+
		"\2\2\u03ae\u03b1\5\u0094K\2\u03af\u03b1\7U\2\2\u03b0\u03ae\3\2\2\2\u03b0"+
		"\u03af\3\2\2\2\u03b1\u0093\3\2\2\2\u03b2\u03b5\5\u0098M\2\u03b3\u03b5"+
		"\5\u0096L\2\u03b4\u03b2\3\2\2\2\u03b4\u03b3\3\2\2\2\u03b5\u0095\3\2\2"+
		"\2\u03b6\u03b7\7S\2\2\u03b7\u03b8\5\u009aN\2\u03b8\u03b9\7\25\2\2\u03b9"+
		"\u0097\3\2\2\2\u03ba\u03c7\7T\2\2\u03bb\u03bd\5\u00d0i\2\u03bc\u03bb\3"+
		"\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\5$\23\2\u03bf"+
		"\u03c1\7\23\2\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3\3"+
		"\2\2\2\u03c2\u03c4\5R*\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4"+
		"\u03c8\3\2\2\2\u03c5\u03c6\7\22\2\2\u03c6\u03c8\5 \21\2\u03c7\u03bc\3"+
		"\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03cb\5l\67\2\u03ca"+
		"\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03ce\3\2\2\2\u03cc\u03cd\7\13"+
		"\2\2\u03cd\u03cf\7/\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf"+
		"\u03d0\3\2\2\2\u03d0\u03d1\7\25\2\2\u03d1\u0099\3\2\2\2\u03d2\u03d3\5"+
		"\u009cO\2\u03d3\u009b\3\2\2\2\u03d4\u03d5\bO\1\2\u03d5\u03e3\5\u0086D"+
		"\2\u03d6\u03d7\7\32\2\2\u03d7\u03d8\5\u009cO\2\u03d8\u03da\7\33\2\2\u03d9"+
		"\u03db\5\u0088E\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03e3"+
		"\3\2\2\2\u03dc\u03de\5\u00a0Q\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2"+
		"\2\u03de\u03df\3\2\2\2\u03df\u03e3\5\"\22\2\u03e0\u03e3\5\u00d2j\2\u03e1"+
		"\u03e3\5\u009eP\2\u03e2\u03d4\3\2\2\2\u03e2\u03d6\3\2\2\2\u03e2\u03dd"+
		"\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e1\3\2\2\2\u03e3\u03f6\3\2\2\2\u03e4"+
		"\u03e5\f\b\2\2\u03e5\u03e6\5\u00a2R\2\u03e6\u03e7\5\u009cO\t\u03e7\u03f5"+
		"\3\2\2\2\u03e8\u03e9\f\7\2\2\u03e9\u03ea\5\u00a0Q\2\u03ea\u03eb\5\u009c"+
		"O\b\u03eb\u03f5\3\2\2\2\u03ec\u03ed\f\5\2\2\u03ed\u03ee\5\u00a2R\2\u03ee"+
		"\u03ef\5\u00a4S\2\u03ef\u03f5\3\2\2\2\u03f0\u03f1\f\4\2\2\u03f1\u03f2"+
		"\5\u00a0Q\2\u03f2\u03f3\5\u00a4S\2\u03f3\u03f5\3\2\2\2\u03f4\u03e4\3\2"+
		"\2\2\u03f4\u03e8\3\2\2\2\u03f4\u03ec\3\2\2\2\u03f4\u03f0\3\2\2\2\u03f5"+
		"\u03f8\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u009d\3\2"+
		"\2\2\u03f8\u03f6\3\2\2\2\u03f9\u03fa\5\u00a4S\2\u03fa\u03fd\5\u00a2R\2"+
		"\u03fb\u03fe\5\u00a4S\2\u03fc\u03fe\5\u009cO\2\u03fd\u03fb\3\2\2\2\u03fd"+
		"\u03fc\3\2\2\2\u03fe\u0406\3\2\2\2\u03ff\u0400\5\u00a4S\2\u0400\u0403"+
		"\5\u00a0Q\2\u0401\u0404\5\u00a4S\2\u0402\u0404\5\u009cO\2\u0403\u0401"+
		"\3\2\2\2\u0403\u0402\3\2\2\2\u0404\u0406\3\2\2\2\u0405\u03f9\3\2\2\2\u0405"+
		"\u03ff\3\2\2\2\u0406\u009f\3\2\2\2\u0407\u0408\t\3\2\2\u0408\u00a1\3\2"+
		"\2\2\u0409\u040a\t\4\2\2\u040a\u00a3\3\2\2\2\u040b\u040c\7\32\2\2\u040c"+
		"\u040d\58\35\2\u040d\u040e\7\33\2\2\u040e\u0411\3\2\2\2\u040f\u0411\5"+
		"\u00a6T\2\u0410\u040b\3\2\2\2\u0410\u040f\3\2\2\2\u0411\u00a5\3\2\2\2"+
		"\u0412\u0413\7\32\2\2\u0413\u0414\5\u00a8U\2\u0414\u0415\5P)\2\u0415\u0416"+
		"\5\u00a8U\2\u0416\u0417\7\33\2\2\u0417\u00a7\3\2\2\2\u0418\u041b\5 \21"+
		"\2\u0419\u041b\5\u00a4S\2\u041a\u0418\3\2\2\2\u041a\u0419\3\2\2\2\u041b"+
		"\u00a9\3\2\2\2\u041c\u041e\5d\63\2\u041d\u041c\3\2\2\2\u041d\u041e\3\2"+
		"\2\2\u041e\u041f\3\2\2\2\u041f\u0423\5\u00aeX\2\u0420\u0422\5\u00acW\2"+
		"\u0421\u0420\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424"+
		"\3\2\2\2\u0424\u00ab\3\2\2\2\u0425\u0423\3\2\2\2\u0426\u0427\7,\2\2\u0427"+
		"\u0428\5\34\17\2\u0428\u0429\5\u00aeX\2\u0429\u00ad\3\2\2\2\u042a\u0431"+
		"\5\u00b0Y\2\u042b\u042d\5\u00c2b\2\u042c\u042b\3\2\2\2\u042d\u042e\3\2"+
		"\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0431\3\2\2\2\u0430"+
		"\u042a\3\2\2\2\u0430\u042c\3\2\2\2\u0431\u00af\3\2\2\2\u0432\u0434\5\u00c2"+
		"b\2\u0433\u0432\3\2\2\2\u0434\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0435"+
		"\u0436\3\2\2\2\u0436\u0438\3\2\2\2\u0437\u0435\3\2\2\2\u0438\u043d\5\u00b2"+
		"Z\2\u0439\u043b\7\27\2\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b"+
		"\u043c\3\2\2\2\u043c\u043e\5\u00b0Y\2\u043d\u043a\3\2\2\2\u043d\u043e"+
		"\3\2\2\2\u043e\u00b1\3\2\2\2\u043f\u0441\5\u00b4[\2\u0440\u0442\5l\67"+
		"\2\u0441\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0446\3\2\2\2\u0443\u0445"+
		"\5\u00c2b\2\u0444\u0443\3\2\2\2\u0445\u0448\3\2\2\2\u0446\u0444\3\2\2"+
		"\2\u0446\u0447\3\2\2\2\u0447\u00b3\3\2\2\2\u0448\u0446\3\2\2\2\u0449\u0459"+
		"\5\u00ba^\2\u044a\u044d\7\34\2\2\u044b\u044e\5\u00aeX\2\u044c\u044e\5"+
		"\u00c2b\2\u044d\u044b\3\2\2\2\u044d\u044c\3\2\2\2\u044d\u044e\3\2\2\2"+
		"\u044e\u044f\3\2\2\2\u044f\u0459\7\35\2\2\u0450\u0453\7\36\2\2\u0451\u0454"+
		"\5\u00b6\\\2\u0452\u0454\5\u00c2b\2\u0453\u0451\3\2\2\2\u0453\u0452\3"+
		"\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0459\7\37\2\2\u0456"+
		"\u0459\5 \21\2\u0457\u0459\5\u00c6d\2\u0458\u0449\3\2\2\2\u0458\u044a"+
		"\3\2\2\2\u0458\u0450\3\2\2\2\u0458\u0456\3\2\2\2\u0458\u0457\3\2\2\2\u0459"+
		"\u00b5\3\2\2\2\u045a\u045c\5\u00c2b\2\u045b\u045a\3\2\2\2\u045c\u045f"+
		"\3\2\2\2\u045d\u045b\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u0460\3\2\2\2\u045f"+
		"\u045d\3\2\2\2\u0460\u0465\5\u00b8]\2\u0461\u0463\7\27\2\2\u0462\u0461"+
		"\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0466\5\u00b6\\"+
		"\2\u0465\u0462\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u00b7\3\2\2\2\u0467\u046a"+
		"\5\u00ba^\2\u0468\u046a\5\u00c6d\2\u0469\u0467\3\2\2\2\u0469\u0468\3\2"+
		"\2\2\u046a\u046e\3\2\2\2\u046b\u046d\5\u00c2b\2\u046c\u046b\3\2\2\2\u046d"+
		"\u0470\3\2\2\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u00b9\3\2"+
		"\2\2\u0470\u046e\3\2\2\2\u0471\u0473\7!\2\2\u0472\u0474\7\31\2\2\u0473"+
		"\u0472\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u047a\5\u00bc"+
		"_\2\u0476\u0477\78\2\2\u0477\u0479\5\u00bc_\2\u0478\u0476\3\2\2\2\u0479"+
		"\u047c\3\2\2\2\u047a\u0478\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047d\3\2"+
		"\2\2\u047c\u047a\3\2\2\2\u047d\u047f\79\2\2\u047e\u0480\5\u00c0a\2\u047f"+
		"\u047e\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u00bb\3\2\2\2\u0481\u0485\5\u00be"+
		"`\2\u0482\u0485\5\u00caf\2\u0483\u0485\5\u0090I\2\u0484\u0481\3\2\2\2"+
		"\u0484\u0482\3\2\2\2\u0484\u0483\3\2\2\2\u0485\u00bd\3\2\2\2\u0486\u0489"+
		"\7\67\2\2\u0487\u048a\5\"\22\2\u0488\u048a\5\u0090I\2\u0489\u0487\3\2"+
		"\2\2\u0489\u0488\3\2\2\2\u048a\u00bf\3\2\2\2\u048b\u0494\7\61\2\2\u048c"+
		"\u0494\7\63\2\2\u048d\u0494\7\66\2\2\u048e\u0491\7\67\2\2\u048f\u0492"+
		"\7K\2\2\u0490\u0492\5\"\22\2\u0491\u048f\3\2\2\2\u0491\u0490\3\2\2\2\u0492"+
		"\u0494\3\2\2\2\u0493\u048b\3\2\2\2\u0493\u048c\3\2\2\2\u0493\u048d\3\2"+
		"\2\2\u0493\u048e\3\2\2\2\u0494\u00c1\3\2\2\2\u0495\u0497\7\32\2\2\u0496"+
		"\u0498\5\u00c4c\2\u0497\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u0497"+
		"\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\7\33\2\2"+
		"\u049c\u00c3\3\2\2\2\u049d\u049e\7\6\2\2\u049e\u049f\5\34\17\2\u049f\u04a1"+
		"\5\u00b4[\2\u04a0\u04a2\5l\67\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2\3\2\2"+
		"\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4\7\26\2\2\u04a4\u04af\3\2\2\2\u04a5"+
		"\u04ab\5\u00b4[\2\u04a6\u04a8\5l\67\2\u04a7\u04a6\3\2\2\2\u04a7\u04a8"+
		"\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04aa\7\13\2\2\u04aa\u04ac\5f\64\2"+
		"\u04ab\u04a7\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04af\3\2\2\2\u04ad\u04af"+
		"\5d\63\2\u04ae\u049d\3\2\2\2\u04ae\u04a5\3\2\2\2\u04ae\u04ad\3\2\2\2\u04af"+
		"\u00c5\3\2\2\2\u04b0\u04b3\5\34\17\2\u04b1\u04b3\5\u00c8e\2\u04b2\u04b0"+
		"\3\2\2\2\u04b2\u04b1\3\2\2\2\u04b3\u04b7\3\2\2\2\u04b4\u04b6\5\u00c2b"+
		"\2\u04b5\u04b4\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b8"+
		"\3\2\2\2\u04b8\u04ba\3\2\2\2\u04b9\u04b7\3\2\2\2\u04ba\u04bb\5\u00b2Z"+
		"\2\u04bb\u00c7\3\2\2\2\u04bc\u04bd\5\u00ba^\2\u04bd\u04be\7\22\2\2\u04be"+
		"\u00c9\3\2\2\2\u04bf\u04c2\7N\2\2\u04c0\u04c2\5\u00d4k\2\u04c1\u04bf\3"+
		"\2\2\2\u04c1\u04c0\3\2\2\2\u04c2\u00cb\3\2\2\2\u04c3\u04c4\7M\2\2\u04c4"+
		"\u00cd\3\2\2\2\u04c5\u04c8\5\u00caf\2\u04c6\u04c7\7\21\2\2\u04c7\u04c9"+
		"\5\u00caf\2\u04c8\u04c6\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04c8\3\2\2"+
		"\2\u04ca\u04cb\3\2\2\2\u04cb\u00cf\3\2\2\2\u04cc\u04d0\5\u00ccg\2\u04cd"+
		"\u04d0\5\u00caf\2\u04ce\u04d0\5\u00ceh\2\u04cf\u04cc\3\2\2\2\u04cf\u04cd"+
		"\3\2\2\2\u04cf\u04ce\3\2\2\2\u04d0\u00d1\3\2\2\2\u04d1\u04d2\t\5\2\2\u04d2"+
		"\u00d3\3\2\2\2\u04d3\u04f1\7\4\2\2\u04d4\u04f1\7\6\2\2\u04d5\u04f1\7$"+
		"\2\2\u04d6\u04f1\7%\2\2\u04d7\u04f1\7&\2\2\u04d8\u04f1\7\'\2\2\u04d9\u04f1"+
		"\7(\2\2\u04da\u04f1\7)\2\2\u04db\u04f1\7*\2\2\u04dc\u04f1\7+\2\2\u04dd"+
		"\u04f1\7\n\2\2\u04de\u04f1\7\65\2\2\u04df\u04f1\7,\2\2\u04e0\u04f1\7\7"+
		"\2\2\u04e1\u04f1\7\b\2\2\u04e2\u04f1\7\t\2\2\u04e3\u04f1\5\u00d2j\2\u04e4"+
		"\u04f1\7;\2\2\u04e5\u04f1\7<\2\2\u04e6\u04f1\7>\2\2\u04e7\u04f1\7?\2\2"+
		"\u04e8\u04f1\7@\2\2\u04e9\u04f1\7A\2\2\u04ea\u04f1\7C\2\2\u04eb\u04f1"+
		"\7E\2\2\u04ec\u04f1\7F\2\2\u04ed\u04f1\7G\2\2\u04ee\u04f1\7H\2\2\u04ef"+
		"\u04f1\7I\2\2\u04f0\u04d3\3\2\2\2\u04f0\u04d4\3\2\2\2\u04f0\u04d5\3\2"+
		"\2\2\u04f0\u04d6\3\2\2\2\u04f0\u04d7\3\2\2\2\u04f0\u04d8\3\2\2\2\u04f0"+
		"\u04d9\3\2\2\2\u04f0\u04da\3\2\2\2\u04f0\u04db\3\2\2\2\u04f0\u04dc\3\2"+
		"\2\2\u04f0\u04dd\3\2\2\2\u04f0\u04de\3\2\2\2\u04f0\u04df\3\2\2\2\u04f0"+
		"\u04e0\3\2\2\2\u04f0\u04e1\3\2\2\2\u04f0\u04e2\3\2\2\2\u04f0\u04e3\3\2"+
		"\2\2\u04f0\u04e4\3\2\2\2\u04f0\u04e5\3\2\2\2\u04f0\u04e6\3\2\2\2\u04f0"+
		"\u04e7\3\2\2\2\u04f0\u04e8\3\2\2\2\u04f0\u04e9\3\2\2\2\u04f0\u04ea\3\2"+
		"\2\2\u04f0\u04eb\3\2\2\2\u04f0\u04ec\3\2\2\2\u04f0\u04ed\3\2\2\2\u04f0"+
		"\u04ee\3\2\2\2\u04f0\u04ef\3\2\2\2\u04f1\u00d5\3\2\2\2\u04f2\u04f4\5\u00d8"+
		"m\2\u04f3\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f5"+
		"\u04f6\3\2\2\2\u04f6\u00d7\3\2\2\2\u04f7\u04f9\5\6\4\2\u04f8\u04f7\3\2"+
		"\2\2\u04f9\u04fc\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb"+
		"\u04fe\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fd\u04ff\5\u00dan\2\u04fe\u04fd"+
		"\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u04fe\3\2\2\2\u0500\u0501\3\2\2\2\u0501"+
		"\u00d9\3\2\2\2\u0502\u0503\7<\2\2\u0503\u0504\5h\65\2\u0504\u0505\5n8"+
		"\2\u0505\u0506\5\u0090I\2\u0506\u00db\3\2\2\2\u0507\u0509\7>\2\2\u0508"+
		"\u050a\5\u00dep\2\u0509\u0508\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u0509"+
		"\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\7?\2\2\u050e"+
		"\u00dd\3\2\2\2\u050f\u0510\5\u00e0q\2\u0510\u0511\7C\2\2\u0511\u0513\3"+
		"\2\2\2\u0512\u050f\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514\3\2\2\2\u0514"+
		"\u0515\7A\2\2\u0515\u0517\5\u00e0q\2\u0516\u0518\5\u00dco\2\u0517\u0516"+
		"\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051a\3\2\2\2\u0519\u051b\5\6\4\2\u051a"+
		"\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051a\3\2\2\2\u051c\u051d\3\2"+
		"\2\2\u051d\u051e\3\2\2\2\u051e\u051f\7+\2\2\u051f\u0520\5\u00e0q\2\u0520"+
		"\u0544\3\2\2\2\u0521\u0522\5\u00e0q\2\u0522\u0525\7B\2\2\u0523\u0524\7"+
		"C\2\2\u0524\u0526\5\u00e0q\2\u0525\u0523\3\2\2\2\u0525\u0526\3\2\2\2\u0526"+
		"\u0544\3\2\2\2\u0527\u0528\5\u00e0q\2\u0528\u0529\7C\2\2\u0529\u052b\3"+
		"\2\2\2\u052a\u0527\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c\3\2\2\2\u052c"+
		"\u052d\7@\2\2\u052d\u052f\5\u0090I\2\u052e\u0530\5\u00dco\2\u052f\u052e"+
		"\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0532\3\2\2\2\u0531\u0533\5\6\4\2\u0532"+
		"\u0531\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2"+
		"\2\2\u0535\u0536\3\2\2\2\u0536\u0537\7+\2\2\u0537\u0538\5\u0090I\2\u0538"+
		"\u0544\3\2\2\2\u0539\u053a\5\u00e0q\2\u053a\u053b\7C\2\2\u053b\u053d\3"+
		"\2\2\2\u053c\u0539\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053e\3\2\2\2\u053e"+
		"\u0541\5\u0090I\2\u053f\u0542\7D\2\2\u0540\u0542\5\u00dco\2\u0541\u053f"+
		"\3\2\2\2\u0541\u0540\3\2\2\2\u0542\u0544\3\2\2\2\u0543\u0512\3\2\2\2\u0543"+
		"\u0521\3\2\2\2\u0543\u052a\3\2\2\2\u0543\u053c\3\2\2\2\u0544\u00df\3\2"+
		"\2\2\u0545\u0548\7=\2\2\u0546\u0548\5\u00caf\2\u0547\u0545\3\2\2\2\u0547"+
		"\u0546\3\2\2\2\u0548\u00e1\3\2\2\2\u0549\u054a\7E\2\2\u054a\u054b\5\u00de"+
		"p\2\u054b\u00e3\3\2\2\2\u054c\u054d\7G\2\2\u054d\u054f\7F\2\2\u054e\u0550"+
		"\5\6\4\2\u054f\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u054f\3\2\2\2\u0551"+
		"\u0552\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0554\7+\2\2\u0554\u0555\7F\2"+
		"\2\u0555\u00e5\3\2\2\2\u00bb\u00e9\u00ef\u00f6\u00ff\u010b\u0119\u0122"+
		"\u0128\u0133\u013d\u0142\u014d\u0151\u015c\u016f\u0173\u0184\u0188\u018b"+
		"\u018f\u0192\u0198\u019b\u01a0\u01a5\u01ad\u01b8\u01bd\u01c5\u01cd\u01d2"+
		"\u01d6\u01d9\u01e4\u01f6\u01fb\u01ff\u0207\u020a\u0215\u0218\u0222\u0229"+
		"\u022d\u0230\u0236\u0239\u0242\u0248\u024e\u0255\u0259\u0261\u026a\u026d"+
		"\u0270\u0275\u0278\u027e\u0282\u028e\u0290\u0296\u029c\u029e\u02a4\u02a8"+
		"\u02ae\u02b3\u02b7\u02bd\u02cb\u02d1\u02db\u02e5\u02e9\u02ed\u02ef\u02f3"+
		"\u02fa\u02fd\u0303\u0308\u030e\u0310\u0318\u031c\u0320\u0323\u0328\u032e"+
		"\u0332\u0335\u033b\u033f\u0343\u0346\u034a\u034e\u0351\u0359\u0361\u0365"+
		"\u0370\u0373\u0376\u037c\u037f\u0383\u0387\u038b\u038e\u0393\u039a\u03a1"+
		"\u03a9\u03b0\u03b4\u03bc\u03c0\u03c3\u03c7\u03ca\u03ce\u03da\u03dd\u03e2"+
		"\u03f4\u03f6\u03fd\u0403\u0405\u0410\u041a\u041d\u0423\u042e\u0430\u0435"+
		"\u043a\u043d\u0441\u0446\u044d\u0453\u0458\u045d\u0462\u0465\u0469\u046e"+
		"\u0473\u047a\u047f\u0484\u0489\u0491\u0493\u0499\u04a1\u04a7\u04ab\u04ae"+
		"\u04b2\u04b7\u04c1\u04ca\u04cf\u04f0\u04f5\u04fa\u0500\u050b\u0512\u0517"+
		"\u051c\u0525\u052a\u052f\u0534\u053c\u0541\u0543\u0547\u0551";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}