package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Streams {
  @Test
  void iterate() throws IOException {
    String program = "1..3 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a 1 a 2 a 3 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateSingleton() throws IOException {
    String program = "1..1 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a 1 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateEmpty() throws IOException {
    String program = "3..1 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateEmptyExclusiveStart() throws IOException {
    String program = "2~..0 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateEmptyExclusiveStartEdgeCase() throws IOException {
    String program = "1~..0 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateEmptyExclusiveEnd() throws IOException {
    String program = "2..~0 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateEmptyExclusiveEndEdgeCase() throws IOException {
    String program = "1..~0 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateIncrement() throws IOException {
    String program = "1..6:2 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a 1 a 3 a 5 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateBackwards() throws IOException {
    String program = "3..1:-1 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a 3 a 2 a 1 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateSingletonBackwards() throws IOException {
    String program = "1..1:-1 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a 1 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateBackwardsEmpty() throws IOException {
    String program = "1..3:-1 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateBackwardsEmptyExclusiveStart() throws IOException {
    String program = "1..~3:-1 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateBackwardsEmptyExclusiveStartEdgeCase() throws IOException {
    String program = "1..~2:-1 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateBackwardsEmptyExclusiveEnd() throws IOException {
    String program = "1..~3:-1 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateBackwardsEmptyExclusiveEndEdgeCase() throws IOException {
    String program = "1..~2:-1 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateZeroIncrementIllegal() {
    String program = "1..3:0 -> 'a $; ' -> !OUT::write";
    try {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));
      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
      fail();
    } catch (Exception expected) {
      assertEquals("Cannot produce range with zero increment", expected.getMessage());
    }
  }

  @Test
  void iterateTransformLimit() throws IOException {
    String program = "5 -> 1..$ -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("12345", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateTransformIncrement() throws IOException {
    String program = "5 -> 10..20:$ -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("101520", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateExclusiveStart() throws IOException {
    String program = "1~..3 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a 2 a 3 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateExclusiveEnd() throws IOException {
    String program = "1..~3 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a 1 a 2 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateIncrementExclusiveStart() throws IOException {
    String program = "1~..3:2 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a 3 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateIncrementExclusiveEnd() throws IOException {
    String program = "1..~3:2 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a 1 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateBackwardExclusiveStart() throws IOException {
    String program = "3~..1:-1 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a 2 a 1 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateBackwardExclusiveEnd() throws IOException {
    String program = "3..~1:-1 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a 3 a 2 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateExclusiveBoth() throws IOException {
    String program = "1~..~3 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a 2 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateNegativeBounds() throws IOException {
    String program = "-3..-1 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a -3 a -2 a -1 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateNegativeStartBound() throws IOException {
    String program = "-1..1 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a -1 a 0 a 1 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void iterateNegativeEndBound() throws IOException {
    String program = "1..-1:-1 -> 'a $; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a 1 a 0 a -1 ", output.toString(StandardCharsets.UTF_8));
  }
}
