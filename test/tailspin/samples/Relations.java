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

  @Test
  void join() throws IOException {
    String program = "({[{x: 1, y: 2}]} join {[{x:1, z: 3}, {x:1, z: 4}]}) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    String result = output.toString(StandardCharsets.UTF_8);
    assertTrue(result.startsWith("{["));
    assertTrue(result.endsWith("]}"));
    assertTrue(result.contains("{x=1, y=2, z=3}"));
    assertTrue(result.contains("{x=1, y=2, z=4}"));
    assertEquals(36, result.length());
  }

  @Test
  void intersect() throws IOException {
    String program = "({[{x: 1, y: 2}, {x: 2, y: 3}]} join {[{x:2, y: 3}, {x:1, y: 4}]}) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    String result = output.toString(StandardCharsets.UTF_8);
    assertTrue(result.startsWith("{["));
    assertTrue(result.endsWith("]}"));
    assertTrue(result.contains("{x=2, y=3}"));
    assertEquals(14, result.length());
  }

  @Test
  void crossProduct() throws IOException {
    String program = "({[{x: 1}, {x: 2}]} join {[{z: 3}, {z: 4}]}) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    String result = output.toString(StandardCharsets.UTF_8);
    assertTrue(result.startsWith("{["));
    assertTrue(result.endsWith("]}"));
    assertTrue(result.contains("{x=1, z=3}"));
    assertTrue(result.contains("{x=1, z=4}"));
    assertTrue(result.contains("{x=2, z=3}"));
    assertTrue(result.contains("{x=2, z=4}"));
    assertEquals(50, result.length());
  }

  @Test
  void projection() throws IOException {
    String program = "{[{x: 1, y: 2}, {x:2, y: 3}, {x: 1, y: 4}]} -> $({x:}) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    String result = output.toString(StandardCharsets.UTF_8);
    assertTrue(result.startsWith("{["));
    assertTrue(result.endsWith("]}"));
    assertTrue(result.contains("{x=1}"));
    assertTrue(result.contains("{x=2}"));
    assertEquals(16, result.length());
  }

  @Test
  void rename() throws IOException {
    String program = "{[{x: 1, y: 2}, {x:2, y: 3}]} -> $({x:, z: §.y}) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    String result = output.toString(StandardCharsets.UTF_8);
    assertTrue(result.startsWith("{["));
    assertTrue(result.endsWith("]}"));
    assertTrue(result.contains("{x=1, z=2}"));
    assertTrue(result.contains("{x=2, z=3}"));
    assertEquals(26, result.length());
  }

  @Test
  void extend() throws IOException {
    String program = "{[{x: 1, y: 2}, {x:2, y: 3}]} -> $({x:, y:, z: 1 + §.y}) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    String result = output.toString(StandardCharsets.UTF_8);
    assertTrue(result.startsWith("{["));
    assertTrue(result.endsWith("]}"));
    assertTrue(result.contains("{x=1, y=2, z=3}"));
    assertTrue(result.contains("{x=2, y=3, z=4}"));
    assertEquals(36, result.length());
  }

  @Test
  void count() throws IOException {
    String program = "{[{x: 1, y: 2}, {x:2, y: 3}]} -> $::count -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("2", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void countIsTailspinInteger() throws IOException {
    String program = "{[{x: 1, y: 2}, {x:2, y: 3}]} -> $::count -> \\(<=2> 'yes'!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void list() throws IOException {
    String program = "{[{x: 1, y: 2}, {x:2, y: 3}, {x: 1, y: 3}]} -> $::list -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    String result = output.toString(StandardCharsets.UTF_8);
    assertTrue(result.startsWith("["));
    assertTrue(result.endsWith("]"));
    assertTrue(result.contains("{x=1, y=2}"));
    assertTrue(result.contains("{x=2, y=3}"));
    assertTrue(result.contains("{x=1, y=3}"));
    assertEquals(36, result.length());
  }

  @Test
  void deconstruct() throws IOException {
    String program = "{[{x: 1, y: 2}, {x:2, y: 3}, {x: 1, y: 3}]} ... -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    String result = output.toString(StandardCharsets.UTF_8);
    assertTrue(result.contains("{x=1, y=2}"));
    assertTrue(result.contains("{x=2, y=3}"));
    assertTrue(result.contains("{x=1, y=3}"));
    assertEquals(30, result.length());
  }

  @Test
  void group() throws IOException {
    String program = "{[{x: 1, y: 2}, {x:1, y: 3}]} -> $(by $({x:}) collect {ys: Group&{of: :({y:})}}) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    String result = output.toString(StandardCharsets.UTF_8);
    assertTrue(result.matches("\\{\\[\\{x=1, ys=\\{\\[(\\{y=2}, \\{y=3}|\\{y=3}, \\{y=2})]}}]}"));
  }

  @Test
  void ungroup() throws IOException {
    String program =
        "{[{x: 1, ys: {[{y: 2}, {y: 3}]}}, {x:2, ys: {[{y: 1}, {y: 4}]}}]}\n"
            + " -> $({x:, by §.ys...}) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    String result = output.toString(StandardCharsets.UTF_8);
    assertTrue(result.startsWith("{["));
    assertTrue(result.endsWith("]}"));
    assertTrue(result.contains("{x=1, y=2}"));
    assertTrue(result.contains("{x=1, y=3}"));
    assertTrue(result.contains("{x=2, y=1}"));
    assertTrue(result.contains("{x=2, y=4}"));
    assertEquals(50, result.length());
  }
}
