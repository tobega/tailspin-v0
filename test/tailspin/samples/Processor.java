package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Processor {
  @Test
  void simple() throws Exception {
    String program =
        "processor Holder\n"
            + "$it -> @\n"
            + "templates add\n"
            + "  $it + $@Holder !\n"
            + "end add\n"
            + "end Holder\n"
            + "def five: 5 -> Holder\n"
            + "1..3 -> $five::add -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("678", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void parametrized() throws Exception {
    String program =
        "templates add@{x:}\n"
            + "  $it + $x !\n"
            + "end add\n"
            + "processor Holder@{op:}\n"
            + "$it -> @\n"
            + "templates do\n"
            + "  $it -> op@{x:$@Holder} !\n"
            + "end do\n"
            + "end Holder\n"
            + "def addFive: 5 -> Holder@{op:add}\n"
            + "1..3 -> $addFive::do -> stdout";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output);

    assertEquals("678", output.toString(StandardCharsets.UTF_8));
  }
}
