package tailspin.testing;

import java.util.List;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class Test implements Expression {
  private final Value description;
  private final List<Expression> expressions;

  public Test(Value description, List<Expression> expressions) {
    this.description = description;
    this.expressions = expressions;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    Object result = null;
    for (Expression expression : expressions) {
      result = ResultIterator.resolveResult(result, expression.getResults(null, blockScope));
    }
    if (result != null) {
      return "" + description.getResults(null, blockScope) + " failed:\n" + result;
    }
    return result;
  }
}
