package tailspin.matchers.composer;

import java.util.function.Consumer;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;

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

  private Object convert(Object matchResult) {
    if (transform == null) {
      return matchResult;
    }
    class ResultCollector implements Consumer<Object> {
      Object result;
      @Override
      public void accept(Object it) {
        Object transformed = transform.getResults(it, scope);
        result = ResultIterator.resolveResult(result, transformed);
      }
    }
    ResultCollector resultCollector = new ResultCollector();
    ResultIterator.forEach(matchResult, resultCollector);
    return resultCollector.result;
  }

  @Override
  public String nibble(String s) {
    return subComposer.nibble(s);
  }

  @Override
  public Object getValues() {
    return convert(subComposer.getValues());
  }

  @Override
  public boolean isSatisfied() {
    return subComposer.isSatisfied();
  }
}
