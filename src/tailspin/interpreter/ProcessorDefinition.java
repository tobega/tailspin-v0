package tailspin.interpreter;

import static tailspin.ast.Expression.oneValue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import tailspin.ast.Block;
import tailspin.types.ProcessorInstance;

class ProcessorDefinition extends Templates {
  ProcessorDefinition(Scope definingScope, Block block) {
    super(definingScope, block, new ArrayList<>());
  }

  @Override
  public Queue<Object> run(Queue<Object> it, Map<String, Object> parameters) {
    TransformScope scope = createTransformScope(it, parameters);
    runInScope(oneValue(it), scope);
    Queue<Object> result = new ArrayDeque<>();
    result.add(new ProcessorInstance(scope));
    return result;
  }

  @Override
  public Queue<Object> matchTemplates(RunTemplateBlock.RunMatcherBlock runner) {
    throw new UnsupportedOperationException("Cannot send to templates in");
  }
}
