package tailspin.ast;

import java.util.ArrayList;
import java.util.List;
import tailspin.interpreter.ExpectedParameter;
import tailspin.interpreter.MatchTemplate;
import tailspin.interpreter.Scope;
import tailspin.interpreter.Templates;

public class TemplatesDefinition {
  private final Block block;
  private final List<MatchTemplate> matchTemplates;
  private final List<ExpectedParameter> expectedParameters = new ArrayList<>();

  public TemplatesDefinition(Block block, List<MatchTemplate> matchTemplates) {
    this.block = block;
    this.matchTemplates = matchTemplates;
  }

  public Templates define(Scope definingScope) {
    Templates templates = new Templates(definingScope, block, matchTemplates);
    templates.expectParameters(expectedParameters);
    return templates;
  }

  public void expectParameters(List<ExpectedParameter> parameters) {
    expectedParameters.addAll(parameters);
  }
}
