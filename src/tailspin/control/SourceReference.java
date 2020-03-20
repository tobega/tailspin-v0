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
      value = Reference.copy(value);
    }
    if (value instanceof Transform) {
      Object results = ((Transform) value).getResults(null, Map.of());
      if (results instanceof DelayedExecution) {
        results = (ResultIterator) ResultIterator.toQueue((ResultIterator) results)::poll;
      }
      return results;
    }
    return value;
  }
}
