package tailspin.control;

import java.util.Queue;
import tailspin.interpreter.Scope;

public class SinkValueChain implements Expression {

  private final Expression valueChain;
  /** a void sink is null */
  private final Expression sink;

  public SinkValueChain(Expression valueChain, Expression sink) {
    this.valueChain = valueChain;
    this.sink = sink;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    // We have to pull through all values before we start sinking any.
    Queue<Object> values = Expression.queueOf(valueChain.getResults(it, scope));
    if (sink != null) values.forEach(v -> {
      Object nothing = sink.getResults(v, scope);
      if (nothing != null) {
        throw new IllegalStateException("Non-sink message " + sink + " called");
      }
    });
    return null;
  }
}
