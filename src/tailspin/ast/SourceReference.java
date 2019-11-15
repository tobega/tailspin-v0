package tailspin.ast;

import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.interpreter.Transform;

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
      return (ResultIterator) ((Transform) value).run(null, Map.of())::poll;
    }
    return value;
  }
}
