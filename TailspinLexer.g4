lexer grammar TailspinLexer;

@members {
  int stringInterpolate = 0;
}

StartComment: '//' -> skip, pushMode(COMMENT_MODE);

Stdout: 'stdout';

Stdin: 'stdin';

Void: 'void';

Def: 'def' [ \r\t\n];

To: '->';

ResultMarker: '!';

At: '@';

NamedAt: '@' IDENTIFIER;

Colon: ':';

Key: IDENTIFIER ':';

Message: '::' IDENTIFIER;

FieldDereference: '.' IDENTIFIER;

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

StartTemplatesDefinition: 'templates';

StartComposerDefinition: 'composer' -> pushMode(COMPOSER);

StartProcessorDefinition: 'processor';

EndDefinition: 'end';

TemplateMatch: '#';

Dereference: '$' At? IDENTIFIER?;

Range: '..';

AdditiveOperator: '+' | '-';

MultiplicativeOperator: '*' | '/' | 'mod';

Zero: '0';

PositiveInteger: [1-9] Digits?;

fragment Digits: [0-9]+;

START_STRING: '\'' -> pushMode(IN_STRING);

IDENTIFIER: IDENTIFIER_START IDENTIFIER_PART*;

fragment IDENTIFIER_START: [a-zA-Z];

fragment IDENTIFIER_PART: IDENTIFIER_START
  | [_0-9];

WS : [ \r\t\n]+ -> skip ;


Else: '|';

EndMatcher: '>';

BeginSuchThat: '?(' -> pushMode(DEFAULT_MODE);


mode COMMENT_MODE;

Comment: ~('\n')* ('\n'|EOF) -> skip, popMode;



mode COMPOSER;

ComposerEndDefinition: 'end' -> popMode;

StartComposerMatch: '<';

EndComposerMatch: '>';

InvertComposerMatch: '~';

SequenceKey: Key;

ValueSeparator: Comma;

Multiplier: '?' | '+' | '*';

CountMultiplier: '=';

ComposeInteger: PositiveInteger;

START_REGEX: '\'' -> pushMode(IN_REGEX);

StartSkipRule: '(';

EndSkipRule: ')';

StartBuildArray: '[';

EndBuildArray: ']';

StartBuildStructure: '{';

EndBuildStructure: '}';

KeySeparator: ':';

ComposerDef: 'def';

ComposeDereference: '$' (At IDENTIFIER? | IDENTIFIER);

ComposerId: IDENTIFIER;

ComposerIgnoreWS: WS -> skip;


mode IN_REGEX;

REGEX_TEXT: REGEX_CHAR+;

fragment REGEX_CHAR: '\'\'' | ~['];

END_REGEX: '\'' -> popMode;


mode IN_STRING;

StartStringEvaluate: '$(' -> pushMode(DEFAULT_MODE);

StartStringInterpolate: Dereference { stringInterpolate++; } -> pushMode(DEFAULT_MODE), type(Dereference);

STRING_TEXT: STRING_CHAR+;

fragment STRING_CHAR: '\'\'' | '$$' | ~['$];

END_STRING: '\'' -> popMode;
