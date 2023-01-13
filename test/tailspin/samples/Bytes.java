package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    assertEquals("06a3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayTemplatesWithXIsNotByteConstant() throws IOException {
    String program = "[0] -> \\[x]($x!\\)... -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayOfByteConstant() throws IOException {
    String program = "[[x 06a3 x], [x 8105 x]] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[06a3, 8105]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structOfByteConstant() throws IOException {
    String program = "{foo: [x 06a3 x], bar: [x 8105 x]} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{bar: 8105, foo: 06a3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void keyedByteValue() throws IOException {
    String program = "(foo: [x 06a3 x]) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("foo: 06a3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void byteConstantMustHaveEvenNumberOfDigits() {
    String program = "[x 6a3 x] -> !OUT::write";
    assertThrows(Exception.class,
        () -> Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8))));
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

    assertEquals("ff06a300", output.toString(StandardCharsets.UTF_8));
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

    assertEquals("262626", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void emptyStreamIsNothing() throws IOException {
    String program = "[[x (1..-1 -> [x 11 x]) x]] -> \\(<=[]> 'nothing' ! <> $!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("nothing", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void matchEqualLiteral() throws IOException {
    String program = """
        [x 06a3 x] -> \\(
          <=[x 06a3 x]> 'yes' !
          otherwise 'no' !\\) -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void matchEqualValue() throws IOException {
    String program = """
        def a: [x 06a3 x];
        [x 06a3 x] -> \\(
          <=$a> 'yes' !
          otherwise 'no' !\\) -> !OUT::write""";
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

    assertEquals("0180", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void andExtendsSign() throws IOException {
    String program = "([x 80 x] and [x 01ff x])-> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("0180", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void orExtendsSign() throws IOException {
    String program = "([x 01fe x] or [x 80 x])-> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("fffe", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void xorExtendsSign() throws IOException {
    String program = "([x 01fe x] xor [x 80 x])-> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("fe7e", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void inverse() throws IOException {
    String program = "[x 0125 x] -> $::inverse -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("feda", output.toString(StandardCharsets.UTF_8));
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
  void lengthIsNumber() throws IOException {
    String program = "[x 0125fe x] -> $::length + 4 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("7", output.toString(StandardCharsets.UTF_8));
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

  @Test
  void index() throws IOException {
    String program = "[x 0125fe x] -> $(2) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("25", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void slice() throws IOException {
    String program = "[x 0125fe x] -> $(first..2) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("0125", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void permute() throws IOException {
    String program = "[x 0125fe x] -> $([3, 2]) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("fe25", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void indexTooLargeThrows() throws IOException {
    String program = "[x 0125fe x] -> $(4) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void indexZeroGivesSignExtension() throws IOException {
    String program = "[x ([x 01 x] -> $(0)) ([x 80 x] -> $(0)) x] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("00ff", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void fixSize() throws IOException {
    String program = "[x 0125fe x] -> $(last-3..last) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("000125fe", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void shiftLeftFillZero() throws IOException {
    String program = "[x 0125fe x] -> $::shift&{left: 2, fill: [x 00 x]} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("0497f8", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void shiftLeftFillOnes() throws IOException {
    String program = "[x 0125fe x] -> $::shift&{left: 2, fill: [x ff x]} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("0497fb", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void shiftFarLeftFillZero() throws IOException {
    String program = "[x 0125fe x] -> $::shift&{left: 10, fill: [x 00 x]} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("97f800", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void shiftFarLeftFillOnes() throws IOException {
    String program = "[x 0125fe x] -> $::shift&{left: 10, fill: [x ff x]} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("97fbff", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rotateFarLeft() throws IOException {
    String program = "[x 0125fe x] -> $::shift&{left: 10, fill: $} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("97f804", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rotateVeryFarLeft() throws IOException {
    String program = "[x 0125fe x] -> $::shift&{left: 34, fill: $} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("97f804", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void shiftRightFillZero() throws IOException {
    String program = "[x 0125fe x] -> $::shift&{left: -2, fill: [x 00 x]} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("00497f", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void shiftRightFillOnes() throws IOException {
    String program = "[x 0125fe x] -> $::shift&{left: -2, fill: [x ff x]} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("c0497f", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void shiftFarRightFillZero() throws IOException {
    String program = "[x 0125fe x] -> $::shift&{left: -10, fill: [x 00 x]} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("000049", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void shiftFarRightFillOnes() throws IOException {
    String program = "[x 0125fe x] -> $::shift&{left: -10, fill: [x ff x]} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ffc049", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rotateFarRight() throws IOException {
    String program = "[x 0125fe x] -> $::shift&{left: -10, fill: $} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("7f8049", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rotateVeryFarRight() throws IOException {
    String program = "[x 0125fe x] -> $::shift&{left: -34, fill: $} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("7f8049", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void utf8String() throws IOException {
    String program = "[x 48616c6cc3a5 x] -> $::asUtf8String -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hallå", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void integer() throws IOException {
    String program = "[x 0081 x] -> $::asInteger -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("129", output.toString(StandardCharsets.UTF_8));
  }
}
