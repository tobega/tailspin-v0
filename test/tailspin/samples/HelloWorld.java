package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import tailspin.interpreter.Tailspin;

public class HelloWorld {

  @Test
  public void testHelloWorld() throws Exception {
    String program = "'Hello World' -> stdout";
    Tailspin runner = Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  public void testHelloWorld_multiLineStatement() throws Exception {
    String program = "'Hello World'\n  -> stdout";
    Tailspin runner = Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  public void testWhatsUp() throws Exception {
    String program = "'" + "What''s up" + "' -> stdout";
    Tailspin runner = Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("What's up", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  public void testWhatsUp_moreQuotes() throws Exception {
    String program = "'" + "What''''s up" + "' -> stdout";
    Tailspin runner = Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("What''s up", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  public void testHelloWorld_multilineString() throws Exception {
    String program = "'Hello\nWorld'  -> stdout";
    Tailspin runner = Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello\nWorld", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  public void testHelloWorld_twoStatements() throws Exception {
    String program = "'Hello' -> stdout\n"
        + "'World'  -> stdout";
    Tailspin runner = Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("HelloWorld", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  public void testHelloWorld_twoStatementsWithoutNewline() throws Exception {
    String program = "'Hello' -> stdout   'World'  -> stdout";
    try {
      Tailspin runner = Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));
      fail();
    } catch (Exception expected) {}
  }

  @Test
  public void testHelloWorld_variable() throws Exception {
    String program = "def world: 'World!'\n"
        + "'Hello '->stdout\n"
        + "$world -> stdout";
    Tailspin runner = Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }
}
