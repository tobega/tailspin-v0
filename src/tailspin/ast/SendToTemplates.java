package tailspin.ast;

import java.util.ArrayDeque;
import java.util.Queue;
import tailspin.interpreter.RunTemplateBlock;
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
    RunTemplateBlock runner = new RunTemplateBlock(transformScope);
    Queue<Object> result = new ArrayDeque<>();
    valueChain.run(it, blockScope).forEach(item ->
      result.addAll(templates.matchTemplates(runner.createMatcherBlockRunner(Expression.queueOf(item)))));
    return result;
  }

  private TransformScope findTransformScope(Scope blockScope) {
    while (!(blockScope instanceof TransformScope)) {
      blockScope = blockScope.getParentScope();
    }
    return (TransformScope) blockScope;
  }
}
