package tailspin.ast;

import java.util.Map;
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
    // Currently, dereferencing a transform means calling it. It makes some sense in string interpolation
    if (value instanceof Transform) {
      return ((Transform) value).run(it, Map.of());
    }
    return Expression.queueOf(value);
  }
}
