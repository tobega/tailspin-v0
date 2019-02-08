# tailspin-v0
A programming language with extreme pattern matching and declarative syntax, hopefully different enough to be interesting.
The inspiration comes mostly from xslt, but data structures are json-like. The main idea is to let your data flow through
a series of transforms so it should be easy to specify that flow. Transform steps can be specified as a set of templates with
pattern-matching determining which template to apply. Output is generally specified as literals with interpolation of values.

Example programs where I developed a tentative syntax are the [.tt files here](https://github.com/tobega/aoc2018) where the
problemsare taken from https://adventofcode.com/2018 and the numbbers in the filename matches the day.
These programs cannot yet be run, this project is creating an interpreter in java to verify that the syntax is sane and runnable.
What can be run (except perhaps the latest one) are the programs in the [samples folder](https://github.com/tobega/tailspin-v0/tree/master/samples).
Development is driven by code snippets in the [test/tailspin/samples folder](https://github.com/tobega/tailspin-v0/tree/master/test/tailspin/samples).

## To run a tailspin program
Sorry, no easy way at the moment. Clone this repo, compile the sources (I use intellij), set the compiled .class files on your
classpath and execute `java tailspin.interpreter.Tailspin path_to_your_program`
Oh, you'll need the antlr4 java runtime on your classpath as well, http://antlr4.org
