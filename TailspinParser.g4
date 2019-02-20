parser grammar TailspinParser;

options { tokenVocab = TailspinLexer; }

program: statement (statement)* EOF;

statement: Def Key valueChain                   # definition
  | valueChain To sink                                   # valueChainToSink
  | StartTemplatesDefinition IDENTIFIER templatesBody EndDefinition IDENTIFIER # templatesDefinition
;

source: dereferenceValue
  | stringLiteral
  | arithmeticExpression
  | rangeLiteral
  | arrayLiteral
  | structureLiteral
;

dereferenceValue: Dereference (FieldDereference)*;

arrayLiteral: LeftBracket valueChain (Comma? valueChain)* RightBracket;

structureLiteral: LeftBrace (keyValue Comma?)* RightBrace;

keyValue: Key valueChain;

templates: source                        # literalTemplates
  | LeftParen templatesBody RightParen   # inlineTemplates
  | IDENTIFIER                           # callDefinedTemplates
  | LeftBracket IDENTIFIER RightBracket LeftParen templatesBody RightParen # arrayTemplates
;

templatesBody: block matchTemplate*
  | matchTemplate+
;

matchTemplate: matcher block;

block: (blockExpression)+;

blockExpression: valueChain ResultMarker       # resultValue
  | valueChain To TemplateMatch    # sendToTemplates
  | statement                      # blockStatement
  | valueChain To Colon IDENTIFIER?   # stateAssignment
;

valueChain: source
  | source transform
;

transform: To templates transform?
  | Deconstructor transform?
;

matcher: (StartMatcher|StartSubMatcher) condition? EndMatcher;

condition: MatchInteger                    # integerEquals
  | lowerBound? RangeMatch upperBound?     # rangeMatch
  | stringLiteral                          # regexpMatch
  | StartStructureMatch (StructureKey matcher Comma?)* EndStructureMatch # structureMatch
;

lowerBound: MatchInteger;

upperBound: MatchInteger;

rangeLiteral: arithmeticExpression Range arithmeticExpression (Colon arithmeticExpression)?;

integerLiteral: Zero | NonZeroInteger;

stringLiteral: (START_STRING|START_REGEXP) stringContent* END_STRING;

stringContent: stringInterpolate | STRING_TEXT;

stringInterpolate: StringDereference | StringEvaluate valueChain RightParen;

sink: Stdout;

arithmeticExpression: integerLiteral
  | LeftParen arithmeticExpression RightParen
  | AdditiveOperator? dereferenceValue
  | arithmeticExpression MultiplicativeOperator arithmeticExpression
  | arithmeticExpression AdditiveOperator arithmeticExpression;
