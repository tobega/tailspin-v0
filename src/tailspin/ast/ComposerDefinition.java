package tailspin.ast;

import java.util.ArrayList;
import java.util.List;
import tailspin.interpreter.Composer;
import tailspin.transform.composer.CompositionSpec;
import tailspin.interpreter.ExpectedParameter;
import tailspin.interpreter.Scope;
import tailspin.transform.composer.SubComposerFactory;

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

  public Composer define(Scope definingScope) {
    Composer composer = new Composer(definingScope, stateAssignment, composition, subComposerFactory);
    composer.expectParameters(expectedParameters);
    return composer;
  }

  public void expectParameters(List<ExpectedParameter> parameters) {
    expectedParameters.addAll(parameters);
  }
}
