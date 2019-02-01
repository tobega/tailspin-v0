grammar Tailspin;

prog: statement ('\n' statement)* EOF;

statement: STRING TO STDOUT;

STRING: '\'' STRING_CHAR* '\'';

fragment STRING_CHAR: '\\\'' | ~['];

TO: '->';

STDOUT: 'stdout';

WS : [ \r\t\n]+ -> skip ;
