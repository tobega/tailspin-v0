parser grammar TailspinParser;

options { tokenVocab = TailspinLexer; }

program: statement (Eol statement)* EOF;

statement: definition
  | source To sink;

definition: Def IDENTIFIER Colon source;

source: Dereference
  | stringLiteral;

stringLiteral: START_STRING stringContent* END_STRING;

stringContent: StringInterpolate | STRING_TEXT;

sink: Stdout;
