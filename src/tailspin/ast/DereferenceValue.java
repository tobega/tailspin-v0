package tailspin.ast;

import java.util.Map;
import java.util.Queue;
import tailspin.interpreter.RunMain;
import tailspin.interpreter.Scope;
import tailspin.interpreter.TransformCall;
import tailspin.parser.TailspinParser;

public class DereferenceValue implements Expression {
  private final Reference reference;
  private final boolean isDelete;
  private final TailspinParser.MessageContext message;

  public DereferenceValue(Reference reference, boolean isDelete,
      TailspinParser.MessageContext message) {
    this.reference = reference;
    this.isDelete = isDelete;
    this.message = message;
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
    // TODO: only a message could result in multiple values
    if (message != null) {
      scope.setIt(Expression.queueOf(it));
      value = new RunMain(scope).resolveProcessorMessage(message, value);
    }
    // TODO: consider whether to support this case or not
    if (value instanceof TransformCall) {
      return ((TransformCall) value).run(it, Map.of());
    }
    return Expression.queueOf(value);
  }
}
