lexer grammar TailspinLexer;

@members {
  int stringInterpolate = 0;
}

StartComment: '//' -> skip, pushMode(COMMENT_MODE);

Include: 'include';

Void: 'VOID';

Def: 'def';

When: 'when';

Do: 'do';

Otherwise: 'otherwise';

To: '->';

ResultMarker: '!';

SourceMarker: '$';

DeleteMarker: '^';

And: '&';

Slash: '/';

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

StartBytes: '[x' -> pushMode(IN_BYTES);

StartMatcher: '<';

Lambda: '\\';

StartTemplatesDefinition: 'templates';

StartSourceDefinition: 'source';

StartSinkDefinition: 'sink';

StartComposerDefinition: 'composer' ;

StartProcessorDefinition: 'processor';

StartOperatorDefinition: 'operator';

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

Else: '|';

EndMatcher: '>';

BeginCondition: '?(' -> pushMode(DEFAULT_MODE);

StartTestDefinition: 'test';

Assert: 'assert';

CoreSystem: 'core-system/';

With: 'with';

Provided: 'provided';

Modified: 'modified';

Shadowed: 'shadowed';

Inherited: 'inherited';

From: 'from';

StandAlone: 'stand-alone';

Use: 'use';

Zero: '0';

PositiveInteger: [1-9] Digits?;

fragment Digits: [0-9]+;

START_STRING: '\'' -> pushMode(IN_STRING);

STATE_IDENTIFIER: '@' IDENTIFIER_PART*;

IDENTIFIER: IDENTIFIER_START IDENTIFIER_PART*;

fragment IDENTIFIER_START: [a-zA-Z];

fragment IDENTIFIER_PART: IDENTIFIER_START
  | [_0-9];

WS : [ \r\t\n]+ -> skip ;


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


mode IN_BYTES;

Bytes: ([0-9a-f][0-9a-f])+;

Bytes_WS : WS -> skip ;

StartBytesExpression: LeftParen -> type(LeftParen), pushMode(DEFAULT_MODE);

EndBytes: 'x]' -> popMode;
