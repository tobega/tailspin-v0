parser grammar TailspinParser;

options { tokenVocab = TailspinLexer; }

program: statement (statement)* EOF;

statement: Def Key valueChain                   # definition
  | valueChain To sink                                   # valueChainToSink
  | StartTemplatesDefinition IDENTIFIER parameterDefinitions? templatesBody EndDefinition IDENTIFIER # templatesDefinition
  | StartProcessorDefinition IDENTIFIER parameterDefinitions? block EndDefinition IDENTIFIER # processorDefinition
  | StartComposerDefinition IDENTIFIER composerBody EndDefinition IDENTIFIER # composerDefinition
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

dereferenceValue: Dereference reference message?;

reference: (LeftParen arrayReference RightParen)? structureReference*;

structureReference: FieldReference (LeftParen arrayReference RightParen)?;

arrayReference: dimensionReference (SemiColon dimensionReference)*;

dimensionReference: dereferenceValue|arithmeticExpression|rangeLiteral|arrayLiteral;

message: Message (At parameterValues)?;

arrayLiteral: LeftBracket RightBracket | LeftBracket valueProduction (Comma valueProduction)* RightBracket;

valueProduction: sendToTemplates | valueChain;

structureLiteral: LeftBrace (keyValues Comma?)* RightBrace;

keyValues: keyValue
  | valueChain Deconstructor
  | dereferenceValue
;

keyValue: Key valueProduction;

templates: source                        # literalTemplates
  | LeftParen templatesBody RightParen   # inlineTemplates
  | transformCall                        # callDefinedTransform
  | LeftBracket IDENTIFIER (Comma IDENTIFIER)* RightBracket LeftParen templatesBody RightParen # arrayTemplates
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
stateAssignment: valueChain To Deconstructor? (At|NamedAt) reference;

valueChain: source
  | source transform
  | keyValue
;

transform: To templates transform?
  | Deconstructor transform?
;

matcher: StartMatcher condition (Else condition)* EndMatcher;

condition: typeMatch? suchThat*;

typeMatch: dereferenceValue           # objectEquals
  | arithmeticExpression              # integerEquals
  | lowerBound? Range upperBound?     # rangeMatch
  | stringLiteral                          # regexpMatch
  | LeftBrace (Key matcher Comma?)* RightBrace # structureMatch
  | Invert condition                  # invertMatch
  | LeftBracket RightBracket (LeftParen arithmeticExpression? Range? arithmeticExpression? RightParen)?         # arrayMatch
;

suchThat: BeginSuchThat valueChain matcher RightParen;

lowerBound: (dereferenceValue|arithmeticExpression|stringLiteral) Invert?;

upperBound: Invert? (dereferenceValue|arithmeticExpression|stringLiteral);

rangeLiteral: lowerBound? Range upperBound? (Colon arithmeticExpression)?;

integerLiteral: Zero | nonZeroInteger;

nonZeroInteger: additiveOperator? PositiveInteger;

stringLiteral: START_STRING stringContent* END_STRING;

stringContent: stringInterpolate | STRING_TEXT;

stringInterpolate: interpolateEvaluate|(dereferenceValue EndStringInterpolate);

interpolateEvaluate: StartStringEvaluate valueChain RightParen;

sink: Stdout | Void;

arithmeticExpression: integerLiteral
  | LeftParen valueChain RightParen
  | additiveOperator? dereferenceValue
  | arithmeticExpression multiplicativeOperator arithmeticExpression
  | arithmeticExpression additiveOperator arithmeticExpression
;

additiveOperator: Plus | Minus;

multiplicativeOperator: Star | Slash | Mod;

composerBody: compositionSequence definedCompositionSequence*
;

definedCompositionSequence: Key compositionSequence
;

compositionSequence: compositionSkipRule* compositionComponent+
;

compositionMatcher: StartMatcher Invert? IDENTIFIER EndMatcher multiplier?
  | StartMatcher Invert? stringLiteral EndMatcher multiplier?
  | LeftBracket compositionSequence RightBracket
  | LeftBrace compositionSkipRule* compositionKeyValue+ RightBrace
  | Dereference
;

multiplier: Plus | Star | Question
  | Equal (PositiveInteger|Dereference)
;

compositionSkipRule: LeftParen compositionCapture+ RightParen;

compositionCapture: (Def Key)? compositionMatcher;

compositionKeyValue: Key compositionSkipRule* compositionComponent Comma?;

compositionComponent: compositionMatcher compositionSkipRule*;