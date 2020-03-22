parser grammar TailspinParser;

options { tokenVocab = TailspinLexer; }

program: packageDefinition? dependency* statement (statement)* EOF;

packageDefinition: Package identifier;

dependency: Import stringLiteral;

statement: Def key valueProduction SemiColon                  # definition
  | valueChain To sink                                   # valueChainToSink
  | (StartTemplatesDefinition|StartSinkDefinition|StartSourceDefinition) identifier parameterDefinitions? templatesBody EndDefinition identifier # templatesDefinition
  | StartProcessorDefinition identifier parameterDefinitions? block EndDefinition identifier # processorDefinition
  | StartComposerDefinition identifier parameterDefinitions? composerBody EndDefinition identifier # composerDefinition
  | StartTestDefinition stringLiteral testBody EndDefinition stringLiteral # testDefinition
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

simpleDimension: sourceReference|arithmeticExpression|rangeLiteral;

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
  | Lambda identifier? LeftParen templatesBody Lambda identifier? RightParen # lambdaTemplates
  | templatesReference                        # callDefinedTransform
  | Lambda identifier? arrayIndexDecomposition LeftParen templatesBody Lambda identifier? RightParen # lambdaArrayTemplates
;

arrayIndexDecomposition: LeftBracket identifier (SemiColon identifier)* RightBracket;

sink: (SinkReference reference Message? parameterValues?) | Void;

templatesReference: (At | At? identifier) reference Message? parameterValues?;

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
stateAssignment: (valueChain To)? stateSink;

stateSink: (Range Else)? (At identifier?) reference Colon valueProduction SemiColon;

valueChain: source
  | source transform
  | keyValue
;

transform: To templates transform?
  | Deconstructor transform?
;

matcher: StartMatcher Invert? criterion (Else criterion)* EndMatcher;

criterion: (literalMatch | typeMatch)? condition*;

typeMatch: rangeBounds                       # rangeMatch
  | stringLiteral                          # regexpMatch
  | LeftBrace (key matcher Comma?)* RightBrace # structureMatch
  | LeftBracket matcher? (Comma matcher)* RightBracket (LeftParen (rangeBounds|arithmeticExpression) RightParen)?         # arrayMatch
;

literalMatch: Equal source;

rangeBounds: lowerBound? Range upperBound?;

condition: BeginCondition valueChain matcher RightParen;

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
  | additiveOperator? (sourceReference|deleteState)
  | arithmeticExpression multiplicativeOperator arithmeticExpression
  | arithmeticExpression additiveOperator arithmeticExpression
  | arithmeticContextKeyword
;

additiveOperator: Plus | Minus;

multiplicativeOperator: Star | TruncateDivide | Mod;

composerBody: stateAssignment? compositionSequence definedCompositionSequence*
;

definedCompositionSequence: Rule key compositionSequence
;

compositionSequence: compositionComponents
| compositionSkipRule+
;

compositionComponents: compositionSkipRule* compositionComponent (Comma? compositionComponents)?;

compositionComponent: compositionMatcher compositionSkipRule*;

compositionMatcher: (tokenMatcher
  | LeftBracket (compositionSequence|compositionSkipRule)? RightBracket
  | LeftBrace (structureMemberMatchers|compositionSkipRule)? RightBrace
  | sourceReference
  | compositionKeyValue) transform?
;

structureMemberMatchers: compositionSkipRule* structureMemberMatcher (Comma? structureMemberMatchers)?;

structureMemberMatcher: (tokenMatcher|compositionKeyValue) compositionSkipRule*;

tokenMatcher: StartMatcher Invert? compositionToken (Else compositionToken)* EndMatcher multiplier?;

compositionToken: (identifier|stringLiteral);

multiplier: Plus | Star | Question
  | Equal (PositiveInteger|sourceReference)
;

compositionSkipRule: LeftParen compositionCapture+ RightParen;

compositionCapture: (Def key compositionMatcher SemiColon)|(compositionMatcher (To stateSink)?)|stateAssignment;

compositionKeyValue: (key|compositionKey) compositionSkipRule* compositionComponent;

compositionKey: tokenMatcher Colon;

identifier: IDENTIFIER | keyword;

arithmeticContextKeyword: First
  | Last
;

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
  | Rule
  | arithmeticContextKeyword
;

testBody: assertion+;

assertion: Assert valueChain matcher stringLiteral;
