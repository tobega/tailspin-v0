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
		LocalDefinition=9, To=10, ResultMarker=11, SourceMarker=12, DeleteMarker=13, 
		Reflexive=14, And=15, Slash=16, Colon=17, Message=18, FieldReference=19, 
		EndStringInterpolate=20, SemiColon=21, Comma=22, Deconstructor=23, Invert=24, 
		LeftParen=25, RightParen=26, LeftBracket=27, RightBracket=28, LeftBrace=29, 
		RightBrace=30, StartBytes=31, StartMatcher=32, Quote=33, Lambda=34, StartTemplatesDefinition=35, 
		StartSourceDefinition=36, StartSinkDefinition=37, StartComposerDefinition=38, 
		StartProcessorDefinition=39, StartOperatorDefinition=40, StartStateDefinition=41, 
		EndDefinition=42, Rule=43, First=44, Last=45, TemplateMatch=46, Range=47, 
		Plus=48, Minus=49, Star=50, TruncateDivide=51, Mod=52, Question=53, Equal=54, 
		Else=55, EndMatcher=56, BeginCondition=57, StartTestDefinition=58, Assert=59, 
		CoreSystem=60, With=61, Provided=62, Modified=63, Shadowed=64, Inherited=65, 
		From=66, StandAlone=67, Use=68, Program=69, Modify=70, By=71, Collect=72, 
		Scalar=73, Zero=74, PositiveInteger=75, START_STRING=76, STATE_IDENTIFIER=77, 
		IDENTIFIER=78, WS=79, Comment=80, REGEX_TEXT=81, END_REGEX=82, StartCharacterCode=83, 
		StartStringInterpolate=84, STRING_TEXT=85, END_STRING=86, Bytes=87, Bytes_WS=88, 
		EndBytes=89;
	public static final int
		RULE_program = 0, RULE_inclusion = 1, RULE_statement = 2, RULE_definition = 3, 
		RULE_valueChainToSink = 4, RULE_templatesDefinition = 5, RULE_processorDefinition = 6, 
		RULE_typestateDefinition = 7, RULE_messageDefinition = 8, RULE_composerDefinition = 9, 
		RULE_testDefinition = 10, RULE_operatorDefinition = 11, RULE_dataDefinition = 12, 
		RULE_localDataDeclaration = 13, RULE_key = 14, RULE_parameterDefinitions = 15, 
		RULE_source = 16, RULE_sourceReference = 17, RULE_reference = 18, RULE_structureReference = 19, 
		RULE_lens = 20, RULE_dimensionReference = 21, RULE_simpleDimension = 22, 
		RULE_multiValueDimension = 23, RULE_projection = 24, RULE_grouping = 25, 
		RULE_collectedValue = 26, RULE_arrayLiteral = 27, RULE_valueProduction = 28, 
		RULE_structureLiteral = 29, RULE_relationLiteral = 30, RULE_bytesLiteral = 31, 
		RULE_byteValue = 32, RULE_structures = 33, RULE_arrayExpansion = 34, RULE_structureExpansion = 35, 
		RULE_keyValue = 36, RULE_templates = 37, RULE_arrayIndexDecomposition = 38, 
		RULE_sink = 39, RULE_templatesReference = 40, RULE_parameterValues = 41, 
		RULE_parameterValue = 42, RULE_templatesBody = 43, RULE_matchTemplate = 44, 
		RULE_block = 45, RULE_blockExpression = 46, RULE_resultValue = 47, RULE_blockStatement = 48, 
		RULE_sendToTemplates = 49, RULE_stateAssignment = 50, RULE_stateSink = 51, 
		RULE_valueChain = 52, RULE_collectorChain = 53, RULE_transform = 54, RULE_matcher = 55, 
		RULE_criterion = 56, RULE_typeMatch = 57, RULE_structureContentMatcher = 58, 
		RULE_arrayContentMatcher = 59, RULE_sequenceMatch = 60, RULE_literalMatch = 61, 
		RULE_rangeBounds = 62, RULE_condition = 63, RULE_lowerBound = 64, RULE_upperBound = 65, 
		RULE_rangeLiteral = 66, RULE_integerLiteral = 67, RULE_unit = 68, RULE_measureProduct = 69, 
		RULE_measureDenominator = 70, RULE_nonZeroInteger = 71, RULE_stringLiteral = 72, 
		RULE_stringContent = 73, RULE_stringInterpolate = 74, RULE_characterCode = 75, 
		RULE_interpolateEvaluate = 76, RULE_arithmeticValue = 77, RULE_arithmeticExpression = 78, 
		RULE_termArithmeticOperation = 79, RULE_additiveOperator = 80, RULE_multiplicativeOperator = 81, 
		RULE_term = 82, RULE_operatorExpression = 83, RULE_operand = 84, RULE_composerBody = 85, 
		RULE_definedCompositionSequence = 86, RULE_compositionSequence = 87, RULE_compositionComponents = 88, 
		RULE_compositionComponent = 89, RULE_compositionMatcher = 90, RULE_structureMemberMatchers = 91, 
		RULE_structureMemberMatcher = 92, RULE_tokenMatcher = 93, RULE_compositionToken = 94, 
		RULE_literalComposition = 95, RULE_multiplier = 96, RULE_compositionSkipRule = 97, 
		RULE_compositionCapture = 98, RULE_compositionKeyValue = 99, RULE_compositionKey = 100, 
		RULE_localIdentifier = 101, RULE_stateIdentifier = 102, RULE_externalIdentifier = 103, 
		RULE_anyIdentifier = 104, RULE_arithmeticContextKeyword = 105, RULE_keyword = 106, 
		RULE_testBody = 107, RULE_testBlock = 108, RULE_assertion = 109, RULE_dependencyProvision = 110, 
		RULE_moduleConfiguration = 111, RULE_moduleIdentifier = 112, RULE_useModule = 113, 
		RULE_programModification = 114;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "inclusion", "statement", "definition", "valueChainToSink", 
			"templatesDefinition", "processorDefinition", "typestateDefinition", 
			"messageDefinition", "composerDefinition", "testDefinition", "operatorDefinition", 
			"dataDefinition", "localDataDeclaration", "key", "parameterDefinitions", 
			"source", "sourceReference", "reference", "structureReference", "lens", 
			"dimensionReference", "simpleDimension", "multiValueDimension", "projection", 
			"grouping", "collectedValue", "arrayLiteral", "valueProduction", "structureLiteral", 
			"relationLiteral", "bytesLiteral", "byteValue", "structures", "arrayExpansion", 
			"structureExpansion", "keyValue", "templates", "arrayIndexDecomposition", 
			"sink", "templatesReference", "parameterValues", "parameterValue", "templatesBody", 
			"matchTemplate", "block", "blockExpression", "resultValue", "blockStatement", 
			"sendToTemplates", "stateAssignment", "stateSink", "valueChain", "collectorChain", 
			"transform", "matcher", "criterion", "typeMatch", "structureContentMatcher", 
			"arrayContentMatcher", "sequenceMatch", "literalMatch", "rangeBounds", 
			"condition", "lowerBound", "upperBound", "rangeLiteral", "integerLiteral", 
			"unit", "measureProduct", "measureDenominator", "nonZeroInteger", "stringLiteral", 
			"stringContent", "stringInterpolate", "characterCode", "interpolateEvaluate", 
			"arithmeticValue", "arithmeticExpression", "termArithmeticOperation", 
			"additiveOperator", "multiplicativeOperator", "term", "operatorExpression", 
			"operand", "composerBody", "definedCompositionSequence", "compositionSequence", 
			"compositionComponents", "compositionComponent", "compositionMatcher", 
			"structureMemberMatchers", "structureMemberMatcher", "tokenMatcher", 
			"compositionToken", "literalComposition", "multiplier", "compositionSkipRule", 
			"compositionCapture", "compositionKeyValue", "compositionKey", "localIdentifier", 
			"stateIdentifier", "externalIdentifier", "anyIdentifier", "arithmeticContextKeyword", 
			"keyword", "testBody", "testBlock", "assertion", "dependencyProvision", 
			"moduleConfiguration", "moduleIdentifier", "useModule", "programModification"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'include'", "'VOID'", "'def'", "'when'", "'do'", "'otherwise'", 
			"'data'", "'local'", "'->'", "'!'", "'$'", "'^'", "'\u00A7'", "'&'", 
			"'/'", "':'", null, null, null, "';'", "','", "'...'", "'~'", null, null, 
			"'['", "']'", "'{'", "'}'", "'[x'", "'<'", "'\"'", "'\\'", "'templates'", 
			"'source'", "'sink'", "'composer'", "'processor'", "'operator'", "'state'", 
			"'end'", "'rule'", "'first'", "'last'", "'#'", "'..'", "'+'", "'-'", 
			"'*'", "'~/'", "'mod'", "'?'", "'='", "'|'", "'>'", null, "'test'", "'assert'", 
			"'core-system/'", "'with'", "'provided'", "'modified'", "'shadowed'", 
			"'inherited'", "'from'", "'stand-alone'", "'use'", "'program'", "'modify'", 
			"'by'", "'collect'", "'\"1\"'", "'0'", null, null, null, null, null, 
			null, null, "'''", null, null, null, null, null, null, "'x]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Include", "Void", "Def", "When", "Do", "Otherwise", 
			"DataDefinition", "LocalDefinition", "To", "ResultMarker", "SourceMarker", 
			"DeleteMarker", "Reflexive", "And", "Slash", "Colon", "Message", "FieldReference", 
			"EndStringInterpolate", "SemiColon", "Comma", "Deconstructor", "Invert", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "StartBytes", "StartMatcher", "Quote", "Lambda", "StartTemplatesDefinition", 
			"StartSourceDefinition", "StartSinkDefinition", "StartComposerDefinition", 
			"StartProcessorDefinition", "StartOperatorDefinition", "StartStateDefinition", 
			"EndDefinition", "Rule", "First", "Last", "TemplateMatch", "Range", "Plus", 
			"Minus", "Star", "TruncateDivide", "Mod", "Question", "Equal", "Else", 
			"EndMatcher", "BeginCondition", "StartTestDefinition", "Assert", "CoreSystem", 
			"With", "Provided", "Modified", "Shadowed", "Inherited", "From", "StandAlone", 
			"Use", "Program", "Modify", "By", "Collect", "Scalar", "Zero", "PositiveInteger", 
			"START_STRING", "STATE_IDENTIFIER", "IDENTIFIER", "WS", "Comment", "REGEX_TEXT", 
			"END_REGEX", "StartCharacterCode", "StartStringInterpolate", "STRING_TEXT", 
			"END_STRING", "Bytes", "Bytes_WS", "EndBytes"
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
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Use) {
				{
				{
				setState(230);
				useModule();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Include) {
				{
				{
				setState(236);
				inclusion();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			statement();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << StartTestDefinition))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Zero - 74)) | (1L << (PositiveInteger - 74)) | (1L << (START_STRING - 74)))) != 0)) {
				{
				{
				setState(243);
				statement();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
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
			setState(251);
			match(Include);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(252);
				localIdentifier();
				setState(253);
				match(From);
				}
			}

			setState(257);
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
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
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
				setState(260);
				valueChainToSink();
				}
				break;
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				templatesDefinition();
				}
				break;
			case StartProcessorDefinition:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				processorDefinition();
				}
				break;
			case StartComposerDefinition:
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				composerDefinition();
				}
				break;
			case StartTestDefinition:
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				testDefinition();
				}
				break;
			case StartOperatorDefinition:
				enterOuterAlt(_localctx, 7);
				{
				setState(265);
				operatorDefinition();
				}
				break;
			case DataDefinition:
				enterOuterAlt(_localctx, 8);
				{
				setState(266);
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
			setState(269);
			match(Def);
			setState(270);
			key();
			setState(271);
			valueProduction();
			setState(272);
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
			setState(274);
			valueChain();
			setState(275);
			match(To);
			setState(276);
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
		public LocalDataDeclarationContext localDataDeclaration() {
			return getRuleContext(LocalDataDeclarationContext.class,0);
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
			setState(278);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(279);
			localIdentifier();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(280);
				parameterDefinitions();
				}
			}

			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(283);
				localDataDeclaration();
				}
				break;
			}
			setState(286);
			templatesBody();
			setState(287);
			match(EndDefinition);
			setState(288);
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
		public LocalDataDeclarationContext localDataDeclaration() {
			return getRuleContext(LocalDataDeclarationContext.class,0);
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
			setState(290);
			match(StartProcessorDefinition);
			setState(291);
			localIdentifier();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(292);
				parameterDefinitions();
				}
			}

			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(295);
				localDataDeclaration();
				}
				break;
			}
			setState(298);
			block();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==StartStateDefinition) {
				{
				{
				setState(299);
				typestateDefinition();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(EndDefinition);
			setState(306);
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
			setState(308);
			match(StartStateDefinition);
			setState(309);
			localIdentifier();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition))) != 0)) {
				{
				{
				setState(310);
				messageDefinition();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(EndDefinition);
			setState(317);
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
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				templatesDefinition();
				}
				break;
			case StartProcessorDefinition:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				processorDefinition();
				}
				break;
			case StartComposerDefinition:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				composerDefinition();
				}
				break;
			case StartOperatorDefinition:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
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
		public LocalDataDeclarationContext localDataDeclaration() {
			return getRuleContext(LocalDataDeclarationContext.class,0);
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
			setState(325);
			match(StartComposerDefinition);
			setState(326);
			localIdentifier();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(327);
				parameterDefinitions();
				}
			}

			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(330);
				localDataDeclaration();
				}
				break;
			}
			setState(333);
			composerBody();
			setState(334);
			match(EndDefinition);
			setState(335);
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
			setState(337);
			match(StartTestDefinition);
			setState(338);
			stringLiteral();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Use) {
				{
				{
				setState(339);
				useModule();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Modify) {
				{
				setState(345);
				programModification();
				}
			}

			setState(348);
			testBody();
			setState(349);
			match(EndDefinition);
			setState(350);
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
		public LocalDataDeclarationContext localDataDeclaration() {
			return getRuleContext(LocalDataDeclarationContext.class,0);
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
			setState(352);
			match(StartOperatorDefinition);
			setState(353);
			match(LeftParen);
			setState(354);
			localIdentifier();
			setState(355);
			localIdentifier();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(356);
				parameterDefinitions();
				}
			}

			setState(359);
			localIdentifier();
			setState(360);
			match(RightParen);
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(361);
				localDataDeclaration();
				}
				break;
			}
			setState(364);
			templatesBody();
			setState(365);
			match(EndDefinition);
			setState(366);
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
			setState(368);
			match(DataDefinition);
			setState(369);
			localIdentifier();
			setState(370);
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

	public static class LocalDataDeclarationContext extends ParserRuleContext {
		public TerminalNode DataDefinition() { return getToken(TailspinParser.DataDefinition, 0); }
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public TerminalNode LocalDefinition() { return getToken(TailspinParser.LocalDefinition, 0); }
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public LocalDataDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDataDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLocalDataDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDataDeclarationContext localDataDeclaration() throws RecognitionException {
		LocalDataDeclarationContext _localctx = new LocalDataDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_localDataDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(DataDefinition);
			setState(373);
			localIdentifier();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(374);
				match(Comma);
				setState(375);
				localIdentifier();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
			match(LocalDefinition);
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
		enterRule(_localctx, 28, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			localIdentifier();
			setState(384);
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
		enterRule(_localctx, 30, RULE_parameterDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(And);
			setState(387);
			match(LeftBrace);
			setState(392); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(388);
				key();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(389);
					match(Comma);
					}
				}

				}
				}
				setState(394); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			setState(396);
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
		enterRule(_localctx, 32, RULE_source);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				sourceReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				stringLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				rangeLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				arrayLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(402);
				relationLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(403);
				structureLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(404);
				bytesLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(405);
				match(LeftParen);
				setState(406);
				keyValue();
				setState(407);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(409);
				arithmeticValue();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(410);
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
		enterRule(_localctx, 34, RULE_sourceReference);
		try {
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
			case Reflexive:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SourceMarker:
					{
					setState(413);
					match(SourceMarker);
					setState(415);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(414);
						anyIdentifier();
						}
						break;
					}
					}
					break;
				case Reflexive:
					{
					setState(417);
					match(Reflexive);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(420);
				reference();
				setState(422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(421);
					match(Message);
					}
					break;
				}
				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(424);
					parameterValues();
					}
					break;
				}
				}
				break;
			case DeleteMarker:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(DeleteMarker);
				setState(428);
				stateIdentifier();
				setState(429);
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
		enterRule(_localctx, 36, RULE_reference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(433);
				lens();
				}
				break;
			}
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(436);
					structureReference();
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 38, RULE_structureReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(FieldReference);
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(443);
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
		enterRule(_localctx, 40, RULE_lens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(LeftParen);
			setState(447);
			dimensionReference();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(448);
				match(SemiColon);
				setState(449);
				dimensionReference();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
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
		enterRule(_localctx, 42, RULE_dimensionReference);
		try {
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				simpleDimension();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				multiValueDimension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				projection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				key();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(461);
				localIdentifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(462);
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
		enterRule(_localctx, 44, RULE_simpleDimension);
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				sourceReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				arithmeticValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
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
		enterRule(_localctx, 46, RULE_multiValueDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(LeftBracket);
			setState(471);
			simpleDimension();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(472);
				match(Comma);
				setState(473);
				simpleDimension();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
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
		enterRule(_localctx, 48, RULE_projection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(LeftBrace);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(482);
					key();
					}
					break;
				case 2:
					{
					setState(483);
					keyValue();
					}
					break;
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(486);
					match(Comma);
					setState(489);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(487);
						key();
						}
						break;
					case 2:
						{
						setState(488);
						keyValue();
						}
						break;
					}
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(498);
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
		enterRule(_localctx, 50, RULE_grouping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(Collect);
			setState(501);
			match(LeftBrace);
			setState(502);
			collectedValue();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(503);
				match(Comma);
				setState(504);
				collectedValue();
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(510);
			match(RightBrace);
			setState(511);
			match(By);
			setState(512);
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
		enterRule(_localctx, 52, RULE_collectedValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			key();
			setState(515);
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
		enterRule(_localctx, 54, RULE_arrayLiteral);
		int _la;
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				match(LeftBracket);
				setState(518);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				match(LeftBracket);
				setState(520);
				arrayExpansion();
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(521);
					match(Comma);
					setState(522);
					arrayExpansion();
					}
					}
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(528);
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
		enterRule(_localctx, 56, RULE_valueProduction);
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				sendToTemplates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
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
		enterRule(_localctx, 58, RULE_structureLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(LeftBrace);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(537);
				structureExpansion();
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(538);
					match(Comma);
					setState(539);
					structureExpansion();
					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(547);
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
		enterRule(_localctx, 60, RULE_relationLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(LeftBrace);
			setState(550);
			match(Else);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Zero - 74)) | (1L << (PositiveInteger - 74)) | (1L << (START_STRING - 74)))) != 0)) {
				{
				setState(551);
				structures();
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(552);
					match(Comma);
					setState(553);
					structures();
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(561);
			match(Else);
			setState(562);
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
		enterRule(_localctx, 62, RULE_bytesLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(StartBytes);
			setState(565);
			byteValue();
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen || _la==Bytes) {
				{
				{
				setState(566);
				byteValue();
				}
				}
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(572);
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
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public OperatorExpressionContext operatorExpression() {
			return getRuleContext(OperatorExpressionContext.class,0);
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
		enterRule(_localctx, 64, RULE_byteValue);
		try {
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(Bytes);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				match(LeftParen);
				setState(576);
				valueProduction();
				setState(577);
				match(RightParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
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
		enterRule(_localctx, 66, RULE_structures);
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				structureLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
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
		enterRule(_localctx, 68, RULE_arrayExpansion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==By) {
				{
				setState(586);
				match(By);
				}
			}

			setState(589);
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
		enterRule(_localctx, 70, RULE_structureExpansion);
		int _la;
		try {
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				keyValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==By) {
					{
					setState(592);
					match(By);
					}
				}

				setState(595);
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
		enterRule(_localctx, 72, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			key();
			setState(599);
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
		public LocalDataDeclarationContext localDataDeclaration() {
			return getRuleContext(LocalDataDeclarationContext.class,0);
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
		public LocalDataDeclarationContext localDataDeclaration() {
			return getRuleContext(LocalDataDeclarationContext.class,0);
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
		enterRule(_localctx, 74, RULE_templates);
		int _la;
		try {
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				_localctx = new CallDefinedTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				templatesReference();
				}
				break;
			case 2:
				_localctx = new LiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				source();
				}
				break;
			case 3:
				_localctx = new LambdaTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				match(Lambda);
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(604);
					localIdentifier();
					}
				}

				setState(607);
				match(LeftParen);
				setState(609);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(608);
					localDataDeclaration();
					}
					break;
				}
				setState(611);
				templatesBody();
				setState(612);
				match(Lambda);
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(613);
					localIdentifier();
					}
				}

				setState(616);
				match(RightParen);
				}
				break;
			case 4:
				_localctx = new LambdaArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(618);
				match(Lambda);
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(619);
					localIdentifier();
					}
				}

				setState(622);
				arrayIndexDecomposition();
				setState(623);
				match(LeftParen);
				setState(625);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(624);
					localDataDeclaration();
					}
					break;
				}
				setState(627);
				templatesBody();
				setState(628);
				match(Lambda);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(629);
					localIdentifier();
					}
				}

				setState(632);
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
		enterRule(_localctx, 76, RULE_arrayIndexDecomposition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(LeftBracket);
			setState(637);
			localIdentifier();
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(638);
				match(SemiColon);
				setState(639);
				localIdentifier();
				}
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(645);
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
		enterRule(_localctx, 78, RULE_sink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(ResultMarker);
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case DataDefinition:
			case LocalDefinition:
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
				setState(648);
				anyIdentifier();
				setState(649);
				reference();
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(650);
					match(Message);
					}
				}

				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(653);
					parameterValues();
					}
				}

				}
				}
				break;
			case Void:
				{
				setState(656);
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
		enterRule(_localctx, 80, RULE_templatesReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			anyIdentifier();
			setState(660);
			reference();
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Message) {
				{
				setState(661);
				match(Message);
				}
			}

			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(664);
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
		enterRule(_localctx, 82, RULE_parameterValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(And);
			setState(668);
			match(LeftBrace);
			setState(673); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(669);
				parameterValue();
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(670);
					match(Comma);
					}
				}

				}
				}
				setState(675); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			setState(677);
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
		enterRule(_localctx, 84, RULE_parameterValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			key();
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(680);
				valueChain();
				}
				break;
			case 2:
				{
				setState(681);
				templatesReference();
				}
				break;
			case 3:
				{
				setState(687);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(682);
					match(Colon);
					setState(683);
					lens();
					}
					break;
				case 2:
					{
					setState(684);
					match(Colon);
					setState(685);
					match(LeftParen);
					setState(686);
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
		enterRule(_localctx, 86, RULE_templatesBody);
		int _la;
		try {
			setState(703);
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
				setState(691);
				block();
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << When) | (1L << Otherwise) | (1L << StartMatcher))) != 0)) {
					{
					{
					setState(692);
					matchTemplate();
					}
					}
					setState(697);
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
				setState(699); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(698);
					matchTemplate();
					}
					}
					setState(701); 
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
		enterRule(_localctx, 88, RULE_matchTemplate);
		int _la;
		try {
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				matcher();
				setState(706);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==When) {
					{
					setState(708);
					match(When);
					}
				}

				setState(711);
				matcher();
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Do) {
					{
					setState(712);
					match(Do);
					}
				}

				setState(715);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(717);
				match(Otherwise);
				setState(718);
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
		enterRule(_localctx, 90, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
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
				setState(722); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(721);
					blockExpression();
					}
					}
					setState(724); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << StartTestDefinition))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Zero - 74)) | (1L << (PositiveInteger - 74)) | (1L << (START_STRING - 74)) | (1L << (STATE_IDENTIFIER - 74)))) != 0) );
				}
				break;
			case ResultMarker:
				{
				{
				setState(726);
				match(ResultMarker);
				setState(727);
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
		enterRule(_localctx, 92, RULE_blockExpression);
		try {
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				stateAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(732);
				sendToTemplates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(733);
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
		enterRule(_localctx, 94, RULE_resultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			valueChain();
			setState(737);
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
		enterRule(_localctx, 96, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
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
		enterRule(_localctx, 98, RULE_sendToTemplates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			valueChain();
			setState(742);
			match(To);
			setState(743);
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
		enterRule(_localctx, 100, RULE_stateAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(745);
				valueChain();
				setState(746);
				match(To);
				}
				break;
			}
			setState(750);
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
		enterRule(_localctx, 102, RULE_stateSink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Range) {
				{
				setState(752);
				match(Range);
				setState(753);
				match(Else);
				}
			}

			setState(756);
			stateIdentifier();
			setState(757);
			reference();
			setState(758);
			match(Colon);
			setState(759);
			valueProduction();
			setState(760);
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
		enterRule(_localctx, 104, RULE_valueChain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			source();
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(763);
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
		enterRule(_localctx, 106, RULE_collectorChain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(To);
			setState(767);
			match(Range);
			setState(768);
			match(Equal);
			setState(769);
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
		enterRule(_localctx, 108, RULE_transform);
		try {
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				match(To);
				setState(772);
				templates();
				setState(774);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(773);
					transform();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				match(Deconstructor);
				setState(778);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(777);
					transform();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(780);
				collectorChain();
				setState(782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(781);
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
		enterRule(_localctx, 110, RULE_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(StartMatcher);
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << Invert) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Quote) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << Equal) | (1L << BeginCondition) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (Scalar - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Invert) {
					{
					setState(787);
					match(Invert);
					}
				}

				setState(790);
				criterion();
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Else) {
					{
					{
					setState(791);
					match(Else);
					setState(792);
					criterion();
					}
					}
					setState(797);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(800);
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
		enterRule(_localctx, 112, RULE_criterion);
		int _la;
		try {
			setState(817);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case DataDefinition:
			case LocalDefinition:
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
			case Scalar:
			case Zero:
			case PositiveInteger:
			case START_STRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Equal:
					{
					setState(802);
					literalMatch();
					}
					break;
				case Include:
				case Def:
				case When:
				case Do:
				case Otherwise:
				case DataDefinition:
				case LocalDefinition:
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
				case Scalar:
				case Zero:
				case PositiveInteger:
				case START_STRING:
				case IDENTIFIER:
					{
					setState(803);
					typeMatch();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BeginCondition) {
					{
					{
					setState(806);
					condition();
					}
					}
					setState(811);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BeginCondition:
				enterOuterAlt(_localctx, 2);
				{
				setState(813); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(812);
					condition();
					}
					}
					setState(815); 
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
		enterRule(_localctx, 114, RULE_typeMatch);
		int _la;
		try {
			int _alt;
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				rangeBounds();
				}
				break;
			case 2:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				stringLiteral();
				}
				break;
			case 3:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(821);
				match(LeftBrace);
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					{
					setState(822);
					key();
					setState(823);
					structureContentMatcher();
					setState(825);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						setState(824);
						match(Comma);
						}
						break;
					}
					}
					}
					setState(831);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Void || _la==Comma) {
					{
					setState(833);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(832);
						match(Comma);
						}
					}

					setState(835);
					match(Void);
					}
				}

				setState(838);
				match(RightBrace);
				}
				break;
			case 4:
				_localctx = new ArrayMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(839);
				match(LeftBracket);
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen || _la==StartMatcher) {
					{
					setState(840);
					arrayContentMatcher();
					}
				}

				setState(847);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(843);
						match(Comma);
						setState(844);
						arrayContentMatcher();
						}
						} 
					}
					setState(849);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Void || _la==Comma) {
					{
					setState(851);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(850);
						match(Comma);
						}
					}

					setState(853);
					match(Void);
					}
				}

				setState(856);
				match(RightBracket);
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(857);
					match(LeftParen);
					setState(860);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						setState(858);
						rangeBounds();
						}
						break;
					case 2:
						{
						setState(859);
						arithmeticValue();
						}
						break;
					}
					setState(862);
					match(RightParen);
					}
				}

				}
				break;
			case 5:
				_localctx = new StereotypeMatchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(868);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(866);
					localIdentifier();
					}
					break;
				case 2:
					{
					setState(867);
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
				setState(870);
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
		enterRule(_localctx, 116, RULE_structureContentMatcher);
		try {
			setState(875);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartMatcher:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				matcher();
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
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
		enterRule(_localctx, 118, RULE_arrayContentMatcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartMatcher:
				{
				setState(877);
				matcher();
				}
				break;
			case LeftParen:
				{
				setState(878);
				sequenceMatch();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Star) | (1L << Question) | (1L << Equal))) != 0)) {
				{
				setState(881);
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
		enterRule(_localctx, 120, RULE_sequenceMatch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(LeftParen);
			setState(885);
			matcher();
			setState(888); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(886);
				match(Colon);
				setState(887);
				matcher();
				}
				}
				setState(890); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Colon );
			setState(892);
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
		enterRule(_localctx, 122, RULE_literalMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(Equal);
			setState(895);
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
		enterRule(_localctx, 124, RULE_rangeBounds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << First) | (1L << Last) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Zero - 74)) | (1L << (PositiveInteger - 74)) | (1L << (START_STRING - 74)))) != 0)) {
				{
				setState(897);
				lowerBound();
				}
			}

			setState(900);
			match(Range);
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << Invert) | (1L << LeftParen) | (1L << First) | (1L << Last) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Zero - 74)) | (1L << (PositiveInteger - 74)) | (1L << (START_STRING - 74)))) != 0)) {
				{
				setState(901);
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
		enterRule(_localctx, 126, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(BeginCondition);
			setState(905);
			valueChain();
			setState(906);
			matcher();
			setState(907);
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
		enterRule(_localctx, 128, RULE_lowerBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(909);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(910);
				arithmeticValue();
				}
				break;
			case 3:
				{
				setState(911);
				stringLiteral();
				}
				break;
			case 4:
				{
				setState(912);
				term();
				}
				break;
			}
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(915);
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
		enterRule(_localctx, 130, RULE_upperBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(918);
				match(Invert);
				}
			}

			setState(925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(921);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(922);
				arithmeticValue();
				}
				break;
			case 3:
				{
				setState(923);
				stringLiteral();
				}
				break;
			case 4:
				{
				setState(924);
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
		enterRule(_localctx, 132, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << First) | (1L << Last) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Zero - 74)) | (1L << (PositiveInteger - 74)) | (1L << (START_STRING - 74)))) != 0)) {
				{
				setState(927);
				lowerBound();
				}
			}

			setState(930);
			match(Range);
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(931);
				upperBound();
				}
				break;
			}
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(934);
				match(Colon);
				setState(935);
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
		enterRule(_localctx, 134, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
				{
				setState(938);
				match(Zero);
				}
				break;
			case Plus:
			case Minus:
			case PositiveInteger:
				{
				setState(939);
				nonZeroInteger();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(942);
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
		public TerminalNode Scalar() { return getToken(TailspinParser.Scalar, 0); }
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
		enterRule(_localctx, 136, RULE_unit);
		int _la;
		try {
			setState(953);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Scalar:
				enterOuterAlt(_localctx, 1);
				{
				setState(945);
				match(Scalar);
				}
				break;
			case Quote:
				enterOuterAlt(_localctx, 2);
				{
				setState(946);
				match(Quote);
				setState(947);
				measureProduct();
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Slash) {
					{
					setState(948);
					measureDenominator();
					}
				}

				setState(951);
				match(Quote);
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
		enterRule(_localctx, 138, RULE_measureProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(955);
				localIdentifier();
				}
				}
				setState(960);
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
		enterRule(_localctx, 140, RULE_measureDenominator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(Slash);
			setState(962);
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
		enterRule(_localctx, 142, RULE_nonZeroInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(964);
				additiveOperator();
				}
			}

			setState(967);
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
		enterRule(_localctx, 144, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(START_STRING);
			setState(973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (StartCharacterCode - 83)) | (1L << (StartStringInterpolate - 83)) | (1L << (STRING_TEXT - 83)))) != 0)) {
				{
				{
				setState(970);
				stringContent();
				}
				}
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(976);
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
		enterRule(_localctx, 146, RULE_stringContent);
		try {
			setState(980);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartCharacterCode:
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
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
		enterRule(_localctx, 148, RULE_stringInterpolate);
		try {
			setState(984);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				interpolateEvaluate();
				}
				break;
			case StartCharacterCode:
				enterOuterAlt(_localctx, 2);
				{
				setState(983);
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
		enterRule(_localctx, 150, RULE_characterCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(StartCharacterCode);
			setState(987);
			arithmeticValue();
			setState(988);
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
		enterRule(_localctx, 152, RULE_interpolateEvaluate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(StartStringInterpolate);
			setState(1003);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case DataDefinition:
			case LocalDefinition:
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
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (STATE_IDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(991);
					anyIdentifier();
					}
				}

				setState(994);
				reference();
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(995);
					match(Message);
					}
				}

				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(998);
					parameterValues();
					}
				}

				}
				break;
			case Colon:
				{
				setState(1001);
				match(Colon);
				setState(1002);
				source();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1005);
				transform();
				}
				break;
			}
			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==To) {
				{
				setState(1008);
				match(To);
				setState(1009);
				match(TemplateMatch);
				}
			}

			setState(1012);
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
		enterRule(_localctx, 154, RULE_arithmeticValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
		int _startState = 156;
		enterRecursionRule(_localctx, 156, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1017);
				integerLiteral();
				}
				break;
			case 2:
				{
				setState(1018);
				match(LeftParen);
				setState(1019);
				arithmeticExpression(0);
				setState(1020);
				match(RightParen);
				setState(1022);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1021);
					unit();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1024);
				term();
				setState(1025);
				unit();
				}
				break;
			case 4:
				{
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Plus || _la==Minus) {
					{
					setState(1027);
					additiveOperator();
					}
				}

				setState(1030);
				sourceReference();
				}
				break;
			case 5:
				{
				setState(1031);
				arithmeticContextKeyword();
				}
				break;
			case 6:
				{
				setState(1032);
				termArithmeticOperation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1053);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1051);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(1035);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1036);
						multiplicativeOperator();
						setState(1037);
						arithmeticExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(1039);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1040);
						additiveOperator();
						setState(1041);
						arithmeticExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(1043);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1044);
						multiplicativeOperator();
						setState(1045);
						term();
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(1047);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1048);
						additiveOperator();
						setState(1049);
						term();
						}
						break;
					}
					} 
				}
				setState(1055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
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
		enterRule(_localctx, 158, RULE_termArithmeticOperation);
		try {
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1056);
				term();
				setState(1057);
				multiplicativeOperator();
				setState(1060);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1058);
					term();
					}
					break;
				case 2:
					{
					setState(1059);
					arithmeticExpression(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1062);
				term();
				setState(1063);
				additiveOperator();
				setState(1066);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1064);
					term();
					}
					break;
				case 2:
					{
					setState(1065);
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
		enterRule(_localctx, 160, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
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
		enterRule(_localctx, 162, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
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
		enterRule(_localctx, 164, RULE_term);
		try {
			setState(1079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1074);
				match(LeftParen);
				setState(1075);
				valueProduction();
				setState(1076);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1078);
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
		enterRule(_localctx, 166, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(LeftParen);
			setState(1082);
			operand();
			setState(1083);
			templatesReference();
			setState(1084);
			operand();
			setState(1085);
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
		enterRule(_localctx, 168, RULE_operand);
		try {
			setState(1089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1087);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1088);
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
		enterRule(_localctx, 170, RULE_composerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1091);
				stateAssignment();
				}
				break;
			}
			setState(1094);
			compositionSequence();
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Rule) {
				{
				{
				setState(1095);
				definedCompositionSequence();
				}
				}
				setState(1100);
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
		enterRule(_localctx, 172, RULE_definedCompositionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			match(Rule);
			setState(1102);
			key();
			setState(1103);
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
		enterRule(_localctx, 174, RULE_compositionSequence);
		int _la;
		try {
			setState(1111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				compositionComponents();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1106);
					compositionSkipRule();
					}
					}
					setState(1109); 
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
		enterRule(_localctx, 176, RULE_compositionComponents);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1113);
					compositionSkipRule();
					}
					} 
				}
				setState(1118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			setState(1119);
			compositionComponent();
			setState(1124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1120);
					match(Comma);
					}
				}

				setState(1123);
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
		enterRule(_localctx, 178, RULE_compositionComponent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			compositionMatcher();
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1127);
				transform();
				}
				break;
			}
			setState(1133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1130);
					compositionSkipRule();
					}
					} 
				}
				setState(1135);
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
		enterRule(_localctx, 180, RULE_compositionMatcher);
		try {
			setState(1151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1136);
				tokenMatcher();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1137);
				match(LeftBracket);
				setState(1140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1138);
					compositionSequence();
					}
					break;
				case 2:
					{
					setState(1139);
					compositionSkipRule();
					}
					break;
				}
				setState(1142);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1143);
				match(LeftBrace);
				setState(1146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1144);
					structureMemberMatchers();
					}
					break;
				case 2:
					{
					setState(1145);
					compositionSkipRule();
					}
					break;
				}
				setState(1148);
				match(RightBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1149);
				source();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1150);
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
		enterRule(_localctx, 182, RULE_structureMemberMatchers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(1153);
				compositionSkipRule();
				}
				}
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1159);
			structureMemberMatcher();
			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << Comma) | (1L << LeftParen) | (1L << StartMatcher) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1160);
					match(Comma);
					}
				}

				setState(1163);
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
		enterRule(_localctx, 184, RULE_structureMemberMatcher);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1166);
				tokenMatcher();
				}
				break;
			case 2:
				{
				setState(1167);
				compositionKeyValue();
				}
				break;
			}
			setState(1173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1170);
					compositionSkipRule();
					}
					} 
				}
				setState(1175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
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
		enterRule(_localctx, 186, RULE_tokenMatcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			match(StartMatcher);
			setState(1178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(1177);
				match(Invert);
				}
			}

			setState(1180);
			compositionToken();
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(1181);
				match(Else);
				setState(1182);
				compositionToken();
				}
				}
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1188);
			match(EndMatcher);
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1189);
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
		enterRule(_localctx, 188, RULE_compositionToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				{
				setState(1192);
				literalComposition();
				}
				break;
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case DataDefinition:
			case LocalDefinition:
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
				setState(1193);
				localIdentifier();
				}
				break;
			case START_STRING:
				{
				setState(1194);
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
		enterRule(_localctx, 190, RULE_literalComposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			match(Equal);
			setState(1200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
			case DeleteMarker:
			case Reflexive:
				{
				setState(1198);
				sourceReference();
				}
				break;
			case START_STRING:
				{
				setState(1199);
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
		enterRule(_localctx, 192, RULE_multiplier);
		try {
			setState(1210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(1202);
				match(Plus);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				setState(1203);
				match(Star);
				}
				break;
			case Question:
				enterOuterAlt(_localctx, 3);
				{
				setState(1204);
				match(Question);
				}
				break;
			case Equal:
				enterOuterAlt(_localctx, 4);
				{
				setState(1205);
				match(Equal);
				setState(1208);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PositiveInteger:
					{
					setState(1206);
					match(PositiveInteger);
					}
					break;
				case SourceMarker:
				case DeleteMarker:
				case Reflexive:
					{
					setState(1207);
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
		enterRule(_localctx, 194, RULE_compositionSkipRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			match(LeftParen);
			setState(1214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1213);
				compositionCapture();
				}
				}
				setState(1216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartMatcher) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (STATE_IDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			setState(1218);
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
		enterRule(_localctx, 196, RULE_compositionCapture);
		int _la;
		try {
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1220);
				match(Def);
				setState(1221);
				key();
				setState(1222);
				compositionMatcher();
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To || _la==Deconstructor) {
					{
					setState(1223);
					transform();
					}
				}

				setState(1226);
				match(SemiColon);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1228);
				compositionMatcher();
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To || _la==Deconstructor) {
					{
					setState(1230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
					case 1:
						{
						setState(1229);
						transform();
						}
						break;
					}
					setState(1232);
					match(To);
					setState(1233);
					stateSink();
					}
				}

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1236);
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
		enterRule(_localctx, 198, RULE_compositionKeyValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case DataDefinition:
			case LocalDefinition:
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
				setState(1239);
				key();
				}
				break;
			case StartMatcher:
				{
				setState(1240);
				compositionKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1243);
					compositionSkipRule();
					}
					} 
				}
				setState(1248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			setState(1249);
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
		enterRule(_localctx, 200, RULE_compositionKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			tokenMatcher();
			setState(1252);
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
		enterRule(_localctx, 202, RULE_localIdentifier);
		try {
			setState(1256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1254);
				match(IDENTIFIER);
				}
				break;
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case DataDefinition:
			case LocalDefinition:
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
				setState(1255);
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
		enterRule(_localctx, 204, RULE_stateIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
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
		enterRule(_localctx, 206, RULE_externalIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			localIdentifier();
			setState(1263); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1261);
					match(Slash);
					setState(1262);
					localIdentifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1265); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
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
		enterRule(_localctx, 208, RULE_anyIdentifier);
		try {
			setState(1270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1267);
				stateIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1268);
				localIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1269);
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
		enterRule(_localctx, 210, RULE_arithmeticContextKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
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
		public TerminalNode LocalDefinition() { return getToken(TailspinParser.LocalDefinition, 0); }
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
		enterRule(_localctx, 212, RULE_keyword);
		try {
			setState(1304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
				enterOuterAlt(_localctx, 1);
				{
				setState(1274);
				match(Include);
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 2);
				{
				setState(1275);
				match(Def);
				}
				break;
			case StartTemplatesDefinition:
				enterOuterAlt(_localctx, 3);
				{
				setState(1276);
				match(StartTemplatesDefinition);
				}
				break;
			case StartSourceDefinition:
				enterOuterAlt(_localctx, 4);
				{
				setState(1277);
				match(StartSourceDefinition);
				}
				break;
			case StartSinkDefinition:
				enterOuterAlt(_localctx, 5);
				{
				setState(1278);
				match(StartSinkDefinition);
				}
				break;
			case StartComposerDefinition:
				enterOuterAlt(_localctx, 6);
				{
				setState(1279);
				match(StartComposerDefinition);
				}
				break;
			case StartProcessorDefinition:
				enterOuterAlt(_localctx, 7);
				{
				setState(1280);
				match(StartProcessorDefinition);
				}
				break;
			case StartOperatorDefinition:
				enterOuterAlt(_localctx, 8);
				{
				setState(1281);
				match(StartOperatorDefinition);
				}
				break;
			case StartStateDefinition:
				enterOuterAlt(_localctx, 9);
				{
				setState(1282);
				match(StartStateDefinition);
				}
				break;
			case EndDefinition:
				enterOuterAlt(_localctx, 10);
				{
				setState(1283);
				match(EndDefinition);
				}
				break;
			case DataDefinition:
				enterOuterAlt(_localctx, 11);
				{
				setState(1284);
				match(DataDefinition);
				}
				break;
			case LocalDefinition:
				enterOuterAlt(_localctx, 12);
				{
				setState(1285);
				match(LocalDefinition);
				}
				break;
			case Mod:
				enterOuterAlt(_localctx, 13);
				{
				setState(1286);
				match(Mod);
				}
				break;
			case Rule:
				enterOuterAlt(_localctx, 14);
				{
				setState(1287);
				match(Rule);
				}
				break;
			case When:
				enterOuterAlt(_localctx, 15);
				{
				setState(1288);
				match(When);
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 16);
				{
				setState(1289);
				match(Do);
				}
				break;
			case Otherwise:
				enterOuterAlt(_localctx, 17);
				{
				setState(1290);
				match(Otherwise);
				}
				break;
			case First:
			case Last:
				enterOuterAlt(_localctx, 18);
				{
				setState(1291);
				arithmeticContextKeyword();
				}
				break;
			case StartTestDefinition:
				enterOuterAlt(_localctx, 19);
				{
				setState(1292);
				match(StartTestDefinition);
				}
				break;
			case Assert:
				enterOuterAlt(_localctx, 20);
				{
				setState(1293);
				match(Assert);
				}
				break;
			case With:
				enterOuterAlt(_localctx, 21);
				{
				setState(1294);
				match(With);
				}
				break;
			case Provided:
				enterOuterAlt(_localctx, 22);
				{
				setState(1295);
				match(Provided);
				}
				break;
			case Modified:
				enterOuterAlt(_localctx, 23);
				{
				setState(1296);
				match(Modified);
				}
				break;
			case Shadowed:
				enterOuterAlt(_localctx, 24);
				{
				setState(1297);
				match(Shadowed);
				}
				break;
			case From:
				enterOuterAlt(_localctx, 25);
				{
				setState(1298);
				match(From);
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 26);
				{
				setState(1299);
				match(Use);
				}
				break;
			case Program:
				enterOuterAlt(_localctx, 27);
				{
				setState(1300);
				match(Program);
				}
				break;
			case Modify:
				enterOuterAlt(_localctx, 28);
				{
				setState(1301);
				match(Modify);
				}
				break;
			case By:
				enterOuterAlt(_localctx, 29);
				{
				setState(1302);
				match(By);
				}
				break;
			case Collect:
				enterOuterAlt(_localctx, 30);
				{
				setState(1303);
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
		enterRule(_localctx, 214, RULE_testBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1306);
				testBlock();
				}
				}
				setState(1309); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << StartTestDefinition) | (1L << Assert))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Zero - 74)) | (1L << (PositiveInteger - 74)) | (1L << (START_STRING - 74)))) != 0) );
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
		enterRule(_localctx, 216, RULE_testBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << StartTestDefinition))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Zero - 74)) | (1L << (PositiveInteger - 74)) | (1L << (START_STRING - 74)))) != 0)) {
				{
				{
				setState(1311);
				statement();
				}
				}
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1318); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1317);
					assertion();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1320); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
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
		enterRule(_localctx, 218, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
			match(Assert);
			setState(1323);
			valueChain();
			setState(1324);
			matcher();
			setState(1325);
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
		enterRule(_localctx, 220, RULE_dependencyProvision);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			match(With);
			setState(1329); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1328);
					moduleConfiguration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1331); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1333);
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
		enterRule(_localctx, 222, RULE_moduleConfiguration);
		int _la;
		try {
			setState(1387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				_localctx = new ModuleShadowingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1335);
					moduleIdentifier();
					setState(1336);
					match(From);
					}
					break;
				}
				setState(1340);
				match(Shadowed);
				setState(1341);
				moduleIdentifier();
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==With) {
					{
					setState(1342);
					dependencyProvision();
					}
				}

				setState(1346); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1345);
					statement();
					}
					}
					setState(1348); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << StartTestDefinition))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Zero - 74)) | (1L << (PositiveInteger - 74)) | (1L << (START_STRING - 74)))) != 0) );
				setState(1350);
				match(EndDefinition);
				setState(1351);
				moduleIdentifier();
				}
				break;
			case 2:
				_localctx = new InheritModuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1353);
				moduleIdentifier();
				setState(1354);
				match(Inherited);
				setState(1357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1355);
					match(From);
					setState(1356);
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
				setState(1362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1359);
					moduleIdentifier();
					setState(1360);
					match(From);
					}
					break;
				}
				setState(1364);
				match(Modified);
				setState(1365);
				stringLiteral();
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==With) {
					{
					setState(1366);
					dependencyProvision();
					}
				}

				setState(1370); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1369);
					statement();
					}
					}
					setState(1372); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << StartTestDefinition))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Zero - 74)) | (1L << (PositiveInteger - 74)) | (1L << (START_STRING - 74)))) != 0) );
				setState(1374);
				match(EndDefinition);
				setState(1375);
				stringLiteral();
				}
				break;
			case 4:
				_localctx = new ModuleImportContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << CoreSystem) | (1L << With) | (1L << Provided) | (1L << Modified))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1377);
					moduleIdentifier();
					setState(1378);
					match(From);
					}
				}

				setState(1382);
				stringLiteral();
				setState(1385);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case StandAlone:
					{
					setState(1383);
					match(StandAlone);
					}
					break;
				case With:
					{
					setState(1384);
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
		enterRule(_localctx, 224, RULE_moduleIdentifier);
		try {
			setState(1391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CoreSystem:
				enterOuterAlt(_localctx, 1);
				{
				setState(1389);
				match(CoreSystem);
				}
				break;
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case DataDefinition:
			case LocalDefinition:
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
				setState(1390);
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
		enterRule(_localctx, 226, RULE_useModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			match(Use);
			setState(1394);
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
		enterRule(_localctx, 228, RULE_programModification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			match(Modify);
			setState(1397);
			match(Program);
			setState(1399); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1398);
				statement();
				}
				}
				setState(1401); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << DataDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << StartTestDefinition))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Zero - 74)) | (1L << (PositiveInteger - 74)) | (1L << (START_STRING - 74)))) != 0) );
			setState(1403);
			match(EndDefinition);
			setState(1404);
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
		case 78:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3[\u0581\4\2\t\2\4"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\3\2\7\2\u00ea"+
		"\n\2\f\2\16\2\u00ed\13\2\3\2\7\2\u00f0\n\2\f\2\16\2\u00f3\13\2\3\2\3\2"+
		"\7\2\u00f7\n\2\f\2\16\2\u00fa\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u0102\n"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u010e\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7\u011c\n\7\3\7\5\7\u011f\n\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u0128\n\b\3\b\5\b\u012b\n\b\3\b\3\b\7\b\u012f"+
		"\n\b\f\b\16\b\u0132\13\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u013a\n\t\f\t\16"+
		"\t\u013d\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0146\n\n\3\13\3\13\3\13"+
		"\5\13\u014b\n\13\3\13\5\13\u014e\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\7\f\u0157\n\f\f\f\16\f\u015a\13\f\3\f\5\f\u015d\n\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0168\n\r\3\r\3\r\3\r\5\r\u016d\n\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u017b\n\17\f\17\16\17"+
		"\u017e\13\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u0189\n"+
		"\21\6\21\u018b\n\21\r\21\16\21\u018c\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u019e\n\22\3\23\3\23\5\23"+
		"\u01a2\n\23\3\23\5\23\u01a5\n\23\3\23\3\23\5\23\u01a9\n\23\3\23\5\23\u01ac"+
		"\n\23\3\23\3\23\3\23\3\23\5\23\u01b2\n\23\3\24\5\24\u01b5\n\24\3\24\7"+
		"\24\u01b8\n\24\f\24\16\24\u01bb\13\24\3\25\3\25\5\25\u01bf\n\25\3\26\3"+
		"\26\3\26\3\26\7\26\u01c5\n\26\f\26\16\26\u01c8\13\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u01d2\n\27\3\30\3\30\3\30\5\30\u01d7\n\30"+
		"\3\31\3\31\3\31\3\31\7\31\u01dd\n\31\f\31\16\31\u01e0\13\31\3\31\3\31"+
		"\3\32\3\32\3\32\5\32\u01e7\n\32\3\32\3\32\3\32\5\32\u01ec\n\32\7\32\u01ee"+
		"\n\32\f\32\16\32\u01f1\13\32\5\32\u01f3\n\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\7\33\u01fc\n\33\f\33\16\33\u01ff\13\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u020e\n\35\f\35\16"+
		"\35\u0211\13\35\3\35\3\35\5\35\u0215\n\35\3\36\3\36\5\36\u0219\n\36\3"+
		"\37\3\37\3\37\3\37\7\37\u021f\n\37\f\37\16\37\u0222\13\37\5\37\u0224\n"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \7 \u022d\n \f \16 \u0230\13 \5 \u0232\n "+
		"\3 \3 \3 \3!\3!\3!\7!\u023a\n!\f!\16!\u023d\13!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u0247\n\"\3#\3#\5#\u024b\n#\3$\5$\u024e\n$\3$\3$\3%\3%\5"+
		"%\u0254\n%\3%\5%\u0257\n%\3&\3&\3&\3\'\3\'\3\'\3\'\5\'\u0260\n\'\3\'\3"+
		"\'\5\'\u0264\n\'\3\'\3\'\3\'\5\'\u0269\n\'\3\'\3\'\3\'\3\'\5\'\u026f\n"+
		"\'\3\'\3\'\3\'\5\'\u0274\n\'\3\'\3\'\3\'\5\'\u0279\n\'\3\'\3\'\5\'\u027d"+
		"\n\'\3(\3(\3(\3(\7(\u0283\n(\f(\16(\u0286\13(\3(\3(\3)\3)\3)\3)\5)\u028e"+
		"\n)\3)\5)\u0291\n)\3)\5)\u0294\n)\3*\3*\3*\5*\u0299\n*\3*\5*\u029c\n*"+
		"\3+\3+\3+\3+\5+\u02a2\n+\6+\u02a4\n+\r+\16+\u02a5\3+\3+\3,\3,\3,\3,\3"+
		",\3,\3,\3,\5,\u02b2\n,\5,\u02b4\n,\3-\3-\7-\u02b8\n-\f-\16-\u02bb\13-"+
		"\3-\6-\u02be\n-\r-\16-\u02bf\5-\u02c2\n-\3.\3.\3.\3.\5.\u02c8\n.\3.\3"+
		".\5.\u02cc\n.\3.\3.\3.\3.\5.\u02d2\n.\3/\6/\u02d5\n/\r/\16/\u02d6\3/\3"+
		"/\5/\u02db\n/\3\60\3\60\3\60\3\60\5\60\u02e1\n\60\3\61\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\5\64\u02ef\n\64\3\64\3\64\3\65"+
		"\3\65\5\65\u02f5\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\5\66\u02ff"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\38\38\38\58\u0309\n8\38\38\58\u030d\n8"+
		"\38\38\58\u0311\n8\58\u0313\n8\39\39\59\u0317\n9\39\39\39\79\u031c\n9"+
		"\f9\169\u031f\139\59\u0321\n9\39\39\3:\3:\5:\u0327\n:\3:\7:\u032a\n:\f"+
		":\16:\u032d\13:\3:\6:\u0330\n:\r:\16:\u0331\5:\u0334\n:\3;\3;\3;\3;\3"+
		";\3;\5;\u033c\n;\7;\u033e\n;\f;\16;\u0341\13;\3;\5;\u0344\n;\3;\5;\u0347"+
		"\n;\3;\3;\3;\5;\u034c\n;\3;\3;\7;\u0350\n;\f;\16;\u0353\13;\3;\5;\u0356"+
		"\n;\3;\5;\u0359\n;\3;\3;\3;\3;\5;\u035f\n;\3;\3;\5;\u0363\n;\3;\3;\5;"+
		"\u0367\n;\3;\5;\u036a\n;\3<\3<\5<\u036e\n<\3=\3=\5=\u0372\n=\3=\5=\u0375"+
		"\n=\3>\3>\3>\3>\6>\u037b\n>\r>\16>\u037c\3>\3>\3?\3?\3?\3@\5@\u0385\n"+
		"@\3@\3@\5@\u0389\n@\3A\3A\3A\3A\3A\3B\3B\3B\3B\5B\u0394\nB\3B\5B\u0397"+
		"\nB\3C\5C\u039a\nC\3C\3C\3C\3C\5C\u03a0\nC\3D\5D\u03a3\nD\3D\3D\5D\u03a7"+
		"\nD\3D\3D\5D\u03ab\nD\3E\3E\5E\u03af\nE\3E\5E\u03b2\nE\3F\3F\3F\3F\5F"+
		"\u03b8\nF\3F\3F\5F\u03bc\nF\3G\7G\u03bf\nG\fG\16G\u03c2\13G\3H\3H\3H\3"+
		"I\5I\u03c8\nI\3I\3I\3J\3J\7J\u03ce\nJ\fJ\16J\u03d1\13J\3J\3J\3K\3K\5K"+
		"\u03d7\nK\3L\3L\5L\u03db\nL\3M\3M\3M\3M\3N\3N\5N\u03e3\nN\3N\3N\5N\u03e7"+
		"\nN\3N\5N\u03ea\nN\3N\3N\5N\u03ee\nN\3N\5N\u03f1\nN\3N\3N\5N\u03f5\nN"+
		"\3N\3N\3O\3O\3P\3P\3P\3P\3P\3P\5P\u0401\nP\3P\3P\3P\3P\5P\u0407\nP\3P"+
		"\3P\3P\5P\u040c\nP\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\7P"+
		"\u041e\nP\fP\16P\u0421\13P\3Q\3Q\3Q\3Q\5Q\u0427\nQ\3Q\3Q\3Q\3Q\5Q\u042d"+
		"\nQ\5Q\u042f\nQ\3R\3R\3S\3S\3T\3T\3T\3T\3T\5T\u043a\nT\3U\3U\3U\3U\3U"+
		"\3U\3V\3V\5V\u0444\nV\3W\5W\u0447\nW\3W\3W\7W\u044b\nW\fW\16W\u044e\13"+
		"W\3X\3X\3X\3X\3Y\3Y\6Y\u0456\nY\rY\16Y\u0457\5Y\u045a\nY\3Z\7Z\u045d\n"+
		"Z\fZ\16Z\u0460\13Z\3Z\3Z\5Z\u0464\nZ\3Z\5Z\u0467\nZ\3[\3[\5[\u046b\n["+
		"\3[\7[\u046e\n[\f[\16[\u0471\13[\3\\\3\\\3\\\3\\\5\\\u0477\n\\\3\\\3\\"+
		"\3\\\3\\\5\\\u047d\n\\\3\\\3\\\3\\\5\\\u0482\n\\\3]\7]\u0485\n]\f]\16"+
		"]\u0488\13]\3]\3]\5]\u048c\n]\3]\5]\u048f\n]\3^\3^\5^\u0493\n^\3^\7^\u0496"+
		"\n^\f^\16^\u0499\13^\3_\3_\5_\u049d\n_\3_\3_\3_\7_\u04a2\n_\f_\16_\u04a5"+
		"\13_\3_\3_\5_\u04a9\n_\3`\3`\3`\5`\u04ae\n`\3a\3a\3a\5a\u04b3\na\3b\3"+
		"b\3b\3b\3b\3b\5b\u04bb\nb\5b\u04bd\nb\3c\3c\6c\u04c1\nc\rc\16c\u04c2\3"+
		"c\3c\3d\3d\3d\3d\5d\u04cb\nd\3d\3d\3d\3d\5d\u04d1\nd\3d\3d\5d\u04d5\n"+
		"d\3d\5d\u04d8\nd\3e\3e\5e\u04dc\ne\3e\7e\u04df\ne\fe\16e\u04e2\13e\3e"+
		"\3e\3f\3f\3f\3g\3g\5g\u04eb\ng\3h\3h\3i\3i\3i\6i\u04f2\ni\ri\16i\u04f3"+
		"\3j\3j\3j\5j\u04f9\nj\3k\3k\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l"+
		"\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u051b\nl\3m\6m\u051e"+
		"\nm\rm\16m\u051f\3n\7n\u0523\nn\fn\16n\u0526\13n\3n\6n\u0529\nn\rn\16"+
		"n\u052a\3o\3o\3o\3o\3o\3p\3p\6p\u0534\np\rp\16p\u0535\3p\3p\3q\3q\3q\5"+
		"q\u053d\nq\3q\3q\3q\5q\u0542\nq\3q\6q\u0545\nq\rq\16q\u0546\3q\3q\3q\3"+
		"q\3q\3q\3q\5q\u0550\nq\3q\3q\3q\5q\u0555\nq\3q\3q\3q\5q\u055a\nq\3q\6"+
		"q\u055d\nq\rq\16q\u055e\3q\3q\3q\3q\3q\3q\5q\u0567\nq\3q\3q\3q\5q\u056c"+
		"\nq\5q\u056e\nq\3r\3r\5r\u0572\nr\3s\3s\3s\3t\3t\3t\6t\u057a\nt\rt\16"+
		"t\u057b\3t\3t\3t\3t\2\3\u009eu\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\2\6\3\2%\'\3\2\62\63\3\2\64\66\3\2./\2\u0621\2\u00eb\3\2"+
		"\2\2\4\u00fd\3\2\2\2\6\u010d\3\2\2\2\b\u010f\3\2\2\2\n\u0114\3\2\2\2\f"+
		"\u0118\3\2\2\2\16\u0124\3\2\2\2\20\u0136\3\2\2\2\22\u0145\3\2\2\2\24\u0147"+
		"\3\2\2\2\26\u0153\3\2\2\2\30\u0162\3\2\2\2\32\u0172\3\2\2\2\34\u0176\3"+
		"\2\2\2\36\u0181\3\2\2\2 \u0184\3\2\2\2\"\u019d\3\2\2\2$\u01b1\3\2\2\2"+
		"&\u01b4\3\2\2\2(\u01bc\3\2\2\2*\u01c0\3\2\2\2,\u01d1\3\2\2\2.\u01d6\3"+
		"\2\2\2\60\u01d8\3\2\2\2\62\u01e3\3\2\2\2\64\u01f6\3\2\2\2\66\u0204\3\2"+
		"\2\28\u0214\3\2\2\2:\u0218\3\2\2\2<\u021a\3\2\2\2>\u0227\3\2\2\2@\u0236"+
		"\3\2\2\2B\u0246\3\2\2\2D\u024a\3\2\2\2F\u024d\3\2\2\2H\u0256\3\2\2\2J"+
		"\u0258\3\2\2\2L\u027c\3\2\2\2N\u027e\3\2\2\2P\u0289\3\2\2\2R\u0295\3\2"+
		"\2\2T\u029d\3\2\2\2V\u02a9\3\2\2\2X\u02c1\3\2\2\2Z\u02d1\3\2\2\2\\\u02da"+
		"\3\2\2\2^\u02e0\3\2\2\2`\u02e2\3\2\2\2b\u02e5\3\2\2\2d\u02e7\3\2\2\2f"+
		"\u02ee\3\2\2\2h\u02f4\3\2\2\2j\u02fc\3\2\2\2l\u0300\3\2\2\2n\u0312\3\2"+
		"\2\2p\u0314\3\2\2\2r\u0333\3\2\2\2t\u0369\3\2\2\2v\u036d\3\2\2\2x\u0371"+
		"\3\2\2\2z\u0376\3\2\2\2|\u0380\3\2\2\2~\u0384\3\2\2\2\u0080\u038a\3\2"+
		"\2\2\u0082\u0393\3\2\2\2\u0084\u0399\3\2\2\2\u0086\u03a2\3\2\2\2\u0088"+
		"\u03ae\3\2\2\2\u008a\u03bb\3\2\2\2\u008c\u03c0\3\2\2\2\u008e\u03c3\3\2"+
		"\2\2\u0090\u03c7\3\2\2\2\u0092\u03cb\3\2\2\2\u0094\u03d6\3\2\2\2\u0096"+
		"\u03da\3\2\2\2\u0098\u03dc\3\2\2\2\u009a\u03e0\3\2\2\2\u009c\u03f8\3\2"+
		"\2\2\u009e\u040b\3\2\2\2\u00a0\u042e\3\2\2\2\u00a2\u0430\3\2\2\2\u00a4"+
		"\u0432\3\2\2\2\u00a6\u0439\3\2\2\2\u00a8\u043b\3\2\2\2\u00aa\u0443\3\2"+
		"\2\2\u00ac\u0446\3\2\2\2\u00ae\u044f\3\2\2\2\u00b0\u0459\3\2\2\2\u00b2"+
		"\u045e\3\2\2\2\u00b4\u0468\3\2\2\2\u00b6\u0481\3\2\2\2\u00b8\u0486\3\2"+
		"\2\2\u00ba\u0492\3\2\2\2\u00bc\u049a\3\2\2\2\u00be\u04ad\3\2\2\2\u00c0"+
		"\u04af\3\2\2\2\u00c2\u04bc\3\2\2\2\u00c4\u04be\3\2\2\2\u00c6\u04d7\3\2"+
		"\2\2\u00c8\u04db\3\2\2\2\u00ca\u04e5\3\2\2\2\u00cc\u04ea\3\2\2\2\u00ce"+
		"\u04ec\3\2\2\2\u00d0\u04ee\3\2\2\2\u00d2\u04f8\3\2\2\2\u00d4\u04fa\3\2"+
		"\2\2\u00d6\u051a\3\2\2\2\u00d8\u051d\3\2\2\2\u00da\u0524\3\2\2\2\u00dc"+
		"\u052c\3\2\2\2\u00de\u0531\3\2\2\2\u00e0\u056d\3\2\2\2\u00e2\u0571\3\2"+
		"\2\2\u00e4\u0573\3\2\2\2\u00e6\u0576\3\2\2\2\u00e8\u00ea\5\u00e4s\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00f1\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\5\4\3\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f8\5\6\4\2\u00f5"+
		"\u00f7\5\6\4\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fc\7\2\2\3\u00fc\3\3\2\2\2\u00fd\u0101\7\4\2\2\u00fe\u00ff\5\u00cc"+
		"g\2\u00ff\u0100\7D\2\2\u0100\u0102\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\5\u0092J\2\u0104\5\3\2\2\2\u0105"+
		"\u010e\5\b\5\2\u0106\u010e\5\n\6\2\u0107\u010e\5\f\7\2\u0108\u010e\5\16"+
		"\b\2\u0109\u010e\5\24\13\2\u010a\u010e\5\26\f\2\u010b\u010e\5\30\r\2\u010c"+
		"\u010e\5\32\16\2\u010d\u0105\3\2\2\2\u010d\u0106\3\2\2\2\u010d\u0107\3"+
		"\2\2\2\u010d\u0108\3\2\2\2\u010d\u0109\3\2\2\2\u010d\u010a\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\7\3\2\2\2\u010f\u0110\7\6\2\2"+
		"\u0110\u0111\5\36\20\2\u0111\u0112\5:\36\2\u0112\u0113\7\27\2\2\u0113"+
		"\t\3\2\2\2\u0114\u0115\5j\66\2\u0115\u0116\7\f\2\2\u0116\u0117\5P)\2\u0117"+
		"\13\3\2\2\2\u0118\u0119\t\2\2\2\u0119\u011b\5\u00ccg\2\u011a\u011c\5 "+
		"\21\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u011f\5\34\17\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3"+
		"\2\2\2\u0120\u0121\5X-\2\u0121\u0122\7,\2\2\u0122\u0123\5\u00ccg\2\u0123"+
		"\r\3\2\2\2\u0124\u0125\7)\2\2\u0125\u0127\5\u00ccg\2\u0126\u0128\5 \21"+
		"\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u012b"+
		"\5\34\17\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2"+
		"\u012c\u0130\5\\/\2\u012d\u012f\5\20\t\2\u012e\u012d\3\2\2\2\u012f\u0132"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0134\7,\2\2\u0134\u0135\5\u00ccg\2\u0135\17\3\2"+
		"\2\2\u0136\u0137\7+\2\2\u0137\u013b\5\u00ccg\2\u0138\u013a\5\22\n\2\u0139"+
		"\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7,\2\2\u013f"+
		"\u0140\5\u00ccg\2\u0140\21\3\2\2\2\u0141\u0146\5\f\7\2\u0142\u0146\5\16"+
		"\b\2\u0143\u0146\5\24\13\2\u0144\u0146\5\30\r\2\u0145\u0141\3\2\2\2\u0145"+
		"\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\23\3\2\2"+
		"\2\u0147\u0148\7(\2\2\u0148\u014a\5\u00ccg\2\u0149\u014b\5 \21\2\u014a"+
		"\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014e\5\34"+
		"\17\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\5\u00acW\2\u0150\u0151\7,\2\2\u0151\u0152\5\u00ccg\2\u0152\25\3"+
		"\2\2\2\u0153\u0154\7<\2\2\u0154\u0158\5\u0092J\2\u0155\u0157\5\u00e4s"+
		"\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d\5\u00e6t"+
		"\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f"+
		"\5\u00d8m\2\u015f\u0160\7,\2\2\u0160\u0161\5\u0092J\2\u0161\27\3\2\2\2"+
		"\u0162\u0163\7*\2\2\u0163\u0164\7\33\2\2\u0164\u0165\5\u00ccg\2\u0165"+
		"\u0167\5\u00ccg\2\u0166\u0168\5 \21\2\u0167\u0166\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\5\u00ccg\2\u016a\u016c\7\34\2"+
		"\2\u016b\u016d\5\34\17\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\5X-\2\u016f\u0170\7,\2\2\u0170\u0171\5\u00cc"+
		"g\2\u0171\31\3\2\2\2\u0172\u0173\7\n\2\2\u0173\u0174\5\u00ccg\2\u0174"+
		"\u0175\5p9\2\u0175\33\3\2\2\2\u0176\u0177\7\n\2\2\u0177\u017c\5\u00cc"+
		"g\2\u0178\u0179\7\30\2\2\u0179\u017b\5\u00ccg\2\u017a\u0178\3\2\2\2\u017b"+
		"\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7\13\2\2\u0180\35\3\2\2\2\u0181\u0182"+
		"\5\u00ccg\2\u0182\u0183\7\23\2\2\u0183\37\3\2\2\2\u0184\u0185\7\21\2\2"+
		"\u0185\u018a\7\37\2\2\u0186\u0188\5\36\20\2\u0187\u0189\7\30\2\2\u0188"+
		"\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0186\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018f\7 \2\2\u018f!\3\2\2\2\u0190\u019e\5$\23\2\u0191"+
		"\u019e\5\u0092J\2\u0192\u019e\5\u0086D\2\u0193\u019e\58\35\2\u0194\u019e"+
		"\5> \2\u0195\u019e\5<\37\2\u0196\u019e\5@!\2\u0197\u0198\7\33\2\2\u0198"+
		"\u0199\5J&\2\u0199\u019a\7\34\2\2\u019a\u019e\3\2\2\2\u019b\u019e\5\u009c"+
		"O\2\u019c\u019e\5\u00a8U\2\u019d\u0190\3\2\2\2\u019d\u0191\3\2\2\2\u019d"+
		"\u0192\3\2\2\2\u019d\u0193\3\2\2\2\u019d\u0194\3\2\2\2\u019d\u0195\3\2"+
		"\2\2\u019d\u0196\3\2\2\2\u019d\u0197\3\2\2\2\u019d\u019b\3\2\2\2\u019d"+
		"\u019c\3\2\2\2\u019e#\3\2\2\2\u019f\u01a1\7\16\2\2\u01a0\u01a2\5\u00d2"+
		"j\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3"+
		"\u01a5\7\20\2\2\u01a4\u019f\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3"+
		"\2\2\2\u01a6\u01a8\5&\24\2\u01a7\u01a9\7\24\2\2\u01a8\u01a7\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01ac\5T+\2\u01ab\u01aa\3\2\2"+
		"\2\u01ab\u01ac\3\2\2\2\u01ac\u01b2\3\2\2\2\u01ad\u01ae\7\17\2\2\u01ae"+
		"\u01af\5\u00ceh\2\u01af\u01b0\5&\24\2\u01b0\u01b2\3\2\2\2\u01b1\u01a4"+
		"\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b2%\3\2\2\2\u01b3\u01b5\5*\26\2\u01b4"+
		"\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b9\3\2\2\2\u01b6\u01b8\5("+
		"\25\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\'\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01be\7\25\2"+
		"\2\u01bd\u01bf\5*\26\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf)"+
		"\3\2\2\2\u01c0\u01c1\7\33\2\2\u01c1\u01c6\5,\27\2\u01c2\u01c3\7\27\2\2"+
		"\u01c3\u01c5\5,\27\2\u01c4\u01c2\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4"+
		"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9"+
		"\u01ca\7\34\2\2\u01ca+\3\2\2\2\u01cb\u01d2\5.\30\2\u01cc\u01d2\5\60\31"+
		"\2\u01cd\u01d2\5\62\32\2\u01ce\u01d2\5\36\20\2\u01cf\u01d2\5\u00ccg\2"+
		"\u01d0\u01d2\5\64\33\2\u01d1\u01cb\3\2\2\2\u01d1\u01cc\3\2\2\2\u01d1\u01cd"+
		"\3\2\2\2\u01d1\u01ce\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2"+
		"-\3\2\2\2\u01d3\u01d7\5$\23\2\u01d4\u01d7\5\u009cO\2\u01d5\u01d7\5\u0086"+
		"D\2\u01d6\u01d3\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7"+
		"/\3\2\2\2\u01d8\u01d9\7\35\2\2\u01d9\u01de\5.\30\2\u01da\u01db\7\30\2"+
		"\2\u01db\u01dd\5.\30\2\u01dc\u01da\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1"+
		"\u01e2\7\36\2\2\u01e2\61\3\2\2\2\u01e3\u01f2\7\37\2\2\u01e4\u01e7\5\36"+
		"\20\2\u01e5\u01e7\5J&\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7"+
		"\u01ef\3\2\2\2\u01e8\u01eb\7\30\2\2\u01e9\u01ec\5\36\20\2\u01ea\u01ec"+
		"\5J&\2\u01eb\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed"+
		"\u01e8\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01e6\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\7 \2\2\u01f5\63\3\2\2\2"+
		"\u01f6\u01f7\7J\2\2\u01f7\u01f8\7\37\2\2\u01f8\u01fd\5\66\34\2\u01f9\u01fa"+
		"\7\30\2\2\u01fa\u01fc\5\66\34\2\u01fb\u01f9\3\2\2\2\u01fc\u01ff\3\2\2"+
		"\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fd"+
		"\3\2\2\2\u0200\u0201\7 \2\2\u0201\u0202\7I\2\2\u0202\u0203\5\"\22\2\u0203"+
		"\65\3\2\2\2\u0204\u0205\5\36\20\2\u0205\u0206\5R*\2\u0206\67\3\2\2\2\u0207"+
		"\u0208\7\35\2\2\u0208\u0215\7\36\2\2\u0209\u020a\7\35\2\2\u020a\u020f"+
		"\5F$\2\u020b\u020c\7\30\2\2\u020c\u020e\5F$\2\u020d\u020b\3\2\2\2\u020e"+
		"\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2"+
		"\2\2\u0211\u020f\3\2\2\2\u0212\u0213\7\36\2\2\u0213\u0215\3\2\2\2\u0214"+
		"\u0207\3\2\2\2\u0214\u0209\3\2\2\2\u02159\3\2\2\2\u0216\u0219\5d\63\2"+
		"\u0217\u0219\5j\66\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2\2\2\u0219;\3"+
		"\2\2\2\u021a\u0223\7\37\2\2\u021b\u0220\5H%\2\u021c\u021d\7\30\2\2\u021d"+
		"\u021f\5H%\2\u021e\u021c\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2"+
		"\2\u0220\u0221\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u021b"+
		"\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\7 \2\2\u0226"+
		"=\3\2\2\2\u0227\u0228\7\37\2\2\u0228\u0231\79\2\2\u0229\u022e\5D#\2\u022a"+
		"\u022b\7\30\2\2\u022b\u022d\5D#\2\u022c\u022a\3\2\2\2\u022d\u0230\3\2"+
		"\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0232\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0231\u0229\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u0234\79\2\2\u0234\u0235\7 \2\2\u0235?\3\2\2\2\u0236\u0237"+
		"\7!\2\2\u0237\u023b\5B\"\2\u0238\u023a\5B\"\2\u0239\u0238\3\2\2\2\u023a"+
		"\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2"+
		"\2\2\u023d\u023b\3\2\2\2\u023e\u023f\7[\2\2\u023fA\3\2\2\2\u0240\u0247"+
		"\7Y\2\2\u0241\u0242\7\33\2\2\u0242\u0243\5:\36\2\u0243\u0244\7\34\2\2"+
		"\u0244\u0247\3\2\2\2\u0245\u0247\5\u00a8U\2\u0246\u0240\3\2\2\2\u0246"+
		"\u0241\3\2\2\2\u0246\u0245\3\2\2\2\u0247C\3\2\2\2\u0248\u024b\5<\37\2"+
		"\u0249\u024b\5:\36\2\u024a\u0248\3\2\2\2\u024a\u0249\3\2\2\2\u024bE\3"+
		"\2\2\2\u024c\u024e\7I\2\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0250\5:\36\2\u0250G\3\2\2\2\u0251\u0257\5J&\2\u0252"+
		"\u0254\7I\2\2\u0253\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\3\2"+
		"\2\2\u0255\u0257\5:\36\2\u0256\u0251\3\2\2\2\u0256\u0253\3\2\2\2\u0257"+
		"I\3\2\2\2\u0258\u0259\5\36\20\2\u0259\u025a\5:\36\2\u025aK\3\2\2\2\u025b"+
		"\u027d\5R*\2\u025c\u027d\5\"\22\2\u025d\u025f\7$\2\2\u025e\u0260\5\u00cc"+
		"g\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261"+
		"\u0263\7\33\2\2\u0262\u0264\5\34\17\2\u0263\u0262\3\2\2\2\u0263\u0264"+
		"\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\5X-\2\u0266\u0268\7$\2\2\u0267"+
		"\u0269\5\u00ccg\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a"+
		"\3\2\2\2\u026a\u026b\7\34\2\2\u026b\u027d\3\2\2\2\u026c\u026e\7$\2\2\u026d"+
		"\u026f\5\u00ccg\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270"+
		"\3\2\2\2\u0270\u0271\5N(\2\u0271\u0273\7\33\2\2\u0272\u0274\5\34\17\2"+
		"\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276"+
		"\5X-\2\u0276\u0278\7$\2\2\u0277\u0279\5\u00ccg\2\u0278\u0277\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\7\34\2\2\u027b\u027d\3"+
		"\2\2\2\u027c\u025b\3\2\2\2\u027c\u025c\3\2\2\2\u027c\u025d\3\2\2\2\u027c"+
		"\u026c\3\2\2\2\u027dM\3\2\2\2\u027e\u027f\7\35\2\2\u027f\u0284\5\u00cc"+
		"g\2\u0280\u0281\7\27\2\2\u0281\u0283\5\u00ccg\2\u0282\u0280\3\2\2\2\u0283"+
		"\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2"+
		"\2\2\u0286\u0284\3\2\2\2\u0287\u0288\7\36\2\2\u0288O\3\2\2\2\u0289\u0293"+
		"\7\r\2\2\u028a\u028b\5\u00d2j\2\u028b\u028d\5&\24\2\u028c\u028e\7\24\2"+
		"\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0290\3\2\2\2\u028f\u0291"+
		"\5T+\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0294\3\2\2\2\u0292"+
		"\u0294\7\5\2\2\u0293\u028a\3\2\2\2\u0293\u0292\3\2\2\2\u0294Q\3\2\2\2"+
		"\u0295\u0296\5\u00d2j\2\u0296\u0298\5&\24\2\u0297\u0299\7\24\2\2\u0298"+
		"\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\3\2\2\2\u029a\u029c\5T"+
		"+\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029cS\3\2\2\2\u029d\u029e"+
		"\7\21\2\2\u029e\u02a3\7\37\2\2\u029f\u02a1\5V,\2\u02a0\u02a2\7\30\2\2"+
		"\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3\u029f"+
		"\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a7\3\2\2\2\u02a7\u02a8\7 \2\2\u02a8U\3\2\2\2\u02a9\u02b3\5\36\20\2"+
		"\u02aa\u02b4\5j\66\2\u02ab\u02b4\5R*\2\u02ac\u02ad\7\23\2\2\u02ad\u02b2"+
		"\5*\26\2\u02ae\u02af\7\23\2\2\u02af\u02b0\7\33\2\2\u02b0\u02b2\7\34\2"+
		"\2\u02b1\u02ac\3\2\2\2\u02b1\u02ae\3\2\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02aa"+
		"\3\2\2\2\u02b3\u02ab\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4W\3\2\2\2\u02b5"+
		"\u02b9\5\\/\2\u02b6\u02b8\5Z.\2\u02b7\u02b6\3\2\2\2\u02b8\u02bb\3\2\2"+
		"\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02c2\3\2\2\2\u02bb\u02b9"+
		"\3\2\2\2\u02bc\u02be\5Z.\2\u02bd\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02b5\3\2"+
		"\2\2\u02c1\u02bd\3\2\2\2\u02c2Y\3\2\2\2\u02c3\u02c4\5p9\2\u02c4\u02c5"+
		"\5\\/\2\u02c5\u02d2\3\2\2\2\u02c6\u02c8\7\7\2\2\u02c7\u02c6\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb\5p9\2\u02ca\u02cc\7\b\2"+
		"\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce"+
		"\5\\/\2\u02ce\u02d2\3\2\2\2\u02cf\u02d0\7\t\2\2\u02d0\u02d2\5\\/\2\u02d1"+
		"\u02c3\3\2\2\2\u02d1\u02c7\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2[\3\2\2\2"+
		"\u02d3\u02d5\5^\60\2\u02d4\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d4"+
		"\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02db\3\2\2\2\u02d8\u02d9\7\r\2\2\u02d9"+
		"\u02db\7\5\2\2\u02da\u02d4\3\2\2\2\u02da\u02d8\3\2\2\2\u02db]\3\2\2\2"+
		"\u02dc\u02e1\5b\62\2\u02dd\u02e1\5f\64\2\u02de\u02e1\5d\63\2\u02df\u02e1"+
		"\5`\61\2\u02e0\u02dc\3\2\2\2\u02e0\u02dd\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0"+
		"\u02df\3\2\2\2\u02e1_\3\2\2\2\u02e2\u02e3\5j\66\2\u02e3\u02e4\7\r\2\2"+
		"\u02e4a\3\2\2\2\u02e5\u02e6\5\6\4\2\u02e6c\3\2\2\2\u02e7\u02e8\5j\66\2"+
		"\u02e8\u02e9\7\f\2\2\u02e9\u02ea\7\60\2\2\u02eae\3\2\2\2\u02eb\u02ec\5"+
		"j\66\2\u02ec\u02ed\7\f\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02eb\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\5h\65\2\u02f1g\3\2\2\2"+
		"\u02f2\u02f3\7\61\2\2\u02f3\u02f5\79\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\5\u00ceh\2\u02f7\u02f8\5&\24"+
		"\2\u02f8\u02f9\7\23\2\2\u02f9\u02fa\5:\36\2\u02fa\u02fb\7\27\2\2\u02fb"+
		"i\3\2\2\2\u02fc\u02fe\5\"\22\2\u02fd\u02ff\5n8\2\u02fe\u02fd\3\2\2\2\u02fe"+
		"\u02ff\3\2\2\2\u02ffk\3\2\2\2\u0300\u0301\7\f\2\2\u0301\u0302\7\61\2\2"+
		"\u0302\u0303\78\2\2\u0303\u0304\5R*\2\u0304m\3\2\2\2\u0305\u0306\7\f\2"+
		"\2\u0306\u0308\5L\'\2\u0307\u0309\5n8\2\u0308\u0307\3\2\2\2\u0308\u0309"+
		"\3\2\2\2\u0309\u0313\3\2\2\2\u030a\u030c\7\31\2\2\u030b\u030d\5n8\2\u030c"+
		"\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0313\3\2\2\2\u030e\u0310\5l"+
		"\67\2\u030f\u0311\5n8\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311"+
		"\u0313\3\2\2\2\u0312\u0305\3\2\2\2\u0312\u030a\3\2\2\2\u0312\u030e\3\2"+
		"\2\2\u0313o\3\2\2\2\u0314\u0320\7\"\2\2\u0315\u0317\7\32\2\2\u0316\u0315"+
		"\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031d\5r:\2\u0319"+
		"\u031a\79\2\2\u031a\u031c\5r:\2\u031b\u0319\3\2\2\2\u031c\u031f\3\2\2"+
		"\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u031d"+
		"\3\2\2\2\u0320\u0316\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0323\7:\2\2\u0323q\3\2\2\2\u0324\u0327\5|?\2\u0325\u0327\5t;\2\u0326"+
		"\u0324\3\2\2\2\u0326\u0325\3\2\2\2\u0327\u032b\3\2\2\2\u0328\u032a\5\u0080"+
		"A\2\u0329\u0328\3\2\2\2\u032a\u032d\3\2\2\2\u032b\u0329\3\2\2\2\u032b"+
		"\u032c\3\2\2\2\u032c\u0334\3\2\2\2\u032d\u032b\3\2\2\2\u032e\u0330\5\u0080"+
		"A\2\u032f\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u032f\3\2\2\2\u0331"+
		"\u0332\3\2\2\2\u0332\u0334\3\2\2\2\u0333\u0326\3\2\2\2\u0333\u032f\3\2"+
		"\2\2\u0334s\3\2\2\2\u0335\u036a\5~@\2\u0336\u036a\5\u0092J\2\u0337\u033f"+
		"\7\37\2\2\u0338\u0339\5\36\20\2\u0339\u033b\5v<\2\u033a\u033c\7\30\2\2"+
		"\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033e\3\2\2\2\u033d\u0338"+
		"\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340"+
		"\u0346\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0344\7\30\2\2\u0343\u0342\3"+
		"\2\2\2\u0343\u0344\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0347\7\5\2\2\u0346"+
		"\u0343\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u036a\7 "+
		"\2\2\u0349\u034b\7\35\2\2\u034a\u034c\5x=\2\u034b\u034a\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u0351\3\2\2\2\u034d\u034e\7\30\2\2\u034e\u0350\5"+
		"x=\2\u034f\u034d\3\2\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2\2\u0351"+
		"\u0352\3\2\2\2\u0352\u0358\3\2\2\2\u0353\u0351\3\2\2\2\u0354\u0356\7\30"+
		"\2\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0357\3\2\2\2\u0357"+
		"\u0359\7\5\2\2\u0358\u0355\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a\3\2"+
		"\2\2\u035a\u0362\7\36\2\2\u035b\u035e\7\33\2\2\u035c\u035f\5~@\2\u035d"+
		"\u035f\5\u009cO\2\u035e\u035c\3\2\2\2\u035e\u035d\3\2\2\2\u035f\u0360"+
		"\3\2\2\2\u0360\u0361\7\34\2\2\u0361\u0363\3\2\2\2\u0362\u035b\3\2\2\2"+
		"\u0362\u0363\3\2\2\2\u0363\u036a\3\2\2\2\u0364\u0367\5\u00ccg\2\u0365"+
		"\u0367\5\u00d0i\2\u0366\u0364\3\2\2\2\u0366\u0365\3\2\2\2\u0367\u036a"+
		"\3\2\2\2\u0368\u036a\5\u008aF\2\u0369\u0335\3\2\2\2\u0369\u0336\3\2\2"+
		"\2\u0369\u0337\3\2\2\2\u0369\u0349\3\2\2\2\u0369\u0366\3\2\2\2\u0369\u0368"+
		"\3\2\2\2\u036au\3\2\2\2\u036b\u036e\5p9\2\u036c\u036e\7\5\2\2\u036d\u036b"+
		"\3\2\2\2\u036d\u036c\3\2\2\2\u036ew\3\2\2\2\u036f\u0372\5p9\2\u0370\u0372"+
		"\5z>\2\u0371\u036f\3\2\2\2\u0371\u0370\3\2\2\2\u0372\u0374\3\2\2\2\u0373"+
		"\u0375\5\u00c2b\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375y\3\2\2"+
		"\2\u0376\u0377\7\33\2\2\u0377\u037a\5p9\2\u0378\u0379\7\23\2\2\u0379\u037b"+
		"\5p9\2\u037a\u0378\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037a\3\2\2\2\u037c"+
		"\u037d\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f\7\34\2\2\u037f{\3\2\2\2"+
		"\u0380\u0381\78\2\2\u0381\u0382\5\"\22\2\u0382}\3\2\2\2\u0383\u0385\5"+
		"\u0082B\2\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\3\2\2\2"+
		"\u0386\u0388\7\61\2\2\u0387\u0389\5\u0084C\2\u0388\u0387\3\2\2\2\u0388"+
		"\u0389\3\2\2\2\u0389\177\3\2\2\2\u038a\u038b\7;\2\2\u038b\u038c\5j\66"+
		"\2\u038c\u038d\5p9\2\u038d\u038e\7\34\2\2\u038e\u0081\3\2\2\2\u038f\u0394"+
		"\5$\23\2\u0390\u0394\5\u009cO\2\u0391\u0394\5\u0092J\2\u0392\u0394\5\u00a6"+
		"T\2\u0393\u038f\3\2\2\2\u0393\u0390\3\2\2\2\u0393\u0391\3\2\2\2\u0393"+
		"\u0392\3\2\2\2\u0394\u0396\3\2\2\2\u0395\u0397\7\32\2\2\u0396\u0395\3"+
		"\2\2\2\u0396\u0397\3\2\2\2\u0397\u0083\3\2\2\2\u0398\u039a\7\32\2\2\u0399"+
		"\u0398\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039f\3\2\2\2\u039b\u03a0\5$"+
		"\23\2\u039c\u03a0\5\u009cO\2\u039d\u03a0\5\u0092J\2\u039e\u03a0\5\u00a6"+
		"T\2\u039f\u039b\3\2\2\2\u039f\u039c\3\2\2\2\u039f\u039d\3\2\2\2\u039f"+
		"\u039e\3\2\2\2\u03a0\u0085\3\2\2\2\u03a1\u03a3\5\u0082B\2\u03a2\u03a1"+
		"\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a6\7\61\2\2"+
		"\u03a5\u03a7\5\u0084C\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\u03aa\3\2\2\2\u03a8\u03a9\7\23\2\2\u03a9\u03ab\5\u009cO\2\u03aa\u03a8"+
		"\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u0087\3\2\2\2\u03ac\u03af\7L\2\2\u03ad"+
		"\u03af\5\u0090I\2\u03ae\u03ac\3\2\2\2\u03ae\u03ad\3\2\2\2\u03af\u03b1"+
		"\3\2\2\2\u03b0\u03b2\5\u008aF\2\u03b1\u03b0\3\2\2\2\u03b1\u03b2\3\2\2"+
		"\2\u03b2\u0089\3\2\2\2\u03b3\u03bc\7K\2\2\u03b4\u03b5\7#\2\2\u03b5\u03b7"+
		"\5\u008cG\2\u03b6\u03b8\5\u008eH\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2"+
		"\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\7#\2\2\u03ba\u03bc\3\2\2\2\u03bb"+
		"\u03b3\3\2\2\2\u03bb\u03b4\3\2\2\2\u03bc\u008b\3\2\2\2\u03bd\u03bf\5\u00cc"+
		"g\2\u03be\u03bd\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03be\3\2\2\2\u03c0"+
		"\u03c1\3\2\2\2\u03c1\u008d\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c3\u03c4\7\22"+
		"\2\2\u03c4\u03c5\5\u008cG\2\u03c5\u008f\3\2\2\2\u03c6\u03c8\5\u00a2R\2"+
		"\u03c7\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03ca"+
		"\7M\2\2\u03ca\u0091\3\2\2\2\u03cb\u03cf\7N\2\2\u03cc\u03ce\5\u0094K\2"+
		"\u03cd\u03cc\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03d0"+
		"\3\2\2\2\u03d0\u03d2\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03d3\7X\2\2\u03d3"+
		"\u0093\3\2\2\2\u03d4\u03d7\5\u0096L\2\u03d5\u03d7\7W\2\2\u03d6\u03d4\3"+
		"\2\2\2\u03d6\u03d5\3\2\2\2\u03d7\u0095\3\2\2\2\u03d8\u03db\5\u009aN\2"+
		"\u03d9\u03db\5\u0098M\2\u03da\u03d8\3\2\2\2\u03da\u03d9\3\2\2\2\u03db"+
		"\u0097\3\2\2\2\u03dc\u03dd\7U\2\2\u03dd\u03de\5\u009cO\2\u03de\u03df\7"+
		"\26\2\2\u03df\u0099\3\2\2\2\u03e0\u03ed\7V\2\2\u03e1\u03e3\5\u00d2j\2"+
		"\u03e2\u03e1\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e6"+
		"\5&\24\2\u03e5\u03e7\7\24\2\2\u03e6\u03e5\3\2\2\2\u03e6\u03e7\3\2\2\2"+
		"\u03e7\u03e9\3\2\2\2\u03e8\u03ea\5T+\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea"+
		"\3\2\2\2\u03ea\u03ee\3\2\2\2\u03eb\u03ec\7\23\2\2\u03ec\u03ee\5\"\22\2"+
		"\u03ed\u03e2\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ee\u03f0\3\2\2\2\u03ef\u03f1"+
		"\5n8\2\u03f0\u03ef\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f4\3\2\2\2\u03f2"+
		"\u03f3\7\f\2\2\u03f3\u03f5\7\60\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f5\3"+
		"\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\7\26\2\2\u03f7\u009b\3\2\2\2\u03f8"+
		"\u03f9\5\u009eP\2\u03f9\u009d\3\2\2\2\u03fa\u03fb\bP\1\2\u03fb\u040c\5"+
		"\u0088E\2\u03fc\u03fd\7\33\2\2\u03fd\u03fe\5\u009eP\2\u03fe\u0400\7\34"+
		"\2\2\u03ff\u0401\5\u008aF\2\u0400\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401"+
		"\u040c\3\2\2\2\u0402\u0403\5\u00a6T\2\u0403\u0404\5\u008aF\2\u0404\u040c"+
		"\3\2\2\2\u0405\u0407\5\u00a2R\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2\2"+
		"\2\u0407\u0408\3\2\2\2\u0408\u040c\5$\23\2\u0409\u040c\5\u00d4k\2\u040a"+
		"\u040c\5\u00a0Q\2\u040b\u03fa\3\2\2\2\u040b\u03fc\3\2\2\2\u040b\u0402"+
		"\3\2\2\2\u040b\u0406\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040a\3\2\2\2\u040c"+
		"\u041f\3\2\2\2\u040d\u040e\f\b\2\2\u040e\u040f\5\u00a4S\2\u040f\u0410"+
		"\5\u009eP\t\u0410\u041e\3\2\2\2\u0411\u0412\f\7\2\2\u0412\u0413\5\u00a2"+
		"R\2\u0413\u0414\5\u009eP\b\u0414\u041e\3\2\2\2\u0415\u0416\f\5\2\2\u0416"+
		"\u0417\5\u00a4S\2\u0417\u0418\5\u00a6T\2\u0418\u041e\3\2\2\2\u0419\u041a"+
		"\f\4\2\2\u041a\u041b\5\u00a2R\2\u041b\u041c\5\u00a6T\2\u041c\u041e\3\2"+
		"\2\2\u041d\u040d\3\2\2\2\u041d\u0411\3\2\2\2\u041d\u0415\3\2\2\2\u041d"+
		"\u0419\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2"+
		"\2\2\u0420\u009f\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0423\5\u00a6T\2\u0423"+
		"\u0426\5\u00a4S\2\u0424\u0427\5\u00a6T\2\u0425\u0427\5\u009eP\2\u0426"+
		"\u0424\3\2\2\2\u0426\u0425\3\2\2\2\u0427\u042f\3\2\2\2\u0428\u0429\5\u00a6"+
		"T\2\u0429\u042c\5\u00a2R\2\u042a\u042d\5\u00a6T\2\u042b\u042d\5\u009e"+
		"P\2\u042c\u042a\3\2\2\2\u042c\u042b\3\2\2\2\u042d\u042f\3\2\2\2\u042e"+
		"\u0422\3\2\2\2\u042e\u0428\3\2\2\2\u042f\u00a1\3\2\2\2\u0430\u0431\t\3"+
		"\2\2\u0431\u00a3\3\2\2\2\u0432\u0433\t\4\2\2\u0433\u00a5\3\2\2\2\u0434"+
		"\u0435\7\33\2\2\u0435\u0436\5:\36\2\u0436\u0437\7\34\2\2\u0437\u043a\3"+
		"\2\2\2\u0438\u043a\5\u00a8U\2\u0439\u0434\3\2\2\2\u0439\u0438\3\2\2\2"+
		"\u043a\u00a7\3\2\2\2\u043b\u043c\7\33\2\2\u043c\u043d\5\u00aaV\2\u043d"+
		"\u043e\5R*\2\u043e\u043f\5\u00aaV\2\u043f\u0440\7\34\2\2\u0440\u00a9\3"+
		"\2\2\2\u0441\u0444\5\"\22\2\u0442\u0444\5\u00a6T\2\u0443\u0441\3\2\2\2"+
		"\u0443\u0442\3\2\2\2\u0444\u00ab\3\2\2\2\u0445\u0447\5f\64\2\u0446\u0445"+
		"\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u044c\5\u00b0Y"+
		"\2\u0449\u044b\5\u00aeX\2\u044a\u0449\3\2\2\2\u044b\u044e\3\2\2\2\u044c"+
		"\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u00ad\3\2\2\2\u044e\u044c\3\2"+
		"\2\2\u044f\u0450\7-\2\2\u0450\u0451\5\36\20\2\u0451\u0452\5\u00b0Y\2\u0452"+
		"\u00af\3\2\2\2\u0453\u045a\5\u00b2Z\2\u0454\u0456\5\u00c4c\2\u0455\u0454"+
		"\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458"+
		"\u045a\3\2\2\2\u0459\u0453\3\2\2\2\u0459\u0455\3\2\2\2\u045a\u00b1\3\2"+
		"\2\2\u045b\u045d\5\u00c4c\2\u045c\u045b\3\2\2\2\u045d\u0460\3\2\2\2\u045e"+
		"\u045c\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0461\3\2\2\2\u0460\u045e\3\2"+
		"\2\2\u0461\u0466\5\u00b4[\2\u0462\u0464\7\30\2\2\u0463\u0462\3\2\2\2\u0463"+
		"\u0464\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0467\5\u00b2Z\2\u0466\u0463"+
		"\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u00b3\3\2\2\2\u0468\u046a\5\u00b6\\"+
		"\2\u0469\u046b\5n8\2\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046f"+
		"\3\2\2\2\u046c\u046e\5\u00c4c\2\u046d\u046c\3\2\2\2\u046e\u0471\3\2\2"+
		"\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u00b5\3\2\2\2\u0471\u046f"+
		"\3\2\2\2\u0472\u0482\5\u00bc_\2\u0473\u0476\7\35\2\2\u0474\u0477\5\u00b0"+
		"Y\2\u0475\u0477\5\u00c4c\2\u0476\u0474\3\2\2\2\u0476\u0475\3\2\2\2\u0476"+
		"\u0477\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0482\7\36\2\2\u0479\u047c\7"+
		"\37\2\2\u047a\u047d\5\u00b8]\2\u047b\u047d\5\u00c4c\2\u047c\u047a\3\2"+
		"\2\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\3\2\2\2\u047e"+
		"\u0482\7 \2\2\u047f\u0482\5\"\22\2\u0480\u0482\5\u00c8e\2\u0481\u0472"+
		"\3\2\2\2\u0481\u0473\3\2\2\2\u0481\u0479\3\2\2\2\u0481\u047f\3\2\2\2\u0481"+
		"\u0480\3\2\2\2\u0482\u00b7\3\2\2\2\u0483\u0485\5\u00c4c\2\u0484\u0483"+
		"\3\2\2\2\u0485\u0488\3\2\2\2\u0486\u0484\3\2\2\2\u0486\u0487\3\2\2\2\u0487"+
		"\u0489\3\2\2\2\u0488\u0486\3\2\2\2\u0489\u048e\5\u00ba^\2\u048a\u048c"+
		"\7\30\2\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2\2"+
		"\u048d\u048f\5\u00b8]\2\u048e\u048b\3\2\2\2\u048e\u048f\3\2\2\2\u048f"+
		"\u00b9\3\2\2\2\u0490\u0493\5\u00bc_\2\u0491\u0493\5\u00c8e\2\u0492\u0490"+
		"\3\2\2\2\u0492\u0491\3\2\2\2\u0493\u0497\3\2\2\2\u0494\u0496\5\u00c4c"+
		"\2\u0495\u0494\3\2\2\2\u0496\u0499\3\2\2\2\u0497\u0495\3\2\2\2\u0497\u0498"+
		"\3\2\2\2\u0498\u00bb\3\2\2\2\u0499\u0497\3\2\2\2\u049a\u049c\7\"\2\2\u049b"+
		"\u049d\7\32\2\2\u049c\u049b\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3"+
		"\2\2\2\u049e\u04a3\5\u00be`\2\u049f\u04a0\79\2\2\u04a0\u04a2\5\u00be`"+
		"\2\u04a1\u049f\3\2\2\2\u04a2\u04a5\3\2\2\2\u04a3\u04a1\3\2\2\2\u04a3\u04a4"+
		"\3\2\2\2\u04a4\u04a6\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a6\u04a8\7:\2\2\u04a7"+
		"\u04a9\5\u00c2b\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u00bd"+
		"\3\2\2\2\u04aa\u04ae\5\u00c0a\2\u04ab\u04ae\5\u00ccg\2\u04ac\u04ae\5\u0092"+
		"J\2\u04ad\u04aa\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ac\3\2\2\2\u04ae"+
		"\u00bf\3\2\2\2\u04af\u04b2\78\2\2\u04b0\u04b3\5$\23\2\u04b1\u04b3\5\u0092"+
		"J\2\u04b2\u04b0\3\2\2\2\u04b2\u04b1\3\2\2\2\u04b3\u00c1\3\2\2\2\u04b4"+
		"\u04bd\7\62\2\2\u04b5\u04bd\7\64\2\2\u04b6\u04bd\7\67\2\2\u04b7\u04ba"+
		"\78\2\2\u04b8\u04bb\7M\2\2\u04b9\u04bb\5$\23\2\u04ba\u04b8\3\2\2\2\u04ba"+
		"\u04b9\3\2\2\2\u04bb\u04bd\3\2\2\2\u04bc\u04b4\3\2\2\2\u04bc\u04b5\3\2"+
		"\2\2\u04bc\u04b6\3\2\2\2\u04bc\u04b7\3\2\2\2\u04bd\u00c3\3\2\2\2\u04be"+
		"\u04c0\7\33\2\2\u04bf\u04c1\5\u00c6d\2\u04c0\u04bf\3\2\2\2\u04c1\u04c2"+
		"\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4"+
		"\u04c5\7\34\2\2\u04c5\u00c5\3\2\2\2\u04c6\u04c7\7\6\2\2\u04c7\u04c8\5"+
		"\36\20\2\u04c8\u04ca\5\u00b6\\\2\u04c9\u04cb\5n8\2\u04ca\u04c9\3\2\2\2"+
		"\u04ca\u04cb\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\7\27\2\2\u04cd\u04d8"+
		"\3\2\2\2\u04ce\u04d4\5\u00b6\\\2\u04cf\u04d1\5n8\2\u04d0\u04cf\3\2\2\2"+
		"\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\7\f\2\2\u04d3\u04d5"+
		"\5h\65\2\u04d4\u04d0\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d8\3\2\2\2\u04d6"+
		"\u04d8\5f\64\2\u04d7\u04c6\3\2\2\2\u04d7\u04ce\3\2\2\2\u04d7\u04d6\3\2"+
		"\2\2\u04d8\u00c7\3\2\2\2\u04d9\u04dc\5\36\20\2\u04da\u04dc\5\u00caf\2"+
		"\u04db\u04d9\3\2\2\2\u04db\u04da\3\2\2\2\u04dc\u04e0\3\2\2\2\u04dd\u04df"+
		"\5\u00c4c\2\u04de\u04dd\3\2\2\2\u04df\u04e2\3\2\2\2\u04e0\u04de\3\2\2"+
		"\2\u04e0\u04e1\3\2\2\2\u04e1\u04e3\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e3\u04e4"+
		"\5\u00b4[\2\u04e4\u00c9\3\2\2\2\u04e5\u04e6\5\u00bc_\2\u04e6\u04e7\7\23"+
		"\2\2\u04e7\u00cb\3\2\2\2\u04e8\u04eb\7P\2\2\u04e9\u04eb\5\u00d6l\2\u04ea"+
		"\u04e8\3\2\2\2\u04ea\u04e9\3\2\2\2\u04eb\u00cd\3\2\2\2\u04ec\u04ed\7O"+
		"\2\2\u04ed\u00cf\3\2\2\2\u04ee\u04f1\5\u00ccg\2\u04ef\u04f0\7\22\2\2\u04f0"+
		"\u04f2\5\u00ccg\2\u04f1\u04ef\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f1"+
		"\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u00d1\3\2\2\2\u04f5\u04f9\5\u00ceh"+
		"\2\u04f6\u04f9\5\u00ccg\2\u04f7\u04f9\5\u00d0i\2\u04f8\u04f5\3\2\2\2\u04f8"+
		"\u04f6\3\2\2\2\u04f8\u04f7\3\2\2\2\u04f9\u00d3\3\2\2\2\u04fa\u04fb\t\5"+
		"\2\2\u04fb\u00d5\3\2\2\2\u04fc\u051b\7\4\2\2\u04fd\u051b\7\6\2\2\u04fe"+
		"\u051b\7%\2\2\u04ff\u051b\7&\2\2\u0500\u051b\7\'\2\2\u0501\u051b\7(\2"+
		"\2\u0502\u051b\7)\2\2\u0503\u051b\7*\2\2\u0504\u051b\7+\2\2\u0505\u051b"+
		"\7,\2\2\u0506\u051b\7\n\2\2\u0507\u051b\7\13\2\2\u0508\u051b\7\66\2\2"+
		"\u0509\u051b\7-\2\2\u050a\u051b\7\7\2\2\u050b\u051b\7\b\2\2\u050c\u051b"+
		"\7\t\2\2\u050d\u051b\5\u00d4k\2\u050e\u051b\7<\2\2\u050f\u051b\7=\2\2"+
		"\u0510\u051b\7?\2\2\u0511\u051b\7@\2\2\u0512\u051b\7A\2\2\u0513\u051b"+
		"\7B\2\2\u0514\u051b\7D\2\2\u0515\u051b\7F\2\2\u0516\u051b\7G\2\2\u0517"+
		"\u051b\7H\2\2\u0518\u051b\7I\2\2\u0519\u051b\7J\2\2\u051a\u04fc\3\2\2"+
		"\2\u051a\u04fd\3\2\2\2\u051a\u04fe\3\2\2\2\u051a\u04ff\3\2\2\2\u051a\u0500"+
		"\3\2\2\2\u051a\u0501\3\2\2\2\u051a\u0502\3\2\2\2\u051a\u0503\3\2\2\2\u051a"+
		"\u0504\3\2\2\2\u051a\u0505\3\2\2\2\u051a\u0506\3\2\2\2\u051a\u0507\3\2"+
		"\2\2\u051a\u0508\3\2\2\2\u051a\u0509\3\2\2\2\u051a\u050a\3\2\2\2\u051a"+
		"\u050b\3\2\2\2\u051a\u050c\3\2\2\2\u051a\u050d\3\2\2\2\u051a\u050e\3\2"+
		"\2\2\u051a\u050f\3\2\2\2\u051a\u0510\3\2\2\2\u051a\u0511\3\2\2\2\u051a"+
		"\u0512\3\2\2\2\u051a\u0513\3\2\2\2\u051a\u0514\3\2\2\2\u051a\u0515\3\2"+
		"\2\2\u051a\u0516\3\2\2\2\u051a\u0517\3\2\2\2\u051a\u0518\3\2\2\2\u051a"+
		"\u0519\3\2\2\2\u051b\u00d7\3\2\2\2\u051c\u051e\5\u00dan\2\u051d\u051c"+
		"\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u051d\3\2\2\2\u051f\u0520\3\2\2\2\u0520"+
		"\u00d9\3\2\2\2\u0521\u0523\5\6\4\2\u0522\u0521\3\2\2\2\u0523\u0526\3\2"+
		"\2\2\u0524\u0522\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0528\3\2\2\2\u0526"+
		"\u0524\3\2\2\2\u0527\u0529\5\u00dco\2\u0528\u0527\3\2\2\2\u0529\u052a"+
		"\3\2\2\2\u052a\u0528\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u00db\3\2\2\2\u052c"+
		"\u052d\7=\2\2\u052d\u052e\5j\66\2\u052e\u052f\5p9\2\u052f\u0530\5\u0092"+
		"J\2\u0530\u00dd\3\2\2\2\u0531\u0533\7?\2\2\u0532\u0534\5\u00e0q\2\u0533"+
		"\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0533\3\2\2\2\u0535\u0536\3\2"+
		"\2\2\u0536\u0537\3\2\2\2\u0537\u0538\7@\2\2\u0538\u00df\3\2\2\2\u0539"+
		"\u053a\5\u00e2r\2\u053a\u053b\7D\2\2\u053b\u053d\3\2\2\2\u053c\u0539\3"+
		"\2\2\2\u053c\u053d\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u053f\7B\2\2\u053f"+
		"\u0541\5\u00e2r\2\u0540\u0542\5\u00dep\2\u0541\u0540\3\2\2\2\u0541\u0542"+
		"\3\2\2\2\u0542\u0544\3\2\2\2\u0543\u0545\5\6\4\2\u0544\u0543\3\2\2\2\u0545"+
		"\u0546\3\2\2\2\u0546\u0544\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0548\3\2"+
		"\2\2\u0548\u0549\7,\2\2\u0549\u054a\5\u00e2r\2\u054a\u056e\3\2\2\2\u054b"+
		"\u054c\5\u00e2r\2\u054c\u054f\7C\2\2\u054d\u054e\7D\2\2\u054e\u0550\5"+
		"\u00e2r\2\u054f\u054d\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u056e\3\2\2\2"+
		"\u0551\u0552\5\u00e2r\2\u0552\u0553\7D\2\2\u0553\u0555\3\2\2\2\u0554\u0551"+
		"\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0557\7A\2\2\u0557"+
		"\u0559\5\u0092J\2\u0558\u055a\5\u00dep\2\u0559\u0558\3\2\2\2\u0559\u055a"+
		"\3\2\2\2\u055a\u055c\3\2\2\2\u055b\u055d\5\6\4\2\u055c\u055b\3\2\2\2\u055d"+
		"\u055e\3\2\2\2\u055e\u055c\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0560\3\2"+
		"\2\2\u0560\u0561\7,\2\2\u0561\u0562\5\u0092J\2\u0562\u056e\3\2\2\2\u0563"+
		"\u0564\5\u00e2r\2\u0564\u0565\7D\2\2\u0565\u0567\3\2\2\2\u0566\u0563\3"+
		"\2\2\2\u0566\u0567\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u056b\5\u0092J\2"+
		"\u0569\u056c\7E\2\2\u056a\u056c\5\u00dep\2\u056b\u0569\3\2\2\2\u056b\u056a"+
		"\3\2\2\2\u056c\u056e\3\2\2\2\u056d\u053c\3\2\2\2\u056d\u054b\3\2\2\2\u056d"+
		"\u0554\3\2\2\2\u056d\u0566\3\2\2\2\u056e\u00e1\3\2\2\2\u056f\u0572\7>"+
		"\2\2\u0570\u0572\5\u00ccg\2\u0571\u056f\3\2\2\2\u0571\u0570\3\2\2\2\u0572"+
		"\u00e3\3\2\2\2\u0573\u0574\7F\2\2\u0574\u0575\5\u00e0q\2\u0575\u00e5\3"+
		"\2\2\2\u0576\u0577\7H\2\2\u0577\u0579\7G\2\2\u0578\u057a\5\6\4\2\u0579"+
		"\u0578\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u0579\3\2\2\2\u057b\u057c\3\2"+
		"\2\2\u057c\u057d\3\2\2\2\u057d\u057e\7,\2\2\u057e\u057f\7G\2\2\u057f\u00e7"+
		"\3\2\2\2\u00c3\u00eb\u00f1\u00f8\u0101\u010d\u011b\u011e\u0127\u012a\u0130"+
		"\u013b\u0145\u014a\u014d\u0158\u015c\u0167\u016c\u017c\u0188\u018c\u019d"+
		"\u01a1\u01a4\u01a8\u01ab\u01b1\u01b4\u01b9\u01be\u01c6\u01d1\u01d6\u01de"+
		"\u01e6\u01eb\u01ef\u01f2\u01fd\u020f\u0214\u0218\u0220\u0223\u022e\u0231"+
		"\u023b\u0246\u024a\u024d\u0253\u0256\u025f\u0263\u0268\u026e\u0273\u0278"+
		"\u027c\u0284\u028d\u0290\u0293\u0298\u029b\u02a1\u02a5\u02b1\u02b3\u02b9"+
		"\u02bf\u02c1\u02c7\u02cb\u02d1\u02d6\u02da\u02e0\u02ee\u02f4\u02fe\u0308"+
		"\u030c\u0310\u0312\u0316\u031d\u0320\u0326\u032b\u0331\u0333\u033b\u033f"+
		"\u0343\u0346\u034b\u0351\u0355\u0358\u035e\u0362\u0366\u0369\u036d\u0371"+
		"\u0374\u037c\u0384\u0388\u0393\u0396\u0399\u039f\u03a2\u03a6\u03aa\u03ae"+
		"\u03b1\u03b7\u03bb\u03c0\u03c7\u03cf\u03d6\u03da\u03e2\u03e6\u03e9\u03ed"+
		"\u03f0\u03f4\u0400\u0406\u040b\u041d\u041f\u0426\u042c\u042e\u0439\u0443"+
		"\u0446\u044c\u0457\u0459\u045e\u0463\u0466\u046a\u046f\u0476\u047c\u0481"+
		"\u0486\u048b\u048e\u0492\u0497\u049c\u04a3\u04a8\u04ad\u04b2\u04ba\u04bc"+
		"\u04c2\u04ca\u04d0\u04d4\u04d7\u04db\u04e0\u04ea\u04f3\u04f8\u051a\u051f"+
		"\u0524\u052a\u0535\u053c\u0541\u0546\u054f\u0554\u0559\u055e\u0566\u056b"+
		"\u056d\u0571\u057b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}