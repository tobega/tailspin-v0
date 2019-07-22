package tailspin.ast;

import java.util.Queue;
import tailspin.interpreter.RunMain;
import tailspin.interpreter.Scope;
import tailspin.parser.TailspinParser;

public class SinkReference implements Expression {
  private final Reference reference;
  private final TailspinParser.MessageContext message;

  public SinkReference(Reference reference, TailspinParser.MessageContext message) {
    this.reference = reference;
    this.message = message;
  }

  @Override
  public Queue<Object> run(Object it, Scope scope) {
    Object value = reference.getValue(it, scope);
    if (value == null) {
      throw new NullPointerException("No value defined for " + reference);
    }
    // TODO: handle defined sinks
    if (message != null) {
      scope.setIt(Expression.queueOf(it));
      value = new RunMain(scope).resolveProcessorMessage(message, value);
    }
    if (value != null) {
      throw new IllegalStateException("Non-sink message " + message.getText() + " called");
    }
    return null;
  }
}
