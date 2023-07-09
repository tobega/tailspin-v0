package tailspin.samples;

import org.junit.jupiter.api.Test;
import tailspin.Tailspin;
import tailspin.TypeError;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Matchers {
  @Test
  void alwaysMatch() throws Exception {
    String program = "1..3 -> \\(when <=2> do '='! when <> do '!' !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("!=!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void otherwiseKeyword() throws Exception {
    String program = "1..3 -> \\(when <=2> do '='! otherwise '!' !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("!=!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeMatch() throws Exception {
    String program = "1..6 -> \\(when <..2> do 'L'! when <3..4> do 'M'! when <5..> do 'H'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("LLMMHH", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeMatchExclusive() throws Exception {
    String program = "1..6 -> \\(<..~2> 'L'! <3..4> 'M'! <5~..> 'H'! <> '-' !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("L-MM-H", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void emptyStringMatch() throws Exception {
    String program = "'' -> \\(<'foo'> 'no way'! <''> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void regexpMatch() throws Exception {
    String program = "'Hello' -> \\(<'Hell'> 'no!'! <'[Hh]el.*'> 'yes' ! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interpolatedRegexpMatch() throws Exception {
    String program = "def aiches: '[Hh]';\n 'Hello' -> \\(<'Hell'> 'no!'! <'$aiches;el.*'> 'yes' ! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureMatchIsAStructure() throws Exception {
    String program = "{ a: 1 } -> \\(<´´=1> 'no!' ! <{}> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureMatchNotAStructure() throws Exception {
    String program = "1 -> \\(<{}> 'no!'! <=1> 'yes' !<> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureMatchPropertyExists() throws Exception {
    String program = "{ a: 1 } -> \\(<´{}´ { a1: <=1> }> 'no!'! <{ a:<> }> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureMatchNonExistentPropertyCannotMatchTheAnyMatcher() throws Exception {
    String program = "{ a: 1 } -> \\(<´{}´ { b: <> }> 'no!'! <> 'yes'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureMatchPropertyMatches() throws Exception {
    String program = "{ a: 1 } -> \\(<{ a: <=0> }> 'no!' !<{ a:<=1> }> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureMatchMultiplePropertyMatches() throws Exception {
    String program = "{ a: 1, b: 2 } -> \\(<{ a: <=1>, b: <=1> }> 'no!' !<{ b:<=2> }> 'yes'! <> 'oops'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureVoidMatcherPassesWithExpectedContent() throws Exception {
    String program = "{ a: 1, b: 2 } -> \\(<{ a: <>, b: <> VOID}> 'yes' ! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureVoidMatcherFailsWithExtraContent() throws Exception {
    String program = "{ a: 1, b: 2, c: 3 } -> \\(<´{}´ { a: <>, b: <> VOID}> 'no' ! <> 'yes'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureMatchVoidFieldPasses() throws Exception {
    String program = "{ b: 2 } -> \\(<{ a: VOID }> 'yes' ! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureMatchVoidFieldPassesButSubsequentFails() throws Exception {
    String program = "{ b: 2 } -> \\(<{ a: VOID, b: <=1> }> 'no' ! <> 'yes'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureMatchVoidFieldFails() throws Exception {
    String program = "{ a: 1, b: 2 } -> \\(<{ a: VOID }> 'no' ! <> 'yes'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureFieldMatchKeepsPerspectiveOfIt() throws Exception {
    String program = "{ a: {x: 1, y:2\"1\"}, b: 2\"1\" } -> \\(<{ b:<=$.a.y> }> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deepStructureFieldMatchKeepsPerspectiveOfIt() throws Exception {
    String program = "{ a: {x: 1, y:2\"1\"}, b: 2\"1\" } -> \\(<{ a:<{y: <=$.b>}> }> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deepStructureFieldMatchSuchThatChangesPerspectiveOfIt() throws Exception {
    String program = "{ a: {x: 1\"1\", y:2\"1\"}, b: 2 } -> \\(<{ a:<?($.y <$.x..>)> }> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeMatchDereference() throws Exception {
    String program = "def mid: 3;\n1..6 -> \\(<..$mid> 'L'! <> 'H'!\\) -> !OUT::write";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("LLLHHH", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeMatchExpression() throws Exception {
    String program = "def mid: 3;\n1..6 -> \\(<..($mid+1)> 'L'! <> 'H'!\\) -> !OUT::write";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("LLLLHH", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeMatchDereferenceState() throws Exception {
    String program = "1..6 -> \\(@: 3; $ -> # <..$@> 'L'! <> 'H'!\\) -> !OUT::write";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("LLLHHH", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void matchDereferenceMessage() throws Exception {
    String program = "def a: [ 1..3 ];\n1..6 -> \\(<..$a::length> 'L'! <> 'H'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("LLLHHH", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void invertMatch() throws Exception {
    String program = "1..6 -> \\(<~=3> $ !\\) -> !OUT::write";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("12456", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchIsAnArray() throws Exception {
    String program = "[ 1 ] -> \\(<´´=1> 'no!' ! <[]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchNotAnArray() throws Exception {
    String program = "1 -> \\(<[]> 'no!'! <> 'yes'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void indexedArrayIsAnArray() throws Exception {
    String program = "0:[ 1 ] -> \\(<´´=1> 'no!' ! <[]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayIsOneIndexedByDefault() throws Exception {
    String program = "[ 1 ] -> \\(<´´=1> 'no!' ! <1:[]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayDoesNotMatchOtherIndex() throws Exception {
    String program = "[ 1 ] -> \\(<0:[]> 'no'! <1\"m\":[]> 'no'! <idx´1:[]> 'no'! <> 'yes'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void indexedArrayMatchesCorrectIndex() throws Exception {
    String program = "idx´0:[ 1 ] -> \\(<0:[]> 'no'! <0\"m\":[]> 'no'! <idx´0:[]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void indexedArrayMatchesIndexTagType() throws Exception {
    String program = "idx´0:[ 1 ] -> \\(<0:[]> 'untyped'! <\"m\":[]> 'm'! <plu´:[]> 'plu'! <idx´:[]> 'yes'! <> 'never'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void indexedArrayMatchesIndexMeasureType() throws Exception {
    String program = "0\"s\":[ 1 ] -> \\(<0:[]> 'untyped'! <\"m\":[]> 'm'! <idx´:[]> 'idx'! <\"s\":[]> 'yes'! <> 'never'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchNotOnWrongLength() throws Exception {
    String program = "[1,2] -> \\(<[](1)> 'no!'! <> 'yes'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchOnRightLength() throws Exception {
    String program = "[1,2] -> \\(<[](2)> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchOnLowerBound() throws Exception {
    String program = "[1,2] -> \\(<[](1..)> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchNotOnLowerBound() throws Exception {
    String program = "[1,2] -> \\(<[](3..)> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchOnUpperBound() throws Exception {
    String program = "[1,2] -> \\(<[](..2)> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchNotOnUpperBound() throws Exception {
    String program = "[1,2,3] -> \\(<[](..2)> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchOnRange() throws Exception {
    String program = "[1,2] -> \\(<[](1..3)> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchNotOnRange() throws Exception {
    String program = "[1,2] -> \\(<[](3..4)> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void suchThatMatch() throws Exception {
    String program = "[1,1] -> \\(<[]?($(1)<=$(2)>)> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void suchThatRangeMatch() throws Exception {
    String program = "[1,1] -> \\(<[]?($(1)<..$(2)>)> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void suchThatMatchNotMatches() throws Exception {
    String program = "[1,2] -> \\(<[]?($(1)<=$(2)>)> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void suchThatMatchResetsIt() throws Exception {
    String program = "[1,1] -> \\(<[]?($(1)<=$(2)>)> $ ! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 1]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void suchThatMatchInSuchThatMatchResetsIt() throws Exception {
    String program = "[[1,1],2] -> \\(<[]?($(1)<?($(1)<=$(2)>)>)> $ ! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[1, 1], 2]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void elseConditionFirst() throws Exception {
    String program = "8 -> \\(<=8 | 1..3> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void elseConditionSecond() throws Exception {
    String program = "2 -> \\(<=8 | 1..3> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void elseConditionNone() throws Exception {
    String program = "5 -> \\(<=8 | 1..3> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void elseConditionNotEmpty() {
    String program = "5 -> \\(<=8 |> 'yes'! <> 'no'!\\) -> !OUT::write";
    assertThrows(Exception.class,
        () -> Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8))));
  }

  @Test
  void stringEquals() throws Exception {
    String program = "def char: 'b';\n ['a', 'b', 'c']... -> \\(<=$char> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("noyesno", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void stringRange() throws Exception {
    String program = "['a', 'b', 'c', 'd', 'e', 'f']... -> \\(<..'b'> 'low' ! <'c'..~'e'> 'mid' ! <'e'..> 'high' !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("lowlowmidmidhighhigh", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void stringRangeDereferenced() throws Exception {
    String program = "def mid: 'c';\n['a', 'b', 'c', 'd', 'e']... -> \\(<..~$mid> 'low' ! <$mid~..> 'high' ! <> 'mid' !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("lowlowmidhighhigh", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void suchThatValueChain() throws Exception {
    String program = "templates isLow <..3> 1 ! <> 0 ! end isLow\n"
        + "1..6 -> \\(<?($ -> isLow <=1>)> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yesyesyesnonono", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void stringMatchNewlines() throws Exception {
    String program = "'foo\nbar' -> \\(<'.*'> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void ambiguousParseMergeOperator() throws Exception {
    String program = "3 -> \\(<1..|=7> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContains() throws Exception {
    String program = "[3, 5, 1] -> \\(<[<=5>]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContainsNo() throws Exception {
    String program = "[3, 5, 1] -> \\(<[<=4>]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContainsBoth() throws Exception {
    String program = "[3, 5, 1] -> \\(<[<=5>,<=3>]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContainsBothNo() throws Exception {
    String program = "[3, 5, 1] -> \\(<[<=5>,<=4>]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContainsAtLeastOneNeither() throws Exception {
    String program = "[3, 5, 1] -> \\(<[<~=3|=5>]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContainsAtLeastOneNeitherNo() throws Exception {
    String program = "[3, 5, 3] -> \\(<[<~=3|=5>]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContainsOnlyTheAlternatives() throws Exception {
    String program = "[3, 5, 3] -> \\(<~[<~=3|=5>]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContainsNoneOfTheAlternatives() throws Exception {
    String program = "[3, 5, 1] -> \\(<~[<=0|=2>]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContainsKeepsPerspectiveOfIt() throws Exception {
    String program = "def a:[{x:1}]; 1 -> \\(<?($a <[<{x: <=$>}>]>)> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContainsSuchThatChangesPerspectiveOfIt() throws Exception {
    String program = "[{x:1\"1\", y:1\"1\"}] -> \\(<[<?($.x <=$.y>)>]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void literalEqualityString() throws Exception {
    String program = "'a(b' -> \\(<='a(b'> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void literalEqualityArray() throws Exception {
    String program = """
        [3, 5, 2] -> \\(<=[3, 5, 2]> 'yes'! <> 'no'!\\) -> !OUT::write
        [3, 5, 2] -> \\(<=[3, 2, 5]> 'no'! <> 'yes'!\\) -> !OUT::write
        [3, 5, 2] -> \\(<=[3, 5, 2, 2]> 'no'! <> 'yes'!\\) -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yesyesyes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void literalEqualityIndexedArray() throws Exception {
    String program = """
        0:[3, 5, 2] -> \\(<=0:[3, 5, 2]> 'yes'! <> 'no'!\\) -> !OUT::write
        0"m":[3, 5, 2] -> \\(<=0"m":[3, 2, 5]> 'no'! <> 'yes'!\\) -> !OUT::write
        idx´0:[3, 5, 2] -> \\(<=idx´0:[3, 5, 2, 2]> 'no'! <> 'yes'!\\) -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yesyesyes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void equalityIndexedArrayErrorOnWrongIndex() throws Exception {
    String program = """
        0:[3, 5, 2] -> \\(<=[3, 5, 2]> 'yes'! <> 'no'!\\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void equalityIndexedArrayErrorOnWrongIndexType() throws Exception {
    String program = """
        0:[3, 5, 2] -> \\(<=idx´0:[3, 5, 2]> 'yes'! <> 'no'!\\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void equalityIndexedArrayErrorOnWrongIndexTag() throws Exception {
    String program = """
        x´0:[3, 5, 2] -> \\(<=y´0:[3, 5, 2]> 'yes'! <> 'no'!\\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void equalityIndexedArrayErrorOnWrongIndexUnit() throws Exception {
    String program = """
        0"m":[3, 5, 2] -> \\(<=0"s":[3, 5, 2]> 'yes'! <> 'no'!\\) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void literalEqualityStructure() throws Exception {
    String program = """
        {a: 1, b: 'a'} -> \\(<={a: 1, b: 'a'}> 'yes'! <> 'no'!\\) -> !OUT::write
        {a: 1, b: 'a'} -> \\(<´{}´ ={a: 1, b: 'a', c:0}> 'no'! <> 'yes'!\\) -> !OUT::write
        {a: 1, b: 'a'} -> \\(<={a: 1, b: 'b'}> 'no'! <> 'yes'!\\) -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yesyesyes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayWithOneOneAndNoneOfArbitraryZeros() throws Exception {
    String program = "[1] -> \\(<[<=1>,<=0>*]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayWithOneOneAndOneOfArbitraryZeros() throws Exception {
    String program = "[1, 0] -> \\(<[<=1>,<=0>*]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayWithOneOneAndTwoOfArbitraryZeros() throws Exception {
    String program = "[0, 1, 0] -> \\(<[<=1>,<=0>*]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayWithTooFewOnesAndTwoOfArbitraryZeros() throws Exception {
    String program = "[0, 0] -> \\(<[<=1>,<=0>*]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayWithManyOnesAndTwoOfArbitraryZeros() throws Exception {
    String program = "[1, 1, 0, 0] -> \\(<[<=1>,<=0>*]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // This construct allows extra content, even for specified matchers
    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayExpectingOneAndArbitraryZerosWithATwo() throws Exception {
    String program = "[1, 2, 0, 0] -> \\(<[<=1>,<=0>*]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // This construct allows extra content
    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayWithOneOneAndNoneOfAtLeastOneZeros() throws Exception {
    String program = "[1] -> \\(<[<=1>,<=0>+]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayWithOneOneAndOneOfAtLeastOneZeros() throws Exception {
    String program = "[1, 0] -> \\(<[<=1>,<=0>*]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayWithOneOneAndTwoOfAtLeastOneZeros() throws Exception {
    String program = "[0, 1, 0] -> \\(<[<=1>,<=0>*]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayWithTooFewOnesAndTwoOfAtLeastOneZeros() throws Exception {
    String program = "[0, 0] -> \\(<[<=1>,<=0>*]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayWithManyOnesAndTwoOfAtLeastOneZeros() throws Exception {
    String program = "[1, 1, 0, 0] -> \\(<[<=1>,<=0>*]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // This construct allows extra content, even for specified matchers
    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayExpectingOneAndAtLeastOneZerosWithATwo() throws Exception {
    String program = "[1, 2, 0, 0] -> \\(<[<=1>,<=0>*]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // This construct allows extra content
    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayExpectingOptionalOneAndArbitraryZerosIsEmpty() throws Exception {
    String program = "[] -> \\(<[<=1>?,<=0>*]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayExpectingOptionalOneAndArbitraryZerosHasJustZeroes() throws Exception {
    String program = "[0, 0, 0, 0] -> \\(<[<=1>?,<=0>*]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayExpectingOptionalOneAndArbitraryZerosHasAOneAndZeroes() throws Exception {
    String program = "[0, 0, 1, 0] -> \\(<[<=1>?,<=0>*]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayExpectingOptionalOneAndArbitraryZerosHasTwoOnesAndZeroes() throws Exception {
    String program = "[1, 0, 1, 0] -> \\(<[<=1>?,<=0>*]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // We don't allow extra for an optional
    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayExpectingOptionalOneAndArbitraryZerosHasATwo() throws Exception {
    String program = "[2] -> \\(<[<=1>?,<=0>*]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // This construct allows extra content
    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayExpectingOptionalOneAndOptionalZeroHasATwo() throws Exception {
    String program = "[2] -> \\(<[<=1>?,<=0>?]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // This construct allows extra content, when not for specified matchers
    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayExpectingExactOnesAndZeros() throws Exception {
    String program = "[0, 0, 1, 0, 1] -> \\(<[<=1>=2,<=0>=3]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayExpectingExactOnesAndZerosWithTooFewOnes() throws Exception {
    String program = "[0, 0, 1, 0] -> \\(<[<=1>=2,<=0>=3]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayExpectingExactOnesAndZerosWithTooManyOnes() throws Exception {
    String program = "[0, 0, 1, 0, 1, 1] -> \\(<[<=1>=2,<=0>=3]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayExpectingExactOnesAndZerosWithATwo() throws Exception {
    String program = "[0, 0, 2, 0, 1, 1] -> \\(<[<=1>=2,<=0>=3]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // This construct allows extra content, when not for specified matchers
    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayExpectingExactOnesAndZerosWithTooFewZeroes() throws Exception {
    String program = "[0, 0, 1, 1] -> \\(<[<=1>=2,<=0>=3]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayVoidMatcherPassesWithExpectedContent() throws Exception {
    String program = "[0, 0, 1, 1] -> \\(<[<=1>+,<=0>+, VOID]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayVoidMatcherFailsWithExtraContent() throws Exception {
    String program = "[0, 0, 1, 1, 2] -> \\(<[<=1>+,<=0>+, VOID]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContentWithDuplicateUnmultipliedMatchers() throws Exception {
    String program = "[0, 0, 1, 1, 2] -> \\(<[<=1>,<=1>]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContentWithDuplicateUnmultipliedMatchersTooFewMatches() throws Exception {
    String program = "[0, 0, 1, 1, 2] -> \\(<[<=2>,<=2>]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void stereotypeMatch() throws Exception {
    String program = "data dice <1..6>\n"
        + "0..7 -> \\(when <dice> do $! otherwise '-' !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("-123456-", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void stereotypeMatchDoesNotMatchUntypedUnderBroadTypeBounds() throws Exception {
    String program = "data dice <1..6>\n"
        + "0..7 -> \\(when <´´ dice> do $! otherwise '-' !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("--------", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void stereotypeMatchMatchesTaggedValueUnderBroadTypeBounds() throws Exception {
    String program = "data dice <1..6>\n"
        + "dice´1..dice´6 -> \\(when <´´ dice> do $! otherwise '-' !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("123456", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void stereotypeMatchAutotyped() throws Exception {
    String program = "def foo: {bar: 3};\n"
        + "0..2 -> \\(when <bar> do $foo.bar! otherwise '-' !\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("333", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContentSequence() throws Exception {
    String program = "[0, 0, 1, 1, 2] -> \\(<[(<=1>:<=2>)]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContentSequenceMultiplier() throws Exception {
    String program = "[0, 0, 1, 1, 1, 1] -> \\(<[(<=1>:<=1>)=2]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContentSequenceMultiplierNoMatch() throws Exception {
    String program = "[0, 0, 1, 1, 1, 2] -> \\(<[(<=1>:<=1>)=2]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContentSequenceNotDirectlySequential() throws Exception {
    String program = "[0, 0, 1, 1, 2] -> \\(<[(<=0>:<=2>)]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayContentSequenceNoMatch() throws Exception {
    String program = "[0, 0, 1, 1, 2] -> \\(<[(<=2>:<=2>)]> 'yes'! <> 'no'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void keyValueMatch() throws Exception {
    String program = "(foo:5) -> \\(<(foo:<0..3>)> 'no'! <(foo:<4..8>)> 'yes'! <> 'oops'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }
}
