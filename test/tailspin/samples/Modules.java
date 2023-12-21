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

public class Modules {
  @Test
  void useModule(@TempDir Path dir) throws Exception {
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

  @Test
  void useRenamedModule(@TempDir Path dir) throws Exception {
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

  @Test
  void moduleDoesNotAutomaticallyInheritCoreSystem(@TempDir Path dir) throws Exception {
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

  @Test
  void moduleProvidedWithPartiallyUnprovidedCoreSystem(@TempDir Path dir) throws Exception {
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

  
  @Test
  void moduleProvidedWithPartiallyProvidedCoreSystem(@TempDir Path dir) throws Exception {
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

  
  @Test
  void moduleProvidedWithInheritedCoreSystem(@TempDir Path dir) throws Exception {
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

  
  @Test
  void useIncludableModule(@TempDir Path dir) throws Exception {
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

  
  @Test
  void useModifiedImport(@TempDir Path dir) throws Exception {
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

  
  @Test
  void useRenamedModifiedImport(@TempDir Path dir) throws Exception {
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

  
  @Test
  void moduleInheritsWrappedCore(@TempDir Path dir) throws Exception {
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

  
  @Test
  void moduleInheritsConfiguredModule(@TempDir Path dir) throws Exception {
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

  
  @Test
  void moduledependsOnModule(@TempDir Path dir) throws Exception {
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

  
  @Test
  void moduleWithoutCoreSystemUsesBuiltins(@TempDir Path dir) throws Exception {
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

  
  @Test
  void modifiedModuleWithoutCoreSystemUsesBuiltins(@TempDir Path dir) throws Exception {
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

  
  @Test
  void modificationOfModuleWithoutCoreSystemUsesBuiltins(@TempDir Path dir) throws Exception {
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

  
  @Test
  void dataDefinitionWorksInModuleTemplates(@TempDir Path dir) throws Exception {
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

  
  @Test
  void dataDefinitionWorksInModuleComposer(@TempDir Path dir) throws Exception {
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

  
  @Test
  void dataDefinitionWorksInModuleProcessor(@TempDir Path dir) throws Exception {
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

  
  @Test
  void noStatementsOrUnusedDefinitionsRunInModule(@TempDir Path dir) throws Exception {
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

  
  @Test
  void noStatementsOrUnusedDefinitionsRunInIncludableModule(@TempDir Path dir) throws Exception {
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

  @Test
  void inheritedModuleContainsThingsOnlyUsedByInheritor(@TempDir Path dir) throws Exception {
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
        """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("bapcbcppap", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void inheritedModuleIsSeparatelyInstantiated(@TempDir Path dir) throws Exception {
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
    String other = """
        def c: $foo/a;
        """;
    Path otherFile = moduleDir.resolve("other.tt");
    Files.writeString(otherFile, other, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = """
        use 'module:dep' with core-system/ inherited provided
        use 'module:other' with foo inherited from dep provided
        3 -> !dep/a::increment
        5 -> !other/c::increment
        '$dep/a::value; $other/c::value;' -> !OUT::write
        """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("3 5", output.toString(StandardCharsets.UTF_8));
  }

  
  @Test
  void moduleWithDifferentDepIsSeparatelyLoaded(@TempDir Path dir) throws Exception {
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

  
  @Test
  void modifiedModuleInheritsAndOverridesVirtually(@TempDir Path dir) throws Exception {
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

  
  @Test
  void moduleModificationCanAccessOverriddenDefinition(@TempDir Path dir) throws Exception {
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

  
  @Test
  void noSneakyAccessToOverriddenDefinition(@TempDir Path dir) throws Exception {
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

  @Test
  void dataDefinitionInModuleWorks(@TempDir Path dir) throws Exception {
    String dep = """
        data key <>
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
    [1, 'a'] -> dep/keyify -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("[key: 1, key: a]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void moduleDoesNotExposeCoreModule(@TempDir Path dir) throws Exception {
    String mockedCore = """
        processor MockOut
          @: [];
          sink write
            ..|@MockOut: $;
          end write
          source next
            ^@MockOut(1) !
          end next
        end MockOut
        def OUT: $MockOut;
        """;
    Path mockedCoreFile = dir.resolve("mocksys.tt");
    Files.writeString(mockedCoreFile, mockedCore, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String dep = """
        sink greet
          'Hello $;' -> !OUT::write
        end greet
        """;
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = """
        use 'hi' with core-system/ from 'mocksys' stand-alone provided
        'Anna' -> !hi/greet
        $hi/OUT::next -> !OUT::write
        """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(dir, input, output, List.of()));
  }

  @Test
  void moduleCanUseIncludedFile(@TempDir Path dir) throws Exception {
    String inc = """
        def boo: 'Boo!';
        """;
    Path mockedCoreFile = dir.resolve("inc.tt");
    Files.writeString(mockedCoreFile, inc, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String dep = """
        include 'inc'
        source scare
          $boo!
        end scare
        """;
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = """
        use 'hi' with core-system/ inherited provided
        $hi/scare -> !OUT::write
        """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(dir, input, output, List.of());

    assertEquals("Boo!", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void moduleDoesNotExposeIncludedFileSymbols(@TempDir Path dir) throws Exception {
    String inc = """
        def boo: 'Boo!';
        """;
    Path mockedCoreFile = dir.resolve("inc.tt");
    Files.writeString(mockedCoreFile, inc, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String dep = """
        include 'inc'
        source scare
          $boo!
        end scare
        """;
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = """
        use 'hi' with core-system/ inherited provided
        $hi/boo -> !OUT::write
        """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(dir, input, output, List.of()));
  }

  @Test
  void useSymbolSetFromModule(@TempDir Path dir) throws Exception {
    String dep = """
      data colour #{red, white, blue}
    """;
    Path moduleDir = Files.createDirectory(dir.resolve("modules"));
    System.setProperty("TAILSPIN_MODULES", moduleDir.toString());
    Path depFile = moduleDir.resolve("dep.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    Path baseDir = Files.createDirectory(dir.resolve("wd"));
    String program = """
      use 'module:dep' stand-alone
      { dep/colour#: dep/colour#white } -> !OUT::write
      { dep/colour#: dep/colour#white } -> $.dep/colour# -> !OUT::write
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(baseDir, input, output, List.of());

    assertEquals("{dep/colour#: white}white", output.toString(StandardCharsets.UTF_8));
  }
}
