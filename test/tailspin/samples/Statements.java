package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

public class Statements {

  @Test
  public void helloWorld() throws Exception {
    String program = "'Hello World' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  public void newlineAfter() throws Exception {
    String program = "'Hello World' -> stdout\n";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  public void extraWhitespaceAfter() throws Exception {
    String program = "'Hello World' -> stdout ";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  public void newlineBefore() throws Exception {
    String program = "\n'Hello World' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  public void extraWhitespaceBefore() throws Exception {
    String program = " 'Hello World' -> stdout ";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  public void multiLineStatement() throws Exception {
    String program = "'Hello World'\n  -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  public void twoStatements() throws Exception {
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
  public void twoStatementsWithoutNewlineError() {
    String program = "'Hello' -> stdout   'World'  -> stdout";
    try {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));
      fail();
    } catch (Exception expected) {
    }
  }

  @Test
  public void definedSymbol() throws Exception {
    String program = "def world: 'World!'\n" + "'Hello '->stdout\n" + "$world -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  public void chain() throws Exception {
    String program = "'World!' -> 'Hello $it' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }
}
