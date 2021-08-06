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

public class DataDictionary {
  @Test
  void definedTermWrongValue() throws IOException {
    String program = """
    data x <1..5>
    {x: 6} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void redefinedTermIsError() throws IOException {
    String program = """
    data x <1..5>
    data x <1..5>
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void definedTermCorrectValue() throws IOException {
    String program = """
    data x <1..5>
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void multipleDefinedTermsCorrectValue() throws IOException {
    String program = """
    data x <1..5>, y <6..8>
    {x: 3, y: 6} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=3, y=6}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void implicitlyDefinedTermWrongValue() throws IOException {
    String program = """
    data coord <{x: <1..5>}>
    {x: 6} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void implicitlyDefinedTermCorrectValue() throws IOException {
    String program = """
    data coord <{x: <1..5>}>
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void implicitlyRedefinedTermIsError() throws IOException {
    String program = """
    data x <1..5>
    data coord <{x: <1..5>}>
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void implicitlyRedefinedTermSelfReferenceIsCorrect() throws IOException {
    String program = """
    data x <1..5>
    data coord <{x: <x>}>
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void implicitlyDoublyDefinedTermIsError() throws IOException {
    String program = """
    data coord <{a: <{x: <1..5>}>, b: <{x: <1..5>}>}>
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void implicitlyDoublyDefinedTermSelfReferenceIsCorrect() throws IOException {
    String program = """
    data coord <{a: <{x: <1..5>}>, b: <{x: <x>}>}>
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void implicitSelfReferenceFirstInLexicalOrderIsCorrect() throws IOException {
    String program = """
    data coord <{a: <{x: <x>}>, b: <{x: <1..5>}>}>
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void implicitSelfReferenceOnAllForAutotypingIsCorrect() throws IOException {
    String program = """
    data coord <{a: <{x: <x>}>, b: <{x: <x>}>}>
    {coord: {a: {x: 3}, b: {x: 4}}} -> $.coord.a -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dataRunsBeforeDefinitions() throws IOException {
    String program = """
    data x <1..5>
    def foo: {x: 6};
    $foo -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void dataDefinitionsCanDependOnOtherDataDefinitions() throws IOException {
    String program = """
    data finger <1..5>
    data x <finger>
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void autotypedStringTermCorrectValue() throws IOException {
    String program = """
    {x: 'apple'} -> !OUT::write
    {x: 'banana'} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=apple}{x=banana}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void autotypedStringTermConflict() throws IOException {
    String program = """
    {x: 'apple'} -> !OUT::write
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void localInlineTransformTypeStaysLocal() throws IOException {
    String program = """
    'apple' -> \\(data x local {x: $} -> !OUT::write\\) -> !VOID
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=apple}{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void localInlineArrayTransformTypeStaysLocal() throws IOException {
    String program = """
    ['apple'] -> \\[i](data x local {x: $} -> !OUT::write\\) -> !VOID
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=apple}{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void localTransformTypeStaysLocal() throws IOException {
    String program = """
    templates foo
      data x local
      {x: $} -> !OUT::write
    end foo
    'apple' -> foo -> !VOID
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=apple}{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void localTypeCanBeDefined() throws IOException {
    String program = """
    data x <0..>
    templates foo
      data x <'.*'> local
      {x: $} -> !OUT::write
    end foo
    'apple' -> foo -> !VOID
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=apple}{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void localProcessorTypeStaysLocal() throws IOException {
    String program = """
    processor foo
      data x local
      {x: $} -> !OUT::write
    end foo
    'apple' -> foo -> !VOID
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=apple}{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void localComposerTypeStaysLocal() throws IOException {
    String program = """
    composer foo
      data x local
      (<'.*'> -> @: {x: $};) $@.x
    end foo
    'apple' -> foo -> !OUT::write
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("apple{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void localOperatorTypeStaysLocal() throws IOException {
    String program = """
    operator (a foo b)
      data x local
      {x: '$a;$b;'} -> !OUT::write
    end foo
    ('app' foo 'le') -> !VOID
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=apple}{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void settingStateChecksType() throws IOException {
    String program = """
    templates foo
      @: {x: 'apple'};
      @.x: 3;
      $@ !
    end foo
    1 -> foo -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void settingStateLensChecksType() throws IOException {
    String program = """
    templates foo
      @: {x: 'apple'};
      @(x:): 3;
      $@ !
    end foo
    1 -> foo -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void projectionChecksType() throws IOException {
    String program = """
    {x: 'apple'} -> $({x: 3}) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void autotypedArrayTermCorrectValue() throws IOException {
    String program = """
    {x: ['apple']} -> !OUT::write
    {x: ['banana', 'orange']} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=[apple]}{x=[banana, orange]}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void autotypedArrayWrongType() throws IOException {
    String program = """
    {x: ['apple']} -> !OUT::write
    {x: 'banana'} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void autotypedArrayWrongContentType() throws IOException {
    String program = """
    {x: ['apple']} -> !OUT::write
    {x: [2]} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void autotypedArrayMayNotHaveMixedContentType() throws IOException {
    String program = """
    {x: ['apple', 2]} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void autotypedStructureTermCorrectValue() throws IOException {
    String program = """
    {x: {fruit: 'apple'}} -> !OUT::write
    {x: {fruit: 'banana'}} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x={fruit=apple}}{x={fruit=banana}}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void autotypedStructureWrongType() throws IOException {
    String program = """
    {x: {fruit: 'apple'}} -> !OUT::write
    {x: 'banana'} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void autotypedStructureWrongExtraField() throws IOException {
    String program = """
    {x: {fruit: 'apple'}} -> !OUT::write
    {x: {fruit: 'banana', days: 2}} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void autotypedStructureWrongMissingField() throws IOException {
    String program = """
    {x: {fruit: 'banana', days: 2}} -> !OUT::write
    {x: {fruit: 'apple'}} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void autotypedStructureWrongContainedField() throws IOException {
    String program = """
    {x: {days: 2}} -> !OUT::write
    {x: {fruit: 'apple'}} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void autotypedStructureWrongTypeContainedField() throws IOException {
    String program = """
    {x: {fruit: 2}} -> !OUT::write
    {x: {fruit: 'apple'}} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void autotypedMeasureTermCorrectValue() throws IOException {
    String program = """
    {x: 1"s"} -> !OUT::write
    {x: 2"s"} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=1\"s\"}{x=2\"s\"}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void autotypedMeasureTermConflict() throws IOException {
    String program = """
    {x: 1"s"} -> !OUT::write
    {x: 'banana'} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void autotypedMeasureDoesNotMatchOtherMeasure() throws IOException {
    String program = """
    {x: 1"s"} -> !OUT::write
    {x: 2"m"} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void autotypedMeasureDoesNotMatchScalar() throws IOException {
    String program = """
    {x: 1"s"} -> !OUT::write
    {x: 2} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void composedStructureAutotypedCorrectValue() throws IOException {
    String program = """
    composer foo
      { x: <INT> }
    end foo
    '1' -> foo -> !OUT::write
    {x: 5} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=1}{x=5}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composedStructureAutotypedConflict() throws IOException {
    String program = """
    composer foo
      { x: <INT> }
    end foo
    '1' -> foo -> !OUT::write
    {x: 'apple'} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void collectedRelationStructureAutotypedCorrectValue() throws IOException {
    String program = """
    processor Five
      sink accumulate
        !VOID
      end accumulate
      source result
        5!
      end result
    end Five
    {|{}|} -> $(collect {x: Five} by $) ... -> !OUT::write
    {x: 1} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=5}{x=1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void collectedRelationStructureAutotypedConflict() throws IOException {
    String program = """
    processor Five
      sink accumulate
        !VOID
      end accumulate
      source result
        5!
      end result
    end Five
    {|{}|} -> $(collect {x: Five} by $) ... -> !OUT::write
    {x: 'apple'} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void collectedArrayStructureAutotypedConflict() throws IOException {
    String program = """
    processor Five
      sink accumulate
        !VOID
      end accumulate
      source result
        5!
      end result
    end Five
    [{}] -> $(collect {x: Five} by $) ... -> !OUT::write
    {x: 'apple'} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void collectedArrayStructureAutotypedCorrectValue() throws IOException {
    String program = """
    processor Five
      sink accumulate
        !VOID
      end accumulate
      source result
        5!
      end result
    end Five
    [{}] -> $(collect {x: Five} by $) ... -> !OUT::write
    {x: 1} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=5}{x=1}", output.toString(StandardCharsets.UTF_8));
  }
}
