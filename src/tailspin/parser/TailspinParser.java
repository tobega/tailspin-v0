// Generated from TailspinParser.g4 by ANTLR 4.8
package tailspin.parser;

import java.util.List;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

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
		RightBrace=30, StartBytes=31, StartMatcher=32, Quote=33, Lambda=34, Tick=35, 
		StartTemplatesDefinition=36, StartSourceDefinition=37, StartSinkDefinition=38, 
		StartComposerDefinition=39, StartProcessorDefinition=40, StartOperatorDefinition=41, 
		StartStateDefinition=42, EndDefinition=43, Rule=44, First=45, Last=46, 
		TemplateMatch=47, Range=48, Plus=49, Minus=50, Star=51, TruncateDivide=52, 
		Mod=53, Question=54, Equal=55, Else=56, EndMatcher=57, BeginCondition=58, 
		StartTestDefinition=59, Assert=60, CoreSystem=61, With=62, Provided=63, 
		Modified=64, Shadowed=65, Inherited=66, From=67, StandAlone=68, Use=69, 
		Program=70, Modify=71, By=72, Collect=73, Scalar=74, Zero=75, PositiveInteger=76, 
		START_STRING=77, STATE_IDENTIFIER=78, IDENTIFIER=79, WS=80, Comment=81, 
		REGEX_TEXT=82, END_REGEX=83, StartCharacterCode=84, StartStringInterpolate=85, 
		STRING_TEXT=86, END_STRING=87, Bytes=88, Bytes_WS=89, EndBytes=90;
	public static final int
		RULE_program = 0, RULE_inclusion = 1, RULE_statement = 2, RULE_definition = 3, 
		RULE_valueChainToSink = 4, RULE_templatesDefinition = 5, RULE_processorDefinition = 6, 
		RULE_typestateDefinition = 7, RULE_messageDefinition = 8, RULE_composerDefinition = 9, 
		RULE_testDefinition = 10, RULE_operatorDefinition = 11, RULE_dataDeclaration = 12, 
		RULE_dataDefinition = 13, RULE_localDataDeclaration = 14, RULE_localDataDefinition = 15, 
		RULE_key = 16, RULE_parameterDefinitions = 17, RULE_source = 18, RULE_sourceReference = 19, 
		RULE_reference = 20, RULE_structureReference = 21, RULE_lens = 22, RULE_dimensionReference = 23, 
		RULE_simpleDimension = 24, RULE_multiValueDimension = 25, RULE_projection = 26, 
		RULE_grouping = 27, RULE_collectedValue = 28, RULE_arrayLiteral = 29, 
		RULE_arrayOffset = 30, RULE_valueProduction = 31, RULE_structureLiteral = 32, 
		RULE_relationLiteral = 33, RULE_bytesLiteral = 34, RULE_byteValue = 35, 
		RULE_structures = 36, RULE_arrayExpansion = 37, RULE_structureExpansion = 38, 
		RULE_keyValue = 39, RULE_templates = 40, RULE_arrayIndexDecomposition = 41, 
		RULE_sink = 42, RULE_templatesReference = 43, RULE_parameterValues = 44, 
		RULE_parameterValue = 45, RULE_templatesBody = 46, RULE_matchTemplate = 47, 
		RULE_block = 48, RULE_blockExpression = 49, RULE_resultValue = 50, RULE_blockStatement = 51, 
		RULE_sendToTemplates = 52, RULE_stateAssignment = 53, RULE_stateSink = 54, 
		RULE_append = 55, RULE_prepend = 56, RULE_valueChain = 57, RULE_collectorChain = 58, 
		RULE_transform = 59, RULE_matcher = 60, RULE_membrane = 61, RULE_typeMatch = 62, 
		RULE_structureContentMatcher = 63, RULE_arrayContentMatcher = 64, RULE_sequenceMatch = 65, 
		RULE_literalMatch = 66, RULE_rangeBounds = 67, RULE_condition = 68, RULE_lowerBound = 69, 
		RULE_upperBound = 70, RULE_rangeLiteral = 71, RULE_integerLiteral = 72, 
		RULE_unit = 73, RULE_measureProduct = 74, RULE_measureDenominator = 75, 
		RULE_nonZeroInteger = 76, RULE_tag = 77, RULE_stringLiteral = 78, RULE_stringContent = 79, 
		RULE_stringInterpolate = 80, RULE_characterCode = 81, RULE_interpolateEvaluate = 82, 
		RULE_arithmeticValue = 83, RULE_arithmeticExpression = 84, RULE_termArithmeticOperation = 85, 
		RULE_additiveOperator = 86, RULE_multiplicativeOperator = 87, RULE_term = 88, 
		RULE_operatorExpression = 89, RULE_operand = 90, RULE_composerBody = 91, 
		RULE_definedCompositionSequence = 92, RULE_compositionSequence = 93, RULE_compositionComponents = 94, 
		RULE_compositionComponent = 95, RULE_compositionMatcher = 96, RULE_structureMemberMatchers = 97, 
		RULE_structureMemberMatcher = 98, RULE_tokenMatcher = 99, RULE_compositionToken = 100, 
		RULE_literalComposition = 101, RULE_multiplier = 102, RULE_compositionSkipRule = 103, 
		RULE_compositionCapture = 104, RULE_compositionKeyValue = 105, RULE_compositionKey = 106, 
		RULE_localIdentifier = 107, RULE_stateIdentifier = 108, RULE_externalIdentifier = 109, 
		RULE_anyIdentifier = 110, RULE_arithmeticContextKeyword = 111, RULE_keyword = 112, 
		RULE_testBody = 113, RULE_testBlock = 114, RULE_assertion = 115, RULE_dependencyProvision = 116, 
		RULE_moduleConfiguration = 117, RULE_moduleIdentifier = 118, RULE_useModule = 119, 
		RULE_programModification = 120;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "inclusion", "statement", "definition", "valueChainToSink", 
			"templatesDefinition", "processorDefinition", "typestateDefinition", 
			"messageDefinition", "composerDefinition", "testDefinition", "operatorDefinition", 
			"dataDeclaration", "dataDefinition", "localDataDeclaration", "localDataDefinition", 
			"key", "parameterDefinitions", "source", "sourceReference", "reference", 
			"structureReference", "lens", "dimensionReference", "simpleDimension", 
			"multiValueDimension", "projection", "grouping", "collectedValue", "arrayLiteral", 
			"arrayOffset", "valueProduction", "structureLiteral", "relationLiteral", 
			"bytesLiteral", "byteValue", "structures", "arrayExpansion", "structureExpansion", 
			"keyValue", "templates", "arrayIndexDecomposition", "sink", "templatesReference", 
			"parameterValues", "parameterValue", "templatesBody", "matchTemplate", 
			"block", "blockExpression", "resultValue", "blockStatement", "sendToTemplates", 
			"stateAssignment", "stateSink", "append", "prepend", "valueChain", "collectorChain", 
			"transform", "matcher", "membrane", "typeMatch", "structureContentMatcher", 
			"arrayContentMatcher", "sequenceMatch", "literalMatch", "rangeBounds", 
			"condition", "lowerBound", "upperBound", "rangeLiteral", "integerLiteral", 
			"unit", "measureProduct", "measureDenominator", "nonZeroInteger", "tag", 
			"stringLiteral", "stringContent", "stringInterpolate", "characterCode", 
			"interpolateEvaluate", "arithmeticValue", "arithmeticExpression", "termArithmeticOperation", 
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
			"'['", "']'", "'{'", "'}'", "'[x'", "'<'", "'\"'", "'\\'", "'\u00B4'", 
			"'templates'", "'source'", "'sink'", "'composer'", "'processor'", "'operator'", 
			"'state'", "'end'", "'rule'", "'first'", "'last'", "'#'", "'..'", "'+'", 
			"'-'", "'*'", "'~/'", "'mod'", "'?'", "'='", "'|'", "'>'", null, "'test'", 
			"'assert'", "'core-system/'", "'with'", "'provided'", "'modified'", "'shadowed'", 
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
			"RightBrace", "StartBytes", "StartMatcher", "Quote", "Lambda", "Tick", 
			"StartTemplatesDefinition", "StartSourceDefinition", "StartSinkDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "StartOperatorDefinition", 
			"StartStateDefinition", "EndDefinition", "Rule", "First", "Last", "TemplateMatch", 
			"Range", "Plus", "Minus", "Star", "TruncateDivide", "Mod", "Question", 
			"Equal", "Else", "EndMatcher", "BeginCondition", "StartTestDefinition", 
			"Assert", "CoreSystem", "With", "Provided", "Modified", "Shadowed", "Inherited", 
			"From", "StandAlone", "Use", "Program", "Modify", "By", "Collect", "Scalar", 
			"Zero", "PositiveInteger", "START_STRING", "STATE_IDENTIFIER", "IDENTIFIER", 
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(242);
					useModule();
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248);
					inclusion();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(254);
			statement();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(255);
				statement();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(Include);
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(264);
				localIdentifier();
				setState(265);
				match(From);
				}
				break;
			}
			setState(269);
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
		public DataDeclarationContext dataDeclaration() {
			return getRuleContext(DataDeclarationContext.class,0);
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
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				valueChainToSink();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				templatesDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				processorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				composerDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(276);
				testDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(277);
				operatorDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(278);
				dataDeclaration();
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
			setState(281);
			match(Def);
			setState(282);
			key();
			setState(283);
			valueProduction();
			setState(284);
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
			setState(286);
			valueChain();
			setState(287);
			match(To);
			setState(288);
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
			setState(290);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(295);
				localDataDeclaration();
				}
				break;
			}
			setState(298);
			templatesBody();
			setState(299);
			match(EndDefinition);
			setState(300);
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
			setState(302);
			match(StartProcessorDefinition);
			setState(303);
			localIdentifier();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(304);
				parameterDefinitions();
				}
			}

			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(307);
				localDataDeclaration();
				}
				break;
			}
			setState(310);
			block();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==StartStateDefinition) {
				{
				{
				setState(311);
				typestateDefinition();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			match(EndDefinition);
			setState(318);
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
			setState(320);
			match(StartStateDefinition);
			setState(321);
			localIdentifier();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition))) != 0)) {
				{
				{
				setState(322);
				messageDefinition();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(EndDefinition);
			setState(329);
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
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				templatesDefinition();
				}
				break;
			case StartProcessorDefinition:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				processorDefinition();
				}
				break;
			case StartComposerDefinition:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				composerDefinition();
				}
				break;
			case StartOperatorDefinition:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
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
			setState(337);
			match(StartComposerDefinition);
			setState(338);
			localIdentifier();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(339);
				parameterDefinitions();
				}
			}

			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(342);
				localDataDeclaration();
				}
				break;
			}
			setState(345);
			composerBody();
			setState(346);
			match(EndDefinition);
			setState(347);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(StartTestDefinition);
			setState(350);
			stringLiteral();
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(351);
					useModule();
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(357);
				programModification();
				}
				break;
			}
			setState(360);
			testBody();
			setState(361);
			match(EndDefinition);
			setState(362);
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
			setState(364);
			match(StartOperatorDefinition);
			setState(365);
			match(LeftParen);
			setState(366);
			localIdentifier();
			setState(367);
			localIdentifier();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(368);
				parameterDefinitions();
				}
			}

			setState(371);
			localIdentifier();
			setState(372);
			match(RightParen);
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(373);
				localDataDeclaration();
				}
				break;
			}
			setState(376);
			templatesBody();
			setState(377);
			match(EndDefinition);
			setState(378);
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

	public static class DataDeclarationContext extends ParserRuleContext {
		public TerminalNode DataDefinition() { return getToken(TailspinParser.DataDefinition, 0); }
		public List<DataDefinitionContext> dataDefinition() {
			return getRuleContexts(DataDefinitionContext.class);
		}
		public DataDefinitionContext dataDefinition(int i) {
			return getRuleContext(DataDefinitionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public DataDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDataDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDeclarationContext dataDeclaration() throws RecognitionException {
		DataDeclarationContext _localctx = new DataDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dataDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(DataDefinition);
			setState(381);
			dataDefinition();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(382);
				match(Comma);
				setState(383);
				dataDefinition();
				}
				}
				setState(388);
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

	public static class DataDefinitionContext extends ParserRuleContext {
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
		enterRule(_localctx, 26, RULE_dataDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			localIdentifier();
			setState(390);
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
		public List<LocalDataDefinitionContext> localDataDefinition() {
			return getRuleContexts(LocalDataDefinitionContext.class);
		}
		public LocalDataDefinitionContext localDataDefinition(int i) {
			return getRuleContext(LocalDataDefinitionContext.class,i);
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
		enterRule(_localctx, 28, RULE_localDataDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(DataDefinition);
			setState(393);
			localDataDefinition();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(394);
				match(Comma);
				setState(395);
				localDataDefinition();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
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

	public static class LocalDataDefinitionContext extends ParserRuleContext {
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public LocalDataDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDataDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLocalDataDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDataDefinitionContext localDataDefinition() throws RecognitionException {
		LocalDataDefinitionContext _localctx = new LocalDataDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_localDataDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			localIdentifier();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StartMatcher) {
				{
				setState(404);
				matcher();
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
		enterRule(_localctx, 32, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			localIdentifier();
			setState(408);
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
		enterRule(_localctx, 34, RULE_parameterDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(And);
			setState(411);
			match(LeftBrace);
			setState(416); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(412);
				key();
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(413);
					match(Comma);
					}
				}

				}
				}
				setState(418); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			setState(420);
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
		public RangeLiteralContext rangeLiteral() {
			return getRuleContext(RangeLiteralContext.class,0);
		}
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
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
		enterRule(_localctx, 36, RULE_source);
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				rangeLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				sourceReference();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				arrayLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(426);
				relationLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(427);
				structureLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(428);
				bytesLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(429);
				match(LeftParen);
				setState(430);
				keyValue();
				setState(431);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(433);
				arithmeticValue();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(434);
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
		enterRule(_localctx, 38, RULE_sourceReference);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
			case Reflexive:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SourceMarker:
					{
					setState(437);
					match(SourceMarker);
					setState(439);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(438);
						anyIdentifier();
						}
						break;
					}
					}
					break;
				case Reflexive:
					{
					setState(441);
					match(Reflexive);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(444);
				reference();
				setState(446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(445);
					match(Message);
					}
					break;
				}
				setState(449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(448);
					parameterValues();
					}
					break;
				}
				}
				break;
			case DeleteMarker:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(DeleteMarker);
				setState(452);
				stateIdentifier();
				setState(453);
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
		enterRule(_localctx, 40, RULE_reference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(457);
				lens();
				}
				break;
			}
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(460);
					structureReference();
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 42, RULE_structureReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(FieldReference);
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(467);
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
		enterRule(_localctx, 44, RULE_lens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(LeftParen);
			setState(471);
			dimensionReference();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(472);
				match(SemiColon);
				setState(473);
				dimensionReference();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
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
		enterRule(_localctx, 46, RULE_dimensionReference);
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				simpleDimension();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				multiValueDimension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				projection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				key();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(485);
				localIdentifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(486);
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
		enterRule(_localctx, 48, RULE_simpleDimension);
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				sourceReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				arithmeticValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(491);
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
		enterRule(_localctx, 50, RULE_multiValueDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(LeftBracket);
			setState(495);
			simpleDimension();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(496);
				match(Comma);
				setState(497);
				simpleDimension();
				}
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(503);
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
		enterRule(_localctx, 52, RULE_projection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(LeftBrace);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(508);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(506);
					key();
					}
					break;
				case 2:
					{
					setState(507);
					keyValue();
					}
					break;
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(510);
					match(Comma);
					setState(513);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(511);
						key();
						}
						break;
					case 2:
						{
						setState(512);
						keyValue();
						}
						break;
					}
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
		enterRule(_localctx, 54, RULE_grouping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(Collect);
			setState(525);
			match(LeftBrace);
			setState(526);
			collectedValue();
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(527);
				match(Comma);
				setState(528);
				collectedValue();
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(534);
			match(RightBrace);
			setState(535);
			match(By);
			setState(536);
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
		enterRule(_localctx, 56, RULE_collectedValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			key();
			setState(539);
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
		public ArrayOffsetContext arrayOffset() {
			return getRuleContext(ArrayOffsetContext.class,0);
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
		enterRule(_localctx, 58, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(541);
				arrayOffset();
				}
			}

			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(544);
				match(LeftBracket);
				setState(545);
				match(RightBracket);
				}
				break;
			case 2:
				{
				setState(546);
				match(LeftBracket);
				setState(547);
				arrayExpansion();
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(548);
					match(Comma);
					setState(549);
					arrayExpansion();
					}
					}
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(555);
				match(RightBracket);
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

	public static class ArrayOffsetContext extends ParserRuleContext {
		public ArithmeticValueContext arithmeticValue() {
			return getRuleContext(ArithmeticValueContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public ArrayOffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOffset; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayOffsetContext arrayOffset() throws RecognitionException {
		ArrayOffsetContext _localctx = new ArrayOffsetContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrayOffset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			arithmeticValue();
			setState(560);
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
		enterRule(_localctx, 62, RULE_valueProduction);
		try {
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				sendToTemplates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
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
		enterRule(_localctx, 64, RULE_structureLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(LeftBrace);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(567);
				structureExpansion();
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(568);
					match(Comma);
					setState(569);
					structureExpansion();
					}
					}
					setState(574);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(577);
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
		enterRule(_localctx, 66, RULE_relationLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(LeftBrace);
			setState(580);
			match(Else);
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(581);
				structures();
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(582);
					match(Comma);
					setState(583);
					structures();
					}
					}
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(591);
			match(Else);
			setState(592);
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
		enterRule(_localctx, 68, RULE_bytesLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(StartBytes);
			setState(595);
			byteValue();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen || _la==Bytes) {
				{
				{
				setState(596);
				byteValue();
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(602);
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
		enterRule(_localctx, 70, RULE_byteValue);
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				match(Bytes);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				match(LeftParen);
				setState(606);
				valueProduction();
				setState(607);
				match(RightParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
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
		enterRule(_localctx, 72, RULE_structures);
		try {
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				structureLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
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
		enterRule(_localctx, 74, RULE_arrayExpansion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(616);
				match(By);
				}
				break;
			}
			setState(619);
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
		enterRule(_localctx, 76, RULE_structureExpansion);
		try {
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				keyValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(622);
					match(By);
					}
					break;
				}
				setState(625);
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
		enterRule(_localctx, 78, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			key();
			setState(629);
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
		enterRule(_localctx, 80, RULE_templates);
		int _la;
		try {
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new CallDefinedTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				templatesReference();
				}
				break;
			case 2:
				_localctx = new LiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				source();
				}
				break;
			case 3:
				_localctx = new LambdaTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
				match(Lambda);
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(634);
					localIdentifier();
					}
				}

				setState(637);
				match(LeftParen);
				setState(639);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(638);
					localDataDeclaration();
					}
					break;
				}
				setState(641);
				templatesBody();
				setState(642);
				match(Lambda);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(643);
					localIdentifier();
					}
				}

				setState(646);
				match(RightParen);
				}
				break;
			case 4:
				_localctx = new LambdaArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(648);
				match(Lambda);
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(649);
					localIdentifier();
					}
				}

				setState(652);
				arrayIndexDecomposition();
				setState(653);
				match(LeftParen);
				setState(655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(654);
					localDataDeclaration();
					}
					break;
				}
				setState(657);
				templatesBody();
				setState(658);
				match(Lambda);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(659);
					localIdentifier();
					}
				}

				setState(662);
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
		enterRule(_localctx, 82, RULE_arrayIndexDecomposition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(LeftBracket);
			setState(667);
			localIdentifier();
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(668);
				match(SemiColon);
				setState(669);
				localIdentifier();
				}
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(675);
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
		enterRule(_localctx, 84, RULE_sink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(ResultMarker);
			setState(687);
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
				setState(678);
				anyIdentifier();
				setState(679);
				reference();
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(680);
					match(Message);
					}
				}

				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(683);
					parameterValues();
					}
				}

				}
				}
				break;
			case Void:
				{
				setState(686);
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
		enterRule(_localctx, 86, RULE_templatesReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			anyIdentifier();
			setState(690);
			reference();
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Message) {
				{
				setState(691);
				match(Message);
				}
			}

			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(694);
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
		enterRule(_localctx, 88, RULE_parameterValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(And);
			setState(698);
			match(LeftBrace);
			setState(703); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(699);
				parameterValue();
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(700);
					match(Comma);
					}
				}

				}
				}
				setState(705); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			setState(707);
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
		enterRule(_localctx, 90, RULE_parameterValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			key();
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(710);
				valueChain();
				}
				break;
			case 2:
				{
				setState(711);
				templatesReference();
				}
				break;
			case 3:
				{
				setState(717);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(712);
					match(Colon);
					setState(713);
					lens();
					}
					break;
				case 2:
					{
					setState(714);
					match(Colon);
					setState(715);
					match(LeftParen);
					setState(716);
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
		enterRule(_localctx, 92, RULE_templatesBody);
		int _la;
		try {
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				block();
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << When) | (1L << Otherwise) | (1L << StartMatcher))) != 0)) {
					{
					{
					setState(722);
					matchTemplate();
					}
					}
					setState(727);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(729); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(728);
					matchTemplate();
					}
					}
					setState(731); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << When) | (1L << Otherwise) | (1L << StartMatcher))) != 0) );
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
		enterRule(_localctx, 94, RULE_matchTemplate);
		int _la;
		try {
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				matcher();
				setState(736);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==When) {
					{
					setState(738);
					match(When);
					}
				}

				setState(741);
				matcher();
				setState(743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(742);
					match(Do);
					}
					break;
				}
				setState(745);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(747);
				match(Otherwise);
				setState(748);
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
		enterRule(_localctx, 96, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
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
			case StartBytes:
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
			case Else:
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
			case STATE_IDENTIFIER:
			case IDENTIFIER:
				{
				setState(752); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(751);
						blockExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(754); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ResultMarker:
				{
				{
				setState(756);
				match(ResultMarker);
				setState(757);
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
		enterRule(_localctx, 98, RULE_blockExpression);
		try {
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
				stateAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(762);
				sendToTemplates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(763);
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
		enterRule(_localctx, 100, RULE_resultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			valueChain();
			setState(767);
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
		enterRule(_localctx, 102, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
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
		enterRule(_localctx, 104, RULE_sendToTemplates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			valueChain();
			setState(772);
			match(To);
			setState(773);
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
		enterRule(_localctx, 106, RULE_stateAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(775);
				valueChain();
				setState(776);
				match(To);
				}
				break;
			}
			setState(780);
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
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public PrependContext prepend() {
			return getRuleContext(PrependContext.class,0);
		}
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
		enterRule(_localctx, 108, RULE_stateSink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Range:
				{
				setState(782);
				append();
				}
				break;
			case Else:
				{
				setState(783);
				prepend();
				}
				break;
			case STATE_IDENTIFIER:
				break;
			default:
				break;
			}
			setState(786);
			stateIdentifier();
			setState(787);
			reference();
			setState(788);
			match(Colon);
			setState(789);
			valueProduction();
			setState(790);
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

	public static class AppendContext extends ParserRuleContext {
		public TerminalNode Range() { return getToken(TailspinParser.Range, 0); }
		public TerminalNode Else() { return getToken(TailspinParser.Else, 0); }
		public AppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitAppend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendContext append() throws RecognitionException {
		AppendContext _localctx = new AppendContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(Range);
			setState(793);
			match(Else);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrependContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(TailspinParser.Else, 0); }
		public TerminalNode Range() { return getToken(TailspinParser.Range, 0); }
		public PrependContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepend; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitPrepend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrependContext prepend() throws RecognitionException {
		PrependContext _localctx = new PrependContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_prepend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(Else);
			setState(796);
			match(Range);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 114, RULE_valueChain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			source();
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(799);
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
		enterRule(_localctx, 116, RULE_collectorChain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(To);
			setState(803);
			match(Range);
			setState(804);
			match(Equal);
			setState(805);
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
		enterRule(_localctx, 118, RULE_transform);
		try {
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				match(To);
				setState(808);
				templates();
				setState(810);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(809);
					transform();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				match(Deconstructor);
				setState(814);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(813);
					transform();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(816);
				collectorChain();
				setState(818);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(817);
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
		public List<MembraneContext> membrane() {
			return getRuleContexts(MembraneContext.class);
		}
		public MembraneContext membrane(int i) {
			return getRuleContext(MembraneContext.class,i);
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
		enterRule(_localctx, 120, RULE_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(StartMatcher);
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << Invert) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Quote) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << Equal) | (1L << BeginCondition) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (Scalar - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Invert) {
					{
					setState(823);
					match(Invert);
					}
				}

				setState(826);
				membrane();
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Else) {
					{
					{
					setState(827);
					match(Else);
					setState(828);
					membrane();
					}
					}
					setState(833);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(836);
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

	public static class MembraneContext extends ParserRuleContext {
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
		public MembraneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membrane; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMembrane(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembraneContext membrane() throws RecognitionException {
		MembraneContext _localctx = new MembraneContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_membrane);
		int _la;
		try {
			setState(853);
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
				setState(840);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Equal:
					{
					setState(838);
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
					setState(839);
					typeMatch();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BeginCondition) {
					{
					{
					setState(842);
					condition();
					}
					}
					setState(847);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BeginCondition:
				enterOuterAlt(_localctx, 2);
				{
				setState(849); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(848);
					condition();
					}
					}
					setState(851); 
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
	public static class StringTypeMatchContext extends TypeMatchContext {
		public TerminalNode START_STRING() { return getToken(TailspinParser.START_STRING, 0); }
		public TerminalNode END_STRING() { return getToken(TailspinParser.END_STRING, 0); }
		public StringTypeMatchContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStringTypeMatch(this);
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
		public ArrayOffsetContext arrayOffset() {
			return getRuleContext(ArrayOffsetContext.class,0);
		}
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
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
	public static class KeyValueMatchContext extends TypeMatchContext {
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public StructureContentMatcherContext structureContentMatcher() {
			return getRuleContext(StructureContentMatcherContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public KeyValueMatchContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitKeyValueMatch(this);
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
		enterRule(_localctx, 124, RULE_typeMatch);
		int _la;
		try {
			int _alt;
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				_localctx = new StringTypeMatchContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				match(START_STRING);
				setState(856);
				match(END_STRING);
				}
				break;
			case 2:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(857);
				rangeBounds();
				}
				break;
			case 3:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(858);
				stringLiteral();
				}
				break;
			case 4:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(859);
				match(LeftBrace);
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					{
					setState(860);
					key();
					setState(861);
					structureContentMatcher();
					setState(863);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
					case 1:
						{
						setState(862);
						match(Comma);
						}
						break;
					}
					}
					}
					setState(869);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Void || _la==Comma) {
					{
					setState(871);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(870);
						match(Comma);
						}
					}

					setState(873);
					match(Void);
					}
				}

				setState(876);
				match(RightBrace);
				}
				break;
			case 5:
				_localctx = new ArrayMatchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(877);
					arrayOffset();
					}
					break;
				case 2:
					{
					setState(878);
					tag();
					setState(879);
					match(Colon);
					}
					break;
				case 3:
					{
					setState(881);
					unit();
					setState(882);
					match(Colon);
					}
					break;
				}
				setState(886);
				match(LeftBracket);
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen || _la==StartMatcher) {
					{
					setState(887);
					arrayContentMatcher();
					}
				}

				setState(894);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(890);
						match(Comma);
						setState(891);
						arrayContentMatcher();
						}
						} 
					}
					setState(896);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Void || _la==Comma) {
					{
					setState(898);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(897);
						match(Comma);
						}
					}

					setState(900);
					match(Void);
					}
				}

				setState(903);
				match(RightBracket);
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(904);
					match(LeftParen);
					setState(907);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
					case 1:
						{
						setState(905);
						rangeBounds();
						}
						break;
					case 2:
						{
						setState(906);
						arithmeticValue();
						}
						break;
					}
					setState(909);
					match(RightParen);
					}
				}

				}
				break;
			case 6:
				_localctx = new StereotypeMatchContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(913);
					localIdentifier();
					}
					break;
				case 2:
					{
					setState(914);
					externalIdentifier();
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new UnitMatchContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(917);
				unit();
				}
				break;
			case 8:
				_localctx = new KeyValueMatchContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(918);
				match(LeftParen);
				setState(919);
				key();
				setState(920);
				structureContentMatcher();
				setState(921);
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
		enterRule(_localctx, 126, RULE_structureContentMatcher);
		try {
			setState(927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartMatcher:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				matcher();
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
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
		enterRule(_localctx, 128, RULE_arrayContentMatcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartMatcher:
				{
				setState(929);
				matcher();
				}
				break;
			case LeftParen:
				{
				setState(930);
				sequenceMatch();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Star) | (1L << Question) | (1L << Equal))) != 0)) {
				{
				setState(933);
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
		enterRule(_localctx, 130, RULE_sequenceMatch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(LeftParen);
			setState(937);
			matcher();
			setState(940); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(938);
				match(Colon);
				setState(939);
				matcher();
				}
				}
				setState(942); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Colon );
			setState(944);
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
		enterRule(_localctx, 132, RULE_literalMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(Equal);
			setState(947);
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
		enterRule(_localctx, 134, RULE_rangeBounds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(949);
				lowerBound();
				}
			}

			setState(952);
			match(Range);
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << Invert) | (1L << LeftParen) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(953);
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
		enterRule(_localctx, 136, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(BeginCondition);
			setState(957);
			valueChain();
			setState(958);
			matcher();
			setState(959);
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
		enterRule(_localctx, 138, RULE_lowerBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(961);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(962);
				arithmeticValue();
				}
				break;
			case 3:
				{
				setState(963);
				stringLiteral();
				}
				break;
			case 4:
				{
				setState(964);
				term();
				}
				break;
			}
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(967);
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
		enterRule(_localctx, 140, RULE_upperBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(970);
				match(Invert);
				}
			}

			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(973);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(974);
				arithmeticValue();
				}
				break;
			case 3:
				{
				setState(975);
				stringLiteral();
				}
				break;
			case 4:
				{
				setState(976);
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
		enterRule(_localctx, 142, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(979);
				lowerBound();
				}
			}

			setState(982);
			match(Range);
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(983);
				upperBound();
				}
				break;
			}
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(986);
				match(Colon);
				setState(987);
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
		enterRule(_localctx, 144, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
				{
				setState(990);
				match(Zero);
				}
				break;
			case Plus:
			case Minus:
			case PositiveInteger:
				{
				setState(991);
				nonZeroInteger();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(994);
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
		enterRule(_localctx, 146, RULE_unit);
		int _la;
		try {
			setState(1005);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Scalar:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				match(Scalar);
				}
				break;
			case Quote:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				match(Quote);
				setState(999);
				measureProduct();
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Slash) {
					{
					setState(1000);
					measureDenominator();
					}
				}

				setState(1003);
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
		enterRule(_localctx, 148, RULE_measureProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(1007);
				localIdentifier();
				}
				}
				setState(1012);
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
		enterRule(_localctx, 150, RULE_measureDenominator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			match(Slash);
			setState(1014);
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
		enterRule(_localctx, 152, RULE_nonZeroInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(1016);
				additiveOperator();
				}
			}

			setState(1019);
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

	public static class TagContext extends ParserRuleContext {
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public TerminalNode Tick() { return getToken(TailspinParser.Tick, 0); }
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			localIdentifier();
			setState(1022);
			match(Tick);
			}
		}
		catch (RecognitionException re) {
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
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
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
		enterRule(_localctx, 156, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(1024);
				tag();
				}
			}

			setState(1027);
			match(START_STRING);
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (StartCharacterCode - 84)) | (1L << (StartStringInterpolate - 84)) | (1L << (STRING_TEXT - 84)))) != 0)) {
				{
				{
				setState(1028);
				stringContent();
				}
				}
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1034);
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
		enterRule(_localctx, 158, RULE_stringContent);
		try {
			setState(1038);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartCharacterCode:
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
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
		enterRule(_localctx, 160, RULE_stringInterpolate);
		try {
			setState(1042);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(1040);
				interpolateEvaluate();
				}
				break;
			case StartCharacterCode:
				enterOuterAlt(_localctx, 2);
				{
				setState(1041);
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
		enterRule(_localctx, 162, RULE_characterCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			match(StartCharacterCode);
			setState(1045);
			arithmeticValue();
			setState(1046);
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
		enterRule(_localctx, 164, RULE_interpolateEvaluate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(StartStringInterpolate);
			setState(1061);
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
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (STATE_IDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1049);
					anyIdentifier();
					}
				}

				setState(1052);
				reference();
				setState(1054);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(1053);
					match(Message);
					}
				}

				setState(1057);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(1056);
					parameterValues();
					}
				}

				}
				break;
			case Colon:
				{
				setState(1059);
				match(Colon);
				setState(1060);
				source();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1063);
				transform();
				}
				break;
			}
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==To) {
				{
				setState(1066);
				match(To);
				setState(1067);
				match(TemplateMatch);
				}
			}

			setState(1070);
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
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
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
		enterRule(_localctx, 166, RULE_arithmeticValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1072);
				tag();
				}
				break;
			}
			setState(1075);
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
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1078);
				integerLiteral();
				}
				break;
			case 2:
				{
				setState(1079);
				match(LeftParen);
				setState(1080);
				arithmeticExpression(0);
				setState(1081);
				match(RightParen);
				setState(1083);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1082);
					unit();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1085);
				term();
				setState(1086);
				unit();
				}
				break;
			case 4:
				{
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Plus || _la==Minus) {
					{
					setState(1088);
					additiveOperator();
					}
				}

				setState(1091);
				sourceReference();
				}
				break;
			case 5:
				{
				setState(1092);
				arithmeticContextKeyword();
				}
				break;
			case 6:
				{
				setState(1093);
				termArithmeticOperation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(1096);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1097);
						multiplicativeOperator();
						setState(1098);
						arithmeticExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(1100);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1101);
						additiveOperator();
						setState(1102);
						arithmeticExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(1104);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1105);
						multiplicativeOperator();
						setState(1106);
						term();
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(1108);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1109);
						additiveOperator();
						setState(1110);
						term();
						}
						break;
					}
					} 
				}
				setState(1116);
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
		enterRule(_localctx, 170, RULE_termArithmeticOperation);
		try {
			setState(1129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1117);
				term();
				setState(1118);
				multiplicativeOperator();
				setState(1121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1119);
					term();
					}
					break;
				case 2:
					{
					setState(1120);
					arithmeticExpression(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				term();
				setState(1124);
				additiveOperator();
				setState(1127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1125);
					term();
					}
					break;
				case 2:
					{
					setState(1126);
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
		enterRule(_localctx, 172, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
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
		enterRule(_localctx, 174, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
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
		enterRule(_localctx, 176, RULE_term);
		try {
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1135);
				match(LeftParen);
				setState(1136);
				valueProduction();
				setState(1137);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1139);
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
		enterRule(_localctx, 178, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			match(LeftParen);
			setState(1143);
			operand();
			setState(1144);
			templatesReference();
			setState(1145);
			operand();
			setState(1146);
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
		enterRule(_localctx, 180, RULE_operand);
		try {
			setState(1150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1148);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1149);
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
		enterRule(_localctx, 182, RULE_composerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1152);
				stateAssignment();
				}
				break;
			}
			setState(1155);
			compositionSequence();
			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Rule) {
				{
				{
				setState(1156);
				definedCompositionSequence();
				}
				}
				setState(1161);
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
		enterRule(_localctx, 184, RULE_definedCompositionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			match(Rule);
			setState(1163);
			key();
			setState(1164);
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
		enterRule(_localctx, 186, RULE_compositionSequence);
		int _la;
		try {
			setState(1172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1166);
				compositionComponents();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1167);
					compositionSkipRule();
					}
					}
					setState(1170); 
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
		enterRule(_localctx, 188, RULE_compositionComponents);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1174);
					compositionSkipRule();
					}
					} 
				}
				setState(1179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			setState(1180);
			compositionComponent();
			setState(1185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1181);
					match(Comma);
					}
				}

				setState(1184);
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
		enterRule(_localctx, 190, RULE_compositionComponent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			compositionMatcher();
			setState(1189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1188);
				transform();
				}
				break;
			}
			setState(1194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1191);
					compositionSkipRule();
					}
					} 
				}
				setState(1196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
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
		public ArrayOffsetContext arrayOffset() {
			return getRuleContext(ArrayOffsetContext.class,0);
		}
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
		enterRule(_localctx, 192, RULE_compositionMatcher);
		int _la;
		try {
			setState(1215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1197);
				tokenMatcher();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1198);
					arrayOffset();
					}
				}

				setState(1201);
				match(LeftBracket);
				setState(1204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1202);
					compositionSequence();
					}
					break;
				case 2:
					{
					setState(1203);
					compositionSkipRule();
					}
					break;
				}
				setState(1206);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1207);
				match(LeftBrace);
				setState(1210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1208);
					structureMemberMatchers();
					}
					break;
				case 2:
					{
					setState(1209);
					compositionSkipRule();
					}
					break;
				}
				setState(1212);
				match(RightBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1213);
				source();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1214);
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
		enterRule(_localctx, 194, RULE_structureMemberMatchers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(1217);
				compositionSkipRule();
				}
				}
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1223);
			structureMemberMatcher();
			setState(1228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << Comma) | (1L << LeftParen) | (1L << StartMatcher) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1224);
					match(Comma);
					}
				}

				setState(1227);
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
		enterRule(_localctx, 196, RULE_structureMemberMatcher);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1230);
				tokenMatcher();
				}
				break;
			case 2:
				{
				setState(1231);
				compositionKeyValue();
				}
				break;
			}
			setState(1237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1234);
					compositionSkipRule();
					}
					} 
				}
				setState(1239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
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
		enterRule(_localctx, 198, RULE_tokenMatcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			match(StartMatcher);
			setState(1242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(1241);
				match(Invert);
				}
			}

			setState(1244);
			compositionToken();
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(1245);
				match(Else);
				setState(1246);
				compositionToken();
				}
				}
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1252);
			match(EndMatcher);
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1253);
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
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
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
		enterRule(_localctx, 200, RULE_compositionToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1256);
				tag();
				}
				break;
			}
			setState(1262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1259);
				literalComposition();
				}
				break;
			case 2:
				{
				setState(1260);
				localIdentifier();
				}
				break;
			case 3:
				{
				setState(1261);
				stringLiteral();
				}
				break;
			}
			setState(1265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Quote || _la==Scalar) {
				{
				setState(1264);
				unit();
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
		enterRule(_localctx, 202, RULE_literalComposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			match(Equal);
			setState(1270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
			case DeleteMarker:
			case Reflexive:
				{
				setState(1268);
				sourceReference();
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
			case START_STRING:
			case IDENTIFIER:
				{
				setState(1269);
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
		enterRule(_localctx, 204, RULE_multiplier);
		try {
			setState(1280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				match(Plus);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				setState(1273);
				match(Star);
				}
				break;
			case Question:
				enterOuterAlt(_localctx, 3);
				{
				setState(1274);
				match(Question);
				}
				break;
			case Equal:
				enterOuterAlt(_localctx, 4);
				{
				setState(1275);
				match(Equal);
				setState(1278);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PositiveInteger:
					{
					setState(1276);
					match(PositiveInteger);
					}
					break;
				case SourceMarker:
				case DeleteMarker:
				case Reflexive:
					{
					setState(1277);
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
		enterRule(_localctx, 206, RULE_compositionSkipRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			match(LeftParen);
			setState(1284); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1283);
				compositionCapture();
				}
				}
				setState(1286); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << DataDefinition) | (1L << LocalDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartMatcher) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << StartStateDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << Else) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Modified - 64)) | (1L << (Shadowed - 64)) | (1L << (From - 64)) | (1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (By - 64)) | (1L << (Collect - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (STATE_IDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			setState(1288);
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
		enterRule(_localctx, 208, RULE_compositionCapture);
		int _la;
		try {
			setState(1307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1290);
				match(Def);
				setState(1291);
				key();
				setState(1292);
				compositionMatcher();
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To || _la==Deconstructor) {
					{
					setState(1293);
					transform();
					}
				}

				setState(1296);
				match(SemiColon);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1298);
				compositionMatcher();
				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To || _la==Deconstructor) {
					{
					setState(1300);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1:
						{
						setState(1299);
						transform();
						}
						break;
					}
					setState(1302);
					match(To);
					setState(1303);
					stateSink();
					}
				}

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1306);
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
		enterRule(_localctx, 210, RULE_compositionKeyValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
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
				setState(1309);
				key();
				}
				break;
			case StartMatcher:
				{
				setState(1310);
				compositionKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1313);
					compositionSkipRule();
					}
					} 
				}
				setState(1318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			}
			setState(1319);
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
		enterRule(_localctx, 212, RULE_compositionKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			tokenMatcher();
			setState(1322);
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
		enterRule(_localctx, 214, RULE_localIdentifier);
		try {
			setState(1326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1324);
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
				setState(1325);
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
		enterRule(_localctx, 216, RULE_stateIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
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
		enterRule(_localctx, 218, RULE_externalIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			localIdentifier();
			setState(1333); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1331);
					match(Slash);
					setState(1332);
					localIdentifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1335); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
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
		enterRule(_localctx, 220, RULE_anyIdentifier);
		try {
			setState(1340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1337);
				stateIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1338);
				localIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1339);
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
		enterRule(_localctx, 222, RULE_arithmeticContextKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
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
		enterRule(_localctx, 224, RULE_keyword);
		try {
			setState(1374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
				enterOuterAlt(_localctx, 1);
				{
				setState(1344);
				match(Include);
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 2);
				{
				setState(1345);
				match(Def);
				}
				break;
			case StartTemplatesDefinition:
				enterOuterAlt(_localctx, 3);
				{
				setState(1346);
				match(StartTemplatesDefinition);
				}
				break;
			case StartSourceDefinition:
				enterOuterAlt(_localctx, 4);
				{
				setState(1347);
				match(StartSourceDefinition);
				}
				break;
			case StartSinkDefinition:
				enterOuterAlt(_localctx, 5);
				{
				setState(1348);
				match(StartSinkDefinition);
				}
				break;
			case StartComposerDefinition:
				enterOuterAlt(_localctx, 6);
				{
				setState(1349);
				match(StartComposerDefinition);
				}
				break;
			case StartProcessorDefinition:
				enterOuterAlt(_localctx, 7);
				{
				setState(1350);
				match(StartProcessorDefinition);
				}
				break;
			case StartOperatorDefinition:
				enterOuterAlt(_localctx, 8);
				{
				setState(1351);
				match(StartOperatorDefinition);
				}
				break;
			case StartStateDefinition:
				enterOuterAlt(_localctx, 9);
				{
				setState(1352);
				match(StartStateDefinition);
				}
				break;
			case EndDefinition:
				enterOuterAlt(_localctx, 10);
				{
				setState(1353);
				match(EndDefinition);
				}
				break;
			case DataDefinition:
				enterOuterAlt(_localctx, 11);
				{
				setState(1354);
				match(DataDefinition);
				}
				break;
			case LocalDefinition:
				enterOuterAlt(_localctx, 12);
				{
				setState(1355);
				match(LocalDefinition);
				}
				break;
			case Mod:
				enterOuterAlt(_localctx, 13);
				{
				setState(1356);
				match(Mod);
				}
				break;
			case Rule:
				enterOuterAlt(_localctx, 14);
				{
				setState(1357);
				match(Rule);
				}
				break;
			case When:
				enterOuterAlt(_localctx, 15);
				{
				setState(1358);
				match(When);
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 16);
				{
				setState(1359);
				match(Do);
				}
				break;
			case Otherwise:
				enterOuterAlt(_localctx, 17);
				{
				setState(1360);
				match(Otherwise);
				}
				break;
			case First:
			case Last:
				enterOuterAlt(_localctx, 18);
				{
				setState(1361);
				arithmeticContextKeyword();
				}
				break;
			case StartTestDefinition:
				enterOuterAlt(_localctx, 19);
				{
				setState(1362);
				match(StartTestDefinition);
				}
				break;
			case Assert:
				enterOuterAlt(_localctx, 20);
				{
				setState(1363);
				match(Assert);
				}
				break;
			case With:
				enterOuterAlt(_localctx, 21);
				{
				setState(1364);
				match(With);
				}
				break;
			case Provided:
				enterOuterAlt(_localctx, 22);
				{
				setState(1365);
				match(Provided);
				}
				break;
			case Modified:
				enterOuterAlt(_localctx, 23);
				{
				setState(1366);
				match(Modified);
				}
				break;
			case Shadowed:
				enterOuterAlt(_localctx, 24);
				{
				setState(1367);
				match(Shadowed);
				}
				break;
			case From:
				enterOuterAlt(_localctx, 25);
				{
				setState(1368);
				match(From);
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 26);
				{
				setState(1369);
				match(Use);
				}
				break;
			case Program:
				enterOuterAlt(_localctx, 27);
				{
				setState(1370);
				match(Program);
				}
				break;
			case Modify:
				enterOuterAlt(_localctx, 28);
				{
				setState(1371);
				match(Modify);
				}
				break;
			case By:
				enterOuterAlt(_localctx, 29);
				{
				setState(1372);
				match(By);
				}
				break;
			case Collect:
				enterOuterAlt(_localctx, 30);
				{
				setState(1373);
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
		enterRule(_localctx, 226, RULE_testBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1377); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1376);
					testBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1379); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
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
		enterRule(_localctx, 228, RULE_testBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1381);
					statement();
					}
					} 
				}
				setState(1386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			setState(1388); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1387);
					assertion();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1390); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
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
		enterRule(_localctx, 230, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			match(Assert);
			setState(1393);
			valueChain();
			setState(1394);
			matcher();
			setState(1395);
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
		enterRule(_localctx, 232, RULE_dependencyProvision);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			match(With);
			setState(1399); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1398);
					moduleConfiguration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1401); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1403);
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
		enterRule(_localctx, 234, RULE_moduleConfiguration);
		try {
			int _alt;
			setState(1457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				_localctx = new ModuleShadowingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1405);
					moduleIdentifier();
					setState(1406);
					match(From);
					}
					break;
				}
				setState(1410);
				match(Shadowed);
				setState(1411);
				moduleIdentifier();
				setState(1413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1412);
					dependencyProvision();
					}
					break;
				}
				setState(1416); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1415);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1418); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1420);
				match(EndDefinition);
				setState(1421);
				moduleIdentifier();
				}
				break;
			case 2:
				_localctx = new InheritModuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1423);
				moduleIdentifier();
				setState(1424);
				match(Inherited);
				setState(1427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1425);
					match(From);
					setState(1426);
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
				setState(1432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1429);
					moduleIdentifier();
					setState(1430);
					match(From);
					}
					break;
				}
				setState(1434);
				match(Modified);
				setState(1435);
				stringLiteral();
				setState(1437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1436);
					dependencyProvision();
					}
					break;
				}
				setState(1440); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1439);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1442); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1444);
				match(EndDefinition);
				setState(1445);
				stringLiteral();
				}
				break;
			case 4:
				_localctx = new ModuleImportContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1447);
					moduleIdentifier();
					setState(1448);
					match(From);
					}
					break;
				}
				setState(1452);
				stringLiteral();
				setState(1455);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case StandAlone:
					{
					setState(1453);
					match(StandAlone);
					}
					break;
				case With:
					{
					setState(1454);
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
		enterRule(_localctx, 236, RULE_moduleIdentifier);
		try {
			setState(1461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CoreSystem:
				enterOuterAlt(_localctx, 1);
				{
				setState(1459);
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
				setState(1460);
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
		enterRule(_localctx, 238, RULE_useModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			match(Use);
			setState(1464);
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
		enterRule(_localctx, 240, RULE_programModification);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			match(Modify);
			setState(1467);
			match(Program);
			setState(1469); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1468);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1471); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1473);
			match(EndDefinition);
			setState(1474);
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
		case 84:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\\\u05c7\4\2\t\2\4"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\3\2\7\2\u00f6\n\2\f\2\16\2\u00f9\13\2\3\2\7\2\u00fc"+
		"\n\2\f\2\16\2\u00ff\13\2\3\2\3\2\7\2\u0103\n\2\f\2\16\2\u0106\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\5\3\u010e\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u011a\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7"+
		"\u0128\n\7\3\7\5\7\u012b\n\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u0134\n\b"+
		"\3\b\5\b\u0137\n\b\3\b\3\b\7\b\u013b\n\b\f\b\16\b\u013e\13\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\7\t\u0146\n\t\f\t\16\t\u0149\13\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\5\n\u0152\n\n\3\13\3\13\3\13\5\13\u0157\n\13\3\13\5\13\u015a\n"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u0163\n\f\f\f\16\f\u0166\13\f"+
		"\3\f\5\f\u0169\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u0174\n\r\3"+
		"\r\3\r\3\r\5\r\u0179\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0183"+
		"\n\16\f\16\16\16\u0186\13\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u018f"+
		"\n\20\f\20\16\20\u0192\13\20\3\20\3\20\3\21\3\21\5\21\u0198\n\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u01a1\n\23\6\23\u01a3\n\23\r\23\16"+
		"\23\u01a4\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u01b6\n\24\3\25\3\25\5\25\u01ba\n\25\3\25\5\25\u01bd"+
		"\n\25\3\25\3\25\5\25\u01c1\n\25\3\25\5\25\u01c4\n\25\3\25\3\25\3\25\3"+
		"\25\5\25\u01ca\n\25\3\26\5\26\u01cd\n\26\3\26\7\26\u01d0\n\26\f\26\16"+
		"\26\u01d3\13\26\3\27\3\27\5\27\u01d7\n\27\3\30\3\30\3\30\3\30\7\30\u01dd"+
		"\n\30\f\30\16\30\u01e0\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5"+
		"\31\u01ea\n\31\3\32\3\32\3\32\5\32\u01ef\n\32\3\33\3\33\3\33\3\33\7\33"+
		"\u01f5\n\33\f\33\16\33\u01f8\13\33\3\33\3\33\3\34\3\34\3\34\5\34\u01ff"+
		"\n\34\3\34\3\34\3\34\5\34\u0204\n\34\7\34\u0206\n\34\f\34\16\34\u0209"+
		"\13\34\5\34\u020b\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\7\35\u0214\n"+
		"\35\f\35\16\35\u0217\13\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\5\37"+
		"\u0221\n\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0229\n\37\f\37\16\37\u022c"+
		"\13\37\3\37\3\37\5\37\u0230\n\37\3 \3 \3 \3!\3!\5!\u0237\n!\3\"\3\"\3"+
		"\"\3\"\7\"\u023d\n\"\f\"\16\"\u0240\13\"\5\"\u0242\n\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\7#\u024b\n#\f#\16#\u024e\13#\5#\u0250\n#\3#\3#\3#\3$\3$\3$\7$"+
		"\u0258\n$\f$\16$\u025b\13$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u0265\n%\3&\3&\5"+
		"&\u0269\n&\3\'\5\'\u026c\n\'\3\'\3\'\3(\3(\5(\u0272\n(\3(\5(\u0275\n("+
		"\3)\3)\3)\3*\3*\3*\3*\5*\u027e\n*\3*\3*\5*\u0282\n*\3*\3*\3*\5*\u0287"+
		"\n*\3*\3*\3*\3*\5*\u028d\n*\3*\3*\3*\5*\u0292\n*\3*\3*\3*\5*\u0297\n*"+
		"\3*\3*\5*\u029b\n*\3+\3+\3+\3+\7+\u02a1\n+\f+\16+\u02a4\13+\3+\3+\3,\3"+
		",\3,\3,\5,\u02ac\n,\3,\5,\u02af\n,\3,\5,\u02b2\n,\3-\3-\3-\5-\u02b7\n"+
		"-\3-\5-\u02ba\n-\3.\3.\3.\3.\5.\u02c0\n.\6.\u02c2\n.\r.\16.\u02c3\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02d0\n/\5/\u02d2\n/\3\60\3\60\7\60\u02d6"+
		"\n\60\f\60\16\60\u02d9\13\60\3\60\6\60\u02dc\n\60\r\60\16\60\u02dd\5\60"+
		"\u02e0\n\60\3\61\3\61\3\61\3\61\5\61\u02e6\n\61\3\61\3\61\5\61\u02ea\n"+
		"\61\3\61\3\61\3\61\3\61\5\61\u02f0\n\61\3\62\6\62\u02f3\n\62\r\62\16\62"+
		"\u02f4\3\62\3\62\5\62\u02f9\n\62\3\63\3\63\3\63\3\63\5\63\u02ff\n\63\3"+
		"\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\5\67\u030d"+
		"\n\67\3\67\3\67\38\38\58\u0313\n8\38\38\38\38\38\38\39\39\39\3:\3:\3:"+
		"\3;\3;\5;\u0323\n;\3<\3<\3<\3<\3<\3=\3=\3=\5=\u032d\n=\3=\3=\5=\u0331"+
		"\n=\3=\3=\5=\u0335\n=\5=\u0337\n=\3>\3>\5>\u033b\n>\3>\3>\3>\7>\u0340"+
		"\n>\f>\16>\u0343\13>\5>\u0345\n>\3>\3>\3?\3?\5?\u034b\n?\3?\7?\u034e\n"+
		"?\f?\16?\u0351\13?\3?\6?\u0354\n?\r?\16?\u0355\5?\u0358\n?\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\5@\u0362\n@\7@\u0364\n@\f@\16@\u0367\13@\3@\5@\u036a\n@"+
		"\3@\5@\u036d\n@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0377\n@\3@\3@\5@\u037b\n@"+
		"\3@\3@\7@\u037f\n@\f@\16@\u0382\13@\3@\5@\u0385\n@\3@\5@\u0388\n@\3@\3"+
		"@\3@\3@\5@\u038e\n@\3@\3@\5@\u0392\n@\3@\3@\5@\u0396\n@\3@\3@\3@\3@\3"+
		"@\3@\5@\u039e\n@\3A\3A\5A\u03a2\nA\3B\3B\5B\u03a6\nB\3B\5B\u03a9\nB\3"+
		"C\3C\3C\3C\6C\u03af\nC\rC\16C\u03b0\3C\3C\3D\3D\3D\3E\5E\u03b9\nE\3E\3"+
		"E\5E\u03bd\nE\3F\3F\3F\3F\3F\3G\3G\3G\3G\5G\u03c8\nG\3G\5G\u03cb\nG\3"+
		"H\5H\u03ce\nH\3H\3H\3H\3H\5H\u03d4\nH\3I\5I\u03d7\nI\3I\3I\5I\u03db\n"+
		"I\3I\3I\5I\u03df\nI\3J\3J\5J\u03e3\nJ\3J\5J\u03e6\nJ\3K\3K\3K\3K\5K\u03ec"+
		"\nK\3K\3K\5K\u03f0\nK\3L\7L\u03f3\nL\fL\16L\u03f6\13L\3M\3M\3M\3N\5N\u03fc"+
		"\nN\3N\3N\3O\3O\3O\3P\5P\u0404\nP\3P\3P\7P\u0408\nP\fP\16P\u040b\13P\3"+
		"P\3P\3Q\3Q\5Q\u0411\nQ\3R\3R\5R\u0415\nR\3S\3S\3S\3S\3T\3T\5T\u041d\n"+
		"T\3T\3T\5T\u0421\nT\3T\5T\u0424\nT\3T\3T\5T\u0428\nT\3T\5T\u042b\nT\3"+
		"T\3T\5T\u042f\nT\3T\3T\3U\5U\u0434\nU\3U\3U\3V\3V\3V\3V\3V\3V\5V\u043e"+
		"\nV\3V\3V\3V\3V\5V\u0444\nV\3V\3V\3V\5V\u0449\nV\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\7V\u045b\nV\fV\16V\u045e\13V\3W\3W\3W\3W\5"+
		"W\u0464\nW\3W\3W\3W\3W\5W\u046a\nW\5W\u046c\nW\3X\3X\3Y\3Y\3Z\3Z\3Z\3"+
		"Z\3Z\5Z\u0477\nZ\3[\3[\3[\3[\3[\3[\3\\\3\\\5\\\u0481\n\\\3]\5]\u0484\n"+
		"]\3]\3]\7]\u0488\n]\f]\16]\u048b\13]\3^\3^\3^\3^\3_\3_\6_\u0493\n_\r_"+
		"\16_\u0494\5_\u0497\n_\3`\7`\u049a\n`\f`\16`\u049d\13`\3`\3`\5`\u04a1"+
		"\n`\3`\5`\u04a4\n`\3a\3a\5a\u04a8\na\3a\7a\u04ab\na\fa\16a\u04ae\13a\3"+
		"b\3b\5b\u04b2\nb\3b\3b\3b\5b\u04b7\nb\3b\3b\3b\3b\5b\u04bd\nb\3b\3b\3"+
		"b\5b\u04c2\nb\3c\7c\u04c5\nc\fc\16c\u04c8\13c\3c\3c\5c\u04cc\nc\3c\5c"+
		"\u04cf\nc\3d\3d\5d\u04d3\nd\3d\7d\u04d6\nd\fd\16d\u04d9\13d\3e\3e\5e\u04dd"+
		"\ne\3e\3e\3e\7e\u04e2\ne\fe\16e\u04e5\13e\3e\3e\5e\u04e9\ne\3f\5f\u04ec"+
		"\nf\3f\3f\3f\5f\u04f1\nf\3f\5f\u04f4\nf\3g\3g\3g\5g\u04f9\ng\3h\3h\3h"+
		"\3h\3h\3h\5h\u0501\nh\5h\u0503\nh\3i\3i\6i\u0507\ni\ri\16i\u0508\3i\3"+
		"i\3j\3j\3j\3j\5j\u0511\nj\3j\3j\3j\3j\5j\u0517\nj\3j\3j\5j\u051b\nj\3"+
		"j\5j\u051e\nj\3k\3k\5k\u0522\nk\3k\7k\u0525\nk\fk\16k\u0528\13k\3k\3k"+
		"\3l\3l\3l\3m\3m\5m\u0531\nm\3n\3n\3o\3o\3o\6o\u0538\no\ro\16o\u0539\3"+
		"p\3p\3p\5p\u053f\np\3q\3q\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3"+
		"r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r\u0561\nr\3s\6s\u0564"+
		"\ns\rs\16s\u0565\3t\7t\u0569\nt\ft\16t\u056c\13t\3t\6t\u056f\nt\rt\16"+
		"t\u0570\3u\3u\3u\3u\3u\3v\3v\6v\u057a\nv\rv\16v\u057b\3v\3v\3w\3w\3w\5"+
		"w\u0583\nw\3w\3w\3w\5w\u0588\nw\3w\6w\u058b\nw\rw\16w\u058c\3w\3w\3w\3"+
		"w\3w\3w\3w\5w\u0596\nw\3w\3w\3w\5w\u059b\nw\3w\3w\3w\5w\u05a0\nw\3w\6"+
		"w\u05a3\nw\rw\16w\u05a4\3w\3w\3w\3w\3w\3w\5w\u05ad\nw\3w\3w\3w\5w\u05b2"+
		"\nw\5w\u05b4\nw\3x\3x\5x\u05b8\nx\3y\3y\3y\3z\3z\3z\6z\u05c0\nz\rz\16"+
		"z\u05c1\3z\3z\3z\3z\2\3\u00aa{\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\2\6\3\2&(\3\2\63\64\3"+
		"\2\65\67\3\2/\60\2\u066f\2\u00f7\3\2\2\2\4\u0109\3\2\2\2\6\u0119\3\2\2"+
		"\2\b\u011b\3\2\2\2\n\u0120\3\2\2\2\f\u0124\3\2\2\2\16\u0130\3\2\2\2\20"+
		"\u0142\3\2\2\2\22\u0151\3\2\2\2\24\u0153\3\2\2\2\26\u015f\3\2\2\2\30\u016e"+
		"\3\2\2\2\32\u017e\3\2\2\2\34\u0187\3\2\2\2\36\u018a\3\2\2\2 \u0195\3\2"+
		"\2\2\"\u0199\3\2\2\2$\u019c\3\2\2\2&\u01b5\3\2\2\2(\u01c9\3\2\2\2*\u01cc"+
		"\3\2\2\2,\u01d4\3\2\2\2.\u01d8\3\2\2\2\60\u01e9\3\2\2\2\62\u01ee\3\2\2"+
		"\2\64\u01f0\3\2\2\2\66\u01fb\3\2\2\28\u020e\3\2\2\2:\u021c\3\2\2\2<\u0220"+
		"\3\2\2\2>\u0231\3\2\2\2@\u0236\3\2\2\2B\u0238\3\2\2\2D\u0245\3\2\2\2F"+
		"\u0254\3\2\2\2H\u0264\3\2\2\2J\u0268\3\2\2\2L\u026b\3\2\2\2N\u0274\3\2"+
		"\2\2P\u0276\3\2\2\2R\u029a\3\2\2\2T\u029c\3\2\2\2V\u02a7\3\2\2\2X\u02b3"+
		"\3\2\2\2Z\u02bb\3\2\2\2\\\u02c7\3\2\2\2^\u02df\3\2\2\2`\u02ef\3\2\2\2"+
		"b\u02f8\3\2\2\2d\u02fe\3\2\2\2f\u0300\3\2\2\2h\u0303\3\2\2\2j\u0305\3"+
		"\2\2\2l\u030c\3\2\2\2n\u0312\3\2\2\2p\u031a\3\2\2\2r\u031d\3\2\2\2t\u0320"+
		"\3\2\2\2v\u0324\3\2\2\2x\u0336\3\2\2\2z\u0338\3\2\2\2|\u0357\3\2\2\2~"+
		"\u039d\3\2\2\2\u0080\u03a1\3\2\2\2\u0082\u03a5\3\2\2\2\u0084\u03aa\3\2"+
		"\2\2\u0086\u03b4\3\2\2\2\u0088\u03b8\3\2\2\2\u008a\u03be\3\2\2\2\u008c"+
		"\u03c7\3\2\2\2\u008e\u03cd\3\2\2\2\u0090\u03d6\3\2\2\2\u0092\u03e2\3\2"+
		"\2\2\u0094\u03ef\3\2\2\2\u0096\u03f4\3\2\2\2\u0098\u03f7\3\2\2\2\u009a"+
		"\u03fb\3\2\2\2\u009c\u03ff\3\2\2\2\u009e\u0403\3\2\2\2\u00a0\u0410\3\2"+
		"\2\2\u00a2\u0414\3\2\2\2\u00a4\u0416\3\2\2\2\u00a6\u041a\3\2\2\2\u00a8"+
		"\u0433\3\2\2\2\u00aa\u0448\3\2\2\2\u00ac\u046b\3\2\2\2\u00ae\u046d\3\2"+
		"\2\2\u00b0\u046f\3\2\2\2\u00b2\u0476\3\2\2\2\u00b4\u0478\3\2\2\2\u00b6"+
		"\u0480\3\2\2\2\u00b8\u0483\3\2\2\2\u00ba\u048c\3\2\2\2\u00bc\u0496\3\2"+
		"\2\2\u00be\u049b\3\2\2\2\u00c0\u04a5\3\2\2\2\u00c2\u04c1\3\2\2\2\u00c4"+
		"\u04c6\3\2\2\2\u00c6\u04d2\3\2\2\2\u00c8\u04da\3\2\2\2\u00ca\u04eb\3\2"+
		"\2\2\u00cc\u04f5\3\2\2\2\u00ce\u0502\3\2\2\2\u00d0\u0504\3\2\2\2\u00d2"+
		"\u051d\3\2\2\2\u00d4\u0521\3\2\2\2\u00d6\u052b\3\2\2\2\u00d8\u0530\3\2"+
		"\2\2\u00da\u0532\3\2\2\2\u00dc\u0534\3\2\2\2\u00de\u053e\3\2\2\2\u00e0"+
		"\u0540\3\2\2\2\u00e2\u0560\3\2\2\2\u00e4\u0563\3\2\2\2\u00e6\u056a\3\2"+
		"\2\2\u00e8\u0572\3\2\2\2\u00ea\u0577\3\2\2\2\u00ec\u05b3\3\2\2\2\u00ee"+
		"\u05b7\3\2\2\2\u00f0\u05b9\3\2\2\2\u00f2\u05bc\3\2\2\2\u00f4\u00f6\5\u00f0"+
		"y\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fd\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\5\4"+
		"\3\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0104\5\6"+
		"\4\2\u0101\u0103\5\6\4\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0107\u0108\7\2\2\3\u0108\3\3\2\2\2\u0109\u010d\7\4\2\2\u010a\u010b"+
		"\5\u00d8m\2\u010b\u010c\7E\2\2\u010c\u010e\3\2\2\2\u010d\u010a\3\2\2\2"+
		"\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\5\u009eP\2\u0110"+
		"\5\3\2\2\2\u0111\u011a\5\b\5\2\u0112\u011a\5\n\6\2\u0113\u011a\5\f\7\2"+
		"\u0114\u011a\5\16\b\2\u0115\u011a\5\24\13\2\u0116\u011a\5\26\f\2\u0117"+
		"\u011a\5\30\r\2\u0118\u011a\5\32\16\2\u0119\u0111\3\2\2\2\u0119\u0112"+
		"\3\2\2\2\u0119\u0113\3\2\2\2\u0119\u0114\3\2\2\2\u0119\u0115\3\2\2\2\u0119"+
		"\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\7\3\2\2\2"+
		"\u011b\u011c\7\6\2\2\u011c\u011d\5\"\22\2\u011d\u011e\5@!\2\u011e\u011f"+
		"\7\27\2\2\u011f\t\3\2\2\2\u0120\u0121\5t;\2\u0121\u0122\7\f\2\2\u0122"+
		"\u0123\5V,\2\u0123\13\3\2\2\2\u0124\u0125\t\2\2\2\u0125\u0127\5\u00d8"+
		"m\2\u0126\u0128\5$\23\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012a\3\2\2\2\u0129\u012b\5\36\20\2\u012a\u0129\3\2\2\2\u012a\u012b\3"+
		"\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\5^\60\2\u012d\u012e\7-\2\2\u012e"+
		"\u012f\5\u00d8m\2\u012f\r\3\2\2\2\u0130\u0131\7*\2\2\u0131\u0133\5\u00d8"+
		"m\2\u0132\u0134\5$\23\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u0137\5\36\20\2\u0136\u0135\3\2\2\2\u0136\u0137\3"+
		"\2\2\2\u0137\u0138\3\2\2\2\u0138\u013c\5b\62\2\u0139\u013b\5\20\t\2\u013a"+
		"\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7-\2\2\u0140"+
		"\u0141\5\u00d8m\2\u0141\17\3\2\2\2\u0142\u0143\7,\2\2\u0143\u0147\5\u00d8"+
		"m\2\u0144\u0146\5\22\n\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u014a\u014b\7-\2\2\u014b\u014c\5\u00d8m\2\u014c\21\3\2\2\2\u014d"+
		"\u0152\5\f\7\2\u014e\u0152\5\16\b\2\u014f\u0152\5\24\13\2\u0150\u0152"+
		"\5\30\r\2\u0151\u014d\3\2\2\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2\2\2"+
		"\u0151\u0150\3\2\2\2\u0152\23\3\2\2\2\u0153\u0154\7)\2\2\u0154\u0156\5"+
		"\u00d8m\2\u0155\u0157\5$\23\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2"+
		"\u0157\u0159\3\2\2\2\u0158\u015a\5\36\20\2\u0159\u0158\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\5\u00b8]\2\u015c\u015d\7-\2\2"+
		"\u015d\u015e\5\u00d8m\2\u015e\25\3\2\2\2\u015f\u0160\7=\2\2\u0160\u0164"+
		"\5\u009eP\2\u0161\u0163\5\u00f0y\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0168\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0167\u0169\5\u00f2z\2\u0168\u0167\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\5\u00e4s\2\u016b\u016c\7-\2\2"+
		"\u016c\u016d\5\u009eP\2\u016d\27\3\2\2\2\u016e\u016f\7+\2\2\u016f\u0170"+
		"\7\33\2\2\u0170\u0171\5\u00d8m\2\u0171\u0173\5\u00d8m\2\u0172\u0174\5"+
		"$\23\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\5\u00d8m\2\u0176\u0178\7\34\2\2\u0177\u0179\5\36\20\2\u0178\u0177"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\5^\60\2\u017b"+
		"\u017c\7-\2\2\u017c\u017d\5\u00d8m\2\u017d\31\3\2\2\2\u017e\u017f\7\n"+
		"\2\2\u017f\u0184\5\34\17\2\u0180\u0181\7\30\2\2\u0181\u0183\5\34\17\2"+
		"\u0182\u0180\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\33\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\5\u00d8m\2\u0188"+
		"\u0189\5z>\2\u0189\35\3\2\2\2\u018a\u018b\7\n\2\2\u018b\u0190\5 \21\2"+
		"\u018c\u018d\7\30\2\2\u018d\u018f\5 \21\2\u018e\u018c\3\2\2\2\u018f\u0192"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0193\u0194\7\13\2\2\u0194\37\3\2\2\2\u0195\u0197\5\u00d8"+
		"m\2\u0196\u0198\5z>\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198!\3"+
		"\2\2\2\u0199\u019a\5\u00d8m\2\u019a\u019b\7\23\2\2\u019b#\3\2\2\2\u019c"+
		"\u019d\7\21\2\2\u019d\u01a2\7\37\2\2\u019e\u01a0\5\"\22\2\u019f\u01a1"+
		"\7\30\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2"+
		"\u01a2\u019e\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5"+
		"\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7 \2\2\u01a7%\3\2\2\2\u01a8\u01b6"+
		"\5\u0090I\2\u01a9\u01b6\5(\25\2\u01aa\u01b6\5\u009eP\2\u01ab\u01b6\5<"+
		"\37\2\u01ac\u01b6\5D#\2\u01ad\u01b6\5B\"\2\u01ae\u01b6\5F$\2\u01af\u01b0"+
		"\7\33\2\2\u01b0\u01b1\5P)\2\u01b1\u01b2\7\34\2\2\u01b2\u01b6\3\2\2\2\u01b3"+
		"\u01b6\5\u00a8U\2\u01b4\u01b6\5\u00b4[\2\u01b5\u01a8\3\2\2\2\u01b5\u01a9"+
		"\3\2\2\2\u01b5\u01aa\3\2\2\2\u01b5\u01ab\3\2\2\2\u01b5\u01ac\3\2\2\2\u01b5"+
		"\u01ad\3\2\2\2\u01b5\u01ae\3\2\2\2\u01b5\u01af\3\2\2\2\u01b5\u01b3\3\2"+
		"\2\2\u01b5\u01b4\3\2\2\2\u01b6\'\3\2\2\2\u01b7\u01b9\7\16\2\2\u01b8\u01ba"+
		"\5\u00dep\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bd\3\2\2"+
		"\2\u01bb\u01bd\7\20\2\2\u01bc\u01b7\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01c0\5*\26\2\u01bf\u01c1\7\24\2\2\u01c0\u01bf\3"+
		"\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c4\5Z.\2\u01c3"+
		"\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01ca\3\2\2\2\u01c5\u01c6\7\17"+
		"\2\2\u01c6\u01c7\5\u00dan\2\u01c7\u01c8\5*\26\2\u01c8\u01ca\3\2\2\2\u01c9"+
		"\u01bc\3\2\2\2\u01c9\u01c5\3\2\2\2\u01ca)\3\2\2\2\u01cb\u01cd\5.\30\2"+
		"\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d1\3\2\2\2\u01ce\u01d0"+
		"\5,\27\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2+\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d6\7\25\2\2"+
		"\u01d5\u01d7\5.\30\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7-\3"+
		"\2\2\2\u01d8\u01d9\7\33\2\2\u01d9\u01de\5\60\31\2\u01da\u01db\7\27\2\2"+
		"\u01db\u01dd\5\60\31\2\u01dc\u01da\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1"+
		"\u01e2\7\34\2\2\u01e2/\3\2\2\2\u01e3\u01ea\5\62\32\2\u01e4\u01ea\5\64"+
		"\33\2\u01e5\u01ea\5\66\34\2\u01e6\u01ea\5\"\22\2\u01e7\u01ea\5\u00d8m"+
		"\2\u01e8\u01ea\58\35\2\u01e9\u01e3\3\2\2\2\u01e9\u01e4\3\2\2\2\u01e9\u01e5"+
		"\3\2\2\2\u01e9\u01e6\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01e8\3\2\2\2\u01ea"+
		"\61\3\2\2\2\u01eb\u01ef\5(\25\2\u01ec\u01ef\5\u00a8U\2\u01ed\u01ef\5\u0090"+
		"I\2\u01ee\u01eb\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef"+
		"\63\3\2\2\2\u01f0\u01f1\7\35\2\2\u01f1\u01f6\5\62\32\2\u01f2\u01f3\7\30"+
		"\2\2\u01f3\u01f5\5\62\32\2\u01f4\u01f2\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6"+
		"\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f6\3\2"+
		"\2\2\u01f9\u01fa\7\36\2\2\u01fa\65\3\2\2\2\u01fb\u020a\7\37\2\2\u01fc"+
		"\u01ff\5\"\22\2\u01fd\u01ff\5P)\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2"+
		"\2\2\u01ff\u0207\3\2\2\2\u0200\u0203\7\30\2\2\u0201\u0204\5\"\22\2\u0202"+
		"\u0204\5P)\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204\u0206\3\2\2"+
		"\2\u0205\u0200\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208"+
		"\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u01fe\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\7 \2\2\u020d\67\3\2\2\2"+
		"\u020e\u020f\7K\2\2\u020f\u0210\7\37\2\2\u0210\u0215\5:\36\2\u0211\u0212"+
		"\7\30\2\2\u0212\u0214\5:\36\2\u0213\u0211\3\2\2\2\u0214\u0217\3\2\2\2"+
		"\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\3\2\2\2\u0217\u0215"+
		"\3\2\2\2\u0218\u0219\7 \2\2\u0219\u021a\7J\2\2\u021a\u021b\5&\24\2\u021b"+
		"9\3\2\2\2\u021c\u021d\5\"\22\2\u021d\u021e\5X-\2\u021e;\3\2\2\2\u021f"+
		"\u0221\5> \2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u022f\3\2\2"+
		"\2\u0222\u0223\7\35\2\2\u0223\u0230\7\36\2\2\u0224\u0225\7\35\2\2\u0225"+
		"\u022a\5L\'\2\u0226\u0227\7\30\2\2\u0227\u0229\5L\'\2\u0228\u0226\3\2"+
		"\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\7\36\2\2\u022e\u0230\3"+
		"\2\2\2\u022f\u0222\3\2\2\2\u022f\u0224\3\2\2\2\u0230=\3\2\2\2\u0231\u0232"+
		"\5\u00a8U\2\u0232\u0233\7\23\2\2\u0233?\3\2\2\2\u0234\u0237\5j\66\2\u0235"+
		"\u0237\5t;\2\u0236\u0234\3\2\2\2\u0236\u0235\3\2\2\2\u0237A\3\2\2\2\u0238"+
		"\u0241\7\37\2\2\u0239\u023e\5N(\2\u023a\u023b\7\30\2\2\u023b\u023d\5N"+
		"(\2\u023c\u023a\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0239\3\2"+
		"\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\7 \2\2\u0244"+
		"C\3\2\2\2\u0245\u0246\7\37\2\2\u0246\u024f\7:\2\2\u0247\u024c\5J&\2\u0248"+
		"\u0249\7\30\2\2\u0249\u024b\5J&\2\u024a\u0248\3\2\2\2\u024b\u024e\3\2"+
		"\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u0250\3\2\2\2\u024e"+
		"\u024c\3\2\2\2\u024f\u0247\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251\u0252\7:\2\2\u0252\u0253\7 \2\2\u0253E\3\2\2\2\u0254\u0255"+
		"\7!\2\2\u0255\u0259\5H%\2\u0256\u0258\5H%\2\u0257\u0256\3\2\2\2\u0258"+
		"\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2"+
		"\2\2\u025b\u0259\3\2\2\2\u025c\u025d\7\\\2\2\u025dG\3\2\2\2\u025e\u0265"+
		"\7Z\2\2\u025f\u0260\7\33\2\2\u0260\u0261\5@!\2\u0261\u0262\7\34\2\2\u0262"+
		"\u0265\3\2\2\2\u0263\u0265\5\u00b4[\2\u0264\u025e\3\2\2\2\u0264\u025f"+
		"\3\2\2\2\u0264\u0263\3\2\2\2\u0265I\3\2\2\2\u0266\u0269\5B\"\2\u0267\u0269"+
		"\5@!\2\u0268\u0266\3\2\2\2\u0268\u0267\3\2\2\2\u0269K\3\2\2\2\u026a\u026c"+
		"\7J\2\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u026e\5@!\2\u026eM\3\2\2\2\u026f\u0275\5P)\2\u0270\u0272\7J\2\2\u0271"+
		"\u0270\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\5@"+
		"!\2\u0274\u026f\3\2\2\2\u0274\u0271\3\2\2\2\u0275O\3\2\2\2\u0276\u0277"+
		"\5\"\22\2\u0277\u0278\5@!\2\u0278Q\3\2\2\2\u0279\u029b\5X-\2\u027a\u029b"+
		"\5&\24\2\u027b\u027d\7$\2\2\u027c\u027e\5\u00d8m\2\u027d\u027c\3\2\2\2"+
		"\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\7\33\2\2\u0280\u0282"+
		"\5\36\20\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\3\2\2\2"+
		"\u0283\u0284\5^\60\2\u0284\u0286\7$\2\2\u0285\u0287\5\u00d8m\2\u0286\u0285"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\7\34\2\2"+
		"\u0289\u029b\3\2\2\2\u028a\u028c\7$\2\2\u028b\u028d\5\u00d8m\2\u028c\u028b"+
		"\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\5T+\2\u028f"+
		"\u0291\7\33\2\2\u0290\u0292\5\36\20\2\u0291\u0290\3\2\2\2\u0291\u0292"+
		"\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\5^\60\2\u0294\u0296\7$\2\2\u0295"+
		"\u0297\5\u00d8m\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298"+
		"\3\2\2\2\u0298\u0299\7\34\2\2\u0299\u029b\3\2\2\2\u029a\u0279\3\2\2\2"+
		"\u029a\u027a\3\2\2\2\u029a\u027b\3\2\2\2\u029a\u028a\3\2\2\2\u029bS\3"+
		"\2\2\2\u029c\u029d\7\35\2\2\u029d\u02a2\5\u00d8m\2\u029e\u029f\7\27\2"+
		"\2\u029f\u02a1\5\u00d8m\2\u02a0\u029e\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\3\2\2\2\u02a4\u02a2\3\2"+
		"\2\2\u02a5\u02a6\7\36\2\2\u02a6U\3\2\2\2\u02a7\u02b1\7\r\2\2\u02a8\u02a9"+
		"\5\u00dep\2\u02a9\u02ab\5*\26\2\u02aa\u02ac\7\24\2\2\u02ab\u02aa\3\2\2"+
		"\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02af\5Z.\2\u02ae\u02ad"+
		"\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02b2\7\5\2\2\u02b1"+
		"\u02a8\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2W\3\2\2\2\u02b3\u02b4\5\u00de"+
		"p\2\u02b4\u02b6\5*\26\2\u02b5\u02b7\7\24\2\2\u02b6\u02b5\3\2\2\2\u02b6"+
		"\u02b7\3\2\2\2\u02b7\u02b9\3\2\2\2\u02b8\u02ba\5Z.\2\u02b9\u02b8\3\2\2"+
		"\2\u02b9\u02ba\3\2\2\2\u02baY\3\2\2\2\u02bb\u02bc\7\21\2\2\u02bc\u02c1"+
		"\7\37\2\2\u02bd\u02bf\5\\/\2\u02be\u02c0\7\30\2\2\u02bf\u02be\3\2\2\2"+
		"\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02bd\3\2\2\2\u02c2\u02c3"+
		"\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5"+
		"\u02c6\7 \2\2\u02c6[\3\2\2\2\u02c7\u02d1\5\"\22\2\u02c8\u02d2\5t;\2\u02c9"+
		"\u02d2\5X-\2\u02ca\u02cb\7\23\2\2\u02cb\u02d0\5.\30\2\u02cc\u02cd\7\23"+
		"\2\2\u02cd\u02ce\7\33\2\2\u02ce\u02d0\7\34\2\2\u02cf\u02ca\3\2\2\2\u02cf"+
		"\u02cc\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02c8\3\2\2\2\u02d1\u02c9\3\2"+
		"\2\2\u02d1\u02cf\3\2\2\2\u02d2]\3\2\2\2\u02d3\u02d7\5b\62\2\u02d4\u02d6"+
		"\5`\61\2\u02d5\u02d4\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u02e0\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02dc\5`"+
		"\61\2\u02db\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd"+
		"\u02de\3\2\2\2\u02de\u02e0\3\2\2\2\u02df\u02d3\3\2\2\2\u02df\u02db\3\2"+
		"\2\2\u02e0_\3\2\2\2\u02e1\u02e2\5z>\2\u02e2\u02e3\5b\62\2\u02e3\u02f0"+
		"\3\2\2\2\u02e4\u02e6\7\7\2\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02e9\5z>\2\u02e8\u02ea\7\b\2\2\u02e9\u02e8\3\2\2"+
		"\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\5b\62\2\u02ec\u02f0"+
		"\3\2\2\2\u02ed\u02ee\7\t\2\2\u02ee\u02f0\5b\62\2\u02ef\u02e1\3\2\2\2\u02ef"+
		"\u02e5\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0a\3\2\2\2\u02f1\u02f3\5d\63\2"+
		"\u02f2\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5"+
		"\3\2\2\2\u02f5\u02f9\3\2\2\2\u02f6\u02f7\7\r\2\2\u02f7\u02f9\7\5\2\2\u02f8"+
		"\u02f2\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9c\3\2\2\2\u02fa\u02ff\5h\65\2"+
		"\u02fb\u02ff\5l\67\2\u02fc\u02ff\5j\66\2\u02fd\u02ff\5f\64\2\u02fe\u02fa"+
		"\3\2\2\2\u02fe\u02fb\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02fd\3\2\2\2\u02ff"+
		"e\3\2\2\2\u0300\u0301\5t;\2\u0301\u0302\7\r\2\2\u0302g\3\2\2\2\u0303\u0304"+
		"\5\6\4\2\u0304i\3\2\2\2\u0305\u0306\5t;\2\u0306\u0307\7\f\2\2\u0307\u0308"+
		"\7\61\2\2\u0308k\3\2\2\2\u0309\u030a\5t;\2\u030a\u030b\7\f\2\2\u030b\u030d"+
		"\3\2\2\2\u030c\u0309\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2\2\2\u030e"+
		"\u030f\5n8\2\u030fm\3\2\2\2\u0310\u0313\5p9\2\u0311\u0313\5r:\2\u0312"+
		"\u0310\3\2\2\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2"+
		"\2\2\u0314\u0315\5\u00dan\2\u0315\u0316\5*\26\2\u0316\u0317\7\23\2\2\u0317"+
		"\u0318\5@!\2\u0318\u0319\7\27\2\2\u0319o\3\2\2\2\u031a\u031b\7\62\2\2"+
		"\u031b\u031c\7:\2\2\u031cq\3\2\2\2\u031d\u031e\7:\2\2\u031e\u031f\7\62"+
		"\2\2\u031fs\3\2\2\2\u0320\u0322\5&\24\2\u0321\u0323\5x=\2\u0322\u0321"+
		"\3\2\2\2\u0322\u0323\3\2\2\2\u0323u\3\2\2\2\u0324\u0325\7\f\2\2\u0325"+
		"\u0326\7\62\2\2\u0326\u0327\79\2\2\u0327\u0328\5X-\2\u0328w\3\2\2\2\u0329"+
		"\u032a\7\f\2\2\u032a\u032c\5R*\2\u032b\u032d\5x=\2\u032c\u032b\3\2\2\2"+
		"\u032c\u032d\3\2\2\2\u032d\u0337\3\2\2\2\u032e\u0330\7\31\2\2\u032f\u0331"+
		"\5x=\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0337\3\2\2\2\u0332"+
		"\u0334\5v<\2\u0333\u0335\5x=\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2"+
		"\u0335\u0337\3\2\2\2\u0336\u0329\3\2\2\2\u0336\u032e\3\2\2\2\u0336\u0332"+
		"\3\2\2\2\u0337y\3\2\2\2\u0338\u0344\7\"\2\2\u0339\u033b\7\32\2\2\u033a"+
		"\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u0341\5|"+
		"?\2\u033d\u033e\7:\2\2\u033e\u0340\5|?\2\u033f\u033d\3\2\2\2\u0340\u0343"+
		"\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0345\3\2\2\2\u0343"+
		"\u0341\3\2\2\2\u0344\u033a\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2"+
		"\2\2\u0346\u0347\7;\2\2\u0347{\3\2\2\2\u0348\u034b\5\u0086D\2\u0349\u034b"+
		"\5~@\2\u034a\u0348\3\2\2\2\u034a\u0349\3\2\2\2\u034b\u034f\3\2\2\2\u034c"+
		"\u034e\5\u008aF\2\u034d\u034c\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d"+
		"\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0358\3\2\2\2\u0351\u034f\3\2\2\2\u0352"+
		"\u0354\5\u008aF\2\u0353\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0353"+
		"\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0358\3\2\2\2\u0357\u034a\3\2\2\2\u0357"+
		"\u0353\3\2\2\2\u0358}\3\2\2\2\u0359\u035a\7O\2\2\u035a\u039e\7Y\2\2\u035b"+
		"\u039e\5\u0088E\2\u035c\u039e\5\u009eP\2\u035d\u0365\7\37\2\2\u035e\u035f"+
		"\5\"\22\2\u035f\u0361\5\u0080A\2\u0360\u0362\7\30\2\2\u0361\u0360\3\2"+
		"\2\2\u0361\u0362\3\2\2\2\u0362\u0364\3\2\2\2\u0363\u035e\3\2\2\2\u0364"+
		"\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u036c\3\2"+
		"\2\2\u0367\u0365\3\2\2\2\u0368\u036a\7\30\2\2\u0369\u0368\3\2\2\2\u0369"+
		"\u036a\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036d\7\5\2\2\u036c\u0369\3\2"+
		"\2\2\u036c\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u039e\7 \2\2\u036f"+
		"\u0377\5> \2\u0370\u0371\5\u009cO\2\u0371\u0372\7\23\2\2\u0372\u0377\3"+
		"\2\2\2\u0373\u0374\5\u0094K\2\u0374\u0375\7\23\2\2\u0375\u0377\3\2\2\2"+
		"\u0376\u036f\3\2\2\2\u0376\u0370\3\2\2\2\u0376\u0373\3\2\2\2\u0376\u0377"+
		"\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u037a\7\35\2\2\u0379\u037b\5\u0082"+
		"B\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u0380\3\2\2\2\u037c"+
		"\u037d\7\30\2\2\u037d\u037f\5\u0082B\2\u037e\u037c\3\2\2\2\u037f\u0382"+
		"\3\2\2\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0387\3\2\2\2\u0382"+
		"\u0380\3\2\2\2\u0383\u0385\7\30\2\2\u0384\u0383\3\2\2\2\u0384\u0385\3"+
		"\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\7\5\2\2\u0387\u0384\3\2\2\2\u0387"+
		"\u0388\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u0391\7\36\2\2\u038a\u038d\7"+
		"\33\2\2\u038b\u038e\5\u0088E\2\u038c\u038e\5\u00a8U\2\u038d\u038b\3\2"+
		"\2\2\u038d\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\7\34\2\2\u0390"+
		"\u0392\3\2\2\2\u0391\u038a\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u039e\3\2"+
		"\2\2\u0393\u0396\5\u00d8m\2\u0394\u0396\5\u00dco\2\u0395\u0393\3\2\2\2"+
		"\u0395\u0394\3\2\2\2\u0396\u039e\3\2\2\2\u0397\u039e\5\u0094K\2\u0398"+
		"\u0399\7\33\2\2\u0399\u039a\5\"\22\2\u039a\u039b\5\u0080A\2\u039b\u039c"+
		"\7\34\2\2\u039c\u039e\3\2\2\2\u039d\u0359\3\2\2\2\u039d\u035b\3\2\2\2"+
		"\u039d\u035c\3\2\2\2\u039d\u035d\3\2\2\2\u039d\u0376\3\2\2\2\u039d\u0395"+
		"\3\2\2\2\u039d\u0397\3\2\2\2\u039d\u0398\3\2\2\2\u039e\177\3\2\2\2\u039f"+
		"\u03a2\5z>\2\u03a0\u03a2\7\5\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a0\3\2\2"+
		"\2\u03a2\u0081\3\2\2\2\u03a3\u03a6\5z>\2\u03a4\u03a6\5\u0084C\2\u03a5"+
		"\u03a3\3\2\2\2\u03a5\u03a4\3\2\2\2\u03a6\u03a8\3\2\2\2\u03a7\u03a9\5\u00ce"+
		"h\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u0083\3\2\2\2\u03aa"+
		"\u03ab\7\33\2\2\u03ab\u03ae\5z>\2\u03ac\u03ad\7\23\2\2\u03ad\u03af\5z"+
		">\2\u03ae\u03ac\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0"+
		"\u03b1\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\7\34\2\2\u03b3\u0085\3"+
		"\2\2\2\u03b4\u03b5\79\2\2\u03b5\u03b6\5&\24\2\u03b6\u0087\3\2\2\2\u03b7"+
		"\u03b9\5\u008cG\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba"+
		"\3\2\2\2\u03ba\u03bc\7\62\2\2\u03bb\u03bd\5\u008eH\2\u03bc\u03bb\3\2\2"+
		"\2\u03bc\u03bd\3\2\2\2\u03bd\u0089\3\2\2\2\u03be\u03bf\7<\2\2\u03bf\u03c0"+
		"\5t;\2\u03c0\u03c1\5z>\2\u03c1\u03c2\7\34\2\2\u03c2\u008b\3\2\2\2\u03c3"+
		"\u03c8\5(\25\2\u03c4\u03c8\5\u00a8U\2\u03c5\u03c8\5\u009eP\2\u03c6\u03c8"+
		"\5\u00b2Z\2\u03c7\u03c3\3\2\2\2\u03c7\u03c4\3\2\2\2\u03c7\u03c5\3\2\2"+
		"\2\u03c7\u03c6\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03cb\7\32\2\2\u03ca"+
		"\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u008d\3\2\2\2\u03cc\u03ce\7\32"+
		"\2\2\u03cd\u03cc\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d3\3\2\2\2\u03cf"+
		"\u03d4\5(\25\2\u03d0\u03d4\5\u00a8U\2\u03d1\u03d4\5\u009eP\2\u03d2\u03d4"+
		"\5\u00b2Z\2\u03d3\u03cf\3\2\2\2\u03d3\u03d0\3\2\2\2\u03d3\u03d1\3\2\2"+
		"\2\u03d3\u03d2\3\2\2\2\u03d4\u008f\3\2\2\2\u03d5\u03d7\5\u008cG\2\u03d6"+
		"\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\7\62"+
		"\2\2\u03d9\u03db\5\u008eH\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\u03de\3\2\2\2\u03dc\u03dd\7\23\2\2\u03dd\u03df\5\u00a8U\2\u03de\u03dc"+
		"\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u0091\3\2\2\2\u03e0\u03e3\7M\2\2\u03e1"+
		"\u03e3\5\u009aN\2\u03e2\u03e0\3\2\2\2\u03e2\u03e1\3\2\2\2\u03e3\u03e5"+
		"\3\2\2\2\u03e4\u03e6\5\u0094K\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2"+
		"\2\u03e6\u0093\3\2\2\2\u03e7\u03f0\7L\2\2\u03e8\u03e9\7#\2\2\u03e9\u03eb"+
		"\5\u0096L\2\u03ea\u03ec\5\u0098M\2\u03eb\u03ea\3\2\2\2\u03eb\u03ec\3\2"+
		"\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee\7#\2\2\u03ee\u03f0\3\2\2\2\u03ef"+
		"\u03e7\3\2\2\2\u03ef\u03e8\3\2\2\2\u03f0\u0095\3\2\2\2\u03f1\u03f3\5\u00d8"+
		"m\2\u03f2\u03f1\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f4"+
		"\u03f5\3\2\2\2\u03f5\u0097\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7\u03f8\7\22"+
		"\2\2\u03f8\u03f9\5\u0096L\2\u03f9\u0099\3\2\2\2\u03fa\u03fc\5\u00aeX\2"+
		"\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe"+
		"\7N\2\2\u03fe\u009b\3\2\2\2\u03ff\u0400\5\u00d8m\2\u0400\u0401\7%\2\2"+
		"\u0401\u009d\3\2\2\2\u0402\u0404\5\u009cO\2\u0403\u0402\3\2\2\2\u0403"+
		"\u0404\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0409\7O\2\2\u0406\u0408\5\u00a0"+
		"Q\2\u0407\u0406\3\2\2\2\u0408\u040b\3\2\2\2\u0409\u0407\3\2\2\2\u0409"+
		"\u040a\3\2\2\2\u040a\u040c\3\2\2\2\u040b\u0409\3\2\2\2\u040c\u040d\7Y"+
		"\2\2\u040d\u009f\3\2\2\2\u040e\u0411\5\u00a2R\2\u040f\u0411\7X\2\2\u0410"+
		"\u040e\3\2\2\2\u0410\u040f\3\2\2\2\u0411\u00a1\3\2\2\2\u0412\u0415\5\u00a6"+
		"T\2\u0413\u0415\5\u00a4S\2\u0414\u0412\3\2\2\2\u0414\u0413\3\2\2\2\u0415"+
		"\u00a3\3\2\2\2\u0416\u0417\7V\2\2\u0417\u0418\5\u00a8U\2\u0418\u0419\7"+
		"\26\2\2\u0419\u00a5\3\2\2\2\u041a\u0427\7W\2\2\u041b\u041d\5\u00dep\2"+
		"\u041c\u041b\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0420"+
		"\5*\26\2\u041f\u0421\7\24\2\2\u0420\u041f\3\2\2\2\u0420\u0421\3\2\2\2"+
		"\u0421\u0423\3\2\2\2\u0422\u0424\5Z.\2\u0423\u0422\3\2\2\2\u0423\u0424"+
		"\3\2\2\2\u0424\u0428\3\2\2\2\u0425\u0426\7\23\2\2\u0426\u0428\5&\24\2"+
		"\u0427\u041c\3\2\2\2\u0427\u0425\3\2\2\2\u0428\u042a\3\2\2\2\u0429\u042b"+
		"\5x=\2\u042a\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042e\3\2\2\2\u042c"+
		"\u042d\7\f\2\2\u042d\u042f\7\61\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3"+
		"\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431\7\26\2\2\u0431\u00a7\3\2\2\2\u0432"+
		"\u0434\5\u009cO\2\u0433\u0432\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435"+
		"\3\2\2\2\u0435\u0436\5\u00aaV\2\u0436\u00a9\3\2\2\2\u0437\u0438\bV\1\2"+
		"\u0438\u0449\5\u0092J\2\u0439\u043a\7\33\2\2\u043a\u043b\5\u00aaV\2\u043b"+
		"\u043d\7\34\2\2\u043c\u043e\5\u0094K\2\u043d\u043c\3\2\2\2\u043d\u043e"+
		"\3\2\2\2\u043e\u0449\3\2\2\2\u043f\u0440\5\u00b2Z\2\u0440\u0441\5\u0094"+
		"K\2\u0441\u0449\3\2\2\2\u0442\u0444\5\u00aeX\2\u0443\u0442\3\2\2\2\u0443"+
		"\u0444\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0449\5(\25\2\u0446\u0449\5\u00e0"+
		"q\2\u0447\u0449\5\u00acW\2\u0448\u0437\3\2\2\2\u0448\u0439\3\2\2\2\u0448"+
		"\u043f\3\2\2\2\u0448\u0443\3\2\2\2\u0448\u0446\3\2\2\2\u0448\u0447\3\2"+
		"\2\2\u0449\u045c\3\2\2\2\u044a\u044b\f\b\2\2\u044b\u044c\5\u00b0Y\2\u044c"+
		"\u044d\5\u00aaV\t\u044d\u045b\3\2\2\2\u044e\u044f\f\7\2\2\u044f\u0450"+
		"\5\u00aeX\2\u0450\u0451\5\u00aaV\b\u0451\u045b\3\2\2\2\u0452\u0453\f\5"+
		"\2\2\u0453\u0454\5\u00b0Y\2\u0454\u0455\5\u00b2Z\2\u0455\u045b\3\2\2\2"+
		"\u0456\u0457\f\4\2\2\u0457\u0458\5\u00aeX\2\u0458\u0459\5\u00b2Z\2\u0459"+
		"\u045b\3\2\2\2\u045a\u044a\3\2\2\2\u045a\u044e\3\2\2\2\u045a\u0452\3\2"+
		"\2\2\u045a\u0456\3\2\2\2\u045b\u045e\3\2\2\2\u045c\u045a\3\2\2\2\u045c"+
		"\u045d\3\2\2\2\u045d\u00ab\3\2\2\2\u045e\u045c\3\2\2\2\u045f\u0460\5\u00b2"+
		"Z\2\u0460\u0463\5\u00b0Y\2\u0461\u0464\5\u00b2Z\2\u0462\u0464\5\u00aa"+
		"V\2\u0463\u0461\3\2\2\2\u0463\u0462\3\2\2\2\u0464\u046c\3\2\2\2\u0465"+
		"\u0466\5\u00b2Z\2\u0466\u0469\5\u00aeX\2\u0467\u046a\5\u00b2Z\2\u0468"+
		"\u046a\5\u00aaV\2\u0469\u0467\3\2\2\2\u0469\u0468\3\2\2\2\u046a\u046c"+
		"\3\2\2\2\u046b\u045f\3\2\2\2\u046b\u0465\3\2\2\2\u046c\u00ad\3\2\2\2\u046d"+
		"\u046e\t\3\2\2\u046e\u00af\3\2\2\2\u046f\u0470\t\4\2\2\u0470\u00b1\3\2"+
		"\2\2\u0471\u0472\7\33\2\2\u0472\u0473\5@!\2\u0473\u0474\7\34\2\2\u0474"+
		"\u0477\3\2\2\2\u0475\u0477\5\u00b4[\2\u0476\u0471\3\2\2\2\u0476\u0475"+
		"\3\2\2\2\u0477\u00b3\3\2\2\2\u0478\u0479\7\33\2\2\u0479\u047a\5\u00b6"+
		"\\\2\u047a\u047b\5X-\2\u047b\u047c\5\u00b6\\\2\u047c\u047d\7\34\2\2\u047d"+
		"\u00b5\3\2\2\2\u047e\u0481\5&\24\2\u047f\u0481\5\u00b2Z\2\u0480\u047e"+
		"\3\2\2\2\u0480\u047f\3\2\2\2\u0481\u00b7\3\2\2\2\u0482\u0484\5l\67\2\u0483"+
		"\u0482\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0489\5\u00bc"+
		"_\2\u0486\u0488\5\u00ba^\2\u0487\u0486\3\2\2\2\u0488\u048b\3\2\2\2\u0489"+
		"\u0487\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u00b9\3\2\2\2\u048b\u0489\3\2"+
		"\2\2\u048c\u048d\7.\2\2\u048d\u048e\5\"\22\2\u048e\u048f\5\u00bc_\2\u048f"+
		"\u00bb\3\2\2\2\u0490\u0497\5\u00be`\2\u0491\u0493\5\u00d0i\2\u0492\u0491"+
		"\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495"+
		"\u0497\3\2\2\2\u0496\u0490\3\2\2\2\u0496\u0492\3\2\2\2\u0497\u00bd\3\2"+
		"\2\2\u0498\u049a\5\u00d0i\2\u0499\u0498\3\2\2\2\u049a\u049d\3\2\2\2\u049b"+
		"\u0499\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049e\3\2\2\2\u049d\u049b\3\2"+
		"\2\2\u049e\u04a3\5\u00c0a\2\u049f\u04a1\7\30\2\2\u04a0\u049f\3\2\2\2\u04a0"+
		"\u04a1\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a4\5\u00be`\2\u04a3\u04a0"+
		"\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u00bf\3\2\2\2\u04a5\u04a7\5\u00c2b"+
		"\2\u04a6\u04a8\5x=\2\u04a7\u04a6\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04ac"+
		"\3\2\2\2\u04a9\u04ab\5\u00d0i\2\u04aa\u04a9\3\2\2\2\u04ab\u04ae\3\2\2"+
		"\2\u04ac\u04aa\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u00c1\3\2\2\2\u04ae\u04ac"+
		"\3\2\2\2\u04af\u04c2\5\u00c8e\2\u04b0\u04b2\5> \2\u04b1\u04b0\3\2\2\2"+
		"\u04b1\u04b2\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b6\7\35\2\2\u04b4\u04b7"+
		"\5\u00bc_\2\u04b5\u04b7\5\u00d0i\2\u04b6\u04b4\3\2\2\2\u04b6\u04b5\3\2"+
		"\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04c2\7\36\2\2\u04b9"+
		"\u04bc\7\37\2\2\u04ba\u04bd\5\u00c4c\2\u04bb\u04bd\5\u00d0i\2\u04bc\u04ba"+
		"\3\2\2\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u04c2\7 \2\2\u04bf\u04c2\5&\24\2\u04c0\u04c2\5\u00d4k\2\u04c1\u04af\3"+
		"\2\2\2\u04c1\u04b1\3\2\2\2\u04c1\u04b9\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c1"+
		"\u04c0\3\2\2\2\u04c2\u00c3\3\2\2\2\u04c3\u04c5\5\u00d0i\2\u04c4\u04c3"+
		"\3\2\2\2\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7"+
		"\u04c9\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9\u04ce\5\u00c6d\2\u04ca\u04cc"+
		"\7\30\2\2\u04cb\u04ca\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\3\2\2\2"+
		"\u04cd\u04cf\5\u00c4c\2\u04ce\u04cb\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf"+
		"\u00c5\3\2\2\2\u04d0\u04d3\5\u00c8e\2\u04d1\u04d3\5\u00d4k\2\u04d2\u04d0"+
		"\3\2\2\2\u04d2\u04d1\3\2\2\2\u04d3\u04d7\3\2\2\2\u04d4\u04d6\5\u00d0i"+
		"\2\u04d5\u04d4\3\2\2\2\u04d6\u04d9\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d7\u04d8"+
		"\3\2\2\2\u04d8\u00c7\3\2\2\2\u04d9\u04d7\3\2\2\2\u04da\u04dc\7\"\2\2\u04db"+
		"\u04dd\7\32\2\2\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de\3"+
		"\2\2\2\u04de\u04e3\5\u00caf\2\u04df\u04e0\7:\2\2\u04e0\u04e2\5\u00caf"+
		"\2\u04e1\u04df\3\2\2\2\u04e2\u04e5\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e3\u04e4"+
		"\3\2\2\2\u04e4\u04e6\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e6\u04e8\7;\2\2\u04e7"+
		"\u04e9\5\u00ceh\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u00c9"+
		"\3\2\2\2\u04ea\u04ec\5\u009cO\2\u04eb\u04ea\3\2\2\2\u04eb\u04ec\3\2\2"+
		"\2\u04ec\u04f0\3\2\2\2\u04ed\u04f1\5\u00ccg\2\u04ee\u04f1\5\u00d8m\2\u04ef"+
		"\u04f1\5\u009eP\2\u04f0\u04ed\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f0\u04ef"+
		"\3\2\2\2\u04f1\u04f3\3\2\2\2\u04f2\u04f4\5\u0094K\2\u04f3\u04f2\3\2\2"+
		"\2\u04f3\u04f4\3\2\2\2\u04f4\u00cb\3\2\2\2\u04f5\u04f8\79\2\2\u04f6\u04f9"+
		"\5(\25\2\u04f7\u04f9\5\u009eP\2\u04f8\u04f6\3\2\2\2\u04f8\u04f7\3\2\2"+
		"\2\u04f9\u00cd\3\2\2\2\u04fa\u0503\7\63\2\2\u04fb\u0503\7\65\2\2\u04fc"+
		"\u0503\78\2\2\u04fd\u0500\79\2\2\u04fe\u0501\7N\2\2\u04ff\u0501\5(\25"+
		"\2\u0500\u04fe\3\2\2\2\u0500\u04ff\3\2\2\2\u0501\u0503\3\2\2\2\u0502\u04fa"+
		"\3\2\2\2\u0502\u04fb\3\2\2\2\u0502\u04fc\3\2\2\2\u0502\u04fd\3\2\2\2\u0503"+
		"\u00cf\3\2\2\2\u0504\u0506\7\33\2\2\u0505\u0507\5\u00d2j\2\u0506\u0505"+
		"\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0506\3\2\2\2\u0508\u0509\3\2\2\2\u0509"+
		"\u050a\3\2\2\2\u050a\u050b\7\34\2\2\u050b\u00d1\3\2\2\2\u050c\u050d\7"+
		"\6\2\2\u050d\u050e\5\"\22\2\u050e\u0510\5\u00c2b\2\u050f\u0511\5x=\2\u0510"+
		"\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0513\7\27"+
		"\2\2\u0513\u051e\3\2\2\2\u0514\u051a\5\u00c2b\2\u0515\u0517\5x=\2\u0516"+
		"\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519\7\f"+
		"\2\2\u0519\u051b\5n8\2\u051a\u0516\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051e"+
		"\3\2\2\2\u051c\u051e\5l\67\2\u051d\u050c\3\2\2\2\u051d\u0514\3\2\2\2\u051d"+
		"\u051c\3\2\2\2\u051e\u00d3\3\2\2\2\u051f\u0522\5\"\22\2\u0520\u0522\5"+
		"\u00d6l\2\u0521\u051f\3\2\2\2\u0521\u0520\3\2\2\2\u0522\u0526\3\2\2\2"+
		"\u0523\u0525\5\u00d0i\2\u0524\u0523\3\2\2\2\u0525\u0528\3\2\2\2\u0526"+
		"\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0529\3\2\2\2\u0528\u0526\3\2"+
		"\2\2\u0529\u052a\5\u00c0a\2\u052a\u00d5\3\2\2\2\u052b\u052c\5\u00c8e\2"+
		"\u052c\u052d\7\23\2\2\u052d\u00d7\3\2\2\2\u052e\u0531\7Q\2\2\u052f\u0531"+
		"\5\u00e2r\2\u0530\u052e\3\2\2\2\u0530\u052f\3\2\2\2\u0531\u00d9\3\2\2"+
		"\2\u0532\u0533\7P\2\2\u0533\u00db\3\2\2\2\u0534\u0537\5\u00d8m\2\u0535"+
		"\u0536\7\22\2\2\u0536\u0538\5\u00d8m\2\u0537\u0535\3\2\2\2\u0538\u0539"+
		"\3\2\2\2\u0539\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u00dd\3\2\2\2\u053b"+
		"\u053f\5\u00dan\2\u053c\u053f\5\u00d8m\2\u053d\u053f\5\u00dco\2\u053e"+
		"\u053b\3\2\2\2\u053e\u053c\3\2\2\2\u053e\u053d\3\2\2\2\u053f\u00df\3\2"+
		"\2\2\u0540\u0541\t\5\2\2\u0541\u00e1\3\2\2\2\u0542\u0561\7\4\2\2\u0543"+
		"\u0561\7\6\2\2\u0544\u0561\7&\2\2\u0545\u0561\7\'\2\2\u0546\u0561\7(\2"+
		"\2\u0547\u0561\7)\2\2\u0548\u0561\7*\2\2\u0549\u0561\7+\2\2\u054a\u0561"+
		"\7,\2\2\u054b\u0561\7-\2\2\u054c\u0561\7\n\2\2\u054d\u0561\7\13\2\2\u054e"+
		"\u0561\7\67\2\2\u054f\u0561\7.\2\2\u0550\u0561\7\7\2\2\u0551\u0561\7\b"+
		"\2\2\u0552\u0561\7\t\2\2\u0553\u0561\5\u00e0q\2\u0554\u0561\7=\2\2\u0555"+
		"\u0561\7>\2\2\u0556\u0561\7@\2\2\u0557\u0561\7A\2\2\u0558\u0561\7B\2\2"+
		"\u0559\u0561\7C\2\2\u055a\u0561\7E\2\2\u055b\u0561\7G\2\2\u055c\u0561"+
		"\7H\2\2\u055d\u0561\7I\2\2\u055e\u0561\7J\2\2\u055f\u0561\7K\2\2\u0560"+
		"\u0542\3\2\2\2\u0560\u0543\3\2\2\2\u0560\u0544\3\2\2\2\u0560\u0545\3\2"+
		"\2\2\u0560\u0546\3\2\2\2\u0560\u0547\3\2\2\2\u0560\u0548\3\2\2\2\u0560"+
		"\u0549\3\2\2\2\u0560\u054a\3\2\2\2\u0560\u054b\3\2\2\2\u0560\u054c\3\2"+
		"\2\2\u0560\u054d\3\2\2\2\u0560\u054e\3\2\2\2\u0560\u054f\3\2\2\2\u0560"+
		"\u0550\3\2\2\2\u0560\u0551\3\2\2\2\u0560\u0552\3\2\2\2\u0560\u0553\3\2"+
		"\2\2\u0560\u0554\3\2\2\2\u0560\u0555\3\2\2\2\u0560\u0556\3\2\2\2\u0560"+
		"\u0557\3\2\2\2\u0560\u0558\3\2\2\2\u0560\u0559\3\2\2\2\u0560\u055a\3\2"+
		"\2\2\u0560\u055b\3\2\2\2\u0560\u055c\3\2\2\2\u0560\u055d\3\2\2\2\u0560"+
		"\u055e\3\2\2\2\u0560\u055f\3\2\2\2\u0561\u00e3\3\2\2\2\u0562\u0564\5\u00e6"+
		"t\2\u0563\u0562\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0563\3\2\2\2\u0565"+
		"\u0566\3\2\2\2\u0566\u00e5\3\2\2\2\u0567\u0569\5\6\4\2\u0568\u0567\3\2"+
		"\2\2\u0569\u056c\3\2\2\2\u056a\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b"+
		"\u056e\3\2\2\2\u056c\u056a\3\2\2\2\u056d\u056f\5\u00e8u\2\u056e\u056d"+
		"\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u056e\3\2\2\2\u0570\u0571\3\2\2\2\u0571"+
		"\u00e7\3\2\2\2\u0572\u0573\7>\2\2\u0573\u0574\5t;\2\u0574\u0575\5z>\2"+
		"\u0575\u0576\5\u009eP\2\u0576\u00e9\3\2\2\2\u0577\u0579\7@\2\2\u0578\u057a"+
		"\5\u00ecw\2\u0579\u0578\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u0579\3\2\2"+
		"\2\u057b\u057c\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057e\7A\2\2\u057e\u00eb"+
		"\3\2\2\2\u057f\u0580\5\u00eex\2\u0580\u0581\7E\2\2\u0581\u0583\3\2\2\2"+
		"\u0582\u057f\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0585"+
		"\7C\2\2\u0585\u0587\5\u00eex\2\u0586\u0588\5\u00eav\2\u0587\u0586\3\2"+
		"\2\2\u0587\u0588\3\2\2\2\u0588\u058a\3\2\2\2\u0589\u058b\5\6\4\2\u058a"+
		"\u0589\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058a\3\2\2\2\u058c\u058d\3\2"+
		"\2\2\u058d\u058e\3\2\2\2\u058e\u058f\7-\2\2\u058f\u0590\5\u00eex\2\u0590"+
		"\u05b4\3\2\2\2\u0591\u0592\5\u00eex\2\u0592\u0595\7D\2\2\u0593\u0594\7"+
		"E\2\2\u0594\u0596\5\u00eex\2\u0595\u0593\3\2\2\2\u0595\u0596\3\2\2\2\u0596"+
		"\u05b4\3\2\2\2\u0597\u0598\5\u00eex\2\u0598\u0599\7E\2\2\u0599\u059b\3"+
		"\2\2\2\u059a\u0597\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059c\3\2\2\2\u059c"+
		"\u059d\7B\2\2\u059d\u059f\5\u009eP\2\u059e\u05a0\5\u00eav\2\u059f\u059e"+
		"\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2\3\2\2\2\u05a1\u05a3\5\6\4\2\u05a2"+
		"\u05a1\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a4\u05a5\3\2"+
		"\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a7\7-\2\2\u05a7\u05a8\5\u009eP\2\u05a8"+
		"\u05b4\3\2\2\2\u05a9\u05aa\5\u00eex\2\u05aa\u05ab\7E\2\2\u05ab\u05ad\3"+
		"\2\2\2\u05ac\u05a9\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae"+
		"\u05b1\5\u009eP\2\u05af\u05b2\7F\2\2\u05b0\u05b2\5\u00eav\2\u05b1\u05af"+
		"\3\2\2\2\u05b1\u05b0\3\2\2\2\u05b2\u05b4\3\2\2\2\u05b3\u0582\3\2\2\2\u05b3"+
		"\u0591\3\2\2\2\u05b3\u059a\3\2\2\2\u05b3\u05ac\3\2\2\2\u05b4\u00ed\3\2"+
		"\2\2\u05b5\u05b8\7?\2\2\u05b6\u05b8\5\u00d8m\2\u05b7\u05b5\3\2\2\2\u05b7"+
		"\u05b6\3\2\2\2\u05b8\u00ef\3\2\2\2\u05b9\u05ba\7G\2\2\u05ba\u05bb\5\u00ec"+
		"w\2\u05bb\u00f1\3\2\2\2\u05bc\u05bd\7I\2\2\u05bd\u05bf\7H\2\2\u05be\u05c0"+
		"\5\6\4\2\u05bf\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c1"+
		"\u05c2\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\7-\2\2\u05c4\u05c5\7H\2"+
		"\2\u05c5\u00f3\3\2\2\2\u00cc\u00f7\u00fd\u0104\u010d\u0119\u0127\u012a"+
		"\u0133\u0136\u013c\u0147\u0151\u0156\u0159\u0164\u0168\u0173\u0178\u0184"+
		"\u0190\u0197\u01a0\u01a4\u01b5\u01b9\u01bc\u01c0\u01c3\u01c9\u01cc\u01d1"+
		"\u01d6\u01de\u01e9\u01ee\u01f6\u01fe\u0203\u0207\u020a\u0215\u0220\u022a"+
		"\u022f\u0236\u023e\u0241\u024c\u024f\u0259\u0264\u0268\u026b\u0271\u0274"+
		"\u027d\u0281\u0286\u028c\u0291\u0296\u029a\u02a2\u02ab\u02ae\u02b1\u02b6"+
		"\u02b9\u02bf\u02c3\u02cf\u02d1\u02d7\u02dd\u02df\u02e5\u02e9\u02ef\u02f4"+
		"\u02f8\u02fe\u030c\u0312\u0322\u032c\u0330\u0334\u0336\u033a\u0341\u0344"+
		"\u034a\u034f\u0355\u0357\u0361\u0365\u0369\u036c\u0376\u037a\u0380\u0384"+
		"\u0387\u038d\u0391\u0395\u039d\u03a1\u03a5\u03a8\u03b0\u03b8\u03bc\u03c7"+
		"\u03ca\u03cd\u03d3\u03d6\u03da\u03de\u03e2\u03e5\u03eb\u03ef\u03f4\u03fb"+
		"\u0403\u0409\u0410\u0414\u041c\u0420\u0423\u0427\u042a\u042e\u0433\u043d"+
		"\u0443\u0448\u045a\u045c\u0463\u0469\u046b\u0476\u0480\u0483\u0489\u0494"+
		"\u0496\u049b\u04a0\u04a3\u04a7\u04ac\u04b1\u04b6\u04bc\u04c1\u04c6\u04cb"+
		"\u04ce\u04d2\u04d7\u04dc\u04e3\u04e8\u04eb\u04f0\u04f3\u04f8\u0500\u0502"+
		"\u0508\u0510\u0516\u051a\u051d\u0521\u0526\u0530\u0539\u053e\u0560\u0565"+
		"\u056a\u0570\u057b\u0582\u0587\u058c\u0595\u059a\u059f\u05a4\u05ac\u05b1"+
		"\u05b3\u05b7\u05c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}