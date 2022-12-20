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
    String core = """
        processor Input
        @:$;
        source lines $@... ! end lines
        end Input
        def IN: ['a', 'b'] -> Input;""";
    Path coreFile = moduleDir.resolve("core.tt");
    Files.writeString(coreFile, core, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = """
        use 'module:dep' with
        core-system/ from 'module:core' stand-alone
        provided
         1 -> !dep/quote""";
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
    String core = """
        processor Output
        sink write 'foo' -> !super/OUT::write end write
        end Output
        def OUT: $Output;""";
    Path coreFile = moduleDir.resolve("core.tt");
    Files.writeString(coreFile, core, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = """
        use 'module:dep' with
        core-system/ from 'module:core' with super inherited from core-system/ provided
        provided
         1 -> !dep/quote""";
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
    String dep = """
        def greeting: 'Salut';
        sink greet
          '$greeting; $;' -> !OUT::write
        end greet""";
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = """
        use 'hi' with core-system/ inherited provided
        sink hello
          $ -> !hi/greet
        end hello
        'John' -> !hello
        """;
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
    String dep = """
        def greeting: 'Hello';
        sink greet
          '$greeting; $;' -> !OUT::write
        end greet""";
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program =
        """
              use modified 'hi'
              with core-system/ inherited
              provided
              def greeting: 'Goodbye';
              end 'hi'
            sink hello
              $ -> !hi/greet
            end hello
            'John' -> !hello
            """;
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
    String dep = """
        def greeting: 'Hello';
        sink greet
          '$greeting; $;' -> !OUT::write
        end greet""";
    Path depFile = dir.resolve("hi2.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program =
        """
              use hi from modified 'hi2'
              with core-system/ inherited
              provided
              def greeting: 'Goodbye';
              end 'hi2'
            sink hello
              $ -> !hi/greet
            end hello
            'John' -> !hello
            """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("Goodbye John", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void wrapCore() throws Exception {
    String program = """
        use shadowed core-system/ with super inherited from core-system/ provided
          processor ShadowOut
            sink write
              '-$;-' -> !super/OUT::write
            end write
          end ShadowOut
          def OUT: $ShadowOut;
        end core-system/
        'Hello World' -> !OUT::write""";
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
    String dep = """
        def greeting: 'Salut';
        sink greet
          '$greeting; $;' -> !OUT::write
        end greet""";
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = """
        use shadowed core-system/ with super inherited from core-system/ provided
          processor ShadowOut
            sink write
              '-$;-' -> !super/OUT::write
            end write
          end ShadowOut
          def OUT: $ShadowOut;
        end core-system/
        use 'hi' with core-system/ inherited provided
        sink hello
          $ -> !hi/greet
        end hello
        'John' -> !hello
        """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("-Salut John-", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void moduleInheritsConfiguredModule(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
        def greeting: 'Salut';
        sink greet
          '$greeting; $;' -> !OUT::write
        end greet""";
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String other = """
        sink hail
          'Jolly $;' -> !hi/greet
        end hail""";
    Path otherFile = dir.resolve("pirate.tt");
    Files.writeString(otherFile, other, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = """
        use 'hi' with core-system/ inherited provided
        use 'pirate' with hi inherited provided
        sink hello
          $ -> !pirate/hail
        end hello
        'Roger' -> !hello
        """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("Salut Jolly Roger", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void moduledependsOnModule(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
        def greeting: 'Salut';
        sink greet
          '$greeting; $;' -> !OUT::write
        end greet""";
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String other = """
        sink greet
          'Jolly $;' -> !hi/greet
        end greet""";
    Path otherFile = dir.resolve("pirate.tt");
    Files.writeString(otherFile, other, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = """
        use 'pirate' with
          'hi' with core-system/ inherited provided
        provided
        sink hello
          $ -> !pirate/greet
        end hello
        'Roger' -> !hello
        """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("Salut Jolly Roger", output.toString(StandardCharsets.UTF_8));
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
    runner.run(baseDir, input, output, List.of());

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
    runner.run(baseDir, input, output, List.of());

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
    runner.run(baseDir, input, output, List.of());

    assertEquals("10", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void dataDefinitionWorksInModuleTemplates(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
        templates keyify
          [$... -> (key:$)] !
        end keyify
    """;
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = """
    use 'module:dep' stand-alone
    data key <>
    [1, 'a'] -> dep/keyify -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("[key: 1, key: a]", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void dataDefinitionWorksInModuleComposer(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
        composer keyify
          [<value>+]
          rule value: <INT|'\\w+'> -> (key:$) (<WS>?)
        end keyify
    """;
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = """
    use 'module:dep' stand-alone
    data key <>
    '1 a' -> dep/keyify -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("[key: 1, key: a]", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void dataDefinitionWorksInModuleProcessor(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
        processor keyify
          @: [$... -> (key:$)];
          source get
            $@keyify !
          end get
        end keyify
    """;
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = """
    use 'module:dep' stand-alone
    data key <>
    [1, 'a'] -> dep/keyify -> $::get -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("[key: 1, key: a]", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void noStatementsOrUnusedDefinitionsRunInModule(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
        source quote '"1"' ! end quote
        def b: 'unused' -> \\($ -> !OUT::write $!\\);
        'bad' -> !OUT::write""";
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = "use 'module:dep' with core-system/ inherited provided\n $dep/quote -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("\"1\"", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void noStatementsOrUnusedDefinitionsRunInIncludableModule(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
        source quote '"1"' ! end quote
        def b: 'unused' -> \\($ -> !OUT::write $!\\);
        'bad' -> !OUT::write""";
    Path depFile = dir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "use 'dep' with core-system/ inherited provided\n $dep/quote -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("\"1\"", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void inheritedModuleWithDualUsageRunsOnceInRequestedOrder(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
        def a: 'a' -> \\($ -> !OUT::write $!\\);
        def b: 'b' -> \\($ -> !OUT::write $!\\);
        """;
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String other = """
        def c: 'c$dep/b;c';
        """;
    Path otherFile = moduleDir.resolve("other.tt");
    Files.writeString(otherFile, other, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = """
        use 'module:dep' with core-system/ inherited provided
        use 'module:other' with dep inherited provided
        'p$other/c;p' -> !OUT::write
        'p$dep/a;p' -> !OUT::write
        'p$dep/b;p' -> !OUT::write
        """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("bapcbcppappbp", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void moduleWithDifferentDepIsSeparatelyLoaded(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
        def b: 'b' -> \\($ -> !OUT::write $!\\);
        """;
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String common = """
        def c: 'c$dep/b;c' -> \\($ -> !OUT::write $!\\);
        """;
    Path commonFile = moduleDir.resolve("common.tt");
    Files.writeString(commonFile, common, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String other = """
        def val: 'v$common/c;v';
        """;
    Path otherFile = moduleDir.resolve("other.tt");
    Files.writeString(otherFile, other, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = """
        use 'module:dep' with core-system/ inherited provided
        use 'module:common' with dep inherited core-system/ inherited provided
        use 'module:other' with
          'module:common' with
            shadowed dep with core-system/ inherited provided def b: 'B'; end dep
            core-system/ inherited
          provided
        provided
        'p$common/c;p' -> !OUT::write
        '$other/val;' -> !OUT::write
        """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    // I suppose the order may vary here
    assertEquals("cBcbcbcpcbcpvcBcv", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void modifiedModuleInheritsAndOverridesVirtually(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
        def foo: 2 -> \\($ -> !OUT::write $!\\);
        def a: 'a' -> \\($ -> !OUT::write $!\\);
        def b: '$a;b' -> \\($ -> !OUT::write $!\\);
        """;
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = """
        use modified 'module:dep' with core-system/ inherited provided
          def a: '$foo;A';
        end 'module:dep'
        'p$dep/b;p' -> !OUT::write
        """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("22Abp2Abp", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void moduleModificationCanAccessOverriddenDefinition(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
        def a: 'a' -> \\($ -> !OUT::write $!\\);
        """;
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = """
        use modified 'module:dep' with core-system/ inherited provided
          def a: '$*a;A';
        end 'module:dep'
        'p$dep/a;p' -> !OUT::write
        """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("apaAp", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void noSneakyAccessToOverriddenDefinition(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
        def a: 'a' -> \\($ -> !OUT::write $!\\);
        """;
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = """
        use modified 'module:dep' with core-system/ inherited provided
          def a: '$*a;A';
        end 'module:dep'
        'p$dep/*a;p' -> !OUT::write
        """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(baseDir, input, output, List.of()));
  }
}
