package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.stream.Collectors;
import tailspin.ast.Expression;

public class ComposerTransform {
  private final Expression transform;
  private final Scope scope;

  public ComposerTransform(Expression transform, Scope scope) {
    this.transform = transform;
    this.scope = scope;
  }

  public Queue<Object> convert(Queue<Object> matchResult) {
    if (transform == null) {
      return matchResult;
    }
    return matchResult.stream().flatMap(it -> transform.run(it, scope).stream())
        .collect(Collectors.toCollection(ArrayDeque::new));
  }
}
