package tailspin.interpreter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParserBaseListener;

class Interpreter extends TailspinParserBaseListener {
  private final InputStream input;
  private final OutputStream output;

  private Object currentValue;
  private String pendingIdentifier;

  private Map<String, Object> definitions = new HashMap<>();

  private TerminalSink terminalSink;

  public Interpreter(InputStream input, OutputStream output) {
    this.input = input;
    this.output = output;
  }

  @Override
  public void visitTerminal(TerminalNode node) {
    if (terminalSink != null) {
      terminalSink.visitTerminal(node);
      return;
    }
    try {
      switch (node.getSymbol().getType()) {
        case TailspinParser.STRING_TEXT: // stringLiteral
          String string = node.getSymbol().getText();
          currentValue += string.replace("''", "'").replace("$$", "$");
          break;
        case TailspinParser.StringInterpolate: // stringLiteral
          {
            String identifier = node.getSymbol().getText().replaceAll("[$;]", "");
            currentValue += definitions.get(identifier).toString();
          }
          break;
        case TailspinParser.Stdout: // sink
          output.write(definitions.get("it").toString().getBytes(StandardCharsets.UTF_8));
          break;
        case TailspinParser.Zero:
        case TailspinParser.NonZeroInteger:
          currentValue = Integer.valueOf(node.getSymbol().getText());
          break;
        case TailspinParser.IDENTIFIER: // definition
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
  public void enterSink(TailspinParser.SinkContext ctx) {
    if (currentValue instanceof Stream) {
      @SuppressWarnings("unchecked")
      Stream<Object> stream = (Stream<Object>) currentValue;
      currentValue = null;
      stream.forEach((v) -> {
        if (currentValue != null) {
          ParseTreeWalker.DEFAULT.walk(this, ctx);
        }
        currentValue = v;
      });
    }
    definitions.put("it", currentValue);
    currentValue = null;
  }

  @Override
  public void enterStringLiteral(TailspinParser.StringLiteralContext ctx) {
    currentValue = "";
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

  @Override
  public void enterRangeLiteral(TailspinParser.RangeLiteralContext ctx) {
    terminalSink = new RangeLiteralResolver();
  }

  @Override
  public void exitRangeLiteral(TailspinParser.RangeLiteralContext ctx) {
    RangeLiteralResolver resolver = (RangeLiteralResolver) terminalSink;
    currentValue = resolver.getValue();
    terminalSink = null;
  }

  interface TerminalSink {
    void visitTerminal(TerminalNode node);
    Object getValue();
  }

  static class RangeLiteralResolver implements TerminalSink {
    Integer start;
    Integer end;
    Integer increment = 1;

    @Override
    public void visitTerminal(TerminalNode node) {
      switch (node.getSymbol().getType()) {
        case TailspinParser.Zero:
        case TailspinParser.NonZeroInteger:
          Integer value = Integer.valueOf(node.getSymbol().getText());
          if (start == null) {
            start = value;
          } else if (end == null) {
            end = value;
          } else {
            increment = value;
          }
      }
    }

    @Override
    public Object getValue() {
      return Stream.iterate(start, i -> (increment > 0 && i <= end) || (increment < 0 && i >= end),
          i -> i + increment);
    }
  }
}
