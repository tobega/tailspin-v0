package tailspin.interpreter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.tree.TerminalNode;
import tailspin.parser.TailspinBaseListener;
import tailspin.parser.TailspinParser;

class Interpreter extends TailspinBaseListener {
  private final InputStream input;
  private final OutputStream output;

  private Object currentValue;
  private String pendingIdentifier;

  private Map<String, Object> definitions = new HashMap<>();

  public Interpreter(InputStream input, OutputStream output) {
    this.input = input;
    this.output = output;
  }

  @Override
  public void visitTerminal(TerminalNode node) {
    try {
      switch (node.getSymbol().getType()) {
        case TailspinParser.STRING:
          String string = node.getSymbol().getText();
          currentValue = string.substring(1, string.length() - 1).replace("''", "'");
          break;
        case TailspinParser.Stdout:
          output.write(currentValue.toString().getBytes(StandardCharsets.UTF_8));
          break;
        case TailspinParser.IDENTIFIER:
          pendingIdentifier = node.getSymbol().getText();
          break;
        case TailspinParser.Dereference:
          String identifier = node.getSymbol().getText().substring(1);
          currentValue = definitions.get(identifier);
          break;
      }
    } catch (IOException e) {
      // Ignore
    }
  }

  @Override
  public void exitStatement(TailspinParser.StatementContext ctx) {
    currentValue = null;
  }

  @Override
  public void exitDefinition(TailspinParser.DefinitionContext ctx) {
    definitions.put(pendingIdentifier, currentValue);
    pendingIdentifier = null;
  }
}
