package tailspin.interpreter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParserBaseListener;

class Interpreter extends TailspinParserBaseListener implements TerminalSink {
  private final InputStream input;
  private final OutputStream output;

  private Object currentValue;
  private String pendingIdentifier;

  private Map<String, Object> definitions = new HashMap<>();

  private Deque<TerminalSink> terminalSinkStack = new ArrayDeque<>();

  {
    terminalSinkStack.addLast(this);
  }

  public Interpreter(InputStream input, OutputStream output) {
    this.input = input;
    this.output = output;
  }

  private void pushTerminalSink(TerminalSink sink) {
    terminalSinkStack.addLast(sink);
  }

  private void popTerminalSink() {
    TerminalSink sink = terminalSinkStack.removeLast();
    terminalSinkStack.peekLast().acceptNestedValue(sink.getValue());
  }

  @Override
  public Object getValue() {
    return currentValue;
  }

  @Override
  public void acceptNestedValue(Object value) {
    currentValue = value;
  }

  @Override
  public void visitTerminal(TerminalNode node) {
    terminalSinkStack.peekLast().acceptTerminal(node);
  }

  @Override
  public void acceptTerminal(TerminalNode node) {
    try {
      switch (node.getSymbol().getType()) {
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
      stream.forEach(
          (v) -> {
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
    pushTerminalSink(new StringContentResolver());
  }

  @Override
  public void exitStringLiteral(TailspinParser.StringLiteralContext ctx) {
    popTerminalSink();
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
    pushTerminalSink(new RangeLiteralResolver());
  }

  @Override
  public void exitRangeLiteral(TailspinParser.RangeLiteralContext ctx) {
    popTerminalSink();
  }

  @Override
  public void enterArithmeticExpression(TailspinParser.ArithmeticExpressionContext ctx) {
    pushTerminalSink(new ArithmeticExpressionResolver());
  }

  @Override
  public void exitArithmeticExpression(TailspinParser.ArithmeticExpressionContext ctx) {
    popTerminalSink();
  }

  private class RangeLiteralResolver implements TerminalSink {
    Integer start;
    Integer end;
    Integer increment = 1;

    @Override
    public void acceptTerminal(TerminalNode node) {
      switch (node.getSymbol().getType()) {
        case TailspinParser.Zero:
        case TailspinParser.NonZeroInteger:
          Integer value = Integer.valueOf(node.getSymbol().getText());
          setValue(value);
      }
    }

    private void setValue(Integer value) {
      if (start == null) {
        start = value;
      } else if (end == null) {
        end = value;
      } else {
        increment = value;
      }
    }

    @Override
    public Object getValue() {
      return Stream.iterate(
          start,
          i -> (increment > 0 && i <= end) || (increment < 0 && i >= end),
          i -> i + increment);
    }

    @Override
    public void acceptNestedValue(Object value) {
      setValue((Integer) value);
    }
  }

  private class ArithmeticExpressionResolver implements TerminalSink {
    Integer left;
    Integer right;
    String operation;

    @Override
    public void acceptTerminal(TerminalNode node) {
      switch (node.getSymbol().getType()) {
        case TailspinParser.Zero:
        case TailspinParser.NonZeroInteger:
          Integer value = Integer.valueOf(node.getSymbol().getText());
          setValue(value);
          break;
        case TailspinParser.AdditiveOperator:
          operation = node.getSymbol().getText();
          break;
        case TailspinParser.Dereference:
          String identifier = node.getSymbol().getText().substring(1);
          setValue((Integer) definitions.get(identifier));
      }
    }

    private void setValue(Integer value) {
      if (left == null) {
        left = value;
      } else {
        right = value;
      }
    }

    @Override
    public Object getValue() {
      if (operation == null) {
        if (right != null) {
          throw new AssertionError("No operation given for binary expression");
        }
        return left;
      }
      switch (operation) {
        case "+":
          return left + right;
        case "-":
          return left - right;
      }
      throw new UnsupportedOperationException(operation);
    }

    @Override
    public void acceptNestedValue(Object value) {
      setValue((Integer) value);
    }
  }

  private class StringContentResolver implements TerminalSink {
    StringBuilder builder = new StringBuilder();

    @Override
    public void acceptTerminal(TerminalNode node) {
      switch (node.getSymbol().getType()) {
        case TailspinParser.STRING_TEXT: // stringLiteral
          String string = node.getSymbol().getText();
          builder.append(string.replace("''", "'").replace("$$", "$"));
          break;
        case TailspinParser.StringDereference: // stringLiteral
          {
            String identifier = node.getSymbol().getText().replaceAll("[$;]", "");
            builder.append(definitions.get(identifier).toString());
          }
          break;
      }
    }

    @Override
    public Object getValue() {
      return builder.toString();
    }

    @Override
    public void acceptNestedValue(Object value) {
      builder.append(value);
    }
  }
}
