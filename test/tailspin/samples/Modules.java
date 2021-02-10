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

public class Modules {
  @ExtendWith(TempDirectory.class)
  @Test
  void useModule(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "templates quote '\"$;\"' ! end quote";
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = "use 'module:dep' stand-alone\n 1 -> dep/quote -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("\"1\"", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void useRenamedModule(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "templates quote '\"$;\"' ! end quote";
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = "use q from 'module:dep' stand-alone\n 1 -> q/quote -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("\"1\"", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void moduleDoesNotAutomaticallyInheritCoreSystem(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "sink quote '\"$;\"' -> !OUT::write end quote";
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = "use 'module:dep' stand-alone\n 1 -> !dep/quote";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(baseDir, input, output, List.of()));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void moduleProvidedWithPartiallyUnprovidedCoreSystem(@TempDirectory.TempDir Path dir) throws Exception {
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    String dep = "sink quote '\"$;\"' -> !OUT::write end quote";
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String core = "processor Input\n"
        + "@:$;\n"
        + "source lines $@... ! end lines\n"
        + "end Input\n"
        + "def IN: ['a', 'b'] -> Input;";
    Path coreFile = moduleDir.resolve("core.tt");
    Files.writeString(coreFile, core, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = "use 'module:dep' with\n"
        + "core-system/ from 'module:core' with super inherited from core-system/ provided\n"
        + "provided\n 1 -> !dep/quote";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(baseDir, input, output, List.of()));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void moduleProvidedWithPartiallyProvidedCoreSystem(@TempDirectory.TempDir Path dir) throws Exception {
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    String dep = "sink quote '\"$;\"' -> !OUT::write end quote";
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String core = "processor Output\n"
        + "sink write 'foo' -> !super/OUT::write end write\n"
        + "end Output\n"
        + "def OUT: $Output;";
    Path coreFile = moduleDir.resolve("core.tt");
    Files.writeString(coreFile, core, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = "use 'module:dep' with\n"
        + "core-system/ from 'module:core' with super inherited from core-system/ provided\n"
        + "provided\n 1 -> !dep/quote";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("foo", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void moduleProvidedWithInheritedCoreSystem(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "sink quote '\"$;\"' -> !OUT::write end quote";
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = "use 'module:dep' with core-system/ inherited provided\n 1 -> !dep/quote";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("\"1\"", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void useIncludableModule(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "def greeting: 'Salut';\n"
        + "sink greet\n"
        + "  '$greeting; $;' -> !OUT::write\n"
        + "end greet";
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "use 'hi' with core-system/ inherited provided\n"
        + "sink hello\n"
        + "  $ -> !hi/greet\n"
        + "end hello\n"

        + "'John' -> !hello\n";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("Salut John", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void useModifiedImport(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "def greeting: 'Hello';\n"
        + "sink greet\n"
        + "  '$greeting; $;' -> !OUT::write\n"
        + "end greet";
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program =
        "  use modified 'hi'\n"
            + "  with core-system/ inherited\n"
            + "  provided\n"
            + "  def greeting: 'Goodbye';\n"
            + "  end 'hi'\n"
        + "sink hello\n"
        + "  $ -> !hi/greet\n"
        + "end hello\n"

        + "'John' -> !hello\n";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("Goodbye John", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void useRenamedModifiedImport(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "def greeting: 'Hello';\n"
        + "sink greet\n"
        + "  '$greeting; $;' -> !OUT::write\n"
        + "end greet";
    Path depFile = dir.resolve("hi2.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program =
        "  use hi from modified 'hi2'\n"
            + "  with core-system/ inherited\n"
            + "  provided\n"
            + "  def greeting: 'Goodbye';\n"
            + "  end 'hi2'\n"
        + "sink hello\n"
        + "  $ -> !hi/greet\n"
        + "end hello\n"

        + "'John' -> !hello\n";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("Goodbye John", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void wrapCore() throws Exception {
    String program = "use shadowed core-system/ with super inherited from core-system/ provided\n"
        + "  processor ShadowOut\n"
        + "    sink write\n"
        + "      '-$;-' -> !super/OUT::write\n"
        + "    end write\n"
        + "  end ShadowOut\n"
        + "  def OUT: $ShadowOut;\n"
        + "end core-system/\n"
        + "'Hello World' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("-Hello World-", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void moduleInheritsWrappedCore(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "def greeting: 'Salut';\n"
        + "sink greet\n"
        + "  '$greeting; $;' -> !OUT::write\n"
        + "end greet";
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "use shadowed core-system/ with super inherited from core-system/ provided\n"
        + "  processor ShadowOut\n"
        + "    sink write\n"
        + "      '-$;-' -> !super/OUT::write\n"
        + "    end write\n"
        + "  end ShadowOut\n"
        + "  def OUT: $ShadowOut;\n"
        + "end core-system/\n"
        + "use 'hi' with core-system/ inherited provided\n"
        + "sink hello\n"
        + "  $ -> !hi/greet\n"
        + "end hello\n"

        + "'John' -> !hello\n";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("-Salut John-", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void moduleWithoutCoreSystemUsesBuiltins(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "templates gauss 1..$ -> ..=Sum&{of: :()}! end gauss";
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = "use 'module:dep' stand-alone\n 4 -> dep/gauss -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("10", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void modifiedModuleWithoutCoreSystemUsesBuiltins(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "templates gauss 1..$ -> ..=Sum&{of: :()}! end gauss";
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = "use modified 'module:dep' def foo: 8; end 'module:dep'\n 4 -> dep/gauss -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("10", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void modificationOfModuleWithoutCoreSystemUsesBuiltins(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "def foo: 8;";
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = "use modified 'module:dep' templates gauss 1..$ -> ..=Sum&{of: :()}! end gauss end 'module:dep'\n"
        + "4 -> dep/gauss -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("10", output.toString(StandardCharsets.UTF_8));
  }
}
