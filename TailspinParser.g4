parser grammar TailspinParser;

options { tokenVocab = TailspinLexer; }

program: packageDefinition? dependency* statement (statement)* EOF;

packageDefinition: Package localIdentifier;

dependency: Import stringLiteral;

statement: Def key valueProduction SemiColon                  # definition
  | valueChain To sink                                   # valueChainToSink
  | (StartTemplatesDefinition|StartSinkDefinition|StartSourceDefinition) localIdentifier parameterDefinitions? templatesBody EndDefinition localIdentifier # templatesDefinition
  | StartProcessorDefinition localIdentifier parameterDefinitions? block EndDefinition localIdentifier # processorDefinition
  | StartComposerDefinition localIdentifier parameterDefinitions? composerBody EndDefinition localIdentifier # composerDefinition
  | StartTestDefinition stringLiteral dependencyProvision? testBody EndDefinition stringLiteral # testDefinition
;

key: localIdentifier Colon;

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

sourceReference: SourceMarker anyIdentifier? reference Message? parameterValues?;

deleteState: DeleteMarker stateIdentifier reference;

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
  | Lambda localIdentifier? LeftParen templatesBody Lambda localIdentifier? RightParen # lambdaTemplates
  | templatesReference                        # callDefinedTransform
  | Lambda localIdentifier? arrayIndexDecomposition LeftParen templatesBody Lambda localIdentifier? RightParen # lambdaArrayTemplates
;

arrayIndexDecomposition: LeftBracket localIdentifier (SemiColon localIdentifier)* RightBracket;

sink: ResultMarker ((anyIdentifier reference Message? parameterValues?) | Void);

templatesReference:  anyIdentifier reference Message? parameterValues?;

parameterValues: At LeftBrace (parameterValue Comma?)+ RightBrace;

parameterValue: key (valueChain|templatesReference);

templatesBody: block matchTemplate*
  | matchTemplate+
;

matchTemplate: matcher block | When? matcher Do? block | Otherwise block;

block: (blockExpression+ | (ResultMarker Void));

blockExpression: blockStatement
  | stateAssignment
  | sendToTemplates
  | resultValue
;

resultValue: valueChain ResultMarker;
blockStatement: statement;
sendToTemplates: valueChain To TemplateMatch;
stateAssignment: (valueChain To)? stateSink;

stateSink: (Range Else)? stateIdentifier reference Colon valueProduction SemiColon;

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
  | LeftBrace (key structureContentMatcher Comma?)* (Comma? Void)? RightBrace # structureMatch
  | LeftBracket arrayContentMatcher? (Comma arrayContentMatcher)* (Comma? Void)? RightBracket (LeftParen (rangeBounds|arithmeticExpression) RightParen)?         # arrayMatch
;

structureContentMatcher: matcher | Void;

arrayContentMatcher: matcher multiplier?;

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

interpolateEvaluate: StartStringInterpolate (anyIdentifier? reference Message? parameterValues? | Colon source)
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

compositionToken: (localIdentifier|stringLiteral);

multiplier: Plus | Star | Question
  | Equal (PositiveInteger|sourceReference)
;

compositionSkipRule: LeftParen compositionCapture+ RightParen;

compositionCapture: (Def key compositionMatcher SemiColon)|(compositionMatcher (To stateSink)?)|stateAssignment;

compositionKeyValue: (key|compositionKey) compositionSkipRule* compositionComponent;

compositionKey: tokenMatcher Colon;

localIdentifier: IDENTIFIER | keyword;

stateIdentifier: At localIdentifier?;

externalIdentifier: localIdentifier (Slash localIdentifier)+;

anyIdentifier: stateIdentifier | localIdentifier | externalIdentifier;

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
  | When
  | Do
  | Otherwise
  | arithmeticContextKeyword
;

testBody: testBlock+;

testBlock: statement* assertion+;

assertion: Assert valueChain matcher stringLiteral;

dependencyProvision: With moduleConfiguration+ Provided;

moduleConfiguration:
  Modified CoreSystem statement+ EndDefinition CoreSystem
;