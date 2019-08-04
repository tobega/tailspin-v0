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
		StartComment=1, Package=2, Import=3, Void=4, Def=5, To=6, ResultMarker=7, 
		SinkReference=8, SourceReference=9, DeleteState=10, At=11, Colon=12, Message=13, 
		FieldReference=14, EndStringInterpolate=15, SemiColon=16, Comma=17, Deconstructor=18, 
		Invert=19, LeftParen=20, RightParen=21, LeftBracket=22, RightBracket=23, 
		LeftBrace=24, RightBrace=25, StartMatcher=26, StartTemplatesDefinition=27, 
		StartSourceDefinition=28, StartSinkDefinition=29, StartComposerDefinition=30, 
		StartProcessorDefinition=31, EndDefinition=32, TemplateMatch=33, Range=34, 
		Plus=35, Minus=36, Star=37, Slash=38, Mod=39, Question=40, Equal=41, Zero=42, 
		PositiveInteger=43, START_STRING=44, IDENTIFIER=45, WS=46, Else=47, EndMatcher=48, 
		BeginSuchThat=49, Comment=50, REGEX_TEXT=51, END_REGEX=52, StartCharacterCode=53, 
		StartStringInterpolate=54, STRING_TEXT=55, END_STRING=56;
	public static final int
		RULE_program = 0, RULE_packageDefinition = 1, RULE_dependency = 2, RULE_statement = 3, 
		RULE_key = 4, RULE_parameterDefinitions = 5, RULE_source = 6, RULE_sourceReference = 7, 
		RULE_deleteState = 8, RULE_reference = 9, RULE_structureReference = 10, 
		RULE_arrayReference = 11, RULE_dimensionReference = 12, RULE_simpleDimension = 13, 
		RULE_multiValueDimension = 14, RULE_arrayLiteral = 15, RULE_valueProduction = 16, 
		RULE_structureLiteral = 17, RULE_keyValues = 18, RULE_keyValue = 19, RULE_templates = 20, 
		RULE_sink = 21, RULE_templatesReference = 22, RULE_parameterValues = 23, 
		RULE_parameterValue = 24, RULE_templatesBody = 25, RULE_matchTemplate = 26, 
		RULE_block = 27, RULE_blockExpression = 28, RULE_resultValue = 29, RULE_blockStatement = 30, 
		RULE_sendToTemplates = 31, RULE_stateAssignment = 32, RULE_stateSink = 33, 
		RULE_valueChain = 34, RULE_transform = 35, RULE_matcher = 36, RULE_condition = 37, 
		RULE_typeMatch = 38, RULE_rangeBounds = 39, RULE_suchThat = 40, RULE_lowerBound = 41, 
		RULE_upperBound = 42, RULE_rangeLiteral = 43, RULE_integerLiteral = 44, 
		RULE_nonZeroInteger = 45, RULE_stringLiteral = 46, RULE_stringContent = 47, 
		RULE_stringInterpolate = 48, RULE_characterCode = 49, RULE_interpolateEvaluate = 50, 
		RULE_arithmeticExpression = 51, RULE_additiveOperator = 52, RULE_multiplicativeOperator = 53, 
		RULE_composerBody = 54, RULE_definedCompositionSequence = 55, RULE_compositionSequence = 56, 
		RULE_compositionMatcher = 57, RULE_structureMemberMatchers = 58, RULE_structureMemberMatcher = 59, 
		RULE_tokenMatcher = 60, RULE_compositionToken = 61, RULE_multiplier = 62, 
		RULE_compositionSkipRule = 63, RULE_compositionCapture = 64, RULE_compositionKeyValue = 65, 
		RULE_compositionKey = 66, RULE_compositionComponent = 67, RULE_identifier = 68, 
		RULE_keyword = 69;
	public static final String[] ruleNames = {
		"program", "packageDefinition", "dependency", "statement", "key", "parameterDefinitions", 
		"source", "sourceReference", "deleteState", "reference", "structureReference", 
		"arrayReference", "dimensionReference", "simpleDimension", "multiValueDimension", 
		"arrayLiteral", "valueProduction", "structureLiteral", "keyValues", "keyValue", 
		"templates", "sink", "templatesReference", "parameterValues", "parameterValue", 
		"templatesBody", "matchTemplate", "block", "blockExpression", "resultValue", 
		"blockStatement", "sendToTemplates", "stateAssignment", "stateSink", "valueChain", 
		"transform", "matcher", "condition", "typeMatch", "rangeBounds", "suchThat", 
		"lowerBound", "upperBound", "rangeLiteral", "integerLiteral", "nonZeroInteger", 
		"stringLiteral", "stringContent", "stringInterpolate", "characterCode", 
		"interpolateEvaluate", "arithmeticExpression", "additiveOperator", "multiplicativeOperator", 
		"composerBody", "definedCompositionSequence", "compositionSequence", "compositionMatcher", 
		"structureMemberMatchers", "structureMemberMatcher", "tokenMatcher", "compositionToken", 
		"multiplier", "compositionSkipRule", "compositionCapture", "compositionKeyValue", 
		"compositionKey", "compositionComponent", "identifier", "keyword"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'//'", "'package'", "'import'", "'!VOID'", null, "'->'", "'!'", 
		null, null, null, "'@'", "':'", null, null, null, "';'", "','", "'...'", 
		"'~'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'templates'", 
		"'source'", "'sink'", "'composer'", "'processor'", "'end'", "'#'", "'..'", 
		"'+'", "'-'", "'*'", "'/'", "'mod'", "'?'", "'='", "'0'", null, null, 
		null, null, "'|'", "'>'", "'?('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "StartComment", "Package", "Import", "Void", "Def", "To", "ResultMarker", 
		"SinkReference", "SourceReference", "DeleteState", "At", "Colon", "Message", 
		"FieldReference", "EndStringInterpolate", "SemiColon", "Comma", "Deconstructor", 
		"Invert", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
		"RightBrace", "StartMatcher", "StartTemplatesDefinition", "StartSourceDefinition", 
		"StartSinkDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
		"EndDefinition", "TemplateMatch", "Range", "Plus", "Minus", "Star", "Slash", 
		"Mod", "Question", "Equal", "Zero", "PositiveInteger", "START_STRING", 
		"IDENTIFIER", "WS", "Else", "EndMatcher", "BeginSuchThat", "Comment", 
		"REGEX_TEXT", "END_REGEX", "StartCharacterCode", "StartStringInterpolate", 
		"STRING_TEXT", "END_STRING"
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
		public PackageDefinitionContext packageDefinition() {
			return getRuleContext(PackageDefinitionContext.class,0);
		}
		public List<DependencyContext> dependency() {
			return getRuleContexts(DependencyContext.class);
		}
		public DependencyContext dependency(int i) {
			return getRuleContext(DependencyContext.class,i);
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(140);
				packageDefinition();
				}
				break;
			}
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					dependency();
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(149);
			statement();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Package) | (1L << Import) | (1L << Def) | (1L << SourceReference) | (1L << DeleteState) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << EndDefinition) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(150);
				statement();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
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

	public static class PackageDefinitionContext extends ParserRuleContext {
		public TerminalNode Package() { return getToken(TailspinParser.Package, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PackageDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitPackageDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDefinitionContext packageDefinition() throws RecognitionException {
		PackageDefinitionContext _localctx = new PackageDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(Package);
			setState(159);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DependencyContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(TailspinParser.Import, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public DependencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependency; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDependency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependencyContext dependency() throws RecognitionException {
		DependencyContext _localctx = new DependencyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dependency);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(Import);
			setState(162);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(Def);
				setState(165);
				key();
				setState(166);
				valueProduction();
				setState(167);
				match(SemiColon);
				}
				break;
			case 2:
				_localctx = new ValueChainToSinkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				valueChain();
				setState(170);
				match(To);
				setState(171);
				sink();
				}
				break;
			case 3:
				_localctx = new TemplatesDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				identifier();
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(175);
					parameterDefinitions();
					}
					break;
				}
				setState(178);
				templatesBody();
				setState(179);
				match(EndDefinition);
				setState(180);
				identifier();
				}
				break;
			case 4:
				_localctx = new ProcessorDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(StartProcessorDefinition);
				setState(183);
				identifier();
				setState(185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(184);
					parameterDefinitions();
					}
					break;
				}
				setState(187);
				block();
				setState(188);
				match(EndDefinition);
				setState(189);
				identifier();
				}
				break;
			case 5:
				_localctx = new ComposerDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				match(StartComposerDefinition);
				setState(192);
				identifier();
				setState(194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(193);
					parameterDefinitions();
					}
					break;
				}
				setState(196);
				composerBody();
				setState(197);
				match(EndDefinition);
				setState(198);
				identifier();
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 8, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			identifier();
			setState(203);
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
		public TerminalNode At() { return getToken(TailspinParser.At, 0); }
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
		enterRule(_localctx, 10, RULE_parameterDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(At);
			setState(206);
			match(LeftBrace);
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(207);
				key();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(208);
					match(Comma);
					}
				}

				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Package) | (1L << Import) | (1L << Def) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << EndDefinition) | (1L << Mod) | (1L << IDENTIFIER))) != 0) );
			setState(215);
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
		enterRule(_localctx, 12, RULE_source);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				sourceReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				deleteState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				rangeLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				arrayLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				structureLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(223);
				match(LeftParen);
				setState(224);
				keyValue();
				setState(225);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(227);
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
		public TerminalNode SourceReference() { return getToken(TailspinParser.SourceReference, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
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
		enterRule(_localctx, 14, RULE_sourceReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(SourceReference);
			setState(231);
			reference();
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(232);
				match(Message);
				}
				break;
			}
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(235);
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
		public TerminalNode DeleteState() { return getToken(TailspinParser.DeleteState, 0); }
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
		enterRule(_localctx, 16, RULE_deleteState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(DeleteState);
			setState(239);
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
		enterRule(_localctx, 18, RULE_reference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(241);
				match(LeftParen);
				setState(242);
				arrayReference();
				setState(243);
				match(RightParen);
				}
				break;
			}
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					structureReference();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 20, RULE_structureReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(FieldReference);
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(254);
				match(LeftParen);
				setState(255);
				arrayReference();
				setState(256);
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
		enterRule(_localctx, 22, RULE_arrayReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			dimensionReference();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(261);
				match(SemiColon);
				setState(262);
				dimensionReference();
				}
				}
				setState(267);
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
		enterRule(_localctx, 24, RULE_dimensionReference);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceReference:
			case LeftParen:
			case Range:
			case Plus:
			case Minus:
			case Zero:
			case PositiveInteger:
			case START_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				simpleDimension();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
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
		public List<TerminalNode> Deconstructor() { return getTokens(TailspinParser.Deconstructor); }
		public TerminalNode Deconstructor(int i) {
			return getToken(TailspinParser.Deconstructor, i);
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
		enterRule(_localctx, 26, RULE_simpleDimension);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(272);
				sourceReference();
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Deconstructor) {
					{
					{
					setState(273);
					match(Deconstructor);
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				arithmeticExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
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
		enterRule(_localctx, 28, RULE_multiValueDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(LeftBracket);
			setState(284);
			simpleDimension();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(285);
				match(Comma);
				setState(286);
				simpleDimension();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
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
		enterRule(_localctx, 30, RULE_arrayLiteral);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(LeftBracket);
				setState(295);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(LeftBracket);
				setState(297);
				valueProduction();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(298);
					match(Comma);
					setState(299);
					valueProduction();
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(305);
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
		enterRule(_localctx, 32, RULE_valueProduction);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				sendToTemplates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
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
		enterRule(_localctx, 34, RULE_structureLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(LeftBrace);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Package) | (1L << Import) | (1L << Def) | (1L << SourceReference) | (1L << DeleteState) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << EndDefinition) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(314);
				keyValues();
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(315);
					match(Comma);
					setState(316);
					keyValues();
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(324);
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
		enterRule(_localctx, 36, RULE_keyValues);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				keyValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				valueProduction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
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
		enterRule(_localctx, 38, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			key();
			setState(332);
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
	public static class ArrayTemplatesContext extends TemplatesContext {
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
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
		enterRule(_localctx, 40, RULE_templates);
		int _la;
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new LiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				source();
				}
				break;
			case 2:
				_localctx = new InlineTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(LeftParen);
				setState(336);
				templatesBody();
				setState(337);
				match(RightParen);
				}
				break;
			case 3:
				_localctx = new CallDefinedTransformContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				templatesReference();
				}
				break;
			case 4:
				_localctx = new ArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				match(LeftBracket);
				setState(341);
				identifier();
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(342);
					match(Comma);
					setState(343);
					identifier();
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(349);
				match(RightBracket);
				setState(350);
				match(LeftParen);
				setState(351);
				templatesBody();
				setState(352);
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

	public static class SinkContext extends ParserRuleContext {
		public TerminalNode SinkReference() { return getToken(TailspinParser.SinkReference, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode Message() { return getToken(TailspinParser.Message, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public TerminalNode Void() { return getToken(TailspinParser.Void, 0); }
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
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SinkReference:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(356);
				match(SinkReference);
				setState(357);
				reference();
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(358);
					match(Message);
					}
				}

				setState(362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(361);
					parameterValues();
					}
					break;
				}
				}
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
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

	public static class TemplatesReferenceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
			setState(367);
			identifier();
			setState(368);
			reference();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Message) {
				{
				setState(369);
				match(Message);
				}
			}

			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(372);
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

	public static class ParameterValuesContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(TailspinParser.At, 0); }
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
			setState(375);
			match(At);
			setState(376);
			match(LeftBrace);
			setState(381); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(377);
				parameterValue();
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(378);
					match(Comma);
					}
				}

				}
				}
				setState(383); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Package) | (1L << Import) | (1L << Def) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << EndDefinition) | (1L << Mod) | (1L << IDENTIFIER))) != 0) );
			setState(385);
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
			setState(387);
			key();
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(388);
				valueChain();
				}
				break;
			case 2:
				{
				setState(389);
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
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Package:
			case Import:
			case Void:
			case Def:
			case SourceReference:
			case DeleteState:
			case At:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case EndDefinition:
			case Range:
			case Plus:
			case Minus:
			case Mod:
			case Zero:
			case PositiveInteger:
			case START_STRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				block();
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StartMatcher) {
					{
					{
					setState(393);
					matchTemplate();
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case StartMatcher:
				enterOuterAlt(_localctx, 2);
				{
				setState(400); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(399);
					matchTemplate();
					}
					}
					setState(402); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StartMatcher );
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
		enterRule(_localctx, 52, RULE_matchTemplate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			matcher();
			setState(407);
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
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Package:
			case Import:
			case Def:
			case SourceReference:
			case DeleteState:
			case At:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case EndDefinition:
			case Range:
			case Plus:
			case Minus:
			case Mod:
			case Zero:
			case PositiveInteger:
			case START_STRING:
			case IDENTIFIER:
				{
				setState(410); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(409);
						blockExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(412); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case Void:
				{
				setState(414);
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
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				stateAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				sendToTemplates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
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
			setState(423);
			valueChain();
			setState(424);
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
			setState(426);
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
			setState(428);
			valueChain();
			setState(429);
			match(To);
			setState(430);
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
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(432);
				valueChain();
				setState(433);
				match(To);
				}
				break;
			}
			setState(437);
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
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TailspinParser.SemiColon, 0); }
		public TerminalNode At() { return getToken(TailspinParser.At, 0); }
		public TerminalNode Range() { return getToken(TailspinParser.Range, 0); }
		public TerminalNode Else() { return getToken(TailspinParser.Else, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 66, RULE_stateSink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Range) {
				{
				setState(439);
				match(Range);
				setState(440);
				match(Else);
				}
			}

			{
			setState(443);
			match(At);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Package) | (1L << Import) | (1L << Def) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << EndDefinition) | (1L << Mod) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(444);
				identifier();
				}
			}

			}
			setState(447);
			reference();
			setState(448);
			match(Colon);
			setState(449);
			valueProduction();
			setState(450);
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
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				source();
				setState(454);
				transform();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
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
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case To:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(To);
				setState(460);
				templates();
				setState(462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(461);
					transform();
					}
					break;
				}
				}
				break;
			case Deconstructor:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(Deconstructor);
				setState(466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(465);
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
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
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
			setState(470);
			match(StartMatcher);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(471);
				match(Invert);
				}
			}

			setState(474);
			condition();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(475);
				match(Else);
				setState(476);
				condition();
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(482);
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
		public TypeMatchContext typeMatch() {
			return getRuleContext(TypeMatchContext.class,0);
		}
		public List<SuchThatContext> suchThat() {
			return getRuleContexts(SuchThatContext.class);
		}
		public SuchThatContext suchThat(int i) {
			return getRuleContext(SuchThatContext.class,i);
		}
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
		enterRule(_localctx, 74, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SourceReference) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				setState(484);
				typeMatch();
				}
			}

			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BeginSuchThat) {
				{
				{
				setState(487);
				suchThat();
				}
				}
				setState(492);
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
	public static class IntegerEqualsContext extends TypeMatchContext {
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public IntegerEqualsContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitIntegerEquals(this);
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
		public StructureMatchContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectEqualsContext extends TypeMatchContext {
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public ObjectEqualsContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitObjectEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeMatchContext typeMatch() throws RecognitionException {
		TypeMatchContext _localctx = new TypeMatchContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeMatch);
		int _la;
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				_localctx = new ObjectEqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				sourceReference();
				}
				break;
			case 2:
				_localctx = new IntegerEqualsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				arithmeticExpression(0);
				}
				break;
			case 3:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				rangeBounds();
				}
				break;
			case 4:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(496);
				stringLiteral();
				}
				break;
			case 5:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(497);
				match(LeftBrace);
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Package) | (1L << Import) | (1L << Def) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << EndDefinition) | (1L << Mod) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(498);
					key();
					setState(499);
					matcher();
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(500);
						match(Comma);
						}
					}

					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(508);
				match(RightBrace);
				}
				break;
			case 6:
				_localctx = new ArrayMatchContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(509);
				match(LeftBracket);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==StartMatcher) {
					{
					setState(510);
					matcher();
					}
				}

				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(513);
					match(Comma);
					setState(514);
					matcher();
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(520);
				match(RightBracket);
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(521);
					match(LeftParen);
					setState(524);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						setState(522);
						rangeBounds();
						}
						break;
					case 2:
						{
						setState(523);
						arithmeticExpression(0);
						}
						break;
					}
					setState(526);
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
		enterRule(_localctx, 78, RULE_rangeBounds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SourceReference) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				setState(532);
				lowerBound();
				}
			}

			setState(535);
			match(Range);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SourceReference) | (1L << Invert) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				setState(536);
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

	public static class SuchThatContext extends ParserRuleContext {
		public TerminalNode BeginSuchThat() { return getToken(TailspinParser.BeginSuchThat, 0); }
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public SuchThatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suchThat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitSuchThat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuchThatContext suchThat() throws RecognitionException {
		SuchThatContext _localctx = new SuchThatContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_suchThat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(BeginSuchThat);
			setState(540);
			valueChain();
			setState(541);
			matcher();
			setState(542);
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
		enterRule(_localctx, 82, RULE_lowerBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(544);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(545);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(546);
				stringLiteral();
				}
				break;
			}
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(549);
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
		enterRule(_localctx, 84, RULE_upperBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(552);
				match(Invert);
				}
			}

			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(555);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(556);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(557);
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
		enterRule(_localctx, 86, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SourceReference) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				setState(560);
				lowerBound();
				}
			}

			setState(563);
			match(Range);
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(564);
				upperBound();
				}
				break;
			}
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(567);
				match(Colon);
				setState(568);
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
		enterRule(_localctx, 88, RULE_integerLiteral);
		try {
			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				match(Zero);
				}
				break;
			case Plus:
			case Minus:
			case PositiveInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
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
		enterRule(_localctx, 90, RULE_nonZeroInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(575);
				additiveOperator();
				}
			}

			setState(578);
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
		enterRule(_localctx, 92, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(START_STRING);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartCharacterCode) | (1L << StartStringInterpolate) | (1L << STRING_TEXT))) != 0)) {
				{
				{
				setState(581);
				stringContent();
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(587);
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
		enterRule(_localctx, 94, RULE_stringContent);
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartCharacterCode:
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
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
		enterRule(_localctx, 96, RULE_stringInterpolate);
		try {
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				interpolateEvaluate();
				}
				break;
			case StartCharacterCode:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
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
		enterRule(_localctx, 98, RULE_characterCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(StartCharacterCode);
			setState(598);
			arithmeticExpression(0);
			setState(599);
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
		public TerminalNode At() { return getToken(TailspinParser.At, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 100, RULE_interpolateEvaluate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(StartStringInterpolate);
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Package:
			case Import:
			case Def:
			case To:
			case At:
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
			case Mod:
			case IDENTIFIER:
				{
				setState(603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(602);
					match(At);
					}
					break;
				}
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Package) | (1L << Import) | (1L << Def) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << EndDefinition) | (1L << Mod) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(605);
					identifier();
					}
				}

				setState(608);
				reference();
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(609);
					match(Message);
					}
				}

				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==At) {
					{
					setState(612);
					parameterValues();
					}
				}

				}
				break;
			case Colon:
				{
				setState(615);
				match(Colon);
				setState(616);
				source();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(619);
				transform();
				}
				break;
			}
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==To) {
				{
				setState(622);
				match(To);
				setState(623);
				match(TemplateMatch);
				}
			}

			setState(626);
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
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
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
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(629);
				integerLiteral();
				}
				break;
			case 2:
				{
				setState(630);
				match(LeftParen);
				setState(631);
				valueProduction();
				setState(632);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Plus || _la==Minus) {
					{
					setState(634);
					additiveOperator();
					}
				}

				setState(637);
				sourceReference();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(648);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(640);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(641);
						multiplicativeOperator();
						setState(642);
						arithmeticExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(644);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(645);
						additiveOperator();
						setState(646);
						arithmeticExpression(2);
						}
						break;
					}
					} 
				}
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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
		enterRule(_localctx, 104, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
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
		public TerminalNode Slash() { return getToken(TailspinParser.Slash, 0); }
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
		enterRule(_localctx, 106, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Slash) | (1L << Mod))) != 0)) ) {
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
		enterRule(_localctx, 108, RULE_composerBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(657);
				stateAssignment();
				}
				break;
			}
			setState(660);
			compositionSequence();
			setState(664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(661);
					definedCompositionSequence();
					}
					} 
				}
				setState(666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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
		enterRule(_localctx, 110, RULE_definedCompositionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			key();
			setState(668);
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
		public StructureMemberMatchersContext structureMemberMatchers() {
			return getRuleContext(StructureMemberMatchersContext.class,0);
		}
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
		}
		public List<CompositionComponentContext> compositionComponent() {
			return getRuleContexts(CompositionComponentContext.class);
		}
		public CompositionComponentContext compositionComponent(int i) {
			return getRuleContext(CompositionComponentContext.class,i);
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
		enterRule(_localctx, 112, RULE_compositionSequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(670);
					compositionSkipRule();
					}
					} 
				}
				setState(675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(677); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(676);
					compositionComponent();
					}
					}
					setState(679); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SourceReference) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartMatcher))) != 0) );
				}
				break;
			case 2:
				{
				setState(681);
				structureMemberMatchers();
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

	public static class CompositionMatcherContext extends ParserRuleContext {
		public TokenMatcherContext tokenMatcher() {
			return getRuleContext(TokenMatcherContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public CompositionSequenceContext compositionSequence() {
			return getRuleContext(CompositionSequenceContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
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
		enterRule(_localctx, 114, RULE_compositionMatcher);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartMatcher:
				{
				setState(684);
				tokenMatcher();
				}
				break;
			case LeftBracket:
				{
				setState(685);
				match(LeftBracket);
				setState(686);
				compositionSequence();
				setState(687);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				{
				setState(689);
				match(LeftBrace);
				setState(693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(690);
						compositionSkipRule();
						}
						} 
					}
					setState(695);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Package) | (1L << Import) | (1L << Def) | (1L << LeftParen) | (1L << StartMatcher) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << EndDefinition) | (1L << Mod) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(696);
					structureMemberMatchers();
					}
				}

				setState(699);
				match(RightBrace);
				}
				break;
			case SourceReference:
				{
				setState(700);
				sourceReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(703);
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
		public List<StructureMemberMatcherContext> structureMemberMatcher() {
			return getRuleContexts(StructureMemberMatcherContext.class);
		}
		public StructureMemberMatcherContext structureMemberMatcher(int i) {
			return getRuleContext(StructureMemberMatcherContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
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
		enterRule(_localctx, 116, RULE_structureMemberMatchers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			structureMemberMatcher();
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(707);
				match(Comma);
				setState(708);
				structureMemberMatcher();
				}
				}
				setState(713);
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
		enterRule(_localctx, 118, RULE_structureMemberMatcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(714);
				compositionSkipRule();
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(720);
				tokenMatcher();
				}
				break;
			case 2:
				{
				setState(721);
				compositionKeyValue();
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
		enterRule(_localctx, 120, RULE_tokenMatcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(StartMatcher);
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(725);
				match(Invert);
				}
			}

			setState(728);
			compositionToken();
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(729);
				match(Else);
				setState(730);
				compositionToken();
				}
				}
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(736);
			match(EndMatcher);
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Star) | (1L << Question) | (1L << Equal))) != 0)) {
				{
				setState(737);
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

	public static class CompositionTokenContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 122, RULE_compositionToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Package:
			case Import:
			case Def:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case EndDefinition:
			case Mod:
			case IDENTIFIER:
				{
				setState(740);
				identifier();
				}
				break;
			case START_STRING:
				{
				setState(741);
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
		enterRule(_localctx, 124, RULE_multiplier);
		try {
			setState(752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				match(Plus);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				match(Star);
				}
				break;
			case Question:
				enterOuterAlt(_localctx, 3);
				{
				setState(746);
				match(Question);
				}
				break;
			case Equal:
				enterOuterAlt(_localctx, 4);
				{
				setState(747);
				match(Equal);
				setState(750);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PositiveInteger:
					{
					setState(748);
					match(PositiveInteger);
					}
					break;
				case SourceReference:
					{
					setState(749);
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
		enterRule(_localctx, 126, RULE_compositionSkipRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(LeftParen);
			setState(756); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(755);
				compositionCapture();
				}
				}
				setState(758); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << SourceReference) | (1L << At) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartMatcher) | (1L << Range))) != 0) );
			setState(760);
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
		public CompositionMatcherContext compositionMatcher() {
			return getRuleContext(CompositionMatcherContext.class,0);
		}
		public TerminalNode Def() { return getToken(TailspinParser.Def, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public StateSinkContext stateSink() {
			return getRuleContext(StateSinkContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
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
		enterRule(_localctx, 128, RULE_compositionCapture);
		int _la;
		try {
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Def) {
					{
					setState(762);
					match(Def);
					setState(763);
					key();
					}
				}

				setState(766);
				compositionMatcher();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SourceReference) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartMatcher))) != 0)) {
					{
					setState(767);
					compositionMatcher();
					setState(768);
					match(To);
					}
				}

				setState(772);
				stateSink();
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
		public TerminalNode Comma() { return getToken(TailspinParser.Comma, 0); }
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
		enterRule(_localctx, 130, RULE_compositionKeyValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Package:
			case Import:
			case Def:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case EndDefinition:
			case Mod:
			case IDENTIFIER:
				{
				setState(775);
				key();
				}
				break;
			case StartMatcher:
				{
				setState(776);
				compositionKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(782);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(779);
					compositionSkipRule();
					}
					} 
				}
				setState(784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			setState(785);
			compositionComponent();
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(786);
				match(Comma);
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
		enterRule(_localctx, 132, RULE_compositionKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			tokenMatcher();
			setState(790);
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
		enterRule(_localctx, 134, RULE_compositionComponent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceReference:
			case LeftBracket:
			case LeftBrace:
			case StartMatcher:
				{
				setState(792);
				compositionMatcher();
				}
				break;
			case LeftParen:
				{
				setState(793);
				compositionSkipRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(799);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(796);
					compositionSkipRule();
					}
					} 
				}
				setState(801);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_identifier);
		try {
			setState(804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				match(IDENTIFIER);
				}
				break;
			case Package:
			case Import:
			case Def:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case EndDefinition:
			case Mod:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Package() { return getToken(TailspinParser.Package, 0); }
		public TerminalNode Import() { return getToken(TailspinParser.Import, 0); }
		public TerminalNode Def() { return getToken(TailspinParser.Def, 0); }
		public TerminalNode StartTemplatesDefinition() { return getToken(TailspinParser.StartTemplatesDefinition, 0); }
		public TerminalNode StartSourceDefinition() { return getToken(TailspinParser.StartSourceDefinition, 0); }
		public TerminalNode StartSinkDefinition() { return getToken(TailspinParser.StartSinkDefinition, 0); }
		public TerminalNode StartComposerDefinition() { return getToken(TailspinParser.StartComposerDefinition, 0); }
		public TerminalNode StartProcessorDefinition() { return getToken(TailspinParser.StartProcessorDefinition, 0); }
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public TerminalNode Mod() { return getToken(TailspinParser.Mod, 0); }
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
		enterRule(_localctx, 138, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Package) | (1L << Import) | (1L << Def) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << EndDefinition) | (1L << Mod))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 51:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u032b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\5\2\u0090"+
		"\n\2\3\2\7\2\u0093\n\2\f\2\16\2\u0096\13\2\3\2\3\2\7\2\u009a\n\2\f\2\16"+
		"\2\u009d\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b3\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u00bc\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00c5\n\5\3\5\3\5\3\5\3\5\5"+
		"\5\u00cb\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u00d4\n\7\6\7\u00d6\n\7\r"+
		"\7\16\7\u00d7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u00e7\n\b\3\t\3\t\3\t\5\t\u00ec\n\t\3\t\5\t\u00ef\n\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\5\13\u00f8\n\13\3\13\7\13\u00fb\n\13\f\13\16\13\u00fe"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\5\f\u0105\n\f\3\r\3\r\3\r\7\r\u010a\n\r\f\r"+
		"\16\r\u010d\13\r\3\16\3\16\5\16\u0111\n\16\3\17\3\17\7\17\u0115\n\17\f"+
		"\17\16\17\u0118\13\17\3\17\3\17\5\17\u011c\n\17\3\20\3\20\3\20\3\20\7"+
		"\20\u0122\n\20\f\20\16\20\u0125\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\7\21\u012f\n\21\f\21\16\21\u0132\13\21\3\21\3\21\5\21\u0136\n"+
		"\21\3\22\3\22\5\22\u013a\n\22\3\23\3\23\3\23\3\23\7\23\u0140\n\23\f\23"+
		"\16\23\u0143\13\23\5\23\u0145\n\23\3\23\3\23\3\24\3\24\3\24\5\24\u014c"+
		"\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u015b\n\26\f\26\16\26\u015e\13\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0165\n\26\3\27\3\27\3\27\5\27\u016a\n\27\3\27\5\27\u016d\n\27\3\27\5"+
		"\27\u0170\n\27\3\30\3\30\3\30\5\30\u0175\n\30\3\30\5\30\u0178\n\30\3\31"+
		"\3\31\3\31\3\31\5\31\u017e\n\31\6\31\u0180\n\31\r\31\16\31\u0181\3\31"+
		"\3\31\3\32\3\32\3\32\5\32\u0189\n\32\3\33\3\33\7\33\u018d\n\33\f\33\16"+
		"\33\u0190\13\33\3\33\6\33\u0193\n\33\r\33\16\33\u0194\5\33\u0197\n\33"+
		"\3\34\3\34\3\34\3\35\6\35\u019d\n\35\r\35\16\35\u019e\3\35\5\35\u01a2"+
		"\n\35\3\36\3\36\3\36\3\36\5\36\u01a8\n\36\3\37\3\37\3\37\3 \3 \3!\3!\3"+
		"!\3!\3\"\3\"\3\"\5\"\u01b6\n\"\3\"\3\"\3#\3#\5#\u01bc\n#\3#\3#\5#\u01c0"+
		"\n#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\5$\u01cc\n$\3%\3%\3%\5%\u01d1\n%\3%"+
		"\3%\5%\u01d5\n%\5%\u01d7\n%\3&\3&\5&\u01db\n&\3&\3&\3&\7&\u01e0\n&\f&"+
		"\16&\u01e3\13&\3&\3&\3\'\5\'\u01e8\n\'\3\'\7\'\u01eb\n\'\f\'\16\'\u01ee"+
		"\13\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01f8\n(\7(\u01fa\n(\f(\16(\u01fd\13"+
		"(\3(\3(\3(\5(\u0202\n(\3(\3(\7(\u0206\n(\f(\16(\u0209\13(\3(\3(\3(\3("+
		"\5(\u020f\n(\3(\3(\5(\u0213\n(\5(\u0215\n(\3)\5)\u0218\n)\3)\3)\5)\u021c"+
		"\n)\3*\3*\3*\3*\3*\3+\3+\3+\5+\u0226\n+\3+\5+\u0229\n+\3,\5,\u022c\n,"+
		"\3,\3,\3,\5,\u0231\n,\3-\5-\u0234\n-\3-\3-\5-\u0238\n-\3-\3-\5-\u023c"+
		"\n-\3.\3.\5.\u0240\n.\3/\5/\u0243\n/\3/\3/\3\60\3\60\7\60\u0249\n\60\f"+
		"\60\16\60\u024c\13\60\3\60\3\60\3\61\3\61\5\61\u0252\n\61\3\62\3\62\5"+
		"\62\u0256\n\62\3\63\3\63\3\63\3\63\3\64\3\64\5\64\u025e\n\64\3\64\5\64"+
		"\u0261\n\64\3\64\3\64\5\64\u0265\n\64\3\64\5\64\u0268\n\64\3\64\3\64\5"+
		"\64\u026c\n\64\3\64\5\64\u026f\n\64\3\64\3\64\5\64\u0273\n\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u027e\n\65\3\65\5\65\u0281\n"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u028b\n\65\f\65\16\65"+
		"\u028e\13\65\3\66\3\66\3\67\3\67\38\58\u0295\n8\38\38\78\u0299\n8\f8\16"+
		"8\u029c\138\39\39\39\3:\7:\u02a2\n:\f:\16:\u02a5\13:\3:\6:\u02a8\n:\r"+
		":\16:\u02a9\3:\5:\u02ad\n:\3;\3;\3;\3;\3;\3;\3;\7;\u02b6\n;\f;\16;\u02b9"+
		"\13;\3;\5;\u02bc\n;\3;\3;\5;\u02c0\n;\3;\5;\u02c3\n;\3<\3<\3<\7<\u02c8"+
		"\n<\f<\16<\u02cb\13<\3=\7=\u02ce\n=\f=\16=\u02d1\13=\3=\3=\5=\u02d5\n"+
		"=\3>\3>\5>\u02d9\n>\3>\3>\3>\7>\u02de\n>\f>\16>\u02e1\13>\3>\3>\5>\u02e5"+
		"\n>\3?\3?\5?\u02e9\n?\3@\3@\3@\3@\3@\3@\5@\u02f1\n@\5@\u02f3\n@\3A\3A"+
		"\6A\u02f7\nA\rA\16A\u02f8\3A\3A\3B\3B\5B\u02ff\nB\3B\3B\3B\3B\5B\u0305"+
		"\nB\3B\5B\u0308\nB\3C\3C\5C\u030c\nC\3C\7C\u030f\nC\fC\16C\u0312\13C\3"+
		"C\3C\5C\u0316\nC\3D\3D\3D\3E\3E\5E\u031d\nE\3E\7E\u0320\nE\fE\16E\u0323"+
		"\13E\3F\3F\5F\u0327\nF\3G\3G\3G\2\3hH\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\2\6\3\2\35\37\3\2%&\3\2\')\6\2\4"+
		"\5\7\7\35\"))\2\u0370\2\u008f\3\2\2\2\4\u00a0\3\2\2\2\6\u00a3\3\2\2\2"+
		"\b\u00ca\3\2\2\2\n\u00cc\3\2\2\2\f\u00cf\3\2\2\2\16\u00e6\3\2\2\2\20\u00e8"+
		"\3\2\2\2\22\u00f0\3\2\2\2\24\u00f7\3\2\2\2\26\u00ff\3\2\2\2\30\u0106\3"+
		"\2\2\2\32\u0110\3\2\2\2\34\u011b\3\2\2\2\36\u011d\3\2\2\2 \u0135\3\2\2"+
		"\2\"\u0139\3\2\2\2$\u013b\3\2\2\2&\u014b\3\2\2\2(\u014d\3\2\2\2*\u0164"+
		"\3\2\2\2,\u016f\3\2\2\2.\u0171\3\2\2\2\60\u0179\3\2\2\2\62\u0185\3\2\2"+
		"\2\64\u0196\3\2\2\2\66\u0198\3\2\2\28\u01a1\3\2\2\2:\u01a7\3\2\2\2<\u01a9"+
		"\3\2\2\2>\u01ac\3\2\2\2@\u01ae\3\2\2\2B\u01b5\3\2\2\2D\u01bb\3\2\2\2F"+
		"\u01cb\3\2\2\2H\u01d6\3\2\2\2J\u01d8\3\2\2\2L\u01e7\3\2\2\2N\u0214\3\2"+
		"\2\2P\u0217\3\2\2\2R\u021d\3\2\2\2T\u0225\3\2\2\2V\u022b\3\2\2\2X\u0233"+
		"\3\2\2\2Z\u023f\3\2\2\2\\\u0242\3\2\2\2^\u0246\3\2\2\2`\u0251\3\2\2\2"+
		"b\u0255\3\2\2\2d\u0257\3\2\2\2f\u025b\3\2\2\2h\u0280\3\2\2\2j\u028f\3"+
		"\2\2\2l\u0291\3\2\2\2n\u0294\3\2\2\2p\u029d\3\2\2\2r\u02a3\3\2\2\2t\u02bf"+
		"\3\2\2\2v\u02c4\3\2\2\2x\u02cf\3\2\2\2z\u02d6\3\2\2\2|\u02e8\3\2\2\2~"+
		"\u02f2\3\2\2\2\u0080\u02f4\3\2\2\2\u0082\u0307\3\2\2\2\u0084\u030b\3\2"+
		"\2\2\u0086\u0317\3\2\2\2\u0088\u031c\3\2\2\2\u008a\u0326\3\2\2\2\u008c"+
		"\u0328\3\2\2\2\u008e\u0090\5\4\3\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0094\3\2\2\2\u0091\u0093\5\6\4\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u009b\5\b\5\2\u0098\u009a\5\b\5\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\2\2\3\u009f"+
		"\3\3\2\2\2\u00a0\u00a1\7\4\2\2\u00a1\u00a2\5\u008aF\2\u00a2\5\3\2\2\2"+
		"\u00a3\u00a4\7\5\2\2\u00a4\u00a5\5^\60\2\u00a5\7\3\2\2\2\u00a6\u00a7\7"+
		"\7\2\2\u00a7\u00a8\5\n\6\2\u00a8\u00a9\5\"\22\2\u00a9\u00aa\7\22\2\2\u00aa"+
		"\u00cb\3\2\2\2\u00ab\u00ac\5F$\2\u00ac\u00ad\7\b\2\2\u00ad\u00ae\5,\27"+
		"\2\u00ae\u00cb\3\2\2\2\u00af\u00b0\t\2\2\2\u00b0\u00b2\5\u008aF\2\u00b1"+
		"\u00b3\5\f\7\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b5\5\64\33\2\u00b5\u00b6\7\"\2\2\u00b6\u00b7\5\u008aF\2"+
		"\u00b7\u00cb\3\2\2\2\u00b8\u00b9\7!\2\2\u00b9\u00bb\5\u008aF\2\u00ba\u00bc"+
		"\5\f\7\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\58\35\2\u00be\u00bf\7\"\2\2\u00bf\u00c0\5\u008aF\2\u00c0\u00cb"+
		"\3\2\2\2\u00c1\u00c2\7 \2\2\u00c2\u00c4\5\u008aF\2\u00c3\u00c5\5\f\7\2"+
		"\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7"+
		"\5n8\2\u00c7\u00c8\7\"\2\2\u00c8\u00c9\5\u008aF\2\u00c9\u00cb\3\2\2\2"+
		"\u00ca\u00a6\3\2\2\2\u00ca\u00ab\3\2\2\2\u00ca\u00af\3\2\2\2\u00ca\u00b8"+
		"\3\2\2\2\u00ca\u00c1\3\2\2\2\u00cb\t\3\2\2\2\u00cc\u00cd\5\u008aF\2\u00cd"+
		"\u00ce\7\16\2\2\u00ce\13\3\2\2\2\u00cf\u00d0\7\r\2\2\u00d0\u00d5\7\32"+
		"\2\2\u00d1\u00d3\5\n\6\2\u00d2\u00d4\7\23\2\2\u00d3\u00d2\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\7\33\2\2\u00da\r\3\2\2\2\u00db\u00e7\5\20\t\2\u00dc\u00e7\5\22"+
		"\n\2\u00dd\u00e7\5^\60\2\u00de\u00e7\5X-\2\u00df\u00e7\5 \21\2\u00e0\u00e7"+
		"\5$\23\2\u00e1\u00e2\7\26\2\2\u00e2\u00e3\5(\25\2\u00e3\u00e4\7\27\2\2"+
		"\u00e4\u00e7\3\2\2\2\u00e5\u00e7\5h\65\2\u00e6\u00db\3\2\2\2\u00e6\u00dc"+
		"\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00de\3\2\2\2\u00e6\u00df\3\2\2\2\u00e6"+
		"\u00e0\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\17\3\2\2"+
		"\2\u00e8\u00e9\7\13\2\2\u00e9\u00eb\5\24\13\2\u00ea\u00ec\7\17\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ef\5\60"+
		"\31\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\21\3\2\2\2\u00f0\u00f1"+
		"\7\f\2\2\u00f1\u00f2\5\24\13\2\u00f2\23\3\2\2\2\u00f3\u00f4\7\26\2\2\u00f4"+
		"\u00f5\5\30\r\2\u00f5\u00f6\7\27\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f3\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fc\3\2\2\2\u00f9\u00fb\5\26\f\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\25\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0104\7\20\2\2\u0100\u0101"+
		"\7\26\2\2\u0101\u0102\5\30\r\2\u0102\u0103\7\27\2\2\u0103\u0105\3\2\2"+
		"\2\u0104\u0100\3\2\2\2\u0104\u0105\3\2\2\2\u0105\27\3\2\2\2\u0106\u010b"+
		"\5\32\16\2\u0107\u0108\7\22\2\2\u0108\u010a\5\32\16\2\u0109\u0107\3\2"+
		"\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\31\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0111\5\34\17\2\u010f\u0111\5\36"+
		"\20\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\33\3\2\2\2\u0112\u0116"+
		"\5\20\t\2\u0113\u0115\7\24\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2"+
		"\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011c\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0119\u011c\5h\65\2\u011a\u011c\5X-\2\u011b\u0112\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\35\3\2\2\2\u011d\u011e\7\30\2"+
		"\2\u011e\u0123\5\34\17\2\u011f\u0120\7\23\2\2\u0120\u0122\5\34\17\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\31\2\2\u0127"+
		"\37\3\2\2\2\u0128\u0129\7\30\2\2\u0129\u0136\7\31\2\2\u012a\u012b\7\30"+
		"\2\2\u012b\u0130\5\"\22\2\u012c\u012d\7\23\2\2\u012d\u012f\5\"\22\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\31\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u0128\3\2\2\2\u0135\u012a\3\2\2\2\u0136!\3\2\2\2"+
		"\u0137\u013a\5@!\2\u0138\u013a\5F$\2\u0139\u0137\3\2\2\2\u0139\u0138\3"+
		"\2\2\2\u013a#\3\2\2\2\u013b\u0144\7\32\2\2\u013c\u0141\5&\24\2\u013d\u013e"+
		"\7\23\2\2\u013e\u0140\5&\24\2\u013f\u013d\3\2\2\2\u0140\u0143\3\2\2\2"+
		"\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0144\u013c\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\7\33\2\2\u0147%\3\2\2\2\u0148\u014c\5(\25\2\u0149\u014c\5\"\22"+
		"\2\u014a\u014c\5\20\t\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014a\3\2\2\2\u014c\'\3\2\2\2\u014d\u014e\5\n\6\2\u014e\u014f\5\"\22"+
		"\2\u014f)\3\2\2\2\u0150\u0165\5\16\b\2\u0151\u0152\7\26\2\2\u0152\u0153"+
		"\5\64\33\2\u0153\u0154\7\27\2\2\u0154\u0165\3\2\2\2\u0155\u0165\5.\30"+
		"\2\u0156\u0157\7\30\2\2\u0157\u015c\5\u008aF\2\u0158\u0159\7\23\2\2\u0159"+
		"\u015b\5\u008aF\2\u015a\u0158\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f"+
		"\u0160\7\31\2\2\u0160\u0161\7\26\2\2\u0161\u0162\5\64\33\2\u0162\u0163"+
		"\7\27\2\2\u0163\u0165\3\2\2\2\u0164\u0150\3\2\2\2\u0164\u0151\3\2\2\2"+
		"\u0164\u0155\3\2\2\2\u0164\u0156\3\2\2\2\u0165+\3\2\2\2\u0166\u0167\7"+
		"\n\2\2\u0167\u0169\5\24\13\2\u0168\u016a\7\17\2\2\u0169\u0168\3\2\2\2"+
		"\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u016d\5\60\31\2\u016c\u016b"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u0170\7\6\2\2\u016f"+
		"\u0166\3\2\2\2\u016f\u016e\3\2\2\2\u0170-\3\2\2\2\u0171\u0172\5\u008a"+
		"F\2\u0172\u0174\5\24\13\2\u0173\u0175\7\17\2\2\u0174\u0173\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0178\5\60\31\2\u0177\u0176\3"+
		"\2\2\2\u0177\u0178\3\2\2\2\u0178/\3\2\2\2\u0179\u017a\7\r\2\2\u017a\u017f"+
		"\7\32\2\2\u017b\u017d\5\62\32\2\u017c\u017e\7\23\2\2\u017d\u017c\3\2\2"+
		"\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017b\3\2\2\2\u0180\u0181"+
		"\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\7\33\2\2\u0184\61\3\2\2\2\u0185\u0188\5\n\6\2\u0186\u0189\5F$\2"+
		"\u0187\u0189\5.\30\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189\63"+
		"\3\2\2\2\u018a\u018e\58\35\2\u018b\u018d\5\66\34\2\u018c\u018b\3\2\2\2"+
		"\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0197"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0193\5\66\34\2\u0192\u0191\3\2\2\2"+
		"\u0193\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197"+
		"\3\2\2\2\u0196\u018a\3\2\2\2\u0196\u0192\3\2\2\2\u0197\65\3\2\2\2\u0198"+
		"\u0199\5J&\2\u0199\u019a\58\35\2\u019a\67\3\2\2\2\u019b\u019d\5:\36\2"+
		"\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u01a2\7\6\2\2\u01a1\u019c\3\2\2\2\u01a1"+
		"\u01a0\3\2\2\2\u01a29\3\2\2\2\u01a3\u01a8\5> \2\u01a4\u01a8\5B\"\2\u01a5"+
		"\u01a8\5@!\2\u01a6\u01a8\5<\37\2\u01a7\u01a3\3\2\2\2\u01a7\u01a4\3\2\2"+
		"\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8;\3\2\2\2\u01a9\u01aa"+
		"\5F$\2\u01aa\u01ab\7\t\2\2\u01ab=\3\2\2\2\u01ac\u01ad\5\b\5\2\u01ad?\3"+
		"\2\2\2\u01ae\u01af\5F$\2\u01af\u01b0\7\b\2\2\u01b0\u01b1\7#\2\2\u01b1"+
		"A\3\2\2\2\u01b2\u01b3\5F$\2\u01b3\u01b4\7\b\2\2\u01b4\u01b6\3\2\2\2\u01b5"+
		"\u01b2\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\5D"+
		"#\2\u01b8C\3\2\2\2\u01b9\u01ba\7$\2\2\u01ba\u01bc\7\61\2\2\u01bb\u01b9"+
		"\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\7\r\2\2\u01be"+
		"\u01c0\5\u008aF\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1"+
		"\3\2\2\2\u01c1\u01c2\5\24\13\2\u01c2\u01c3\7\16\2\2\u01c3\u01c4\5\"\22"+
		"\2\u01c4\u01c5\7\22\2\2\u01c5E\3\2\2\2\u01c6\u01cc\5\16\b\2\u01c7\u01c8"+
		"\5\16\b\2\u01c8\u01c9\5H%\2\u01c9\u01cc\3\2\2\2\u01ca\u01cc\5(\25\2\u01cb"+
		"\u01c6\3\2\2\2\u01cb\u01c7\3\2\2\2\u01cb\u01ca\3\2\2\2\u01ccG\3\2\2\2"+
		"\u01cd\u01ce\7\b\2\2\u01ce\u01d0\5*\26\2\u01cf\u01d1\5H%\2\u01d0\u01cf"+
		"\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d7\3\2\2\2\u01d2\u01d4\7\24\2\2"+
		"\u01d3\u01d5\5H%\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7"+
		"\3\2\2\2\u01d6\u01cd\3\2\2\2\u01d6\u01d2\3\2\2\2\u01d7I\3\2\2\2\u01d8"+
		"\u01da\7\34\2\2\u01d9\u01db\7\25\2\2\u01da\u01d9\3\2\2\2\u01da\u01db\3"+
		"\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01e1\5L\'\2\u01dd\u01de\7\61\2\2\u01de"+
		"\u01e0\5L\'\2\u01df\u01dd\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2"+
		"\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4"+
		"\u01e5\7\62\2\2\u01e5K\3\2\2\2\u01e6\u01e8\5N(\2\u01e7\u01e6\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01ec\3\2\2\2\u01e9\u01eb\5R*\2\u01ea\u01e9\3\2\2"+
		"\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01edM"+
		"\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u0215\5\20\t\2\u01f0\u0215\5h\65\2"+
		"\u01f1\u0215\5P)\2\u01f2\u0215\5^\60\2\u01f3\u01fb\7\32\2\2\u01f4\u01f5"+
		"\5\n\6\2\u01f5\u01f7\5J&\2\u01f6\u01f8\7\23\2\2\u01f7\u01f6\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f4\3\2\2\2\u01fa\u01fd\3\2"+
		"\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd"+
		"\u01fb\3\2\2\2\u01fe\u0215\7\33\2\2\u01ff\u0201\7\30\2\2\u0200\u0202\5"+
		"J&\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0207\3\2\2\2\u0203"+
		"\u0204\7\23\2\2\u0204\u0206\5J&\2\u0205\u0203\3\2\2\2\u0206\u0209\3\2"+
		"\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u020a\u0212\7\31\2\2\u020b\u020e\7\26\2\2\u020c\u020f\5"+
		"P)\2\u020d\u020f\5h\65\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0211\7\27\2\2\u0211\u0213\3\2\2\2\u0212\u020b\3"+
		"\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u01ef\3\2\2\2\u0214"+
		"\u01f0\3\2\2\2\u0214\u01f1\3\2\2\2\u0214\u01f2\3\2\2\2\u0214\u01f3\3\2"+
		"\2\2\u0214\u01ff\3\2\2\2\u0215O\3\2\2\2\u0216\u0218\5T+\2\u0217\u0216"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\7$\2\2\u021a"+
		"\u021c\5V,\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021cQ\3\2\2\2\u021d"+
		"\u021e\7\63\2\2\u021e\u021f\5F$\2\u021f\u0220\5J&\2\u0220\u0221\7\27\2"+
		"\2\u0221S\3\2\2\2\u0222\u0226\5\20\t\2\u0223\u0226\5h\65\2\u0224\u0226"+
		"\5^\60\2\u0225\u0222\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0224\3\2\2\2\u0226"+
		"\u0228\3\2\2\2\u0227\u0229\7\25\2\2\u0228\u0227\3\2\2\2\u0228\u0229\3"+
		"\2\2\2\u0229U\3\2\2\2\u022a\u022c\7\25\2\2\u022b\u022a\3\2\2\2\u022b\u022c"+
		"\3\2\2\2\u022c\u0230\3\2\2\2\u022d\u0231\5\20\t\2\u022e\u0231\5h\65\2"+
		"\u022f\u0231\5^\60\2\u0230\u022d\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u022f"+
		"\3\2\2\2\u0231W\3\2\2\2\u0232\u0234\5T+\2\u0233\u0232\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\7$\2\2\u0236\u0238\5V,\2\u0237"+
		"\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u023a\7\16"+
		"\2\2\u023a\u023c\5h\65\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"Y\3\2\2\2\u023d\u0240\7,\2\2\u023e\u0240\5\\/\2\u023f\u023d\3\2\2\2\u023f"+
		"\u023e\3\2\2\2\u0240[\3\2\2\2\u0241\u0243\5j\66\2\u0242\u0241\3\2\2\2"+
		"\u0242\u0243\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\7-\2\2\u0245]\3\2"+
		"\2\2\u0246\u024a\7.\2\2\u0247\u0249\5`\61\2\u0248\u0247\3\2\2\2\u0249"+
		"\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2"+
		"\2\2\u024c\u024a\3\2\2\2\u024d\u024e\7:\2\2\u024e_\3\2\2\2\u024f\u0252"+
		"\5b\62\2\u0250\u0252\79\2\2\u0251\u024f\3\2\2\2\u0251\u0250\3\2\2\2\u0252"+
		"a\3\2\2\2\u0253\u0256\5f\64\2\u0254\u0256\5d\63\2\u0255\u0253\3\2\2\2"+
		"\u0255\u0254\3\2\2\2\u0256c\3\2\2\2\u0257\u0258\7\67\2\2\u0258\u0259\5"+
		"h\65\2\u0259\u025a\7\21\2\2\u025ae\3\2\2\2\u025b\u026b\78\2\2\u025c\u025e"+
		"\7\r\2\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f"+
		"\u0261\5\u008aF\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262"+
		"\3\2\2\2\u0262\u0264\5\24\13\2\u0263\u0265\7\17\2\2\u0264\u0263\3\2\2"+
		"\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u0268\5\60\31\2\u0267"+
		"\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026c\3\2\2\2\u0269\u026a\7\16"+
		"\2\2\u026a\u026c\5\16\b\2\u026b\u025d\3\2\2\2\u026b\u0269\3\2\2\2\u026c"+
		"\u026e\3\2\2\2\u026d\u026f\5H%\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2"+
		"\2\u026f\u0272\3\2\2\2\u0270\u0271\7\b\2\2\u0271\u0273\7#\2\2\u0272\u0270"+
		"\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\7\21\2\2"+
		"\u0275g\3\2\2\2\u0276\u0277\b\65\1\2\u0277\u0281\5Z.\2\u0278\u0279\7\26"+
		"\2\2\u0279\u027a\5\"\22\2\u027a\u027b\7\27\2\2\u027b\u0281\3\2\2\2\u027c"+
		"\u027e\5j\66\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2"+
		"\2\2\u027f\u0281\5\20\t\2\u0280\u0276\3\2\2\2\u0280\u0278\3\2\2\2\u0280"+
		"\u027d\3\2\2\2\u0281\u028c\3\2\2\2\u0282\u0283\f\4\2\2\u0283\u0284\5l"+
		"\67\2\u0284\u0285\5h\65\5\u0285\u028b\3\2\2\2\u0286\u0287\f\3\2\2\u0287"+
		"\u0288\5j\66\2\u0288\u0289\5h\65\4\u0289\u028b\3\2\2\2\u028a\u0282\3\2"+
		"\2\2\u028a\u0286\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028di\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0290\t\3\2\2"+
		"\u0290k\3\2\2\2\u0291\u0292\t\4\2\2\u0292m\3\2\2\2\u0293\u0295\5B\"\2"+
		"\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u029a"+
		"\5r:\2\u0297\u0299\5p9\2\u0298\u0297\3\2\2\2\u0299\u029c\3\2\2\2\u029a"+
		"\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029bo\3\2\2\2\u029c\u029a\3\2\2\2"+
		"\u029d\u029e\5\n\6\2\u029e\u029f\5r:\2\u029fq\3\2\2\2\u02a0\u02a2\5\u0080"+
		"A\2\u02a1\u02a0\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4\u02ac\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a8\5\u0088"+
		"E\2\u02a7\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02ad\5v<\2\u02ac\u02a7\3\2\2"+
		"\2\u02ac\u02ab\3\2\2\2\u02ads\3\2\2\2\u02ae\u02c0\5z>\2\u02af\u02b0\7"+
		"\30\2\2\u02b0\u02b1\5r:\2\u02b1\u02b2\7\31\2\2\u02b2\u02c0\3\2\2\2\u02b3"+
		"\u02b7\7\32\2\2\u02b4\u02b6\5\u0080A\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9"+
		"\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9"+
		"\u02b7\3\2\2\2\u02ba\u02bc\5v<\2\u02bb\u02ba\3\2\2\2\u02bb\u02bc\3\2\2"+
		"\2\u02bc\u02bd\3\2\2\2\u02bd\u02c0\7\33\2\2\u02be\u02c0\5\20\t\2\u02bf"+
		"\u02ae\3\2\2\2\u02bf\u02af\3\2\2\2\u02bf\u02b3\3\2\2\2\u02bf\u02be\3\2"+
		"\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02c3\5H%\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3"+
		"\3\2\2\2\u02c3u\3\2\2\2\u02c4\u02c9\5x=\2\u02c5\u02c6\7\23\2\2\u02c6\u02c8"+
		"\5x=\2\u02c7\u02c5\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02caw\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02ce\5\u0080"+
		"A\2\u02cd\u02cc\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf"+
		"\u02d0\3\2\2\2\u02d0\u02d4\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d5\5z"+
		">\2\u02d3\u02d5\5\u0084C\2\u02d4\u02d2\3\2\2\2\u02d4\u02d3\3\2\2\2\u02d5"+
		"y\3\2\2\2\u02d6\u02d8\7\34\2\2\u02d7\u02d9\7\25\2\2\u02d8\u02d7\3\2\2"+
		"\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02df\5|?\2\u02db\u02dc"+
		"\7\61\2\2\u02dc\u02de\5|?\2\u02dd\u02db\3\2\2\2\u02de\u02e1\3\2\2\2\u02df"+
		"\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02df\3\2"+
		"\2\2\u02e2\u02e4\7\62\2\2\u02e3\u02e5\5~@\2\u02e4\u02e3\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5{\3\2\2\2\u02e6\u02e9\5\u008aF\2\u02e7\u02e9\5^\60"+
		"\2\u02e8\u02e6\3\2\2\2\u02e8\u02e7\3\2\2\2\u02e9}\3\2\2\2\u02ea\u02f3"+
		"\7%\2\2\u02eb\u02f3\7\'\2\2\u02ec\u02f3\7*\2\2\u02ed\u02f0\7+\2\2\u02ee"+
		"\u02f1\7-\2\2\u02ef\u02f1\5\20\t\2\u02f0\u02ee\3\2\2\2\u02f0\u02ef\3\2"+
		"\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02ea\3\2\2\2\u02f2\u02eb\3\2\2\2\u02f2"+
		"\u02ec\3\2\2\2\u02f2\u02ed\3\2\2\2\u02f3\177\3\2\2\2\u02f4\u02f6\7\26"+
		"\2\2\u02f5\u02f7\5\u0082B\2\u02f6\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8"+
		"\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\7\27"+
		"\2\2\u02fb\u0081\3\2\2\2\u02fc\u02fd\7\7\2\2\u02fd\u02ff\5\n\6\2\u02fe"+
		"\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0308\5t"+
		";\2\u0301\u0302\5t;\2\u0302\u0303\7\b\2\2\u0303\u0305\3\2\2\2\u0304\u0301"+
		"\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\5D#\2\u0307"+
		"\u02fe\3\2\2\2\u0307\u0304\3\2\2\2\u0308\u0083\3\2\2\2\u0309\u030c\5\n"+
		"\6\2\u030a\u030c\5\u0086D\2\u030b\u0309\3\2\2\2\u030b\u030a\3\2\2\2\u030c"+
		"\u0310\3\2\2\2\u030d\u030f\5\u0080A\2\u030e\u030d\3\2\2\2\u030f\u0312"+
		"\3\2\2\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313\3\2\2\2\u0312"+
		"\u0310\3\2\2\2\u0313\u0315\5\u0088E\2\u0314\u0316\7\23\2\2\u0315\u0314"+
		"\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0085\3\2\2\2\u0317\u0318\5z>\2\u0318"+
		"\u0319\7\16\2\2\u0319\u0087\3\2\2\2\u031a\u031d\5t;\2\u031b\u031d\5\u0080"+
		"A\2\u031c\u031a\3\2\2\2\u031c\u031b\3\2\2\2\u031d\u0321\3\2\2\2\u031e"+
		"\u0320\5\u0080A\2\u031f\u031e\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f"+
		"\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0089\3\2\2\2\u0323\u0321\3\2\2\2\u0324"+
		"\u0327\7/\2\2\u0325\u0327\5\u008cG\2\u0326\u0324\3\2\2\2\u0326\u0325\3"+
		"\2\2\2\u0327\u008b\3\2\2\2\u0328\u0329\t\5\2\2\u0329\u008d\3\2\2\2s\u008f"+
		"\u0094\u009b\u00b2\u00bb\u00c4\u00ca\u00d3\u00d7\u00e6\u00eb\u00ee\u00f7"+
		"\u00fc\u0104\u010b\u0110\u0116\u011b\u0123\u0130\u0135\u0139\u0141\u0144"+
		"\u014b\u015c\u0164\u0169\u016c\u016f\u0174\u0177\u017d\u0181\u0188\u018e"+
		"\u0194\u0196\u019e\u01a1\u01a7\u01b5\u01bb\u01bf\u01cb\u01d0\u01d4\u01d6"+
		"\u01da\u01e1\u01e7\u01ec\u01f7\u01fb\u0201\u0207\u020e\u0212\u0214\u0217"+
		"\u021b\u0225\u0228\u022b\u0230\u0233\u0237\u023b\u023f\u0242\u024a\u0251"+
		"\u0255\u025d\u0260\u0264\u0267\u026b\u026e\u0272\u027d\u0280\u028a\u028c"+
		"\u0294\u029a\u02a3\u02a9\u02ac\u02b7\u02bb\u02bf\u02c2\u02c9\u02cf\u02d4"+
		"\u02d8\u02df\u02e4\u02e8\u02f0\u02f2\u02f8\u02fe\u0304\u0307\u030b\u0310"+
		"\u0315\u031c\u0321\u0326";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}