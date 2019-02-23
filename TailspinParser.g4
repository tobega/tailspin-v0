parser grammar TailspinParser;

options { tokenVocab = TailspinLexer; }

program: statement (statement)* EOF;

statement: Def Key valueChain                   # definition
  | valueChain To sink                                   # valueChainToSink
  | StartTemplatesDefinition IDENTIFIER templatesBody EndDefinition IDENTIFIER # templatesDefinition
;

source: dereferenceValue
  | stringLiteral
  | arithmeticExpression
  | rangeLiteral
  | arrayLiteral
  | structureLiteral
;

dereferenceValue: Dereference structureDereference*
  | StartArrayDereference arrayDereference RightParen structureDereference*;

structureDereference: FieldDereference* (FieldDereference | (FieldArrayDereference arrayDereference RightParen));

arrayDereference: NonZeroInteger|rangeLiteral|arrayLiteral|dereferenceValue;

arrayLiteral: LeftBracket valueChain (Comma? valueChain)* RightBracket;

structureLiteral: LeftBrace (keyValue Comma?)* RightBrace;

keyValue: Key valueChain;

templates: source                        # literalTemplates
  | LeftParen templatesBody RightParen   # inlineTemplates
  | IDENTIFIER                           # callDefinedTemplates
  | LeftBracket IDENTIFIER RightBracket LeftParen templatesBody RightParen # arrayTemplates
;

templatesBody: block matchTemplate*
  | matchTemplate+
;

matchTemplate: matcher block;

block: (blockExpression)+;

blockExpression: valueChain ResultMarker       # resultValue
  | valueChain To TemplateMatch    # sendToTemplates
  | statement                      # blockStatement
  | valueChain To Colon IDENTIFIER?   # stateAssignment
;

valueChain: source
  | source transform
;

transform: To templates transform?
  | Deconstructor transform?
;

matcher: (StartMatcher|StartSubMatcher) condition? EndMatcher;

condition: matchArithmeticExpression       # integerEquals
  | lowerBound? RangeMatch upperBound?     # rangeMatch
  | stringLiteral                          # regexpMatch
  | StartStructureMatch (StructureKey matcher Comma?)* EndStructureMatch # structureMatch
;

lowerBound: matchArithmeticExpression;

upperBound: matchArithmeticExpression;

matchArithmeticExpression: MatchInteger | matchDereferenceValue;

matchDereferenceValue: MatchDereference (MatchArrayDereference arrayDereference RightParen)? matchStructureDereference*;

matchStructureDereference: MatchFieldDereference+ (MatchArrayDereference arrayDereference RightParen)?;

rangeLiteral: arithmeticExpression Range arithmeticExpression (Colon arithmeticExpression)?;

integerLiteral: Zero | NonZeroInteger;

stringLiteral: (START_STRING|START_REGEXP) stringContent* END_STRING;

stringContent: stringInterpolate | STRING_TEXT;

stringInterpolate: interpolateEvaluate|interpolateDereferenceValue;

interpolateEvaluate: StartStringEvaluate valueChain RightParen;

interpolateDereferenceValue: StartStringInterpolate InterpolateIdentifier (InterpolateArray arrayDereference RightParen)? interpolateStructureDereference*  EndInterpolate;

interpolateStructureDereference: InterpolateField+ (InterpolateArray arrayDereference RightParen)?;

sink: Stdout;

arithmeticExpression: integerLiteral
  | LeftParen arithmeticExpression RightParen
  | AdditiveOperator? dereferenceValue
  | arithmeticExpression MultiplicativeOperator arithmeticExpression
  | arithmeticExpression AdditiveOperator arithmeticExpression;
