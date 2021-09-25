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
import tailspin.matchers.DefinedTag;
import tailspin.types.DataDictionary;
import tailspin.types.Membrane;
import tailspin.types.Transform;

public class Templates implements Transform {
  final String name;
  final Scope definingScope;
  final List<Map.Entry<String, Membrane>> localDatatypes;
  // @Nullable
  final Block block;
  private final List<MatchTemplate> matchTemplates;
  final List<ExpectedParameter> expectedParameters = new ArrayList<>();

  public Templates(String name, Scope definingScope,
      List<Map.Entry<String, Membrane>> localDatatypes, /*@Nullable*/ Block block,
      List<MatchTemplate> matchTemplates) {
    this.name = name;
    this.definingScope = definingScope;
    this.localDatatypes = localDatatypes;
    this.block = block;
    this.matchTemplates = matchTemplates;
  }

  @Override
  public Object getResults(Object it, Map<String, Object> parameters,
      DataDictionary callingDictionary) {
    TransformScope scope = createTransformScope(parameters, callingDictionary);
    return runInScope(it, scope);
  }

  TransformScope createTransformScope(Map<String, Object> parameters,
      DataDictionary callingDictionary) {
    TransformScope scope = new TransformScope(definingScope, name, callingDictionary);
    scope.setTemplates(this);
    localDatatypes.forEach(dataDef -> scope.getLocalDictionary().createDataDefinition(dataDef.getKey(),
        dataDef.getValue() == null ? null : new DefinedTag(dataDef.getKey(), dataDef.getValue(), scope)));
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
    for (MatchTemplate match : matchTemplates) {
      Object matching = match.matcher.permeate(it, it, scope);
      if (matching != null) {
        return Optional.of(match.block.getResults(matching, new NestedScope(scope)));
      }
    }
    return Optional.empty();
  }

  public void expectParameters(List<ExpectedParameter> parameters) {
    expectedParameters.addAll(parameters);
  }
}
