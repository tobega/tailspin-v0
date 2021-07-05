package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

public class DataDictionary {
  @Test
  void definedTermWrongValue() throws IOException {
    String program = """
    data x <1..5>
    {x: 6} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void definedTermCorrectValue() throws IOException {
    String program = """
    data x <1..5>
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void autotypedStringTermCorrectValue() throws IOException {
    String program = """
    {x: 'apple'} -> !OUT::write
    {x: 'banana'} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=apple}{x=banana}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void autotypedStringTermConflict() throws IOException {
    String program = """
    {x: 'apple'} -> !OUT::write
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void localInlineTransformTypeStaysLocal() throws IOException {
    String program = """
    'apple' -> \\(data x local {x: $} -> !OUT::write\\) -> !VOID
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=apple}{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void localInlineArrayTransformTypeStaysLocal() throws IOException {
    String program = """
    ['apple'] -> \\[i](data x local {x: $} -> !OUT::write\\) -> !VOID
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=apple}{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void localTransformTypeStaysLocal() throws IOException {
    String program = """
    templates foo
      data x local
      {x: $} -> !OUT::write
    end foo
    'apple' -> foo -> !VOID
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=apple}{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void localProcessorTypeStaysLocal() throws IOException {
    String program = """
    processor foo
      data x local
      {x: $} -> !OUT::write
    end foo
    'apple' -> foo -> !VOID
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=apple}{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void localComposerTypeStaysLocal() throws IOException {
    String program = """
    composer foo
      data x local
      (<'.*'> -> @: {x: $};) $@.x
    end foo
    'apple' -> foo -> !OUT::write
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("apple{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void localOperatorTypeStaysLocal() throws IOException {
    String program = """
    operator (a foo b)
      data x local
      {x: '$a;$b;'} -> !OUT::write
    end foo
    ('app' foo 'le') -> !VOID
    {x: 3} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=apple}{x=3}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void settingStateChecksType() throws IOException {
    String program = """
    templates foo
      @: {x: 'apple'};
      @.x: 3;
      $@ !
    end foo
    1 -> foo -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void settingStateLensChecksType() throws IOException {
    String program = """
    templates foo
      @: {x: 'apple'};
      @(x:): 3;
      $@ !
    end foo
    1 -> foo -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void projectionChecksType() throws IOException {
    String program = """
    {x: 'apple'} -> $({x: 3}) -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void autotypedArrayTermCorrectValue() throws IOException {
    String program = """
    {x: ['apple']} -> !OUT::write
    {x: [3, 2]} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=[apple]}{x=[3, 2]}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void autotypedArrayTermConflict() throws IOException {
    String program = """
    {x: ['apple']} -> !OUT::write
    {x: 'banana'} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void autotypedStructureTermCorrectValue() throws IOException {
    String program = """
    {x: {fruit: 'apple'}} -> !OUT::write
    {x: {days: 2}} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x={fruit=apple}}{x={days=2}}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void autotypedStructureTermConflict() throws IOException {
    String program = """
    {x: {fruit: 'apple'}} -> !OUT::write
    {x: 'banana'} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void autotypedMeasureTermCorrectValue() throws IOException {
    String program = """
    {x: 1"s"} -> !OUT::write
    {x: 2"s"} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{x=1\"s\"}{x=2\"s\"}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void autotypedMeasureTermConflict() throws IOException {
    String program = """
    {x: 1"s"} -> !OUT::write
    {x: 'banana'} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void autotypedMeasureDoesNotMatchOtherMeasure() throws IOException {
    String program = """
    {x: 1"s"} -> !OUT::write
    {x: 2"m"} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void autotypedMeasureDoesNotMatchScalar() throws IOException {
    String program = """
    {x: 1"s"} -> !OUT::write
    {x: 2} -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }
}
