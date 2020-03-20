package tailspin.transform;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import tailspin.control.Block;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.types.ProcessorInstance;

public class ProcessorConstructor extends Templates {
  public ProcessorConstructor(Scope definingScope, Block block) {
    super(definingScope, block, new ArrayList<>());
  }

  @Override
  public Object getResults(Object it, Map<String, Object> parameters) {
    TransformScope scope = createTransformScope(it, parameters);
    Object results = runInScope(it, scope);
    // TODO: assert everything null
    if (results instanceof ResultIterator) {
      ResultIterator ri = (ResultIterator) results;
      Object r;
      while ((r = ri.getNextResult()) != null) {
        if (r instanceof ResultIterator) {
          ri = (ResultIterator) r;
        }
      }
    }
    return new ProcessorInstance(scope);
  }

  @Override
  public Optional<Object> matchTemplates(Object it, Scope scope) {
    throw new UnsupportedOperationException("Cannot send to templates in");
  }
}
