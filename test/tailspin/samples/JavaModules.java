package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

public class JavaModules {
  @Test
  void callUnaryStaticMethod() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "[-2] -> lang/Math::abs -> $ + 1 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void callBinaryStaticMethod() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "[-2, 5] -> lang/Math::max -> $ + 1 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("6", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void stringParam() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "['255'] -> lang/Long::parseLong -> $ + 1 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("256", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void byteReturnValue() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "['127'] -> lang/Byte::parseByte -> $ + 1 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("128", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void integerArgument() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "['ff', 16] -> lang/Byte::parseByte -> $ + 1 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("256", output.toString(StandardCharsets.UTF_8));
  }
}
