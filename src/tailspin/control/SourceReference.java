package tailspin.control;

import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.types.Transform;

public class SourceReference implements Expression {
  private final Reference reference;

  public SourceReference(Reference reference) {
    this.reference = reference;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    Object value = reference.getValue(it, scope);
    if (value == null) {
      throw new NullPointerException("No value defined for " + reference);
    }
    if (reference.isMutable()) {
      value = Reference.freeze(value);
    }
    if (value instanceof Transform) {
      return ((Transform) value).getResults(null, Map.of(), scope.getLocalDictionary());
    }
    return value;
  }

  @Override
  public String toString() {
    return "$" + reference;
  }
}
