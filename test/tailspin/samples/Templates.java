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
    String program = "1..3 -> (<2> 'Goodbye '! <> 'Hello '!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello Goodbye Hello ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void recursiveMatch() throws Exception {
    String program =
        "templates spin\n<5> $it + 2 ! <> $it + 1 -> #\nend spin\n" + "1 -> spin -> stdout";
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
        "templates spin\n<5> $it + 2 ! <> $it + 1 -> #\n $it -> stdout\nend spin\n"
            + "1 -> spin -> stdout";
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
        "templates spin\n<5> $it + 2 ! <> $it -> stdout\n $it + 1 -> #\nend spin\n"
            + "1 -> spin -> stdout";
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
        "templates spin\n<5> $it + 2 ! <> $it + 1 -> #\n $it !\nend spin\n" + "1 -> spin -> stdout";
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
    String program = "templates simple\n$it + 1 !\n $it !\nend simple\n" + "1 -> simple -> stdout";
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
        "templates simple\n$it + 1 -> #\n <> $it + 1 !\nend simple\n" + "1 -> simple -> stdout";
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
        "templates simple\n<1>def a: 'aA'\n 2 -> #\n<2> $a !\nend simple\n" + "1 -> simple -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void templateCallsTemplatesNoNestedScope() throws Exception {
    String program =
        "templates simple\n1 -> #\n<1>def a: 'aA'\n 2 -> #\n<2> $a !\nend simple\n" + "1 -> simple -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void templateCallsTemplatesTwiceNoNestedScope() throws Exception {
    String program =
        "templates simple\n1 -> #\n<1>def a: 'aA'\n 2 -> #\n<2> 3 -> # <3> $a !\nend simple\n" + "1 -> simple -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void arrayTemplates() throws Exception {
    String program = "[2..4] -> [i]($i * $it !) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[2, 6, 12]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayTemplates2D() throws Exception {
    String program = "[[2..4], [3..5]] -> [i,j](($i * $it) + $j !) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[3, 5, 7], [7, 10, 13]]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void multipleTransforms() throws Exception {
    String program = "1 -> (<> 2!) -> (<> 3!) -> stdout";
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
        "templates state\n$it + 1 -> @\n$it -> #\n<> $@ !\nend state\n" + "1 -> state -> stdout";
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
        "templates state\n$it + 1 -> @state\n$it -> #\n<> $@state !\nend state\n" + "1 -> state -> stdout";
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
            + "$it + 1 -> @state\n"
            + "end nested\n"
            + "$it -> nested !\n"
            + "$@ !\nend state\n" + "1 -> state -> stdout";
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
            "templates state\n1..3 -> ($it + 1 -> @state) !\n$@ !\nend state\n" + "1 -> state -> stdout";
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
    String program = "1..3 -> (<> 'Goodbye '! 'Hello '!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Goodbye Hello Goodbye Hello Goodbye Hello ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void correctItOnNextValueChain() throws Exception {
    String program = "1..3 -> ($it + 1 -> stdout $it !) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("234123", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void streamToMatchers() throws Exception {
    String program = "1 -> (1..3 -> # <2> $it!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("2", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void streamToMatcherBlock() throws Exception {
    String program = "1 -> (1..3 -> # <> $it! $it!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("112233", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void voidMatcherBlock() throws Exception {
    String program = "1..3 -> (<2> void <> 'Hello '!) -> stdout";
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
        + "1..6 -> comp@{pivot: 3} -> stdout";
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
        + "templates comp@{discriminator:} $it -> $discriminator -> # <1> 'yes' ! <> 'no' ! end comp\n"
        + "1..6 -> comp@{discriminator: low} -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yesyesyesnonono", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void functionOfFunction() throws Exception {
    String program = "templates low <..3> 1 ! <> 0 ! end low\n"
        + "templates comp@{discriminator:} $it -> $discriminator -> # <1> 'yes' ! <> 'no' ! end comp\n"
        + "templates meta@{f:} $it -> f@{discriminator: low} ! end meta\n"
        + "1..6 -> meta@{f: comp} -> stdout";
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
        + "templates comp@{discriminator:} $it -> $discriminator -> # <1> 'yes' ! <> 'no' ! end comp\n"
        + "templates meta@{f:} $it -> f@{discriminator: low} ! end meta\n"
        + "1..6 -> meta@{f: comp@{discriminator: low}} -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void streamedParameter() throws Exception {
    String program = "templates comp@{pivot:} 4 -> # <..$pivot> 'le' ! <> 'gt' ! end comp\n"
        + "1..6 -> comp@{pivot: $it} -> stdout";
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
        "templates state\n{ a: 0, b: 0} -> @\n$it -> @.b\n$@ !\nend state\n" + "1 -> state -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=0, b=1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void restructureMutateStateStructure() throws Exception {
    String program =
        "templates state\n{ a: 0, b: 0} -> @\n{b: $it, c: 2} -> ...@\n$@ !\nend state\n" + "1 -> state -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=0, b=1, c=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mutateStateArray() throws Exception {
    String program =
        "templates state\n[1..3] -> @\n$it -> @(2)\n$@ !\nend state\n" + "0 -> state -> stdout";
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
        "templates state\n[[1..3],[4..6],[7..9]] -> @\n$it -> @(2;3)\n$@ !\nend state\n" + "0 -> state -> stdout";
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
        "templates state\n[1..5] -> @\n$it..$it+2 -> @(2..4)\n$@ !\nend state\n" + "1 -> state -> stdout";
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
        "templates state\n[1..5] -> @\n$it..$it+1 -> @(2..4)\n$@ !\nend state\n" + "1 -> state -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void mutateStateArraySlice_tooManyValues() throws Exception {
    String program =
        "templates state\n[1..5] -> @\n$it..$it+3 -> @(2..4)\n$@ !\nend state\n" + "1 -> state -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void collectStateArray() throws Exception {
    String program =
        "templates state\n[] -> @\n$it..$it+2 -> ...@\n$@ !\nend state\n" + "1 -> state -> stdout";
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
        "templates state\n[] -> @\n$it..$it+2 -> ...@\n$it !\nend state\n" + "1 -> state -> stdout";
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
        "templates state\n[0] -> @\n$it -> @(1)\n$it !\nend state\n" + "1 -> state -> stdout";
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
        "templates state\n$it -> @\n0 -> @(1)\n$it !\nend state\n" + "[1..3] -> state -> stdout";
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
        "templates state\n$it -> @\n0 -> @.a\n$it !\nend state\n" + "{a:1} -> state -> stdout";
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
        "templates state\n$it -> @\n0 -> @(1).a(2)\n$it !\nend state\n" + "[{a:[1..3]}] -> state -> stdout";
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
        "templates state\n$it -> @\n0 -> @.a(1).b(2)\n$it !\nend state\n" + "{a:[{b:[1..3]}]} -> state -> stdout";
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
        "templates state\n{a:{b:1}} -> @\n$it -> @.a\n0 -> @.a.b\n$it !\nend state\n" + "{b:2} -> state -> stdout";
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
        "templates state\n[{b:1}] -> @\n$it -> @(1)\n0 -> @(1).b\n$it !\nend state\n" + "{b:2} -> state -> stdout";
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
        "templates state\n$it -> @\ndef var: $@\n0 -> @(1)\n$var !\nend state\n" + "[1..3] -> state -> stdout";
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
        "templates state\n$it -> @\ndef var: $@\n0 -> @.a\n$var !\nend state\n" + "{a:1} -> state -> stdout";
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
        "templates state\n$it -> @\ndef var: $@\n0 -> @(1).a(1)\n$var !\nend state\n" + "[{a:[1..3]}] -> state -> stdout";
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
        "templates state\n$it -> @\ndef var: $@\n0 -> @.a(1).b\n$var !\nend state\n" + "{a:[{b:1}]} -> state -> stdout";
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
        "templates state\n1 -> @\n$it -> (<5..> $it !) -> @\n$@ !\nend state\n" + "3 -> state -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void templatesStateAssignedMultiValuedStream() throws Exception {
    String program =
        "templates state\n1 -> @\n1..$it -> @\n$@ !\nend state\n" + "3 -> state -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }
}
