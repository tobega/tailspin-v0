package tailspin;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
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
import tailspin.interpreter.BasicScope;
import tailspin.interpreter.RunMain;
import tailspin.parser.TailspinLexer;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParser.ProgramContext;
import tailspin.types.SystemProcessor;

public class Tailspin {
  private final ProgramContext program;

  private Tailspin(TailspinParser.ProgramContext program) {
    this.program = program;
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

  public void run(InputStream input, OutputStream output, List<String> args) {
    // System.out.println(program.toStringTree());
    BasicScope scope = new BasicScope(input, output);
    scope.defineValue("args", args);
    scope.defineValue("SYS", new SystemProcessor(scope));
    new RunMain(scope).visit(program);
  }

  public static void main(String[] args) throws IOException {
    List<String> clargs = Arrays.asList(Arrays.copyOfRange(args, 1, args.length));
    parse(Files.newInputStream(Paths.get(args[0]))).run(System.in, System.out, clargs);
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
