# Tailspin reference
This is the syntax as it is working so far, with some indications of future developments

## Basic structure
A typical tailspin statement starts with a [source](#sources) for a value,
which is then sent (usually by the `->` marker) through a series of [transforms](#transforms)
(a.k.a a _value chain_) to a [sink](#sinks). In contexts that can produce a value, you just
leave out the sink to emit the resulting value.

A transform is typically a [templates](#templates) object where the block to be executed is
decided by a [matcher](#matchers) on the current value (referred to as `$it`).

## Sources
A source is the simplest _value chain_, simply producing a value.

### Dereference
An identifier can be defined to represent a value, e.g. `def myValue: _value chain_` where \_value chain\_ should be a _value chain_
that produces the desired value.
Then the value can be retrieved as a source itself by a dereference which is done by simply writing the
identifier prefixed by a dollar sign, e.g. `$myValue`

An identifier must have its value defined before it is used and the definition must be in the same scope
as, or a scope larger than (or outside), the scope where the dereference takes place.

### String literal
A series of characters within single quotes, e.g. `'Hello World!'`. To write
a single quote in a string, just double it up, e.g. `'What''s up?'`.

A dollar sign is used to do string interpolation with a [dereferenced value](#dereference), e.g. `Hello $name` to get `$name` replaced with
what the symbol identified as `name` currently is defined as. If you need a dollar sign in your string,
just double it up, e.g. `'The price is $$5'`. You can optionally mark the end of the identifier
with a semi-colon, e.g. `Hello $name;`, so if you need a semi-colon in your string right after your
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
a [stream](#streams) of _value chains_, optionally separated by commas, and ended by a right bracket.
E.g. `[1,2,3,4,5]` and `[1 2 3, 4 5]` and `[1..5]` all produce an array of size 5 containing the numbers 1 to 5.

## Sinks
A sink is a place where a value "disappears" and the value chain ends. A symbol definition could
be considered to have an implicit sink at the end that captures the value into the symbol.
Another implicit sink is in a [templates](#templates) block where a value is emitted out into the
result stream of the calling context.
Currently the only defined explicit sink is `-> stdout` which outputs the result stream, converted to text,
into the standard output (generally the console).

## Transforms
Transforms take the current value (or each value separately from a [stream](#streams)) and convert
it into another value (or no value, or a stream of values) that is then passed to the next stage in the
chain, to ultimately end up in a [sink](#sinks).

### Deconstructor
A deconstructor is a transform that works on [arrays](#arrays) by flowing the elements out of an array
into a [stream](#streams), e.g. `[4,7,9]...` will create a stream of the values 4, 7 and 9.

### Templates
A templates object takes the current value, referred to as `$it`, 

#### Matchers

## Streams

## Arrays
