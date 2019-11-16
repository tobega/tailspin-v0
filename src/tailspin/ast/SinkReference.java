package tailspin.ast;

import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.interpreter.Transform;

public class SinkReference implements Expression {
  private final Reference reference;

  public SinkReference(Reference reference) {
    this.reference = reference;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    Transform transform = (Transform) reference.getValue(it, scope);
    if (transform == null) {
      throw new NullPointerException("No sink defined for " + reference);
    }
    Object sunk = transform.getResults(it, Map.of());
    while (sunk instanceof DelayedExecution) {
      sunk = ((ResultIterator) sunk).getNextResult();
    }
    if (sunk != null) {
      throw new IllegalStateException("Sink " + reference + " emitted values");
    }
    return null;
  }
}
