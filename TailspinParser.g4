parser grammar TailspinParser;

options { tokenVocab = TailspinLexer; }

// I don't know why I need the Eol? bits, shouldn't it go on skip whitespace?
program: Eol? statement (Eol statement)* Eol? EOF;

statement: Def IDENTIFIER Colon source                   # definition
  | valueChain To sink                                   # valueChainToSink
  | StartTemplatesDefinition IDENTIFIER Eol? templatesBody Eol? EndDefinition IDENTIFIER # templatesDefinition
;

source: Dereference
  | stringLiteral
  | arithmeticExpression
  | rangeLiteral
;

templates: stringLiteral                 # stringLiteralTemplates
  | LeftParen templatesBody RightParen   # inlineTemplates
  | IDENTIFIER                           # callDefinedTemplates
;

templatesBody: block matchTemplate*
  | matchTemplate+
;

matchTemplate: matcher block;

block: (valueChain|statement)+;

valueChain: source
  | source To transform;

transform: templates
  | templates To transform;

matcher: StartMatcher condition? EndMatcher;

condition: integerLiteral;

rangeLiteral: integerLiteral Range integerLiteral (Colon NonZeroInteger)?;

integerLiteral: Zero | NonZeroInteger;

stringLiteral: START_STRING stringContent* END_STRING;

stringContent: stringInterpolate | STRING_TEXT;

stringInterpolate: StringDereference | StringEvaluate valueChain RightParen;

sink: Stdout;

arithmeticExpression: integerLiteral
  | Dereference
  | arithmeticExpression AdditiveOperator arithmeticExpression;
