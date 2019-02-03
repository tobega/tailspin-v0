parser grammar TailspinParser;

options { tokenVocab = TailspinLexer; }

// I don't know why I need the Eol? bits, shouldn't it go on skip whitespace?
program: Eol? statement (Eol statement)* Eol? EOF;

statement: definition
  | source To sink;

definition: Def IDENTIFIER Colon source;

source: Dereference
  | stringLiteral
  | DecimalLiteral
  | source To templates;

templates: stringLiteral;

stringLiteral: START_STRING stringContent* END_STRING;

stringContent: StringInterpolate | STRING_TEXT;

sink: Stdout;
