package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.Queue;
import tailspin.ast.Expression;
import tailspin.ast.ResultIterator;

public class TransformSubComposer implements SubComposer {
  private final SubComposer subComposer;
  private final Expression transform;
  private final Scope scope;

  TransformSubComposer(SubComposer subComposer, Expression transform,
      Scope scope) {
    this.subComposer = subComposer;
    this.transform = transform;
    this.scope = scope;
  }

  private Queue<Object> convert(Queue<Object> matchResult) {
    if (transform == null) {
      return matchResult;
    }
    ArrayDeque<Object> result = new ArrayDeque<>();
    for (Object it : matchResult) {
      Object transformed = transform.getResults(it, scope);
      if (transformed == null) {
        continue;
      }
      if (transformed instanceof ResultIterator) {
        ResultIterator.apply(result::add, (ResultIterator) transformed);
      } else {
        result.add(transformed);
      }
    }
    return result;
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
