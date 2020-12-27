package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

public class Operators {
  @Test
  void simpleOperator() throws Exception {
    String program = "operator (left add right)\n"
        + "  $left + $right !\n"
        + "end add\n"
        + "(1 add 2) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void operatorAsTerm() throws Exception {
    String program = "operator (left add right)\n"
        + "  $left + $right !\n"
        + "end add\n"
        + "(1 add 2) mod 3 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("0", output.toString(StandardCharsets.UTF_8));
  }
}
