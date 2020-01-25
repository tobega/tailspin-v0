lexer grammar TailspinLexer;

@members {
  int stringInterpolate = 0;
}

StartComment: '//' -> skip, pushMode(COMMENT_MODE);

Package: 'package';

Import: 'import';

Void: '!VOID';

Def: 'def' [ \r\t\n];

To: '->';

ResultMarker: '!';

SinkReference: ResultMarker (At IDENTIFIER? | IDENTIFIER);

SourceReference: '$' At? IDENTIFIER?;

DeleteState: '^' At IDENTIFIER?;

At: '@';

Colon: ':';

Message: '::' IDENTIFIER;

FieldReference: '.' IDENTIFIER;

EndStringInterpolate: ';' {stringInterpolate > 0}? {stringInterpolate--;} -> popMode;

SemiColon: ';';

Comma: ',';

Deconstructor: '...';

Invert: '~';

LeftParen: '(' -> pushMode(DEFAULT_MODE); // Just to allow RightParen to popMode

RightParen: ')' -> popMode;

LeftBracket: '[';

RightBracket: ']';

LeftBrace: '{';

RightBrace: '}';

StartMatcher: '<';

Lambda: '\\';

StartTemplatesDefinition: 'templates';

StartSourceDefinition: 'source';

StartSinkDefinition: 'sink';

StartComposerDefinition: 'composer' ;

StartProcessorDefinition: 'processor';

EndDefinition: 'end';

Rule: 'rule';

First: 'first';

Last: 'last';

TemplateMatch: '#';

Range: '..';

Plus: '+';

Minus: '-';

Star: '*';

TruncateDivide: '~/';

Mod: 'mod';

Question: '?';

Equal: '=';

Zero: '0';

PositiveInteger: [1-9] Digits?;

fragment Digits: [0-9]+;

START_STRING: '\'' -> pushMode(IN_STRING);

IDENTIFIER: IDENTIFIER_START IDENTIFIER_PART*;

fragment IDENTIFIER_START: [a-zA-Z];

fragment IDENTIFIER_PART: IDENTIFIER_START
  | [_/0-9];

WS : [ \r\t\n]+ -> skip ;

Else: '|';

EndMatcher: '>';

BeginSuchThat: '?(' -> pushMode(DEFAULT_MODE);


mode COMMENT_MODE;

Comment: ~('\n')* ('\n'|EOF) -> skip, popMode;


mode IN_REGEX;

REGEX_TEXT: REGEX_CHAR+;

fragment REGEX_CHAR: '\'\'' | ~['];

END_REGEX: '\'' -> popMode;


mode IN_STRING;

StartCharacterCode: '$#' { stringInterpolate++; } -> pushMode(DEFAULT_MODE);

StartStringInterpolate: '$' { stringInterpolate++; } -> pushMode(DEFAULT_MODE);

STRING_TEXT: STRING_CHAR+;

fragment STRING_CHAR: '\'\'' | '$$' | ~['$];

END_STRING: '\'' -> popMode;
