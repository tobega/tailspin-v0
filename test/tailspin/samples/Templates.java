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
    String program = "templates comp@{pivot:} <..$pivot> 'le' ! <> 'gt' ! end comp\n"
        + "1..6 -> comp@{pivot: 3} -> !OUT::write";
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
        + "templates comp@{discriminator:} $ -> discriminator -> # <=1> 'yes' ! <> 'no' ! end comp\n"
        + "1..6 -> comp@{discriminator: low} -> !OUT::write";
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
        + "templates comp@{discriminator:} $ -> $discriminator -> # <=1> 'yes' ! <> 'no' ! end comp\n"
        + "1..6 -> comp@{discriminator: low} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void functionOfFunction() throws Exception {
    String program = "templates low <..3> 1 ! <> 0 ! end low\n"
        + "templates comp@{discriminator:} $ -> discriminator -> # <=1> 'yes' ! <=0> 'no' ! <> $ ! end comp\n"
        + "templates meta@{f:} $ -> f@{discriminator: low} ! end meta\n"
        + "1..6 -> meta@{f: comp} -> !OUT::write";
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
        + "templates comp@{discriminator:} $ -> $discriminator -> # <=1> 'yes' ! <> 'no' ! end comp\n"
        + "templates meta@{f:} $ -> f@{discriminator: low} ! end meta\n"
        + "1..6 -> meta@{f: comp@{discriminator: low}} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void streamedParameter() throws Exception {
    String program = "templates comp@{pivot:} 4 -> # <..$pivot> 'le' ! <> 'gt' ! end comp\n"
        + "1..6 -> comp@{pivot: $} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("gtgtgtlelele", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mutateStateField() throws Exception {
    String program =
        "templates state\n@: { a: 0, b: 0};\n@.b: $;\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=0, b=1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mergeStateStructure() throws Exception {
    String program =
        "templates state\n@: { a: 0, b: 0};\n..|@: {b: $, c: 2};\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=0, b=1, c=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mergeStateField() throws Exception {
    String program =
        "templates state\n@: { a: []};\n..|@.a: 1..3;\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=[1, 2, 3]}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mergeStateArrayElementArray() throws Exception {
    String program =
        "templates state\n@: [[],[]];\n..|@(2): 1..3;\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[], [1, 2, 3]]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mergeStateArrayElementStructure() throws Exception {
    String program =
        "templates state\n@: [{a:0}, {a:1}];\n..|@(2): {b: $, c: 2};\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{a=0}, {a=1, b=1, c=2}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mutateStateArray() throws Exception {
    String program =
        "templates state\n@: [1..3];\n@(2): $;\n$@ !\nend state\n" + "0 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 0, 3]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mutateTwoDimensionalStateArray() throws Exception {
    String program =
        "templates state\n@: [[1..3],[4..6],[7..9]];\n@(2;3): $;\n$@ !\nend state\n" + "0 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[1, 2, 3], [4, 5, 0], [7, 8, 9]]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mutateStateArraySlice() throws Exception {
    String program =
        "templates state\n@: [1..5];\n@(2..4): $..$+2;\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 1, 2, 3, 5]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mutateStateArraySlice_tooFewValues() throws Exception {
    String program =
        "templates state\n@: [1..5];\n@(2..4): $..$+1;\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void mutateStateArraySlice_tooManyValues() throws Exception {
    String program =
        "templates state\n@: [1..5];\n@(2..4): $..$+3;\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void collectStateArray() throws Exception {
    String program =
        "templates state\n@: [];\n..|@: $..$+2;\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 2, 3]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void preserveItAfterCollectState() throws Exception {
    String program =
        "templates state\n@: [];\n..|@: $..$+2;\n$ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void preserveItAfterMutateState() throws Exception {
    String program =
        "templates state\n@: [0];\n@(1): $;\n$ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void immutableItArrayInMutableState() throws Exception {
    String program =
        "templates state\n@: $;\n@(1): 0;\n$ !\nend state\n" + "[1..3] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 2, 3]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void immutableItStructureInMutableState() throws Exception {
    String program =
        "templates state\n@: $;\n@.a: 0;\n$ !\nend state\n" + "{a:1} -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deeplyImmutableItArrayInMutableState() throws Exception {
    String program =
        "templates state\n@: $;\n@(1).a(2): 0;\n$ !\nend state\n" + "[{a:[1..3]}] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{a=[1, 2, 3]}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deeplyImmutableItStructureInMutableState() throws Exception {
    String program =
        "templates state\n@: $;\n@.a(1).b(2): 0;\n$ !\nend state\n" + "{a:[{b:[1..3]}]} -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=[{b=[1, 2, 3]}]}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deeplyImmutableItStructureInMutableStateField() throws Exception {
    String program =
        "templates state\n@: {a:{b:1}};\n@.a: $;\n@.a.b: 0;\n$ !\nend state\n" + "{b:2} -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{b=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deeplyImmutableItStructureInMutableStateArray() throws Exception {
    String program =
        "templates state\n@: [{b:1}];\n@(1): $;\n@(1).b: 0; $ !\nend state\n" + "{b:2} -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{b=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void immutableDefArrayFromMutableState() throws Exception {
    String program =
        "templates state\n@: $;\ndef var: $@;\n@(1): 0;\n$var !\nend state\n" + "[1..3] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 2, 3]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void immutableDefStructureFromMutableState() throws Exception {
    String program =
        "templates state\n@: $;\ndef var: $@;\n@.a: 0;\n$var !\nend state\n" + "{a:1} -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deeplyImmutableDefArrayFromMutableState() throws Exception {
    String program =
        "templates state\n@: $;\ndef var: $@;\n@(1).a(1): 0;\n$var !\nend state\n" + "[{a:[1..3]}] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{a=[1, 2, 3]}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deeplyImmutableDefStructureFromMutableState() throws Exception {
    String program =
        "templates state\n@: $;\ndef var: $@;\n@.a(1).b: 0;\n$var !\nend state\n" + "{a:[{b:1}]} -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=[{b=1}]}", output.toString(StandardCharsets.UTF_8));
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
  void deleteStateField() throws Exception {
    String program =
        "templates state\n@: { a: 0, b: $};\n^@.b !\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1{a=0}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deleteStateArrayElement() throws Exception {
    String program =
        "templates state\n@: $;\n^@(2) !\n$@ !\nend state\n" + "[4,5,6] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5[4, 6]", output.toString(StandardCharsets.UTF_8));
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
  void streamMergeStateArray() throws Exception {
    String program =
        "templates bar\n@: [5..7];\n1..3 -> ..|@: $;\n$@!\nend bar\n"
            + "3 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[5, 6, 7, 1, 2, 3]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMergeStateArray() throws Exception {
    String program =
        "templates bar\n@: [5..7];\n[1..3] -> ..|@: $...;\n$@!\nend bar\n"
            + "3 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[5, 6, 7, 1, 2, 3]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMergeStateSliceArrays() throws Exception {
    String program =
        "templates bar\n@: [[5],[6],[7]];\n[1..3] -> ..|@(1..3): $...;\n$@!\nend bar\n"
            + "3 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[5, 1], [6, 2], [7, 3]]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMergeStateSliceStructures() throws Exception {
    String program =
        "templates bar\n@: [{},{},{}];\n[{x:1},{y:2}] -> ..|@(2..3): $...;\n$@!\nend bar\n"
            + "3 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{}, {x=1}, {y=2}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMergeStateSliceValuesFails() throws Exception {
    String program =
        "templates bar\n@: [5..7];\n[1..3] -> ..|@(1..3): $...;\n$@!\nend bar\n"
            + "3 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void streamMergeStateSliceArraysFails() throws Exception {
    String program =
        "templates bar\n@: [[5],[6],[7]];\n1..3 -> ..|@(1..3): $;\n$@!\nend bar\n"
            + "3 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
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
}
