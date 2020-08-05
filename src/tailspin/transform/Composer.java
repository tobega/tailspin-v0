package tailspin.transform;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import tailspin.control.Expression;
import tailspin.interpreter.Scope;
import tailspin.matchers.composer.CompositionSpec;
import tailspin.matchers.composer.Memo;
import tailspin.matchers.composer.SequenceSubComposer;
import tailspin.matchers.composer.SubComposerFactory;
import tailspin.types.Transform;

public class Composer implements Transform {

  private final Scope definingScope;
  private final Expression stateAssignment;
  private final List<CompositionSpec> specs;
  private final List<ExpectedParameter> expectedParameters = new ArrayList<>();
  private final SubComposerFactory subComposerFactory;
  private String scopeName = "";

  public Composer(Scope definingScope, /* @Nullable */ Expression stateAssignment,
      List<CompositionSpec> specs,
      SubComposerFactory subComposerFactory) {
    this.definingScope = definingScope;
    this.stateAssignment = stateAssignment;
    this.specs = specs;
    this.subComposerFactory = subComposerFactory;
  }

  @Override
  public Object getResults(Object it, Map<String, Object> parameters) {
    TransformScope scope = createTransformScope(it, parameters);
    if (stateAssignment != null) {
      stateAssignment.getResults(null, scope);
    }
    Memo memo = new Memo((String) Objects.requireNonNull(it), null);
    SequenceSubComposer subComposer = new SequenceSubComposer(specs, scope, subComposerFactory::resolveSpec);
    memo = subComposer.nibble(memo);
    while (subComposer.isSatisfied() && !memo.s.isEmpty()) {
      memo = subComposer.backtrack(memo);
    }
    if (!subComposer.isSatisfied()) {
      throw new IllegalStateException("Unable to compose value from string:'" + memo.s + "'");
    }
    return subComposer.getValues();
  }

  private TransformScope createTransformScope(Object it, Map<String, Object> parameters) {
    TransformScope scope = new TransformScope(definingScope, scopeName);
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

  public void expectParameters(List<ExpectedParameter> parameters) {
    expectedParameters.addAll(parameters);
  }

  public void setScopeContext(String name) {
    scopeName = name;
  }
}
