parser grammar TailspinParser;

options { tokenVocab = TailspinLexer; }

program: useModule* inclusion* statement (statement)* EOF;

inclusion: Include (localIdentifier From)? stringLiteral;

statement: Def key valueProduction SemiColon                  # definition
  | valueChain To sink                                   # valueChainToSink
  | (StartTemplatesDefinition|StartSinkDefinition|StartSourceDefinition) localIdentifier parameterDefinitions? templatesBody EndDefinition localIdentifier # templatesDefinition
  | StartProcessorDefinition localIdentifier parameterDefinitions? block EndDefinition localIdentifier # processorDefinition
  | StartComposerDefinition localIdentifier parameterDefinitions? composerBody EndDefinition localIdentifier # composerDefinition
  | StartTestDefinition stringLiteral useModule* programModification? testBody EndDefinition stringLiteral # testDefinition
  | StartOperatorDefinition LeftParen localIdentifier localIdentifier parameterDefinitions? localIdentifier RightParen templatesBody EndDefinition localIdentifier # operatorDefinition
  | StereotypeDefinition localIdentifier matcher # stereotypeDefinition
;

key: localIdentifier Colon;

parameterDefinitions: And LeftBrace (key Comma?)+ RightBrace;

source: sourceReference
  | stringLiteral
  | rangeLiteral
  | arrayLiteral
  | relationLiteral
  | structureLiteral
  | bytesLiteral
  | LeftParen keyValue RightParen
  | arithmeticExpression
  | operatorExpression
;

sourceReference: (SourceMarker anyIdentifier? | Reflexive) reference Message? parameterValues?
  | DeleteMarker stateIdentifier reference;

reference: lens? structureReference*;

structureReference: FieldReference lens?;

lens: LeftParen dimensionReference (SemiColon dimensionReference)*  RightParen;

dimensionReference: simpleDimension|multiValueDimension|projection|key;

simpleDimension: sourceReference|arithmeticExpression|rangeLiteral;

multiValueDimension: LeftBracket simpleDimension (Comma simpleDimension)* RightBracket;

projection: LeftBrace ((key|keyValue) Comma?)+ RightBrace;

arrayLiteral: LeftBracket RightBracket | LeftBracket valueProduction (Comma valueProduction)* RightBracket;

valueProduction: sendToTemplates | valueChain;

structureLiteral: LeftBrace (keyValues (Comma keyValues)*)? RightBrace;

relationLiteral: LeftBrace LeftBracket (structures (Comma structures)*)? RightBracket RightBrace;

bytesLiteral: StartBytes byteValue (byteValue)* EndBytes;

byteValue: Bytes | term;

structures: structureLiteral
  | valueProduction
  | sourceReference
;

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

parameterValues: And LeftBrace (parameterValue Comma?)+ RightBrace;

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
  | (localIdentifier|externalIdentifier) # stereotypeMatch
;

structureContentMatcher: matcher | Void;

arrayContentMatcher: matcher multiplier?;

literalMatch: Equal source;

rangeBounds: lowerBound? Range upperBound?;

condition: BeginCondition valueChain matcher RightParen;

lowerBound: (sourceReference|arithmeticExpression|stringLiteral|term) Invert?;

upperBound: Invert? (sourceReference|arithmeticExpression|stringLiteral|term);

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
  | LeftParen arithmeticExpression RightParen
  | additiveOperator? sourceReference
  | arithmeticExpression multiplicativeOperator arithmeticExpression
  | arithmeticExpression additiveOperator arithmeticExpression
  | arithmeticContextKeyword
  | arithmeticExpression multiplicativeOperator term
  | arithmeticExpression additiveOperator term
  | termArithmeticOperation
;

termArithmeticOperation: term multiplicativeOperator (term|arithmeticExpression)
  | term additiveOperator (term|arithmeticExpression)
;

additiveOperator: Plus | Minus;

multiplicativeOperator: Star | TruncateDivide | Mod;

term: LeftParen valueProduction RightParen|operatorExpression;

operatorExpression: LeftParen operand templatesReference operand RightParen;

operand: source | term;

composerBody: stateAssignment? compositionSequence definedCompositionSequence*
;

definedCompositionSequence: Rule key compositionSequence
;

compositionSequence: compositionComponents
| compositionSkipRule+
;

compositionComponents: compositionSkipRule* compositionComponent (Comma? compositionComponents)?;

compositionComponent: compositionMatcher transform? compositionSkipRule*;

compositionMatcher: tokenMatcher
  | LeftBracket (compositionSequence|compositionSkipRule)? RightBracket
  | LeftBrace (structureMemberMatchers|compositionSkipRule)? RightBrace
  | source
  | compositionKeyValue
;

structureMemberMatchers: compositionSkipRule* structureMemberMatcher (Comma? structureMemberMatchers)?;

structureMemberMatcher: (tokenMatcher|compositionKeyValue) compositionSkipRule*;

tokenMatcher: StartMatcher Invert? compositionToken (Else compositionToken)* EndMatcher multiplier?;

compositionToken: (literalComposition|localIdentifier|stringLiteral);

literalComposition: Equal (sourceReference|stringLiteral);

multiplier: Plus | Star | Question
  | Equal (PositiveInteger|sourceReference)
;

compositionSkipRule: LeftParen compositionCapture+ RightParen;

compositionCapture: (Def key compositionMatcher transform? SemiColon)|(compositionMatcher (transform? To stateSink)?)|stateAssignment;

compositionKeyValue: (key|compositionKey) compositionSkipRule* compositionComponent;

compositionKey: tokenMatcher Colon;

localIdentifier: IDENTIFIER | keyword;

stateIdentifier: STATE_IDENTIFIER;

externalIdentifier: localIdentifier (Slash localIdentifier)+;

anyIdentifier: stateIdentifier | localIdentifier | externalIdentifier;

arithmeticContextKeyword: First
  | Last
;

keyword: Include
  | Def
  | StartTemplatesDefinition
  | StartSourceDefinition
  | StartSinkDefinition
  | StartComposerDefinition
  | StartProcessorDefinition
  | StartOperatorDefinition
  | EndDefinition
  | StereotypeDefinition
  | Mod
  | Rule
  | When
  | Do
  | Otherwise
  | arithmeticContextKeyword
  | StartTestDefinition
  | Assert
  | With
  | Provided
  | Modified
  | Shadowed
  | From
  | Use
  | Program
  | Modify
;

testBody: testBlock+;

testBlock: statement* assertion+;

assertion: Assert valueChain matcher stringLiteral;

dependencyProvision: With moduleConfiguration+ Provided;

moduleConfiguration:
  (moduleIdentifier From)? Shadowed moduleIdentifier dependencyProvision? statement+ EndDefinition moduleIdentifier #moduleShadowing
  | moduleIdentifier Inherited (From moduleIdentifier)? #inheritModule
  | (moduleIdentifier From)? Modified stringLiteral dependencyProvision? statement+ EndDefinition stringLiteral #moduleModification
  | (moduleIdentifier From)? stringLiteral (StandAlone|dependencyProvision) #moduleImport
;

moduleIdentifier: CoreSystem | localIdentifier;

useModule: Use moduleConfiguration;

programModification: Modify Program statement+ EndDefinition Program;
