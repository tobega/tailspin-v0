package tailspin.samples;

import org.junit.jupiter.api.Test;
import tailspin.interpreter.Tailspin;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Strings {

    @Test
    public void apostrophe() throws Exception {
        String program = "'" + "What''s up" + "' -> stdout";
        Tailspin runner = Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output);

        assertEquals("What's up", output.toString(StandardCharsets.UTF_8));
    }

    @Test
    public void moreApostrophes() throws Exception {
        String program = "'" + "What''''s up" + "' -> stdout";
        Tailspin runner = Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output);

        assertEquals("What''s up", output.toString(StandardCharsets.UTF_8));
    }

    @Test
    public void multilineString() throws Exception {
        String program = "'Hello\nWorld'  -> stdout";
        Tailspin runner = Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output);

        assertEquals("Hello\nWorld", output.toString(StandardCharsets.UTF_8));
    }

    @Test
    public void simpleInterpolate() throws Exception {
        String program = "def helloWorld: 'Hello World!'\n"
                + "'$helloWorld' -> stdout";
        Tailspin runner = Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output);

        assertEquals("Hello World!", output.toString(StandardCharsets.UTF_8));
    }
}
