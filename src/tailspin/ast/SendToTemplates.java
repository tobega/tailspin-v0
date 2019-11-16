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
    Queue<Object> items = valueChain.run(it, blockScope);
    if (items.isEmpty()) {
      return null;
    }
    if (items.size() == 1) {
      return templates.matchTemplates(items.poll(), transformScope).orElse(null);
    }
    return new DelayedExecution() {
      @Override
      public Object getNextResult() {
        while (true) {
          Object item = items.poll();
          if (item == null) {
            return null;
          }
          Optional<Object> r = templates.matchTemplates(item, transformScope);
          if (r.isPresent()) {
            if (items.isEmpty()) {
              return r.get();
            }
            Object results = r.get();
            if (results instanceof ResultIterator) {
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
