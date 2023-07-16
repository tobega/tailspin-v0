parser grammar TailspinParser;

options { tokenVocab = TailspinLexer; }

program: useModule* inclusion* statement (statement)* EOF;

inclusion: Include (localIdentifier From)? stringLiteral;

statement: definition
  | valueChainToSink
  | templatesDefinition
  | processorDefinition
  | composerDefinition
  | testDefinition
  | operatorDefinition
  | dataDeclaration
;

definition: Def key valueProduction SemiColon;

valueChainToSink: valueChain To sink;

templatesDefinition: (StartTemplatesDefinition|StartSinkDefinition|StartSourceDefinition) localIdentifier parameterDefinitions? localDataDeclaration? templatesBody EndDefinition localIdentifier;

processorDefinition: StartProcessorDefinition localIdentifier parameterDefinitions? localDataDeclaration? block typestateDefinition* EndDefinition localIdentifier;

typestateDefinition: StartStateDefinition localIdentifier messageDefinition* EndDefinition localIdentifier;

messageDefinition: templatesDefinition | processorDefinition | composerDefinition | operatorDefinition;

composerDefinition: StartComposerDefinition localIdentifier parameterDefinitions? localDataDeclaration? composerBody EndDefinition localIdentifier;

testDefinition: StartTestDefinition stringLiteral useModule* programModification? testBody EndDefinition stringLiteral;

operatorDefinition: StartOperatorDefinition LeftParen localIdentifier localIdentifier parameterDefinitions? localIdentifier RightParen localDataDeclaration? templatesBody EndDefinition localIdentifier;

dataDeclaration: DataDefinition dataDefinition (Comma dataDefinition)*;

dataDefinition: localIdentifier (symbolSet | matcher);

symbolSet: TemplateMatch LeftBrace localIdentifier (Comma localIdentifier)* RightBrace;

localDataDeclaration: DataDefinition localDataDefinition (Comma localDataDefinition)* LocalDefinition;

localDataDefinition: localIdentifier matcher?;

key: localIdentifier Colon;

parameterDefinitions: And LeftBrace (key Comma?)+ RightBrace;

source: rangeLiteral
  | sourceReference
  | stringLiteral
  | arrayLiteral
  | relationLiteral
  | structureLiteral
  | bytesLiteral
  | LeftParen keyValue RightParen
  | arithmeticValue
  | operatorExpression
  | taggedValue
  | symbolicValue
;

sourceReference: (SourceMarker anyIdentifier? | Reflexive) reference Message? parameterValues?
  | DeleteMarker stateIdentifier reference;

reference: lens? structureReference*;

structureReference: FieldReference lens?;

lens: LeftParen dimensionReference (SemiColon dimensionReference)*  RightParen;

dimensionReference: simpleDimension|multiValueDimension|projection|key|localIdentifier|grouping;

simpleDimension: sourceReference|arithmeticValue|rangeLiteral|taggedValue;

multiValueDimension: LeftBracket simpleDimension (Comma simpleDimension)* RightBracket;

projection: LeftBrace ((key|keyValue) (Comma (key|keyValue))*)? RightBrace;

grouping: Collect LeftBrace collectedValue (Comma collectedValue)* RightBrace By source;

collectedValue: key templatesReference;

arrayLiteral: arrayOffset? (LeftBracket RightBracket | LeftBracket arrayExpansion (Comma arrayExpansion)* RightBracket);

arrayOffset: ((integerLiteral|sourceReference|term) | tag (integerLiteral|sourceReference|term) | (integerLiteral|sourceReference|term) unit) Colon;

valueProduction: sendToTemplates | valueChain;

structureLiteral: LeftBrace (structureExpansion (Comma structureExpansion)*)? RightBrace;

relationLiteral: LeftBrace Else (structures (Comma structures)*)? Else RightBrace;

bytesLiteral: StartBytes byteValue (byteValue)* EndBytes;

byteValue: Bytes | LeftParen valueProduction RightParen | operatorExpression;

structures: structureLiteral
  | valueProduction
;

arrayExpansion: By? valueProduction;

structureExpansion: keyValue
  | By? valueProduction
;

keyValue: key valueProduction;

symbolicValue: localIdentifier TemplateMatch localIdentifier;

templates: templatesReference                        # callDefinedTransform
  | source                        # literalTemplates
  | Lambda localIdentifier? LeftParen localDataDeclaration? templatesBody Lambda localIdentifier? RightParen # lambdaTemplates
  | StartArrayTemplates arrayIndexDecomposition LeftParen localDataDeclaration? templatesBody Lambda localIdentifier? RightParen # lambdaArrayTemplates
;

arrayIndexDecomposition: localIdentifier (SemiColon localIdentifier)* RightBracket;

sink: ResultMarker ((anyIdentifier reference Message? parameterValues?) | Void);

templatesReference:  anyIdentifier reference Message? parameterValues?;

parameterValues: And LeftBrace (parameterValue Comma?)+ RightBrace;

parameterValue: key (valueChain|templatesReference|(Colon lens | Colon LeftParen RightParen));

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

stateSink: (append|prepend)? stateIdentifier reference Colon valueProduction SemiColon;
append: Range Else;
prepend: Else Range;

valueChain: source transform?;

collectorChain: To Range Equal templatesReference;

transform: To templates transform?
  | Deconstructor transform?
  | collectorChain transform?
;

matcher: StartMatcher (Invert? typeBound? membrane (Else membrane)*)? EndMatcher;

typeBound: Tick typeMatch? Tick;

membrane: (literalMatch | typeMatch) condition* | condition+;

typeMatch: START_STRING END_STRING    # stringTypeMatch
  | rangeBounds                       # rangeMatch
  | tag? stringLiteral                          # regexpMatch
  | LeftBrace (key structureContentMatcher Comma?)* (Comma? Void)? RightBrace # structureMatch
  | (arrayOffset|tag Colon|unit Colon)? LeftBracket arrayContentMatcher? (Comma arrayContentMatcher)* (Comma? Void)? RightBracket (LeftParen (rangeBounds|arithmeticValue) RightParen)?         # arrayMatch
  | (localIdentifier|externalIdentifier) TemplateMatch? # stereotypeMatch
  | (unit |  Quote Quote) # unitMatch
  | LeftParen key structureContentMatcher RightParen # keyValueMatch
;

structureContentMatcher: matcher | Void;

arrayContentMatcher: (matcher|sequenceMatch) multiplier?;

sequenceMatch: LeftParen matcher (Colon matcher)+ RightParen;

literalMatch: Equal source;

rangeBounds: lowerBound? Range upperBound?;

condition: BeginCondition valueChain matcher RightParen;

lowerBound: tag? (sourceReference|arithmeticValue|stringLiteral|term) Invert?;

upperBound: Invert? tag? (sourceReference|arithmeticValue|stringLiteral|term);

rangeLiteral: lowerBound? Range upperBound? (Colon arithmeticValue)?;

integerLiteral: (Zero | nonZeroInteger) unit?;

unit: Scalar | Quote measureProduct measureDenominator? Quote;

measureProduct: localIdentifier+;

measureDenominator: Slash measureProduct;

nonZeroInteger: additiveOperator? PositiveInteger;

tag: localIdentifier Tick;

taggedValue: tag (integerLiteral|stringLiteral|sourceReference|term);

stringLiteral: START_STRING stringContent* END_STRING;

stringContent: stringInterpolate | STRING_TEXT;

stringInterpolate: interpolateEvaluate|characterCode;

characterCode: StartCharacterCode arithmeticValue EndStringInterpolate;

interpolateEvaluate: StartStringInterpolate (anyIdentifier? reference Message? parameterValues? | Colon source)
  transform? (To TemplateMatch)? EndStringInterpolate;

arithmeticValue: arithmeticExpression;

arithmeticExpression: integerLiteral
  | LeftParen arithmeticExpression RightParen unit?
  | term unit
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

// term must only be used in a position that checks a numeric result
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
  | arrayOffset? LeftBracket (compositionSequence|compositionSkipRule)? RightBracket
  | LeftBrace (structureMemberMatchers|compositionSkipRule)? RightBrace
  | source
  | compositionKeyValue
;

structureMemberMatchers: compositionSkipRule* structureMemberMatcher (Comma? structureMemberMatchers)?;

structureMemberMatcher: (tokenMatcher|compositionKeyValue) compositionSkipRule*;

tokenMatcher: StartMatcher Invert? compositionToken (Else compositionToken)* EndMatcher multiplier?;

compositionToken: (Equal tag? (sourceReference|stringLiteral)|tag? localIdentifier|tag? stringLiteral) unit?;

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
  | StartStateDefinition
  | EndDefinition
  | DataDefinition
  | LocalDefinition
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
  | By
  | Collect
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
