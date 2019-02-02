grammar Tailspin;

program: statement ('\n' statement)* EOF;

statement: definition
  | source '->' sink;

definition: 'def' IDENTIFIER ':' source;

source: dereference
  | STRING;

sink: Stdout;

Stdout: 'stdout';

dereference: '$' IDENTIFIER;

STRING: '\'' STRING_CHAR* '\'';

fragment STRING_CHAR: '\'\'' | ~['];

IDENTIFIER: IDENTIFIER_START IDENTIFIER_PART*;

fragment IDENTIFIER_START: [a-zA-Z];

fragment IDENTIFIER_PART: IDENTIFIER_START
  | [_0-9];

WS : [ \r\t\n]+ -> skip ;
