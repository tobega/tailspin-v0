package tailspin.testing;

import tailspin.control.Expression;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class Assertion implements Expression {
  private final Expression expression;
  private final Criterion criterion;
  private final Value description;

  public Assertion(Expression expression, Criterion criterion, Value description) {
    this.expression = expression;
    this.criterion = criterion;
    this.description = description;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    Object value = Value.oneValue(expression.getResults(null, blockScope));
    if (!criterion.isMet(value, value, blockScope)) {
      return "assertion that " + description.getResults(null, blockScope) + " failed with value " + value;
    }
    return null; // Null means pass
  }
}
