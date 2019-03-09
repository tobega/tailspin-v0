lexer grammar TailspinLexer;

@lexer::members {
  boolean inStringDereference = false;
}

StartComment: '//' -> skip, pushMode(COMMENT_MODE);

Stdout: 'stdout';

Stdin: 'stdin';

Def: 'def' [ \r\t\n];

Dereference: StartDereference (Colon IDENTIFIER? | IDENTIFIER);

StartArrayDereference: Dereference LeftParen -> pushMode(DEFAULT_MODE); // Just to allow RightParen to popMode

FieldDereference: '.' IDENTIFIER;

FieldArrayDereference: '.' IDENTIFIER LeftParen -> pushMode(DEFAULT_MODE); // Just to allow RightParen to popMode

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

StartComposerDefinition: 'composer' -> pushMode(COMPOSER);

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

StartStringEvaluate: '$(' -> pushMode(DEFAULT_MODE);

StartStringInterpolate: '$' -> pushMode(INTERPOLATE);

STRING_TEXT: STRING_CHAR+;

fragment STRING_CHAR: '\'\'' | '$$' | ~['$];

END_STRING: '\'' -> popMode;


mode INTERPOLATE;

EndInterpolate: ';' -> popMode;

InterpolateArray: '(' -> pushMode(DEFAULT_MODE);

InterpolateIdentifier: IDENTIFIER;

InterpolateField: FieldDereference;


mode MATCHER;

StartSubMatcher: '<' -> pushMode(MATCHER);

EndMatcher: '>' -> popMode;

InvertMatch: '~';

BeginSuchThat: '?(' -> pushMode(DEFAULT_MODE);

MatchInteger: Zero | NonZeroInteger;

RangeMatch: Range;

START_REGEXP: '\'' -> pushMode(IN_STRING);

StartStructureMatch: LeftBrace;

EndStructureMatch: RightBrace;

StartArrayMatch: LeftBracket;

EndArrayMatch: RightBracket;

StructureKey: Key;

MatchDereference: StartDereference (Colon IDENTIFIER? | IDENTIFIER);

MatchArrayDereference: '(' -> pushMode(DEFAULT_MODE);

MatchFieldDereference: FieldDereference;


MatcherIgnoreWS: WS -> skip;



mode COMMENT_MODE;

Comment: ~('\n')* ('\n'|EOF) -> skip, popMode;



mode COMPOSER;

ComposerEndDefinition: 'end' -> popMode;

StartComposerMatch: '<';

EndComposerMatch: '>';

Optional: '?';

START_REGEX: '\'' -> pushMode(IN_REGEX);

StartSkipRule: '(';

EndSkipRule: ')';

StartBuildArray: '[';

EndBuildArray: ']';

ComposerId: IDENTIFIER;

ComposerIgnoreWS: WS -> skip;


mode IN_REGEX;

REGEX_TEXT: REGEX_CHAR+;

fragment REGEX_CHAR: '\'\'' | ~['];

END_REGEX: '\'' -> popMode;
