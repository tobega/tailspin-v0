# Notes
## Things to add/improve
- left-recursion in composers
- Standard library.
    - Should definitely include relvars as DB-interface (see The Third Manifesto). API vs impl?
    - networking
    - files. File systems? module loading of API vs implementation? Handled by duck-typing?
- Contracts and type specifications: Based on matchers. Maybe "templates connect requires <[<point>*]> produces <line>*"
  How about matchers for processor protocols? Specify minimum requirements, extra stuff allowed.
- Concurrency: The basic idea is that state variable changes will be transactional/atomic for each processor template or template chain stage.
  Mechanism will likely be "CAS or retry". How about processors holding processors, giving a "distributed" transaction?
- Rational numbers, exact math?
- Scientific numbers, specify digits of accuracy. Units required? Syntax when going from exact number division?
- Performance. Definitely need better data structures for lists and structures.
- Error handling. Error path/exception path? VOID path? Need examples to play with.
- Want prepend to array/structure. Syntax? ..< and ..> instead of ..| maybe or >> and << ? Does a stream get prepended
  in reverse or as a chunk? 1..3 -> |..@: $; is probably the best prepend syntax
- Are lenses currently enough or do we need some kind of reflective access? E.g. field access like myStruct."$fieldName;"? Or just ($::key)?
- Unlimited size arrays
- Use composers as rules in other composers (and INT and WS should be top-level composers)
- Projection just copying all fields or all fields except some

### Automatic names as types and number units
Field names of a structure automatically correspond to a type, which is automatically inferred if it
is not declared.

Numbers can be assigned units and the unit then determines the type, while numbers without units will
become auto-typed identifiers. Proposed syntax for units is double quotes around a symbolic expression
where numbers are powers, space is multiplication and there is one slash allowed for division,
e.g. `"kg m2/s2"` or the inverse `"s2/kg m2"`

### Exceptions
Proposed syntax is
```
$foos... -> try myTransform recover myInput ...block... end myInput -> ...
```
where myInput is the name defined for the original input to the try expression.
Any emissions from the recover block will just continue on in the value chain.

Syntax for creating exceptions and format for error objects TBD (just throw any object, I think)

## Errors easy to make
- Mixed up ..$bound and $bound.., hard to see error
- Given source abc, hard to see call to $abc when intended $@abc
- Easy to forget to use the name of the outer template in a simple filter \(<=$@.foo> $ !\)
- Comparing the wrong type in the branch to stop recursion. In future, a type analysis should catch it,
  for now you can defensively always stop recursion on the otherwise-branch

## Illogical?
- Should we be able to use inline templates as sources and sinks?
- What about array generators (array template source)?
- Should we be able to specify defined templates to be array templates?
- Cannot specify the header for empty relations
- When a definition refers to a mutable processor instances, and if another definition is produced from the processor, statements mutating state will not execute before the second definition.

## Bugs
- composer rule updates state when called in not-context:
  operator (word count char)
  composer howMany
  @: 0;
  (<not|is_char>+) $@
  rule is_char: (<='$char;'>) (@: $@ + 1;)
  rule not: (<~is_char>)
  end howMany
  $word -> howMany !
  end count

## Too much syntax?
- quick filter by \<match> to mean \(<match> $!\).
- filter array dereference, $a(<match>) to select all elements that match, like $a -> \[_](<match> $!\)
  The downside of this one is that it doesn't extend easily? Or textually it actually does!
- allow array templates to have persistent state. Syntax for initializing? Easy enough to wrap the array templates?
- More sugar for state-changes, e.g. ..+ or may ++ to add to the state variable?
- Array templates where you select a slice (or maybe all) of a dimension
- Cartesian indexes, i.e. select multi-dimensional points, e.g. $a([:(1;1), :(2;2), :(3;3)]) for diagonal. Extend to
  field referenses as lenses?
- an "ignore" rule for composers (tried before, between rules and after, useful for e.g. whitespace)
- Multidimensional array-length-match
- Dynamic composition of composers

## Other thoughts
- Use more words instead of symbols? YES, easier to scan and search. Even redundant words (to some limit).
- How much meta-programming do we want to let loose? Should everything be assignable as data? In that case, what about serialization?
  Currently processors are a little in-between: if we can pass processor instances in the chain, why not templates?
- Different kinds of hand-over between transforms? E.g. '=>' for proceed in parallel.
- Do we need some kind of exit statement to abandon a stream? e.g. "findFirst"/"findAny" Or do you have to code it as iterated matching?
- Vector arithmetic?
- Access original array in array templates?
