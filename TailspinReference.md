# Tailspin reference
This is the syntax as it is working so far, with some indications of future developments.

Note that you may think that concepts in the language already have other established names that
should have been used instead. This is deliberate in order to free the mind of preconceived notions. 

_Current limitations_: The current implementation cannot handle very deep recursion.

## Basic structure
A typical tailspin statement starts with a [source](#sources) for a value,
which is then sent (usually by the `->` marker) through a series of [transforms](#transforms)
(a.k.a a _value chain_) to a [sink](#sinks). In contexts that can produce a value, you can append an
exclamation point `!` to emit the resulting value. The current value, referred to as `$it`, at each
stage is simply the value produced by the stage before. At the start of a top-level statement,
`$it` is undefined.

A transform is typically a [templates](#templates) object where the block to be executed is
decided by a [matcher](#matchers) on the current value (referred to as `$it`).

Whitespace works as a separator but is ignored.

Language constructs are designed to be as like the value they match or produce as possible.
Rather than using control flow keywords, you would in tailspin produce streams of values in a declarative way.

Comments are started with `//` and continue to the end of the line.

## Sources
A source is the simplest _value chain_, simply producing a value.

### String literal
A series of characters within single quotes, e.g. `'Hello World!'`. To write
a single quote in a string, just double it up, e.g. `'What''s up?'`.

A dollar sign is used to do string interpolation with a [dereferenced value](#dereference),
where a semi-colon `;` completes the interpolation, e.g. `Hello $name;` to get `$name;` replaced with
what the symbol identified as `name` currently is defined as. If you need a dollar sign in your string,
just double it up, e.g. `'The price is $$5'`. If you need a semi-colon in your string right after your
identifier, you need to double it up, e.g. `Hello $name;;`.

Interpolation can also execute a _value chain_ by putting it in parenthesis after the dollar sign,
e.g. `The total price is $$ $($itemPrice * $quantity)`.

### Arithmetic expression
The simplest form of arithmetic expression is just a literal number, e.g. `5`, or a [dereferenced value](#dereference).
Several numbers can be combined by arithmetic operators, e.g. `2 * $i - 8 / 4`:
* multiplication `*`
* division `/` (which truncates to the integer closest to 0)
* mathematical modulo, `mod`, which gives the positive number r = n mod q such that |r| < |q| and n = k*q + r for some k.
* addition `+`
* subtraction `-`

_Current limitations_: Only integers are supported.

_Possible future directions_: Support for exact arithmetic with rational numbers.
Decimal numbers will probably have to be typed by number of significant digits and a unit.

### Range literal
A range literal produces a [stream](#streams) of numbers. They are specified by a start, an end and
an optional increment, e.g. `1..10` will give the numbers 1 to 10 inclusive and `10..1:-1` does the same but backwards.
To exclude the bounds, add a tilde between the numeric bound and the range operator `..`, so `1~..5:2` will give `3 5`,
while `1..~5:2` will give `1 3`.

_Current limitations_: start, end and increment must all be integer literals. (At some point they will most likely be full arithmetic expressions)

### Array literal
An array literal produces an [array](#arrays) of values. It starts with a left bracket followed by
a [stream](#streams) of _value chains_, separated by commas, and ends with a right bracket.
Each _value chain_ may produce a stream of values, which will be flat-mapped into the array.
E.g. `[1,2,3,4,5]` and `[1..3, 4..5]` and `[1..5]` all produce an array of size 5 containing the numbers 1 to 5.

### Structure literal
A structure literal produces a [structure](#structures) value. It starts with a left brace, followed by
a [stream](#streams) of key-value pairs, optionally separated by commas, and ends with a right brace.
A key-value pair is an identifier followed by a colon and a _value chain_. E.g. `{ a: 0, b: 'hello' }`

### Input
Input is data obtained from an external source. An input source is currently defined as producing a stream
of lines of data (with the line-end markers removed).

#### Stdin
A user entering data in the terminal (or data from the unix standard input pipe) is accessed by the token `stdin`.
Once the standard input is closed (end of file, ctrl-D) it produces the stream of all lines entered, without line-end markers (return, newline).

### Dereference
An identifier can be defined to represent a value, e.g. `def myValue: _value chain_` where \_value chain\_ should be a _value chain_
that produces the desired value.
Then the value can be retrieved as a source itself by a dereference which is done by simply writing the
identifier prefixed by a dollar sign, e.g. `$myValue`

An identifier must have its value defined before it is used and the definition must be in the same scope
as, or a scope larger than (or outside), the scope where the dereference takes place.

A symbol may not change its value in the same scope, but it may be shadowed in a nested scope.

Note that templates have a modifiable state value that can be dereferenced, see [templates sinks](#templates-sinks)

## Sinks
A sink is a place where a value "disappears" and the value chain ends.

A symbol definition could be considered to have an implicit sink at the end that captures the value into the symbol.

Currently the defined explicit sinks are:
 * `-> stdout` which outputs the result stream, converted to text, into the standard output (generally the console).
 * `-> void` which is used to ignore the output.

Sinks generally denote side effects. The current specification is that each step of a _value chain_ is executed
for all of the values of a stream `$it` before the next step is evaluated. This may change.

### Templates sinks
A templates object has modifiable local temporary state, valid for the processing of one input value,
which can be modified by the special sink `@` and dereferenced as `$@`. Optionally, or to access
a surrounding outer templates object's state, you can append the templates name, e.g. `@name` and `$@name`.

The local state is also deeply modifiable so you could change just a field of the state object, e.g. `-> @.field` or `-> @name.field`,
or a position in an array, e.g. `-> @name(2;5)`. A sequenceof variables can also be assigned to an array slice,
e.g. `1..3 -> @(2..4)`

A modifiable local state reference can also function as a collector for the [merge operator](#merge-operator), which then
mutates the state, e.g. `-> ...@`.

Something that could be considered a local sink is in a [templates](#templates) block where a value is emitted out into the
result stream of the calling context. It is marked by an exclamation point `!`. Of course, the value in this case continues
elsewhere in the program, so it is not really a sink as such.

#### Merge operator
This is the same symbol as the deconstructor, but applied before a state object assignment instead of after a value dereference, e.g. `...@myState`
Slightly different things happen depending on what type of object is used as a collector:
 * A structure: the stream must be a stream of structures or keyed values (or just one structure or keyed value) and the result is that of
 the keys of each streaming structure is merged into the collector, possibly overwriting previous keys, e.g.
 if @ is `{a:1, b:1}` `{a:2, c:2} -> ...@` results in @ being `{a:2, b:1, c:2}`
 * A string: append the stream to the end of the string.
 * An array: append the stream to the end of the array.

## Transforms
Transforms take the current value (or each value separately from a [stream](#streams)) and convert
it into another value (or no value, or a stream of values) that is then passed to the next stage in the
chain, to ultimately end up in a [sink](#sinks).

### Literal transform
The preferred tailspin way to create new things is by a declarative literal expression. Most of the things
listed as [sources](#sources) qualify as transforms if they reference the _current value_ `$it`.

### Deconstructor
A deconstructor is a transform that works on [arrays](#arrays) by flowing the elements out of an array
into a [stream](#streams), e.g. `[4,7,9]...` will create a stream of the values 4, 7 and 9.
 
### Templates
A templates object consists of an optional _initial block_ and an optional sequence of [matchers](#matchers),
each with a _block_. A matcher block can be just the word `void`, which indicates that nothing should happen for this case.

A block is simply a series of value chains that either dry up, with no value for the next stage;
produce a value (or several) that gets emitted out of the template (by `!`); sends a value to a [sink](#sinks); or,
most important, __sends a value to the [matchers](#matchers)__

The initial block is executed with the value passed into the template accessible as the
current value, `$it`, at the beginning of each chain. If no initial block is provided, the current
value is sent to the [matchers](#matchers).

_Current limitations_: You cannot have an empty match block nor an empty templates object.

_Possible future directions_: There may be some default behaviour applied if no matching matcher
is found, perhaps to just deconstruct the object and sent its children to the matchers in turn.

#### Defined templates
Templates can be defined with an identifier as a top-level statement or inside another templates object.
The definition starts with `templates _identifier_` and ends with `end _identifier_`, where \_identifier\_
is the name you wish to assign, e.g.
```
templates add1
  $it + 1
end add1
```

Defined templates can have parameters that vary the way they execute. Parameters are defined just after the identifier
by an at-sign and a list of keys inside braces (similar to a structure literal), and are dereferenced as defined values, e.g.
```
templates add@{addend:}
  $it + $addend
end add
```

To call templates with parameters, set the values after the identifier by an at-sign and a [structure literal](#structure-literal)
where the keys in the structure must match the defined parameters, e.g. with the above definition
`3 -> add@{addend: 4} -> stdout` will print `7`.

#### Inline templates
Templates can be defined inline by just wrapping a templates body in parentheses, e.g.
`$it -> (<0> 'zero')` will output `zero` if `$it` was `0`

#### Array templates
Array templates is a convenient way to process [array](#arrays) elements individually together with
their index in the array. They are created by prefixing an [inline templates](#inline-templates)
definition with an identifier for the index within brackets,
e.g. `[4,5,6] -> [i]($it + $i)` will produce the value `[5,7,9]`.
Multiple dimensions also work, provided that the array structure has at least as many dimensions as specified.
e.g `[[1,2,3],[4,5,6]] -> [i,j]($it * $i + $j)` gives `[[2,4,6],[9,12,15]]`

### Composer
A composer takes a string and composes it into other objects according to the specified pattern.
A pattern consists of a sequence of result-constructing symbols and composition matchers. Sequences may be put in
parentheses to indicate that they should not be output.

The composer definition starts with `composer _identifier_` and ends with `end _identifier_`.

The main pattern is given first, but may be followed by named sub-patterns that are used within the composer.

E.g. to compose a string of text like `'Line(Point(5,7),Point(13,9))'` into the array of structures `[{x:5,y:7},{x:13,y:9}]`:
```
composer line
  (<'Line\('>) [ <point>, <point> ] (<')'>)
  point: (<'Point\('>) { x: <INT>, y: <INT> } (<')'>)
end line
```

Composition matchers can be string literals containing regexp patterns [(currently) according to java Pattern](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html).

Other composition matchers are the ones defined in the composer as sub-patterns.

There are also built-in composition matchers like `<INT>` which parses an integer and `<WS>` for a sequence of whitespace characters.

A composition matcher can have a multiplier qualifier after it:
 * `?` if it is optional, once or no times.
 * `*` if it can be repeated any number of times.
 * `+` for one or more times.
 * `=` followed by an exact count, e.g. `=2` for twice.

A composition matcher can be negated by a tilde just inside the bracket, e.g. `<~WS>`, which will match everything up until the next matching pattern.

A skipped value may be captured by prefixing the matcher with `def _identifier_:`, e.g. `(def val: <INT>)` will not output the parsed integer at that location
but captures it as `val`. This value may be output later as `$val`.

## Matchers
A matcher is a condition enclosed by angle brackets. A sequence of matchers is evaluated from the
start to the end, where the first matcher that matches the current value will have its block
executed for that current value.
* Empty condition always matches `<>`
* Value equals, a [dereferenced value](#dereference) matches according to standard rules of equality
* Numeric condition, [arithmetic expression](#arithmetic-expression) matches if equal, e.g. `<5>` for "equals 5"
* Range match has a lower bound and/or an upper bound separated by the range operator, with an optional tilde next to
 the range operator on the side(s) where the bound is not included. E.g.
  * `<2..5>` for "between 2 and 5 inclusive"
  * `<..3>` for "less than or equal to 3", or `<..~3>` for "less than 3"
  * `<10..>` for "greater than or equal to 10" , or `<10~..>` for "greater than 10"
  * A value dereference can be a bound, e.g. `<$min..$max>`
  * An arithmetic expression can be a bound if encased in parentheses, e.g. `<($a+4)..>`
  * Ranges can compare strings.
* String match, given as a [string literal](#string-literal), resolves as a _regular expression_ for matching the _current value_.
For more info on how string matching works, see the [java documentation](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html).
Note that the expression must match the entire value (this may change in future, as may the regular expression syntax).
`<''>` matches the empty string, `<'.*'>` matches any string, `<'.+'>` any non-empty string.
* Structure match is similar to a [structure literal](#structure-literal), surrounded by braces,
lists keys of fields that need to exist for the matcher to match, with a matcher for the value of the field, e.g.
  * `<{}>` matches any structure, but not numbers, strings or arrays
  * `<{a: <>}>` matches any structure that has a field `a`, whatever its value
  * `<{a:<0>, b:<1>}>` matches any structure that has a field `a` with value `0` and a field `b` with value `1`,
  whatever other fields it might have.
* Inverse match, to match the opposite of a conditon, just put a tilde inside the angle bracket, e.g. `<~5>`
* Array match, given as `<[]>` matches if the _current value_ is an array. A match can also be restricted to arrays
  of a certain length or range of lengths by appending the length (range) in parentheses, e.g. `<[](2..)>`
  
### Such-that conditions
Sometimes you want to match relations between parts of a structure or values at certain array positions, then you can
use a number of such-that conditions either after or instead of the main condition. E.g.
* Array where first and second elements are equal: `<[]?($it(1)<$it(2)>)>`
* Structure where the elements obey the relation a <= b <= c: `<?($it.a<..$it.b>)?($it.b<..$it.c>)>`

Such-that conditions can also be applied to transforms of the value. Note that those transforms must yield a single value for matching.

Note that a such-that conditions shifts the focus so that `$it` becomes the thing being matched. This makes no difference at
the top level but matters in nested such-thats.

## Streams
Streams occur when several values are created as the _current value_. Streams are processed by
repeating each step of the chain by setting __each__ of the stream values as the _current value_ in turn.
See the note on side effects in the section on [sinks](#sinks).

Streams can be captured into an [array](#arrays) by surrounding them with an [array literal](#array-literal).

Streams can be captured into a string by surrounding them in a [string literal](#string-literal) interpolation expression.

Streams of [key-value pairs](#keyed-values) can be captured in a [structure literal](#structure-literal).

## Arrays
Arrays are an ordered list of objects that can be turned into a [stream](#streams) by a [deconstructor](#deconstructor).

To access elements of an array, append a selector within parentheses, e.g. `$it(3)` to get the third element of the current array value.
The first element of an array has selector `1`. Elements can also be selected counting from the end
of the array by negative selectors, e.g. the last element of an array can be accessed by selector `-1`.

A new array can be created by selecting from an existing array by a [range literal](#range-literal).
Negative start or end values are interpreted as from the end of the array.
E.g. `$it(2..-2:3)` would select every third element starting at the second element and ending on or before
the second last element. As usual, you can leave out the increment which defaults to 1.

A new array can be created by selecting from an existing array with an array, e.g. `$it([3,1,5])`
would select the third element, followed by the first element and last the fifth element.

All these rules can be applied to multiple dimensions by separating the dimension dereferences with a semi-colon `;`, e.g.
`$it(1..3; 2)` to select the second element of each of the first three dimensions (returns a one-dimensional array of size 3,
although the elements could be arrays). Selecting only a few dimensions will select everything from the remaining dimensions
as a new array, but you cannot dereference it immediately in the same step.

It is an error to select elements outside the range of a dimension. However, impossible ranges are legal but result in an empty array.
In particular, zero is allowed in both the start and end of a range to always give an empty result,
to cater for using length as the end index `$it(1..$it::length)` when length is zero and taking the tail of the array after the last index, e.g. `$a($it+1..-1)` when _it_ is _-1_.

An array is a built-in processor that responds to the following messages:
* `::length` returns the length of the first dimension.

## Structures
A structure is a collection of named values without any inherent order. The field values of a structure
can be accessed by appending a dot and the field key identifier to the [dereference](#dereference) of the structure.
E.g. if the structure `{ a: 1 }` is the _current value_, the value `1` can be accessed by `$it.a`.

### Keyed values
A structure can be [deconstructed](#deconstructor) into a stream of keyed values (or key-value pairs).
The stream of keyed values can be captured into a [structure literal](#structure-literal) at some point.

When creating keyed values, the transform chain binds to the value, not the whole keyed value, e.g. `a: 1 -> (<1> 'yes')` will give the result `a: 'yes'`.
To send the keyed value through a transform, put it in parentheses, so `(a: 1) -> ...{}` creates `{a: 1}`.

## Processors
A processor is an object that is more complex than simply data. It would normally have some
state that could possibly change. To interact with processors, you send [messages](#messages) to them.

Internally in the processor, state is accessed like the [local state of templates](#templates-sinks), but with the processor name.
The processor state is, however, permanent as long as the processor object is retaned.

A processor definition looks similar to a templates object but the definition starts with the word `processor` instead.
Also, there are no match templates. The initial block is used to define state and values for the processor instance
that will be returned from using the processor definition as a transform.
All templates defined are considered to be messages that the processor instance can handle.

Processors can have parameters just like [defined templates](#defined-templates).

By convention, a processor definition should have an identifier starting with a capital letter.

### Messages
A message is sent to a processor by getting a reference to the processor and appending two colons and the message identifier,
e.g. `$it::length` to get the length of an array that is the _current value_.
