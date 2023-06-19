package tailspin.samples;

import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Enumerations {

    @Test
    void defineSymbols() throws IOException {
        String program = """
                data colour [red, white, blue]
                
                colour#white -> !OUT::write
                """;
        Tailspin runner =
                Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output, List.of());

        assertEquals("colour#white", output.toString(StandardCharsets.UTF_8));
    }
}
