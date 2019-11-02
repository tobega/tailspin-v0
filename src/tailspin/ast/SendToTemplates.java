package tailspin.ast;

import java.util.ArrayDeque;
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
  public Queue<Object> run(Object it, Scope blockScope) {
    TransformScope transformScope = findTransformScope(blockScope);
    Templates templates = transformScope.getTemplates();
    Queue<Object> result = new ArrayDeque<>();
    valueChain.run(it, blockScope).forEach(item ->
      result.addAll(templates.matchTemplates(item, transformScope)
          .map(ResultIterator::toQueue).orElse(Expression.EMPTY_RESULT)));
    return result;
  }

  @Override
  public ResultIterator getResults(Object it, Scope blockScope) {
    TransformScope transformScope = findTransformScope(blockScope);
    Templates templates = transformScope.getTemplates();
    Queue<Object> items = valueChain.run(it, blockScope);
    return new ResultIterator() {
      ResultIterator nestedResults;
      @Override
      public Object getNextResult() {
        Object result = null;
        while (result == null) {
          while (nestedResults == null) {
            if (items.isEmpty()) {
              return null;
            }
            Object item = items.poll();
            nestedResults = templates.matchTemplates(item, transformScope).orElse(null);
          }
          result = nestedResults.getNextResult();
          if (result == null) {
            nestedResults = null;
          } else if (result instanceof ResultIterator) {
            nestedResults = (ResultIterator) result;
            result = null;
          }
        }
        return result;
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
