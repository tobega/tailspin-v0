package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Processor {
  @Test
  void simple() throws Exception {
    String program =
        "processor Holder\n"
            + "@: $;\n"
            + "templates add\n"
            + "  $ + $@Holder !\n"
            + "end add\n"
            + "end Holder\n"
            + "def five: 5 -> Holder;\n"
            + "1..3 -> five::add -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("678", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void noHiddenThisAccess() throws Exception {
    String program =
        "processor Holder\n"
            + "@: $;\n"
            + "templates add\n"
            + "  $ + $@Holder !\n"
            + "end add\n"
            + "end Holder\n"
            + "def five: 5 -> Holder;\n"
            + "templates bad\n"
            + "  $five::add !\n"
            + "end bad\n"
            + "1..3 -> bad -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void explicitThisAccessOK() throws Exception {
    String program =
        "processor Holder\n"
            + "@: $;\n"
            + "templates add\n"
            + "  $ + $@Holder !\n"
            + "end add\n"
            + "end Holder\n"
            + "def five: 5 -> Holder;\n"
            + "templates good\n"
            + "  $->five::add !\n"
            + "end good\n"
            + "1..3 -> good -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("678", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void noThisAccessAtStartOfChainOK() throws Exception {
    String program =
        "processor Holder\n"
            + "@: $;\n"
            + "templates value\n"
            + "  $@Holder !\n"
            + "end value\n"
            + "end Holder\n"
            + "def five: 5 -> Holder;\n"
            + "templates good\n"
            + "  $five::value !\n"
            + "end good\n"
            + "1..3 -> good -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("555", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void stringInterpolateMessage() throws Exception {
    String program =
        "processor Holder\n"
            + "@: $;\n"
            + "templates add\n"
            + "  $ + $@Holder !\n"
            + "end add\n"
            + "end Holder\n"
            + "def five: 5 -> Holder;\n"
            + "1..3 -> '$->five::add;' -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("678", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void parametrizedProcessor() throws Exception {
    String program =
        "templates add&{x:}\n"
            + "  $ + $x !\n"
            + "end add\n"
            + "processor Holder&{op:}\n"
            + "@: $;\n"
            + "templates do\n"
            + "  $ -> op&{x:$@Holder} !\n"
            + "end do\n"
            + "end Holder\n"
            + "def addFive: 5 -> Holder&{op:add};\n"
            + "1..3 -> addFive::do -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("678", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void parametrizedMessage() throws Exception {
    String program =
        "templates add&{x:}\n"
            + "  $ + $x !\n"
            + "end add\n"
            + "processor Holder\n"
            + "@: $;\n"
            + "templates do&{op:}\n"
            + "  $ -> op&{x:$@Holder} !\n"
            + "end do\n"
            + "end Holder\n"
            + "def five: 5 -> Holder;\n"
            + "1..3 -> five::do&{op:add} -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("678", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void sink() throws Exception {
    String program =
        "processor Holder\n"
            + "@: $;\n"
            + "sink add\n"
            + "  $ + $@Holder -> !OUT::write\n"
            + "end add\n"
            + "end Holder\n"
            + "def five: 5 -> Holder;\n"
            + "1..3 -> !five::add";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("678", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void source() throws Exception {
    String program =
        "processor Holder\n"
            + "@: $;\n"
            + "source value\n"
            + "  $@Holder !\n"
            + "end value\n"
            + "end Holder\n"
            + "def five: 5 -> Holder;\n"
            + "1..3 -> $five::value -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("555", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void bespokeCollector() throws Exception {
    String program =
        "processor TimesPlus\n"
            + "@: 0;\n"
            + "sink accumulate\n"
            + "  @TimesPlus: $@TimesPlus * $ + $;\n"
            + "end accumulate\n"
            + "source result\n"
            + "  $@TimesPlus !\n"
            + "end result\n"
            + "end TimesPlus\n"
            + "1..3 -> ..=TimesPlus -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("15", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void bespokeCollectorSubtotalling() throws Exception {
    String program =
        "processor TimesPlus\n"
            + "@: 0;\n"
            + "sink accumulate\n"
            + "  @TimesPlus: $@TimesPlus * $ + $;\n"
            + "end accumulate\n"
            + "source result\n"
            + "  $@TimesPlus !\n"
            + "end result\n"
            + "end TimesPlus\n"
            + "def tp: $TimesPlus;\n"
            + "source acc $tp! end acc\n"
            + "1 -> ..=acc -> !OUT::write\n"
            + "2 -> ..=acc -> !OUT::write\n"
            + "3 -> ..=acc -> !OUT::write\n";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1415", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mutableVariable() throws Exception {
    String program =
        "processor Var\n"
            + "@: $;\n"
            + "sink set&{lens:}\n"
            + "  @Var(lens): $;\n"
            + "end set\n"
            + "sink merge&{lens:}\n"
            + "  ..|@Var(lens): $;\n"
            + "end merge\n"
            + "source get&{lens:}\n"
            + "  $@Var(lens) !\n"
            + "end get\n"
            + "source delete&{lens:}\n"
            + "  ^@Var(lens) !\n"
            + "end delete\n"
            + "end Var\n"
            + "def var: {a:1} -> Var;\n"
            + "$var::get&{lens: :()} -> !OUT::write\n"
            + "$var::get&{lens: :(a:)} -> !OUT::write\n"
            + "2 -> !var::set&{lens: :(a:)}\n"
            + "$var::get&{lens: :()} -> !OUT::write\n"
            + "[3] -> !var::set&{lens: :()}\n"
            + "$var::get&{lens: :()} -> !OUT::write\n"
            + "$var::get&{lens: :(1)} -> !OUT::write\n"
            + "4 -> !var::merge&{lens: :()}\n"
            + "$var::get&{lens: :()} -> !OUT::write\n"
            + "$var::delete&{lens: :(1)} -> !OUT::write\n"
            + "$var::delete&{lens: :()} -> !OUT::write\n"
            ;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=1}1{a=2}[3]3[3, 4]3[4]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mutableVariableInArray() throws Exception {
    String program =
        "processor Var\n"
            + "@: [$];\n"
            + "sink set&{lens:}\n"
            + "  @Var(1; lens): $;\n"
            + "end set\n"
            + "sink merge&{lens:}\n"
            + "  ..|@Var(1; lens): $;\n"
            + "end merge\n"
            + "source get&{lens:}\n"
            + "  $@Var(1; lens) !\n"
            + "end get\n"
            + "source delete&{lens:}\n"
            + "  ^@Var(1; lens) !\n"
            + "end delete\n"
            + "end Var\n"
            + "def var: {a:1} -> Var;\n"
            + "$var::get&{lens: :()} -> !OUT::write\n"
            + "$var::get&{lens: :(a:)} -> !OUT::write\n"
            + "2 -> !var::set&{lens: :(a:)}\n"
            + "$var::get&{lens: :()} -> !OUT::write\n"
            + "[3] -> !var::set&{lens: :()}\n"
            + "$var::get&{lens: :()} -> !OUT::write\n"
            + "$var::get&{lens: :(1)} -> !OUT::write\n"
            + "4 -> !var::merge&{lens: :()}\n"
            + "$var::get&{lens: :()} -> !OUT::write\n"
            + "$var::delete&{lens: :(1)} -> !OUT::write\n"
            + "$var::delete&{lens: :()} -> !OUT::write\n"
            ;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=1}1{a=2}[3]3[3, 4]3[4]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mutableVariableInStructure() throws Exception {
    String program =
        "processor Var\n"
            + "@: {a: $};\n"
            + "sink set&{lens:}\n"
            + "  @Var(a:; lens): $;\n"
            + "end set\n"
            + "sink merge&{lens:}\n"
            + "  ..|@Var(a:; lens): $;\n"
            + "end merge\n"
            + "source get&{lens:}\n"
            + "  $@Var(a:; lens) !\n"
            + "end get\n"
            + "source delete&{lens:}\n"
            + "  ^@Var(a:; lens) !\n"
            + "end delete\n"
            + "end Var\n"
            + "def var: {a:1} -> Var;\n"
            + "$var::get&{lens: :()} -> !OUT::write\n"
            + "$var::get&{lens: :(a:)} -> !OUT::write\n"
            + "2 -> !var::set&{lens: :(a:)}\n"
            + "$var::get&{lens: :()} -> !OUT::write\n"
            + "[3] -> !var::set&{lens: :()}\n"
            + "$var::get&{lens: :()} -> !OUT::write\n"
            + "$var::get&{lens: :(1)} -> !OUT::write\n"
            + "4 -> !var::merge&{lens: :()}\n"
            + "$var::get&{lens: :()} -> !OUT::write\n"
            + "$var::delete&{lens: :(1)} -> !OUT::write\n"
            + "$var::delete&{lens: :()} -> !OUT::write\n"
            ;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=1}1{a=2}[3]3[3, 4]3[4]", output.toString(StandardCharsets.UTF_8));
  }
}
