lexer grammar TailspinLexer;

@lexer::members {
  boolean inStringDereference = false;
}

Stdout: 'stdout';

Def: 'def' [ \r\t\n];

Dereference: StartDereference (Colon IDENTIFIER? | IDENTIFIER);

FieldDereference: '.' IDENTIFIER;

To: '->';

ResultMarker: '!';

Colon: ':';

Comma: ',';

Deconstructor: '...';

LeftParen: '(' -> pushMode(DEFAULT_MODE); // Just to allow RightParen to popMode

RightParen: ')' -> popMode;

LeftBracket: '[';

RightBracket: ']';

LeftBrace: '{';

RightBrace: '}';

Key: IDENTIFIER Colon;

StartMatcher: '<' -> pushMode(MATCHER);

StartTemplatesDefinition: 'templates';

EndDefinition: 'end';

TemplateMatch: '#';

StartDereference: '$';

Range: '..';

AdditiveOperator: '+' | '-';

MultiplicativeOperator: '*' | '/' | 'mod';

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

DollarSign: '$$';

StartStringInterpolate: '$' { inStringDereference = true; };

StringLeftParen: '(' { inStringDereference }? -> pushMode(DEFAULT_MODE);

StringDereferenceIdentifier: IDENTIFIER { inStringDereference }?;

StringFieldDereference: FieldDereference { inStringDereference }?;

EndStringDereference: ';' { inStringDereference }? { inStringDereference = false; };

STRING_TEXT: STRING_CHAR+? { inStringDereference = false; };

fragment STRING_CHAR: '\'\'' | ((';'|'(') { !inStringDereference }?) | ~['$;];

END_STRING: '\'' -> popMode;




mode MATCHER;

StartSubMatcher: '<' -> pushMode(MATCHER);

EndMatcher: '>' -> popMode;

MatchInteger: Zero | NonZeroInteger;

RangeMatch: Range;

START_REGEXP: '\'' -> pushMode(IN_STRING);

StartStructureMatch: LeftBrace;

EndStructureMatch: RightBrace;

StructureKey: Key;

MatcherIgnoreWS: WS -> skip;