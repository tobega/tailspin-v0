package tailspin.testing;

import java.util.List;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class Test implements Expression {
  private final Value description;
  private final List<Assertion> assertions;

  public Test(Value description, List<Assertion> assertions) {
    this.description = description;
    this.assertions = assertions;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    Object result = null;
    for (Assertion assertion : assertions) {
      result = ResultIterator.resolveResult(result, assertion.getResults(null, blockScope));
    }
    if (result != null) {
      return "" + description.getResults(null, blockScope) + " failed:\n" + result;
    }
    return result;
  }
}
