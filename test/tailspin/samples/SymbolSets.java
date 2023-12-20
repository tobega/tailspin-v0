package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;
import tailspin.TypeError;

public class SymbolSets {

    @Test
    void defineSymbols() throws IOException {
        String program = """
                data colour #{red, white, blue}
                
                colour#white -> !OUT::write
                """;
        Tailspin runner =
                Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output, List.of());

        assertEquals("white", output.toString(StandardCharsets.UTF_8));
    }

    @Test
    void symbolBelongsToItsSet() throws IOException {
        String program = """
                data colour #{red, white, blue}, texture #{smooth, spotted}
                
                colour#white -> \\(
                  <texture#> 'no'!
                  <colour#> 'yes'!
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
    void symbolEquality() throws IOException {
        String program = """
                data colour #{red, white, blue}
                
                colour#white -> \\(
                  <=colour#blue> 'no'!
                  <=colour#white> 'yes'!
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
    void equalityToOtherTypeIsError() throws IOException {
        String program = """
                data colour #{red, white, blue}
                
                colour#white -> \\(
                  <=2> 'blows up'!
                  <=colour#white> 'yes'!
                \\) -> !OUT::write
                """;
        Tailspin runner =
                Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
    }

    @Test
    void equalityToOtherSetsSymbolIsError() throws IOException {
        String program = """
                data colour #{red, white, blue},
                     suit #{clubs, diamonds, hearts, spades}
                
                colour#white -> \\(
                  <=suit#diamonds> 'blows up'!
                  <=colour#white> 'yes'!
                \\) -> !OUT::write
                """;
        Tailspin runner =
                Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
    }

    @Test
    void equalityToOtherSetsSymbolInBounds() throws IOException {
        String program = """
                data colour #{red, white, blue},
                     suit #{clubs, diamonds, hearts, spades},
                     suit_or_colour <colour#|suit#>
                
                colour#white -> \\(
                  <´suit_or_colour´ =suit#diamonds> 'no'!
                  <´suit_or_colour´ =colour#white> 'yes'!
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
    void symbolCanBeUsedInDifferentSets() throws IOException {
        String program = """
                data colour #{red, white, blue},
                     player #{white, black}
                
                colour#white -> \\(
                  <´´ =player#white> 'no'!
                  <´´ =colour#white> 'yes'!
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
    void symbolCanBeUsedInSymbolValuedField() throws IOException {
        String program = """
                data colour #{red, white, blue}
                
                { colour#: colour#white } -> !OUT::write
                """;
        Tailspin runner =
                Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output, List.of());

        assertEquals("{colour#: white}", output.toString(StandardCharsets.UTF_8));
    }

    @Test
    void symbolValuedFieldMustBeDefinedValue() throws IOException {
        String program = """
                data colour #{red, white, blue}
                
                { colour#: 'white' } -> !OUT::write
                """;
        Tailspin runner =
                Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        assertThrows(TypeError.class, () -> runner.run(input, output, List.of()));
    }

    @Test
    void symbolCanBeUsedInState() throws IOException {
        String program = """
                data colour #{red, white, blue}
                source foo
                  @: colour#white;
                  $@ !
                end foo
                $foo -> !OUT::write
                """;
        Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output, List.of());

        assertEquals("white", output.toString(StandardCharsets.UTF_8));
    }
}
