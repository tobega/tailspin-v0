package tailspin.transform;

import static tailspin.transform.ExpectedParameter.resolveParameters;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import tailspin.control.Block;
import tailspin.interpreter.NestedScope;
import tailspin.interpreter.Scope;
import tailspin.types.Transform;

public class Templates implements Transform {
  final String name;
  final Scope definingScope;
  // @Nullable
  final Block block;
  private final List<MatchTemplate> matchTemplates;
  final List<ExpectedParameter> expectedParameters = new ArrayList<>();

  public Templates(String name, Scope definingScope,
      /*@Nullable*/ Block block, List<MatchTemplate> matchTemplates) {
    this.name = name;
    this.definingScope = definingScope;
    this.block = block;
    this.matchTemplates = matchTemplates;
  }

  @Override
  public Object getResults(Object it, Map<String, Object> parameters) {
    TransformScope scope = createTransformScope(it, parameters);
    return runInScope(it, scope);
  }

  TransformScope createTransformScope(Object it, Map<String, Object> parameters) {
    TransformScope scope = new TransformScope(definingScope, name);
    scope.setTemplates(this);
    resolveParameters(expectedParameters, parameters, scope, name);
    return scope;
  }

  Object runInScope(Object it, TransformScope scope) {
    if (block != null) {
      return block.getResults(it, scope);
    } else {
      return matchTemplates(it, scope).orElse(null);
    }
  }

  public Optional<Object> matchTemplates(Object it, Scope scope) {
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
