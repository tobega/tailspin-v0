package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.stream.Collectors;
import tailspin.ast.Expression;

public class TransformSubComposer implements SubComposer {
  private final SubComposer subComposer;
  private final Expression transform;
  private final Scope scope;

  public TransformSubComposer(SubComposer subComposer, Expression transform,
      Scope scope) {
    this.subComposer = subComposer;
    this.transform = transform;
    this.scope = scope;
  }

  private Queue<Object> convert(Queue<Object> matchResult) {
    if (transform == null) {
      return matchResult;
    }
    return matchResult.stream().flatMap(it -> transform.run(it, scope).stream())
        .collect(Collectors.toCollection(ArrayDeque::new));
  }

  @Override
  public String nibble(String s) {
    return subComposer.nibble(s);
  }

  @Override
  public Queue<Object> getValues() {
    return convert(subComposer.getValues());
  }

  @Override
  public boolean isSatisfied() {
    return subComposer.isSatisfied();
  }
}
