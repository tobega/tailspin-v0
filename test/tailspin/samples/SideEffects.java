package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

public class SideEffects {
  @Test
  void resolveBeforeSink() throws Exception {
    String program = "1 -> \\($ ! 'a' -> !OUT::write\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void resolveSeveralBeforeSink() throws Exception {
    String program = "1..2 -> \\($ ! 'a' -> !OUT::write\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("aa12", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void streamDiesBeforeSendToTemplates() throws Exception {
    String program = "templates foo 1 -> \\(!VOID\\) -> #\n"
        + "<=0> $ -> !OUT::write $ + 4 ! end foo\n"
        + "1 -> foo -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void resolveBeforeSendToTemplates() throws Exception {
    String program = "templates foo 1 -> \\($ ! 'a' -> !OUT::write\\) -> #\n"
        + "<> $ -> !OUT::write $ + 4 ! end foo\n"
        + "1 -> foo -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a15", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void resolveSeveralBeforeSendToTemplates() throws Exception {
    String program = "templates foo 1..$ -> \\($ ! 'a' -> !OUT::write\\) -> #\n"
        + "<> $ -> !OUT::write $ + 4 ! end foo\n"
        + "2 -> foo -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("aa1256", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void resolveBeforeNextStage() throws Exception {
    String program = "1 -> \\($ ! 'a' -> !OUT::write\\) -> \\($ -> !OUT::write\\) -> !VOID";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void resolveSeveralBeforeNextStage() throws Exception {
    String program = "1..2 -> \\($ ! 'a' -> !OUT::write\\) -> \\($ -> !OUT::write\\) -> !VOID";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("aa12", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void noOptionalStateAssignment() throws Exception {
    String program = "templates foo @: 0; 1 -> \\( !VOID\\) -> @: $; $@! end foo\n"
        + "1 -> foo -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    // Passes if no error
    assertEquals("0", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void resolveBeforeStateAssignment() throws Exception {
    String program = "templates foo @: 1 -> \\( 'a' ! @foo: $;\\); $@! end foo\n"
        + "1 -> foo -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("a", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void resolveSeveralBeforeStateAssignment() throws Exception {
    String program = "templates foo @: []; ..|@: 1..$ -> \\( 'a' ! @foo: [$];\\); $@! end foo\n"
        + "2 -> foo -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[2, a, a]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void resolveBeforeNextComposerMatch() throws Exception {
    String program = "composer foo @:0; [ <digit>+ (<'.'> -> @: $ -> \\($! $ -> !OUT::write\\);) $@ ] \n"
        + "rule digit: <'\\d'> -> \\($! $ -> !OUT::write @foo:$;\\) $@ end foo\n"
        + "'123a' -> foo -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("123a[1, 1, 2, 2, 3, 3, a]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void valueSideEffectsRun() throws IOException {
    String program = "templates add $ + 1 ! $ -> !OUT::write end add\n (5 -> add) - 2 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("54", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void structNoOptionalProperty() throws IOException {
    String program =
        "{1 -> \\(!VOID\\) -> (x:$)} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayNoOptionalValue() throws IOException {
    String program =
        "[1 -> \\(!VOID\\)] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void stringInterpolationNoValue() throws IOException {
    String program =
        "'$: 1 -> \\(!VOID\\);' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void streamDiesBeforeReference() throws IOException {
    String program =
        "1 -> \\(!VOID\\) -> $ -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }
}
