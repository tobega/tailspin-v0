package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.support.io.TempDirectory;
import tailspin.Tailspin;

class Statements {
  @Test
  void helloWorld() throws Exception {
    String program = "'Hello World' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void newlineAfter() throws Exception {
    String program = "'Hello World' -> stdout\n";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void extraWhitespaceAfter() throws Exception {
    String program = "'Hello World' -> stdout ";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void newlineBefore() throws Exception {
    String program = "\n'Hello World' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void extraWhitespaceBefore() throws Exception {
    String program = " 'Hello World' -> stdout ";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void multiLineStatement() throws Exception {
    String program = "'Hello World'\n  -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void twoStatements() throws Exception {
    String program = "'Hello' -> stdout\n" + "'World'  -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("HelloWorld", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  @Disabled
  void twoStatementsWithoutNewlineError() {
    String program = "'Hello' -> stdout   'World'  -> stdout";
    try {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));
      fail();
    } catch (Exception expected) {
    }
  }

  @Test
  void definedSymbol() throws Exception {
    String program = "def world: 'World!'\n" + "'Hello '->stdout\n" + "$world -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void chain() throws Exception {
    String program = "'World!' -> 'Hello $it;' -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void definedTemplate() throws Exception {
    String program =
        "templates greet\n<2> 'Goodbye '! <> 'Hello '!\nend greet\n" + "1..3 -> greet -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello Goodbye Hello ", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mismatchedEnd() {
    String program = "templates someName\n<2> 'Goodbye ' <> 'Hello '\nend otherName";
    try {
      Tailspin runner =
          Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

      ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      runner.run(input, output, List.of());
    } catch (Exception expected) {
    }
  }

  @Test
  void definedSymbolFromValueChain() throws Exception {
    String program = "def helloWorld: 'World!' -> 'Hello $it;' \n $helloWorld -> stdout\n";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void commentsIgnored() throws Exception {
    String program = "1 -> stdout\n // 2 -> stdout\n 3 -> stdout // 4 -> stdout\n";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("13", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void symbolsMayNotBeRedefined() throws Exception {
    String program = "def one: 1 \n def one: 1\n";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void voidSink() throws Exception {
    String program = "'Hello World' -> void";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void commandLineArgs() throws Exception {
    String program = "$args -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of("Hello", "world"));

    assertEquals("[Hello, world]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void systemNanoCount() throws Exception {
    String program = "def start: $SYS::nanoCount\n"
        + "[1..100 -> $SYS::nanoCount - $start] -> $it(-1) -> (<0~..> 1 !) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void importPackage(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "package dep\ntemplates quote '\"$it;\"' ! end quote";
    Path depFile = dir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "import 'dep'\n 1 -> dep/quote -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("\"1\"", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void packageTemplatesRunInPackageScope(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "package dep\ntemplates quote '\"$it;\"' ! end quote\n"
        + "templates addQuote $it -> quote ! end addQuote";
    Path depFile = dir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "import 'dep'\n 1 -> dep/addQuote -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("\"1\"", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dynamicDereferenceInCorrectScope() throws Exception {
    String program =
        "def foo: 2\n [4,5,6] -> $it($foo) -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void noIt() throws Exception {
    String program = "$it -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Throwable.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void noItAfterValueChain() throws Exception {
    String program = "1 -> [$it] -> stdout\n$it -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Throwable.class, () -> runner.run(input, output, List.of()));
  }
}
