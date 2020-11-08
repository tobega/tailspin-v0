package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

public class Bytes {

  @Test
  void byteConstant() throws IOException {
    String program = "[x 06a3 x] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[x 06a3 x]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void concatenateBytes() throws IOException {
    String program = "def a: [x 06a3 x];\n"
        + "[x ff ($a) 00 x] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[x ff06a300 x]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void concatenateBytesStream() throws IOException {
    String program = "def a: [x 06a3 x];\n"
        + "[x (1..3 -> [x 26 x]) x] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[x 262626 x]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void matchEqualLiteral() throws IOException {
    String program = "[x 06a3 x] -> \\(\n"
        + "  <=[x 06a3 x]> 'yes' !\n"
        + "  otherwise 'no' !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void matchEqualValue() throws IOException {
    String program = "def a: [x 06a3 x];\n"
        + "[x 06a3 x] -> \\(\n"
        + "  <=$a> 'yes' !\n"
        + "  otherwise 'no' !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void and() throws IOException {
    String program = "([x ff80 x] and [x 01ff x]) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[x 0180 x]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void andExtendsSign() throws IOException {
    String program = "([x 80 x] and [x 01ff x])-> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[x 0180 x]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void orExtendsSign() throws IOException {
    String program = "([x 01fe x] or [x 80 x])-> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[x fffe x]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void xorExtendsSign() throws IOException {
    String program = "([x 01fe x] xor [x 80 x])-> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[x fe7e x]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void invert() throws IOException {
    String program = "[x 0125 x] -> $::invert -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[x feda x]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void length() throws IOException {
    String program = "[x 0125fe x] -> $::length -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void hashCodeBasedOnContents() throws IOException {
    String program = "def code: [x 0125fe x] -> $::hashCode;\n"
        + "[x 0125fe x] -> $::hashCode -> \\(<=$code> 'yes'! <> 'no' !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }
}
