package tailspin.ast;

import java.util.List;
import java.util.Map;
import tailspin.interpreter.Composer;
import tailspin.interpreter.Composer.CompositionSpec;
import tailspin.interpreter.Scope;

public class ComposerDefinition {
  private final List<CompositionSpec> composition;
  private final Map<String, List<CompositionSpec>> definedSequences;

  public ComposerDefinition(List<CompositionSpec> composition,
      Map<String, List<CompositionSpec>> definedSequences) {
    this.composition = composition;
    this.definedSequences = definedSequences;
  }

  public Composer define(Scope definingScope) {
    return new Composer(definingScope, composition, definedSequences);
  }
}
