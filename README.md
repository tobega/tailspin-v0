# tailspin-v0
A programming language with extreme pattern matching and declarative syntax, hopefully different enough to be interesting.
The inspiration comes mostly from xslt, but data structures are json-like. The main idea is to let your data flow through
a series of transforms so it should be easy to specify that flow. Transform steps can be specified as a set of templates with
pattern-matching determining which template to apply. Output is generally specified as literals with interpolation of values.
For more info see the [language reference documentation](TailspinReference.md)

## Status
The syntax has been mainly determined to be sane and runnable.

Work is now focused on improving speed and moving away from the purely interpreted implementation.

## Code samples
Small code samples can be found in the [samples folder](https://github.com/tobega/tailspin-v0/tree/master/samples).
Development is driven by code snippets in the [test/tailspin/samples folder](https://github.com/tobega/tailspin-v0/tree/master/test/tailspin/samples).

Larger example programs where I developed a tentative syntax are the [.tt files here](https://github.com/tobega/aoc2018) where the
problems are taken from https://adventofcode.com/2018 and the numbers in the filename match the day. These have now all been reworked to
be runnable.

Examples can also be found at [Rosetta code](http://www.rosettacode.org/wiki/Category:Tailspin)

## To run a tailspin program
Sorry, no easy way at the moment. Clone this repo, compile the sources (I use intellij), set the compiled .class files on your
classpath and execute `java tailspin.Tailspin path_to_your_program`
Oh, you'll need the antlr4 java runtime on your classpath as well, http://antlr4.org
In my setup this ends up as `java -cp out/production/tailspin-v0/:lib/antlr-runtime-4.7.2.jar tailspin.Tailspin samples/FizzBuzz.tt`

## Mucking about with the parser and lexer
Generate code by
`antlr4 -no-listener -visitor -o src/tailspin/parser -package tailspin.parser TailspinLexer.g4 TailspinParser.g4`
then compile everything, run the tests.
Don't touch stuff in tailspin.parser, that's generated. RunMain is the
main interpreter implementation where most new stuff is added.

## Contributing
When it comes to language syntax I will be the final arbiter and dictator. It is
important to get things that look similar to somehow work similarly
(with obvious translations of context). Happy to accept feedback on things that seem illogical
or unharmonious.

Happy to accept suggestions of sample programs and attempts to solve it. If new syntax is thought
to be needed, I could also consider suggestions, even if it means changing previous syntax
choices to achieve the desired harmony. Note, though, that Tailspin does not have goals to be either
minimal or complete, features that seem mostly theoretical do not have to be implemented.

Happy to accept contributions that enable full unicode support.

Happy to accept contributions that fix up the build system and make it easier to run tailspin programs.

Happy to accept suggestions for cleaning up the code.

Happy to accept contributions that aim to move this beyond interpreter stage (well, guess that would be another project, tailspin-v1).
My basic idea is to finally have a runtime engine, I think the Dart VM might be a good match.
