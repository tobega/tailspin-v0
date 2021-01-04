package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

public class Relations {
  @Test
  void relationLiteral() throws IOException {
    String program = "{[{x: 1, y: 2}, {x:2, y: 3}, {x: 1, y: 2}]} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    String result = output.toString(StandardCharsets.UTF_8);
    assertTrue(result.startsWith("{["));
    assertTrue(result.endsWith("]}"));
    assertTrue(result.contains("{x=1, y=2}"));
    assertTrue(result.contains("{x=2, y=3}"));
    assertEquals(26, result.length());
  }

  @Test
  void union() throws IOException {
    String program = "({[{x: 1, y: 2}]} union {[{x:2, y: 3}]}) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    String result = output.toString(StandardCharsets.UTF_8);
    assertTrue(result.startsWith("{["));
    assertTrue(result.endsWith("]}"));
    assertTrue(result.contains("{x=1, y=2}"));
    assertTrue(result.contains("{x=2, y=3}"));
    assertEquals(26, result.length());
  }
}
