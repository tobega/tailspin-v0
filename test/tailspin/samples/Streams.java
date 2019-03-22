package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Streams {
  @Test
  void iterate() throws IOException {
    String program = "1..3 -> 'a $it; ' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("a 1 a 2 a 3 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateIncrement() throws IOException {
    String program = "1..6:2 -> 'a $it; ' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("a 1 a 3 a 5 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateBackwards() throws IOException {
    String program = "3..1:-1 -> 'a $it; ' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("a 3 a 2 a 1 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateZeroIncrementIllegal() {
    String program = "1..3:0 -> 'a $it; ' -> stdout";
    try {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));
      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output);
      fail();
    } catch (Exception expected) {
      assertEquals("Cannot produce range with zero increment at 1:5", expected.getMessage());
    }
  }

  @Test
  void iterateTransformLimit() throws IOException {
    String program = "5 -> 1..$it -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("12345", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateTransformIncrement() throws IOException {
    String program = "5 -> 10..20:$it -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("101520", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateExclusiveStart() throws IOException {
    String program = "1~..3 -> 'a $it; ' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("a 2 a 3 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateExclusiveEnd() throws IOException {
    String program = "1..~3 -> 'a $it; ' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("a 1 a 2 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateExclusiveBoth() throws IOException {
    String program = "1~..~3 -> 'a $it; ' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("a 2 ", output.toString(StandardCharsets.UTF_8));
  }
}
