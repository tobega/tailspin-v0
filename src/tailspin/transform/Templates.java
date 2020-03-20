package tailspin.transform;

import static tailspin.ast.Expression.queueOf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import tailspin.ast.Block;
import tailspin.interpreter.NestedScope;
import tailspin.interpreter.Scope;
import tailspin.types.Transform;

public class Templates implements Transform {
  private final Scope definingScope;
  // @Nullable
  private final Block block;
  private final List<MatchTemplate> matchTemplates;
  private final List<ExpectedParameter> expectedParameters = new ArrayList<>();
  private String scopeName = "";

  public Templates(Scope definingScope,
      /*@Nullable*/ Block block, List<MatchTemplate> matchTemplates) {
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
    TransformScope scope = new TransformScope(definingScope, scopeName);
    scope.setTemplates(this);
    scope.setIt(queueOf(it));
    int foundParameters = 0;
    for (ExpectedParameter expectedParameter : expectedParameters) {
      if (parameters.containsKey(expectedParameter.name)) {
        foundParameters++;
        scope.defineValue(expectedParameter.name, parameters.get(expectedParameter.name));
      } else {
        throw new IllegalArgumentException("Missing parameter " + expectedParameter.name + " to " + scope.scopeContext);
      }
    }
    if (foundParameters != parameters.size()) {
      throw new IllegalArgumentException("Too many parameters for " + scope.scopeContext + ":\n" + parameters);
    }
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
      throw new NullPointerException("Attempt to use templates " + scopeName + " as a source");
    }
    Optional<MatchTemplate> match =
        matchTemplates.stream().filter(m -> m.matcher.matches(it, it, scope)).findFirst();
    return match.map(m -> m.block.getResults(it, new NestedScope(scope)));
  }

  public void expectParameters(List<ExpectedParameter> parameters) {
    expectedParameters.addAll(parameters);
  }

  public void setScopeContext(String name) {
    scopeName = name;
  }
}
