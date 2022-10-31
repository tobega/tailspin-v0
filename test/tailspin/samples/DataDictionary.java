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
  void noImplicitDefinitionInCondition() throws IOException {
    String program = """
    data coord <?($ <{x: <1..5>}>)>
    {x: 6} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=6}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void conditionApplies() throws IOException {
    String program = """
    data coord <?($ <{x: <1..5>}>)>
    {coord: {x: 6}} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
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
    {x: finger´3} -> !OUT::write
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
  void localImplicitlyDefinedTermWrongValue() throws IOException {
    String program = """
    data x <0..>
    templates foo
      data coord <{x: <1..5>}> local
      {x: $} !
    end foo
    6 -> foo -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void localImplicitlyDefinedTermCorrectValue() throws IOException {
    String program = """
    data x <0..>
    templates foo
      data coord <{x: <1..5>}> local
      {x: $} !
    end foo
    3 -> foo -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void localImplicitNonOverridingDefinition() throws IOException {
    String program = """
    data x <1..5>
    templates foo
      data coord <{x: <x>}> local
      {x: $} !
    end foo
    6 -> foo -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
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
  void localProcessorTypeAppliesInProcessorTemplates() throws IOException {
    String program = """
    processor Foo
      data x local
      {x: $} -> !OUT::write
      sink bar
        {x: $} -> !OUT::write
      end bar
    end Foo
    def foo: 'apple' -> Foo;
    {x: 3} -> !OUT::write
    'banana' -> !foo::bar
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=apple}{x=3}{x=banana}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void localDefinedProcessorTypeAppliesInProcessorTemplates() throws IOException {
    String program = """
    processor Foo
      data x <'apple'|'banana'> local
      sink bar
        {x: $} -> !OUT::write
      end bar
    end Foo
    def foo: 'apple' -> Foo;
    'banana' -> !foo::bar
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=banana}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void localDefinedProcessorTypeAppliesInProcessorTemplatesStereotypeMatch() throws IOException {
    String program = """
    processor Foo
      data x <'apple'|'banana'> local
      $ -> \\(when <x> do $! \\) -> {x: $} -> !OUT::write
      sink bar
        when <x> do {x: $} -> !OUT::write
      end bar
    end Foo
    def foo: 'apple' -> Foo;
    'banana' -> !foo::bar
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=apple}{x=banana}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void localDefinedProcessorTypeDependsOnParameter() throws IOException {
    String program = """
    processor Foo&{high:}
      data x <1..$high> local
      sink bar
        when <x> do $ -> !OUT::write
      end bar
    end Foo
    def foo: $Foo&{high: 2};
    0..4 -> !foo::bar
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("12", output.toString(StandardCharsets.UTF_8));
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

  @Test
  void sumTypeAutotypesAsSelf() throws IOException {
    String program = """
    data foo <1..5>
    data x <1..5 | foo>
    {x: 3} -> {foo: $.x} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void sumTypeAutotypesRawAsSelfIfPossible() throws IOException {
    String program = """
    data foo <1..5>
    data x <foo | 1..5>
    {x: 3} -> $.x -> \\(<=x´3> $!\\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void sumTypeDoesNotAutotypeRawIfNoSelf() throws IOException {
    String program = """
    data foo <1..5>
    data x <foo>
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () ->runner.run(input, output, List.of()));
  }

  @Test
  void typeTestOfTaggedRangeOnOtherTagWorks() throws IOException {
    String program = """
    data foo <1..5>
    bar´4 -> \\(<foo> $! <> 'ok'!\\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void typeTestOfEnumOnOtherTagWorks() throws IOException {
    String program = """
    data flag <=1>
    bar´4 -> \\(<flag> $! <> 'ok'!\\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void typeTestOfTaggedAliasOnOtherTagCanMatch() throws IOException {
    String program = """
    data foo <..> // Any numeric type
    data bar <foo>
    qaz´4 -> \\(<bar> 'ok'! <> $!\\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void typeTestOfTaggedAliasOnOtherTagCanNotMatch() throws IOException {
    String program = """
    data foo <1..> // A positive number tagged as foo
    data bar <foo>
    qaz´4 -> \\(<bar> $! <> 'ok'!\\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void testEqualsBasicValueInUnionWorks() throws IOException {
    String program = """
    data foo <..>
    data bar <foo|'.'>
    foo´5 -> \\(<=bar´'.'> 'no way'! <> 'ok'!\\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void testRawValueOnlyValidAsTaggedThrows() throws IOException {
    String program = """
    data type <='E'|='G'>
    data content <type|='.'>
    {content: 'E'} -> \\(<{content: <='E'>}> 'no way'! <> 'nah'!\\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void testTaggedValueWithCorrectTag() throws IOException {
    String program = """
    data type <='E'|='G'>
    data content <type|='.'>
    {content: type´'E'} -> \\(<{content: <=type´'E'>}> 'ok'! <> 'nope'!\\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void tagContextIsImplicitTypeMatch() throws IOException {
    String program = """
    data type <='E'|='G'>
    data content <type|='.'>
    {content: '.'} -> \\(<{content: <=type´'E'>}> 'no way'! <> 'ok'!\\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }
}
