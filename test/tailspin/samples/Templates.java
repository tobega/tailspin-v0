package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Templates {
    @Test
    void inlineMatchers() throws Exception {
        String program = "1..3 -> (<2> 'Goodbye ' <> 'Hello ') -> stdout";
        Tailspin runner =
                Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output);

        assertEquals("Hello Goodbye Hello ", output.toString(StandardCharsets.UTF_8));
    }

    @Test
    void recursiveMatch() throws Exception {
        String program = "templates spin\n<5> $it + 2 <> $it + 1 -> #\nend spin\n"
            + "1 -> spin -> stdout";
        Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output);

        assertEquals("7", output.toString(StandardCharsets.UTF_8));
    }
}
