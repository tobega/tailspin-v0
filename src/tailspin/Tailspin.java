package tailspin;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import tailspin.interpreter.BasicScope;
import tailspin.interpreter.RunPhase;
import tailspin.parser.TailspinLexer;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParser.ProgramContext;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.BitSet;

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
    TailspinParser.ProgramContext prog = parser.program();
    if (errorListener.error) {
      throw new RuntimeException("Compilation error");
    }
    return new Tailspin(prog);
  }

  public void run(InputStream input, OutputStream output) {
    System.out.println(program.toStringTree());
    new RunPhase(new BasicScope(input, output)).visit(program);
  }

  public static void main(String[] args) throws IOException {
    parse(Files.newInputStream(Paths.get(args[0]))).run(System.in, System.out);
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
      System.out.println("Ambiguity " + parser.getRuleContext().toInfoString(parser));
    }

    @Override
    public void reportAttemptingFullContext(
        Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {
      System.out.println("Attempting full context " + parser.getRuleContext().toInfoString(parser));
    }

    @Override
    public void reportContextSensitivity(
        Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {
      System.out.println("Context sensitivity " + parser.getRuleContext().toInfoString(parser));
      error = true;
    }
  }
}
