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
		StartComment=1, Include=2, Void=3, Def=4, When=5, Do=6, Otherwise=7, To=8, 
		ResultMarker=9, SourceMarker=10, DeleteMarker=11, And=12, Slash=13, Colon=14, 
		Message=15, FieldReference=16, EndStringInterpolate=17, SemiColon=18, 
		Comma=19, Deconstructor=20, Invert=21, LeftParen=22, RightParen=23, LeftBracket=24, 
		RightBracket=25, LeftBrace=26, RightBrace=27, StartMatcher=28, Lambda=29, 
		StartTemplatesDefinition=30, StartSourceDefinition=31, StartSinkDefinition=32, 
		StartComposerDefinition=33, StartProcessorDefinition=34, EndDefinition=35, 
		Rule=36, First=37, Last=38, TemplateMatch=39, Range=40, Plus=41, Minus=42, 
		Star=43, TruncateDivide=44, Mod=45, Question=46, Equal=47, Else=48, EndMatcher=49, 
		BeginCondition=50, StartTestDefinition=51, Assert=52, CoreSystem=53, With=54, 
		Provided=55, Modified=56, From=57, StandAlone=58, Use=59, Zero=60, PositiveInteger=61, 
		START_STRING=62, STATE_IDENTIFIER=63, IDENTIFIER=64, WS=65, Comment=66, 
		REGEX_TEXT=67, END_REGEX=68, StartCharacterCode=69, StartStringInterpolate=70, 
		STRING_TEXT=71, END_STRING=72;
	public static final int
		RULE_program = 0, RULE_inclusion = 1, RULE_statement = 2, RULE_key = 3, 
		RULE_parameterDefinitions = 4, RULE_source = 5, RULE_sourceReference = 6, 
		RULE_deleteState = 7, RULE_reference = 8, RULE_structureReference = 9, 
		RULE_arrayReference = 10, RULE_dimensionReference = 11, RULE_simpleDimension = 12, 
		RULE_multiValueDimension = 13, RULE_arrayLiteral = 14, RULE_valueProduction = 15, 
		RULE_structureLiteral = 16, RULE_keyValues = 17, RULE_keyValue = 18, RULE_templates = 19, 
		RULE_arrayIndexDecomposition = 20, RULE_sink = 21, RULE_templatesReference = 22, 
		RULE_parameterValues = 23, RULE_parameterValue = 24, RULE_templatesBody = 25, 
		RULE_matchTemplate = 26, RULE_block = 27, RULE_blockExpression = 28, RULE_resultValue = 29, 
		RULE_blockStatement = 30, RULE_sendToTemplates = 31, RULE_stateAssignment = 32, 
		RULE_stateSink = 33, RULE_valueChain = 34, RULE_transform = 35, RULE_matcher = 36, 
		RULE_criterion = 37, RULE_typeMatch = 38, RULE_structureContentMatcher = 39, 
		RULE_arrayContentMatcher = 40, RULE_literalMatch = 41, RULE_rangeBounds = 42, 
		RULE_condition = 43, RULE_lowerBound = 44, RULE_upperBound = 45, RULE_rangeLiteral = 46, 
		RULE_integerLiteral = 47, RULE_nonZeroInteger = 48, RULE_stringLiteral = 49, 
		RULE_stringContent = 50, RULE_stringInterpolate = 51, RULE_characterCode = 52, 
		RULE_interpolateEvaluate = 53, RULE_arithmeticExpression = 54, RULE_additiveOperator = 55, 
		RULE_multiplicativeOperator = 56, RULE_composerBody = 57, RULE_definedCompositionSequence = 58, 
		RULE_compositionSequence = 59, RULE_compositionComponents = 60, RULE_compositionComponent = 61, 
		RULE_compositionMatcher = 62, RULE_structureMemberMatchers = 63, RULE_structureMemberMatcher = 64, 
		RULE_tokenMatcher = 65, RULE_compositionToken = 66, RULE_literalComposition = 67, 
		RULE_multiplier = 68, RULE_compositionSkipRule = 69, RULE_compositionCapture = 70, 
		RULE_compositionKeyValue = 71, RULE_compositionKey = 72, RULE_localIdentifier = 73, 
		RULE_stateIdentifier = 74, RULE_externalIdentifier = 75, RULE_anyIdentifier = 76, 
		RULE_arithmeticContextKeyword = 77, RULE_keyword = 78, RULE_testBody = 79, 
		RULE_testBlock = 80, RULE_assertion = 81, RULE_dependencyProvision = 82, 
		RULE_moduleConfiguration = 83, RULE_moduleIdentifier = 84, RULE_useModule = 85;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "inclusion", "statement", "key", "parameterDefinitions", "source", 
			"sourceReference", "deleteState", "reference", "structureReference", 
			"arrayReference", "dimensionReference", "simpleDimension", "multiValueDimension", 
			"arrayLiteral", "valueProduction", "structureLiteral", "keyValues", "keyValue", 
			"templates", "arrayIndexDecomposition", "sink", "templatesReference", 
			"parameterValues", "parameterValue", "templatesBody", "matchTemplate", 
			"block", "blockExpression", "resultValue", "blockStatement", "sendToTemplates", 
			"stateAssignment", "stateSink", "valueChain", "transform", "matcher", 
			"criterion", "typeMatch", "structureContentMatcher", "arrayContentMatcher", 
			"literalMatch", "rangeBounds", "condition", "lowerBound", "upperBound", 
			"rangeLiteral", "integerLiteral", "nonZeroInteger", "stringLiteral", 
			"stringContent", "stringInterpolate", "characterCode", "interpolateEvaluate", 
			"arithmeticExpression", "additiveOperator", "multiplicativeOperator", 
			"composerBody", "definedCompositionSequence", "compositionSequence", 
			"compositionComponents", "compositionComponent", "compositionMatcher", 
			"structureMemberMatchers", "structureMemberMatcher", "tokenMatcher", 
			"compositionToken", "literalComposition", "multiplier", "compositionSkipRule", 
			"compositionCapture", "compositionKeyValue", "compositionKey", "localIdentifier", 
			"stateIdentifier", "externalIdentifier", "anyIdentifier", "arithmeticContextKeyword", 
			"keyword", "testBody", "testBlock", "assertion", "dependencyProvision", 
			"moduleConfiguration", "moduleIdentifier", "useModule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'include'", "'VOID'", "'def'", "'when'", "'do'", "'otherwise'", 
			"'->'", "'!'", "'$'", "'^'", "'&'", "'/'", "':'", null, null, null, "';'", 
			"','", "'...'", "'~'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", 
			"'\\'", "'templates'", "'source'", "'sink'", "'composer'", "'processor'", 
			"'end'", "'rule'", "'first'", "'last'", "'#'", "'..'", "'+'", "'-'", 
			"'*'", "'~/'", "'mod'", "'?'", "'='", "'|'", "'>'", "'?('", "'test'", 
			"'assert'", "'core-system/'", "'with'", "'provided'", "'modified'", "'from'", 
			"'stand-alone'", "'use'", "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Include", "Void", "Def", "When", "Do", "Otherwise", 
			"To", "ResultMarker", "SourceMarker", "DeleteMarker", "And", "Slash", 
			"Colon", "Message", "FieldReference", "EndStringInterpolate", "SemiColon", 
			"Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "StartMatcher", "Lambda", 
			"StartTemplatesDefinition", "StartSourceDefinition", "StartSinkDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "EndDefinition", 
			"Rule", "First", "Last", "TemplateMatch", "Range", "Plus", "Minus", "Star", 
			"TruncateDivide", "Mod", "Question", "Equal", "Else", "EndMatcher", "BeginCondition", 
			"StartTestDefinition", "Assert", "CoreSystem", "With", "Provided", "Modified", 
			"From", "StandAlone", "Use", "Zero", "PositiveInteger", "START_STRING", 
			"STATE_IDENTIFIER", "IDENTIFIER", "WS", "Comment", "REGEX_TEXT", "END_REGEX", 
			"StartCharacterCode", "StartStringInterpolate", "STRING_TEXT", "END_STRING"
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
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(172);
					useModule();
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(178);
					inclusion();
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(184);
			statement();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (Include - 2)) | (1L << (Def - 2)) | (1L << (When - 2)) | (1L << (Do - 2)) | (1L << (Otherwise - 2)) | (1L << (SourceMarker - 2)) | (1L << (DeleteMarker - 2)) | (1L << (LeftParen - 2)) | (1L << (LeftBracket - 2)) | (1L << (LeftBrace - 2)) | (1L << (StartTemplatesDefinition - 2)) | (1L << (StartSourceDefinition - 2)) | (1L << (StartSinkDefinition - 2)) | (1L << (StartComposerDefinition - 2)) | (1L << (StartProcessorDefinition - 2)) | (1L << (EndDefinition - 2)) | (1L << (Rule - 2)) | (1L << (First - 2)) | (1L << (Last - 2)) | (1L << (Range - 2)) | (1L << (Plus - 2)) | (1L << (Minus - 2)) | (1L << (Mod - 2)) | (1L << (StartTestDefinition - 2)) | (1L << (Assert - 2)) | (1L << (With - 2)) | (1L << (Provided - 2)) | (1L << (Modified - 2)) | (1L << (From - 2)) | (1L << (Use - 2)) | (1L << (Zero - 2)) | (1L << (PositiveInteger - 2)) | (1L << (START_STRING - 2)) | (1L << (IDENTIFIER - 2)))) != 0)) {
				{
				{
				setState(185);
				statement();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
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
			setState(193);
			match(Include);
			setState(194);
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
		public ComposerDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitComposerDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefinitionContext extends StatementContext {
		public TerminalNode Def() { return getToken(TailspinParser.Def, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TailspinParser.SemiColon, 0); }
		public DefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProcessorDefinitionContext extends StatementContext {
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
		public ProcessorDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitProcessorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TestDefinitionContext extends StatementContext {
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
		public TestDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTestDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(Def);
				setState(197);
				key();
				setState(198);
				valueProduction();
				setState(199);
				match(SemiColon);
				}
				break;
			case 2:
				_localctx = new ValueChainToSinkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				valueChain();
				setState(202);
				match(To);
				setState(203);
				sink();
				}
				break;
			case 3:
				_localctx = new TemplatesDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				localIdentifier();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(207);
					parameterDefinitions();
					}
				}

				setState(210);
				templatesBody();
				setState(211);
				match(EndDefinition);
				setState(212);
				localIdentifier();
				}
				break;
			case 4:
				_localctx = new ProcessorDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(StartProcessorDefinition);
				setState(215);
				localIdentifier();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(216);
					parameterDefinitions();
					}
				}

				setState(219);
				block();
				setState(220);
				match(EndDefinition);
				setState(221);
				localIdentifier();
				}
				break;
			case 5:
				_localctx = new ComposerDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				match(StartComposerDefinition);
				setState(224);
				localIdentifier();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(225);
					parameterDefinitions();
					}
				}

				setState(228);
				composerBody();
				setState(229);
				match(EndDefinition);
				setState(230);
				localIdentifier();
				}
				break;
			case 6:
				_localctx = new TestDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				match(StartTestDefinition);
				setState(233);
				stringLiteral();
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(234);
						useModule();
						}
						} 
					}
					setState(239);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(240);
				testBody();
				setState(241);
				match(EndDefinition);
				setState(242);
				stringLiteral();
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
		enterRule(_localctx, 6, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			localIdentifier();
			setState(247);
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
		enterRule(_localctx, 8, RULE_parameterDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(And);
			setState(250);
			match(LeftBrace);
			setState(255); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(251);
				key();
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(252);
					match(Comma);
					}
				}

				}
				}
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (Include - 2)) | (1L << (Def - 2)) | (1L << (When - 2)) | (1L << (Do - 2)) | (1L << (Otherwise - 2)) | (1L << (StartTemplatesDefinition - 2)) | (1L << (StartSourceDefinition - 2)) | (1L << (StartSinkDefinition - 2)) | (1L << (StartComposerDefinition - 2)) | (1L << (StartProcessorDefinition - 2)) | (1L << (EndDefinition - 2)) | (1L << (Rule - 2)) | (1L << (First - 2)) | (1L << (Last - 2)) | (1L << (Mod - 2)) | (1L << (StartTestDefinition - 2)) | (1L << (Assert - 2)) | (1L << (With - 2)) | (1L << (Provided - 2)) | (1L << (Modified - 2)) | (1L << (From - 2)) | (1L << (Use - 2)) | (1L << (IDENTIFIER - 2)))) != 0) );
			setState(259);
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
		public DeleteStateContext deleteState() {
			return getRuleContext(DeleteStateContext.class,0);
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
		public StructureLiteralContext structureLiteral() {
			return getRuleContext(StructureLiteralContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public KeyValueContext keyValue() {
			return getRuleContext(KeyValueContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
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
		enterRule(_localctx, 10, RULE_source);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				sourceReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				deleteState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				rangeLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				arrayLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(266);
				structureLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(267);
				match(LeftParen);
				setState(268);
				keyValue();
				setState(269);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				arithmeticExpression(0);
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
		public TerminalNode SourceMarker() { return getToken(TailspinParser.SourceMarker, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public AnyIdentifierContext anyIdentifier() {
			return getRuleContext(AnyIdentifierContext.class,0);
		}
		public TerminalNode Message() { return getToken(TailspinParser.Message, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
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
		enterRule(_localctx, 12, RULE_sourceReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(SourceMarker);
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(275);
				anyIdentifier();
				}
				break;
			}
			setState(278);
			reference();
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(279);
				match(Message);
				}
				break;
			}
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(282);
				parameterValues();
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

	public static class DeleteStateContext extends ParserRuleContext {
		public TerminalNode DeleteMarker() { return getToken(TailspinParser.DeleteMarker, 0); }
		public StateIdentifierContext stateIdentifier() {
			return getRuleContext(StateIdentifierContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public DeleteStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteState; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDeleteState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStateContext deleteState() throws RecognitionException {
		DeleteStateContext _localctx = new DeleteStateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_deleteState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(DeleteMarker);
			setState(286);
			stateIdentifier();
			setState(287);
			reference();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public ArrayReferenceContext arrayReference() {
			return getRuleContext(ArrayReferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
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
		enterRule(_localctx, 16, RULE_reference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(289);
				match(LeftParen);
				setState(290);
				arrayReference();
				setState(291);
				match(RightParen);
				}
				break;
			}
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295);
					structureReference();
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public ArrayReferenceContext arrayReference() {
			return getRuleContext(ArrayReferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
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
		enterRule(_localctx, 18, RULE_structureReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(FieldReference);
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(302);
				match(LeftParen);
				setState(303);
				arrayReference();
				setState(304);
				match(RightParen);
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

	public static class ArrayReferenceContext extends ParserRuleContext {
		public List<DimensionReferenceContext> dimensionReference() {
			return getRuleContexts(DimensionReferenceContext.class);
		}
		public DimensionReferenceContext dimensionReference(int i) {
			return getRuleContext(DimensionReferenceContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(TailspinParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(TailspinParser.SemiColon, i);
		}
		public ArrayReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayReferenceContext arrayReference() throws RecognitionException {
		ArrayReferenceContext _localctx = new ArrayReferenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrayReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			dimensionReference();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(309);
				match(SemiColon);
				setState(310);
				dimensionReference();
				}
				}
				setState(315);
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

	public static class DimensionReferenceContext extends ParserRuleContext {
		public SimpleDimensionContext simpleDimension() {
			return getRuleContext(SimpleDimensionContext.class,0);
		}
		public MultiValueDimensionContext multiValueDimension() {
			return getRuleContext(MultiValueDimensionContext.class,0);
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
		enterRule(_localctx, 22, RULE_dimensionReference);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
			case DeleteMarker:
			case LeftParen:
			case First:
			case Last:
			case Range:
			case Plus:
			case Minus:
			case Zero:
			case PositiveInteger:
			case START_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				simpleDimension();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				multiValueDimension();
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

	public static class SimpleDimensionContext extends ParserRuleContext {
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
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
		enterRule(_localctx, 24, RULE_simpleDimension);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				sourceReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				arithmeticExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
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
		enterRule(_localctx, 26, RULE_multiValueDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(LeftBracket);
			setState(326);
			simpleDimension();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(327);
				match(Comma);
				setState(328);
				simpleDimension();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
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

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public List<ValueProductionContext> valueProduction() {
			return getRuleContexts(ValueProductionContext.class);
		}
		public ValueProductionContext valueProduction(int i) {
			return getRuleContext(ValueProductionContext.class,i);
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
		enterRule(_localctx, 28, RULE_arrayLiteral);
		int _la;
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(LeftBracket);
				setState(337);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(LeftBracket);
				setState(339);
				valueProduction();
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(340);
					match(Comma);
					setState(341);
					valueProduction();
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(347);
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
		enterRule(_localctx, 30, RULE_valueProduction);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				sendToTemplates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
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
		public List<KeyValuesContext> keyValues() {
			return getRuleContexts(KeyValuesContext.class);
		}
		public KeyValuesContext keyValues(int i) {
			return getRuleContext(KeyValuesContext.class,i);
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
		enterRule(_localctx, 32, RULE_structureLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(LeftBrace);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (Include - 2)) | (1L << (Def - 2)) | (1L << (When - 2)) | (1L << (Do - 2)) | (1L << (Otherwise - 2)) | (1L << (SourceMarker - 2)) | (1L << (DeleteMarker - 2)) | (1L << (LeftParen - 2)) | (1L << (LeftBracket - 2)) | (1L << (LeftBrace - 2)) | (1L << (StartTemplatesDefinition - 2)) | (1L << (StartSourceDefinition - 2)) | (1L << (StartSinkDefinition - 2)) | (1L << (StartComposerDefinition - 2)) | (1L << (StartProcessorDefinition - 2)) | (1L << (EndDefinition - 2)) | (1L << (Rule - 2)) | (1L << (First - 2)) | (1L << (Last - 2)) | (1L << (Range - 2)) | (1L << (Plus - 2)) | (1L << (Minus - 2)) | (1L << (Mod - 2)) | (1L << (StartTestDefinition - 2)) | (1L << (Assert - 2)) | (1L << (With - 2)) | (1L << (Provided - 2)) | (1L << (Modified - 2)) | (1L << (From - 2)) | (1L << (Use - 2)) | (1L << (Zero - 2)) | (1L << (PositiveInteger - 2)) | (1L << (START_STRING - 2)) | (1L << (IDENTIFIER - 2)))) != 0)) {
				{
				setState(356);
				keyValues();
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(357);
					match(Comma);
					setState(358);
					keyValues();
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(366);
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

	public static class KeyValuesContext extends ParserRuleContext {
		public KeyValueContext keyValue() {
			return getRuleContext(KeyValueContext.class,0);
		}
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public KeyValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValues; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitKeyValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValuesContext keyValues() throws RecognitionException {
		KeyValuesContext _localctx = new KeyValuesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_keyValues);
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				keyValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				valueProduction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				sourceReference();
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
		enterRule(_localctx, 36, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			key();
			setState(374);
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
		enterRule(_localctx, 38, RULE_templates);
		int _la;
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new LiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				source();
				}
				break;
			case 2:
				_localctx = new LambdaTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(Lambda);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (Include - 2)) | (1L << (Def - 2)) | (1L << (When - 2)) | (1L << (Do - 2)) | (1L << (Otherwise - 2)) | (1L << (StartTemplatesDefinition - 2)) | (1L << (StartSourceDefinition - 2)) | (1L << (StartSinkDefinition - 2)) | (1L << (StartComposerDefinition - 2)) | (1L << (StartProcessorDefinition - 2)) | (1L << (EndDefinition - 2)) | (1L << (Rule - 2)) | (1L << (First - 2)) | (1L << (Last - 2)) | (1L << (Mod - 2)) | (1L << (StartTestDefinition - 2)) | (1L << (Assert - 2)) | (1L << (With - 2)) | (1L << (Provided - 2)) | (1L << (Modified - 2)) | (1L << (From - 2)) | (1L << (Use - 2)) | (1L << (IDENTIFIER - 2)))) != 0)) {
					{
					setState(378);
					localIdentifier();
					}
				}

				setState(381);
				match(LeftParen);
				setState(382);
				templatesBody();
				setState(383);
				match(Lambda);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (Include - 2)) | (1L << (Def - 2)) | (1L << (When - 2)) | (1L << (Do - 2)) | (1L << (Otherwise - 2)) | (1L << (StartTemplatesDefinition - 2)) | (1L << (StartSourceDefinition - 2)) | (1L << (StartSinkDefinition - 2)) | (1L << (StartComposerDefinition - 2)) | (1L << (StartProcessorDefinition - 2)) | (1L << (EndDefinition - 2)) | (1L << (Rule - 2)) | (1L << (First - 2)) | (1L << (Last - 2)) | (1L << (Mod - 2)) | (1L << (StartTestDefinition - 2)) | (1L << (Assert - 2)) | (1L << (With - 2)) | (1L << (Provided - 2)) | (1L << (Modified - 2)) | (1L << (From - 2)) | (1L << (Use - 2)) | (1L << (IDENTIFIER - 2)))) != 0)) {
					{
					setState(384);
					localIdentifier();
					}
				}

				setState(387);
				match(RightParen);
				}
				break;
			case 3:
				_localctx = new CallDefinedTransformContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				templatesReference();
				}
				break;
			case 4:
				_localctx = new LambdaArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				match(Lambda);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (Include - 2)) | (1L << (Def - 2)) | (1L << (When - 2)) | (1L << (Do - 2)) | (1L << (Otherwise - 2)) | (1L << (StartTemplatesDefinition - 2)) | (1L << (StartSourceDefinition - 2)) | (1L << (StartSinkDefinition - 2)) | (1L << (StartComposerDefinition - 2)) | (1L << (StartProcessorDefinition - 2)) | (1L << (EndDefinition - 2)) | (1L << (Rule - 2)) | (1L << (First - 2)) | (1L << (Last - 2)) | (1L << (Mod - 2)) | (1L << (StartTestDefinition - 2)) | (1L << (Assert - 2)) | (1L << (With - 2)) | (1L << (Provided - 2)) | (1L << (Modified - 2)) | (1L << (From - 2)) | (1L << (Use - 2)) | (1L << (IDENTIFIER - 2)))) != 0)) {
					{
					setState(391);
					localIdentifier();
					}
				}

				setState(394);
				arrayIndexDecomposition();
				setState(395);
				match(LeftParen);
				setState(396);
				templatesBody();
				setState(397);
				match(Lambda);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (Include - 2)) | (1L << (Def - 2)) | (1L << (When - 2)) | (1L << (Do - 2)) | (1L << (Otherwise - 2)) | (1L << (StartTemplatesDefinition - 2)) | (1L << (StartSourceDefinition - 2)) | (1L << (StartSinkDefinition - 2)) | (1L << (StartComposerDefinition - 2)) | (1L << (StartProcessorDefinition - 2)) | (1L << (EndDefinition - 2)) | (1L << (Rule - 2)) | (1L << (First - 2)) | (1L << (Last - 2)) | (1L << (Mod - 2)) | (1L << (StartTestDefinition - 2)) | (1L << (Assert - 2)) | (1L << (With - 2)) | (1L << (Provided - 2)) | (1L << (Modified - 2)) | (1L << (From - 2)) | (1L << (Use - 2)) | (1L << (IDENTIFIER - 2)))) != 0)) {
					{
					setState(398);
					localIdentifier();
					}
				}

				setState(401);
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
		enterRule(_localctx, 40, RULE_arrayIndexDecomposition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(LeftBracket);
			setState(406);
			localIdentifier();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(407);
				match(SemiColon);
				setState(408);
				localIdentifier();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
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
		enterRule(_localctx, 42, RULE_sink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(ResultMarker);
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
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
			case From:
			case Use:
			case STATE_IDENTIFIER:
			case IDENTIFIER:
				{
				{
				setState(417);
				anyIdentifier();
				setState(418);
				reference();
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(419);
					match(Message);
					}
				}

				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(422);
					parameterValues();
					}
				}

				}
				}
				break;
			case Void:
				{
				setState(425);
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
		enterRule(_localctx, 44, RULE_templatesReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			anyIdentifier();
			setState(429);
			reference();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Message) {
				{
				setState(430);
				match(Message);
				}
			}

			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(433);
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
		enterRule(_localctx, 46, RULE_parameterValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(And);
			setState(437);
			match(LeftBrace);
			setState(442); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(438);
				parameterValue();
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(439);
					match(Comma);
					}
				}

				}
				}
				setState(444); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (Include - 2)) | (1L << (Def - 2)) | (1L << (When - 2)) | (1L << (Do - 2)) | (1L << (Otherwise - 2)) | (1L << (StartTemplatesDefinition - 2)) | (1L << (StartSourceDefinition - 2)) | (1L << (StartSinkDefinition - 2)) | (1L << (StartComposerDefinition - 2)) | (1L << (StartProcessorDefinition - 2)) | (1L << (EndDefinition - 2)) | (1L << (Rule - 2)) | (1L << (First - 2)) | (1L << (Last - 2)) | (1L << (Mod - 2)) | (1L << (StartTestDefinition - 2)) | (1L << (Assert - 2)) | (1L << (With - 2)) | (1L << (Provided - 2)) | (1L << (Modified - 2)) | (1L << (From - 2)) | (1L << (Use - 2)) | (1L << (IDENTIFIER - 2)))) != 0) );
			setState(446);
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
		enterRule(_localctx, 48, RULE_parameterValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			key();
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(449);
				valueChain();
				}
				break;
			case 2:
				{
				setState(450);
				templatesReference();
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
		enterRule(_localctx, 50, RULE_templatesBody);
		int _la;
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				block();
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << When) | (1L << Otherwise) | (1L << StartMatcher))) != 0)) {
					{
					{
					setState(454);
					matchTemplate();
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(461); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(460);
					matchTemplate();
					}
					}
					setState(463); 
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
		enterRule(_localctx, 52, RULE_matchTemplate);
		int _la;
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				matcher();
				setState(468);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==When) {
					{
					setState(470);
					match(When);
					}
				}

				setState(473);
				matcher();
				setState(475);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(474);
					match(Do);
					}
					break;
				}
				setState(477);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				match(Otherwise);
				setState(480);
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
		enterRule(_localctx, 54, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case SourceMarker:
			case DeleteMarker:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
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
			case From:
			case Use:
			case Zero:
			case PositiveInteger:
			case START_STRING:
			case STATE_IDENTIFIER:
			case IDENTIFIER:
				{
				setState(484); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(483);
						blockExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(486); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ResultMarker:
				{
				{
				setState(488);
				match(ResultMarker);
				setState(489);
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
		enterRule(_localctx, 56, RULE_blockExpression);
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				stateAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(494);
				sendToTemplates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
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
		enterRule(_localctx, 58, RULE_resultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			valueChain();
			setState(499);
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
		enterRule(_localctx, 60, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
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
		enterRule(_localctx, 62, RULE_sendToTemplates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			valueChain();
			setState(504);
			match(To);
			setState(505);
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
		enterRule(_localctx, 64, RULE_stateAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(507);
				valueChain();
				setState(508);
				match(To);
				}
				break;
			}
			setState(512);
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
		enterRule(_localctx, 66, RULE_stateSink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Range) {
				{
				setState(514);
				match(Range);
				setState(515);
				match(Else);
				}
			}

			setState(518);
			stateIdentifier();
			setState(519);
			reference();
			setState(520);
			match(Colon);
			setState(521);
			valueProduction();
			setState(522);
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
		public KeyValueContext keyValue() {
			return getRuleContext(KeyValueContext.class,0);
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
		enterRule(_localctx, 68, RULE_valueChain);
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				source();
				setState(526);
				transform();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				keyValue();
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
		enterRule(_localctx, 70, RULE_transform);
		try {
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case To:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				match(To);
				setState(532);
				templates();
				setState(534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(533);
					transform();
					}
					break;
				}
				}
				break;
			case Deconstructor:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				match(Deconstructor);
				setState(538);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(537);
					transform();
					}
					break;
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

	public static class MatcherContext extends ParserRuleContext {
		public TerminalNode StartMatcher() { return getToken(TailspinParser.StartMatcher, 0); }
		public List<CriterionContext> criterion() {
			return getRuleContexts(CriterionContext.class);
		}
		public CriterionContext criterion(int i) {
			return getRuleContext(CriterionContext.class,i);
		}
		public TerminalNode EndMatcher() { return getToken(TailspinParser.EndMatcher, 0); }
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
		enterRule(_localctx, 72, RULE_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(StartMatcher);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(543);
				match(Invert);
				}
			}

			setState(546);
			criterion();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(547);
				match(Else);
				setState(548);
				criterion();
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(554);
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
		enterRule(_localctx, 74, RULE_criterion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				{
				setState(556);
				literalMatch();
				}
				break;
			case SourceMarker:
			case DeleteMarker:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case First:
			case Last:
			case Range:
			case Plus:
			case Minus:
			case Zero:
			case PositiveInteger:
			case START_STRING:
				{
				setState(557);
				typeMatch();
				}
				break;
			case Else:
			case EndMatcher:
			case BeginCondition:
				break;
			default:
				break;
			}
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BeginCondition) {
				{
				{
				setState(560);
				condition();
				}
				}
				setState(565);
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
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
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

	public final TypeMatchContext typeMatch() throws RecognitionException {
		TypeMatchContext _localctx = new TypeMatchContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeMatch);
		int _la;
		try {
			int _alt;
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				rangeBounds();
				}
				break;
			case 2:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				stringLiteral();
				}
				break;
			case 3:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(568);
				match(LeftBrace);
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (Include - 2)) | (1L << (Def - 2)) | (1L << (When - 2)) | (1L << (Do - 2)) | (1L << (Otherwise - 2)) | (1L << (StartTemplatesDefinition - 2)) | (1L << (StartSourceDefinition - 2)) | (1L << (StartSinkDefinition - 2)) | (1L << (StartComposerDefinition - 2)) | (1L << (StartProcessorDefinition - 2)) | (1L << (EndDefinition - 2)) | (1L << (Rule - 2)) | (1L << (First - 2)) | (1L << (Last - 2)) | (1L << (Mod - 2)) | (1L << (StartTestDefinition - 2)) | (1L << (Assert - 2)) | (1L << (With - 2)) | (1L << (Provided - 2)) | (1L << (Modified - 2)) | (1L << (From - 2)) | (1L << (Use - 2)) | (1L << (IDENTIFIER - 2)))) != 0)) {
					{
					{
					setState(569);
					key();
					setState(570);
					structureContentMatcher();
					setState(572);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						setState(571);
						match(Comma);
						}
						break;
					}
					}
					}
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Void || _la==Comma) {
					{
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(579);
						match(Comma);
						}
					}

					setState(582);
					match(Void);
					}
				}

				setState(585);
				match(RightBrace);
				}
				break;
			case 4:
				_localctx = new ArrayMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(586);
				match(LeftBracket);
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==StartMatcher) {
					{
					setState(587);
					arrayContentMatcher();
					}
				}

				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(590);
						match(Comma);
						setState(591);
						arrayContentMatcher();
						}
						} 
					}
					setState(596);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Void || _la==Comma) {
					{
					setState(598);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(597);
						match(Comma);
						}
					}

					setState(600);
					match(Void);
					}
				}

				setState(603);
				match(RightBracket);
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(604);
					match(LeftParen);
					setState(607);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						setState(605);
						rangeBounds();
						}
						break;
					case 2:
						{
						setState(606);
						arithmeticExpression(0);
						}
						break;
					}
					setState(609);
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
		enterRule(_localctx, 78, RULE_structureContentMatcher);
		try {
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartMatcher:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				matcher();
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
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
		enterRule(_localctx, 80, RULE_arrayContentMatcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			matcher();
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Star) | (1L << Question) | (1L << Equal))) != 0)) {
				{
				setState(620);
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
		enterRule(_localctx, 82, RULE_literalMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(Equal);
			setState(624);
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
		enterRule(_localctx, 84, RULE_rangeBounds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SourceMarker) | (1L << DeleteMarker) | (1L << LeftParen) | (1L << First) | (1L << Last) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				setState(626);
				lowerBound();
				}
			}

			setState(629);
			match(Range);
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SourceMarker) | (1L << DeleteMarker) | (1L << Invert) | (1L << LeftParen) | (1L << First) | (1L << Last) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				setState(630);
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
		enterRule(_localctx, 86, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(BeginCondition);
			setState(634);
			valueChain();
			setState(635);
			matcher();
			setState(636);
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
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
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
		enterRule(_localctx, 88, RULE_lowerBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(638);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(639);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(640);
				stringLiteral();
				}
				break;
			}
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(643);
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
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
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
		enterRule(_localctx, 90, RULE_upperBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(646);
				match(Invert);
				}
			}

			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(649);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(650);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(651);
				stringLiteral();
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
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
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
		enterRule(_localctx, 92, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SourceMarker) | (1L << DeleteMarker) | (1L << LeftParen) | (1L << First) | (1L << Last) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				setState(654);
				lowerBound();
				}
			}

			setState(657);
			match(Range);
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(658);
				upperBound();
				}
				break;
			}
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(661);
				match(Colon);
				setState(662);
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
		public NonZeroIntegerContext nonZeroInteger() {
			return getRuleContext(NonZeroIntegerContext.class,0);
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
		enterRule(_localctx, 94, RULE_integerLiteral);
		try {
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				match(Zero);
				}
				break;
			case Plus:
			case Minus:
			case PositiveInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				nonZeroInteger();
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
		enterRule(_localctx, 96, RULE_nonZeroInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(669);
				additiveOperator();
				}
			}

			setState(672);
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
		enterRule(_localctx, 98, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(START_STRING);
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (StartCharacterCode - 69)) | (1L << (StartStringInterpolate - 69)) | (1L << (STRING_TEXT - 69)))) != 0)) {
				{
				{
				setState(675);
				stringContent();
				}
				}
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(681);
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
		enterRule(_localctx, 100, RULE_stringContent);
		try {
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartCharacterCode:
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
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
		enterRule(_localctx, 102, RULE_stringInterpolate);
		try {
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				interpolateEvaluate();
				}
				break;
			case StartCharacterCode:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
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
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
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
		enterRule(_localctx, 104, RULE_characterCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(StartCharacterCode);
			setState(692);
			arithmeticExpression(0);
			setState(693);
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
		enterRule(_localctx, 106, RULE_interpolateEvaluate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(StartStringInterpolate);
			setState(708);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
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
			case From:
			case Use:
			case STATE_IDENTIFIER:
			case IDENTIFIER:
				{
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (Include - 2)) | (1L << (Def - 2)) | (1L << (When - 2)) | (1L << (Do - 2)) | (1L << (Otherwise - 2)) | (1L << (StartTemplatesDefinition - 2)) | (1L << (StartSourceDefinition - 2)) | (1L << (StartSinkDefinition - 2)) | (1L << (StartComposerDefinition - 2)) | (1L << (StartProcessorDefinition - 2)) | (1L << (EndDefinition - 2)) | (1L << (Rule - 2)) | (1L << (First - 2)) | (1L << (Last - 2)) | (1L << (Mod - 2)) | (1L << (StartTestDefinition - 2)) | (1L << (Assert - 2)) | (1L << (With - 2)) | (1L << (Provided - 2)) | (1L << (Modified - 2)) | (1L << (From - 2)) | (1L << (Use - 2)) | (1L << (STATE_IDENTIFIER - 2)) | (1L << (IDENTIFIER - 2)))) != 0)) {
					{
					setState(696);
					anyIdentifier();
					}
				}

				setState(699);
				reference();
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(700);
					match(Message);
					}
				}

				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(703);
					parameterValues();
					}
				}

				}
				break;
			case Colon:
				{
				setState(706);
				match(Colon);
				setState(707);
				source();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(710);
				transform();
				}
				break;
			}
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==To) {
				{
				setState(713);
				match(To);
				setState(714);
				match(TemplateMatch);
				}
			}

			setState(717);
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public DeleteStateContext deleteState() {
			return getRuleContext(DeleteStateContext.class,0);
		}
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public ArithmeticContextKeywordContext arithmeticContextKeyword() {
			return getRuleContext(ArithmeticContextKeywordContext.class,0);
		}
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(720);
				integerLiteral();
				}
				break;
			case 2:
				{
				setState(721);
				match(LeftParen);
				setState(722);
				valueProduction();
				setState(723);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Plus || _la==Minus) {
					{
					setState(725);
					additiveOperator();
					}
				}

				setState(730);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SourceMarker:
					{
					setState(728);
					sourceReference();
					}
					break;
				case DeleteMarker:
					{
					setState(729);
					deleteState();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				{
				setState(732);
				arithmeticContextKeyword();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(745);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(743);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(735);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(736);
						multiplicativeOperator();
						setState(737);
						arithmeticExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(739);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(740);
						additiveOperator();
						setState(741);
						arithmeticExpression(3);
						}
						break;
					}
					} 
				}
				setState(747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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
		enterRule(_localctx, 110, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
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
		enterRule(_localctx, 112, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
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
		enterRule(_localctx, 114, RULE_composerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(752);
				stateAssignment();
				}
				break;
			}
			setState(755);
			compositionSequence();
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Rule) {
				{
				{
				setState(756);
				definedCompositionSequence();
				}
				}
				setState(761);
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
		enterRule(_localctx, 116, RULE_definedCompositionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(Rule);
			setState(763);
			key();
			setState(764);
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
		enterRule(_localctx, 118, RULE_compositionSequence);
		int _la;
		try {
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				compositionComponents();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(767);
					compositionSkipRule();
					}
					}
					setState(770); 
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
		enterRule(_localctx, 120, RULE_compositionComponents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(774);
				compositionSkipRule();
				}
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(780);
			compositionComponent();
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(781);
					match(Comma);
					}
				}

				setState(784);
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
		enterRule(_localctx, 122, RULE_compositionComponent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			compositionMatcher();
			setState(791);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(788);
					compositionSkipRule();
					}
					} 
				}
				setState(793);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
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
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public CompositionKeyValueContext compositionKeyValue() {
			return getRuleContext(CompositionKeyValueContext.class,0);
		}
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public CompositionSequenceContext compositionSequence() {
			return getRuleContext(CompositionSequenceContext.class,0);
		}
		public CompositionSkipRuleContext compositionSkipRule() {
			return getRuleContext(CompositionSkipRuleContext.class,0);
		}
		public StructureMemberMatchersContext structureMemberMatchers() {
			return getRuleContext(StructureMemberMatchersContext.class,0);
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
		enterRule(_localctx, 124, RULE_compositionMatcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(794);
				tokenMatcher();
				}
				break;
			case 2:
				{
				setState(795);
				match(LeftBracket);
				setState(798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(796);
					compositionSequence();
					}
					break;
				case 2:
					{
					setState(797);
					compositionSkipRule();
					}
					break;
				}
				setState(800);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(801);
				match(LeftBrace);
				setState(804);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(802);
					structureMemberMatchers();
					}
					break;
				case 2:
					{
					setState(803);
					compositionSkipRule();
					}
					break;
				}
				setState(806);
				match(RightBrace);
				}
				break;
			case 4:
				{
				setState(807);
				sourceReference();
				}
				break;
			case 5:
				{
				setState(808);
				compositionKeyValue();
				}
				break;
			}
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(811);
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
		enterRule(_localctx, 126, RULE_structureMemberMatchers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(814);
				compositionSkipRule();
				}
				}
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(820);
			structureMemberMatcher();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (Include - 2)) | (1L << (Def - 2)) | (1L << (When - 2)) | (1L << (Do - 2)) | (1L << (Otherwise - 2)) | (1L << (Comma - 2)) | (1L << (LeftParen - 2)) | (1L << (StartMatcher - 2)) | (1L << (StartTemplatesDefinition - 2)) | (1L << (StartSourceDefinition - 2)) | (1L << (StartSinkDefinition - 2)) | (1L << (StartComposerDefinition - 2)) | (1L << (StartProcessorDefinition - 2)) | (1L << (EndDefinition - 2)) | (1L << (Rule - 2)) | (1L << (First - 2)) | (1L << (Last - 2)) | (1L << (Mod - 2)) | (1L << (StartTestDefinition - 2)) | (1L << (Assert - 2)) | (1L << (With - 2)) | (1L << (Provided - 2)) | (1L << (Modified - 2)) | (1L << (From - 2)) | (1L << (Use - 2)) | (1L << (IDENTIFIER - 2)))) != 0)) {
				{
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(821);
					match(Comma);
					}
				}

				setState(824);
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
		enterRule(_localctx, 128, RULE_structureMemberMatcher);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(827);
				tokenMatcher();
				}
				break;
			case 2:
				{
				setState(828);
				compositionKeyValue();
				}
				break;
			}
			setState(834);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(831);
					compositionSkipRule();
					}
					} 
				}
				setState(836);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
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
		enterRule(_localctx, 130, RULE_tokenMatcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(StartMatcher);
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(838);
				match(Invert);
				}
			}

			setState(841);
			compositionToken();
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(842);
				match(Else);
				setState(843);
				compositionToken();
				}
				}
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(849);
			match(EndMatcher);
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(850);
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
		enterRule(_localctx, 132, RULE_compositionToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				{
				setState(853);
				literalComposition();
				}
				break;
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
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
			case From:
			case Use:
			case IDENTIFIER:
				{
				setState(854);
				localIdentifier();
				}
				break;
			case START_STRING:
				{
				setState(855);
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
		public DeleteStateContext deleteState() {
			return getRuleContext(DeleteStateContext.class,0);
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
		enterRule(_localctx, 134, RULE_literalComposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(Equal);
			setState(862);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
				{
				setState(859);
				sourceReference();
				}
				break;
			case DeleteMarker:
				{
				setState(860);
				deleteState();
				}
				break;
			case START_STRING:
				{
				setState(861);
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
		enterRule(_localctx, 136, RULE_multiplier);
		try {
			setState(872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(864);
				match(Plus);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				match(Star);
				}
				break;
			case Question:
				enterOuterAlt(_localctx, 3);
				{
				setState(866);
				match(Question);
				}
				break;
			case Equal:
				enterOuterAlt(_localctx, 4);
				{
				setState(867);
				match(Equal);
				setState(870);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PositiveInteger:
					{
					setState(868);
					match(PositiveInteger);
					}
					break;
				case SourceMarker:
					{
					setState(869);
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
		enterRule(_localctx, 138, RULE_compositionSkipRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(LeftParen);
			setState(876); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(875);
				compositionCapture();
				}
				}
				setState(878); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (Include - 2)) | (1L << (Def - 2)) | (1L << (When - 2)) | (1L << (Do - 2)) | (1L << (Otherwise - 2)) | (1L << (SourceMarker - 2)) | (1L << (DeleteMarker - 2)) | (1L << (LeftParen - 2)) | (1L << (LeftBracket - 2)) | (1L << (LeftBrace - 2)) | (1L << (StartMatcher - 2)) | (1L << (StartTemplatesDefinition - 2)) | (1L << (StartSourceDefinition - 2)) | (1L << (StartSinkDefinition - 2)) | (1L << (StartComposerDefinition - 2)) | (1L << (StartProcessorDefinition - 2)) | (1L << (EndDefinition - 2)) | (1L << (Rule - 2)) | (1L << (First - 2)) | (1L << (Last - 2)) | (1L << (Range - 2)) | (1L << (Plus - 2)) | (1L << (Minus - 2)) | (1L << (Mod - 2)) | (1L << (StartTestDefinition - 2)) | (1L << (Assert - 2)) | (1L << (With - 2)) | (1L << (Provided - 2)) | (1L << (Modified - 2)) | (1L << (From - 2)) | (1L << (Use - 2)) | (1L << (Zero - 2)) | (1L << (PositiveInteger - 2)) | (1L << (START_STRING - 2)) | (1L << (STATE_IDENTIFIER - 2)) | (1L << (IDENTIFIER - 2)))) != 0) );
			setState(880);
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
		enterRule(_localctx, 140, RULE_compositionCapture);
		int _la;
		try {
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(882);
				match(Def);
				setState(883);
				key();
				setState(884);
				compositionMatcher();
				setState(885);
				match(SemiColon);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(887);
				compositionMatcher();
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To) {
					{
					setState(888);
					match(To);
					setState(889);
					stateSink();
					}
				}

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(892);
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
		enterRule(_localctx, 142, RULE_compositionKeyValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
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
			case From:
			case Use:
			case IDENTIFIER:
				{
				setState(895);
				key();
				}
				break;
			case StartMatcher:
				{
				setState(896);
				compositionKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(899);
				compositionSkipRule();
				}
				}
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(905);
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
		enterRule(_localctx, 144, RULE_compositionKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			tokenMatcher();
			setState(908);
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
		enterRule(_localctx, 146, RULE_localIdentifier);
		try {
			setState(912);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(910);
				match(IDENTIFIER);
				}
				break;
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
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
			case From:
			case Use:
				enterOuterAlt(_localctx, 2);
				{
				setState(911);
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
		enterRule(_localctx, 148, RULE_stateIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
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
		enterRule(_localctx, 150, RULE_externalIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			localIdentifier();
			setState(919); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(917);
					match(Slash);
					setState(918);
					localIdentifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(921); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
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
		enterRule(_localctx, 152, RULE_anyIdentifier);
		try {
			setState(926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				stateIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(924);
				localIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(925);
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
		enterRule(_localctx, 154, RULE_arithmeticContextKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
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
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
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
		public TerminalNode From() { return getToken(TailspinParser.From, 0); }
		public TerminalNode Use() { return getToken(TailspinParser.Use, 0); }
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
		enterRule(_localctx, 156, RULE_keyword);
		try {
			setState(951);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
				enterOuterAlt(_localctx, 1);
				{
				setState(930);
				match(Include);
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
				match(Def);
				}
				break;
			case StartTemplatesDefinition:
				enterOuterAlt(_localctx, 3);
				{
				setState(932);
				match(StartTemplatesDefinition);
				}
				break;
			case StartSourceDefinition:
				enterOuterAlt(_localctx, 4);
				{
				setState(933);
				match(StartSourceDefinition);
				}
				break;
			case StartSinkDefinition:
				enterOuterAlt(_localctx, 5);
				{
				setState(934);
				match(StartSinkDefinition);
				}
				break;
			case StartComposerDefinition:
				enterOuterAlt(_localctx, 6);
				{
				setState(935);
				match(StartComposerDefinition);
				}
				break;
			case StartProcessorDefinition:
				enterOuterAlt(_localctx, 7);
				{
				setState(936);
				match(StartProcessorDefinition);
				}
				break;
			case EndDefinition:
				enterOuterAlt(_localctx, 8);
				{
				setState(937);
				match(EndDefinition);
				}
				break;
			case Mod:
				enterOuterAlt(_localctx, 9);
				{
				setState(938);
				match(Mod);
				}
				break;
			case Rule:
				enterOuterAlt(_localctx, 10);
				{
				setState(939);
				match(Rule);
				}
				break;
			case When:
				enterOuterAlt(_localctx, 11);
				{
				setState(940);
				match(When);
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 12);
				{
				setState(941);
				match(Do);
				}
				break;
			case Otherwise:
				enterOuterAlt(_localctx, 13);
				{
				setState(942);
				match(Otherwise);
				}
				break;
			case First:
			case Last:
				enterOuterAlt(_localctx, 14);
				{
				setState(943);
				arithmeticContextKeyword();
				}
				break;
			case StartTestDefinition:
				enterOuterAlt(_localctx, 15);
				{
				setState(944);
				match(StartTestDefinition);
				}
				break;
			case Assert:
				enterOuterAlt(_localctx, 16);
				{
				setState(945);
				match(Assert);
				}
				break;
			case With:
				enterOuterAlt(_localctx, 17);
				{
				setState(946);
				match(With);
				}
				break;
			case Provided:
				enterOuterAlt(_localctx, 18);
				{
				setState(947);
				match(Provided);
				}
				break;
			case Modified:
				enterOuterAlt(_localctx, 19);
				{
				setState(948);
				match(Modified);
				}
				break;
			case From:
				enterOuterAlt(_localctx, 20);
				{
				setState(949);
				match(From);
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 21);
				{
				setState(950);
				match(Use);
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
		enterRule(_localctx, 158, RULE_testBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(954); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(953);
					testBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(956); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
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
		enterRule(_localctx, 160, RULE_testBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(958);
					statement();
					}
					} 
				}
				setState(963);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			setState(965); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(964);
					assertion();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(967); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
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
		enterRule(_localctx, 162, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(Assert);
			setState(970);
			valueChain();
			setState(971);
			matcher();
			setState(972);
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
		enterRule(_localctx, 164, RULE_dependencyProvision);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(With);
			setState(976); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(975);
					moduleConfiguration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(978); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(980);
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
	public static class ModuleModificationContext extends ModuleConfigurationContext {
		public TerminalNode Modified() { return getToken(TailspinParser.Modified, 0); }
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public List<ModuleIdentifierContext> moduleIdentifier() {
			return getRuleContexts(ModuleIdentifierContext.class);
		}
		public ModuleIdentifierContext moduleIdentifier(int i) {
			return getRuleContext(ModuleIdentifierContext.class,i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode From() { return getToken(TailspinParser.From, 0); }
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
	public static class ModuleImportContext extends ModuleConfigurationContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode StandAlone() { return getToken(TailspinParser.StandAlone, 0); }
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
		enterRule(_localctx, 166, RULE_moduleConfiguration);
		int _la;
		try {
			int _alt;
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				_localctx = new ModuleModificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				match(Modified);
				setState(984);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(983);
					moduleIdentifier();
					}
					break;
				}
				setState(987);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(986);
					match(From);
					}
					break;
				}
				setState(990);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(989);
					stringLiteral();
					}
					break;
				}
				setState(993); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(992);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(995); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(997);
				match(EndDefinition);
				setState(1000);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Include:
				case Def:
				case When:
				case Do:
				case Otherwise:
				case StartTemplatesDefinition:
				case StartSourceDefinition:
				case StartSinkDefinition:
				case StartComposerDefinition:
				case StartProcessorDefinition:
				case EndDefinition:
				case Rule:
				case First:
				case Last:
				case Mod:
				case StartTestDefinition:
				case Assert:
				case CoreSystem:
				case With:
				case Provided:
				case Modified:
				case From:
				case Use:
				case IDENTIFIER:
					{
					setState(998);
					moduleIdentifier();
					}
					break;
				case START_STRING:
					{
					setState(999);
					stringLiteral();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new ModuleImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (Include - 2)) | (1L << (Def - 2)) | (1L << (When - 2)) | (1L << (Do - 2)) | (1L << (Otherwise - 2)) | (1L << (StartTemplatesDefinition - 2)) | (1L << (StartSourceDefinition - 2)) | (1L << (StartSinkDefinition - 2)) | (1L << (StartComposerDefinition - 2)) | (1L << (StartProcessorDefinition - 2)) | (1L << (EndDefinition - 2)) | (1L << (Rule - 2)) | (1L << (First - 2)) | (1L << (Last - 2)) | (1L << (Mod - 2)) | (1L << (StartTestDefinition - 2)) | (1L << (Assert - 2)) | (1L << (CoreSystem - 2)) | (1L << (With - 2)) | (1L << (Provided - 2)) | (1L << (Modified - 2)) | (1L << (From - 2)) | (1L << (Use - 2)) | (1L << (IDENTIFIER - 2)))) != 0)) {
					{
					setState(1002);
					moduleIdentifier();
					setState(1003);
					match(From);
					}
				}

				setState(1007);
				stringLiteral();
				setState(1008);
				match(StandAlone);
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
		enterRule(_localctx, 168, RULE_moduleIdentifier);
		try {
			setState(1014);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CoreSystem:
				enterOuterAlt(_localctx, 1);
				{
				setState(1012);
				match(CoreSystem);
				}
				break;
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
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
			case From:
			case Use:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
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
		enterRule(_localctx, 170, RULE_useModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			match(Use);
			setState(1017);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 54:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u03fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\7\2\u00b0\n\2\f\2\16\2\u00b3\13\2\3\2\7\2\u00b6"+
		"\n\2\f\2\16\2\u00b9\13\2\3\2\3\2\7\2\u00bd\n\2\f\2\16\2\u00c0\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d3"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00dc\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u00e5\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00ee\n\4\f\4\16\4"+
		"\u00f1\13\4\3\4\3\4\3\4\3\4\5\4\u00f7\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\5\6\u0100\n\6\6\6\u0102\n\6\r\6\16\6\u0103\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0113\n\7\3\b\3\b\5\b\u0117\n\b\3\b\3\b"+
		"\5\b\u011b\n\b\3\b\5\b\u011e\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0128"+
		"\n\n\3\n\7\n\u012b\n\n\f\n\16\n\u012e\13\n\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0135\n\13\3\f\3\f\3\f\7\f\u013a\n\f\f\f\16\f\u013d\13\f\3\r\3\r\5"+
		"\r\u0141\n\r\3\16\3\16\3\16\5\16\u0146\n\16\3\17\3\17\3\17\3\17\7\17\u014c"+
		"\n\17\f\17\16\17\u014f\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7"+
		"\20\u0159\n\20\f\20\16\20\u015c\13\20\3\20\3\20\5\20\u0160\n\20\3\21\3"+
		"\21\5\21\u0164\n\21\3\22\3\22\3\22\3\22\7\22\u016a\n\22\f\22\16\22\u016d"+
		"\13\22\5\22\u016f\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u0176\n\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\5\25\u017e\n\25\3\25\3\25\3\25\3\25\5\25\u0184"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u018b\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0192\n\25\3\25\3\25\5\25\u0196\n\25\3\26\3\26\3\26\3\26\7\26\u019c"+
		"\n\26\f\26\16\26\u019f\13\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u01a7"+
		"\n\27\3\27\5\27\u01aa\n\27\3\27\5\27\u01ad\n\27\3\30\3\30\3\30\5\30\u01b2"+
		"\n\30\3\30\5\30\u01b5\n\30\3\31\3\31\3\31\3\31\5\31\u01bb\n\31\6\31\u01bd"+
		"\n\31\r\31\16\31\u01be\3\31\3\31\3\32\3\32\3\32\5\32\u01c6\n\32\3\33\3"+
		"\33\7\33\u01ca\n\33\f\33\16\33\u01cd\13\33\3\33\6\33\u01d0\n\33\r\33\16"+
		"\33\u01d1\5\33\u01d4\n\33\3\34\3\34\3\34\3\34\5\34\u01da\n\34\3\34\3\34"+
		"\5\34\u01de\n\34\3\34\3\34\3\34\3\34\5\34\u01e4\n\34\3\35\6\35\u01e7\n"+
		"\35\r\35\16\35\u01e8\3\35\3\35\5\35\u01ed\n\35\3\36\3\36\3\36\3\36\5\36"+
		"\u01f3\n\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\5\"\u0201\n\""+
		"\3\"\3\"\3#\3#\5#\u0207\n#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\5$\u0214\n"+
		"$\3%\3%\3%\5%\u0219\n%\3%\3%\5%\u021d\n%\5%\u021f\n%\3&\3&\5&\u0223\n"+
		"&\3&\3&\3&\7&\u0228\n&\f&\16&\u022b\13&\3&\3&\3\'\3\'\5\'\u0231\n\'\3"+
		"\'\7\'\u0234\n\'\f\'\16\'\u0237\13\'\3(\3(\3(\3(\3(\3(\5(\u023f\n(\7("+
		"\u0241\n(\f(\16(\u0244\13(\3(\5(\u0247\n(\3(\5(\u024a\n(\3(\3(\3(\5(\u024f"+
		"\n(\3(\3(\7(\u0253\n(\f(\16(\u0256\13(\3(\5(\u0259\n(\3(\5(\u025c\n(\3"+
		"(\3(\3(\3(\5(\u0262\n(\3(\3(\5(\u0266\n(\5(\u0268\n(\3)\3)\5)\u026c\n"+
		")\3*\3*\5*\u0270\n*\3+\3+\3+\3,\5,\u0276\n,\3,\3,\5,\u027a\n,\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\5.\u0284\n.\3.\5.\u0287\n.\3/\5/\u028a\n/\3/\3/\3/\5"+
		"/\u028f\n/\3\60\5\60\u0292\n\60\3\60\3\60\5\60\u0296\n\60\3\60\3\60\5"+
		"\60\u029a\n\60\3\61\3\61\5\61\u029e\n\61\3\62\5\62\u02a1\n\62\3\62\3\62"+
		"\3\63\3\63\7\63\u02a7\n\63\f\63\16\63\u02aa\13\63\3\63\3\63\3\64\3\64"+
		"\5\64\u02b0\n\64\3\65\3\65\5\65\u02b4\n\65\3\66\3\66\3\66\3\66\3\67\3"+
		"\67\5\67\u02bc\n\67\3\67\3\67\5\67\u02c0\n\67\3\67\5\67\u02c3\n\67\3\67"+
		"\3\67\5\67\u02c7\n\67\3\67\5\67\u02ca\n\67\3\67\3\67\5\67\u02ce\n\67\3"+
		"\67\3\67\38\38\38\38\38\38\38\58\u02d9\n8\38\38\58\u02dd\n8\38\58\u02e0"+
		"\n8\38\38\38\38\38\38\38\38\78\u02ea\n8\f8\168\u02ed\138\39\39\3:\3:\3"+
		";\5;\u02f4\n;\3;\3;\7;\u02f8\n;\f;\16;\u02fb\13;\3<\3<\3<\3<\3=\3=\6="+
		"\u0303\n=\r=\16=\u0304\5=\u0307\n=\3>\7>\u030a\n>\f>\16>\u030d\13>\3>"+
		"\3>\5>\u0311\n>\3>\5>\u0314\n>\3?\3?\7?\u0318\n?\f?\16?\u031b\13?\3@\3"+
		"@\3@\3@\5@\u0321\n@\3@\3@\3@\3@\5@\u0327\n@\3@\3@\3@\5@\u032c\n@\3@\5"+
		"@\u032f\n@\3A\7A\u0332\nA\fA\16A\u0335\13A\3A\3A\5A\u0339\nA\3A\5A\u033c"+
		"\nA\3B\3B\5B\u0340\nB\3B\7B\u0343\nB\fB\16B\u0346\13B\3C\3C\5C\u034a\n"+
		"C\3C\3C\3C\7C\u034f\nC\fC\16C\u0352\13C\3C\3C\5C\u0356\nC\3D\3D\3D\5D"+
		"\u035b\nD\3E\3E\3E\3E\5E\u0361\nE\3F\3F\3F\3F\3F\3F\5F\u0369\nF\5F\u036b"+
		"\nF\3G\3G\6G\u036f\nG\rG\16G\u0370\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\5H\u037d"+
		"\nH\3H\5H\u0380\nH\3I\3I\5I\u0384\nI\3I\7I\u0387\nI\fI\16I\u038a\13I\3"+
		"I\3I\3J\3J\3J\3K\3K\5K\u0393\nK\3L\3L\3M\3M\3M\6M\u039a\nM\rM\16M\u039b"+
		"\3N\3N\3N\5N\u03a1\nN\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\3P\5P\u03ba\nP\3Q\6Q\u03bd\nQ\rQ\16Q\u03be\3R\7R\u03c2"+
		"\nR\fR\16R\u03c5\13R\3R\6R\u03c8\nR\rR\16R\u03c9\3S\3S\3S\3S\3S\3T\3T"+
		"\6T\u03d3\nT\rT\16T\u03d4\3T\3T\3U\3U\5U\u03db\nU\3U\5U\u03de\nU\3U\5"+
		"U\u03e1\nU\3U\6U\u03e4\nU\rU\16U\u03e5\3U\3U\3U\5U\u03eb\nU\3U\3U\3U\5"+
		"U\u03f0\nU\3U\3U\3U\5U\u03f5\nU\3V\3V\5V\u03f9\nV\3W\3W\3W\3W\2\3nX\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\2\6\3\2 \"\3\2+,\3\2-/\3\2\'(\2\u046d\2\u00b1\3\2\2"+
		"\2\4\u00c3\3\2\2\2\6\u00f6\3\2\2\2\b\u00f8\3\2\2\2\n\u00fb\3\2\2\2\f\u0112"+
		"\3\2\2\2\16\u0114\3\2\2\2\20\u011f\3\2\2\2\22\u0127\3\2\2\2\24\u012f\3"+
		"\2\2\2\26\u0136\3\2\2\2\30\u0140\3\2\2\2\32\u0145\3\2\2\2\34\u0147\3\2"+
		"\2\2\36\u015f\3\2\2\2 \u0163\3\2\2\2\"\u0165\3\2\2\2$\u0175\3\2\2\2&\u0177"+
		"\3\2\2\2(\u0195\3\2\2\2*\u0197\3\2\2\2,\u01a2\3\2\2\2.\u01ae\3\2\2\2\60"+
		"\u01b6\3\2\2\2\62\u01c2\3\2\2\2\64\u01d3\3\2\2\2\66\u01e3\3\2\2\28\u01ec"+
		"\3\2\2\2:\u01f2\3\2\2\2<\u01f4\3\2\2\2>\u01f7\3\2\2\2@\u01f9\3\2\2\2B"+
		"\u0200\3\2\2\2D\u0206\3\2\2\2F\u0213\3\2\2\2H\u021e\3\2\2\2J\u0220\3\2"+
		"\2\2L\u0230\3\2\2\2N\u0267\3\2\2\2P\u026b\3\2\2\2R\u026d\3\2\2\2T\u0271"+
		"\3\2\2\2V\u0275\3\2\2\2X\u027b\3\2\2\2Z\u0283\3\2\2\2\\\u0289\3\2\2\2"+
		"^\u0291\3\2\2\2`\u029d\3\2\2\2b\u02a0\3\2\2\2d\u02a4\3\2\2\2f\u02af\3"+
		"\2\2\2h\u02b3\3\2\2\2j\u02b5\3\2\2\2l\u02b9\3\2\2\2n\u02df\3\2\2\2p\u02ee"+
		"\3\2\2\2r\u02f0\3\2\2\2t\u02f3\3\2\2\2v\u02fc\3\2\2\2x\u0306\3\2\2\2z"+
		"\u030b\3\2\2\2|\u0315\3\2\2\2~\u032b\3\2\2\2\u0080\u0333\3\2\2\2\u0082"+
		"\u033f\3\2\2\2\u0084\u0347\3\2\2\2\u0086\u035a\3\2\2\2\u0088\u035c\3\2"+
		"\2\2\u008a\u036a\3\2\2\2\u008c\u036c\3\2\2\2\u008e\u037f\3\2\2\2\u0090"+
		"\u0383\3\2\2\2\u0092\u038d\3\2\2\2\u0094\u0392\3\2\2\2\u0096\u0394\3\2"+
		"\2\2\u0098\u0396\3\2\2\2\u009a\u03a0\3\2\2\2\u009c\u03a2\3\2\2\2\u009e"+
		"\u03b9\3\2\2\2\u00a0\u03bc\3\2\2\2\u00a2\u03c3\3\2\2\2\u00a4\u03cb\3\2"+
		"\2\2\u00a6\u03d0\3\2\2\2\u00a8\u03f4\3\2\2\2\u00aa\u03f8\3\2\2\2\u00ac"+
		"\u03fa\3\2\2\2\u00ae\u00b0\5\u00acW\2\u00af\u00ae\3\2\2\2\u00b0\u00b3"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b7\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b6\5\4\3\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00be\5\6\4\2\u00bb\u00bd\5\6\4\2\u00bc\u00bb\3\2"+
		"\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\2\2\3\u00c2\3\3\2\2\2"+
		"\u00c3\u00c4\7\4\2\2\u00c4\u00c5\5d\63\2\u00c5\5\3\2\2\2\u00c6\u00c7\7"+
		"\6\2\2\u00c7\u00c8\5\b\5\2\u00c8\u00c9\5 \21\2\u00c9\u00ca\7\24\2\2\u00ca"+
		"\u00f7\3\2\2\2\u00cb\u00cc\5F$\2\u00cc\u00cd\7\n\2\2\u00cd\u00ce\5,\27"+
		"\2\u00ce\u00f7\3\2\2\2\u00cf\u00d0\t\2\2\2\u00d0\u00d2\5\u0094K\2\u00d1"+
		"\u00d3\5\n\6\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\5\64\33\2\u00d5\u00d6\7%\2\2\u00d6\u00d7\5\u0094K\2\u00d7"+
		"\u00f7\3\2\2\2\u00d8\u00d9\7$\2\2\u00d9\u00db\5\u0094K\2\u00da\u00dc\5"+
		"\n\6\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\58\35\2\u00de\u00df\7%\2\2\u00df\u00e0\5\u0094K\2\u00e0\u00f7\3"+
		"\2\2\2\u00e1\u00e2\7#\2\2\u00e2\u00e4\5\u0094K\2\u00e3\u00e5\5\n\6\2\u00e4"+
		"\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\5t"+
		";\2\u00e7\u00e8\7%\2\2\u00e8\u00e9\5\u0094K\2\u00e9\u00f7\3\2\2\2\u00ea"+
		"\u00eb\7\65\2\2\u00eb\u00ef\5d\63\2\u00ec\u00ee\5\u00acW\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\5\u00a0Q\2\u00f3\u00f4"+
		"\7%\2\2\u00f4\u00f5\5d\63\2\u00f5\u00f7\3\2\2\2\u00f6\u00c6\3\2\2\2\u00f6"+
		"\u00cb\3\2\2\2\u00f6\u00cf\3\2\2\2\u00f6\u00d8\3\2\2\2\u00f6\u00e1\3\2"+
		"\2\2\u00f6\u00ea\3\2\2\2\u00f7\7\3\2\2\2\u00f8\u00f9\5\u0094K\2\u00f9"+
		"\u00fa\7\20\2\2\u00fa\t\3\2\2\2\u00fb\u00fc\7\16\2\2\u00fc\u0101\7\34"+
		"\2\2\u00fd\u00ff\5\b\5\2\u00fe\u0100\7\25\2\2\u00ff\u00fe\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00fd\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\7\35\2\2\u0106\13\3\2\2\2\u0107\u0113\5\16\b\2\u0108\u0113\5\20"+
		"\t\2\u0109\u0113\5d\63\2\u010a\u0113\5^\60\2\u010b\u0113\5\36\20\2\u010c"+
		"\u0113\5\"\22\2\u010d\u010e\7\30\2\2\u010e\u010f\5&\24\2\u010f\u0110\7"+
		"\31\2\2\u0110\u0113\3\2\2\2\u0111\u0113\5n8\2\u0112\u0107\3\2\2\2\u0112"+
		"\u0108\3\2\2\2\u0112\u0109\3\2\2\2\u0112\u010a\3\2\2\2\u0112\u010b\3\2"+
		"\2\2\u0112\u010c\3\2\2\2\u0112\u010d\3\2\2\2\u0112\u0111\3\2\2\2\u0113"+
		"\r\3\2\2\2\u0114\u0116\7\f\2\2\u0115\u0117\5\u009aN\2\u0116\u0115\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\5\22\n\2\u0119"+
		"\u011b\7\21\2\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3"+
		"\2\2\2\u011c\u011e\5\60\31\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\17\3\2\2\2\u011f\u0120\7\r\2\2\u0120\u0121\5\u0096L\2\u0121\u0122\5\22"+
		"\n\2\u0122\21\3\2\2\2\u0123\u0124\7\30\2\2\u0124\u0125\5\26\f\2\u0125"+
		"\u0126\7\31\2\2\u0126\u0128\3\2\2\2\u0127\u0123\3\2\2\2\u0127\u0128\3"+
		"\2\2\2\u0128\u012c\3\2\2\2\u0129\u012b\5\24\13\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\23\3\2\2"+
		"\2\u012e\u012c\3\2\2\2\u012f\u0134\7\22\2\2\u0130\u0131\7\30\2\2\u0131"+
		"\u0132\5\26\f\2\u0132\u0133\7\31\2\2\u0133\u0135\3\2\2\2\u0134\u0130\3"+
		"\2\2\2\u0134\u0135\3\2\2\2\u0135\25\3\2\2\2\u0136\u013b\5\30\r\2\u0137"+
		"\u0138\7\24\2\2\u0138\u013a\5\30\r\2\u0139\u0137\3\2\2\2\u013a\u013d\3"+
		"\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\27\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013e\u0141\5\32\16\2\u013f\u0141\5\34\17\2\u0140\u013e"+
		"\3\2\2\2\u0140\u013f\3\2\2\2\u0141\31\3\2\2\2\u0142\u0146\5\16\b\2\u0143"+
		"\u0146\5n8\2\u0144\u0146\5^\60\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2\2"+
		"\2\u0145\u0144\3\2\2\2\u0146\33\3\2\2\2\u0147\u0148\7\32\2\2\u0148\u014d"+
		"\5\32\16\2\u0149\u014a\7\25\2\2\u014a\u014c\5\32\16\2\u014b\u0149\3\2"+
		"\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7\33\2\2\u0151\35\3\2\2"+
		"\2\u0152\u0153\7\32\2\2\u0153\u0160\7\33\2\2\u0154\u0155\7\32\2\2\u0155"+
		"\u015a\5 \21\2\u0156\u0157\7\25\2\2\u0157\u0159\5 \21\2\u0158\u0156\3"+
		"\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7\33\2\2\u015e\u0160\3"+
		"\2\2\2\u015f\u0152\3\2\2\2\u015f\u0154\3\2\2\2\u0160\37\3\2\2\2\u0161"+
		"\u0164\5@!\2\u0162\u0164\5F$\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2"+
		"\u0164!\3\2\2\2\u0165\u016e\7\34\2\2\u0166\u016b\5$\23\2\u0167\u0168\7"+
		"\25\2\2\u0168\u016a\5$\23\2\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016e\u0166\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\7\35\2\2\u0171#\3\2\2\2\u0172\u0176\5&\24\2\u0173\u0176\5 \21\2"+
		"\u0174\u0176\5\16\b\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0174"+
		"\3\2\2\2\u0176%\3\2\2\2\u0177\u0178\5\b\5\2\u0178\u0179\5 \21\2\u0179"+
		"\'\3\2\2\2\u017a\u0196\5\f\7\2\u017b\u017d\7\37\2\2\u017c\u017e\5\u0094"+
		"K\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0180\7\30\2\2\u0180\u0181\5\64\33\2\u0181\u0183\7\37\2\2\u0182\u0184"+
		"\5\u0094K\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2"+
		"\2\u0185\u0186\7\31\2\2\u0186\u0196\3\2\2\2\u0187\u0196\5.\30\2\u0188"+
		"\u018a\7\37\2\2\u0189\u018b\5\u0094K\2\u018a\u0189\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\5*\26\2\u018d\u018e\7\30\2\2"+
		"\u018e\u018f\5\64\33\2\u018f\u0191\7\37\2\2\u0190\u0192\5\u0094K\2\u0191"+
		"\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\7\31"+
		"\2\2\u0194\u0196\3\2\2\2\u0195\u017a\3\2\2\2\u0195\u017b\3\2\2\2\u0195"+
		"\u0187\3\2\2\2\u0195\u0188\3\2\2\2\u0196)\3\2\2\2\u0197\u0198\7\32\2\2"+
		"\u0198\u019d\5\u0094K\2\u0199\u019a\7\24\2\2\u019a\u019c\5\u0094K\2\u019b"+
		"\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7\33\2\2\u01a1"+
		"+\3\2\2\2\u01a2\u01ac\7\13\2\2\u01a3\u01a4\5\u009aN\2\u01a4\u01a6\5\22"+
		"\n\2\u01a5\u01a7\7\21\2\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a9\3\2\2\2\u01a8\u01aa\5\60\31\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3"+
		"\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01ad\7\5\2\2\u01ac\u01a3\3\2\2\2\u01ac"+
		"\u01ab\3\2\2\2\u01ad-\3\2\2\2\u01ae\u01af\5\u009aN\2\u01af\u01b1\5\22"+
		"\n\2\u01b0\u01b2\7\21\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b4\3\2\2\2\u01b3\u01b5\5\60\31\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3"+
		"\2\2\2\u01b5/\3\2\2\2\u01b6\u01b7\7\16\2\2\u01b7\u01bc\7\34\2\2\u01b8"+
		"\u01ba\5\62\32\2\u01b9\u01bb\7\25\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01b8\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\7\35"+
		"\2\2\u01c1\61\3\2\2\2\u01c2\u01c5\5\b\5\2\u01c3\u01c6\5F$\2\u01c4\u01c6"+
		"\5.\30\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6\63\3\2\2\2\u01c7"+
		"\u01cb\58\35\2\u01c8\u01ca\5\66\34\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd\3"+
		"\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d4\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01ce\u01d0\5\66\34\2\u01cf\u01ce\3\2\2\2\u01d0\u01d1\3"+
		"\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3"+
		"\u01c7\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d4\65\3\2\2\2\u01d5\u01d6\5J&\2"+
		"\u01d6\u01d7\58\35\2\u01d7\u01e4\3\2\2\2\u01d8\u01da\7\7\2\2\u01d9\u01d8"+
		"\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\5J&\2\u01dc"+
		"\u01de\7\b\2\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e0\58\35\2\u01e0\u01e4\3\2\2\2\u01e1\u01e2\7\t\2\2\u01e2"+
		"\u01e4\58\35\2\u01e3\u01d5\3\2\2\2\u01e3\u01d9\3\2\2\2\u01e3\u01e1\3\2"+
		"\2\2\u01e4\67\3\2\2\2\u01e5\u01e7\5:\36\2\u01e6\u01e5\3\2\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ed\3\2\2\2\u01ea"+
		"\u01eb\7\13\2\2\u01eb\u01ed\7\5\2\2\u01ec\u01e6\3\2\2\2\u01ec\u01ea\3"+
		"\2\2\2\u01ed9\3\2\2\2\u01ee\u01f3\5> \2\u01ef\u01f3\5B\"\2\u01f0\u01f3"+
		"\5@!\2\u01f1\u01f3\5<\37\2\u01f2\u01ee\3\2\2\2\u01f2\u01ef\3\2\2\2\u01f2"+
		"\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3;\3\2\2\2\u01f4\u01f5\5F$\2\u01f5"+
		"\u01f6\7\13\2\2\u01f6=\3\2\2\2\u01f7\u01f8\5\6\4\2\u01f8?\3\2\2\2\u01f9"+
		"\u01fa\5F$\2\u01fa\u01fb\7\n\2\2\u01fb\u01fc\7)\2\2\u01fcA\3\2\2\2\u01fd"+
		"\u01fe\5F$\2\u01fe\u01ff\7\n\2\2\u01ff\u0201\3\2\2\2\u0200\u01fd\3\2\2"+
		"\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\5D#\2\u0203C\3"+
		"\2\2\2\u0204\u0205\7*\2\2\u0205\u0207\7\62\2\2\u0206\u0204\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\5\u0096L\2\u0209\u020a"+
		"\5\22\n\2\u020a\u020b\7\20\2\2\u020b\u020c\5 \21\2\u020c\u020d\7\24\2"+
		"\2\u020dE\3\2\2\2\u020e\u0214\5\f\7\2\u020f\u0210\5\f\7\2\u0210\u0211"+
		"\5H%\2\u0211\u0214\3\2\2\2\u0212\u0214\5&\24\2\u0213\u020e\3\2\2\2\u0213"+
		"\u020f\3\2\2\2\u0213\u0212\3\2\2\2\u0214G\3\2\2\2\u0215\u0216\7\n\2\2"+
		"\u0216\u0218\5(\25\2\u0217\u0219\5H%\2\u0218\u0217\3\2\2\2\u0218\u0219"+
		"\3\2\2\2\u0219\u021f\3\2\2\2\u021a\u021c\7\26\2\2\u021b\u021d\5H%\2\u021c"+
		"\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u0215\3\2"+
		"\2\2\u021e\u021a\3\2\2\2\u021fI\3\2\2\2\u0220\u0222\7\36\2\2\u0221\u0223"+
		"\7\27\2\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2"+
		"\u0224\u0229\5L\'\2\u0225\u0226\7\62\2\2\u0226\u0228\5L\'\2\u0227\u0225"+
		"\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d\7\63\2\2\u022dK\3\2\2\2"+
		"\u022e\u0231\5T+\2\u022f\u0231\5N(\2\u0230\u022e\3\2\2\2\u0230\u022f\3"+
		"\2\2\2\u0230\u0231\3\2\2\2\u0231\u0235\3\2\2\2\u0232\u0234\5X-\2\u0233"+
		"\u0232\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2"+
		"\2\2\u0236M\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u0268\5V,\2\u0239\u0268"+
		"\5d\63\2\u023a\u0242\7\34\2\2\u023b\u023c\5\b\5\2\u023c\u023e\5P)\2\u023d"+
		"\u023f\7\25\2\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3"+
		"\2\2\2\u0240\u023b\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0249\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0247\7\25"+
		"\2\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u024a\7\5\2\2\u0249\u0246\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2"+
		"\2\2\u024b\u0268\7\35\2\2\u024c\u024e\7\32\2\2\u024d\u024f\5R*\2\u024e"+
		"\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0254\3\2\2\2\u0250\u0251\7\25"+
		"\2\2\u0251\u0253\5R*\2\u0252\u0250\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252"+
		"\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u025b\3\2\2\2\u0256\u0254\3\2\2\2\u0257"+
		"\u0259\7\25\2\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3"+
		"\2\2\2\u025a\u025c\7\5\2\2\u025b\u0258\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u025d\3\2\2\2\u025d\u0265\7\33\2\2\u025e\u0261\7\30\2\2\u025f\u0262\5"+
		"V,\2\u0260\u0262\5n8\2\u0261\u025f\3\2\2\2\u0261\u0260\3\2\2\2\u0262\u0263"+
		"\3\2\2\2\u0263\u0264\7\31\2\2\u0264\u0266\3\2\2\2\u0265\u025e\3\2\2\2"+
		"\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0238\3\2\2\2\u0267\u0239"+
		"\3\2\2\2\u0267\u023a\3\2\2\2\u0267\u024c\3\2\2\2\u0268O\3\2\2\2\u0269"+
		"\u026c\5J&\2\u026a\u026c\7\5\2\2\u026b\u0269\3\2\2\2\u026b\u026a\3\2\2"+
		"\2\u026cQ\3\2\2\2\u026d\u026f\5J&\2\u026e\u0270\5\u008aF\2\u026f\u026e"+
		"\3\2\2\2\u026f\u0270\3\2\2\2\u0270S\3\2\2\2\u0271\u0272\7\61\2\2\u0272"+
		"\u0273\5\f\7\2\u0273U\3\2\2\2\u0274\u0276\5Z.\2\u0275\u0274\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\7*\2\2\u0278\u027a\5\\"+
		"/\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027aW\3\2\2\2\u027b\u027c"+
		"\7\64\2\2\u027c\u027d\5F$\2\u027d\u027e\5J&\2\u027e\u027f\7\31\2\2\u027f"+
		"Y\3\2\2\2\u0280\u0284\5\16\b\2\u0281\u0284\5n8\2\u0282\u0284\5d\63\2\u0283"+
		"\u0280\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0282\3\2\2\2\u0284\u0286\3\2"+
		"\2\2\u0285\u0287\7\27\2\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"[\3\2\2\2\u0288\u028a\7\27\2\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2"+
		"\u028a\u028e\3\2\2\2\u028b\u028f\5\16\b\2\u028c\u028f\5n8\2\u028d\u028f"+
		"\5d\63\2\u028e\u028b\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028d\3\2\2\2\u028f"+
		"]\3\2\2\2\u0290\u0292\5Z.\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0295\7*\2\2\u0294\u0296\5\\/\2\u0295\u0294\3\2\2"+
		"\2\u0295\u0296\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0298\7\20\2\2\u0298"+
		"\u029a\5n8\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a_\3\2\2\2\u029b"+
		"\u029e\7>\2\2\u029c\u029e\5b\62\2\u029d\u029b\3\2\2\2\u029d\u029c\3\2"+
		"\2\2\u029ea\3\2\2\2\u029f\u02a1\5p9\2\u02a0\u029f\3\2\2\2\u02a0\u02a1"+
		"\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\7?\2\2\u02a3c\3\2\2\2\u02a4\u02a8"+
		"\7@\2\2\u02a5\u02a7\5f\64\2\u02a6\u02a5\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8"+
		"\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a8\3\2"+
		"\2\2\u02ab\u02ac\7J\2\2\u02ace\3\2\2\2\u02ad\u02b0\5h\65\2\u02ae\u02b0"+
		"\7I\2\2\u02af\u02ad\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0g\3\2\2\2\u02b1\u02b4"+
		"\5l\67\2\u02b2\u02b4\5j\66\2\u02b3\u02b1\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4"+
		"i\3\2\2\2\u02b5\u02b6\7G\2\2\u02b6\u02b7\5n8\2\u02b7\u02b8\7\23\2\2\u02b8"+
		"k\3\2\2\2\u02b9\u02c6\7H\2\2\u02ba\u02bc\5\u009aN\2\u02bb\u02ba\3\2\2"+
		"\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\5\22\n\2\u02be"+
		"\u02c0\7\21\2\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3"+
		"\2\2\2\u02c1\u02c3\5\60\31\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3"+
		"\u02c7\3\2\2\2\u02c4\u02c5\7\20\2\2\u02c5\u02c7\5\f\7\2\u02c6\u02bb\3"+
		"\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02ca\5H%\2\u02c9"+
		"\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02cc\7\n"+
		"\2\2\u02cc\u02ce\7)\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\u02d0\7\23\2\2\u02d0m\3\2\2\2\u02d1\u02d2\b8\1\2"+
		"\u02d2\u02e0\5`\61\2\u02d3\u02d4\7\30\2\2\u02d4\u02d5\5 \21\2\u02d5\u02d6"+
		"\7\31\2\2\u02d6\u02e0\3\2\2\2\u02d7\u02d9\5p9\2\u02d8\u02d7\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02dd\5\16\b\2\u02db\u02dd\5"+
		"\20\t\2\u02dc\u02da\3\2\2\2\u02dc\u02db\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de"+
		"\u02e0\5\u009cO\2\u02df\u02d1\3\2\2\2\u02df\u02d3\3\2\2\2\u02df\u02d8"+
		"\3\2\2\2\u02df\u02de\3\2\2\2\u02e0\u02eb\3\2\2\2\u02e1\u02e2\f\5\2\2\u02e2"+
		"\u02e3\5r:\2\u02e3\u02e4\5n8\6\u02e4\u02ea\3\2\2\2\u02e5\u02e6\f\4\2\2"+
		"\u02e6\u02e7\5p9\2\u02e7\u02e8\5n8\5\u02e8\u02ea\3\2\2\2\u02e9\u02e1\3"+
		"\2\2\2\u02e9\u02e5\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb"+
		"\u02ec\3\2\2\2\u02eco\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02ef\t\3\2\2"+
		"\u02efq\3\2\2\2\u02f0\u02f1\t\4\2\2\u02f1s\3\2\2\2\u02f2\u02f4\5B\"\2"+
		"\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f9"+
		"\5x=\2\u02f6\u02f8\5v<\2\u02f7\u02f6\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9"+
		"\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fau\3\2\2\2\u02fb\u02f9\3\2\2\2"+
		"\u02fc\u02fd\7&\2\2\u02fd\u02fe\5\b\5\2\u02fe\u02ff\5x=\2\u02ffw\3\2\2"+
		"\2\u0300\u0307\5z>\2\u0301\u0303\5\u008cG\2\u0302\u0301\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\3\2"+
		"\2\2\u0306\u0300\3\2\2\2\u0306\u0302\3\2\2\2\u0307y\3\2\2\2\u0308\u030a"+
		"\5\u008cG\2\u0309\u0308\3\2\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3\2\2"+
		"\2\u030b\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d\u030b\3\2\2\2\u030e\u0313"+
		"\5|?\2\u030f\u0311\7\25\2\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0314\5z>\2\u0313\u0310\3\2\2\2\u0313\u0314\3\2\2"+
		"\2\u0314{\3\2\2\2\u0315\u0319\5~@\2\u0316\u0318\5\u008cG\2\u0317\u0316"+
		"\3\2\2\2\u0318\u031b\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"}\3\2\2\2\u031b\u0319\3\2\2\2\u031c\u032c\5\u0084C\2\u031d\u0320\7\32"+
		"\2\2\u031e\u0321\5x=\2\u031f\u0321\5\u008cG\2\u0320\u031e\3\2\2\2\u0320"+
		"\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u032c\7\33"+
		"\2\2\u0323\u0326\7\34\2\2\u0324\u0327\5\u0080A\2\u0325\u0327\5\u008cG"+
		"\2\u0326\u0324\3\2\2\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328"+
		"\3\2\2\2\u0328\u032c\7\35\2\2\u0329\u032c\5\16\b\2\u032a\u032c\5\u0090"+
		"I\2\u032b\u031c\3\2\2\2\u032b\u031d\3\2\2\2\u032b\u0323\3\2\2\2\u032b"+
		"\u0329\3\2\2\2\u032b\u032a\3\2\2\2\u032c\u032e\3\2\2\2\u032d\u032f\5H"+
		"%\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f\177\3\2\2\2\u0330\u0332"+
		"\5\u008cG\2\u0331\u0330\3\2\2\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2"+
		"\2\u0333\u0334\3\2\2\2\u0334\u0336\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u033b"+
		"\5\u0082B\2\u0337\u0339\7\25\2\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2"+
		"\2\u0339\u033a\3\2\2\2\u033a\u033c\5\u0080A\2\u033b\u0338\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u0081\3\2\2\2\u033d\u0340\5\u0084C\2\u033e\u0340"+
		"\5\u0090I\2\u033f\u033d\3\2\2\2\u033f\u033e\3\2\2\2\u0340\u0344\3\2\2"+
		"\2\u0341\u0343\5\u008cG\2\u0342\u0341\3\2\2\2\u0343\u0346\3\2\2\2\u0344"+
		"\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0083\3\2\2\2\u0346\u0344\3\2"+
		"\2\2\u0347\u0349\7\36\2\2\u0348\u034a\7\27\2\2\u0349\u0348\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u0350\5\u0086D\2\u034c\u034d"+
		"\7\62\2\2\u034d\u034f\5\u0086D\2\u034e\u034c\3\2\2\2\u034f\u0352\3\2\2"+
		"\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u0350"+
		"\3\2\2\2\u0353\u0355\7\63\2\2\u0354\u0356\5\u008aF\2\u0355\u0354\3\2\2"+
		"\2\u0355\u0356\3\2\2\2\u0356\u0085\3\2\2\2\u0357\u035b\5\u0088E\2\u0358"+
		"\u035b\5\u0094K\2\u0359\u035b\5d\63\2\u035a\u0357\3\2\2\2\u035a\u0358"+
		"\3\2\2\2\u035a\u0359\3\2\2\2\u035b\u0087\3\2\2\2\u035c\u0360\7\61\2\2"+
		"\u035d\u0361\5\16\b\2\u035e\u0361\5\20\t\2\u035f\u0361\5d\63\2\u0360\u035d"+
		"\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u035f\3\2\2\2\u0361\u0089\3\2\2\2\u0362"+
		"\u036b\7+\2\2\u0363\u036b\7-\2\2\u0364\u036b\7\60\2\2\u0365\u0368\7\61"+
		"\2\2\u0366\u0369\7?\2\2\u0367\u0369\5\16\b\2\u0368\u0366\3\2\2\2\u0368"+
		"\u0367\3\2\2\2\u0369\u036b\3\2\2\2\u036a\u0362\3\2\2\2\u036a\u0363\3\2"+
		"\2\2\u036a\u0364\3\2\2\2\u036a\u0365\3\2\2\2\u036b\u008b\3\2\2\2\u036c"+
		"\u036e\7\30\2\2\u036d\u036f\5\u008eH\2\u036e\u036d\3\2\2\2\u036f\u0370"+
		"\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372\3\2\2\2\u0372"+
		"\u0373\7\31\2\2\u0373\u008d\3\2\2\2\u0374\u0375\7\6\2\2\u0375\u0376\5"+
		"\b\5\2\u0376\u0377\5~@\2\u0377\u0378\7\24\2\2\u0378\u0380\3\2\2\2\u0379"+
		"\u037c\5~@\2\u037a\u037b\7\n\2\2\u037b\u037d\5D#\2\u037c\u037a\3\2\2\2"+
		"\u037c\u037d\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u0380\5B\"\2\u037f\u0374"+
		"\3\2\2\2\u037f\u0379\3\2\2\2\u037f\u037e\3\2\2\2\u0380\u008f\3\2\2\2\u0381"+
		"\u0384\5\b\5\2\u0382\u0384\5\u0092J\2\u0383\u0381\3\2\2\2\u0383\u0382"+
		"\3\2\2\2\u0384\u0388\3\2\2\2\u0385\u0387\5\u008cG\2\u0386\u0385\3\2\2"+
		"\2\u0387\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b"+
		"\3\2\2\2\u038a\u0388\3\2\2\2\u038b\u038c\5|?\2\u038c\u0091\3\2\2\2\u038d"+
		"\u038e\5\u0084C\2\u038e\u038f\7\20\2\2\u038f\u0093\3\2\2\2\u0390\u0393"+
		"\7B\2\2\u0391\u0393\5\u009eP\2\u0392\u0390\3\2\2\2\u0392\u0391\3\2\2\2"+
		"\u0393\u0095\3\2\2\2\u0394\u0395\7A\2\2\u0395\u0097\3\2\2\2\u0396\u0399"+
		"\5\u0094K\2\u0397\u0398\7\17\2\2\u0398\u039a\5\u0094K\2\u0399\u0397\3"+
		"\2\2\2\u039a\u039b\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u0099\3\2\2\2\u039d\u03a1\5\u0096L\2\u039e\u03a1\5\u0094K\2\u039f\u03a1"+
		"\5\u0098M\2\u03a0\u039d\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u039f\3\2\2"+
		"\2\u03a1\u009b\3\2\2\2\u03a2\u03a3\t\5\2\2\u03a3\u009d\3\2\2\2\u03a4\u03ba"+
		"\7\4\2\2\u03a5\u03ba\7\6\2\2\u03a6\u03ba\7 \2\2\u03a7\u03ba\7!\2\2\u03a8"+
		"\u03ba\7\"\2\2\u03a9\u03ba\7#\2\2\u03aa\u03ba\7$\2\2\u03ab\u03ba\7%\2"+
		"\2\u03ac\u03ba\7/\2\2\u03ad\u03ba\7&\2\2\u03ae\u03ba\7\7\2\2\u03af\u03ba"+
		"\7\b\2\2\u03b0\u03ba\7\t\2\2\u03b1\u03ba\5\u009cO\2\u03b2\u03ba\7\65\2"+
		"\2\u03b3\u03ba\7\66\2\2\u03b4\u03ba\78\2\2\u03b5\u03ba\79\2\2\u03b6\u03ba"+
		"\7:\2\2\u03b7\u03ba\7;\2\2\u03b8\u03ba\7=\2\2\u03b9\u03a4\3\2\2\2\u03b9"+
		"\u03a5\3\2\2\2\u03b9\u03a6\3\2\2\2\u03b9\u03a7\3\2\2\2\u03b9\u03a8\3\2"+
		"\2\2\u03b9\u03a9\3\2\2\2\u03b9\u03aa\3\2\2\2\u03b9\u03ab\3\2\2\2\u03b9"+
		"\u03ac\3\2\2\2\u03b9\u03ad\3\2\2\2\u03b9\u03ae\3\2\2\2\u03b9\u03af\3\2"+
		"\2\2\u03b9\u03b0\3\2\2\2\u03b9\u03b1\3\2\2\2\u03b9\u03b2\3\2\2\2\u03b9"+
		"\u03b3\3\2\2\2\u03b9\u03b4\3\2\2\2\u03b9\u03b5\3\2\2\2\u03b9\u03b6\3\2"+
		"\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03b8\3\2\2\2\u03ba\u009f\3\2\2\2\u03bb"+
		"\u03bd\5\u00a2R\2\u03bc\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bc"+
		"\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u00a1\3\2\2\2\u03c0\u03c2\5\6\4\2\u03c1"+
		"\u03c0\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2"+
		"\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c6\u03c8\5\u00a4S\2\u03c7"+
		"\u03c6\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2"+
		"\2\2\u03ca\u00a3\3\2\2\2\u03cb\u03cc\7\66\2\2\u03cc\u03cd\5F$\2\u03cd"+
		"\u03ce\5J&\2\u03ce\u03cf\5d\63\2\u03cf\u00a5\3\2\2\2\u03d0\u03d2\78\2"+
		"\2\u03d1\u03d3\5\u00a8U\2\u03d2\u03d1\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4"+
		"\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d7\79"+
		"\2\2\u03d7\u00a7\3\2\2\2\u03d8\u03da\7:\2\2\u03d9\u03db\5\u00aaV\2\u03da"+
		"\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc\u03de\7;"+
		"\2\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e0\3\2\2\2\u03df"+
		"\u03e1\5d\63\2\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e3\3\2"+
		"\2\2\u03e2\u03e4\5\6\4\2\u03e3\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5"+
		"\u03e3\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03ea\7%"+
		"\2\2\u03e8\u03eb\5\u00aaV\2\u03e9\u03eb\5d\63\2\u03ea\u03e8\3\2\2\2\u03ea"+
		"\u03e9\3\2\2\2\u03eb\u03f5\3\2\2\2\u03ec\u03ed\5\u00aaV\2\u03ed\u03ee"+
		"\7;\2\2\u03ee\u03f0\3\2\2\2\u03ef\u03ec\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0"+
		"\u03f1\3\2\2\2\u03f1\u03f2\5d\63\2\u03f2\u03f3\7<\2\2\u03f3\u03f5\3\2"+
		"\2\2\u03f4\u03d8\3\2\2\2\u03f4\u03ef\3\2\2\2\u03f5\u00a9\3\2\2\2\u03f6"+
		"\u03f9\7\67\2\2\u03f7\u03f9\5\u0094K\2\u03f8\u03f6\3\2\2\2\u03f8\u03f7"+
		"\3\2\2\2\u03f9\u00ab\3\2\2\2\u03fa\u03fb\7=\2\2\u03fb\u03fc\5\u00a8U\2"+
		"\u03fc\u00ad\3\2\2\2\u0091\u00b1\u00b7\u00be\u00d2\u00db\u00e4\u00ef\u00f6"+
		"\u00ff\u0103\u0112\u0116\u011a\u011d\u0127\u012c\u0134\u013b\u0140\u0145"+
		"\u014d\u015a\u015f\u0163\u016b\u016e\u0175\u017d\u0183\u018a\u0191\u0195"+
		"\u019d\u01a6\u01a9\u01ac\u01b1\u01b4\u01ba\u01be\u01c5\u01cb\u01d1\u01d3"+
		"\u01d9\u01dd\u01e3\u01e8\u01ec\u01f2\u0200\u0206\u0213\u0218\u021c\u021e"+
		"\u0222\u0229\u0230\u0235\u023e\u0242\u0246\u0249\u024e\u0254\u0258\u025b"+
		"\u0261\u0265\u0267\u026b\u026f\u0275\u0279\u0283\u0286\u0289\u028e\u0291"+
		"\u0295\u0299\u029d\u02a0\u02a8\u02af\u02b3\u02bb\u02bf\u02c2\u02c6\u02c9"+
		"\u02cd\u02d8\u02dc\u02df\u02e9\u02eb\u02f3\u02f9\u0304\u0306\u030b\u0310"+
		"\u0313\u0319\u0320\u0326\u032b\u032e\u0333\u0338\u033b\u033f\u0344\u0349"+
		"\u0350\u0355\u035a\u0360\u0368\u036a\u0370\u037c\u037f\u0383\u0388\u0392"+
		"\u039b\u03a0\u03b9\u03be\u03c3\u03c9\u03d4\u03da\u03dd\u03e0\u03e5\u03ea"+
		"\u03ef\u03f4\u03f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}