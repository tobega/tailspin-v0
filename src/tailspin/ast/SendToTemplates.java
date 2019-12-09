package tailspin.ast;

import java.util.Optional;
import java.util.Queue;
import tailspin.interpreter.Scope;
import tailspin.interpreter.Templates;
import tailspin.interpreter.TransformScope;

public class SendToTemplates implements Expression {
  private final Expression valueChain;

  public SendToTemplates(Expression valueChain) {
    this.valueChain = valueChain;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    TransformScope transformScope = findTransformScope(blockScope);
    Templates templates = transformScope.getTemplates();
    Object result = valueChain.getResults(it, blockScope);
    if (result == null) {
      return null;
    }
    if (!(result instanceof ResultIterator)) {
      return templates.matchTemplates(result, transformScope).orElse(null);
    }
    return new DelayedExecution() {
      final Queue<Object> items = ResultIterator.toQueue((ResultIterator) result);
      @Override
      public Object getNextResult() {
        while (true) {
          Object item = items.poll();
          if (item == null) {
            return null;
          }
          Optional<Object> r = templates.matchTemplates(item, transformScope);
          if (r.isPresent()) {
            Object results = r.get();
            if (results instanceof ResultIterator) {
              if (items.isEmpty()) {
                return results;
              }
              return ResultIterator.prefix((ResultIterator) results, this);
            }
            return results;
          }
        }
      }
    };
  }

  private TransformScope findTransformScope(Scope blockScope) {
    while (!(blockScope instanceof TransformScope)) {
      blockScope = blockScope.getParentScope();
    }
    return (TransformScope) blockScope;
  }
}
