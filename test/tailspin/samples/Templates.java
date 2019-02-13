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

    @Test
    void consecutiveChainsInMatchBlock() throws Exception {
        String program = "templates spin\n<5> $it + 2 <> $it + 1 -> #\n $it -> stdout\nend spin\n"
            + "1 -> spin -> stdout";
        Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output);

        // Calls to stdout in the templates happen before the next part of the chain is
        // sent to stdout, even though the "return value" is output before the values to stdout
        // Maybe a return value should "push through" to the end first? Or not?
        // The current effect could be described as "everything in the templates object completes
        // before the next stage is started"
        assertEquals("43217", output.toString(StandardCharsets.UTF_8));
    }

    @Test
    void consecutiveChainsInMatchBlockReversedOrder() throws Exception {
    String program =
        "templates spin\n<5> $it + 2 <> $it -> stdout\n $it + 1 -> #\nend spin\n"
            + "1 -> spin -> stdout";
        Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output);

        // Calls to stdout in the templates happen before the next part of the chain is
        // sent to stdout, even though the "return value" is output before the values to stdout
        // Maybe a return value should "push through" to the end first? Or not?
        // The current effect could be described as "everything in the templates object completes
        // before the next stage is started"
        assertEquals("12347", output.toString(StandardCharsets.UTF_8));
    }

    @Test
    void multipleResultsInMatchBlock() throws Exception {
        String program = "templates spin\n<5> $it + 2 <> $it + 1 -> #\n $it\nend spin\n"
            + "1 -> spin -> stdout";
        Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output);

        // Here the return values do get generated in the "correct" order
        assertEquals("74321", output.toString(StandardCharsets.UTF_8));
    }

    @Test
    void rangeMatch() throws Exception {
        String program = "1..6 -> (<..2> 'L' <3..4> 'M' <5..> 'H') -> stdout";
        Tailspin runner =
            Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

        ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        runner.run(input, output);

        assertEquals("LLMMHH", output.toString(StandardCharsets.UTF_8));
    }
}
