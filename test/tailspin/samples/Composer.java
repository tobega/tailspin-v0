package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Composer {
  @Test
  void composeInt() throws IOException {
    String program = "composer int\n"
        + "<INT>\n"
        + "end int\n"
        + "'23' -> int -> $it + 12 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("35", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeRegex() throws IOException {
    String program = "composer all\n"
        + "<'.*'>\n"
        + "end all\n"
        + "'Any text' -> all -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("Any text", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeSequence() throws IOException {
    String program = "composer ab\n"
        + "<'a'> <'b'>\n"
        + "end ab\n"
        + "'ab' -> ab -> '$it;+' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("a+b+", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void ignoreStuff() throws IOException {
    String program = "composer int\n"
        + "(<'Value: '>) <INT>\n"
        + "end int\n"
        + "'Value: 23' -> int -> $it + 12 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("35", output.toString(StandardCharsets.UTF_8));
  }
}
