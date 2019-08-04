package tailspin.ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tailspin.interpreter.Composer;
import tailspin.interpreter.CompositionSpec;
import tailspin.interpreter.ExpectedParameter;
import tailspin.interpreter.Scope;

public class ComposerDefinition {
  private final List<CompositionSpec> composition;
  private final Map<String, List<CompositionSpec>> definedSequences;
  private List<ExpectedParameter> expectedParameters = new ArrayList<>();

  public ComposerDefinition(List<CompositionSpec> composition,
      Map<String, List<CompositionSpec>> definedSequences) {
    this.composition = composition;
    this.definedSequences = definedSequences;
  }

  public Composer define(Scope definingScope) {
    Composer composer = new Composer(definingScope, composition, definedSequences);
    composer.expectParameters(expectedParameters);
    return composer;
  }

  public void expectParameters(List<ExpectedParameter> parameters) {
    expectedParameters.addAll(parameters);
  }
}
