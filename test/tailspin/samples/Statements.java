package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Statements {
  @Test
  void helloWorld() throws Exception {
    String program = "'Hello World' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void newlineAfter() throws Exception {
    String program = "'Hello World' -> !OUT::write\n";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void extraWhitespaceAfter() throws Exception {
    String program = "'Hello World' -> !OUT::write ";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void newlineBefore() throws Exception {
    String program = "\n'Hello World' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void extraWhitespaceBefore() throws Exception {
    String program = " 'Hello World' -> !OUT::write ";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void multiLineStatement() throws Exception {
    String program = "'Hello World'\n  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void twoStatements() throws Exception {
    String program = "'Hello' -> !OUT::write\n" + "'World'  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("HelloWorld", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  @Disabled
  void twoStatementsWithoutNewlineError() {
    String program = "'Hello' -> !OUT::write   'World'  -> !OUT::write";
    try {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));
      fail();
    } catch (Exception expected) {
    }
  }

  @Test
  void definedSymbol() throws Exception {
    String program = "def world: 'World!';\n" + "'Hello '->!OUT::write\n" + "$world -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void cannotDefineIncludedSymbol() {
    String program = "def my/world: 'World!';\n" + "'Hello '->!OUT::write\n" + "$world -> !OUT::write";
    assertThrows(Exception.class, () -> Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8))));
  }

  @Test
  void chain() throws Exception {
    String program = "'World!' -> 'Hello $;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void definedTemplate() throws Exception {
    String program =
        "templates greet\n<=2> 'Goodbye '! <> 'Hello '!\nend greet\n" + "1..3 -> greet -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello Goodbye Hello ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mismatchedEnd() {
    String program = "templates someName\n<2> 'Goodbye ' <> 'Hello '\nend otherName";
    try {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    } catch (Exception expected) {
    }
  }

  @Test
  void definedSymbolFromValueChain() throws Exception {
    String program = "def helloWorld: 'World!' -> 'Hello $;' ;\n $helloWorld -> !OUT::write\n";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void definedSymbolFromValueChainWithEmptyResult() throws Exception {
    String program = "def helloWorld: 'World!' -> \\(<=2> $ !\\) ; $helloWorld -> !VOID";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(AssertionError.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void definedSymbolFromValueChainWithTooManyResults() throws Exception {
    String program = "def helloWorld: 'World!' -> \\(<> $ ! $ !\\) ; $helloWorld -> !VOID";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(AssertionError.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void commentsIgnored() throws Exception {
    String program = "1 -> !OUT::write\n // 2 -> !OUT::write\n 3 -> !OUT::write // 4 -> !OUT::write\n";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("13", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void symbolsMayNotBeRedefined() throws Exception {
    String program = "def one: 1;\n def one: 1;\n";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void voidSink() throws Exception {
    String program = "'Hello World' -> !VOID";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void commandLineArgs() throws Exception {
    String program = "$ARGS -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of("Hello", "world"));

    assertEquals("[Hello, world]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void commandLineArgsGetValue() throws Exception {
    String program = "$ARGS(1) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of("Hello", "world"));

    assertEquals("Hello", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void systemNanoCount() throws Exception {
    String program = "def start: $SYS::nanoCount;\n"
        + "[1..100 -> $SYS::nanoCount - $start] -> $(last) -> \\(<0~..> 1 !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void systemRandomInt() throws Exception {
    String program = "def vals: [ 1..100 -> 10 -> SYS::randomInt];\n"
        + "$vals -> \\(<~[<10..>]> 1!\\) -> !OUT::write\n"
        + "$vals -> \\(<~[<..-1>]> -1!\\) -> !OUT::write\n"
        + "0..9 -> \\(<?($vals <[<=$>]>)> $!\\) -> !OUT::write\n"
        // The below might fail very rarely
        + "$vals -> \\[i]($i mod 10 - $ !\\) -> \\(@: $(1); $(2..-1)... -> @: $@ + $; $@!\\) -> \\(<-50..50> 50!\\) ->!OUT::write\n"
        + "$vals -> \\[i]($i mod 10 - $ !\\) -> \\(<[<~=0>]> 0!\\) ->!OUT::write\n";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1-10123456789500", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dynamicDereferenceInCorrectScope() throws Exception {
    String program =
        "def foo: 2;\n [4,5,6] -> $($foo) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void noIt() throws Exception {
    String program = "$ -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Throwable.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void noItAfterValueChain() throws Exception {
    String program = "1 -> [$] -> !OUT::write\n$ -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Throwable.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void nonArithmeticParenthesizedValueProductionIsCompileError() {
    String program = "(1 -> [$]) -> !OUT::write\n";
    assertThrows(Throwable.class, () ->
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8))));
  }

  @Test
  void parenthesizedPartOfValueProductionIsCompileError() {
    String program = "2 -> (1 -> [$]) -> !OUT::write\n";
    assertThrows(Throwable.class, () ->
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8))));
  }
}
