# tailspin-v0
Tailspin simplifies data transfer and the processing of data according to rules and conditions.
Thanks to its declarative data structures and corresponding condition matching syntax,
many algorithms look exactly like the specification, for example, compare the
[json parser](https://github.com/tobega/tailspin-v0/blob/master/samples/JSON.tt#L14)
and the [json specification](https://www.json.org/json-en.html).

Despite the grounding in business data processing, Tailspin turns out to be fun to use and has been
used for the [adventofcode](https://adventofcode.com/) events of [2018](https://github.com/tobega/aoc2018)
and [2019](https://github.com/tobega/aoc2019)

The inspiration comes mostly from xslt, but data structures are json-like. The main idea is to let your data flow through
a series of transforms so it should be easy to specify that flow. Transform steps can be specified as a set of templates with
pattern-matching determining which template to apply. Output is generally specified as literals with interpolation of values.
For more info see the [introduction to tailspin programming](https://tobega.blogspot.com/2020/05/a-little-tailspin.html)
 and the [language reference documentation](TailspinReference.md)

Some of my thinking that went into tailspin is elaborated in my [perfect programming language essay](https://cygni.se/the-perfect-programming-language/)
and in my [multidimensional plasma essay](https://cygni.se/is-your-programming-language-made-of-multidimensional-plasma/).

## Status
The syntax has been mainly determined to be sane and runnable. Did Adventofcode 2019 in Tailspin, found and fixed issues.

Cancelled work on [implementing tailspin on truffle/graalvm](https://github.com/tobega/tailspin-truffle). It may or may not be continued.

Next step is up in the air. Thoughts somewhere on the roadmap are in [my notes](notes.txt)

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
