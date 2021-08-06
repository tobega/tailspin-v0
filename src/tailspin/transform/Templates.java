package tailspin.transform;

import static tailspin.transform.ExpectedParameter.resolveParameters;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import tailspin.control.Block;
import tailspin.control.DelayedExecution;
import tailspin.interpreter.NestedScope;
import tailspin.interpreter.Scope;
import tailspin.matchers.DefinedCriterion;
import tailspin.types.Criterion;
import tailspin.types.Transform;

public class Templates implements Transform {
  final String name;
  final Scope definingScope;
  final List<Map.Entry<String, Criterion>> localDatatypes;
  // @Nullable
  final Block block;
  private final List<MatchTemplate> matchTemplates;
  final List<ExpectedParameter> expectedParameters = new ArrayList<>();

  public Templates(String name, Scope definingScope,
      List<Map.Entry<String, Criterion>> localDatatypes, /*@Nullable*/ Block block,
      List<MatchTemplate> matchTemplates) {
    this.name = name;
    this.definingScope = definingScope;
    this.localDatatypes = localDatatypes;
    this.block = block;
    this.matchTemplates = matchTemplates;
  }

  @Override
  public Object getResults(Object it, Map<String, Object> parameters) {
    TransformScope scope = createTransformScope(parameters);
    return runInScope(it, scope);
  }

  TransformScope createTransformScope(Map<String, Object> parameters) {
    TransformScope scope = new TransformScope(definingScope, name);
    scope.setTemplates(this);
    localDatatypes.forEach(dataDef -> scope.localDictionary.createDataDefinition(dataDef.getKey(),
        dataDef.getValue() == null ? null : new DefinedCriterion(dataDef.getValue(), scope)));
    resolveParameters(expectedParameters, parameters, scope, name);
    return scope;
  }

  DelayedExecution runInScope(Object it, TransformScope scope) {
    if (block != null) {
      return block.getResults(it, scope);
    } else {
      return matchTemplates(it, scope).orElse(null);
    }
  }

  public Optional<DelayedExecution> matchTemplates(Object it, Scope scope) {
    if (it == null) {
      throw new NullPointerException("Attempt to use templates " + name + " as a source");
    }
    Optional<MatchTemplate> match =
        matchTemplates.stream().filter(m -> m.matcher.isMet(it, it, scope)).findFirst();
    return match.map(m -> m.block.getResults(it, new NestedScope(scope)));
  }

  public void expectParameters(List<ExpectedParameter> parameters) {
    expectedParameters.addAll(parameters);
  }
}
