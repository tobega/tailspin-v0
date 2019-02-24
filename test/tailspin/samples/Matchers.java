package tailspin.samples;

import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
  void rangeMatchDereferenceState() throws Exception {
    String program = "1..6 -> (3 -> : $it -> # <..$:> 'L'! <> 'H'!) -> stdout";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("LLLHHH", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void invertMatch() throws Exception {
    String program = "1..6 -> (<!3> $it !) -> stdout";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("12456", output.toString(StandardCharsets.UTF_8));
  }
}
