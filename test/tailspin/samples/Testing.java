package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

public class Testing {
  @Test
  void passingTest() throws Exception {
    String program = "test 'A passing test'\n"
        + "assert 1 <=1> '1 is 1'\n"
        + "end 'A passing test'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void failingTest() throws Exception {
    String program = "test 'A failing test'\n"
        + "assert 1 <=0> '1 is 0'\n"
        + "end 'A failing test'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("A failing test failed:\n"
        + "assertion that 1 is 0 failed with value 1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void twoFailingTests() throws Exception {
    String program = "test 'Two failing tests'\n"
        + "assert 1 <=0> '1 is 0'\n"
        + "assert 1 <=2> '1 is 2'\n"
        + "end 'Two failing tests'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Two failing tests failed:\n"
        + "assertion that 1 is 0 failed with value 1\n"
        + "assertion that 1 is 2 failed with value 1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void noTestsRunInNormalMode() throws Exception {
    String program = "5 -> !OUT::write\n"
        + "test 'A test'\n"
        + "assert 1 -> \\($ -> !OUT::write $! \\) <=0> '1 is 0'\n"
        + "end 'A test'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void setUpCode() throws Exception {
    String program = "test 'Set up'\n"
        + "def a: 1;\n"
        + "assert $a + 1 <=2> 'a+1=2'\n"
        + "end 'Set up'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }
}
