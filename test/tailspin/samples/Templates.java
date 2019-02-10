package tailspin.samples;

import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Templates {
    @Test
    public void inlineMatchers() throws Exception {
        String program = "1..3 -> (<2> 'Goodbye ' <> 'Hello ') -> stdout";
        Tailspin runner =
                Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output);

        assertEquals("Hello Goodbye Hello ", output.toString(StandardCharsets.UTF_8));
    }
}
