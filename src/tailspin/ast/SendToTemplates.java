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
  public ResultIterator getResults(Object it, Scope blockScope) {
    TransformScope transformScope = findTransformScope(blockScope);
    Templates templates = transformScope.getTemplates();
    Queue<Object> items = valueChain.run(it, blockScope);
    return new ResultIterator() {
      @Override
      public Object getNextResult() {
        while (true) {
          Object item = items.poll();
          if (item == null) {
            return null;
          }
          Optional<ResultIterator> r = templates.matchTemplates(item, transformScope);
          if (r.isPresent()) {
            return ResultIterator.prefix(r.get(), this);
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
