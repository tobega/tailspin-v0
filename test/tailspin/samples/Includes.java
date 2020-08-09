package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.support.io.TempDirectory;
import tailspin.Tailspin;

public class Includes {
  @ExtendWith(TempDirectory.class)
  @Test
  void includeTemplates(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "templates quote '\"$;\"' ! end quote";
    Path depFile = dir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "include 'dep'\n 1 -> dep/quote -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("\"1\"", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void includeSource(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "source quote '\"1\"' ! end quote";
    Path depFile = dir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "include 'dep'\n $dep/quote -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("\"1\"", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void includeFromDeepProgram(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "source quote '\"1\"' ! end quote";
    Path subdir = Files.createDirectory(dir.resolve("ts"));
    Path depFile = subdir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "include 'dep'\n $dep/quote -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(subdir, input, output, List.of());

    assertEquals("\"1\"", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void deepInclude(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "source quote '\"1\"' ! end quote";
    Path subdir = Files.createDirectory(dir.resolve("lib"));
    Path depFile = subdir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "include 'lib/dep'\n $dep/quote -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("\"1\"", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void includeFromOutsideDirectoryNotAllowed(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "source quote '\"1\"' ! end quote";
    Path depFile = dir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path subdir = Files.createDirectory(dir.resolve("ts"));
    String program = "include '../dep'\n $dep/quote -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(subdir, input, output, List.of()));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void noStatementsOrUnusedDefinitionsRunInImportedFiles(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "source quote '\"1\"' ! end quote\n"
        + "def b: 'unused' -> \\($ -> !OUT::write $!\\);\n"
        + "'bad' -> !OUT::write";
    Path depFile = dir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "include 'dep'\n $dep/quote -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("\"1\"", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void includedDepsRunInSourceOrder(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "def a: 1 -> \\($ -> !OUT::write $!\\);\n"
        + "def b: 2 -> \\($ -> !OUT::write $!\\);";
    Path depFile = dir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "include 'dep'\n $dep/b -> !OUT::write\n $dep/a -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("1221", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void includeSink(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "sink quote '\"$;\"' -> !OUT::write end quote";
    Path depFile = dir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "include 'dep'\n 1 -> !dep/quote";
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
    String dep = "templates quote '\"$;\"' ! end quote\n"
        + "templates addQuote $ -> quote ! end addQuote";
    Path depFile = dir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "include 'dep'\n 1 -> dep/addQuote -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("\"1\"", output.toString(StandardCharsets.UTF_8));
  }
}
