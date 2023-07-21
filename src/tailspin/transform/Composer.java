package tailspin.transform;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import tailspin.control.DataDefinition;
import tailspin.control.Expression;
import tailspin.interpreter.Scope;
import tailspin.matchers.composer.CompositionSpec;
import tailspin.matchers.composer.Memo;
import tailspin.matchers.composer.SequenceSubComposer;
import tailspin.matchers.composer.SubComposerFactory;
import tailspin.types.DataDictionary;
import tailspin.types.Structure;
import tailspin.types.TaggedIdentifier;
import tailspin.types.Transform;

public class Composer implements Transform {

  private final Scope definingScope;
  private final List<DataDefinition> localDatatypes;
  private final Expression stateAssignment;
  private final List<CompositionSpec> specs;
  private final List<ExpectedParameter> expectedParameters = new ArrayList<>();
  private final SubComposerFactory subComposerFactory;
  private String scopeName = "";

  public Composer(Scope definingScope, /* @Nullable */
      List<DataDefinition> localDatatypes, Expression stateAssignment,
      List<CompositionSpec> specs,
      SubComposerFactory subComposerFactory) {
    this.definingScope = definingScope;
    this.localDatatypes = localDatatypes;
    this.stateAssignment = stateAssignment;
    this.specs = specs;
    this.subComposerFactory = subComposerFactory;
  }

  @Override
  public Object getResults(Object it, Map<String, Object> parameters,
      DataDictionary callingDictionary) {
    TransformScope scope = createTransformScope(parameters, callingDictionary);
    if (stateAssignment != null) {
      stateAssignment.getResults(null, scope);
    }
    Objects.requireNonNull(it);
    if (it instanceof TaggedIdentifier t) it = t.getValue();
    String s = (String) it;
    Memo memo = Memo.root(0);
    SequenceSubComposer subComposer = new SequenceSubComposer(specs, scope, subComposerFactory::resolveSpec);
    memo = subComposer.nibble(s, memo);
    while (subComposer.isSatisfied() && memo.pos < s.length()) {
      memo = subComposer.backtrack(s, memo);
    }
    if (!subComposer.isSatisfied()) {
      return Structure.value(Map.of("composerFailed", s));
    }
    return subComposer.getValues();
  }

  private TransformScope createTransformScope(Map<String, Object> parameters,
      DataDictionary callingDictionary) {
    TransformScope scope = new TransformScope(definingScope, scopeName, callingDictionary);
    localDatatypes.forEach(dataDef -> dataDef.getResults(null, scope));
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
