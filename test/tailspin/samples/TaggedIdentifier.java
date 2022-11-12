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
import tailspin.TypeError;

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
    assertThrows(TypeError.class, () -> {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    });
  }

  @Test
  void inlineTaggedStringSameNameWorks() throws Exception {
    String program = "{city: 'London'} -> { city: city´ 'Madrid' } -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{city=Madrid}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void inlineTaggedStringOtherNameFails() {
    String program = "{city: 'London'} -> { city: boy´ 'John' } -> !OUT::write";
    assertThrows(TypeError.class, () -> {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    });
  }

  @Test
  void inlineTaggedStringValid() throws Exception {
    String program = """
      data city <'[A-Z].*'>
      city´ 'Madrid' -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Madrid", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void inlineTaggedStringNotValidThrows() {
    String program = """
      data city <'[A-Z].*'>
      city´ 'madrid' -> !OUT::write
    """;
    assertThrows(TypeError.class, () -> {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    });
  }

  @Test
  void inlineTaggedStringIsAutotyped() {
    String program = """
      city´ 'madrid' -> {city: 123} -> !OUT::write
    """;
    assertThrows(TypeError.class, () -> {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    });
  }

  @Test
  void definedStringSameNameWorks() throws Exception {
    String program = "data city <'.*'> {id: 1234, city: 'London'} -> { city: $.city } -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{city=London}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void definedStringOtherNameFails() {
    String program = "data id <'.*'> {id: 'abc', city: 'London'} -> { id: $.city } -> !OUT::write";
    assertThrows(TypeError.class, () -> {
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
    assertThrows(TypeError.class, () -> {
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
      {destination: city´'Paris'} -> { city: $.destination } -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{destination=London}{city=Paris}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void tagDefinedToOtherTag() throws Exception {
    String program = """
      data city <'.*'>, destination <city>
      {city: 'London'} -> { destination: $.city } -> !OUT::write
      {destination: city´'Paris'} -> { city: $.destination } -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{destination=London}{city=Paris}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void tagDefinedToOtherTagWrongSubTagIsError() throws Exception {
    String program = """
      data city <'.*'>, destination <city>
      {name: 'John'} -> { destination: $.name } -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void tagDefinedToOtherTagAutotypesAndFailsAssignmentToDifferentField() throws Exception {
    String program = """
      data city <'.*'>, destination <city>
      {name: 'John', destination: city´'Paris'} -> { name: $.destination } -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
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
    assertThrows(TypeError.class, () -> {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    });
  }

  @Test
  void inlineTaggedNumberSameNameWorks() throws Exception {
    String program = "{id: 1234} -> { id: id´ 9876 } -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{id=9876}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void inlineTaggedNumberOtherNameFails() {
    String program = "{id: 1234} -> { id: qty´ 9876 } -> !OUT::write";
    assertThrows(TypeError.class, () -> {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    });
  }

  @Test
  void inlineTaggedNumberValid() throws Exception {
    String program = """
      data roll <1..6>
      roll´ 5 -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void inlineTaggedNumberNotValidThrows() {
    String program = """
      data roll <1..6>
      roll´ 7 -> !OUT::write
    """;
    assertThrows(TypeError.class, () -> {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    });
  }

  @Test
  void inlineTaggedNumberIsAutotyped() {
    String program = """
      id´ 1234 -> {id: 'abc'} -> !OUT::write
    """;
    assertThrows(TypeError.class, () -> {
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
    assertThrows(TypeError.class, () -> {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    });
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
  void autotypedMeasureCannotBeAssignedUntypedNumber() throws IOException {
    String program = """
     {x: 1"m"} -> {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
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
  void taggedStringRegexMatchInContext() throws Exception {
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
  void taggedStringEqualsRawStringInContext() throws Exception {
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
  void taggedStringInStructureEquality() throws Exception {
    String program = """
    {city: 'London'} -> \\(
      <={city: 'London'}> 'yes'!
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
  void taggedStringContextRawStringRange() throws Exception {
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
  void taggedNumberEqualsUntypedInContext() throws Exception {
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
  void taggedNumberContextInUntypedRange() throws Exception {
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
  void rangeMatchWithNoLowerBoundWorks() throws Exception {
    String program = """
    def foo: {city: 2, id: 8};
    id´ 5 -> \\(
      <..$foo.id> 'yes' !
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
  void rangeMatchWithNoUpperBoundWorks() throws Exception {
    String program = """
    def foo: {city: 2, id: 8};
    city´ 5 -> \\(
      <$foo.city..> 'yes' !
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
  void rangeWithDifferentTagsIsError() throws Exception {
    String program = """
    $foo.city..$foo.id -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void rangeWithUntypedLowerBoundIsError() throws Exception {
    String program = """
    2..$foo.id -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void rangeWithUntypedUpperBoundIsError() throws Exception {
    String program = """
    $foo.city..8 -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void taggedRangeProducesTaggedNumber() throws Exception {
    String program = """
    def low: {city: 2, id: 8};
    def high: {city: 6, id: 9};
    $low.city..$high.city -> {id: $} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void taggedRangeProducesTaggedNumberSoSameNameWorks() throws Exception {
    String program = """
    def low: {city: 2, id: 8};
    def high: {city: 6, id: 9};
    $low.city..$high.city -> {city: $} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{city=2}{city=3}{city=4}{city=5}{city=6}", output.toString(StandardCharsets.UTF_8));
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

  @Test
  void taggedIdentifierStringCanBePassedToComposer() throws IOException {
    String program = """
      composer toInt <INT> end toInt
      {foo: '13'} -> $.foo -> toInt -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("13", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void taggedIdentifierStringCanBeDeconstructed() throws IOException {
    String program = """
      {foo: 'ab'} -> [$.foo...] -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[a, b]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void sumTypeCanCompareAlternatives() throws IOException {
    String program = """
      data bar <'.*'>
      data foo <bar|baz>
      {foo: baz´ 'ab'} -> $.foo -> \\(
        when <bar ?($ <=bar´ 'ab'>)> do 'no'!
        when <baz ?($ <=baz´ 'ab'>)> do 'yes'!
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
  void comparisonInTagContextCanBeRaw() throws IOException {
    String program = """
      {foo: 'ab'} -> \\(
        when <{foo: <'a.+'>}> do 'yes'!
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
  void tagTypeOfComparisonIsNotAppliedToRegexPattern() throws IOException {
    String program = """
      data bar <'\\d'>, foo <bar>
      bar´ '8' -> \\(<bar´ '\\d'> 'yes'! \\) -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void equalityInTagContextCanBeRaw() throws IOException {
    String program = """
      {foo: 'ab'} -> \\(
        when <{foo: <='ab'>}> do 'yes'!
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
  void equalityOutOfTagContextMustBeTagged() throws IOException {
    String program = """
      {foo: 'ab'} -> $.foo -> \\(
        when <=foo´ 'ab'> do 'yes'!
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
  void rangeInTagContextCanBeRaw() throws IOException {
    String program = """
      {foo: 'ab'} -> \\(
        when <{foo: <'aa'..'ac'>}> do 'yes'!
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
  void rangeOutOfTagContextMustBeTagged() throws IOException {
    String program = """
      {foo: 'ab'} -> $.foo -> \\(
        when <foo´ 'aa'..foo´ 'ac'> do 'yes'!
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
  void correctExplicitTagWorks() throws IOException {
    String program = """
      data foo <bar>, bar <'.*'>
      {foo: bar´ 'value'} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{foo=value}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void wrongExplicitTagIsError() throws IOException {
    String program = """
      data foo <bar>, bar <'.*'>
      {foo: foo´ 'value'} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void correctExplicitTagNumberWorks() throws IOException {
    String program = """
      data foo <bar>, bar <1..9>
      {foo: bar´ 5} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{foo=5}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void wrongExplicitTagNumberIsError() throws IOException {
    String program = """
      data foo <bar>, bar <1..9>
      {foo: foo´ 5} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void tagParenthesizedArithmeticExpressionWorks() throws IOException {
    String program = """
      data bar <1..9>
      {foo: bar´ (5+3)} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{foo=8}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void explicitlyTaggedNumberInExpressionIsError() {
    String program = """
      data bar <1..9>
      {foo: bar´ 5 + 3} -> !OUT::write
    """;
    assertThrows(Exception.class, () -> Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8))));
  }

  @Test
  void tagStringReferenceWorks() throws IOException {
    String program = """
      def foo: 'bar';
      tag´$foo -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("bar", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void tagNumericReferenceWorks() throws IOException {
    String program = """
      def foo: 6;
      tag´$foo -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("6", output.toString(StandardCharsets.UTF_8));
  }
}
