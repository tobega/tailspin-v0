package tailspin.control;

import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.types.Transform;

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
    Object sunk = ResultIterator.resolveSideEffects(transform.getResults(it, Map.of(),
        scope.getLocalDictionary()));
    if (sunk != null) {
      throw new IllegalStateException("Sink " + reference + " emitted values");
    }
    return null;
  }
}
