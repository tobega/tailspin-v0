package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Matchers {
  @Test
  void rangeMatch() throws Exception {
    String program = "1..6 -> (<..2> 'L'! <3..4> 'M'! <5..> 'H'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("LLMMHH", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeMatchExclusive() throws Exception {
    String program = "1..6 -> (<..~2> 'L'! <3..4> 'M'! <5~..> 'H'! <> '-' !) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("L-MM-H", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void emptyStringMatch() throws Exception {
    String program = "'' -> (<'foo'> 'no way'! <''> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void regexpMatch() throws Exception {
    String program = "'Hello' -> (<'Hell'> 'no!'! <'[Hh]el.*'> 'yes' ! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureMatchIsAStructure() throws Exception {
    String program = "{ a: 1 } -> (<1> 'no!' ! <{}> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureMatchNotAStructure() throws Exception {
    String program = "1 -> (<{}> 'no!'! <1> 'yes' !<> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureMatchPropertyExists() throws Exception {
    String program = "{ a: 1 } -> (<{ a1: <1> }> 'no!'! <{ a:<> }> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureMatchPropertyMatches() throws Exception {
    String program = "{ a: 1 } -> (<{ a: <0> }> 'no!' !<{ a:<1> }> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structureMatchMultiplePropertyMatches() throws Exception {
    String program = "{ a: 1, b: 2 } -> (<{ a: <1>, b: <1> }> 'no!' !<{ b:<2> }> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeMatchDereference() throws Exception {
    String program = "def mid: 3\n1..6 -> (<..$mid> 'L'! <> 'H'!) -> stdout";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("LLLHHH", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeMatchExpression() throws Exception {
    String program = "def mid: 3\n1..6 -> (<..($mid+1)> 'L'! <> 'H'!) -> stdout";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("LLLLHH", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeMatchDereferenceState() throws Exception {
    String program = "1..6 -> (3 -> @ $it -> # <..$@> 'L'! <> 'H'!) -> stdout";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("LLLHHH", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void matchDereferenceMessage() throws Exception {
    String program = "def a: [ 1..3 ]\n1..6 -> (<..$a::length> 'L'! <> 'H'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("LLLHHH", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void invertMatch() throws Exception {
    String program = "1..6 -> (<~3> $it !) -> stdout";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("12456", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchIsAnArray() throws Exception {
    String program = "[ 1 ] -> (<1> 'no!' ! <[]> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchNotAnArray() throws Exception {
    String program = "1 -> (<[]> 'no!'! <> 'yes'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchNotOnWrongLength() throws Exception {
    String program = "[1,2] -> (<[](1)> 'no!'! <> 'yes'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchOnRightLength() throws Exception {
    String program = "[1,2] -> (<[](2)> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchOnLowerBound() throws Exception {
    String program = "[1,2] -> (<[](1..)> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchNotOnLowerBound() throws Exception {
    String program = "[1,2] -> (<[](3..)> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchOnUpperBound() throws Exception {
    String program = "[1,2] -> (<[](..2)> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchNotOnUpperBound() throws Exception {
    String program = "[1,2,3] -> (<[](..2)> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchOnRange() throws Exception {
    String program = "[1,2] -> (<[](1..3)> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMatchNotOnRange() throws Exception {
    String program = "[1,2] -> (<[](3..4)> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void suchThatMatch() throws Exception {
    String program = "[1,1] -> (<[]?($it(1)<$it(2)>)> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void suchThatMatchNotMatches() throws Exception {
    String program = "[1,2] -> (<[]?($it(1)<$it(2)>)> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void suchThatMatchResetsIt() throws Exception {
    String program = "[1,1] -> (<[]?($it(1)<$it(2)>)> $it ! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("[1, 1]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void suchThatMatchInSuchThatMatchResetsIt() throws Exception {
    String program = "[[1,1],2] -> (<[]?($it(1)<?($it(1)<$it(2)>)>)> $it ! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("[[1, 1], 2]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void elseConditionFirst() throws Exception {
    String program = "8 -> (<8 | 1..3> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void elseConditionSecond() throws Exception {
    String program = "2 -> (<8 | 1..3> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void elseConditionNone() throws Exception {
    String program = "5 -> (<8 | 1..3> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("no", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void stringEquals() throws Exception {
    String program = "def char: 'b'\n ['a', 'b', 'c']... -> (<$char> 'yes'! <> 'no'!) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("noyesno", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void stringRange() throws Exception {
    String program = "['a', 'b', 'c', 'd', 'e', 'f']... -> (<..'b'> 'low' ! <'c'..~'e'> 'mid' ! <'e'..> 'high' !) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("lowlowmidmidhighhigh", output.toString(StandardCharsets.UTF_8));
  }
}
