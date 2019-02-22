# Tailspin reference
This is the syntax as it is working so far, with some indications of future developments

## Basic structure
A typical tailspin statement starts with a [source](#sources) for a value,
which is then sent (usually by the `->` marker) through a series of [transforms](#transforms)
(a.k.a a _value chain_) to a [sink](#sinks). In contexts that can produce a value, you just
leave out the sink to emit the resulting value. The current value, referred to as `$it`, at each
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

### Dereference
An identifier can be defined to represent a value, e.g. `def myValue: _value chain_` where \_value chain\_ should be a _value chain_
that produces the desired value.
Then the value can be retrieved as a source itself by a dereference which is done by simply writing the
identifier prefixed by a dollar sign, e.g. `$myValue`

An identifier must have its value defined before it is used and the definition must be in the same scope
as, or a scope larger than (or outside), the scope where the dereference takes place.

A symbol may not change its value in the same scope, but it may be shadowed in a nested scope.

Note that templates have a modifiable state value that can be dereferenced, see [templates sinks](#templates-sinks)

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

_Current limitations_: start, end and increment must all be integer literals. (At some point they will most likely be full arithmetic expressions)

### Array literal
An array literal produces an [array](#arrays) of values. It starts with a left bracket followed by
a [stream](#streams) of _value chains_, optionally separated by commas, and ends with a right bracket.
E.g. `[1,2,3,4,5]` and `[1 2 3, 4 5]` and `[1..5]` all produce an array of size 5 containing the numbers 1 to 5.

### Structure literal
A structure literal produces a [structure](#structures) value. It starts with a left brace, followed by
a [stream](#streams) of key-value pairs, optionally separated by commas, and ends with a right brace.
A key-value pair is an identifier followed by a colon and a _value chain_. E.g. `{ a: 0, b: 'hello' }`

## Sinks
A sink is a place where a value "disappears" and the value chain ends.

A symbol definition could be considered to have an implicit sink at the end that captures the value into the symbol.

Currently the only defined explicit sink is `-> stdout` which outputs the result stream, converted to text,
into the standard output (generally the console).

### Templates sinks
A templates object has modifiable local temporary state, valid for the processing of one input value,
which can be modified by the special sink `:` and dereferenced as `$:`. Optionally, or to access
a surrounding outer templates object's state, you can append the templates name, e.g. `:name` and `$:name`.

Something that could be considered a local sink is in a [templates](#templates) block where a value is emitted out into the
result stream of the calling context. It is marked by an exclamation point `!`. Of course, the value in this case continues
elsewhere in the program, so it is not really a sink as such.

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
each with a _block_.

A block is simply a series of value chains that either dry up, with no value for the next stage;
produce a value (or several) that gets emitted out of the template (by `!`); sends a value to a [sink](#sinks); or,
most important, __sends a value to the [matchers](#matchers)__

The initial block is executed with the value passed into the template accessible as the
current value, `$it`, at the beginning of each chain. If no initial block is provided, the current
value is sent to the [matchers](#matchers).

_Current limitations_: You cannot have an empty match block nor an empty templates object.

_Possible future directions_: There may be some default behaviour applied if no matching matcher
is found, perhaps to just deconstruct the object and sent its children to the matchers in turn.
A special token may be introduced to specifically indicate that output is squashed,
perhaps a [sink](#sinks) called `void`.

#### Defined templates
Templates can be defined with an identifier as a top-level statement or inside another templates object.
The definition starts with `templates _identifier_` and ends with `end _identifier_`, where \_identifier\_
is the name you wish to assign, e.g.
```
templates add1
  $it + 1
end add1
```

#### Inline templates
Templates can be defined inline by just wrapping a templates body in parentheses, e.g.
`$it -> (<0> 'zero')` will output `zero` if `$it` was `0`

#### Array templates
Array templates is a convenient way to process [array](#arrays) elements individually together with
their index in the array. They are created by prefixing an [inline templates](#inline-templates)
definition with an identifier for the index within brackets,
e.g. `[4,5,6] -> [i]($it + $i)` will produce the value `[5,7,9]`.

## Matchers
A matcher is a condition enclosed by angle brackets. A sequence of matchers is evaluated from the
start to the end, where the first matcher that matches the current value will have its block
executed for that current value.
* Empty condition always matches `<>`
* Numeric condition, [arithmetic expression](#arithmetic-expression) matches if equal, e.g. `<5>` for "equals 5"
* Range match has a lower bound and/or an upper bound separated by the range operator, e.g.
  * `<2..5>` for "between 2 and 5 inclusive"
  * `<..3>` for "less than or equal to 3"
  * `<10..>` for "greater than or equal to 10" 
* String match, given as a [string literal](#string-literal), resolves as a _regular expression_ for matching the _current value_.
For more info on how string matching works, see the [java documentation](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html).
Note that the expression must match the entire value (this may change in future, as may the regular expression syntax).
* Structure match is similar to a [structure literal](#structure-literal), surrounded by braces,
lists keys of fields that need to exist for the matcher to match, with a matcher for the value of the field, e.g.
  * `<{}>` matches any structure, but not numbers, strings or arrays
  * `<{a: <>}>` matches any structure that has a field `a`, whatever its value
  * `<{a:<0>, b:<1>}>` matches any structure that has a field `a` with value `0` and a field `b` with value `1`,
  whatever other fields it might have.

## Streams
Streams occur when several values are created as the _current value_. Streams are processed by
repeating the remainder of the chain by setting __each__ of its values as the _current value_ in turn.
Streams can be captured into an [array](#arrays) by surrounding them with an [array literal](#array-literal).

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

_Future directions_: Multidimensional arrays.

## Structures
A structure is a collection of named values without any inherent order. The field values of a structure
can be accessed by appending a dot and the field key identifier to the [dereference](#dereference) of the structure.
E.g. if the structure `{ a: 1 }` is the _current value_, the value `1` can be accessed by `$it.a`.