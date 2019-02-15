package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Strings {

  @Test
  void apostrophe() throws Exception {
    String program = "'" + "What''s up" + "' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("What's up", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void moreApostrophes() throws Exception {
    String program = "'" + "What''''s up" + "' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("What''s up", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void multilineString() throws Exception {
    String program = "'Hello\nWorld'  -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello\nWorld", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateWholeString() throws Exception {
    String program = "def helloWorld: 'Hello World!'\n" + "'$helloWorld' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolatePartialString() throws Exception {
    String program = "def world: 'World!'\n" + "'Hello $world' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolatePartialStringFirst() throws Exception {
    String program = "def hello: 'Hello'\n" + "'$hello World!' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateNoSuchVariable() throws Exception {
    String program = "def hello: 'Hello '\n" + "'$helloWorld!' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    // TODO: this should give a better error message about symbol not found, perhaps already in
    // parse stage
    try {
      runner.run(input, output);
      fail();
    } catch (Exception expected) {
    }
  }

  @Test
  void interpolateRunningIntoText() throws Exception {
    String program = "def hello: 'Hello '\n" + "'$hello;World!' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dollar() throws Exception {
    String program = "'" + "$$hello is a dereferencing" + "' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("$hello is a dereferencing", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void moreDollars() throws Exception {
    String program = "'" + "$$$$$$signs" + "' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("$$$signs", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void semiColons() throws Exception {
    String program = "def two: '2'\n" + "'one;$two;;three;;' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("one;2;three;;", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateExpression() throws Exception {
    String program = "1 -> '$($it - 1), $it, $(2)' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("0, 1, 2", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateTemplates() throws Exception {
    String program = "templates foo <1> 'one' end foo\n"
        + "1 -> '$foo $it $foo' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("one 1 one", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateTemplatesWithNoMatch() throws Exception {
    String program = "templates foo <2> 'two' end foo\n"
        + "1 -> '$foo $it $foo' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals(" 1 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateTemplatesWithNoResult() throws Exception {
    String program = "templates foo <1> 'one' -> stdout end foo\n"
        + "1 -> '$foo $it $foo' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("oneone 1 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateTemplatesChain() throws Exception {
    String program = "3 -> '$($it - 1 -> ($it - 2))' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("0", output.toString(StandardCharsets.UTF_8));
  }
}
