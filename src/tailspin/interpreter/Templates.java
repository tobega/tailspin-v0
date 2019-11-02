package tailspin.interpreter;

import static tailspin.ast.Expression.EMPTY_RESULT;
import static tailspin.ast.Expression.queueOf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import tailspin.ast.Block;
import tailspin.ast.Expression;

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
  public Queue<Object> run(Object it, Map<String, Object> parameters) {
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

  Queue<Object> runInScope(Object it, TransformScope scope) {
    if (block != null) {
      return block.run(it, scope);
    } else {
      return matchTemplates(it, scope).map(b -> b.run(it, new NestedScope(scope))).orElse(EMPTY_RESULT);
    }
  }

  public Optional<Expression> matchTemplates(Object it, Scope scope) {
    if (it == null) {
      throw new NullPointerException("Attempt to use templates " + scopeName + " as a source");
    }
    Optional<MatchTemplate> match =
        matchTemplates.stream().filter(m -> m.matcher.matches(it, it, scope)).findFirst();
    return match.map(m -> m.block);
  }

  public void expectParameters(List<ExpectedParameter> parameters) {
    expectedParameters.addAll(parameters);
  }

  String getScopeName() {
    return scopeName;
  }

  void setScopeContext(String name) {
    scopeName = name;
  }
}
