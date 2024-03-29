package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Strings {

  @Test
  void apostrophe() throws Exception {
    String program = "'" + "What''s up" + "' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("What's up", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void moreApostrophes() throws Exception {
    String program = "'" + "What''''s up" + "' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("What''s up", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void multilineString() throws Exception {
    String program = "'Hello\nWorld'  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello\nWorld", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateWholeString() throws Exception {
    String program = "def helloWorld: 'Hello World!';\n" + "'$helloWorld;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolatePartialString() throws Exception {
    String program = "def world: 'World!';\n" + "'Hello $world;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolatePartialStringFirst() throws Exception {
    String program = "def hello: 'Hello';\n" + "'$hello; World!' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateNoSuchVariable() throws Exception {
    String program = "def hello: 'Hello ';\n" + "'$helloWorld;!' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    // TODO: this should give a better error message about symbol not found, perhaps already in
    // parse stage
    try {
      runner.run(input, output, List.of());
      fail();
    } catch (Exception expected) {
    }
  }

  @Test
  void interpolateRunningIntoText() throws Exception {
    String program = "def hello: 'Hello ';\n" + "'$hello;World!' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dollar() throws Exception {
    String program = "'" + "$$hello is a dereferencing" + "' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("$hello is a dereferencing", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void moreDollars() throws Exception {
    String program = "'" + "$$$$$$signs" + "' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("$$$signs", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void semiColons() throws Exception {
    String program = "def two: '2';\n" + "'one;$two;;three;;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("one;2;three;;", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateNumericValue() throws IOException {
    String program = "33 -> '1$;7' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1337", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateExpression() throws Exception {
    String program = "1 -> '$-> $-1;, $;, $->2;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("0, 1, 2", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateTemplates() throws Exception {
    String program = "templates foo <=1> 'one' ! end foo\n" + "1 -> '$->foo; $; $->foo;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("one 1 one", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateTemplatesWithNoMatch() throws Exception {
    String program = "templates foo <=2> 'two'! end foo\n" + "1 -> '$->foo; $; $->foo;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals(" 1 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateTemplatesWithNoResult() throws Exception {
    String program =
        "templates foo <=1> 'one' -> !OUT::write end foo\n" + "1 -> '$->foo; $; $->foo;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("oneone 1 ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void throwOnDereferenceTemplates() throws Exception {
    String program =
        "templates foo <=1> 'one' -> !OUT::write end foo\n" + "1 -> '$foo;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void interpolateTemplatesChain() throws Exception {
    String program = "3 -> '$ -> $ - 1 -> ($ - 2);' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("0", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void valueChainInterpolation() throws Exception {
    String program = "1..3 -> \\(<> 'hi'!\\) -> '$;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("hihihi", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void doubleDereferenceInterpolation() throws Exception {
    String program = "1..3 -> '$;$;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("112233", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateStructureField() throws Exception {
    String program = "{a: 'hi'} -> '$.a;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("hi", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateBytes() throws Exception {
    String program = "[x 75f3 x] -> '$;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("75f3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateArrayElement() throws Exception {
    String program = "['yo', 'hi'] -> '$(2);' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("hi", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateArrayRange() throws Exception {
    String program = "['yo', 'hi', 'ho'] -> '$(2..3);' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[hi, ho]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateStructureArrayElement() throws Exception {
    String program = "{a:['yo', 'hi']} -> '$.a(2);' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("hi", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateMessage() throws Exception {
    String program = "['yo', 'hi', 'ho'] -> '$::length;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateSendToMatchers() throws Exception {
    String program = "templates foo '$ -> #;' ! <=1> 'one' ! <=2> 'two' ! end foo\n" + "1..3 -> foo -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("onetwo", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void lexerMunchParentheses() throws Exception {
    String program = "'(2)' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("(2)", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void lexerMunchIdentifier() throws Exception {
    String program = "'hi' -> '$; and so much more' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("hi and so much more", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void restructureString() throws Exception {
    String program = "'$:1..3;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("123", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deconstructString() throws Exception {
    String program = "'abc'... -> \\(<'c'> 3 ! <'a'> 1 ! <> 2 !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("123", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deconstructZeroWidthJoiner() throws Exception {
    String program =
        "['\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC66'...] -> $::length -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deconstructStringEachTransformInTurn() throws Exception {
    String program = "'abc'... -> \\($ -> !OUT::write\n$!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("abcabc", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void multiDeconstructStringEachTransformInTurn() throws Exception {
    String program = "['abc', 'def', 'ghi']... -> $... -> \\($ -> !OUT::write\n$!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("abcdefghiabcdefghi", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void keepCombiningMarksOnCharacter() throws Exception {
    String program =
        """
            templates reverse
              '$ -> [ $... ] -> $(last..first:-1)...;' !
            end reverse
            'as⃝df̅' -> reverse -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("f̅ds⃝a", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void characterCodes() throws Exception {
    String program = "'$#9;$#10;$#13;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("\t\n\r", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void characterCodeExpression() throws Exception {
    String program = "def tab: 9; '$#$tab;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("\t", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateState() throws Exception {
    String program =
        """
            templates foo
              @: 5; '$@;'!
            end foo
            1 -> foo -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolateNamedState() throws Exception {
    String program =
        """
            templates foo
              @: 5; '$@foo;'!
            end foo
            1 -> foo -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void hashCodeEquals() throws IOException {
    String program = "def hc: 'hey man!' -> $::hashCode; 'hey man!' -> $::hashCode - $hc -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("0", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void codePoints() throws IOException {
    String program = "'aAåÅ' -> $::asCodePoints -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[97, 65, 229, 197]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void utf8Bytes() throws IOException {
    String program = "'Hallå' -> $::asUtf8Bytes -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("48616c6cc3a5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolate2dArray() throws IOException {
    String program = "def a: [[1,2,3],[4,5,6]]; '$a(2;2);' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void acceptsRawMessage() throws IOException {
    String program = "'abc' -> $::raw -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("abc", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void matchesStringType() throws IOException {
    String program = """
      ['abc', foo´ 'bar', 56, id´ 78, {name: 'JD'}, ['xyz'], 89"m"]... -> \\(<''> $! \\) -> !OUT::write
      """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("abcbar", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolationInProjection() throws IOException {
    String program = """
      [{greeting: 'Hello', name: 'Anna'}] -> $({phrase: '§.greeting; §.name;'}) -> !OUT::write
      """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{phrase: Hello Anna}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolationTemplate() throws IOException {
    String program = """
      def template: _'Hello §.name;';
      {name: 'Anna'} -> template -> !OUT::write
      """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello Anna", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolationTemplateStructure() throws IOException {
    String program = """
      def greeting: {en: _'Hello §.name;', fr: _'Salut §.name;'};
      {name: 'Anna'} -> greeting.fr -> !OUT::write
      """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Salut Anna", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolationTemplateArray() throws IOException {
    String program = """
      def greeting: [ _'Hello §.name;', _'Salut §.name;'];
      {name: 'Anna'} -> greeting(2) -> !OUT::write
      """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Salut Anna", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dollarIsImmediateInInterpolationTemplate() throws IOException {
    String program = """
      def template: 'Salut' -> _'$; §.name;';
      {name: 'Anna'} -> template -> !OUT::write
      """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Salut Anna", output.toString(StandardCharsets.UTF_8));
  }
}
