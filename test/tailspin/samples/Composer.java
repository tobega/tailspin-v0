package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

  @Test
  void buildArray() throws IOException {
    String program = "composer intArray\n"
        + "[ <INT> (<','>) <INT> ]\n"
        + "end intArray\n"
        + "'1,2' -> intArray -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("[1, 2]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void failSkipped() throws IOException {
    String program = "composer int\n"
        + "(<'Value: '>) <INT>\n"
        + "end int\n"
        + "'23' -> int -> $it + 12 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output));
  }

  @Test
  void failInt() throws IOException {
    String program = "composer int\n"
        + "(<'Value: '>) <INT>\n"
        + "end int\n"
        + "'Value: ' -> int -> $it + 12 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output));
  }

  @Test
  void failExtra() throws IOException {
    String program = "composer int\n"
        + "<INT>\n"
        + "end int\n"
        + "'23 ' -> int -> $it + 12 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output));
  }

  @Test
  void composeWhitespace() throws IOException {
    String program = "composer int\n"
        + "<INT> (<WS>) <INT>\n"
        + "end int\n"
        + "'3 8' -> int -> $it + 12 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("1520", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void multipleWhitespace() throws IOException {
    String program = "composer int\n"
        + "<INT> (<WS>) <INT>\n"
        + "end int\n"
        + "'3 \r\n\t 8' -> int -> $it + 12 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("1520", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void optionalNamed() throws IOException {
    String program = "composer int\n"
        + "(<WS>?) <INT>\n"
        + "end int\n"
        + "'3' -> int -> $it + 12 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("15", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void optionalRegex() throws IOException {
    String program = "composer int\n"
        + "(<'Value: '>?) <INT>\n"
        + "end int\n"
        + "'3' -> int -> $it + 12 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("15", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void inverseWhitespace() throws IOException {
    String program = "composer word\n"
        + "<~WS> (<WS>) <~WS>\n"
        + "end word\n"
        + "'Hello World!' -> word -> ':$it;:' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals(":Hello::World!:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void inverseRegex() throws IOException {
    String program = "composer parts\n"
        + "<~'def'> <~'z'>\n"
        + "end parts\n"
        + "'abcdefg' -> parts -> ':$it;:' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals(":abc::defg:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void subrule() throws IOException {
    String program = "composer words\n"
        + "<word> <word>\n"
        + "word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'Hello World!' -> words -> ':$it;:' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals(":Hello::World!:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void atLeastOne() throws IOException {
    String program = "composer words\n"
        + "<word>+\n"
        + "word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'Hello World!' -> words -> ':$it;:' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals(":Hello::World!:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void atLeastOneThrowsOnNone() throws IOException {
    String program = "composer words\n"
        + "<word>+\n"
        + "word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'' -> words -> ':$it;:' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output));
  }

  @Test
  void any() throws IOException {
    String program = "composer words\n"
        + "<word>*\n"
        + "word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'Hello World!' -> words -> ':$it;:' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals(":Hello::World!:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void anyNoneOk() throws IOException {
    String program = "composer words\n"
        + "<word>*\n"
        + "word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'' -> words -> ':$it;:' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("::", output.toString(StandardCharsets.UTF_8));
  }
}