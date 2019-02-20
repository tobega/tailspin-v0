package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Structures {
  @Test
  void literal() throws IOException {
    String program = "{ a: 0, b: 1 } -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    // TODO: Make the object default printing be valid json
    assertEquals("{a=0, b=1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void fieldDerefence() throws IOException {
    String program = "{ a: 0, b: 1 } -> ($it.a ! $it.b !) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("01", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void literalTransform() throws IOException {
    String program = "1 -> { a: $it - 1, b: $it } -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("{a=0, b=1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void fieldDerefenceTransform() throws IOException {
    String program = "{ a: 5, b: 1 } -> $it.a -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void fieldArrayDerefenceTransform() throws IOException {
    String program = "{ a: [1,5,8] } -> $it.a(2) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }
}
