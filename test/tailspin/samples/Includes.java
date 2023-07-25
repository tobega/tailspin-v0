package tailspin.samples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import tailspin.Tailspin;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Includes {
  
  @Test
  void includeTemplates(@TempDir Path dir) throws Exception {
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

  
  @Test
  void includeSource(@TempDir Path dir) throws Exception {
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

  
  @Test
  void includeFromDeepProgram(@TempDir Path dir) throws Exception {
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

  
  @Test
  void deepInclude(@TempDir Path dir) throws Exception {
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

  
  @Test
  void includeFromOutsideDirectoryNotAllowed(@TempDir Path dir) throws Exception {
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

  
  @Test
  void noStatementsOrUnusedDefinitionsRunInImportedFiles(@TempDir Path dir) throws Exception {
    String dep = """
            source quote '"1"' ! end quote
            def b: 'unused' -> \\($ -> !OUT::write $!\\);
            'bad' -> !OUT::write""";
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

  
  @Test
  void includedDepsRunInSourceOrder(@TempDir Path dir) throws Exception {
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

  
  @Test
  void includeSink(@TempDir Path dir) throws Exception {
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

  
  @Test
  void packageTemplatesRunInPackageScope(@TempDir Path dir) throws Exception {
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

  
  @Test
  void cannotIncludeModule(@TempDir Path dir) throws Exception {
    String dep = "templates quote '\"$;\"' ! end quote";
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = "include 'module:dep'\n 1 -> dep/quote -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(baseDir, input, output, List.of()));
  }

  
  @Test
  void includeReprefixed(@TempDir Path dir) throws Exception {
    String dep = "templates quote '\"$;\"' ! end quote";
    Path depFile = dir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "include q from 'dep'\n 1 -> q/quote -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("\"1\"", output.toString(StandardCharsets.UTF_8));
  }
}
