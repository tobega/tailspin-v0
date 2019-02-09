parser grammar TailspinParser;

options { tokenVocab = TailspinLexer; }

// I don't know why I need the Eol? bits, shouldn't it go on skip whitespace?
program: Eol? statement (Eol statement)* Eol? EOF;

statement: definition
  | source Eol? To Eol? sink;

definition: Def IDENTIFIER Colon source;

source: Dereference
  | stringLiteral
  | arithmeticExpression
  | rangeLiteral;

templates: stringLiteral
  | LeftParen templatesBody RightParen;

templatesBody: block templateBlock*
  | templateBlock+;

templateBlock: matcher block;

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

stringInterpolate: StringDereference | StringEvaluate source RightParen;

sink: Stdout
  | templates To sink;

arithmeticExpression: integerLiteral
  | Dereference
  | arithmeticExpression AdditiveOperator arithmeticExpression;