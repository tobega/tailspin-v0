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
    {x: [3, 2]} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=[apple]}{x=[3, 2]}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void autotypedArrayIsNotTagged() throws IOException {
    String program = """
    {x: ['apple'], y: ['banana']} ->
    {x: $.y} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=[banana]}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void definedSourceArrayIsNotTagged() throws IOException {
    String program = """
    data y <[]>
    {x: ['apple'], y: ['banana']} ->
    {x: $.y} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=[banana]}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void definedDestinationArrayIsNotTagged() throws IOException {
    String program = """
    data x <[]>
    {x: ['apple'], y: ['banana']} ->
    {x: $.y} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=[banana]}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void autotypedArrayTermConflict() throws IOException {
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
  void autotypedStructureTermCorrectValue() throws IOException {
    String program = """
    {x: {fruit: 'apple'}} -> !OUT::write
    {x: {days: 2}} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x={fruit=apple}}{x={days=2}}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void autotypedStructureIsNotTagged() throws IOException {
    String program = """
    {x: {fruit: 'apple'}, y: {fruit: 'banana'} } ->
    {x: $.y} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x={fruit=banana}}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void definedSourceStructureIsNotTagged() throws IOException {
    String program = """
    data y <{fruit: <>}>
    {x: {fruit: 'apple'}, y: {fruit: 'banana'} } ->
    {x: $.y} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x={fruit=banana}}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void definedDestinationStructureIsNotTagged() throws IOException {
    String program = """
    data x <{fruit: <>}>
    {x: {fruit: 'apple'}, y: {fruit: 'banana'} } ->
    {x: $.y} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x={fruit=banana}}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void autotypedStructureTermConflict() throws IOException {
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
  void taggedStringSameNameWorks() throws Exception {
    String program = "{name: 'John', city: 'London'} -> { name: $.name } -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{name=John}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void taggedStringOtherNameFails() {
    String program = "{name: 'John', city: 'London'} -> { name: $.city } -> !OUT::write";
    assertThrows(Exception.class, () -> {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    });
  }

  @Test
  void definedStringSameNameWorks() throws Exception {
    String program = "data name <'.*'> {name: 'John', city: 'London'} -> { name: $.name } -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{name=John}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void definedStringAsOtherNameFails() {
    String program = "data city <'.*'> {name: 'John', city: 'London'} -> { name: $.city } -> !OUT::write";
    assertThrows(Exception.class, () -> {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    });
  }

  @Test
  void definedStringFromOtherNameFails() {
    String program = "data city <'.*'> {name: 'John', city: 'London'} -> { city: $.name } -> !OUT::write";
    assertThrows(Exception.class, () -> {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    });
  }

  @Test
  void sourceDefinedAsSameTagWorks() throws Exception {
    String program = """
    data name <'.*'>
    data city <name>
    {name: 'John', city: 'London'} -> { name: $.city } -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{name=London}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void destinationDefinedAsSameTagWorks() throws Exception {
    String program = """
    data city <'.*'>
    data name <city>
    {name: 'John', city: 'London'} -> { name: $.city } -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{name=London}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void taggedNumberSameNameWorks() throws Exception {
    String program = "{id: 1234, city: 'London'} -> { id: $.id } -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{id=1234}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void taggedNumberOtherNameFails() {
    String program = "{id: 1234, city_id: 3456} -> { id: $.city_id } -> !OUT::write";
    assertThrows(Exception.class, () -> {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    });
  }

  @Test
  void definedNumberSameNameWorks() throws Exception {
    String program = "data id <1000..9999> {id: 1234, city: 'London'} -> { id: $.id } -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{id=1234}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void definedNumberAsOtherNameFails() {
    String program = "data id <1000..9999> {id: 1234, city_id: 3456} -> { city_id: $.id } -> !OUT::write";
    assertThrows(Exception.class, () -> {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    });
  }

  @Test
  void definedNumberFromOtherNameFails() {
    String program = "data id <1000..9999> {id: 1234, city_id: 3456} -> { id: $.city_id } -> !OUT::write";
    assertThrows(Exception.class, () -> {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    });
  }

  @Test
  void taggedNumberCanIndexArray() throws Exception {
    String program = """
    def a: {n: 2};
    [5,6,7] -> $($a.n) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("6", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void composedStructureIsAutotypedToNonArithmeticTaggedIdentifier() throws IOException {
    String program = """
    composer foo
      { x: <INT> }
    end foo
    '1' -> foo -> $.x + 3 -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(UnsupportedOperationException.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void collectedRelationStructureIsAutotypedToNonArithmeticTaggedIdentifier() throws IOException {
    String program = """
    processor Five
      sink accumulate
        !VOID
      end accumulate
      source result
        5!
      end result
    end Five
    {|{}|} -> $(collect {x: Five} by $) ... -> $.x + 3 -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(UnsupportedOperationException.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void collectedArrayStructureIsAutotypedToNonArithmeticTaggedIdentifier() throws IOException {
    String program = """
    processor Five
      sink accumulate
        !VOID
      end accumulate
      source result
        5!
      end result
    end Five
    [{}] -> $(collect {x: Five} by $) ... -> $.x + 3 -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(UnsupportedOperationException.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void comparingEqualityForNumbersWithDifferentTagsIsError() throws IOException {
    String program = """
    {dep: 2, step: 2} -> \\(<{dep: <=$.step>}> $ ! \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void comparingEqualityForNumbersWithDifferentTagsIsError_alsoForDefinedTag() throws IOException {
    String program = """
    data dep <0..5>
    {dep: 2, step: 2} -> \\(<{dep: <=$.step>}> $ ! \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void comparingEqualityForNumbersWithSameTagsWorks() throws IOException {
    String program = """
    {step: 2} -> {dep: $.step, step: 1} ->  \\(<{dep: <~=$.step>}> $ ! \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{dep=2, step=1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void comparingEqualityForStringsWithDifferentTagsIsError() throws IOException {
    String program = """
    {dep: 'A', step: 'A'} -> \\(<{dep: <=$.step>}> $ ! \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void comparingEqualityForStringsWithDifferentTagsIsError_alsoForDefinedTags() throws IOException {
    String program = """
    data dep <'A'..'F'>
    {dep: 'A', step: 'A'} -> \\(<{dep: <=$.step>}> $ ! \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void comparingEqualityForStringsWithSameTagsWorks() throws IOException {
    String program = """
    {step: 'A'} -> {dep: $.step, step: 'B'} ->  \\(<{dep: <~=$.step>}> $ ! \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{dep=A, step=B}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void comparingMeasureEqualToTagIsError() throws IOException {
    String program = """
    {dep: 2"m", step: 2} -> \\(<{dep: <=$.step>}> $ ! \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void comparingTagEqualToMeasureIsError() throws IOException {
    String program = """
    {dep: 2, step: 2"m"} -> \\(<{dep: <=$.step>}> $ ! \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void comparingRangeForNumbersWithDifferentTagsIsError() throws IOException {
    String program = """
    def low: {step: 1};
    def high: {step: 3};
    {dep: 2} -> \\(<{dep: <$low.step..$high.step>}> $ ! \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void comparingRangeForNumbersWithSameTagsWorks() throws IOException {
    String program = """
    def low: {step: 1};
    def high: {step: 3};
    {step: 2} -> {dep: $.step} -> \\(<{dep: <$low.step..$high.step>}> $ ! \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{dep=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void comparingMeasureToTagRangeIsError() throws IOException {
    String program = """
    def low: {step: 1};
    def high: {step: 3};
    {dep: 2"m"} -> \\(<{dep: <$low.step..$high.step>}> $ ! \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void comparingTagToMeasureRangeIsError() throws IOException {
    String program = """
    def low: {step: 1"m"};
    def high: {step: 3"m"};
    {dep: 2} -> \\(<{dep: <$low.step..$high.step>}> $ ! \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void taggedStringRegexMatch() throws Exception {
    String program = """
    {city: 'London'} -> \\(
      <{city: <'L.*'>}> 'yes'!
      <> 'no'!
    \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void taggedStringEqualsRawString() throws Exception {
    String program = """
    {city: 'London'} -> \\(
      <{city: <='London'>}> 'yes'!
      <> 'no'!
    \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void taggedStringInRawStringRange() throws Exception {
    String program = """
    {city: 'London'} -> \\(
      <{city: <'K'..'M'>}> 'yes'!
      <> 'no'!
    \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void taggedNumberEqualsUntyped() throws Exception {
    String program = """
    {city: 5} -> \\(
      <{city: <=5>}> 'yes'!
      <> 'no'!
    \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void taggedNumberInUntypedRange() throws Exception {
    String program = """
    {city: 5} -> \\(
      <{city: <2..6>}> 'yes'!
      <> 'no'!
    \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }
}
