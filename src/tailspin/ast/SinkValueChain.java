package tailspin.ast;

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
  public Queue<Object> run(Object it, Scope scope) {
    Queue<Object> values = valueChain.run(it, scope);
    if (sink != null) values.forEach(v -> {
      Queue<Object> nothing = sink.run(v, scope);
      if (nothing != null && !nothing.isEmpty()) {
        throw new IllegalStateException("Non-sink message " + sink + " called");
      }
    });
    return EMPTY_RESULT;
  }
}
