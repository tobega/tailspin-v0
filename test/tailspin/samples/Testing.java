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
    String program = "test 'A passing test'\n"
        + "assert 1 <=1> '1 is 1'\n"
        + "end 'A passing test'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void failingTest() throws Exception {
    String program = "test 'A failing test'\n"
        + "assert 1 <=0> '1 is 0'\n"
        + "end 'A failing test'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("A failing test failed:\n"
        + "assertion that 1 is 0 failed with value 1\n", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void twoFailingTests() throws Exception {
    String program = "test 'Two failing tests'\n"
        + "assert 1 <=0> '1 is 0'\n"
        + "assert 1 <=2> '1 is 2'\n"
        + "end 'Two failing tests'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Two failing tests failed:\n"
        + "assertion that 1 is 0 failed with value 1\n"
        + "assertion that 1 is 2 failed with value 1\n", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void noTestsRunInNormalMode() throws Exception {
    String program = "5 -> !OUT::write\n"
        + "test 'A test'\n"
        + "assert 1 -> \\($ -> !OUT::write $! \\) <=0> '1 is 0'\n"
        + "end 'A test'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void setUpCode() throws Exception {
    String program = "test 'Set up'\n"
        + "def a: 1;\n"
        + "assert $a + 1 <=2> 'a+1=2'\n"
        + "end 'Set up'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void useOuterDefinitions() throws Exception {
    String program = "def a: 1;\n"
        + "test 'A passing test'\n"
        + "assert $a <=1> 'a is 1'\n"
        + "end 'A passing test'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void useTransitiveOuterDefinitions() throws Exception {
    String program = "def aa: -1; def a: $aa + 2;\n"
        + "test 'A passing test'\n"
        + "assert $a <=1> 'a is 1'\n"
        + "end 'A passing test'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void runOuterDefinitionsInProgramOrder() throws Exception {
    String program = "def a: 1 -> \\($ -> !OUT::write $!\\);\n"
        + "def b: 2 -> \\($ -> !OUT::write $!\\);\n"
        + "test 'A passing test'\n"
        + "assert $b <=2> 'b is 2'\n"
        + "assert $a <=1> 'a is 1'\n"
        + "end 'A passing test'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("12Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dontRunUnusedOuterDefinitionsOrStatements() throws Exception {
    String program = "def a: 1;\n"
        + "'print $a;' -> !OUT::write\n"
        + "def b: 'unused' -> \\($ -> !OUT::write $!\\);\n"
        + "'print $b;' -> !OUT::write\n"
        + "test 'A passing test'\n"
        + "assert $a <=1> 'a is 1'\n"
        + "end 'A passing test'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void testsAreInitializedIndependently() throws Exception {
    String program = "def a: 1 -> \\($ -> !OUT::write $!\\);\n"
            + "def b: 2 -> \\($ -> !OUT::write $!\\);\n"
            + "test 'Just b'\n"
            + "assert $b <=2> 'b is 2'\n"
            + "end 'Just b'"
            + "test 'a and b'\n"
            + "assert $b <=2> 'b is 2'\n"
            + "assert $a <=1> 'a is 1'\n"
            + "end 'a and b'";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("212Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dontRequireBindingOfInternalSymbolsUsedInMatcherBlock() throws Exception {
    String program = "templates outer\n"
        + "def inner: 1;\n"
        + "$ -> #\n"
        + "<> $inner !\n"
        + "end outer\n"
        + "test 'A passing test'\n"
        + "assert 2 -> outer <=1> 'outer gives 1'\n"
        + "end 'A passing test'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dontRequireBindingOfParameters() throws Exception {
    String program = "templates outer&{param:}\n"
        + "$param !\n"
        + "end outer\n"
        + "test 'A passing test'\n"
        + "assert 2 -> outer&{param: 1} <=1> 'outer gives 1'\n"
        + "end 'A passing test'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void dontRequireBindingOfLoopVariables() throws Exception {
    String program = "templates outer\n"
        + "[$] -> \\[i]($i !\\) -> $(1) !\n"
        + "end outer\n"
        + "test 'A passing test'\n"
        + "assert 2 -> outer <=1> 'outer gives 1'\n"
        + "end 'A passing test'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mockShadowCoreSystem() throws Exception {
    String program = "sink hello\n"
            + "  'Hello $;' -> !OUT::write\n"
            + "end hello\n"

            + "test 'hello'\n"
            + "  use shadowed core-system/\n"
            + "      processor MockOut\n"
            + "        @: [];\n"
            + "        sink write\n"
            + "          ..|@MockOut: $;\n"
            + "        end write\n"
            + "        source next\n"
            + "          ^@MockOut(1) !\n"
            + "        end next\n"
            + "      end MockOut\n"

            + "      def OUT: $MockOut;\n"
            + "    end core-system/\n"

            + "  'John' -> !hello\n"
            + "  assert $OUT::next <='Hello John'> 'Wrote greeting'\n"
            + "end 'hello'";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mockShadowCoreSystemInherits() throws Exception {
    String program = "sink hello\n"
            + "  'Hello $;' -> !OUT::write\n"
            + "end hello\n"

            + "test 'hello'\n"
            + "  use shadowed core-system/\n"
            + "      processor MockOut\n"
            + "        @: [];\n"
            + "        sink write\n"
            + "          ..|@MockOut: $;\n"
            + "        end write\n"
            + "        source next\n"
            + "          ^@MockOut(1) !\n"
            + "        end next\n"
            + "      end MockOut\n"

            + "      def OUT: $MockOut;\n"
            + "    end core-system/\n"

            + "  $IN::lines -> !hello\n"
            + "  assert $OUT::next <='Hello John'> 'Wrote greeting'\n"
            + "end 'hello'";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("John".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void mockIncludeCoreSystem(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "processor MockOut\n"
        + "  @: [];\n"
        + "  sink write\n"
        + "    ..|@MockOut: $;\n"
        + "  end write\n"
        + "  source next\n"
        + "    ^@MockOut(1) !\n"
        + "  end next\n"
        + "end MockOut\n"
        + "def OUT: $MockOut;\n";
    Path depFile = dir.resolve("mocksys.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "sink hello\n"
            + "  'Hello $;' -> !OUT::write\n"
            + "end hello\n"

            + "test 'hello'\n"
            + "  use core-system/ from 'mocksys' stand-alone\n"

            + "  'John' -> !hello\n"
            + "  assert $OUT::next <='Hello John'> 'Wrote greeting'\n"
            + "end 'hello'";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(dir, input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void mockIncludeCoreSystemDoesNotInherit(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "processor MockOut\n"
        + "  @: [];\n"
        + "  sink write\n"
        + "    ..|@MockOut: $;\n"
        + "  end write\n"
        + "  source next\n"
        + "    ^@MockOut(1) !\n"
        + "  end next\n"
        + "end MockOut\n"
        + "def OUT: $MockOut;\n";
    Path depFile = dir.resolve("mocksys.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "sink hello\n"
            + "  'Hello $;' -> !OUT::write\n"
            + "end hello\n"

            + "test 'hello'\n"
            + "  use core-system/ from 'mocksys' stand-alone\n"

            + "  $IN::lines -> !hello\n"
            + "  assert $OUT::next <='Hello John'> 'Wrote greeting'\n"
            + "end 'hello'";
    Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("John".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.runTests(dir, input, output, List.of()));
  }

  @ExtendWith(TempDirectory.class)
  @Test
  void testUsesInclude(@TempDirectory.TempDir Path dir) throws Exception {
    String dep = "def greeting: 'Hello';\n"
        + "templates greet\n"
        + "  '$greeting; $;' !\n"
        + "end greet";
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "include 'hi'\n"
        + "templates hello\n"
        + "  $ -> hi/greet !\n"
        + "end hello\n"

        + "test 'hello'\n"
        + "  assert 'John' -> hello <='Hello John'> 'Wrote greeting'\n"
        + "end 'hello'";
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
    String dep = "def greeting: 'Hello';\n"
        + "templates greet\n"
        + "  '$greeting; $;' !\n"
        + "end greet";
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "use 'hi' stand-alone\n"
        + "templates hello\n"
        + "  $ -> hi/greet !\n"
        + "end hello\n"

        + "test 'hello'\n"
        + "  assert 'John' -> hello <='Hello John'> 'Wrote greeting'\n"
        + "end 'hello'";
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
    String dep = "def greeting: 'Hello';\n"
        + "templates greet\n"
        + "  $ -> !OUT::write\n"
        + "  '$greeting; $;' !\n"
        + "end greet";
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "use 'hi' with core-system/ inherited provided\n"
        + "templates hello\n"
        + "  $ -> hi/greet !\n"
        + "end hello\n"

        + "test 'hello'\n"
        + "  assert 'John' -> hello <='Hello John'> 'Wrote greeting'\n"
        + "end 'hello'";
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
    String mockedCore = "processor MockOut\n"
        + "  @: [];\n"
        + "  sink write\n"
        + "    ..|@MockOut: $;\n"
        + "  end write\n"
        + "  source next\n"
        + "    ^@MockOut(1) !\n"
        + "  end next\n"
        + "end MockOut\n"
        + "def OUT: $MockOut;\n";
    Path mockedCoreFile = dir.resolve("mocksys.tt");
    Files.writeString(mockedCoreFile, mockedCore, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String dep = "def greeting: 'Hello';\n"
        + "sink greet\n"
        + "  '$greeting; $;' -> !OUT::write\n"
        + "end greet";
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "use 'hi' with core-system/ inherited provided\n"
        + "sink hello\n"
        + "  $ -> !hi/greet\n"
        + "end hello\n"

        + "test 'hello'\n"
        + "  use core-system/ from 'mocksys' stand-alone\n"

        + "  'John' -> !hello\n"
        + "  assert $OUT::next <='Hello John'> 'Wrote greeting'\n"
        + "end 'hello'";
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
    String mockedCore = "processor MockOut\n"
        + "  @: [];\n"
        + "  sink write\n"
        + "    ..|@MockOut: $;\n"
        + "  end write\n"
        + "  source next\n"
        + "    ^@MockOut(1) !\n"
        + "  end next\n"
        + "end MockOut\n"
        + "def OUT: $MockOut;\n";
    Path mockedCoreFile = dir.resolve("mocksys.tt");
    Files.writeString(mockedCoreFile, mockedCore, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String dep = "def greeting: 'Hello';\n"
        + "sink greet\n"
        + "  '$greeting; $;' -> !OUT::write\n"
        + "end greet";
    Path depFile = dir.resolve("hi.tt");
    Files.writeString(depFile, dep, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
    String program = "use 'hi' with core-system/ inherited provided\n"
        + "sink hello\n"
        + "  $ -> !hi/greet\n"
        + "end hello\n"

        + "test 'hello'\n"
        + "  use core-system/ from 'mocksys' stand-alone\n"
        + "  use shadowed hi\n"
        + "    with core-system/ inherited\n"
        + "    provided\n"
        + "    sink greet\n"
        + "      'Hello, $;' -> !OUT::write\n"
        + "    end greet\n"
        + "  end hi"

        + "  '$hi/greeting; John' -> !hello\n"
        + "  assert $OUT::next <='Hello, Hello John'> 'Wrote greeting'\n"
        + "end 'hello'";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.runTests(dir, input, output, List.of());

    assertEquals("Pass", output.toString(StandardCharsets.UTF_8));
  }
}
