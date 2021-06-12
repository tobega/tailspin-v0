package tailspin.transform;

import static tailspin.transform.ExpectedParameter.resolveParameters;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import tailspin.control.Block;
import tailspin.control.ResultIterator;
import tailspin.control.TypestateDefinition;
import tailspin.interpreter.NestedScope;
import tailspin.interpreter.Scope;
import tailspin.types.ProcessorInstance;

public class ProcessorConstructor extends Templates {

  private final List<TypestateDefinition> typestates;

  public ProcessorConstructor(String name, Scope definingScope, Block block,
      List<TypestateDefinition> typestates) {
    super(name, definingScope, block, new ArrayList<>());
    this.typestates = typestates;
  }

  @Override
  public Object getResults(Object it, Map<String, Object> parameters) {
    ProcessorScope scope = new ProcessorScope(definingScope, name);
    Scope constructorScope = new NestedScope(scope);
    resolveParameters(expectedParameters, parameters, constructorScope, name);
    scope.addTypestate(name, constructorScope);
    for (TypestateDefinition typestate : typestates) {
      Scope stateScope = new NestedScope(constructorScope);
      typestate.evaluateBlock(stateScope);
      scope.addTypestate(typestate.getName(), stateScope);
    }
    evaluateBlock(it, constructorScope);
    return new ProcessorInstance(scope);
  }

  private void evaluateBlock(Object it, Scope constructorScope) {
    Object results = block == null ? null : block.getResults(it, constructorScope);
    // TODO: assert everything null
    if (results instanceof ResultIterator ri) {
      Object r;
      while ((r = ri.getNextResult()) != null) {
        if (r instanceof ResultIterator) {
          ri = (ResultIterator) r;
        }
      }
      results = r;
    }
    if (results != null) throw new IllegalStateException("Processor constructor " + name + " emitted value " + results);
  }

  @Override
  public Optional<Object> matchTemplates(Object it, Scope scope) {
    throw new UnsupportedOperationException("Cannot send to templates in");
  }
}
