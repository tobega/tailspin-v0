package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Matchers {
  @Test
  void rangeMatch() throws Exception {
    String program = "1..6 -> (<..2> 'L' <3..4> 'M' <5..> 'H') -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("LLMMHH", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void emptyStringMatch() throws Exception {
    String program = "'' -> (<'foo'> 'no way' <''> 'yes' <> 'no') -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void regexpMatch() throws Exception {
    String program = "'Hello' -> (<'Hell'> 'no!' <'[Hh]el.*'> 'yes' <> 'no') -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }
}
