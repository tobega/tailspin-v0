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
import org.junit.jupiter.api.io.TempDir;
import tailspin.Tailspin;

public class Includes {
  
  @Test
  void includeTemplates(@TempDir Path dir) throws Exception {
    String dep = "templates quote '\"$;\"' ! end quote";
    Path depFile = dir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "include 'dep'\n 1 -> quote -> !OUT::write";
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
    String program = "include 'dep'\n $quote -> !OUT::write";
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
    String program = "include 'dep'\n $quote -> !OUT::write";
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
    String program = "include 'lib/dep'\n $quote -> !OUT::write";
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
    String program = "include 'dep'\n $quote -> !OUT::write";
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
    String program = "include 'dep'\n $b -> !OUT::write\n $a -> !OUT::write";
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
    String program = "include 'dep'\n 1 -> !quote";
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
    String program = "include 'dep'\n 1 -> addQuote -> !OUT::write";
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
  void moduleInstancesAreSharedWithIncludedFiles(@TempDir Path dir) throws Exception {
    String dep = """
        processor Count
          @: 0;
          sink increment
            @Count: $@Count + $;
          end increment
          source value
            $@Count!
          end value
        end Count
        
        def a: $Count;
        """;
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String other = """
        def c: $dep/a;
        """;
    Path otherFile = baseDir.resolve("other.tt");
    Files.writeString(otherFile, other, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = """
        use 'module:dep' with core-system/ inherited provided
        include 'other'
        3 -> !dep/a::increment
        5 -> !c::increment
        '$dep/a::value; $c::value;' -> !OUT::write
        """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("8 8", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void includeFilesAreSharedBetweenIncludedFiles(@TempDir Path dir) throws Exception {
    String dep = """
        processor Count
          @: 0;
          sink increment
            @Count: $@Count + $;
          end increment
          source value
            $@Count!
          end value
        end Count
        
        def a: $Count;
        """;
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    Path depFile = baseDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String other = """
        include 'dep'
        def c: $a;
        """;
    Path otherFile = baseDir.resolve("other.tt");
    Files.writeString(otherFile, other, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = """
        include 'dep'
        include 'other'
        3 -> !a::increment
        5 -> !c::increment
        '$a::value; $c::value;' -> !OUT::write
        """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("8 8", output.toString(StandardCharsets.UTF_8));
  }
}
