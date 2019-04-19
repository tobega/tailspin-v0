package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import tailspin.parser.TailspinParser;

class ProcessorDefinition extends Templates {

  ProcessorDefinition(TailspinParser.BlockContext block) {
    super(block, new ArrayList<>());
  }

  @Override
  public Queue<Object> run(TransformScope scope, Map<String, Object> parameters) {
    super.run(scope, parameters);
    Queue<Object> result = new ArrayDeque<>();
    result.add(new ProcessorInstance(scope));
    return result;
  }

  @Override
  Queue<Object> matchTemplates(RunTemplateBlock.RunMatcherBlock runner) {
    throw new UnsupportedOperationException("Cannot send to templates in");
  }
}
