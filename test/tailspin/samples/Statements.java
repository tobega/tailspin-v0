package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Statements {

  @Test
  void helloWorld() throws Exception {
    String program = "'Hello World' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void newlineAfter() throws Exception {
    String program = "'Hello World' -> stdout\n";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void extraWhitespaceAfter() throws Exception {
    String program = "'Hello World' -> stdout ";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void newlineBefore() throws Exception {
    String program = "\n'Hello World' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void extraWhitespaceBefore() throws Exception {
    String program = " 'Hello World' -> stdout ";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void multiLineStatement() throws Exception {
    String program = "'Hello World'\n  -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void twoStatements() throws Exception {
    String program = "'Hello' -> stdout\n" + "'World'  -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("HelloWorld", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  @Disabled
  void twoStatementsWithoutNewlineError() {
    String program = "'Hello' -> stdout   'World'  -> stdout";
    try {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));
      fail();
    } catch (Exception expected) {
    }
  }

  @Test
  void definedSymbol() throws Exception {
    String program = "def world: 'World!'\n" + "'Hello '->stdout\n" + "$world -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void chain() throws Exception {
    String program = "'World!' -> 'Hello $it' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void definedTemplate() throws Exception {
    String program = "templates greet\n<2> 'Goodbye ' <> 'Hello '\nend greet\n"
        + "1..3 -> greet -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

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
      runner.run(input, output);
    } catch (Exception expected) {}
  }
}
