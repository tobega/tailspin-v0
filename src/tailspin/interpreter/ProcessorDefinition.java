package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import tailspin.parser.TailspinParser;
import tailspin.types.ProcessorInstance;

class ProcessorDefinition extends Templates {
  ProcessorDefinition(Scope definingScope, TailspinParser.BlockContext block) {
    super(definingScope, block, new ArrayList<>());
  }

  @Override
  public Queue<Object> run(Queue<Object> it, Map<String, Object> parameters) {
    TransformScope scope = createTransformScope(it, parameters);
    runInScope(scope);
    Queue<Object> result = new ArrayDeque<>();
    result.add(new ProcessorInstance(scope));
    return result;
  }

  @Override
  Queue<Object> matchTemplates(RunTemplateBlock.RunMatcherBlock runner) {
    throw new UnsupportedOperationException("Cannot send to templates in");
  }
}
