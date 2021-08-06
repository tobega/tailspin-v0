package tailspin.transform;

import static tailspin.transform.ExpectedParameter.resolveParameters;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import tailspin.control.Block;
import tailspin.control.DelayedExecution;
import tailspin.control.ResultIterator;
import tailspin.control.TypestateDefinition;
import tailspin.interpreter.NestedScope;
import tailspin.interpreter.Scope;
import tailspin.matchers.DefinedCriterion;
import tailspin.types.Criterion;
import tailspin.types.ProcessorInstance;

public class ProcessorConstructor extends Templates {

  private final List<TypestateDefinition> typestates;

  public ProcessorConstructor(String name, Scope definingScope, List<Map.Entry<String, Criterion>> localDatatypes, Block block,
      List<TypestateDefinition> typestates) {
    super(name, definingScope, localDatatypes, block, new ArrayList<>());
    this.typestates = typestates;
  }

  @Override
  public Object getResults(Object it, Map<String, Object> parameters) {
    ProcessorScope scope = new ProcessorScope(definingScope, name);
    localDatatypes.forEach(dataDef -> scope.localDictionary.createDataDefinition(dataDef.getKey(),
        dataDef.getValue() == null ? null : new DefinedCriterion(dataDef.getValue(), scope)));
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
      while ((results = ri.getNextResult()) != null) {
        if (results instanceof ResultIterator r) {
          ri = r;
        } else {
          throw new IllegalStateException("Processor constructor " + name + " emitted value " + results);
        }
      }
    }
  }

  @Override
  public Optional<DelayedExecution> matchTemplates(Object it, Scope scope) {
    throw new UnsupportedOperationException("Cannot send to templates in");
  }
}
