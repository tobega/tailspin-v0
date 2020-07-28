# Tailspin reference
This is the syntax as it is working so far, with some indications of limitations and future developments.
More thoughts in [my notes](notes.txt).

Note that you may think that concepts in the language already have other established names that
should have been used instead. This is deliberate in order to free the mind of preconceived notions. 

_Current limitations_: The current implementation cannot handle very deep recursion.

## Basic structure
A typical tailspin statement starts with a [source](#sources) for a value,
which is then sent (usually by the `->` marker) through a series of [transforms](#transforms)
(a.k.a a _value chain_) to a [sink](#sinks). In contexts that can produce a value, you can end with an
exclamation point `!` to emit the resulting value into the outer calling context (this is similar to a "yield"
in a generator in other languages, except that the processing continues right away).

The _current value_ is written as `$` and is, at each
stage, simply the value produced by the stage before. At the start of a top-level statement,
`$` is undefined.

A transform is a function which only takes one value as input (the _current value_) and can emit a
variable amount of values, even no value at all, into the [stream](#streams). It is typically a [literal expression](#sources)
to create a different value or a defined [templates](#templates) object where the block to be executed is
decided by a [matcher](#matchers) criterion on the _current value_.

Note that at each step of a _value chain_, any number of values may be emitted for each input value.
If no values are emitted from a step, the processing of that _value chain_ ends. Note that "no value" 
is the complete absence of a value, there is no placeholder no-value-value like "null".

Whitespace works as a separator but is otherwise ignored.

Language constructs are designed to be as like the value they match or produce as possible.
Rather than using control flow keywords, you would in tailspin produce streams of values in a declarative way.

Comments are started with `//` and continue to the end of the line.

## Side effects
The current specification is that each step of a _value chain_ is executed
for all of the values of a stream of current values, `$`, before the next step is evaluated. This may change.

## Command line arguments
Command line arguments are available as a list of strings in the predefined value ARGS, accessible as `$ARGS`.

## Sources
A source is the simplest _value chain_, simply producing a value.

### String literal
A series of characters within single quotes, e.g. `'Hello World!'`. To write
a single quote in a string, just double it up, e.g. `'What''s up?'`.

To enter a character by its numeric unicode value, prefix the decimal value
(or [arithmetic expression](#arithmetic-expression)) with "$#" and end with ";", e.g. `'$#9;'` gives a tab character.

A dollar sign is also used to do string interpolation with a [dereferenced value](#dereference),
where a semi-colon `;` completes the interpolation, e.g. `Hello $name;` to get `$name;` replaced with
what the symbol identified as `name` currently is defined as. If you need a dollar sign in your string,
just double it up, e.g. `'The price is $$5'`. If you need a semi-colon in your string right after your
identifier, you need to double it up, e.g. `Hello $name;;`.

Interpolating the _current value_ simply becomes `$;`. In cases where you don't want to use the _current value_,
or can't because you're at the top level, and you don't want to access a defined value, you can put a colon
right after the dollar sign, e.g. `'$:5*8;'` gives you the string `'40'`

Interpolation can also execute a _value chain_ by adding transforms, even sending to templates if in a templates context,
e.g. `The total price is $$ $ -> $ * $quantity;` or `$:1..3 -> #;`. Note that when you evaluate a [processor message](#processors),
you can reference it directly, like `'$p::message;'` if the message does not require input, otherwise you need to use it as a transform,
that is like `'$->p::message;'`. Note that we now reference the message expression without the $.

### Arithmetic expression
The simplest form of arithmetic expression is just a literal number, e.g. `5`, or a [dereferenced value](#dereference)
(including a state deletion, see the [delete operator](#delete-operator).
Several numbers can be combined by arithmetic operators, e.g. `2 * $i - 8 ~/ 4`:
* multiplication `*`
* truncation division `~/` (which truncates to the integer closest to 0)
* mathematical modulo, `mod`, which gives the positive number r = n mod q such that |r| < |q| and n = k*q + r for some k.
* addition `+`
* subtraction `-`
* parenthesized sub-expressions

_Current limitations_: Only integers are supported.

_Possible future directions_: Support for exact arithmetic with rational numbers.
Decimal numbers will probably have to be typed by number of significant digits and a unit.

### Range literal
A range literal produces a [stream](#streams) of numbers. They are specified by a start, an end and
an optional increment, e.g. `1..10` will give the numbers 1 to 10 inclusive and `10..1:-1` does the same but backwards.
To exclude the bounds, add a tilde between the numeric bound and the range operator `..`, so `1~..5:2` will give `3 5`,
while `1..~5:2` will give `1 3`.

### Array literal
An array literal produces an [array](#arrays) of values. It starts with a left bracket followed by
a [stream](#streams) of _value chains_, separated by commas, and ends with a right bracket.
Each _value chain_ may produce a stream of values, which will be flat-mapped into the array.
E.g. `[1,2,3,4,5]` and `[1..3, 4..5]` and `[1..5]` all produce an array of size 5 containing the numbers 1 to 5.

You can nest array literals inside array literals to produce multi-dimensional arrays.

### Structure literal
A structure literal produces a [structure](#structures) value. It starts with a left brace, followed by
literal key-value pairs or expressions generating [streams](#streams) of key-value pairs, separated by commas, and ends with a right brace.
A literal key-value pair is an identifier followed by a colon and a _value chain_. E.g. `{ a: 0, b: 'hello' }`
An example of an expression generating a stream of key-value pairs is a [deconstruct](#deconstructor)
 of a [dereferenced](#dereference) structure value.

### Input
Input is data obtained from an external source. See the [core system module](#the-core-system-module),
e.g. `IN` for a user entering data in the terminal (or data from the unix standard input pipe).
Once the standard input is closed (end of file, ctrl-D) it produces the stream of all lines entered, without line-end markers (return, newline).

### Dereference
An identifier can be defined to represent a value, e.g. `def myValue: _value chain_;` where \_value chain\_ should be a _value chain_
that produces the single desired value.
Then the value can be retrieved as a source itself by a dereference which is done by simply writing the
identifier prefixed by a dollar sign, e.g. `$myValue`

An identifier must have its value defined before it is used and the definition must be in the same scope
as, or a scope larger than (or outside), the scope where the dereference takes place.

A symbol may not change its value in the same scope, but it may be shadowed in a nested scope.

Note that templates have a modifiable state value that can be dereferenced, see [templates state](#templates-state)

### Defined sources
Sometimes you would like to just output a value from a [processor](#processors) or perform some complex operation without needing any particular input.
In such a case you can define a source, which is very much like a [defined template](#defined-templates) except that
the declaration starts with the word `source` instead.

A defined source must, of course, have an _initial block_ and will not have any valid value for the _current value_ at the start of each statement.

A defined source is called by dereferencing the given identifier with a dollar sign, e.g. `$mySource`.

## Sinks
A sink is a place where a value "disappears" and the _value chain_ ends.

A symbol definition (or a state modification) has a semi-colon `;` at the end that could be considered to be a  that captures the value into the symbol (or state).

`-> !VOID` is a special sink which is used to ignore the values from a chain (or to mark that the chain is not expected to produce values).

Some [sinks are defined](#defined-sinks) by the programmer. Others are defined by the system, e.g. to produce output from your program. See [the core system module](#the-core-system-module), e.g. `OUT`

Sinks often entail [side effects](#side-effects)

In templates, there is a special sink that sets the [templates state](#templates-state).

### Defined sinks
Sometimes you would like to process a value before sending it to other sinks, e.g. the state of the surrounding [processor](#processors),
or the surrounding [templates state](#templates-state), or just process a value before writing it to output.

In such a case you can define a sink, which is very much like a [defined template](#defined-templates) except that
the declaration starts with the word `sink` instead.

A defined sink may not emit any values.

Defined sinks are called by prepending the identifier reference with an exclamation point `!` (instead of the `$` otherwise used).

### Emit value
Something that could be considered a local sink is in a [templates](#templates) block where a value is emitted out into the
result stream of the calling context. It is marked by an exclamation point `!`. Of course, the value in this case continues
elsewhere in the program, so it is not really a sink as such. (Compare with "yield" in other languages.)

Note also that emitting a value does not end the execution of the templates block and you are free to emit multiple values.

## Transforms
Transforms take the _current value_ (or each value separately from a [stream](#streams)) and convert
it into another value (or no value, or a stream of values) that is then passed to the next stage in the
chain, to ultimately end up in a [sink](#sinks).

### Literal transform
The preferred tailspin way to create new things is by a declarative literal expression. Most of the things
listed as [sources](#sources) qualify as transforms if they reference the _current value_ `$`.

### Deconstructor
A deconstructor is a transform that works on [arrays](#arrays) by flowing the elements out of an array
into a [stream](#streams), e.g. `[4,7,9]...` will create a stream of the values 4, 7 and 9.
 
### Templates
A templates object consists of an optional _initial block_ and an optional sequence of match statements.
A match statement starts with the word `when` followed by a [matcher](#matchers), then the word `do`
followed by a _block_. (Note that `when` and `do` are currently optional but will become mandatory at some point)

The last match statement can be the word `otherwise` which will match if nothing previous matched. It is equivalent to the statement `when <> do` (match anything).

A block is simply a series of _value chains_ that either dry up, with no value for the next stage;
produce a value (or several) that gets [emitted](#emit-value) out of the template (by `!`); sends a value to a [sink](#sinks); or,
most important, by the `#` marker, __sends a value to the [matchers](#matchers)__

The initial block is executed with the value passed into the template accessible as the
_current value_, `$`, at the beginning of each chain. If no initial block is defined, the current
value is sent to the [matchers](#matchers) as if the initial block was just the statement `$ -> #`.

You cannot have an empty match block nor an empty templates object, but you can specify `!VOID` as a do-nothing action.

Inside a templates object, sending to matchers can be used as an additional type of _value chain_ for most value productions.
Note that the `#` to send to matchers ends the _value chain_ and the result at that point will be whatever the matchers and their blocks determine. If it is at the end of a statement it behaves as if it was followed by a `!` [emit marker](#emit-value).

Templates have a special [mutable state value](#templates-state) which can be useful for iterative processing.

#### Defined templates
Templates can be defined with an identifier as a top-level statement or inside another templates object.
The definition starts with `templates _identifier_` and ends with `end _identifier_`, where \_identifier\_
is the name you wish to assign, e.g.
```
templates add1
  $ + 1
end add1
```

Templates are normally called as [transforms](#transforms) by just writing the identifier after an arrow "-> myTemplates",
which will send the _current value_ at that point in the chain as input to the templates. Note that it is currently not an error
to refuse to use the input _current value_ but such templates should preferably be called a [source](#defined-sources) instead
and accessed as such.

You can specify [parameters](#parameters) to modify/control certain aspects of the execution.

#### Inline templates
Templates can be defined inline by just wrapping a templates body as follows:
Start with a backslash '\' (or lambda if you squint)
followed by an optional identifier and an opening paranthesis,
with the backslash-identifier sequence repeated before the closing parenthesisat the end,
e.g. `$ -> \(<0> 'zero'!\)` or `$ -> \onlyZero(<0> 'zero'! \onlyZero)`. The example will output `zero` if `$` was `0` (but will not output anything at all otherwise).

Of course, the identifier, if one is given, acts as a name for [templates state](#templates-state),
otherwise only anonymous same-level state access is possible.

#### Array templates
Array templates is a convenient way to process [array](#arrays) elements individually together with
their index in the array. They are created by putting an index-decomposition specification before the
opening parenthesis of an [inline templates](#inline-templates).
The index-decomppsition definition specifies an identifier for the index counter(s) within brackets,
e.g. `[4,5,6] -> \[i]($ + $i!\)` will produce the value `[5,7,9]`.
Multiple dimensions also work, provided that the array structure has at least as many dimensions as specified.
e.g `[[1,2,3],[4,5,6]] -> \[i,j]($ * $i + $j ! \)` gives `[[2,4,6],[9,12,15]]`

Note that the array templates is currently not aware of the array other than that it has parameters for its indices,
so each element is independently evaluated. This means that (at least currently) the [templates state](#templates-state)
is new for each element.

As with inline templates, an optional name can be attached,
e.g. `[[1,2,3],[4,5,6]] -> \munge[i,j]($ * $i + $j !\munge)`

### Composer
A composer takes a string and composes it into other objects according to the specified pattern.
A pattern consists of a sequence of result-constructing symbols and composition matchers. Sequences may be put in
parentheses to indicate that they should not be output.

The composer definition starts with `composer _identifier_` and ends with `end _identifier_`. A composer can
also be modified by [parameters](#parameters).

The main pattern is given first, but may be followed by named sub-patterns (rules) that are used within the composer. To define a rule,
start with the keyword "rule" followed by an identifier of your choosing, followed by a colon (':') and then a pattern.

E.g. to compose a string of text like `'Line(Point(5,7),Point(13,9))'` into the array of structures `[{x:5,y:7},{x:13,y:9}]`:
```
composer line
  (<'Line\('>) [ <point>, (<','>) <point> ] (<')'>)
  rule point: (<'Point\('>) { x: <INT> (<','>), y: <INT> } (<')'>)
end line
```

Composition matchers can be string literals containing regexp patterns [(currently) according to java Pattern](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html).

A matcher can be an equals sign followed by a string literal, source reference or state deletion that gives a string result.
This will match the string value exactly.

Other composition matchers are the ones defined in the composer as sub-patterns (rules).

There are also built-in composition matchers like `<INT>` which parses an integer and `<WS>` for a sequence of whitespace characters.

A composition matcher can have a [multiplier qualifier](#multipliers) after it to determine repetitions.

A composition matcher can be negated by a tilde just inside the bracket, e.g. `<~WS>`, which will match everything up until the next matching pattern.

A skipped value may be captured by prefixing the matcher with `def _identifier_:` and ending the capturing expression with a semi-colon (';'), e.g. `(def val: <INT>;)` will not output the parsed integer at that location
but captures it as `val`. This value may be output later as `$val`. Values captured at the top level may be visible to named sub-patterns if
it is captured before entering the sub-pattern. Values captured in named sub-patterns are only visible to later matchers in the same sub-pattern.

Several choices can be specified for a composition matcher, separated by a pipe "|", e.g. `<INT|point|'x[0-9]'>`. These are tried in order from left to right.
Note that a negation by tilde inside the angle bracket negates the whole bracket, so it would match characters until any one of the listed choices would match,
e.g. `<~WS|INT>` would match everything up until the next whitespace or number is encountered.

A composition matcher (or a composed array or structure) can be sent through a series of [transforms](#transforms) to convert the parsed value, e.g.
```
templates minutes
  $.h * 60 + $.m !
end minutes
composer time
  { h: <hour>, (<' and '>) m: <minute> } -> minutes
  rule hour: <'(one|two)'> -> (<'one'> 1 ! <'two'> 2 !) (<' hours?'>)
  rule minute: <INT> (<' minutes?'>)
end time
'one hour and 13 minutes' -> time -> stdout
```
will print "73"

A composer can have [state](#templates-state) that can be set initially as the first statement before the main pattern. It can be updated in skip compositions,
optionally with a value stream from a matcher. It can be accessed in the usual way.

## Matchers
A matcher is a criterion enclosed by angle brackets. A sequence of matchers is evaluated from the
start to the end, where the first matcher that matches the _current value_ will have its block
executed for that _current value_.
* Empty criterion, `<>`, matches anything.
* Equality, starts with an equal sign `=` followed by a [source](#sources), e.g. `<='abc'>` or `<=[1, 2, 3]>`;
  matches according to standard rules of equality, with lists being ordered.
* Range match has a lower bound and/or an upper bound separated by the range operator, with an optional tilde next to
 the range operator on the side(s) where the bound is not included. E.g.
  * `<2..5>` for "between 2 and 5 inclusive"
  * `<..3>` for "less than or equal to 3", or `<..~3>` for "less than 3"
  * `<10..>` for "greater than or equal to 10" , or `<10~..>` for "greater than 10"
  * A value dereference can be a bound, e.g. `<$min..$max>`
  * An arithmetic expression can be a bound if encased in parentheses, e.g. `<($a+4)..>`
  * Ranges can compare strings.
* Regular expression match, given as a [string literal](#string-literal), resolves as a _regular expression_ for matching the _current value_.
For more info on how string matching works, see the [java documentation](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html).
Note that the expression must match the entire value (this may change in future, as may the regular expression syntax).
`<''>` matches the empty string, `<'.*'>` matches any string, `<'.+'>` any non-empty string.
For comparing strings for simple equality, see "Equality" above.
* Structure match is similar to a [structure literal](#structure-literal), surrounded by braces,
lists keys of fields that need to exist for the matcher to match, with a matcher for the value of the field, e.g.
  * `<{}>` matches any structure, but not numbers, strings or arrays
  * `<{a: <>}>` matches any structure that has a field `a`, whatever its value
  * `<{a:<=0>, b:<=1>}>` matches any structure that has a field `a` with value `0` and a field `b` with value `1`,
  whatever other fields it might have.
  * `<{a: VOID}>` matches any structure that does not have a field `a`
  * At the end of the structure matcher, just before the `}`, the symbol `VOID` may be written to assert that the structure has no unmatched fields.
    e.g. `{a: <> VOID}` matches a structure that only has an `a` field and no other fields.
* If either of several criteria is acceptable, just list the acceptable criteria inside the angle brackets separated by `|` as a logical "or".
  The criteria are tried in order, stopping after the first true criterion. E.g. `<='apple'|='orange'>` will be true for both 'apple' and 'orange'.
* Inverse match, to match the opposite of a criterion, just put a tilde inside the angle bracket, e.g. `<~=5>`
  Note that inverse is applied to the entire expression within the angle brackets so `<~='apple'|='orange'>` will be false for both 'apple' and 'orange'.
* Array match, given as `<[]>` matches if the _current value_ is an array.
  * A match can also be restricted to arrays
  of a certain length or range of lengths by appending the length (range) in parentheses, e.g. `<[](2..)>`.
  * Match criteria on array content are written inside the brackets, separated by commas.
  Array content criteria can have a [multiplier](#multipliers) attached.
  * The simplest array content matching tests if there exist elements in any order so that each criterion is met,
  with extra content ignored. In this mode, the `+` and `*` multipliers make no difference to the result,
  but may clarify the intent.
  * The `?` and `=` multipliers will fail if there are more than the allowed amount elements.
  * A content matcher without multiplier will match once only (and may be duplicated to expect several elements).
  E.g. `<[<=3|=5>]>` tests if there is any element that is either a 3 or a 5, while `<[<=3>,<=5>]>`
  tests that the array contains at least one each of 3 and 5.
  Note that criteria will be matched in order for each element until the first matching criterium is found.
  * At the end of the content matcher, just before `]`, the symbol `VOID` may be written to signify that no extra content is allowed.
  * Sequential content matching is a future feature.
  * Note the possibility of using inverse matching to exclude extra content, e.g. `<~[<~=3|=5>]>`
  will test that the array only contains 3's and 5's, i.e. it is not an array that contains an element
  that is neither 3 nor 5. Be careful with conditions and alternatives, as they are affected by inverses.
  * Note also the possibility of matching a list exactly by equality.
  
Note that when nesting down matchers for fields and array contents, the _current value_ denoted by `$` will still refer to
the original item to be matched by the outer match expression. To change perspective so that `$` should represent
the value at the current level of the match, use a [condition](#conditions)

### Multipliers
Composer matchers and array content matchers can have multipliers attached:
 * `?` if it is optional, once or no times.
 * `*` if it can be repeated any number of times.
 * `+` for one or more times.
 * `=` followed by an exact count, e.g. `=2` for twice.

### Do-nothing block (guard clause)
Sometimes it is easier or clearer to specify criteria which you don't want to do anything with.
A matcher block can be simply the word `!VOID` to indicate this case.
  
### Conditions
Sometimes you want to match relations between parts of a structure or values at certain array positions, then you can
use a number of conditions either after or instead of the main criterion. E.g.
* Array where first and second elements are equal: `<[]?($(1)<$(2)>)>`
* Structure where the elements obey the relation a <= b <= c: `<?($.a<..$.b>)?($.b<..$.c>)>`

Conditions can also be applied to transforms of the value. Note that those transforms must yield a single value for matching.

A condition enables you to meaningfully use `$` in the match criterion as the original thing you are matching, while the criterion is tested
against the produced or transformed value.
 
Note that a condition will change the perspective of the _current value_ so that `$` will represent the value being matched by the closest enclosing matcher.

## Templates state
A [templates](#templates) object has modifiable local temporary state, valid for the processing of one input value,
which can be modified by the special identifier `@`, set as `@: _value chain_;` and dereferenced as `$@`. Optionally, or to access
a surrounding outer templates object's state, you can append the templates name, e.g. `@name` and `$@name`.

The local state is also deeply modifiable so you could change just a field of the state object, e.g. `@.field: _value chain_;` or `@name.field: _value chain_;`,
or a position in an array, e.g. `@name(2;5): _value_ chain_;`. A sequenceof variables can also be assigned to an array slice,
e.g. `@(2..4): 1..3;`

A state modification works like a [sink](#sinks).

A modifiable local state reference can be a collector for the [merge operator](#merge-operator), which then
mutates the state, e.g. `..|@: _value chain_;`.

To remove part of the state, use the [delete operator](#delete-operator), e.g. `^@name.key`, which also places the deleted value into the chain.

### Merge operator
This is the symbol `..|` which is similar to the [deconstructor](#deconstructor), but collects values instead of disperses them.
It is applied before a state object assignment instead of after a value stream, e.g. `..|@myState`
Slightly different things happen depending on what type of object is used as a collector:
 * A structure: the stream must be a stream of structures or keyed values (or just one structure or keyed value) and the result is that of
 the keys of each streaming structure is merged into the collector, possibly overwriting previous keys, e.g.
 if @ is `{a:1, b:1}` `..|@: {a:2, c:2};` results in @ being `{a:2, b:1, c:2}`
 * An array: append the stream to the end of the array.
 
 If the merge operator is applied to an array slice, each element of the array slice gets merged with one element from the stream.
 Note the difference between `..|@: 1..3;`, which appends 1, 2 and 3 to the end of the state array,
 and `..|@(1..last): 1..3;` which merges 1 to the first element of the state array, 2 to the second and three to the third.
 If the size of the slice and the size of the stream aren't the same, an error is thrown.
 
### Delete operator
The delete operator, `^`, can be applied to the state to remove either the entire state or parts of it. The value of
the removed entity is used as a [source](#sources). E.g. if @ is `[4,5,6]` then `^@(1)` will produce `4` and leave
@ as `[5,6]`

## Parameters
Defined [templates](#defined-templates) (or [composers](#composer) or [processors](#processors)) can have parameters that vary the way they execute. Parameters are defined just after the identifier
by an at-sign and a list of keys inside braces (similar to a structure literal), and are used as defined values, e.g.
```
templates add@{addend:}
  $ + $addend
end add
```

While parameters could be thought of (and can be used) as input to the templates, input should normally be thought of as coming
from the _current value_, while parameters modify the way the input is handled. Most significantly, other templates can be passed as parameters,
but cannot be passed as input.

To call templates with parameters, set the values after the identifier by an at-sign and a [structure literal](#structure-literal)
where the keys in the structure must match the defined parameters, e.g. with the above definition
`3 -> add@{addend: 4} -> stdout` will print `7`.

## Streams
Streams occur when several values are created as the _current value_. Streams are processed by
repeating each step of the chain by setting __each__ of the stream values as the _current value_ in turn.
See the note on [side effects](#side-effects).

Streams can be captured into an [array](#arrays) by surrounding them with an [array literal](#array-literal).

Streams can be captured into a string by surrounding them in a [string literal](#string-literal) interpolation expression.

Streams of [key-value pairs](#keyed-values) can be captured in a [structure literal](#structure-literal).

A stream can dry up when there are no values output at all from a processing stage and then no further processing is
done in the current _value chain_.

## Arrays
Arrays are an ordered list of objects that can be turned into a [stream](#streams) by a [deconstructor](#deconstructor).

To access elements of an array, append a selector within parentheses, e.g. `$(3)` to get the third element of the current array value.
The first element of an array has selector `1`, but can also be referenced as `first`.
Elements can also be selected counting from the end of the array by counting from the keyword `last`,
 e.g. the last element of an array can be accessed by selector `last`, the second last element by `last-1` and so on.
Of course, the selector may be any arithmetic expression.

A new array can be created by selecting from an existing array by a [range literal](#range-literal), using keywords
`first` and `last` if needed.
E.g. `$(2..last-1:3)` would select every third element starting at the second element and ending on or before
the second last element. As usual, you can leave out the increment which defaults to 1.

An array or integer for index can be obtained from a value [dereference](#dereference). The result must be an integer or a stream
of integers, or a single array of integers.

A new array can be created by selecting from an existing array with an array, e.g. `$([3,1,5])`
would select the third element, followed by the first element and last the fifth element. You can also include
ranges and the dimension keywords in the array, e.g. `$([last, 1..last-1])` to rotate the last element to the beginning. Note that the only allowed
elements in an literal array selector are the same ones that are allowed as direct selectors.

All these rules can be applied to multiple dimensions by separating the dimension dereferences with a semi-colon `;`, e.g.
`$(1..3; 2)` to select the second element of each of the first three dimensions (returns a one-dimensional array of size 3,
although the elements could be arrays). Selecting only a few dimensions will select everything from the remaining dimensions
as a new array, but you cannot dereference it immediately in the same step.

It is an error to select elements outside the range of a dimension. However, impossible ranges are legal but result in an empty array.
So, for example, `$(0)` will result in an error, but `$(0..0)` will result in an empty array, which can be handy.

An array is a built-in processor that responds to the following messages:
* `::length` returns the length of the first dimension.

## Structures
A structure is a collection of named values without any inherent order. The field values of a structure
can be accessed by appending a dot and the field key identifier to the [dereference](#dereference) of the structure.
E.g. if the structure `{ a: 1 }` is the _current value_, the value `1` can be accessed by `$.a`.

### Keyed values
A structure can be [deconstructed](#deconstructor) into a stream of keyed values (or key-value pairs).
The stream of keyed values can be captured into a [structure literal](#structure-literal) at some point.

When creating keyed values, the transform chain binds to the value, not the whole keyed value, e.g. `a: 1 -> (<1> 'yes')` will give the result `a: 'yes'`.
To send the keyed value through a transform, put it in parentheses, so `(a: 1) -> ...{}` creates `{a: 1}`.

## Processors
A processor is an object that is more complex than simply data. It would normally have some
state that is kept over time (several accesses) and could possibly change.
The processor object itseelf can be obtained and passed around as a value by dereferencing the associated identifier/state.
To interact with the defined templates/sources/sinks of processors, you send [messages](#messages) to them.

Internally in the processor, state is accessed like the [local state of templates](#templates-state), but with the processor name.
The processor state is, however, permanent as long as the processor object is retained.

A processor definition looks similar to a templates object but the definition starts with the word `processor` instead.
Also, there are no match templates. The initial block is used to define state and values for the processor instance
that will be returned from using the processor definition as a transform.
All templates defined are considered to be messages that the processor instance can handle.

Processors can have [parameters](#parameters) that modify their behaviour.

By convention, a processor definition should have an identifier starting with a capital letter.

### Messages
A message is sent to a processor by getting a reference to the processor and appending two colons and the message identifier,
e.g. `$::length` to get the length of an array that is the _current value_. Note that the reference shoult be prepended with `$`
if the message represents a source, with `!` if the message represents a sink and with nothing if it is a transform template.

Processor messages are implemented as [defined templates](#defined-templates), [defined sources](#defined-sources) or [defined sinks](#defined-sinks) within the processor which then
run within the scope of the processor instance. Therefore messages can also take parameters.

## The Core System module
The Core System module is provided by default to a main program and has no prefix. The module contains the following symbols:

A predefined symbol `SYS` can be used to access certain system-defined functions:
* `$SYS::nanoCount` returns a nanosecond counter that can be used to determine the time elapsed between two calls.
* `$N -> SYS::randomInt` returns a random integer value between 0 and N-1 (inclusive)

`IN` accesses user data entered in the terminal (or data from the unix standard input pipe).
* `$IN::lines` Once the standard input is closed (end of file, ctrl-D) it produces the stream of all lines entered, without line-end markers (return, newline).

`OUT` sends data to the standard output pipe (by default the terminal)
* `!OUT::write` writes a string representation of each of the objects in the stream. (Note the `!` prefix for a [sink](#sinks))

## Built-in messages
All objects
* `$::hashCode` returns a hash code consistent with equality.

Arrays
* `$::length` returns the length of the array's outer dimension.

Keyed values
* `$::key` returns the key as a string.
* `$::value` returns the value

Strings
* `$::asCodePoints` returns an array of Unicode code points corresponding to the string.

## Including files
A tailspin file can include other files before any other statement by writing
the word "include" followed by a string literal giving the search path to the file to be included, without the ".tt" file suffix,
e.g. `include 'lib/dep'` will include the file named "dep.tt" from the folder named "lib".

Search paths for included files are interpreted relative to the including file and it must be in the same directory
as the including file or a subdirectory of it.

The symbols (defined symbols, templates, processors, etc.) defined in the package will be accessible by
prepending the unsuffixed file name and a "/" to the symbol name, e.g. file dep.tt defines templates foo which can then
be used as `dep/foo`. Note that the search path is ignored.

## Using modules
*NOTE*: This is being [developed](dependencies.txt) and doesn't work yet

The tailspin file that is used as the main program can define which modules (libraries) it wants to use. Included
files normally just inherit the modules declared by the main file.

Tailspin code being used as a module does not get to decide which other modules it uses, it needs to have
dependencies injected by a [module provision](#module-provision) statement after the use statement.

e.g. `use 'myModule' with ...modules... provided` 

### Module provision
A module provision statement provides modules needed by another module. It starts with the word `with`
and ends with the word `provided`. The module is identified by the prefix defined to be used for its symbols
or derived from the search path in the same way as for [included files](#including-files).

Modules can be provided in the following ways (with prefix `myModule` used as example):
* Inherited with some definitions overridden, e.g. `modified myModule ...definitions... end myModule`

NOTE: When providing [the core system module](#the-core-system-module) to another module it is referred to as `core-system/`.
 
## Testing
Tests can be defined in a tailspin source file by the keyword `test` followed by a [string literal](#string-literal),
a series of assertions (at least one), interspersed by optional statements as needed to set up state,
and then the keyword `end` followed by the same string literal as after `test`.

An assertion is started by the `assert` keyword followed by a _value chain_, then a [matcher](#matchers)
and a string description of what you are asserting, e.g.
```
test 'Example test'
assert 1+1 <=2> 'One plus one is two'
end 'Example test'
```

To run the tests in a file, put the command-line flag `--test` before the name of the file to run.

### Mocking, stubbing, faking
You can override symbols by a [module provision](#module-provision) statement at the beginning of a test, e.g.
```
sink hello
  'Hello $;' -> !OUT::write
end hello

test 'hello'
  with
    modified core-system/
      processor FakeOut
        @: [];
        sink write
          ..|@FakeOut: $;
        end write
        source next
          ^@FakeOut(1) !
        end next
      end FakeOut

      def OUT: $FakeOut;
    end core-system/
  provided

  'John' -> !hello
  assert $OUT::next <='Hello John'> 'Wrote greeting'
end 'hello'
```
