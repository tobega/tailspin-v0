parser grammar TailspinParser;

options { tokenVocab = TailspinLexer; }

program: statement (statement)* EOF;

statement: Def Key valueChain                   # definition
  | valueChain To sink                                   # valueChainToSink
  | StartTemplatesDefinition IDENTIFIER parameterDefinitions? templatesBody EndDefinition IDENTIFIER # templatesDefinition
  | StartProcessorDefinition IDENTIFIER block EndDefinition IDENTIFIER # processorDefinition
  | StartComposerDefinition ComposerId composerBody ComposerEndDefinition IDENTIFIER # composerDefinition
;

parameterDefinitions: At LeftBrace (Key Comma?)+ RightBrace;

source: Stdin
  | dereferenceValue
  | stringLiteral
  | rangeLiteral
  | arrayLiteral
  | structureLiteral
  | LeftParen valueChain RightParen
  | arithmeticExpression
;

dereferenceValue: Dereference structureDereference*  Message?
  | StartArrayDereference arrayDereference RightParen structureDereference*  Message?;

structureDereference: FieldDereference* (FieldDereference | (FieldArrayDereference arrayDereference RightParen));

arrayDereference: dimensionDereference (SemiColon dimensionDereference)*;

dimensionDereference: dereferenceValue|arithmeticExpression|rangeLiteral|arrayLiteral;

arrayLiteral: LeftBracket RightBracket | LeftBracket valueProduction (Comma valueProduction)* RightBracket;

valueProduction: sendToTemplates | valueChain;

structureLiteral: LeftBrace (keyValue Comma?)* RightBrace;

keyValue: Key valueProduction;

templates: source                        # literalTemplates
  | LeftParen templatesBody RightParen   # inlineTemplates
  | transformCall                        # callDefinedTransform
  | LeftBracket IDENTIFIER RightBracket LeftParen templatesBody RightParen # arrayTemplates
;

transformCall: IDENTIFIER (At parameterValues)?;

parameterValues: LeftBrace (parameterValue Comma?)+ RightBrace;

parameterValue: Key (valueChain|transformCall);

templatesBody: block matchTemplate*
  | matchTemplate+
;

matchTemplate: matcher block;

block: (blockExpression+ | Void);

blockExpression: blockStatement
  | stateAssignment
  | sendToTemplates
  | resultValue
;

resultValue: valueChain ResultMarker;
blockStatement: statement;
sendToTemplates: valueChain To TemplateMatch;
stateAssignment: valueChain To At IDENTIFIER?;

valueChain: source
  | source transform
  | keyValue
;

transform: To templates transform?
  | Deconstructor transform?
  | To Deconstructor collector transform?
;

collector: dereferenceValue
  | START_STRING END_STRING
  | structureLiteral
;

matcher: (StartMatcher|StartSubMatcher) condition (Else condition)* EndMatcher;

condition: typeMatch? suchThat*;

typeMatch: matchDereferenceValue           # objectEquals
  | matchArithmeticExpression              # integerEquals
  | lowerBound? RangeMatch upperBound?     # rangeMatch
  | stringLiteral                          # regexpMatch
  | StartStructureMatch (StructureKey matcher MatchComma?)* EndStructureMatch # structureMatch
  | InvertMatch condition                  # invertMatch
  | StartArrayMatch EndArrayMatch (MatchLeftParen arithmeticExpression? Range? arithmeticExpression? RightParen)?         # arrayMatch
;

suchThat: BeginSuchThat valueChain matcher RightParen;

lowerBound: (matchDereferenceValue|matchArithmeticExpression|stringLiteral) InvertMatch?;

upperBound: InvertMatch? (matchDereferenceValue|matchArithmeticExpression|stringLiteral);

matchArithmeticExpression: matchIntegerLiteral
  | matchDereferenceValue
  | MatchLeftParen arithmeticExpression RightParen;

matchIntegerLiteral: MatchAdditiveOperator? MatchInteger;

matchDereferenceValue: MatchDereference (MatchLeftParen arrayDereference RightParen)? matchStructureDereference* MatchMessage?;

matchStructureDereference: MatchFieldDereference+ (MatchLeftParen arrayDereference RightParen)?;

rangeLiteral: arithmeticExpression Invert? Range Invert? arithmeticExpression (Colon arithmeticExpression)?;

integerLiteral: Zero | nonZeroInteger;

nonZeroInteger: AdditiveOperator? PositiveInteger;

stringLiteral: (START_STRING|START_REGEXP) stringContent* END_STRING;

stringContent: stringInterpolate | STRING_TEXT;

stringInterpolate: interpolateEvaluate|interpolateDereferenceValue;

interpolateEvaluate: StartStringEvaluate valueChain RightParen;

interpolateDereferenceValue: StartStringInterpolate InterpolateIdentifier (InterpolateArray arrayDereference RightParen)? interpolateStructureDereference*  InterpolateMessage? EndInterpolate;

interpolateStructureDereference: InterpolateField+ (InterpolateArray arrayDereference RightParen)?;

sink: Stdout | Void;

arithmeticExpression: integerLiteral
  | LeftParen valueChain RightParen
  | AdditiveOperator? dereferenceValue
  | arithmeticExpression MultiplicativeOperator arithmeticExpression
  | arithmeticExpression AdditiveOperator arithmeticExpression
;

composerBody: compositionSequence definedCompositionSequence*
;

definedCompositionSequence: SequenceKey compositionSequence
;

compositionSequence: compositionSkipRule* compositionComponent+
;

compositionMatcher: StartComposerMatch InvertComposerMatch? ComposerId EndComposerMatch multiplier?
  | StartComposerMatch InvertComposerMatch? START_REGEX REGEX_TEXT END_REGEX EndComposerMatch multiplier?
  | StartBuildArray compositionSequence EndBuildArray
  | StartBuildStructure compositionSkipRule* compositionKeyValue+ EndBuildStructure
  | ComposeDereference
;

multiplier: Multiplier
  | CountMultiplier (ComposeInteger|ComposeDereference)
;

compositionSkipRule: StartSkipRule compositionCapture+ EndSkipRule;

compositionCapture: (ComposerDef SequenceKey)? compositionMatcher;

compositionKeyValue: SequenceKey compositionSkipRule* compositionComponent ValueSeparator?;

compositionComponent: compositionMatcher compositionSkipRule*;