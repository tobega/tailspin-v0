package tailspin.literals;

import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class StringInterpolation implements Value {
  private final Expression expression;

  public StringInterpolation(Expression expression) {
    this.expression = expression;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    Object result = expression.getResults(it, scope);
    if (result == null) {
      return "";
    }
    StringBuilder string = new StringBuilder();
    ResultIterator.forEach(result, r -> appendStringValue(string, r));
    return string.toString();
  }

  public static StringBuilder appendStringValue(StringBuilder builder, Object it) {
    if (it instanceof byte[]) {
      for (byte b : (byte[]) it) {
        builder.append(String.format("%02x", b));
      }
    } else {
      builder.append(it);
    }
    return builder;
  }

  @Override
  public String toString() {
    String expr = expression.toString();
    return (expr.startsWith("$") ? "" : "$") + expr + ";";
  }
}
