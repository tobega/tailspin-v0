package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import tailspin.ast.Block;
import tailspin.types.ProcessorInstance;

public class ProcessorConstructor extends Templates {
  public ProcessorConstructor(Scope definingScope, Block block) {
    super(definingScope, block, new ArrayList<>());
  }

  @Override
  public Queue<Object> run(Object it, Map<String, Object> parameters) {
    TransformScope scope = createTransformScope(it, parameters);
    runInScope(it, scope);
    Queue<Object> result = new ArrayDeque<>();
    result.add(new ProcessorInstance(scope));
    return result;
  }

  @Override
  public Optional<Object> matchTemplates(Object it, Scope scope) {
    throw new UnsupportedOperationException("Cannot send to templates in");
  }
}
