package tailspin.ast;

import java.util.List;
import tailspin.interpreter.MatchTemplate;
import tailspin.interpreter.Scope;
import tailspin.interpreter.Templates;

public class TemplatesDefinition {
  private final Block block;
  private final List<MatchTemplate> matchTemplates;

  public TemplatesDefinition(Block block, List<MatchTemplate> matchTemplates) {
    this.block = block;
    this.matchTemplates = matchTemplates;
  }

  public Templates define(Scope definingScope) {
    return new Templates(definingScope, block, matchTemplates);
  }
}
