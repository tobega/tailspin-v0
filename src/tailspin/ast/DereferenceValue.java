package tailspin.ast;

import java.util.Queue;
import tailspin.interpreter.Scope;
import tailspin.interpreter.Transform;

public class DereferenceValue implements Expression {
  private final Reference reference;
  private final boolean isDelete;

  public DereferenceValue(Reference reference, boolean isDelete) {
    this.reference = reference;
    this.isDelete = isDelete;
  }

  @Override
  public Queue<Object> run(Object it, Scope scope) {
    Object value = isDelete ? reference.deleteValue(it, scope) : reference.getValue(it, scope);
    if (value == null) {
      throw new NullPointerException("No value defined for " + reference);
    }
    if (reference.isMutable()) {
      value = Reference.copy(value);
    }
    if (value instanceof Transform) {
      throw new IllegalStateException("Attempt to dereference transform " + reference);
    }
    return Expression.queueOf(value);
  }
}
