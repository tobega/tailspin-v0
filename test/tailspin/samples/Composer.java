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
        + "'23' -> int -> \\(<=23> $!\\) -> $ + 12 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("35", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeEqualsLiteral() throws IOException {
    String program = "composer eq\n"
        + "<='Quo vadis?'>\n"
        + "end eq\n"
        + "'Quo vadis?' -> eq -> \\(<='Quo vadis?'> $!\\) -> 1 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeEqualsLiteralDoesNotMatch() throws IOException {
    String program = "composer eq\n"
        + "<='Quo vadis?'|INT>\n"
        + "end eq\n"
        + "'5' -> eq -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeEqualsReference() throws IOException {
    String program = "def who:'Quo vadis?';\n"
        + "composer eq\n"
        + "<=$who>\n"
        + "end eq\n"
        + "'Quo vadis?' -> eq -> \\(<='Quo vadis?'> $!\\) -> 1 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeEqualsStateDelete() throws IOException {
    String program = "composer eq\n"
        + "@: 'Quo vadis?';"
        + "<=^@>\n"
        + "end eq\n"
        + "'Quo vadis?' -> eq -> \\(<='Quo vadis?'> $!\\) -> 1 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeIntShouldWorkForZero() throws IOException {
    String program = "composer int\n"
        + "<INT>\n"
        + "end int\n"
        + "'0' -> int -> $ + 12 -> !OUT::write";
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
        + "'Any text' -> all -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Any text", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composerWithKeywordName() throws IOException {
    String program = "composer composer\n"
        + "<'.*'>\n"
        + "end composer\n"
        + "'Any text' -> composer -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Any text", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composerHasNotImportedName() {
    String program = "composer my/all\n"
        + "<'.*'>\n"
        + "end my/all\n"
        + "'Any text' -> my/all -> !OUT::write";
    assertThrows(Exception.class, () -> Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8))));
  }

  @Test
  void interpolateComposeRegex() throws IOException {
    String program = "def any: '.*';\n"
        + "composer all\n"
        + "<'$any;'>\n"
        + "end all\n"
        + "'Any text' -> all -> !OUT::write";
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
        + "'ab' -> ab -> '$;+' -> !OUT::write";
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
        + "rule word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'one two\n\nthree\nfour five six' -> words -> '$; ' -> !OUT::write";
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
        + "'Value: 23' -> int -> $ + 12 -> !OUT::write";
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
        + "[ [<INT>] (<','>) <INT> ]\n"
        + "end intArray\n"
        + "'1,2' -> intArray -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[1], 2]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildArray_placeCommaBeforeSkip() throws IOException {
    String program = "composer intArray\n"
        + "[ [<INT>] , (<','>) <INT> ]\n"
        + "end intArray\n"
        + "'1,2' -> intArray -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[1], 2]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildArray_placeCommaAfterSkip() throws IOException {
    String program = "composer intArray\n"
        + "[ [<INT>] (<','>), <INT> ]\n"
        + "end intArray\n"
        + "'1,2' -> intArray -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[1], 2]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildArray_skipAfterLeftBrace() throws IOException {
    String program = "composer intArray\n"
        + "[ (<'='>) [<INT>] (<','>) <INT> ]\n"
        + "end intArray\n"
        + "'=1,2' -> intArray -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[1], 2]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildArray_skipBeforeRightBrace() throws IOException {
    String program = "composer intArray\n"
        + "[ [<INT>] (<','>) <INT> (<'='>) ]\n"
        + "end intArray\n"
        + "'1,2=' -> intArray -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[1], 2]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void failSkipped() throws IOException {
    String program = "composer int\n"
        + "(<'Value: '>) <INT>\n"
        + "end int\n"
        + "'23' -> int -> $ + 12 -> !OUT::write";
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
        + "'Value: ' -> int -> $ + 12 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void failExtraSpace() throws IOException {
    String program = "composer int\n"
        + "<INT>\n"
        + "end int\n"
        + "'23 ' -> int -> $ + 12 -> !OUT::write";
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
        + "'3 8' -> int -> $ + 12 -> !OUT::write";
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
        + "'3 \r\n\t 8' -> int -> $ + 12 -> !OUT::write";
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
        + "'3' -> int -> $ + 12 -> !OUT::write";
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
        + "'3' -> int -> $ + 12 -> !OUT::write";
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
        + "'Hello World!' -> word -> ':$;:' -> !OUT::write";
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
        + "'abcdefg' -> parts -> ':$;:' -> !OUT::write";
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
        + "rule word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'Hello World!' -> words -> ':$;:' -> !OUT::write";
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
        + "rule word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'Hello World!' -> words -> ':$;:' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals(":Hello::World!:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void atLeastOneFailsOnNone() throws IOException {
    String program = "composer words\n"
        + "<word>+\n"
        + "word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'' -> words -> ':$;:' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals(":{composerFailed=}:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void any() throws IOException {
    String program = "composer words\n"
        + "<word>*\n"
        + "rule word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'Hello World!' -> words -> ':$;:' -> !OUT::write";
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
        + "rule word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'' -> words -> ':$;:' -> !OUT::write";
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
        + "{ x: <INT> (<','>), y: <INT> }\n"
        + "end coords\n"
        + "'1,2' -> coords -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=1, y=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildArrayOfKeyValues() throws IOException {
    String program = "composer coords\n"
        + "[ x: <INT> (<','>), y: <INT> ]\n"
        + "end coords\n"
        + "'1,2' -> coords -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[x=1, y=2]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildArrayWithVariedContent() throws IOException {
    String program = "composer coords\n"
        + "[ 0, x: <INT> (<','>), {y: [<INT>]} ]\n"
        + "end coords\n"
        + "'1,2' -> coords -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[0, x=1, {y=[2]}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildStructure_noComma() throws IOException {
    String program = "composer coords\n"
        + "{ x: <INT> (<','>) y: <INT> }\n"
        + "end coords\n"
        + "'1,2' -> coords -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=1, y=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildStructure_placeCommaBeforeSkipMatcher() throws IOException {
    String program = "composer coords\n"
        + "{ x: <INT> ,(<','>) y: <INT> }\n"
        + "end coords\n"
        + "'1,2' -> coords -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=1, y=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildStructure_placeKeyBeforeSkipMatcher() throws IOException {
    String program = "composer coords\n"
        + "{ x: <INT> , y: (<','>) <INT> }\n"
        + "end coords\n"
        + "'1,2' -> coords -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=1, y=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dereferenceValue() throws IOException {
    String program = "def val: 3;\n"
        + "composer coords\n"
        + "  { x: $val, y: <INT> }\n"
        + "end coords\n"
        + "'5' -> coords -> !OUT::write";
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
        + "(def val: <INT>;) { x: $val }\n"
        + "end coords\n"
        + "'3' -> coords -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void useCapturedValueInFollowingSubRule() throws IOException {
    String program = "composer coords\n"
        + "(def val: <INT>;) <struct>\n"
        + "rule struct: { x: $val }\n"
        + "end coords\n"
        + "'3' -> coords -> !OUT::write";
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
        + "rule word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'Hello World!' -> words -> ':$;:' -> !OUT::write";
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
        + "'Hello!' -> words -> ':$;:' -> !OUT::write";
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
        + "'Hello wild World!' -> words -> ':$;:' -> !OUT::write";
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
        + "rule word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'Hello wild World!' -> words -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{first=[Hello, wild], last=World!}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void exactAmountDereference() throws IOException {
    String program = "def count: 2;\n"
        + "composer words\n"
        + "<word>=$count\n"
        + "rule word: <~WS> (<WS>?)\n"
        + "end words\n"
        + "'Hello World!' -> words -> ':$;:' -> !OUT::write";
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
        + "rule level: (<'\\+'>) [ <INT> ] (<'-'>)\n"
        + "end opt\n"
        + "'+7-5' -> opt -> !OUT::write";
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
        + "rule level: (<'\\+'>) [ <INT> ] (<'-'>)\n"
        + "end opt\n"
        + "'5' -> opt -> !OUT::write";
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
            + "rule level: [ <INT> ] (<'\\+'>)\n"
            + "end opt\n"
            + "'5' -> opt -> !OUT::write";
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
        + "rule level: (<'\\+'>) [ <level>? <INT> ] (<'-'>)\n"
        + "end recurse\n"
        + "'++7-5-' -> recurse -> !OUT::write";
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
            + "<?($ mod 2 <=1>)> 'odd' ! <> 'even' !\n"
            + "end parity\n"
            + "composer number\n"
            + "<INT> -> parity\n"
            + "end number\n"
            + "['1', '56', '524', '43']... -> number -> '$; ' -> !OUT::write";
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
            + "<?($ mod 2 <=1>)> 'odd' ! <> 'even' !\n"
            + "end parity\n"
            + "composer number\n"
            + "<mynum> -> parity\n"
            + "rule mynum: <INT>\n"
            + "end number\n"
            + "['1', '56', '524', '43']... -> number -> '$; ' -> !OUT::write";
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
            + "$(1) * $(2) !\n"
            + "end mul\n"
            + "composer numbers\n"
            + "[ <INT> (<WS>) <INT> ] -> mul\n"
            + "end numbers\n"
            + "'5 7' -> numbers -> !OUT::write";
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
            + "$.a * $.b !\n"
            + "end mul\n"
            + "composer numbers\n"
            + "{ a:<INT> (<WS>), b:<INT> } -> mul\n"
            + "end numbers\n"
            + "'5 7' -> numbers -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("35", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void choice() throws IOException {
    String program =
        "composer options\n"
            + "<value>\n"
            + "rule value: (<WS>?) <INT|'x[0-9a-f]'|array> (<WS>?)\n"
            + "rule array: (<'\\('>) [ <value>* ] (<'\\)'>)\n"
            + "end options\n"
            + "['76', '( xb x5 45 (6))', 'x9']... -> options -> '$; ' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("76 [xb, x5, 45, [6]] x9 ", output.toString(StandardCharsets.UTF_8));
  }

  // TODO: add a converter
  @Test
  void jsonNumber() throws IOException {
    String program =
        "composer number\n"
            + "<'-?(0|[1-9][0-9]*)(\\.[0-9]+)?((e|E)(\\+|-)?[0-9]+)?'>\n"
            + "end number\n"
            + "['10', '-5', '-7.3', '10e-7', '0.15e6']... -> number -> '$; ' -> !OUT::write";
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
            + "(<'\"'>) <chars> -> '$...;'  (<'\"'>)\n"
            + "rule chars: [ <'(\\\\\"|[^\"])'>* -> \\(<'\\\\\"'> '\"' ! <> $ !\\) ]"
            + "end string\n"
            + "'\"foo\\\"bar\"' -> string -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("foo\"bar", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeStructureKey() throws IOException {
    String program = "composer keyValue\n"
        + "{ <~WS>: (<WS>) <~WS> }\n"
        + "end keyValue\n"
        + "'foo bar' -> keyValue -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{foo=bar}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void keyValueSubRule() throws IOException {
    String program = "composer struct\n"
        + "{ <keyValue>* }\n"
        + "rule keyValue: <~WS>: (<WS>) <~WS> (<WS>?)\n"
        + "end struct\n"
        + "'foo bar baz qux' -> struct -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{baz=qux, foo=bar}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composedKeyWithLiteralValue() throws IOException {
    String program = "composer struct\n"
        + "{ <keyValue>* }\n"
        + "rule keyValue: <~WS>: 1 (<WS>?)\n"
        + "end struct\n"
        + "'foo bar baz qux' -> struct -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{bar=1, baz=1, foo=1, qux=1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void emptyStructure() throws IOException {
    String program = "composer struct\n"
        + "{ <keyValue>* }\n"
        + "rule keyValue: <~WS>: (<WS>) <~WS>\n"
        + "end struct\n"
        + "'' -> struct -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void subRuleFollowingKeyValueSubRule() throws IOException {
    String program = "composer struct\n"
        + "<main>\n"
        + "rule keyValue: <~WS>: (<WS>) <~WS> (<WS>?)\n"
        + "rule main: { <keyValue>* }\n"
        + "end struct\n"
        + "'foo bar baz qux' -> struct -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{baz=qux, foo=bar}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void voidResult() throws IOException {
    String program = "composer maybeA\n"
        + "<a|not>\n"
        + "rule a: <'[aA]'>\n"
        + "rule not: (<'.'>)\n"
        + "end maybeA\n"
        + "['a', 'b', 'c', 'A']... -> maybeA -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("aA", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void invertOptions() throws IOException {
    String program = "composer foo\n"
        + "<~'0'|'1'> <'0'|'1'>\n"
        + "end foo\n"
        + "['551' -> foo, '550' -> foo] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[55, 1, 55, 0]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void matchCapturedValue() throws IOException {
    String program = "composer bounds\n"
        + "(def bound: <'.'>;) <~'$bound;'> (<'$bound;'>)\n"
        + "end bounds\n"
        + "'/word/' -> bounds -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("word", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void parameters() throws IOException {
    String program = "composer split&{separator:}\n"
        + "[ <token>* ]\n"
        + "rule token: <~sep> (<sep>?)\n"
        + "rule sep: <'$separator;'>\n"
        + "end split\n"
        + "'ab;cd;e' -> split&{separator:';'} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[ab, cd, e]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void recaptureValue() throws IOException {
    String program = "composer bounds\n"
        + "[<bounded>*]"
        + "rule bounded: (def bound: <'.'>;) <~'$bound;'> (<'$bound;'>)\n"
        + "end bounds\n"
        + "'/word/;other;' -> bounds -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[word, other]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void recaptureValueArray() throws IOException {
    String program = "composer bounds\n"
        + "[<bounded>*]"
        + "rule bounded: [(def bound: <'.'>;) <~'$bound;'> (<'$bound;'>)]\n"
        + "end bounds\n"
        + "'/word/;other;' -> bounds -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[word], [other]]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void captureValueArrayInSequenceScope() throws IOException {
    String program = "composer foo\n"
        + "<bar>"
        + "rule bar: [(def bound: <'.'>;) <~'$bound;'>] (<'$bound;'>)\n"
        + "end foo\n"
        + "'/word/' -> foo -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[word]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void recaptureValueStructure() throws IOException {
    String program = "composer bounds\n"
        + "[<bounded>*]"
        + "rule bounded: { (def bound: <'.'>;) a:<~'$bound;'> (<'$bound;'>)}\n"
        + "end bounds\n"
        + "'/word/' -> bounds -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{a=word}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void recaptureValueKeyValue() throws IOException {
    String program = "composer bounds\n"
        + "[<bounded>*]"
        + "rule bounded: a: (def bound: <'.'>;) <~'$bound;'> (<'$bound;'>)\n"
        + "end bounds\n"
        + "'/word/' -> bounds -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[a=word]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void simpleState() throws IOException {
    String program = "composer state\n"
        + "@: 0;\n"
        + "{ word: <hello>, flag: $@ }\n"
        + "rule hello: <'.*'>\n"
        + "end state\n"
        + "'hello' -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{flag=0, word=hello}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void setStateInRule() throws IOException {
    String program = "composer state\n"
        + "@: 0;\n"
        + "{ word: <hello>, flag: $@ }\n"
        + "rule hello: (@: 1;) <'.*'>\n"
        + "end state\n"
        + "'hello' -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{flag=1, word=hello}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void setStateFromMatch() throws IOException {
    String program = "composer state\n"
        + "<hello> $@\n"
        + "rule hello: ({word: <'.*'>} -> @:$;)\n"
        + "end state\n"
        + "'hello' -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{word=hello}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void backtrack() throws IOException {
    String program = "composer bt\n"
        + "  <='a'|='aa'> <='ab'|='bc'>\n"
        + "end bt\n"
        + "\n"
        + "'aabc' -> bt -> '$;\n"
        + "' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("aa\nbc\n", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void backtrackOneLessRepetitions() throws IOException {
    String program = "composer bt\n"
        + "  <='a'>+ <='abc'>\n"
        + "end bt\n"
        + "\n"
        + "'aabc' -> bt -> '$;\n"
        + "' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a\nabc\n", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void backtrackRechooseLastRepetitions() throws IOException {
    String program = "composer bt\n"
        + "  <='ab'|='a'>+ <='bc'>\n"
        + "end bt\n"
        + "\n"
        + "'aabc' -> bt -> '$;\n"
        + "' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a\na\nbc\n", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void backtrackState() throws IOException {
    String program = "composer bt\n"
        + "  @:1;"
        + "  <foo|='a'>+ $@ <='bc'>\n"
        + "  rule foo: <='ab'> (@:2;)\n"
        + "end bt\n"
        + "\n"
        + "'aabc' -> bt -> '$;\n"
        + "' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a\na\n1\nbc\n", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void backtrackAppendedState() throws IOException {
    String program = "composer bt\n"
        + "  @:[1];"
        + "  <foo|='a'>+ $@ <='bc'>\n"
        + "  rule foo: <='ab'> (..|@:2;)\n"
        + "end bt\n"
        + "\n"
        + "'aabc' -> bt -> '$;\n"
        + "' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a\na\n[1]\nbc\n", output.toString(StandardCharsets.UTF_8));
  }

  /**
   * This is a regression caused by introduction of backtracking, which needs to save old state
   */
  @Test
  void backtrackIndexedState() throws IOException {
    String program = "composer bt\n"
        + "  @:[1..3 -> 0];"
        + "  (<a|b>) $@"
        + "  rule a: (<INT> -> @($): 1; <='a'>)\n"
        + "  rule b: (<INT> -> @(1): $; <='b'>)\n"
        + "end bt\n"
        + "\n"
        + "'2b' -> bt -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[2, 0, 0]", output.toString(StandardCharsets.UTF_8));
  }

  /**
   * The parser thought we were referencing variable $@rule followed by key-value matcher
   */
  @Test
  void regressionCannotParseRule() throws IOException {
    String program = "composer bt\n"
        + "  <foo> $@\n"
        + "  rule foo: <='ab'> (@:2;)\n"
        + "end bt\n"
        + "\n"
        + "'ab' -> bt -> '$;\n"
        + "' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ab\n2\n", output.toString(StandardCharsets.UTF_8));
  }

  /**
   * Attempting to add repetitions when string is empty
   */
  @Test
  void regressionDecodeRoman() throws IOException {
    String program =
        "def digits: [(M:1000), (CM:900), (D:500), (CD:400), (C:100), (XC:90), (L:50), (XL:40), (X:10), (IX:9), (V:5), (IV:4), (I:1)];\n"
            + "composer decodeRoman\n"
            + "  @: 1;\n"
            + "  [ <digit>* ] -> \\(@: 0; $... -> @: $@ + $; $@ !\\)\n"
            + "  rule digit: <value>* (@: $@ + 1;)\n"
            + "  rule value: <'$digits($@)::key;'> -> $digits($@)::value\n"
            + "end decodeRoman\n"
            + "\n"
            + "'MMVIII' -> decodeRoman -> !OUT::write\n";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("2008", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void positiveLookbehind() throws IOException {
    String program = "composer foo\n"
        + "  [<tar|not>*]"
        + "  rule tar: <'(?<=s)tar'>\n"
        + "  rule not: <~tar>\n"
        + "end foo\n"
        + "\n"
        + "'startare' -> foo -> '$;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[s, tar, tare]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void negativeLookbehind() throws IOException {
    String program = "composer foo\n"
        + "  [<tar|not>*]"
        + "  rule tar: <'(?<!s)tar'>\n"
        + "  rule not: <~tar>\n"
        + "end foo\n"
        + "\n"
        + "'startare' -> foo -> '$;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[star, tar, e]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void noAnchorInTheMiddle() throws IOException {
    String program = "composer foo\n"
        + "  <bad|good>\n"
        + "  rule bad: (<='s'>) <'^tar'>"
        + "  rule good: <'.*'>\n"
        + "end foo\n"
        + "\n"
        + "'star' -> foo -> '$;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("star", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void anchorAtStart() throws IOException {
    String program = "composer foo\n"
        + "  <good|bad>\n"
        + "  rule good: (<'^s'>) <='tar'>"
        + "  rule bad: <'.*'>\n"
        + "end foo\n"
        + "\n"
        + "'star' -> foo -> '$;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("tar", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arithmeticOperationIsHeldTogetherAsTransform() throws IOException {
    String program = "composer foo\n"
        + "  (<'[a-z]'> -> $::asCodePoints -> $(1) - 96 -> @: $;) $@\n"
        + "end foo\n"
        + "\n"
        + "'a' -> foo -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void collector() throws IOException {
    String program = "composer letters\n"
        + "  <letter|not>+ -> ..=Count \n"
        + "  rule letter: <'[a-z]'>\n"
        + "  rule not: (<'.'>)\n"
        + "end letters\n"
        + "\n"
        + "'a1bc2d' -> letters -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("4", output.toString(StandardCharsets.UTF_8));
  }
}
