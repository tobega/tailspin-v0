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
    String program = """
        composer int
        <INT>
        end int
        '23' -> int -> \\(<=23> $!\\) -> $ + 12 -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("35", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeScalarInt() throws IOException {
    String program = """
        composer int
        <INT"1">
        end int
        '23' -> int -> \\(<=23"1"> $!\\) -> $ + 12"1" -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("35\"1\"", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeUnitInt() throws IOException {
    String program = """
        composer metres
        <INT "m">
        end metres
        '23' -> metres -> \\(<=23"m"> $!\\) -> $ + 12"m" -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("35\"m\"", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeTaggedInt() throws IOException {
    String program = """
        composer tag
        <(id) INT>
        end tag
        {id: 5, '23' -> tag -> (id: $)} -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{id=23}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeTaggedIntWrongAssignmentFails() throws IOException {
    String program = """
        composer tag
        <(foo) INT>
        end tag
        {id: 5, '23' -> tag -> (id: $)} -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }
  @Test
  void composeTaggedString() throws IOException {
    String program = """
        composer tag
        <(id) '.*'>
        end tag
        {id: 'def', 'abc' -> tag -> (id: $)} -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{id=abc}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeTaggedStringWrongAssignmentFails() throws IOException {
    String program = """
        composer tag
        <(foo) INT>
        end tag
        {id: 'def', 'abc' -> tag -> (id: $)} -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void composeTaggedIntArithmeticFails() throws IOException {
    String program = """
        composer tag
        <(id) INT>
        end tag
        '23' -> tag -> $ + 1 -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void composeTaggedStructureFails() throws IOException {
    String program = """
        composer tag
        <(id) struct>
        rule struct: { id: <'.*'>}
        end tag
        '23' -> tag -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void composeTaggedIntWithMeasureFails() throws IOException {
    String program = """
        composer tag
        <(id) INT"m">
        end tag
        '23' -> tag -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void composeEqualsLiteral() throws IOException {
    String program = """
        composer eq
        <='Quo vadis?'>
        end eq
        'Quo vadis?' -> eq -> \\(<='Quo vadis?'> $!\\) -> 1 -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeEqualsLiteralDoesNotMatch() throws IOException {
    String program = """
        composer eq
        <='Quo vadis?'|INT>
        end eq
        '5' -> eq -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeEqualsReference() throws IOException {
    String program = """
        def who:'Quo vadis?';
        composer eq
        <=$who>
        end eq
        'Quo vadis?' -> eq -> \\(<='Quo vadis?'> $!\\) -> 1 -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeEqualsStateDelete() throws IOException {
    String program = """
        composer eq
        @: 'Quo vadis?';<=^@>
        end eq
        'Quo vadis?' -> eq -> \\(<='Quo vadis?'> $!\\) -> 1 -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeIntShouldWorkForZero() throws IOException {
    String program = """
        composer int
        <INT>
        end int
        '0' -> int -> $ + 12 -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("12", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeRegex() throws IOException {
    String program = """
        composer all
        <'.*'>
        end all
        'Any text' -> all -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Any text", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composerWithKeywordName() throws IOException {
    String program = """
        composer composer
        <'.*'>
        end composer
        'Any text' -> composer -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Any text", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composerHasNotImportedName() {
    String program = """
        composer my/all
        <'.*'>
        end my/all
        'Any text' -> my/all -> !OUT::write""";
    assertThrows(Exception.class, () -> Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8))));
  }

  @Test
  void interpolateComposeRegex() throws IOException {
    String program = """
        def any: '.*';
        composer all
        <'$any;'>
        end all
        'Any text' -> all -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Any text", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeSequence() throws IOException {
    String program = """
        composer ab
        <'a'> <'b'>
        end ab
        'ab' -> ab -> '$;+' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a+b+", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeMultilineSequence() throws IOException {
    String program = """
        composer words
        <word>*
        rule word: <~WS> (<WS>?)
        end words
        'one two

        three
        four five six' -> words -> '$; ' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("one two three four five six ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void ignoreStuff() throws IOException {
    String program = """
        composer int
        (<'Value: '>) <INT>
        end int
        'Value: 23' -> int -> $ + 12 -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("35", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildArray() throws IOException {
    String program = """
        composer intArray
        [ [<INT>] (<','>) <INT> ]
        end intArray
        '1,2' -> intArray -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[1], 2]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildArray_placeCommaBeforeSkip() throws IOException {
    String program = """
        composer intArray
        [ [<INT>] , (<','>) <INT> ]
        end intArray
        '1,2' -> intArray -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[1], 2]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildArray_placeCommaAfterSkip() throws IOException {
    String program = """
        composer intArray
        [ [<INT>] (<','>), <INT> ]
        end intArray
        '1,2' -> intArray -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[1], 2]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildArray_skipAfterLeftBrace() throws IOException {
    String program = """
        composer intArray
        [ (<'='>) [<INT>] (<','>) <INT> ]
        end intArray
        '=1,2' -> intArray -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[1], 2]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildArray_skipBeforeRightBrace() throws IOException {
    String program = """
        composer intArray
        [ [<INT>] (<','>) <INT> (<'='>) ]
        end intArray
        '1,2=' -> intArray -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[1], 2]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void failSkipped() throws IOException {
    String program = """
        composer int
        (<'Value: '>) <INT>
        end int
        '23' -> int -> $ + 12 -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void failInt() throws IOException {
    String program = """
        composer int
        (<'Value: '>) <INT>
        end int
        'Value: ' -> int -> $ + 12 -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void failExtraSpace() throws IOException {
    String program = """
        composer int
        <INT>
        end int
        '23 ' -> int -> $ + 12 -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void composeWhitespace() throws IOException {
    String program = """
        composer int
        <INT> (<WS>) <INT>
        end int
        '3 8' -> int -> $ + 12 -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1520", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void multipleWhitespace() throws IOException {
    String program = """
        composer int
        <INT> (<WS>) <INT>
        end int
        '3 \r
        \t 8' -> int -> $ + 12 -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1520", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void optionalNamed() throws IOException {
    String program = """
        composer int
        (<WS>?) <INT>
        end int
        '3' -> int -> $ + 12 -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("15", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void optionalRegex() throws IOException {
    String program = """
        composer int
        (<'Value: '>?) <INT>
        end int
        '3' -> int -> $ + 12 -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("15", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void inverseWhitespace() throws IOException {
    String program = """
        composer word
        <~WS> (<WS>) <~WS>
        end word
        'Hello World!' -> word -> ':$;:' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals(":Hello::World!:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void inverseRegex() throws IOException {
    String program = """
        composer parts
        <~'def'> <~'z'>
        end parts
        'abcdefg' -> parts -> ':$;:' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals(":abc::defg:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void subrule() throws IOException {
    String program = """
        composer words
        <word> <word>
        rule word: <~WS> (<WS>?)
        end words
        'Hello World!' -> words -> ':$;:' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals(":Hello::World!:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void atLeastOne() throws IOException {
    String program = """
        composer words
        <word>+
        rule word: <~WS> (<WS>?)
        end words
        'Hello World!' -> words -> ':$;:' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals(":Hello::World!:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void atLeastOneFailsOnNone() throws IOException {
    String program = """
        composer words
        <word>+
        word: <~WS> (<WS>?)
        end words
        '' -> words -> ':$;:' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals(":{composerFailed=}:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void any() throws IOException {
    String program = """
        composer words
        <word>*
        rule word: <~WS> (<WS>?)
        end words
        'Hello World!' -> words -> ':$;:' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals(":Hello::World!:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void anyNoneOk() throws IOException {
    String program = """
        composer words
        <word>*
        rule word: <~WS> (<WS>?)
        end words
        '' -> words -> ':$;:' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildStructure() throws IOException {
    String program = """
        composer coords
        { x: <INT> (<','>), y: <INT> }
        end coords
        '1,2' -> coords -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=1, y=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildArrayOfKeyValues() throws IOException {
    String program = """
        composer coords
        [ x: <INT> (<','>), y: <INT> ]
        end coords
        '1,2' -> coords -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[x=1, y=2]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildArrayWithVariedContent() throws IOException {
    String program = """
        composer coords
        [ 0, x: <INT> (<','>), {y: [<INT>]} ]
        end coords
        '1,2' -> coords -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[0, x=1, {y=[2]}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildStructure_noComma() throws IOException {
    String program = """
        composer coords
        { x: <INT> (<','>) y: <INT> }
        end coords
        '1,2' -> coords -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=1, y=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildStructure_placeCommaBeforeSkipMatcher() throws IOException {
    String program = """
        composer coords
        { x: <INT> ,(<','>) y: <INT> }
        end coords
        '1,2' -> coords -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=1, y=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void buildStructure_placeKeyBeforeSkipMatcher() throws IOException {
    String program = """
        composer coords
        { x: <INT> , y: (<','>) <INT> }
        end coords
        '1,2' -> coords -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=1, y=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dereferenceValue() throws IOException {
    String program = """
        def val: 3;
        composer coords
          { x: $val, y: <INT> }
        end coords
        '5' -> coords -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=3, y=5}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void captureValue() throws IOException {
    String program = """
        composer coords
        (def val: <INT>;) { x: $val }
        end coords
        '3' -> coords -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void useCapturedValueInFollowingSubRule() throws IOException {
    String program = """
        composer coords
        (def val: <INT>;) <struct>
        rule struct: { x: $val }
        end coords
        '3' -> coords -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void exactAmount() throws IOException {
    String program = """
        composer words
        <word>=2
        rule word: <~WS> (<WS>?)
        end words
        'Hello World!' -> words -> ':$;:' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals(":Hello::World!:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void exactAmountThrowsOnFewer() throws IOException {
    String program = """
        composer words
        <word>=2
        word: <~WS> (<WS>?)
        end words
        'Hello!' -> words -> ':$;:' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void exactAmountThrowsOnMore() throws IOException {
    String program = """
        composer words
        <word>=2
        word: <~WS> (<WS>?)
        end words
        'Hello wild World!' -> words -> ':$;:' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void exactAmountNotGreedy() throws IOException {
    String program = """
        composer words
        { first: [<word>=2], last: <word> }
        rule word: <~WS> (<WS>?)
        end words
        'Hello wild World!' -> words -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{first=[Hello, wild], last=World!}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void exactAmountDereference() throws IOException {
    String program = """
        def count: 2;
        composer words
        <word>=$count
        rule word: <~WS> (<WS>?)
        end words
        'Hello World!' -> words -> ':$;:' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals(":Hello::World!:", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void optionalSubSequence() throws IOException {
    String program = """
        composer opt
        <level>? <INT>
        rule level: (<'\\+'>) [ <INT> ] (<'-'>)
        end opt
        '+7-5' -> opt -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[7]5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void optionalSubSequenceUnfulfilled() throws IOException {
    String program = """
        composer opt
        <level>? <INT>
        rule level: (<'\\+'>) [ <INT> ] (<'-'>)
        end opt
        '5' -> opt -> !OUT::write""";
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
        """
            composer opt
            <level>? <INT>
            rule level: [ <INT> ] (<'\\+'>)
            end opt
            '5' -> opt -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void recurse() throws IOException {
    String program = """
        composer recurse
        <level>
        rule level: (<'\\+'>) [ <level>? <INT> ] (<'-'>)
        end recurse
        '++7-5-' -> recurse -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[7], 5]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void leftRecurse() throws IOException {
    String program = """
        composer recurse
        <addition>
        rule addition: [<addition|INT> (<'[+]'>) <INT>]
        end recurse
        '1+2+3+4' -> recurse -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[[1, 2], 3], 4]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void leftRecurseAfterBacktrack() throws IOException {
    String program = """
        composer recurse
        <addition>
        rule addition: [<INT|addition|INT> (<'[+]'>) <INT>]
        end recurse
        '1+2+3+4' -> recurse -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[[1, 2], 3], 4]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void leftRecurseBacktrackOne() throws IOException {
    String program = """
        composer recurse
        [<addition> (<'[+]'>) <INT>]
        rule addition: [<addition|INT> (<'[+]'>) <INT>]
        end recurse
        '1+2+3+4' -> recurse -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[[1, 2], 3], 4]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void leftRecurseBacktrackTwo() throws IOException {
    String program = """
        composer recurse
        [<addition> (<'[+]'>) <INT> (<'[+]'>) <INT>]
        rule addition: [<addition|INT> (<'[+]'>) <INT>]
        end recurse
        '1+2+3+4' -> recurse -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[1, 2], 3, 4]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void leftRecursedRuleIsRevisitedInNonRecursedPosition() throws IOException {
    String program = """
        composer recurse
  (<WS>?) <addition> (<WS>?)
  rule addition: [<addition|INT> (<'[+-]'>) <INT|parentheses>]
  rule parentheses: (<'\\('> <WS>?) <addition|INT> (<WS>? <'\\)'>)
        end recurse
        '1+(2+3)' -> recurse -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, [2, 3]]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void leftRecursedRuleBacktracking() throws IOException {
    String program = """
        data binaryExpression <{left: <binaryExpression|"1">, op: <>, right: <binaryExpression|"1">}>
        
        composer recurse
          <addition|multiplication|term>
          rule addition: {left: <addition|multiplication|term> op: <'[+-]'> right: <multiplication|term>}
          rule multiplication: { left: <multiplication|term>  op: <'[*/]'> right: <term> }
          rule term: <INT"1"|parentheses>
          rule parentheses: (<'\\('>) <addition|multiplication|term> (<'\\)'>)
        end recurse
        '100+(3+4)' -> recurse -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{left=100\"1\", op=+, right={left=3\"1\", op=+, right=4\"1\"}}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void leftRecursedRuleIsNotSatisfied() throws IOException {
    String program = """
        data binaryExpression <{left: <binaryExpression|"1">, op: <>, right: <binaryExpression|"1">}>
        
        composer recurse
  <addition|term>
  rule addition: {left: <addition|term> op: <'[+-]'> right: <term>}
  rule term: <INT|parentheses>
  rule parentheses: (<'\\('>) <addition|term> (<'\\)'>)
        end recurse
        '(5 +3)' -> recurse -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{composerFailed=(5 +3)}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deepLeftRecursion() throws IOException {
    String program = """
        composer recurse
          <term>
          rule term: [<power|'.'>]
          rule power: <term> (<='^'>) <'.'>
        end recurse
        '2^3^4' -> recurse -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[[2], 3], 4]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deepLeftRecursionAfterBacktrack() throws IOException {
    String program = """
        composer recurse
          <term>
          rule term: [<'.'|power|'.'>]
          rule power: <term> (<='^'>) <'.'>
        end recurse
        '2^3^4' -> recurse -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[[2], 3], 4]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void leftRecursedRuleFails() throws IOException {
    String program = """
        data binaryExpression <{left: <binaryExpression|"1">, op: <>, right: <binaryExpression|"1">}>
        
        composer recurse
          <addition|multiplication|term>
          rule addition: {left: <addition|multiplication|term> op: <'[+-]'> right: <multiplication|term>}
          rule multiplication: { left: <multiplication|term>  op: <'[*/]'> right: <term> }
          rule term: <INT"1"|parentheses>
          rule parentheses: (<'\\('>) <addition|multiplication|term> (<'\\)'>)
        end recurse
        '(100-5*(2+3*4)+2)/2' -> recurse -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{left={left={left=100\"1\", op=-, right={left=5\"1\", op=*, right={left=2\"1\", op=+, right={left=3\"1\", op=*, right=4\"1\"}}}}, op=+, right=2\"1\"}, op=/, right=2\"1\"}",
        output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void complexLeftRecursedRule() throws IOException {
    String program = """
        data binaryExpression <{left: <binaryExpression|"1">, op: <>, right: <binaryExpression|"1">}>
        
        composer sentence
          [<s>]
          rule s: <spp|npvp>
          rule npvp: <np> <vp>
          rule spp: <s> <pp>
          rule np: <nppp|noun|detnoun>
          rule detnoun: <det> <noun>
          rule nppp: <np> <pp>
          rule pp: <prep> <np>
          rule vp: <verb> <np>
          rule det: det:<='a'|='t'>
          rule noun: noun:<='i'|='m'|='p'|='b'>
          rule verb: verb:<='s'>
          rule prep: prep:<='n'|='w'>
        end sentence
        'isamntpwab' -> sentence -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[noun=i, verb=s, det=a, noun=m, prep=n, det=t, noun=p, prep=w, det=a, noun=b]",
        output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void converter() throws IOException {
    String program =
        """
            templates parity<?($ mod 2 <=1>)> 'odd' ! <> 'even' !
            end parity
            composer number
            <INT> -> parity
            end number
            ['1', '56', '524', '43']... -> number -> '$; ' -> !OUT::write""";
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
        """
            templates parity <?($ mod 2 <=1>)> 'odd' ! <> 'even' !
            end parity
            composer number
            <mynum> -> parity
            rule mynum: <INT>
            end number
            ['1', '56', '524', '43']... -> number -> '$; ' -> !OUT::write""";
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
        """
            templates mul $(1) * $(2) !
            end mul
            composer numbers
            [ <INT> (<WS>) <INT> ] -> mul
            end numbers
            '5 7' -> numbers -> !OUT::write""";
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
        """
            templates mul $.a::raw * $.b::raw !
            end mul
            composer numbers
            { a:<INT> (<WS>), b:<INT> } -> mul
            end numbers
            '5 7' -> numbers -> !OUT::write""";
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
        """
            composer options
            <value>
            rule value: (<WS>?) <INT|'x[0-9a-f]'|array> (<WS>?)
            rule array: (<'\\('>) [ <value>* ] (<'\\)'>)
            end options
            ['76', '( xb x5 45 (6))', 'x9']... -> options -> '$; ' -> !OUT::write""";
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
        """
            composer number
            <'-?(0|[1-9][0-9]*)(\\.[0-9]+)?((e|E)(\\+|-)?[0-9]+)?'>
            end number
            ['10', '-5', '-7.3', '10e-7', '0.15e6']... -> number -> '$; ' -> !OUT::write""";
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
        """
            composer string
            (<'"'>) <chars> -> '$...;'  (<'"'>)
            rule chars: [ <'(\\\\"|[^"])'>* -> \\(<'\\\\"'> '"' ! <> $ !\\) ]end string
            '"foo\\"bar"' -> string -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("foo\"bar", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composeStructureKey() throws IOException {
    String program = """
        composer keyValue
        { <~WS>: (<WS>) <~WS> }
        end keyValue
        'foo bar' -> keyValue -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{foo=bar}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void keyValueSubRule() throws IOException {
    String program = """
        composer struct
        { <keyValue>* }
        rule keyValue: <~WS>: (<WS>) <~WS> (<WS>?)
        end struct
        'foo bar baz qux' -> struct -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{baz=qux, foo=bar}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void keyValueSubRuleFollowedBySkip() throws IOException {
    String program = """
        composer struct
        { <keyValue> (<='foo'>) }
        rule keyValue: <~WS>: (<WS>) <INT>
        end struct
        'x 5foo' -> struct -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=5}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composedKeyWithLiteralValue() throws IOException {
    String program = """
        composer struct
        { <keyValue>* }
        rule keyValue: <~WS>: 1 (<WS>?)
        end struct
        'foo bar baz qux' -> struct -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{bar=1, baz=1, foo=1, qux=1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void emptyStructure() throws IOException {
    String program = """
        composer struct
        { <keyValue>* }
        rule keyValue: <~WS>: (<WS>) <~WS>
        end struct
        '' -> struct -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void subRuleFollowingKeyValueSubRule() throws IOException {
    String program = """
        composer struct
        <main>
        rule keyValue: <~WS>: (<WS>) <~WS> (<WS>?)
        rule main: { <keyValue>* }
        end struct
        'foo bar baz qux' -> struct -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{baz=qux, foo=bar}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void voidResult() throws IOException {
    String program = """
        composer maybeA
        <a|not>
        rule a: <'[aA]'>
        rule not: (<'.'>)
        end maybeA
        ['a', 'b', 'c', 'A']... -> maybeA -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("aA", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void invertOptions() throws IOException {
    String program = """
        composer foo
        <~'0'|'1'> <'0'|'1'>
        end foo
        ['551' -> foo, '550' -> foo] -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[55, 1, 55, 0]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void matchCapturedValue() throws IOException {
    String program = """
        composer bounds
        (def bound: <'.'>;) <~'$bound;'> (<'$bound;'>)
        end bounds
        '/word/' -> bounds -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("word", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void parameters() throws IOException {
    String program = """
        composer split&{separator:}
        [ <token>* ]
        rule token: <~sep> (<sep>?)
        rule sep: <'$separator;'>
        end split
        'ab;cd;e' -> split&{separator:';'} -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[ab, cd, e]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void recaptureValue() throws IOException {
    String program = """
        composer bounds
        [<bounded>*]rule bounded: (def bound: <'.'>;) <~'$bound;'> (<'$bound;'>)
        end bounds
        '/word/;other;' -> bounds -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[word, other]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void recaptureValueArray() throws IOException {
    String program = """
        composer bounds
        [<bounded>*]rule bounded: [(def bound: <'.'>;) <~'$bound;'> (<'$bound;'>)]
        end bounds
        '/word/;other;' -> bounds -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[word], [other]]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void captureValueArrayInSequenceScope() throws IOException {
    String program = """
        composer foo
        <bar>rule bar: [(def bound: <'.'>;) <~'$bound;'>] (<'$bound;'>)
        end foo
        '/word/' -> foo -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[word]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void recaptureValueStructure() throws IOException {
    String program = """
        composer bounds
        [<bounded>*]rule bounded: { (def bound: <'.'>;) a:<~'$bound;'> (<'$bound;'>)}
        end bounds
        '/word/' -> bounds -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{a=word}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void recaptureValueKeyValue() throws IOException {
    String program = """
        composer bounds
        [<bounded>*]rule bounded: a: (def bound: <'.'>;) <~'$bound;'> (<'$bound;'>)
        end bounds
        '/word/' -> bounds -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[a=word]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void simpleState() throws IOException {
    String program = """
        composer state
        @: 0;
        { word: <hello>, flag: $@ }
        rule hello: <'.*'>
        end state
        'hello' -> state -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{flag=0, word=hello}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void setStateInRule() throws IOException {
    String program = """
        composer state
        @: 0;
        { word: <hello>, flag: $@ }
        rule hello: (@: 1;) <'.*'>
        end state
        'hello' -> state -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{flag=1, word=hello}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void setStateFromMatch() throws IOException {
    String program = """
        composer state
        <hello> $@
        rule hello: ({word: <'.*'>} -> @:$;)
        end state
        'hello' -> state -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{word=hello}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void backtrack() throws IOException {
    String program = """
        composer bt
          <='a'|='aa'> <='ab'|='bc'>
        end bt

        'aabc' -> bt -> '$;
        ' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("aa\nbc\n", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void backtrackOneLessRepetitions() throws IOException {
    String program = """
        composer bt
          <='a'>+ <='abc'>
        end bt

        'aabc' -> bt -> '$;
        ' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a\nabc\n", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void backtrackRechooseLastRepetitions() throws IOException {
    String program = """
        composer bt
          <='ab'|='a'>+ <='bc'>
        end bt

        'aabc' -> bt -> '$;
        ' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a\na\nbc\n", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void backtrackState() throws IOException {
    String program = """
        composer bt
          @:1;  <foo|='a'>+ $@ <='bc'>
          rule foo: <='ab'> (@:2;)
        end bt

        'aabc' -> bt -> '$;
        ' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a\na\n1\nbc\n", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void backtrackAppendedState() throws IOException {
    String program = """
        composer bt
          @:[1];  <foo|='a'>+ $@ <='bc'>
          rule foo: <='ab'> (..|@:2;)
        end bt

        'aabc' -> bt -> '$;
        ' -> !OUT::write""";
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
    String program = """
        composer bt
          @:[1..3 -> 0];  (<a|b>) $@  rule a: (<INT> -> @($): 1; <='a'>)
          rule b: (<INT> -> @(1): $; <='b'>)
        end bt

        '2b' -> bt -> !OUT::write""";
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
    String program = """
        composer bt
          <foo> $@
          rule foo: <='ab'> (@:2;)
        end bt

        'ab' -> bt -> '$;
        ' -> !OUT::write""";
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
        """
            def digits: [(M:1000"1"), (CM:900"1"), (D:500"1"), (CD:400"1"), (C:100"1"), (XC:90"1"), (L:50"1"), (XL:40"1"), (X:10"1"), (IX:9"1"), (V:5"1"), (IV:4"1"), (I:1"1")];
            composer decodeRoman
              @: 1;
              [ <digit>* ] -> \\(@: 0"1"; $... -> @: $@ + $; $@ !\\)
              rule digit: <value>* (@: $@ + 1;)
              rule value: <'$digits($@)::key;'> -> $digits($@)::value
            end decodeRoman

            'MMVIII' -> decodeRoman -> !OUT::write
            """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("2008\"1\"", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void positiveLookbehind() throws IOException {
    String program = """
        composer foo
          [<tar|not>*]  rule tar: <'(?<=s)tar'>
          rule not: <~tar>
        end foo

        'startare' -> foo -> '$;' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[s, tar, tare]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void negativeLookbehind() throws IOException {
    String program = """
        composer foo
          [<tar|not>*]  rule tar: <'(?<!s)tar'>
          rule not: <~tar>
        end foo

        'startare' -> foo -> '$;' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[star, tar, e]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void noAnchorInTheMiddle() throws IOException {
    String program = """
        composer foo
          <bad|good>
          rule bad: (<='s'>) <'^tar'>  rule good: <'.*'>
        end foo

        'star' -> foo -> '$;' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("star", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void anchorAtStart() throws IOException {
    String program = """
        composer foo
          <good|bad>
          rule good: (<'^s'>) <='tar'>  rule bad: <'.*'>
        end foo

        'star' -> foo -> '$;' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("tar", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arithmeticOperationIsHeldTogetherAsTransform() throws IOException {
    String program = """
        composer foo
          (<'[a-z]'> -> $::asCodePoints -> $(1) - 96 -> @: $;) $@
        end foo

        'a' -> foo -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeLiteralIsHeldTogetherAsTransform() throws IOException {
    String program = """
        def start: 96;
        composer foo
          <INT> -> $start..$
        end foo

        '98' -> foo -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("969798", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void collector() throws IOException {
    String program = """
        composer letters
          <letter|not>+ -> ..=Count\s
          rule letter: <'[a-z]'>
          rule not: (<'.'>)
        end letters

        'a1bc2d' -> letters -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("4", output.toString(StandardCharsets.UTF_8));
  }
}
