package tailspin.ast;

import java.util.Queue;
import tailspin.interpreter.Scope;

public class SinkReference implements Expression {
  private final Expression sink;

  public SinkReference(Expression sink) {
    this.sink = sink;
  }

  @Override
  public Queue<Object> run(Object it, Scope scope) {
    Queue<Object> nothing = sink.run(it, scope);
    if (nothing != null && !nothing.isEmpty()) {
      throw new IllegalStateException("Non-sink message " + sink + " called");
    }
    return null;
  }
}
