parser grammar TailspinParser;

options { tokenVocab = TailspinLexer; }

program: packageDefinition? dependency* statement (statement)* EOF;

packageDefinition: Package identifier;

dependency: Import stringLiteral;

statement: Def key valueProduction SemiColon                  # definition
  | valueChain To sink                                   # valueChainToSink
  | StartTemplatesDefinition identifier parameterDefinitions? templatesBody EndDefinition identifier # templatesDefinition
  | StartProcessorDefinition identifier parameterDefinitions? block EndDefinition identifier # processorDefinition
  | StartComposerDefinition identifier composerBody EndDefinition identifier # composerDefinition
;

key: identifier Colon;

parameterDefinitions: At LeftBrace (key Comma?)+ RightBrace;

source: dereferenceValue
  | stringLiteral
  | rangeLiteral
  | arrayLiteral
  | structureLiteral
  | LeftParen keyValue RightParen
  | arithmeticExpression
;

dereferenceValue: (Dereference|DeleteState) reference message?;

reference: (LeftParen arrayReference RightParen)? structureReference*;

structureReference: FieldReference (LeftParen arrayReference RightParen)?;

arrayReference: dimensionReference (SemiColon dimensionReference)*;

dimensionReference: dereferenceValue|arithmeticExpression|rangeLiteral|arrayLiteral;

message: Message (At parameterValues)?;

arrayLiteral: LeftBracket RightBracket | LeftBracket valueProduction (Comma valueProduction)* RightBracket;

valueProduction: sendToTemplates | valueChain;

structureLiteral: LeftBrace (keyValues (Comma keyValues)*)? RightBrace;

keyValues: keyValue
  | valueProduction
  | dereferenceValue
;

keyValue: key valueProduction;

templates: source                        # literalTemplates
  | LeftParen templatesBody RightParen   # inlineTemplates
  | transformCall                        # callDefinedTransform
  | LeftBracket identifier (Comma identifier)* RightBracket LeftParen templatesBody RightParen # arrayTemplates
;

sink: (SinkReference reference message?) | Void;

transformCall: identifier (At parameterValues)?;

parameterValues: LeftBrace (parameterValue Comma?)+ RightBrace;

parameterValue: key (valueChain|transformCall);

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
stateAssignment: (valueChain To)? Merge? (At identifier?) reference Colon valueProduction SemiColon;

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
  | rangeBounds                       # rangeMatch
  | stringLiteral                          # regexpMatch
  | LeftBrace (key matcher Comma?)* RightBrace # structureMatch
  | Invert condition                  # invertMatch
  | LeftBracket RightBracket (LeftParen (rangeBounds|arithmeticExpression) RightParen)?         # arrayMatch
;

rangeBounds: lowerBound? Range upperBound?;

suchThat: BeginSuchThat valueChain matcher RightParen;

lowerBound: (dereferenceValue|arithmeticExpression|stringLiteral) Invert?;

upperBound: Invert? (dereferenceValue|arithmeticExpression|stringLiteral);

rangeLiteral: lowerBound? Range upperBound? (Colon arithmeticExpression)?;

integerLiteral: Zero | nonZeroInteger;

nonZeroInteger: additiveOperator? PositiveInteger;

stringLiteral: START_STRING stringContent* END_STRING;

stringContent: stringInterpolate | STRING_TEXT;

stringInterpolate: interpolateEvaluate|characterCode;

characterCode: StartCharacterCode arithmeticExpression EndStringInterpolate;

interpolateEvaluate: StartStringInterpolate (At? identifier? reference message? | Colon source)
  transform? (To TemplateMatch)? EndStringInterpolate;

arithmeticExpression: integerLiteral
  | LeftParen valueProduction RightParen
  | additiveOperator? dereferenceValue
  | arithmeticExpression multiplicativeOperator arithmeticExpression
  | arithmeticExpression additiveOperator arithmeticExpression
;

additiveOperator: Plus | Minus;

multiplicativeOperator: Star | Slash | Mod;

composerBody: compositionSequence definedCompositionSequence*
;

definedCompositionSequence: key compositionSequence
;

compositionSequence: compositionSkipRule* (compositionComponent+|structureMemberMatchers)
;

compositionMatcher: tokenMatcher
  | LeftBracket compositionSequence RightBracket transform?
  | LeftBrace compositionSkipRule* structureMemberMatchers? RightBrace transform?
  | Dereference
;

structureMemberMatchers: structureMemberMatcher (Comma structureMemberMatcher)*;

structureMemberMatcher: compositionSkipRule* (tokenMatcher|compositionKeyValue);

tokenMatcher: StartMatcher compositionToken (Else compositionToken)* EndMatcher multiplier? transform?;

compositionToken: Invert? (identifier|stringLiteral);

multiplier: Plus | Star | Question
  | Equal (PositiveInteger|Dereference)
;

compositionSkipRule: LeftParen compositionCapture+ RightParen;

compositionCapture: (Def key)? compositionMatcher;

compositionKeyValue: (key|compositionKey) compositionSkipRule* compositionComponent Comma?;

compositionKey: tokenMatcher Colon;

compositionComponent: (compositionMatcher|compositionSkipRule) compositionSkipRule*;

identifier: IDENTIFIER | keyword;

keyword: Package
  | Import
  | Def
  | StartTemplatesDefinition
  | StartComposerDefinition
  | StartProcessorDefinition
  | EndDefinition
  | Mod
;