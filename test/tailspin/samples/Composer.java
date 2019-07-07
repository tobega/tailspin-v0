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
    runner.run(input, output, List.of());

    assertEquals("35", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeIntShouldWorkForZero() throws IOException {
    String program = "composer int\n"
        + "<INT>\n"
        + "end int\n"
        + "'0' -> int -> $it + 12 -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("12", output.toString(StandardCharsets.UTF_8));
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
    runner.run(input, output, List.of());

    assertEquals("Any text", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateComposeRegex() throws IOException {
    String program = "def any: '.*'\n"
        + "composer all\n"
        + "<'$any;'>\n"
        + "end all\n"
        + "'Any text' -> all -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

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
    runner.run(input, output, List.of());

    assertEquals("a+b+", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeMultilineSequence() throws IOException {
    String program = "composer words\n"
        + "<word>*"
        + "word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'one two\n\nthree\nfour five six' -> words -> '$it; ' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("one two three four five six ", output.toString(StandardCharsets.UTF_8));
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
    runner.run(input, output, List.of());

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
    runner.run(input, output, List.of());

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
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
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
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
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
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
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
    runner.run(input, output, List.of());

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
    runner.run(input, output, List.of());

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
    runner.run(input, output, List.of());

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
    runner.run(input, output, List.of());

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
    runner.run(input, output, List.of());

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
    runner.run(input, output, List.of());

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
    runner.run(input, output, List.of());

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
    runner.run(input, output, List.of());

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
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
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
    runner.run(input, output, List.of());

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
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildStructure() throws IOException {
    String program = "composer coords\n"
        + "{ x: <INT> (<','>) y: <INT> }\n"
        + "end coords\n"
        + "'1,2' -> coords -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=1, y=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dereferenceValue() throws IOException {
    String program = "def val: 3\n"
        + "composer coords\n"
        + "  { x: $val, y: <INT> }\n"
        + "end coords\n"
        + "'5' -> coords -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=3, y=5}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void captureValue() throws IOException {
    String program = "composer coords\n"
        + "(def val: <INT>) { x: $val }\n"
        + "end coords\n"
        + "'3' -> coords -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void exactAmount() throws IOException {
    String program = "composer words\n"
        + "<word>=2\n"
        + "word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'Hello World!' -> words -> ':$it;:' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals(":Hello::World!:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void exactAmountThrowsOnFewer() throws IOException {
    String program = "composer words\n"
        + "<word>=2\n"
        + "word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'Hello!' -> words -> ':$it;:' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void exactAmountThrowsOnMore() throws IOException {
    String program = "composer words\n"
        + "<word>=2\n"
        + "word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'Hello wild World!' -> words -> ':$it;:' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void exactAmountNotGreedy() throws IOException {
    String program = "composer words\n"
        + "{ first: [<word>=2], last: <word> }\n"
        + "word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'Hello wild World!' -> words -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{first=[Hello, wild], last=World!}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void exactAmountDereference() throws IOException {
    String program = "def count: 2\n"
        + "composer words\n"
        + "<word>=$count\n"
        + "word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'Hello World!' -> words -> ':$it;:' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals(":Hello::World!:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void optionalSubSequence() throws IOException {
    String program = "composer opt\n"
        + "<level>? <INT>\n"
        + "level: (<'\\+'>) [ <INT> ] (<'-'>)\n"
        + "end opt\n"
        + "'+7-5' -> opt -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[7]5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void optionalSubSequenceUnfulfilled() throws IOException {
    String program = "composer opt\n"
        + "<level>? <INT>\n"
        + "level: (<'\\+'>) [ <INT> ] (<'-'>)\n"
        + "end opt\n"
        + "'5' -> opt -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void optionalSubSequencePartiallyFulfilled() throws IOException {
    String program =
        "composer opt\n"
            + "<level>? <INT>\n"
            + "level: [ <INT> ] (<'\\+'>)\n"
            + "end opt\n"
            + "'5' -> opt -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void recurse() throws IOException {
    String program = "composer recurse\n"
        + "<level>\n"
        + "level: (<'\\+'>) [ <level>? <INT> ] (<'-'>)\n"
        + "end recurse\n"
        + "'++7-5-' -> recurse -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[7], 5]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void converter() throws IOException {
    String program =
        "templates parity"
            + "<?($it mod 2 <1>)> 'odd' ! <> 'even' !\n"
            + "end parity\n"
            + "composer number\n"
            + "<INT> -> parity\n"
            + "end number\n"
            + "['1', '56', '524', '43']... -> number -> '$it; ' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("odd even even odd ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void subRuleConverter() throws IOException {
    String program =
        "templates parity"
            + "<?($it mod 2 <1>)> 'odd' ! <> 'even' !\n"
            + "end parity\n"
            + "composer number\n"
            + "<mynum> -> parity\n"
            + "mynum: <INT>\n"
            + "end number\n"
            + "['1', '56', '524', '43']... -> number -> '$it; ' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("odd even even odd ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayConverter() throws IOException {
    String program =
        "templates mul"
            + "$it(1) * $it(2) !\n"
            + "end mul\n"
            + "composer numbers\n"
            + "[ <INT> (<WS>) <INT> ] -> mul\n"
            + "end numbers\n"
            + "'5 7' -> numbers -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("35", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureConverter() throws IOException {
    String program =
        "templates mul"
            + "$it.a * $it.b !\n"
            + "end mul\n"
            + "composer numbers\n"
            + "{ a:<INT> (<WS>) b:<INT> } -> mul\n"
            + "end numbers\n"
            + "'5 7' -> numbers -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("35", output.toString(StandardCharsets.UTF_8));
  }

  // TODO: add a converter
  @Test
  void jsonNumber() throws IOException {
    String program =
        "composer number\n"
            + "<'-?(0|[1-9][0-9]*)(\\.[0-9]+)?((e|E)(\\+|-)?[0-9]+)?'>\n"
            + "end number\n"
            + "['10', '-5', '-7.3', '10e-7', '0.15e6']... -> number -> '$it; ' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("10 -5 -7.3 10e-7 0.15e6 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void jsonString() throws IOException {
    String program =
        "composer string\n"
            + "(<'\"'>) <chars> -> '$($it...)'  (<'\"'>)\n"
            + "chars: [ <'(\\\\\"|[^\"])'>* -> (<'\\\\\"'> '\"' ! <> $it !) ]"
            + "end string\n"
            + "'\"foo\\\"bar\"' -> string -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("foo\"bar", output.toString(StandardCharsets.UTF_8));
  }
}
