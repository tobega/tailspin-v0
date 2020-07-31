package tailspin;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import tailspin.interpreter.Program;
import tailspin.interpreter.RunMain;
import tailspin.parser.TailspinLexer;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParser.ProgramContext;

public class Tailspin {
  // TODO: make private
  public final ProgramContext programDefinition;

  private Tailspin(TailspinParser.ProgramContext programDefinition) {
    this.programDefinition = programDefinition;
  }

  public static Tailspin parse(InputStream inputStream) throws IOException {
    CharStream charStream = CharStreams.fromStream(inputStream, StandardCharsets.UTF_8);
    TailspinLexer lexer = new TailspinLexer(charStream);
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    TailspinParser parser = new TailspinParser(tokenStream);
    MyANTLRErrorListener errorListener = new MyANTLRErrorListener();
    parser.addErrorListener(errorListener);
    lexer.addErrorListener(errorListener);
    TailspinParser.ProgramContext prog = parser.program();
    if (errorListener.error) {
      throw new RuntimeException("Compilation error");
    }
    return new Tailspin(prog);
  }

  /**
   * Only to be used by tests
   */
  public void run(InputStream input, OutputStream output, List<String> args) {
    run(Path.of("."), input, output, args);
  }

  /**
   * Only to be used by tests
   */
  public void runTests(InputStream input, OutputStream output, List<String> args) throws IOException {
    runTests(Path.of("."), input, output, args);
  }

  public void runTests(Path basePath, InputStream input, OutputStream output, List<String> args)
      throws IOException {
    Program program = new RunMain().visitProgram(programDefinition);
    CoreSystemProvider coreSystemProvider = new CoreSystemProvider(args, input, output);
    String result = program.runTests(basePath, coreSystemProvider);
    if (result.isEmpty()) {
      result = "Pass";
    }
    output.write(result.getBytes(StandardCharsets.UTF_8));
  }

  public void run(Path basePath, InputStream input, OutputStream output, List<String> args) {
    Program program = new RunMain().visitProgram(programDefinition);
    CoreSystemProvider coreSystemProvider = new CoreSystemProvider(args, input, output);
    program.run(basePath, coreSystemProvider);
  }

  public static void main(String[] args) throws IOException {
    if (args.length > 1 && args[0].equals("--test")) {
      Path programPath = Paths.get(args[1]);
      Path basePath = programPath.toAbsolutePath().getParent();
      Tailspin program = parse(Files.newInputStream(programPath));
      program.runTests(basePath, System.in, System.out, Arrays.asList(Arrays.copyOfRange(args, 2, args.length)));
    } else {
      Path programPath = Paths.get(args[0]);
      Path basePath = programPath.toAbsolutePath().getParent();
      Tailspin program = parse(Files.newInputStream(programPath));
      program.run(basePath, System.in, System.out, Arrays.asList(Arrays.copyOfRange(args, 1, args.length)));
    }
  }

  private static class MyANTLRErrorListener implements ANTLRErrorListener {

    private boolean error = false;

    @Override
    public void syntaxError(
        Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
      error = true;
    }

    @Override
    public void reportAmbiguity(
        Parser parser,
        DFA dfa,
        int i,
        int i1,
        boolean b,
        BitSet bitSet,
        ATNConfigSet atnConfigSet) {
      // System.out.println("Ambiguity " + parser.getRuleContext().toInfoString(parser));
    }

    @Override
    public void reportAttemptingFullContext(
        Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {
      // System.out.println("Attempting full context " + parser.getRuleContext().toInfoString(parser));
    }

    @Override
    public void reportContextSensitivity(
        Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {
      // System.out.println("Context sensitivity " + parser.getRuleContext().toInfoString(parser));
    }
  }
}
