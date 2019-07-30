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
        "templates add@{x:}\n"
            + "  $ + $x !\n"
            + "end add\n"
            + "processor Holder@{op:}\n"
            + "@: $;\n"
            + "templates do\n"
            + "  $ -> op@{x:$@Holder} !\n"
            + "end do\n"
            + "end Holder\n"
            + "def addFive: 5 -> Holder@{op:add};\n"
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
        "templates add@{x:}\n"
            + "  $ + $x !\n"
            + "end add\n"
            + "processor Holder\n"
            + "@: $;\n"
            + "templates do@{op:}\n"
            + "  $ -> op@{x:$@Holder} !\n"
            + "end do\n"
            + "end Holder\n"
            + "def five: 5 -> Holder;\n"
            + "1..3 -> five::do@{op:add} -> !OUT::write";
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
}
