package tailspin.testing;

import java.util.List;
import java.util.Set;

import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class Test implements Expression {
  private final Value description;
  private final List<Expression> expressions;
  private Set<String> requiredDefinitions;

  public Test(Value description, Set<String> requiredDefinitions, List<Expression> expressions) {
    this.description = description;
    this.requiredDefinitions = requiredDefinitions;
    this.expressions = expressions;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    Object result = null;
    for (Expression expression : expressions) {
      result = ResultIterator.resolveResult(result, expression.getResults(null, blockScope));
    }
    if (result != null) {
      result =  ResultIterator.resolveResult(
          "" + description.getResults(null, blockScope) + " failed:", result);
    }
    return result;
  }

  public Set<String> getRequiredDefinitions() {
    return requiredDefinitions;
  }
}
