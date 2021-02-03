package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Templates {
  @Test
  void inlineMatchers() throws Exception {
    String program = "1..3 -> \\(<=2> 'Goodbye '! <> 'Hello '!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello Goodbye Hello ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void lambda() throws Exception {
    String program = "1..3 -> \\(<=2> 'Goodbye '! <> 'Hello '!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello Goodbye Hello ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void namedLambda() throws Exception {
    String program = "1..3 -> \\name(<=2> 'Goodbye '! <> 'Hello '!\\name) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello Goodbye Hello ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void lambdaHasNotImportedName() {
    String program = "1..3 -> \\my/name(<=2> 'Goodbye '! <> 'Hello '!\\my/name) -> !OUT::write";
    assertThrows(Exception.class, () -> Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8))));
  }

  @Test
  void namedLambdaCanHaveKeywordName() throws Exception {
    String program = "1..3 -> \\package(<=2> 'Goodbye '! <> 'Hello '!\\package) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello Goodbye Hello ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void namedLambdaState() throws Exception {
    String program = "[1..3] -> \\name(@: 5; $... -> \\(<=2> @name: $@name + $;\\) -> !VOID $@ ! \\name) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("7", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mismatchedNameLambda() throws Exception {
    String program = "1..3 -> \\name(<=2> 'Goodbye '! <> 'Hello '!\\amen) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void templatesHasNotImportedName() {
    String program = "templates my/spin\n<=5> $ + 2 ! <> $ + 1 -> #\nend my/spin\n" + "1 -> my/spin -> !OUT::write";
    assertThrows(Exception.class, () -> Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8))));
  }

  @Test
  void recursiveMatch() throws Exception {
    String program =
        "templates spin\n<=5> $ + 2 ! <> $ + 1 -> #\nend spin\n" + "1 -> spin -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("7", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void recursiveCall() throws Exception {
    String program =
        "templates spin\n<=5> $ + 2 ! <> $ + 1 -> spin !\nend spin\n" + "1 -> spin -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("7", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void consecutiveChainsInMatchBlock() throws Exception {
    String program =
        "templates spin\n<=5> $ + 2 ! <> $ + 1 -> #\n $ -> !OUT::write\nend spin\n"
            + "1 -> spin -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // Calls to stdout in the templates happen before the next part of the chain is
    // sent to stdout, even though the "return value" is output before the values to stdout
    // Maybe a return value should "push through" to the end first? Or not?
    // The current effect could be described as "everything in the templates object completes
    // before the next stage is started"
    assertEquals("43217", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void consecutiveChainsInMatchBlockReversedOrder() throws Exception {
    String program =
        "templates spin\n<=5> $ + 2 ! <> $ -> !OUT::write\n $ + 1 -> #\nend spin\n"
            + "1 -> spin -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // Thi is entirely as expected by any mental model
    assertEquals("12347", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void multipleResultsInMatchBlock() throws Exception {
    String program =
        "templates spin\n<=5> $ + 2 ! <> $ + 1 -> #\n $ !\nend spin\n" + "1 -> spin -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // Here the return values do get generated in the "correct" order
    assertEquals("74321", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void initialBlock() throws Exception {
    String program = "templates simple\n$ + 1 !\n $ !\nend simple\n" + "1 -> simple -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // Here the return values do get generated in the "correct" order
    assertEquals("21", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void initialBlockCallsTemplates() throws Exception {
    String program =
        "templates simple\n$ + 1 -> #\n <> $ + 1 !\nend simple\n" + "1 -> simple -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // Here the return values do get generated in the "correct" order
    assertEquals("3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void noBlockRunTemplatesInNestedScope() throws Exception {
    String program =
        "templates simple\n<=1>def a: 'aA';\n 2 -> #\n<=2> $a !\nend simple\n" + "1 -> simple -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void templateCallsTemplatesNoNestedScope() throws Exception {
    String program =
        "templates simple\n1 -> #\n<=1>def a: 'aA';\n 2 -> #\n<=2> $a !\nend simple\n" + "1 -> simple -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void templateCallsTemplatesTwiceNoNestedScope() throws Exception {
    String program =
        "templates simple\n1 -> #\n<=1>def a: 'aA';\n 2 -> #\n<=2> 3 -> # <=3> $a !\nend simple\n" + "1 -> simple -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void lambdaArrayTemplates() throws Exception {
    String program = "[2..4] -> \\[i]($i * $ !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[2, 6, 12]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void namedLambdaArrayTemplates() throws Exception {
    String program = "[2..4] -> \\name[i]($i * $ !\\name) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[2, 6, 12]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayLambdaHasNotImportedName() {
    String program = "[2..4] -> \\my/name[i]($i * $ !\\my/name) -> !OUT::write";
    assertThrows(Exception.class, () -> Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8))));
  }

  @Test
  void namedLambdaArrayTemplatesCanHaveKeywordName() throws Exception {
    String program = "[2..4] -> \\source[i]($i * $ !\\source) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[2, 6, 12]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void namedLambdaArrayTemplatesState() throws Exception {
    String program = "[2..4] -> \\name[i](@: $; $i -> \\(<=2> @name: $@name + $;\\) -> !VOID $@ ! \\name) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[2, 5, 4]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mismatchedNameLambdaArrayTemplates() throws Exception {
    String program = "[2..4] -> \\name[i]($i * $ !\\amen) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void arrayTemplateMatch() throws Exception {
    String program = "[2..4] -> \\[i](<?($i <=3>)> 'i' ! <=3> 'it' ! <> 'neither' !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[neither, it, i]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayTemplates2D() throws Exception {
    String program = "[[2..4], [3..5]] -> \\[i;j](($i * $) + $j !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[3, 5, 7], [7, 10, 13]]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayTemplates3D() throws Exception {
    String program = "[[[2..4], [3..5]], [[1,3,5], [2,4,6]]] -> \\[i;j;k](($i * $k) + $j * $ !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[[3, 5, 7], [7, 10, 13]], [[3, 7, 11], [6, 12, 18]]]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void multipleTransforms() throws Exception {
    String program = "1 -> \\(<> 2!\\) -> \\(<> 3!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void templatesState() throws Exception {
    String program =
        "templates state\n@: $ + 1;\n$ -> #\n<> $@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // Here the return values do get generated in the "correct" order
    assertEquals("2", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void templatesNamedState() throws Exception {
    String program =
        "templates state\n@state: $ + 1;\n$ -> #\n<> $@state !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // Here the return values do get generated in the "correct" order
    assertEquals("2", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void templatesNamedNestedState() throws Exception {
    String program =
        "templates state\n"
            + "templates nested\n"
            + "@state: $ + 1;\n"
            + "end nested\n"
            + "$ -> nested !\n"
            + "$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // Here the return values do get generated in the "correct" order
    assertEquals("2", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void templatesNamedFromInline() throws Exception {
    String program =
            "templates state\n1..3 -> \\(@state: $ + 1;\\) !\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // Here the return values do get generated in the "correct" order
    assertEquals("4", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void streamMatcherBlock() throws Exception {
    String program = "1..3 -> \\(<> 'Goodbye '! 'Hello '!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Goodbye Hello Goodbye Hello Goodbye Hello ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void correctItOnNextValueChain() throws Exception {
    String program = "1..3 -> \\($ + 1 -> !OUT::write $ !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("234123", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void streamToMatchers() throws Exception {
    String program = "1 -> \\(1..3 -> # <=2> $!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("2", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void streamToMatcherBlock() throws Exception {
    String program = "1 -> \\(1..3 -> # <> $! $!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("112233", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void voidMatcherBlock() throws Exception {
    String program = "1..3 -> \\(<=2> !VOID <> 'Hello '!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello Hello ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void parameter() throws Exception {
    String program = "templates comp&{pivot:} <..$pivot> 'le' ! <> 'gt' ! end comp\n"
        + "1..6 -> comp&{pivot: 3} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("lelelegtgtgt", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void higherOrderFunction() throws Exception {
    String program = "templates low <..3> 1 ! <> 0 ! end low\n"
        + "templates comp&{discriminator:} $ -> discriminator -> # <=1> 'yes' ! <> 'no' ! end comp\n"
        + "1..6 -> comp&{discriminator: low} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yesyesyesnonono", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void throwOnDereferenceFunction() throws Exception {
    String program = "templates low <..3> 1 ! <> 0 ! end low\n"
        + "templates comp&{discriminator:} $ -> $discriminator -> # <=1> 'yes' ! <> 'no' ! end comp\n"
        + "1..6 -> comp&{discriminator: low} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void functionOfFunction() throws Exception {
    String program = "templates low <..3> 1 ! <> 0 ! end low\n"
        + "templates comp&{discriminator:} $ -> discriminator -> # <=1> 'yes' ! <=0> 'no' ! <> $ ! end comp\n"
        + "templates meta&{f:} $ -> f&{discriminator: low} ! end meta\n"
        + "1..6 -> meta&{f: comp} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yesyesyesnonono", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void attemptToRedefineCurriedParameter() throws Exception {
    String program = "templates low <..3> 1 ! <> 0 ! end low\n"
        + "templates comp&{discriminator:} $ -> $discriminator -> # <=1> 'yes' ! <> 'no' ! end comp\n"
        + "templates meta&{f:} $ -> f&{discriminator: low} ! end meta\n"
        + "1..6 -> meta&{f: comp&{discriminator: low}} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void streamedParameter() throws Exception {
    String program = "templates comp&{pivot:} 4 -> # <..$pivot> 'le' ! <> 'gt' ! end comp\n"
        + "1..6 -> comp&{pivot: $} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("gtgtgtlelele", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void templatesStateAssignedEmptyStream() throws Exception {
    String program =
        "templates state\n@: 1;\n@: $ -> \\(<5..> $ !\\);\n$@ !\nend state\n" + "3 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void templatesStateAssignedMultiValuedStream() throws Exception {
    String program =
        "templates state\n@: 1;\n@: 1..$;\n$@ !\nend state\n" + "3 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void deleteState() throws Exception {
    String program =
        "templates state\n@: $;\n^@ -> !OUT::write\n$@ !\nend state\n" + "3 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));

    assertEquals("3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void templatesWithKeywordName() throws Exception {
    String program =
        "templates def\n@def: $;\n^@def -> !OUT::write\n$@def !\nend def\n" + "3 -> def -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));

    assertEquals("3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void sourceWithKeywordName() throws Exception {
    String program =
        "source def\n3 !\nend def\n" + "$def -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void sinkWithKeywordName() throws Exception {
    String program =
        "sink def\n$ -> !OUT::write\nend def\n" + "3 -> !def";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void cannotAccessCallingScope() throws Exception {
    String program =
        "templates bar\n$ + $foo !\nend bar\n"
            + "templates baz\n def foo: 2;\n$ -> bar !\nend baz\n"
            + "3 -> baz -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void shouldAccessDefiningScope() throws Exception {
    String program =
        "def foo: 1;\ntemplates bar\n$ + $foo !\nend bar\n"
            + "templates baz\n def foo: 2;\n$ -> bar !\nend baz\n"
            + "3 -> baz -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("4", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dynamicReferenceAssignment() throws Exception {
    String program =
        "templates bar\n@: [4,5,6]; def foo: $; @($foo): 0; $@!\nend bar\n"
            + "2 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[4, 0, 6]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dynamicDereference() throws Exception {
    String program =
        "templates bar\n@: [4,5,6];\ndef foo: $;\n $@($foo)!\nend bar\n"
            + "2 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void defineFromSendToMatchers() throws Exception {
    String program =
        "templates bar\ndef foo: $ -> #;\n$foo!\n <=1> 2! <> 0!\nend bar\n"
            + "1 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("2", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void stateAssignedFromSendToMatchers() throws Exception {
    String program =
        "templates bar\n@: $ -> #;\n$@!\n <=1> 2! <> 0!\nend bar\n"
            + "1 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("2", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void stateAssignedAfterValueChain() throws Exception {
    String program =
        "templates bar\n@: 0;\n1..$ -> @: $ + $@;\n$@!\nend bar\n"
            + "3 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("6", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void source() throws Exception {
    String program =
        "source nums\n1..3 !\nend nums\n"
            + "$nums -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("123", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void sink() throws Exception {
    String program =
        "sink decorate\n'=$;=' -> !OUT::write\nend decorate\n"
            + "1..3 -> !decorate";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("=1==2==3=", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void noMessageToDeleteReference() {
    String program =
        "templates bad\n@: [$];\n^@::length !\nend bad\n"
            + "1 -> bad -> !OUT::write";
    assertThrows(Exception.class, () -> Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8))));
  }

  @Test
  void stateAsTemplatesReference() throws Exception {
    String program =
        "templates state\n@: $; 1 -> @::length !\nend state\n"
            + "[1..3] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void previousStepsMustBeCompletedBeforeStartingNext() throws Exception {
    String program =
        "templates state\n"
            + "1..3 -> \\(<> @state: 1; $!\\) -> \\(<?($@state <=$>)> !VOID\n"
            + "  <> @state:$+1; $!\\) !"
            + "\nend state\n"
            + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("2", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void templatesParameterResolvesInDefinitionScope() throws Exception {
    String program =
        "templates foo $+1 ! end foo\n"
            + "templates bar&{baz:}\n"
            + "  templates foo $+5 ! end foo\n"
            + "  $ -> baz !\n"
            + "end bar\n"
            + "1 -> bar&{baz: foo} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("2", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void lensAsParameter() throws Exception {
    String program =
        "def a: [{foo:5}, {foo:7}, {foo:9}];"
            + "templates bar&{baz:}\n"
            + "  $ + $a(baz) !\n"
            + "end bar\n"
            + "1 -> bar&{baz: (2; foo:)} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("8", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void lensAsParameterComposes() throws Exception {
    String program =
        "def a: [{foo:[5, 2]}, {foo:[7, 3]}, {foo:[9, 4]}];"
            + "source bar&{baz:}\n"
            + "  $a(baz; 1) !\n"
            + "end bar\n"
            + "$bar&{baz: (2; foo:)} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("7", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void lensParameterResolvesInDefiningScope() throws Exception {
    String program =
        "def a: [{foo:5}, {foo:7}, {foo:9}];"
            + "source bar&{baz:}\n"
            + "  2 -> $a(baz) !\n"
            + "end bar\n"
            + "1 -> $bar&{baz: ($; foo:)} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }
}
