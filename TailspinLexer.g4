lexer grammar TailspinLexer;

@lexer::members {
  boolean inStringDereference = false;
}

StartComment: '//' -> skip, pushMode(COMMENT_MODE);

Stdout: 'stdout';

Stdin: 'stdin';

Void: 'void';

Def: 'def' [ \r\t\n];

Dereference: StartDereference (At IDENTIFIER? | IDENTIFIER);

StartArrayDereference: Dereference LeftParen -> pushMode(DEFAULT_MODE); // Just to allow RightParen to popMode

FieldDereference: '.' IDENTIFIER;

FieldArrayDereference: '.' IDENTIFIER LeftParen -> pushMode(DEFAULT_MODE); // Just to allow RightParen to popMode

To: '->';

ResultMarker: '!';

At: '@';

Message: '::' IDENTIFIER;

Colon: ':';

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

Key: IDENTIFIER Colon;

StartMatcher: '<' -> pushMode(MATCHER);

StartTemplatesDefinition: 'templates';

StartComposerDefinition: 'composer' -> pushMode(COMPOSER);

StartProcessorDefinition: 'processor';

EndDefinition: 'end';

TemplateMatch: '#';

StartDereference: '$';

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

InterpolateMessage: '::' IDENTIFIER;


mode MATCHER;

Else: '|';

MatchComma: ',';

StartSubMatcher: '<' -> pushMode(MATCHER);

EndMatcher: '>' -> popMode;

InvertMatch: '~';

BeginSuchThat: '?(' -> pushMode(DEFAULT_MODE);

MatchInteger: Zero | PositiveInteger;

MatchAdditiveOperator: '+' | '-';

RangeMatch: Range;

START_REGEXP: '\'' -> pushMode(IN_STRING);

StartStructureMatch: LeftBrace;

EndStructureMatch: RightBrace;

StartArrayMatch: LeftBracket;

EndArrayMatch: RightBracket;

StructureKey: Key;

MatchMessage: '::' IDENTIFIER;

MatchDereference: StartDereference (At IDENTIFIER? | IDENTIFIER);

MatchLeftParen: '(' -> pushMode(DEFAULT_MODE);

MatchFieldDereference: FieldDereference;


MatcherIgnoreWS: WS -> skip;



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

ComposeDereference: StartDereference (At IDENTIFIER? | IDENTIFIER);

ComposerId: IDENTIFIER;

ComposerIgnoreWS: WS -> skip;


mode IN_REGEX;

REGEX_TEXT: REGEX_CHAR+;

fragment REGEX_CHAR: '\'\'' | ~['];

END_REGEX: '\'' -> popMode;
