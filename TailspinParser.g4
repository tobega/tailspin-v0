parser grammar TailspinParser;

options { tokenVocab = TailspinLexer; }

program: statement (statement)* EOF;

statement: Def IDENTIFIER Colon source                   # definition
  | valueChain To sink                                   # valueChainToSink
  | StartTemplatesDefinition IDENTIFIER templatesBody EndDefinition IDENTIFIER # templatesDefinition
;

source: Dereference
  | stringLiteral
  | arithmeticExpression
  | rangeLiteral
  | arrayLiteral
;

arrayLiteral: LeftBracket valueChain (Comma? valueChain)* RightBracket;

templates: stringLiteral                 # stringLiteralTemplates
  | LeftParen templatesBody RightParen   # inlineTemplates
  | IDENTIFIER                           # callDefinedTemplates
  | LeftBracket IDENTIFIER RightBracket LeftParen templatesBody RightParen # arrayTemplates
;

templatesBody: block matchTemplate*
  | matchTemplate+
;

matchTemplate: matcher block;

block: (blockExpression)+;

blockExpression: valueChain        # resultValue
  | valueChain To TemplateMatch    # sendToTemplates
  | statement                      # blockStatement
;

valueChain: source
  | source transform
;

transform: To templates
  | templates transform
  | Deconstructor transform?
;

matcher: StartMatcher condition? EndMatcher;

condition: MatchInteger                    # integerEquals
  | lowerBound? RangeMatch upperBound?     # rangeMatch
  | stringLiteral                          # regexpMatch
;

lowerBound: MatchInteger;

upperBound: MatchInteger;

rangeLiteral: integerLiteral Range integerLiteral (Colon NonZeroInteger)?;

integerLiteral: Zero | NonZeroInteger;

stringLiteral: (START_STRING|START_REGEXP) stringContent* END_STRING;

stringContent: stringInterpolate | STRING_TEXT;

stringInterpolate: StringDereference | StringEvaluate valueChain RightParen;

sink: Stdout;

arithmeticExpression: integerLiteral
  | Dereference
  | arithmeticExpression MultiplicativeOperator arithmeticExpression
  | arithmeticExpression AdditiveOperator arithmeticExpression;
