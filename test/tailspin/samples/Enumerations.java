package tailspin.samples;

import org.junit.jupiter.api.Test;
import tailspin.Tailspin;
import tailspin.TypeError;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Enumerations {

    @Test
    void defineSymbols() throws IOException {
        String program = """
                data colour [red, white, blue]
                
                colour´white -> !OUT::write
                """;
        Tailspin runner =
                Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output, List.of());

        assertEquals("white", output.toString(StandardCharsets.UTF_8));
    }

    @Test
    void enumSymbolBelongsToItsEnumType() throws IOException {
        String program = """
                data colour [red, white, blue], texture [smooth, spotted]
                
                colour´white -> \\(
                  <texture> 'no'!
                  <colour> 'yes'!
                \\) -> !OUT::write
                """;
        Tailspin runner =
                Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output, List.of());

        assertEquals("yes", output.toString(StandardCharsets.UTF_8));
    }

    @Test
    void enumSymbolEquality() throws IOException {
        String program = """
                data colour [red, white, blue]
                
                colour´white -> \\(
                  <=colour´blue> 'no'!
                  <=colour´white> 'yes'!
                \\) -> !OUT::write
                """;
        Tailspin runner =
                Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output, List.of());

        assertEquals("yes", output.toString(StandardCharsets.UTF_8));
    }

    @Test
    void enumEqualityToOtherTypeIsError() throws IOException {
        String program = """
                data colour [red, white, blue]
                
                colour´white -> \\(
                  <=2> 'blows up'!
                  <=colour´white> 'yes'!
                \\) -> !OUT::write
                """;
        Tailspin runner =
                Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
    }

    @Test
    void enumEqualityToOtherEnumIsError() throws IOException {
        String program = """
                data colour [red, white, blue],
                     suit [clubs, diamonds, hearts, spades]
                
                colour´white -> \\(
                  <=suit´diamonds> 'blows up'!
                  <=colour´white> 'yes'!
                \\) -> !OUT::write
                """;
        Tailspin runner =
                Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
    }
}
