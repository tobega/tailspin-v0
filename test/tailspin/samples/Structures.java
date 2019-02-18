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
    String program = "{ a: 0, b: 1 } -> ($it.a $it.b) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    // TODO: Make the object default printing be valid json
    assertEquals("01", output.toString(StandardCharsets.UTF_8));
  }
}
