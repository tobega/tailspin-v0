package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

public class TaggedIdentifier {

  @Test
  void taggedStringSameNameWorks() throws Exception {
    String program = "{id: 1234, city: 'London'} -> { city: $.city } -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{city=London}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void taggedStringOtherNameFails() {
    String program = "{id: 'abc', city: 'London'} -> { id: $.city } -> !OUT::write";
    assertThrows(Exception.class, () -> {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    });
  }

  @Test
  void taggedStringOtherNameCanBeAssignedRawValue() throws Exception {
    String program = "{id: 'abc', city: 'London'} -> { id: $.city::raw } -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{id=London}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dereferencedTaggedStringSameNameWorks() throws Exception {
    String program = "{id: 1234, city: 'London'} -> $.city -> { city: $ } -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{city=London}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dereferencedTaggedStringOtherNameFails() {
    String program = "{id: 'abc', city: 'London'} -> $.city -> { id: $ } -> !OUT::write";
    assertThrows(Exception.class, () -> {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    });
  }

  @Test
  void taggedStringAutotypedToOtherTag() throws Exception {
    String program = """
      {city: 'London'} -> { destination: $.city } -> !OUT::write
      {destination: 'Paris'} -> { city: $.destination } -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{destination=London}{city=Paris}", output.toString(StandardCharsets.UTF_8));
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
  void dereferencedTaggedNumberSameNameWorks() throws Exception {
    String program = "{id: 1234, city: 'London'} -> $.id -> { id: $ } -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{id=1234}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dereferencedTaggedNumberOtherNameFails() {
    String program = "{id: 1234, city_id: 3456} -> $.city_id -> { id: $ } -> !OUT::write";
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
  void autotypedFieldIsNonArithmeticTaggedIdentifier() throws IOException {
    String program = """
     {x: 1} -> $.x + 3 -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void definedFieldIsNonArithmeticTaggedIdentifier() throws IOException {
    String program = """
     data x <0..>
     {x: 1} -> $.x + 3 -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
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
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
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
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
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
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
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
  void comparingTagEqualToScalarIsError() throws IOException {
    String program = """
    {dep: 2} -> \\(<{dep: <=2"1">}> $ ! \\) -> !OUT::write
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
  void comparingScalarToTagRangeIsError() throws IOException {
    String program = """
    def low: {step: 1};
    def high: {step: 3};
    {dep: 2"1"} -> \\(<{dep: <$low.step..$high.step>}> $ ! \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void comparingTagToScalarRangeIsError() throws IOException {
    String program = """
    {dep: 2} -> \\(<{dep: <1"1"..3"1">}> $ ! \\) -> !OUT::write
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
  void taggedStringLosesTagInRegexMatch() throws Exception {
    String program = """
    {city: 'London', id: 'foo'} -> $.city -> \\(
      <'L.*'> {id: $}!
      <> 'no'!
    \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{id=London}", output.toString(StandardCharsets.UTF_8));
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
  void taggedStringHashCodeEqualsRawStringHashCode() throws Exception {
    String program = """
    def london: 'London' -> $::hashCode;
    {city: 'London'} -> $.city::hashCode -> \\(
      <=$london> 'yes'!
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
  void taggedNumberHashCodeEqualsUntypedHashCode() throws Exception {
    String program = """
    def five: 5 -> $::hashCode;
    {city: 5} -> $.city::hashCode -> \\(
      <=$five> 'yes'!
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

  @Test
  void taggedNumberLosesTagWhenEqualsUntyped() throws Exception {
    String program = """
    {city: 5, id: 8} -> $.city -> \\(
      <=5> {id: $} !
    \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{id=5}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void taggedNumberLosesTagWhenInUntypedRange() throws Exception {
    String program = """
    {city: 5, id: 8} -> $.city -> \\(
      <2..6> {id: $} !
    \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{id=5}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void untypedNumberGetsTagWhenEqualsTaggedNumber() throws Exception {
    String program = """
    def foo: {city: 5, id: 8};
    5 -> \\(
      <=$foo.city> {id: $} !
    \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void untypedNumberGetsTagWhenEqualsTaggedNumberSoSameNameWorks() throws Exception {
    String program = """
    def foo: {city: 5, id: 8};
    5 -> \\(
      <=$foo.city> {city: $} !
    \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{city=5}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void untypedNumberGetsTagWhenInTaggedRange() throws Exception {
    String program = """
    def low: {city: 2, id: 8};
    def high: {city: 6, id: 9};
    5 -> \\(
      <$low.city..$high.city> {id: $} !
    \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void untypedNumberGetsTagWhenInTaggedRangeSoSameNameWorks() throws Exception {
    String program = """
    def low: {city: 2, id: 8};
    def high: {city: 6, id: 9};
    5 -> \\(
      <$low.city..$high.city> {city: $} !
    \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{city=5}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeWithDifferentTagsIsError() throws Exception {
    String program = """
    def foo: {city: 2, id: 8};
    5 -> \\(
      <$foo.city..$foo.id> 'no' !
    \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void projection() throws IOException {
    String program = "{|{x: 'a', y: 2}, {x:'b', y: 3}, {x: 'a', y: 4}|} -> $({x:}) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    String result = output.toString(StandardCharsets.UTF_8);
    assertTrue(result.startsWith("{|"));
    assertTrue(result.endsWith("|}"));
    assertTrue(result.contains("{x=a}"));
    assertTrue(result.contains("{x=b}"));
    assertEquals(16, result.length());
  }

  @Test
  void autotypedArray() throws IOException {
    String program = """
      [{by 1..3 -> (d:$)} -> $.d] -> {ds: $} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{ds=[1, 2, 3]}", output.toString(StandardCharsets.UTF_8));
  }
}
