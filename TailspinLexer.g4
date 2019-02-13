lexer grammar TailspinLexer;

Stdout: 'stdout';

Def: 'def' [ \r\t\n];

Dereference: StartDereference IDENTIFIER EndIdentifier?;

To: '->';

Colon: ':';

EndIdentifier: ';';

LeftParen: '(' -> pushMode(DEFAULT_MODE); // Just to allow RightParen to popMode

RightParen: ')' -> popMode;

StartMatcher: '<' -> pushMode(MATCHER);

StartTemplatesDefinition: 'templates';

EndDefinition: 'end';

TemplateMatch: '#';

StartDereference: '$';

Range: '..';

AdditiveOperator: '+' | '-';

Zero: '0';

NonZeroInteger: '-'? [1-9] Digits?;

fragment Digits: [0-9]+;

START_STRING: '\'' -> pushMode(IN_STRING);

IDENTIFIER: IDENTIFIER_START IDENTIFIER_PART*;

fragment IDENTIFIER_START: [a-zA-Z];

fragment IDENTIFIER_PART: IDENTIFIER_START
  | [_0-9];

WS : [ \r\t\n]+ -> skip ;

mode IN_STRING;

StringEvaluate: StartDereference LeftParen -> pushMode(DEFAULT_MODE);

StringDereference: Dereference;

STRING_TEXT: STRING_CHAR+;

fragment STRING_CHAR: '\'\'' | '$$' | ~['$];

END_STRING: '\'' -> popMode;

mode MATCHER;

EndMatcher: '>' -> popMode;

MatchInteger: Zero | NonZeroInteger;

RangeMatch: Range;
