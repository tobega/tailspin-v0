package tailspin.control;

import java.util.Optional;
import tailspin.interpreter.Scope;
import tailspin.transform.Templates;
import tailspin.transform.TransformScope;

public class SendToTemplates implements Expression {
  private final Expression valueChain;

  public SendToTemplates(Expression valueChain) {
    this.valueChain = valueChain;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    TransformScope transformScope = findTransformScope(blockScope);
    Templates templates = transformScope.getTemplates();
    Object result = ResultIterator.resolveSideEffects(valueChain.getResults(it, blockScope));
    if (result == null) {
      return null;
    }
    if (!(result instanceof ResultIterator)) {
      return templates.matchTemplates(result, transformScope).orElse(null);
    }
    return new DelayedExecution() {
      final ResultIterator.Flat items = (ResultIterator.Flat) result;
      @Override
      public Object nextBaseResult() {
        while (true) {
          Object item = items.getNextResult();
          if (item == null) {
            return null;
          }
          Optional<DelayedExecution> r = templates.matchTemplates(item, transformScope);
          if (r.isPresent()) {
            DelayedExecution results = r.get();
            return prefix(results);
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
