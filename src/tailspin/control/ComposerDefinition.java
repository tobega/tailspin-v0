package tailspin.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.matchers.composer.CompositionSpec;
import tailspin.matchers.composer.SubComposerFactory;
import tailspin.transform.Composer;
import tailspin.transform.ExpectedParameter;
import tailspin.types.Membrane;

public class ComposerDefinition {

  private final Expression stateAssignment;
  private final List<CompositionSpec> composition;
  private final SubComposerFactory subComposerFactory;
  private List<ExpectedParameter> expectedParameters = new ArrayList<>();

  public ComposerDefinition(Expression stateAssignment,
      List<CompositionSpec> composition,
      SubComposerFactory subComposerFactory) {
    this.stateAssignment = stateAssignment;
    this.composition = composition;
    this.subComposerFactory = subComposerFactory;
  }

  public Composer define(Scope definingScope, List<Map.Entry<String, Membrane>> localDatatypes) {
    Composer composer = new Composer(definingScope, localDatatypes, stateAssignment, composition, subComposerFactory);
    composer.expectParameters(expectedParameters);
    return composer;
  }

  public void expectParameters(List<ExpectedParameter> parameters) {
    expectedParameters.addAll(parameters);
  }
}
