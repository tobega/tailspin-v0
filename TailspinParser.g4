parser grammar TailspinParser;

options { tokenVocab = TailspinLexer; }

program: statement (statement)* EOF;

statement: Def Key valueChain                   # definition
  | valueChain To sink                                   # valueChainToSink
  | StartTemplatesDefinition IDENTIFIER templatesBody EndDefinition IDENTIFIER # templatesDefinition
  | StartComposerDefinition ComposerId composerBody ComposerEndDefinition IDENTIFIER # composerDefinition
;

source: Stdin
  | dereferenceValue
  | stringLiteral
  | arithmeticExpression
  | rangeLiteral
  | arrayLiteral
  | structureLiteral
;

dereferenceValue: Dereference structureDereference*
  | StartArrayDereference arrayDereference RightParen structureDereference*;

structureDereference: FieldDereference* (FieldDereference | (FieldArrayDereference arrayDereference RightParen));

arrayDereference: dimensionDereference (SemiColon dimensionDereference)*;

dimensionDereference: NonZeroInteger|rangeLiteral|arrayLiteral|dereferenceValue;

arrayLiteral: LeftBracket RightBracket | LeftBracket valueProduction (Comma? valueProduction)* RightBracket;

valueProduction: sendToTemplates | valueChain;

structureLiteral: LeftBrace (keyValue Comma?)* RightBrace;

keyValue: Key valueProduction;

templates: source                        # literalTemplates
  | LeftParen templatesBody RightParen   # inlineTemplates
  | IDENTIFIER                           # callDefinedTransform
  | LeftBracket IDENTIFIER RightBracket LeftParen templatesBody RightParen # arrayTemplates
;

templatesBody: block matchTemplate*
  | matchTemplate+
;

matchTemplate: matcher block;

block: (blockExpression|sendToTemplates)+;

blockExpression: blockStatement
  | stateAssignment
  | sendToTemplates
  | resultValue
;

resultValue: valueChain ResultMarker;
blockStatement: statement;
sendToTemplates: valueChain To TemplateMatch;
stateAssignment: valueChain To Colon IDENTIFIER?;

valueChain: source
  | source transform
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

typeMatch: matchArithmeticExpression       # integerEquals
  | lowerBound? RangeMatch upperBound?     # rangeMatch
  | stringLiteral                          # regexpMatch
  | StartStructureMatch (StructureKey matcher MatchComma?)* EndStructureMatch # structureMatch
  | InvertMatch condition                  # invertMatch
  | StartArrayMatch EndArrayMatch (MatchArrayDereference arithmeticExpression? Range? arithmeticExpression? RightParen)?         # arrayMatch
;

suchThat: BeginSuchThat source matcher RightParen;

lowerBound: matchArithmeticExpression;

upperBound: matchArithmeticExpression;

matchArithmeticExpression: MatchInteger | matchDereferenceValue;

matchDereferenceValue: MatchDereference (MatchArrayDereference arrayDereference RightParen)? matchStructureDereference*;

matchStructureDereference: MatchFieldDereference+ (MatchArrayDereference arrayDereference RightParen)?;

rangeLiteral: arithmeticExpression Range arithmeticExpression (Colon arithmeticExpression)?;

integerLiteral: Zero | NonZeroInteger;

stringLiteral: (START_STRING|START_REGEXP) stringContent* END_STRING;

stringContent: stringInterpolate | STRING_TEXT;

stringInterpolate: interpolateEvaluate|interpolateDereferenceValue;

interpolateEvaluate: StartStringEvaluate valueChain RightParen;

interpolateDereferenceValue: StartStringInterpolate InterpolateIdentifier (InterpolateArray arrayDereference RightParen)? interpolateStructureDereference*  EndInterpolate;

interpolateStructureDereference: InterpolateField+ (InterpolateArray arrayDereference RightParen)?;

sink: Stdout;

arithmeticExpression: integerLiteral
  | LeftParen arithmeticExpression RightParen
  | AdditiveOperator? dereferenceValue
  | arithmeticExpression MultiplicativeOperator arithmeticExpression
  | arithmeticExpression AdditiveOperator arithmeticExpression
;

composerBody: compositionSequence
;

compositionSequence: compositionMatcher+
;

compositionMatcher: StartComposerMatch ComposerId EndComposerMatch Optional?
  | StartComposerMatch START_REGEX REGEX_TEXT END_REGEX EndComposerMatch Optional?
  | StartSkipRule compositionSequence EndSkipRule
  | StartBuildArray compositionSequence EndBuildArray
;