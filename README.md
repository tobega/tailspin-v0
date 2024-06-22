# tailspin-v0

## Status
The next step in the evolution of Tailspin is coming up, starting work in https://github.com/tobega/tailspin-v0.5

The syntax will mainly remain the same, but some things will be reworked from learnings in https://tobega.blogspot.com/2024/01/usability-in-programming-language.html

The implementation will also be redone from scratch, aiming at using incremental parsing (for a language server and a REPL) and graal-vm Truffle

This repo still contains a working copy of the Tailspin evolution up until 2024-01-27.

## Introduction
Tailspin simplifies data transfer and the processing of data according to rules and conditions.
Thanks to its declarative data structures and corresponding condition matching syntax,
many algorithms look exactly like the specification, for example, compare the
[json parser](https://github.com/tobega/tailspin-v0/blob/master/samples/JSON.tt#L14)
and the [json specification](https://www.json.org/json-en.html).

Tailspin has a rather different-looking syntax, tl;dr; @ is mutable state, $ is the current value, processing is by an assembly-line
of steps separated by -> where each step creates the next current value as input to the next step, and anything inside angle brackets (<>) is a match expression.
For a quick introduction to Tailspin, see [learn Tailspin in Y minutes](https://learnxinyminutes.com/docs/tailspin/) or look at [snippets compared to javascript](https://tobega.blogspot.com/2021/05/learning-tailspin-by-comparing-to.html) or the [introduction to tailspin programming](https://tobega.blogspot.com/2020/05/a-little-tailspin.html). Tailspin "functions" can return a stream of zero or more values, I've written about [how returning no value at all is quite powerful](https://tobega.blogspot.com/2021/05/the-power-of-nothing.html).
I have also made an attempt to do a [Cognitive Dimensions evaluation of Tailspin](https://tobega.blogspot.com/2022/12/evaluating-tailspin-language-after.html) and an [analysis of programming language concepts](https://tobega.blogspot.com/2024/01/usability-in-programming-language.html)

The inspiration for Tailspin comes mostly from XSLT, but data structures are json-like. The main idea is to let your data flow through
a series of transforms so it should be easy to specify that flow. Transform steps can be specified as a set of templates with
pattern-matching determining which template to apply. Output is generally specified as literals with interpolation of values.
For more info see the [language reference documentation](TailspinReference.md).

Tailspin aims to let you process your data as easily and flexibly as possible, while at the same time trying to help/coerce you to "do the right thing"
without introducing lots of boilerplate. Tailspin will error if it seems you may have made a programming error.

Despite the grounding in business data processing, Tailspin turns out to be fun to use and has been
used for the [adventofcode](https://adventofcode.com/) events of [2018](https://github.com/tobega/aoc2018), [2019](https://github.com/tobega/aoc2019), [2020](https://github.com/tobega/aoc2020), [2021](https://github.com/tobega/aoc2021), [2022](https://github.com/tobega/aoc2022) and [2023](https://github.com/tobega/aoc2023)

A more advanced programming example with explanations is [TDD-ing a sudoku solver](https://tobega.blogspot.com/2020/05/creating-algorithm.html).
There is also an example of integrating with java to create a [rock-paper-scissors REST service](https://github.com/tobega/rps-tailspin).

Some of my thinking that went into tailspin is elaborated in my [perfect programming language essay](https://cygni.se/the-perfect-programming-language/)
and in my [multidimensional plasma essay](https://cygni.se/is-your-programming-language-made-of-multidimensional-plasma/).

## Code samples
Small code samples can be found in the [samples folder](https://github.com/tobega/tailspin-v0/tree/master/samples).
Development is driven by unit test code snippets in the [test/tailspin/samples folder](https://github.com/tobega/tailspin-v0/tree/master/test/tailspin/samples).

Larger example programs where I developed a tentative syntax are the [.tt files here](https://github.com/tobega/aoc2018) where the
problems are taken from [adventofcode 2018](https://adventofcode.com/2018) and the numbers in the filename match the day. These have now all been reworked to
be runnable.

I also did [adventofcode 2019](https://adventofcode.com/2019) in Tailspin in [my repository](https://github.com/tobega/aoc2019)

Examples can also be found at [Rosetta code](http://www.rosettacode.org/wiki/Category:Tailspin)

## To run a tailspin program
The easiest way is to just download "tailspin.jar" from this directory. Then you run `java -jar tailspin.jar path/to/your/program.tt`

If you use vscode, there is a launch configuration so you can run programs from your editor. You just need to change the args as appropriate. There is also a [language extension under development](https://github.com/tobega/vsc-tailspin-language)

To build from source, clone this repo and use Apache Ant and run "ant jar" in this directory. That will use the "build.xml" file to create "tailspin.jar" and classfiles in "out/production/tailspin-v0".

If you want to compile it your own way, set the compiled .class files on your
classpath and execute `java tailspin.Tailspin path_to_your_program`
Oh, you'll need the antlr4 java runtime on your classpath as well, http://antlr4.org
In my setup this ends up as `java -cp out/production/tailspin-v0/:lib/antlr-runtime-4.8.jar tailspin.Tailspin samples/FizzBuzz.tt`

## Mucking about with the parser and lexer
Generate code by
`antlr4 -no-listener -visitor -o src/tailspin/parser -package tailspin.parser TailspinLexer.g4 TailspinParser.g4`
then compile everything, run the tests.
Don't touch stuff in tailspin.parser, that's generated. RunMain is the
main interpreter implementation where most new stuff is added.

## Running the tests
Java 16 has locked down internal modules so you need to add `--add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.stream=ALL-UNNAMED`
jvm parameters on the command line for junit tests.

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
My basic idea is to finally have a dedicated Tailspin vm.
