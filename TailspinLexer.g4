lexer grammar TailspinLexer;

Stdout: 'stdout';

Def: 'def' [ \r\t\n];

Dereference: '$' IDENTIFIER;

To: '->';

Eol: '\n';

Colon: ':';

START_STRING: '\'' -> pushMode(IN_STRING);

IDENTIFIER: IDENTIFIER_START IDENTIFIER_PART*;

fragment IDENTIFIER_START: [a-zA-Z];

fragment IDENTIFIER_PART: IDENTIFIER_START
  | [_0-9];

WS : [ \r\t\n]+ -> skip ;

mode IN_STRING;

StringInterpolate: Dereference;

STRING_TEXT: STRING_CHAR+;

fragment STRING_CHAR: '\'\'' | ~['];

END_STRING: '\'' -> popMode;