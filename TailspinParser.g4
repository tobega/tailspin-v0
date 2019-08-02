parser grammar TailspinParser;

options { tokenVocab = TailspinLexer; }

program: packageDefinition? dependency* statement (statement)* EOF;

packageDefinition: Package identifier;

dependency: Import stringLiteral;

statement: Def key valueProduction SemiColon                  # definition
  | valueChain To sink                                   # valueChainToSink
  | (StartTemplatesDefinition|StartSinkDefinition|StartSourceDefinition) identifier parameterDefinitions? templatesBody EndDefinition identifier # templatesDefinition
  | StartProcessorDefinition identifier parameterDefinitions? block EndDefinition identifier # processorDefinition
  | StartComposerDefinition identifier composerBody EndDefinition identifier # composerDefinition
;

key: identifier Colon;

parameterDefinitions: At LeftBrace (key Comma?)+ RightBrace;

source: sourceReference
  | deleteState
  | stringLiteral
  | rangeLiteral
  | arrayLiteral
  | structureLiteral
  | LeftParen keyValue RightParen
  | arithmeticExpression
;

sourceReference: SourceReference reference Message? parameterValues?;

deleteState: DeleteState reference;

reference: (LeftParen arrayReference RightParen)? structureReference*;

structureReference: FieldReference (LeftParen arrayReference RightParen)?;

arrayReference: dimensionReference (SemiColon dimensionReference)*;

dimensionReference: simpleDimension|multiValueDimension;

simpleDimension: (sourceReference Deconstructor*)|arithmeticExpression|rangeLiteral;

multiValueDimension: LeftBracket simpleDimension (Comma simpleDimension)* RightBracket;

arrayLiteral: LeftBracket RightBracket | LeftBracket valueProduction (Comma valueProduction)* RightBracket;

valueProduction: sendToTemplates | valueChain;

structureLiteral: LeftBrace (keyValues (Comma keyValues)*)? RightBrace;

keyValues: keyValue
  | valueProduction
  | sourceReference
;

keyValue: key valueProduction;

templates: source                        # literalTemplates
  | LeftParen templatesBody RightParen   # inlineTemplates
  | templatesReference                        # callDefinedTransform
  | LeftBracket identifier (Comma identifier)* RightBracket LeftParen templatesBody RightParen # arrayTemplates
;

sink: (SinkReference reference Message? parameterValues?) | Void;

templatesReference: identifier reference Message? parameterValues?;

parameterValues: At LeftBrace (parameterValue Comma?)+ RightBrace;

parameterValue: key (valueChain|templatesReference);

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

typeMatch: sourceReference           # objectEquals
  | arithmeticExpression              # integerEquals
  | rangeBounds                       # rangeMatch
  | stringLiteral                          # regexpMatch
  | LeftBrace (key matcher Comma?)* RightBrace # structureMatch
  | Invert condition                  # invertMatch
  | LeftBracket RightBracket (LeftParen (rangeBounds|arithmeticExpression) RightParen)?         # arrayMatch
;

rangeBounds: lowerBound? Range upperBound?;

suchThat: BeginSuchThat valueChain matcher RightParen;

lowerBound: (sourceReference|arithmeticExpression|stringLiteral) Invert?;

upperBound: Invert? (sourceReference|arithmeticExpression|stringLiteral);

rangeLiteral: lowerBound? Range upperBound? (Colon arithmeticExpression)?;

integerLiteral: Zero | nonZeroInteger;

nonZeroInteger: additiveOperator? PositiveInteger;

stringLiteral: START_STRING stringContent* END_STRING;

stringContent: stringInterpolate | STRING_TEXT;

stringInterpolate: interpolateEvaluate|characterCode;

characterCode: StartCharacterCode arithmeticExpression EndStringInterpolate;

interpolateEvaluate: StartStringInterpolate (At? identifier? reference Message? parameterValues? | Colon source)
  transform? (To TemplateMatch)? EndStringInterpolate;

arithmeticExpression: integerLiteral
  | LeftParen valueProduction RightParen
  | additiveOperator? sourceReference
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
  | sourceReference
;

structureMemberMatchers: structureMemberMatcher (Comma structureMemberMatcher)*;

structureMemberMatcher: compositionSkipRule* (tokenMatcher|compositionKeyValue);

tokenMatcher: StartMatcher compositionToken (Else compositionToken)* EndMatcher multiplier? transform?;

compositionToken: Invert? (identifier|stringLiteral);

multiplier: Plus | Star | Question
  | Equal (PositiveInteger|sourceReference)
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
  | StartSourceDefinition
  | StartSinkDefinition
  | StartComposerDefinition
  | StartProcessorDefinition
  | EndDefinition
  | Mod
;