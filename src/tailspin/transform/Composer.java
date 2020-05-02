package tailspin.transform;

import static tailspin.control.Expression.queueOf;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.matchers.composer.CompositionSpec;
import tailspin.matchers.composer.SubComposer;
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
    ArrayDeque<Object> result = new ArrayDeque<>();
    String s = (String) it;
    for (CompositionSpec spec : specs) {
      SubComposer subComposer = subComposerFactory.resolveSpec(spec, scope);
      s = subComposer.nibble(s);
      if (!subComposer.isSatisfied()) {
        throw new IllegalStateException("No composer match at '" + s + "'");
      }
      result.addAll(subComposer.getValues());
    }
    if (!s.isEmpty()) {
      throw new IllegalStateException("Composer did not use entire string. Remaining:'" + s + "'");
    }
    return (ResultIterator) result::poll;
  }

  private TransformScope createTransformScope(Object it, Map<String, Object> parameters) {
    TransformScope scope = new TransformScope(definingScope, scopeName);
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

  public void expectParameters(List<ExpectedParameter> parameters) {
    expectedParameters.addAll(parameters);
  }

  public void setScopeContext(String name) {
    scopeName = name;
  }
}
