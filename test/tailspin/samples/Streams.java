package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import tailspin.interpreter.Tailspin;

public class Streams {
  @Test
  public void iterate() throws IOException {
    String program = "1..3 -> 'a $it ' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("a 1 a 2 a 3 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  public void iterateIncrement() throws IOException {
    String program = "1..6:2 -> 'a $it ' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("a 1 a 3 a 5 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  public void iterateBackwards() throws IOException {
    String program = "3..1:-1 -> 'a $it ' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("a 3 a 2 a 1 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  public void iterateZeroIncrementIllegal() {
    String program = "1..3:0 -> 'a $it ' -> stdout";
    try {
      Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));
      fail();
    } catch (Exception expected) {
    }
  }
}
