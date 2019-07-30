package tailspin.ast;

import java.util.Map;
import java.util.Queue;
import tailspin.interpreter.Scope;
import tailspin.interpreter.Transform;

public class SinkReference implements Expression {
  private final Reference reference;

  public SinkReference(Reference reference) {
    this.reference = reference;
  }

  @Override
  public Queue<Object> run(Object it, Scope scope) {
    Transform transform = (Transform) reference.getValue(it, scope);
    if (transform == null) {
      throw new NullPointerException("No sink defined for " + reference);
    }
    Queue<Object> sunk = transform.run(it, Map.of());
    if (!sunk.isEmpty()) {
      throw new IllegalStateException("Sink " + reference + " emitted values");
    }
    return EMPTY_RESULT;
  }
}
