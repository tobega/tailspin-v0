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

public class Testing {
  @Test
  void passingTest() throws Exception {
    String program = """
        test 'A passing test'
        assert 1 <=1> '1 is 1'
        end 'A passing test'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void failingTest() throws Exception {
    String program = """
        test 'A failing test'
        assert 1 <=0> '1 is 0'
        end 'A failing test'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("""
        A failing test failed:
        assertion that 1 is 0 failed with value 1
        """, output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void twoFailingTests() throws Exception {
    String program = """
        test 'Two failing tests'
        assert 1 <=0> '1 is 0'
        assert 1 <=2> '1 is 2'
        end 'Two failing tests'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("""
        Two failing tests failed:
        assertion that 1 is 0 failed with value 1
        assertion that 1 is 2 failed with value 1
        """, output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void noTestsRunInNormalMode() throws Exception {
    String program = """
        5 -> !OUT::write
        test 'A test'
        assert 1 -> \\($ -> !OUT::write $! \\) <=0> '1 is 0'
        end 'A test'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void setUpCode() throws Exception {
    String program = """
        test 'Set up'
        def a: 1;
        assert $a + 1 <=2> 'a+1=2'
        end 'Set up'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void useOuterDefinitions() throws Exception {
    String program = """
        def a: 1;
        test 'A passing test'
        assert $a <=1> 'a is 1'
        end 'A passing test'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void useTransitiveOuterDefinitions() throws Exception {
    String program = """
        def aa: -1; def a: $aa + 2;
        test 'A passing test'
        assert $a <=1> 'a is 1'
        end 'A passing test'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void runOuterDefinitionsInProgramOrder() throws Exception {
    String program = """
        def a: 1 -> \\($ -> !OUT::write $!\\);
        def b: 2 -> \\($ -> !OUT::write $!\\);
        test 'A passing test'
        assert $b <=2> 'b is 2'
        assert $a <=1> 'a is 1'
        end 'A passing test'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("12Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dontRunUnusedOuterDefinitionsOrStatements() throws Exception {
    String program = """
        def a: 1;
        'print $a;' -> !OUT::write
        def b: 'unused' -> \\($ -> !OUT::write $!\\);
        'print $b;' -> !OUT::write
        test 'A passing test'
        assert $a <=1> 'a is 1'
        end 'A passing test'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void testsAreInitializedIndependently() throws Exception {
    String program = """
        def a: 1 -> \\($ -> !OUT::write $!\\);
        def b: 2 -> \\($ -> !OUT::write $!\\);
        test 'Just b'
        assert $b <=2> 'b is 2'
        end 'Just b'test 'a and b'
        assert $b <=2> 'b is 2'
        assert $a <=1> 'a is 1'
        end 'a and b'""";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("212Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dontRequireBindingOfInternalSymbolsUsedInMatcherBlock() throws Exception {
    String program = """
        templates outer
        def inner: 1;
        $ -> #
        <> $inner !
        end outer
        test 'A passing test'
        assert 2 -> outer <=1> 'outer gives 1'
        end 'A passing test'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dontRequireBindingOfParameters() throws Exception {
    String program = """
        templates outer&{param:}
        $param !
        end outer
        test 'A passing test'
        assert 2 -> outer&{param: 1} <=1> 'outer gives 1'
        end 'A passing test'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dontRequireBindingOfLoopVariables() throws Exception {
    String program = """
        templates outer
        [$] -> \\[i]($i !\\) -> $(1) !
        end outer
        test 'A passing test'
        assert 2 -> outer <=1> 'outer gives 1'
        end 'A passing test'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mockShadowCoreSystem() throws Exception {
    String program = """
        sink hello
          'Hello $;' -> !OUT::write
        end hello
        test 'hello'
          use shadowed core-system/
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
            end core-system/
          'John' -> !hello
          assert $OUT::next <='Hello John'> 'Wrote greeting'
        end 'hello'""";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mockShadowCoreSystemInherits() throws Exception {
    String program = """
        sink hello
          'Hello $;' -> !OUT::write
        end hello
        test 'hello'
          use shadowed core-system/
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
            end core-system/
          $IN::lines -> !hello
          assert $OUT::next <='Hello John'> 'Wrote greeting'
        end 'hello'""";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("John".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void mockImportCoreSystem(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
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
    Path depFile = dir.resolve("mocksys.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = """
        sink hello
          'Hello $;' -> !OUT::write
        end hello
        test 'hello'
          use core-system/ from 'mocksys' stand-alone
          'John' -> !hello
          assert $OUT::next <='Hello John'> 'Wrote greeting'
        end 'hello'""";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(dir, input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void mockImportCoreSystemDoesNotInherit(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
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
    Path depFile = dir.resolve("mocksys.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = """
        sink hello
          'Hello $;' -> !OUT::write
        end hello
        test 'hello'
          use core-system/ from 'mocksys' stand-alone
          $IN::lines -> !hello
          assert $OUT::next <='Hello John'> 'Wrote greeting'
        end 'hello'""";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("John".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.runTests(dir, input, output, List.of()));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void testUsesInclude(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
        def greeting: 'Hello';
        templates greet
          '$greeting; $;' !
        end greet""";
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = """
        include 'hi'
        templates hello
          $ -> hi/greet !
        end hello
        test 'hello'
          assert 'John' -> hello <='Hello John'> 'Wrote greeting'
        end 'hello'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(dir, input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void testUsesModule(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
        def greeting: 'Hello';
        templates greet
          '$greeting; $;' !
        end greet""";
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = """
        use 'hi' stand-alone
        templates hello
          $ -> hi/greet !
        end hello
        test 'hello'
          assert 'John' -> hello <='Hello John'> 'Wrote greeting'
        end 'hello'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(dir, input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void testUsesModuleUsingCoreSystem(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = """
        def greeting: 'Hello';
        templates greet
          $ -> !OUT::write
          '$greeting; $;' !
        end greet""";
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = """
        use 'hi' with core-system/ inherited provided
        templates hello
          $ -> hi/greet !
        end hello
        test 'hello'
          assert 'John' -> hello <='Hello John'> 'Wrote greeting'
        end 'hello'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(dir, input, output, List.of());

    assertEquals("JohnPass", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void moduleUsesMockedCoreSystem(@TempDirectory.TempDir Path dir) throws Exception {
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
        def greeting: 'Hello';
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
        test 'hello'
          use core-system/ from 'mocksys' stand-alone
          'John' -> !hello
          assert $OUT::next <='Hello John'> 'Wrote greeting'
        end 'hello'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(dir, input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void mockShadowModule(@TempDirectory.TempDir Path dir) throws Exception {
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
        def greeting: 'Hello';
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
        test 'hello'
          use core-system/ from 'mocksys' stand-alone
          use shadowed hi
            with core-system/ inherited
            provided
            sink greet
              'Hello, $;' -> !OUT::write
            end greet
          end hi  '$hi/greeting; John' -> !hello
          assert $OUT::next <='Hello, Hello John'> 'Wrote greeting'
        end 'hello'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(dir, input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void mockRenamedShadowModule(@TempDirectory.TempDir Path dir) throws Exception {
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
        def greeting: 'Hello';
        sink greet
          '$greeting; $;' -> !OUT::write
        end greet""";
    Path depFile = dir.resolve("hi2.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = """
        use 'hi2' with core-system/ inherited provided
        sink hello
          $ -> !hi/greet
        end hello
        test 'hello'
          use core-system/ from 'mocksys' stand-alone
          use hi from shadowed hi2
            with core-system/ inherited
            provided
            sink greet
              'Hello, $;' -> !OUT::write
            end greet
          end hi2  '$hi/greeting; John' -> !hello
          assert $OUT::next <='Hello, Hello John'> 'Wrote greeting'
        end 'hello'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(dir, input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void mockShadowModuleDoesNotAutomaticallyGetInjectedModules(@TempDirectory.TempDir Path dir) throws Exception {
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
        def greeting: 'Hello';
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
        test 'hello'
          use core-system/ from 'mocksys' stand-alone
          use shadowed hi
            sink greet
              'Hello, $;' -> !OUT::write
            end greet
          end hi  '$hi/greeting; John' -> !hello
          assert $OUT::next <='Hello, Hello John'> 'Wrote greeting'
        end 'hello'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.runTests(dir, input, output, List.of()));
  }

  @Test
  void modifiesOuterProgram() throws Exception {
    String program = """
        def foo: 2;
        def bar: $foo * 3;
        test 'A modifying test'
        modify program
        def foo: 1;
        end program
        assert $bar <=3> 'foo is modified to 1'
        end 'A modifying test'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void modificationOfOuterProgramDependsOnSymbols() throws Exception {
    String program = """
        def foo: 2;
        def bar: $foo * 3;
        test 'A modifying test'
        modify program
        def bar: $foo * 2;
        end program
        assert $bar <=4> 'bar is modified to twice foo'
        end 'A modifying test'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void modificationOfOuterProgramRedefinesAllSymbols() throws Exception {
    String program = """
        def foo: 2;
        def bar: $foo * 3;
        test 'A modifying test'
        modify program
        def foo: 1;
        def bar: $foo * 2;
        end program
        assert $bar <=2> 'foo is 1 and bar is modified to twice foo'
        end 'A modifying test'""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void interleavedDefinitionsInModificationOfOuterProgram() throws Exception {
    String program = """
        def one: 1;
        def two: $one + 1;
        def three: $two + 1;
        def four: $three + 1;
        test 'A modifying test'
        modify program
        def two: $one + 11;
        def four: $three + 31;
        end program
        assert $four <=44> 'messy stuff'
        end 'A modifying test'
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dataDefinitionInTestAppliesToOuterTemplates() throws Exception {
    String program = """
        templates keyify
          [$... -> (key:$)] !
        end keyify
        test 'test-internal datatype'
        data key <>
        assert [1, 'a'] -> keyify <=[(key:1), (key:'a')]> 'key values'
        end 'test-internal datatype'
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dataDefinitionInTestAppliesToOuterComposer() throws Exception {
    String program = """
        composer keyify
          [<value>+]
          rule value: <INT|'\\w+'> -> (key:$) (<WS>?)
        end keyify
        test 'test-internal datatype'
        data key <>
        assert '1 a' -> keyify <=[(key:1), (key:'a')]> 'key values'
        end 'test-internal datatype'
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dataDefinitionInTestAppliesToOuterProcessor() throws Exception {
    String program = """
        processor keyify
          @: [$... -> (key:$)];
          source get
            $@keyify !
          end get
        end keyify
        test 'test-internal datatype'
        data key <>
        assert [1, 'a'] -> keyify -> $::get <=[(key:1), (key:'a')]> 'key values'
        end 'test-internal datatype'
    """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }
}
