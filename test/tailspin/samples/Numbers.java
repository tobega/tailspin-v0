package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Numbers {
  @Test
  void printLiteral() throws IOException {
    String program = "1337 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("1337", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void printNegativeLiteral() throws IOException {
    String program = "-1337 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("-1337", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void definition() throws IOException {
    String program = "def leet: 1337\n" + "$leet -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("1337", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void add() throws IOException {
    String program = "1300 + 37 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("1337", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void subtract() throws IOException {
    String program = "1400 - 63 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("1337", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void multiply() throws IOException {
    String program = "3 * 5 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("15", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void divide() throws IOException {
    String program = "15 / 3 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mathematicalModulo() throws IOException {
    String program = "9 mod 7 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("2", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mathematicalModuloNegativeDividend() throws IOException {
    String program = "-9 mod 7 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mathematicalModuloNegativeDivisor() throws IOException {
    String program = "9 mod -7 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("2", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mathematicalModuloNegativeDivisorAndDividend() throws IOException {
    String program = "-9 mod -7 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void precedence() throws IOException {
    String program = "2 * 3 + 16 / 4 - 50 mod 24 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("8", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dereference() throws IOException {
    String program = "def x: 5\n 3 * $x -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("15", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dereferenceUnaryMinus() throws IOException {
    String program = "def x: 5\n -$x -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("-5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dereferenceField() throws IOException {
    String program = "def a: {x:5}\n $a.x + 2 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("7", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arithmeticTransform() throws IOException {
    String program = "5 -> $it + 2 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("7", output.toString(StandardCharsets.UTF_8));
  }
}
