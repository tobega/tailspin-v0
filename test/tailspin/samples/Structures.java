package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Structures {
  @Test
  void literal() throws IOException {
    String program = "{ a: 0, b: 1 } -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a: 0, b: 1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void fieldDerefence() throws IOException {
    String program = "{ a: 0, b: 1 } -> \\($.a ! $.b !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("01", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void fieldProjection() throws IOException {
    String program = "{ a: 0, b: 1 } -> \\($(a:) ! $(b:) !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("01", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dimensionalFieldProjection() throws IOException {
    String program = "[{values: [1,2]}, {values: [3,4]}] -> $(2; values:; 1) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void literalTransform() throws IOException {
    String program = "1 -> { a: $ - 1, b: $ } -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a: 0, b: 1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void fieldDerefenceTransform() throws IOException {
    String program = "{ a: 5, b: 1 } -> $.a -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void fieldArrayDerefenceTransform() throws IOException {
    String program = "{ a: [1,5,8] } -> $.a(2) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void restructureDereference() throws IOException {
    String program = "def anA: { a: 1 };\n {$anA..., b:2} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a: 1, b: 2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void restructureStreamDereference() throws IOException {
    String program = "def anA: { a: 1 };\n {$anA..., 1..2 -> \\(<=2>{b:2} ! <>{c:3} !\\)...} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a: 1, b: 2, c: 3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void restructureLiteral() throws IOException {
    String program = "{b:2} -> {a: 1, $...} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a: 1, b: 2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void overrideDefaultValues() throws IOException {
    String program = "{b:2} -> {b: 1, $...} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{b: 2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void overrideItValues() throws IOException {
    String program = "{b:2} -> {$..., b: 1} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{b: 1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void reconstructPrefersValueChainToDereference() throws IOException {
    String program = "[{b:2}] -> {$(1)..., b: 1} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{b: 1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deconstruct() throws IOException {
    String program = "{ a: 1, b: 2 }... -> '$;\n' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a: 1\nb: 2\n", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void restructureKeyedValues() throws IOException {
    String program = "{ a: 1, b: 2 } -> {$...} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a: 1, b: 2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void valueProductionViaTemplates() throws Exception {
    String program = "3 -> \\({ a: 1..$ -> # } ! <=2> $!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a: 2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void keyedValueProductionViaSendToMatchers() throws Exception {
    String program = "3 -> \\({ 1..$ -> # } ! <> (last: $)!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{last: 3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void freeKeyedValue() throws IOException {
    String program = "(a: 1) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a: 1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void freeKeyedValueRestructure() throws IOException {
    String program = "(a: 1) -> {$} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a: 1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void freeKeyedValueFromChain() throws IOException {
    String program = "(a: 1 -> \\(<=1> 'yes'!\\)) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a: yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void keywordAsKey() throws IOException {
    String program = "{mod: 1} -> $.mod -> \\(<=mod´ 1> 'yes'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void partsOfKeyedValue() throws IOException {
    String program = "(a: 1) -> '\"$::key;--$::value;\"' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("\"a--1\"", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void keyValueHashCodeEquals() throws IOException {
    String program = "def hc: (a: 1) -> $::hashCode; (a: 1) -> $::hashCode - $hc -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("0", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureHashCodeEquals() throws IOException {
    String program = "def hc: {a: 1, b:5} -> $::hashCode; {a: 1, b:5} -> $::hashCode - $hc -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("0", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void projection() throws IOException {
    String program = "{a: 1\"1\", b:5\"1\"} -> $({a:, b:, d: §.a+§.b}) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a: 1\"1\", b: 5\"1\", d: 6\"1\"}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void expansion() throws IOException {
    String program = "{a: 1, by 3..5 -> (b: $), c:2} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a: 1, b: 3, c: 2}{a: 1, b: 4, c: 2}{a: 1, b: 5, c: 2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void doubleExpansion() throws IOException {
    String program = "{a: 1, by 4..5 -> (b: $), by 1..2 -> (c:$)} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a: 1, b: 4, c: 1}{a: 1, b: 5, c: 1}{a: 1, b: 4, c: 2}{a: 1, b: 5, c: 2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void expansionByStructure() throws IOException {
    String program = "{a: 1, by 4..5 -> {b: $, c:$-3}} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a: 1, b: 4, c: 1}{a: 1, b: 5, c: 2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void nestedExpansion() throws IOException {
    String program = "{a: 1, by {by 4..5 -> (b: $), by 1..2 -> (c:$)}} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a: 1, b: 4, c: 1}{a: 1, b: 5, c: 1}{a: 1, b: 4, c: 2}{a: 1, b: 5, c: 2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void literalFromStructureValue() throws IOException {
    String program = "def foo: {b: 4, c: 5}; {a: 1, $foo} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a: 1, b: 4, c: 5}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureHasRawMessage() throws Exception {
    String program =
        "{a: 1} -> $::raw -> !OUT::write\n";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a: 1}", output.toString(StandardCharsets.UTF_8));
  }
}
