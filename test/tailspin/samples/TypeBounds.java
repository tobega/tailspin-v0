package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tailspin.Tailspin;
import tailspin.TypeError;

class TypeBounds {
  private static final List<String> rangeTypes = List.of("5", "id´5", "ifoo´5", "5\"x\"", "5\"y\"", "'e'", "sid´'e'", "sfoo´'e'");

  private static Stream<Arguments> mismatchedRangeType() {
    return rangeTypes.stream().flatMap(v -> rangeTypes.stream()
        .filter(b -> !b.equals(v)).map(b ->Arguments.of(v, b)));
  }

  @ParameterizedTest
  @MethodSource
  void mismatchedRangeType(String value, String bound) throws IOException {
    String program = String.join("",
        value, " -> \\(when <",bound,"..",bound,"> do $ ! \\) -> !OUT::write");
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
  }

  private static Stream<String> sameRangeType() {
    return rangeTypes.stream();
  }

  @ParameterizedTest
  @MethodSource
  void sameRangeType(String value) throws IOException {
    String program = String.join("",
        value, " -> \\(when <",value,"..",value,"> do 'ok' ! \\) -> !OUT::write");
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  @ParameterizedTest
  @MethodSource(value = "mismatchedRangeType")
  void rangeMatchWithinTypeBounds(String value, String bound) throws IOException {
    String program = String.join("",
        "data rangeable <..|''>\n",
        value, " -> \\(when <´rangeable´ ",bound,"..",bound,"> do 'no'! otherwise 'ok' ! \\) -> !OUT::write");
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  @ParameterizedTest
  @MethodSource(value = "mismatchedRangeType")
  void rangeMatchAnyType(String value, String bound) throws IOException {
    String program = String.join("",
        value, " -> \\(when <´´ ",bound,"..",bound,"> do 'no'! otherwise 'ok' ! \\) -> !OUT::write");
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  private static final List<String> compoundEqualTypes = List.of("{num: 8}", "{char: 'h'}", "[8]");

  private static Stream<Arguments> mismatchedEqualType() {
    return Stream.concat(rangeTypes.stream(), compoundEqualTypes.stream())
        .flatMap(v -> Stream.concat(rangeTypes.stream(), compoundEqualTypes.stream())
        .filter(b -> !b.equals(v)).map(b ->Arguments.of(v, b)));
  }

  @ParameterizedTest
  @MethodSource
  void mismatchedEqualType(String value, String rhs) throws IOException {
    String program = String.join("",
        value, " -> \\(when <=",rhs,"> do $ ! \\) -> !OUT::write");
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
  }

  private static Stream<String> sameEqualType() {
    return Stream.concat(rangeTypes.stream(), compoundEqualTypes.stream());
  }

  @ParameterizedTest
  @MethodSource
  void sameEqualType(String value) throws IOException {
    String program = String.join("",
        value, " -> \\(when <=",value,"> do 'ok' ! \\) -> !OUT::write");
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  @ParameterizedTest
  @MethodSource(value = "mismatchedRangeType")
  void equalMatchWithinTypeBounds(String value, String rhs) throws IOException {
    String program = String.join("",
        "data rangeable <..|''>\n",
        value, " -> \\(when <´rangeable´ =",rhs,"> do 'no'! otherwise 'ok' ! \\) -> !OUT::write");
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  @ParameterizedTest
  @MethodSource(value = "mismatchedEqualType")
  void equalMatchAnyType(String value, String rhs) throws IOException {
    String program = String.join("",
        value, " -> \\(when <´´ =",rhs,"> do 'no'! otherwise 'ok' ! \\) -> !OUT::write");
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  @ParameterizedTest
  @MethodSource(value = "mismatchedEqualType")
  void mismatchedArrayEqualType(String value, String rhs) throws IOException {
    String program = String.join("",
        "[", value, "] -> \\(when <=[",rhs,"]> do $ ! \\) -> !OUT::write");
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
  }

  @ParameterizedTest
  @MethodSource(value = "sameEqualType")
  void sameArrayEqualType(String value) throws IOException {
    String program = String.join("",
        "[", value, "] -> \\(when <=[",value,"]> do 'ok' ! \\) -> !OUT::write");
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  @ParameterizedTest
  @MethodSource(value = "mismatchedRangeType")
  void arrayEqualMatchWithinTypeBounds(String value, String rhs) throws IOException {
    String program = String.join("",
        "data rangeable <[<..|''>]>\n",
        "[", value, "] -> \\(when <´rangeable´ =[",rhs,"]> do 'no'! otherwise 'ok' ! \\) -> !OUT::write");
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  @ParameterizedTest
  @MethodSource(value = "mismatchedEqualType")
  void arrayEqualMatchAnyType(String value, String rhs) throws IOException {
    String program = String.join("",
        "[", value, "] -> \\(when <´´ =[",rhs,"]> do 'no'! otherwise 'ok' ! \\) -> !OUT::write");
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeMatchWithUntypedUpperBoundIsError() throws Exception {
    String program = """
    def foo: {city: 2, id: 8};
    5 -> \\(
      <$foo.city..8> 'no' !
    \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void rangeMatchWithDifferentTagsIsError() throws Exception {
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
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void rangeMatchWithUntypedLowerBoundIsError() throws Exception {
    String program = """
    def foo: {city: 2, id: 8};
    5 -> \\(
      <2..$foo.id> 'no' !
    \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void rawStringMatchToTaggedStringIsError() throws Exception {
    // TODO: How do we want to specify this?
    String program = """
    def foo: {city: 'London'};
    'London' -> \\(
      <city´ 'L.*'> 'yes'!
      <> 'no'!
    \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void rawRegexOutOfTagContextErrorForTaggedValue() throws IOException {
    String program = """
      {foo: 'ab'} -> $.foo -> \\(
        when <'a.+'> do 'yes'!
      \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void rawRegexInTypeBounds() throws IOException {
    String program = """
      {foo: 'ab'} -> $.foo -> \\(
        when <´''´ 'a.+'> do 'no'!
        otherwise 'yes'!
      \\) -> !OUT::write
      'ab' -> \\(
        when <´''´ 'a.+'> do 'yes'!
      \\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yesyes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void comparisonOutOfTagContextMustBeTagged() throws IOException {
    String program = """
      {foo: 'ab'} -> $.foo -> \\(
        when <foo´ 'a.+'> do 'yes'!
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
  void comparisonOutOfTagContextMustBeTaggedCorrectly() throws IOException {
    String program = """
      data bar <'\\d'>, foo <bar>
      bar´ '8' -> \\(<foo´ '\\d'> 'no'! <> 'yes'!\\) -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

}
