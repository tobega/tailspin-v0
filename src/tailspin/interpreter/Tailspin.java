package tailspin.interpreter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import tailspin.parser.TailspinLexer;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParser.ProgContext;

public class Tailspin {

  private final ProgContext prog;

  private Tailspin(TailspinParser.ProgContext prog) {
    this.prog = prog;
  }

  public static Tailspin parse(InputStream inputStream) throws IOException {
    CharStream charStream = CharStreams.fromStream(inputStream, StandardCharsets.UTF_8);
    TailspinLexer lexer = new TailspinLexer(charStream);
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    TailspinParser parser = new TailspinParser(tokenStream);
    TailspinParser.ProgContext prog = parser.prog();
    if (prog.exception != null) {
      throw new RuntimeException("Compilation error");
    }
    return new Tailspin(prog);
  }

  public void run(InputStream input, OutputStream output) {
    System.out.println(prog.toStringTree());
    ParseTreeWalker.DEFAULT.walk(new Interpreter(input, output), prog);
  }

  public static void main(String[] args) throws IOException {
    parse(Files.newInputStream(Paths.get(args[0]))).run(System.in, System.out);
  }
}
