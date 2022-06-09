package tailspin.testing;

import java.util.ArrayList;
import java.util.List;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Membrane;

public class Assertion implements Expression {
  private final Expression expression;
  private final Membrane membrane;
  private final Value description;

  public Assertion(Expression expression, Membrane membrane, Value description) {
    this.expression = expression;
    this.membrane = membrane;
    this.description = description;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    Object value = expression.getResults(null, blockScope);
    value = ResultIterator.resolveSideEffects(value);
    if (value == null) {
      return "assertion that " + description.getResults(null, blockScope) + " did not get any value.";
    }
    if (value instanceof ResultIterator) {
      List<Object> results = new ArrayList<>();
      ResultIterator.forEach(value, v -> {
        if (v instanceof String) {
          v = "'" + v + "'";
        }
        results.add(v);
      });
      return "assertion that " + description.getResults(null, blockScope) + " got too many values: "
          + results;
    }
    if (null == membrane.permeate(value, value, blockScope, null)) {
      return "assertion that " + description.getResults(null, blockScope) + " failed with value " + value;
    }
    return null; // Null means pass
  }
}
