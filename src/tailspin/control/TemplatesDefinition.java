package tailspin.control;

import java.util.ArrayList;
import java.util.List;
import tailspin.transform.ExpectedParameter;
import tailspin.transform.MatchTemplate;
import tailspin.interpreter.Scope;
import tailspin.transform.Templates;

public class TemplatesDefinition {

  public interface TemplatesConstructor {
    Templates create(Scope definingScope,
        /*@Nullable*/ Block block, List<MatchTemplate> matchTemplates);
  }

  private final Block block;
  private final List<MatchTemplate> matchTemplates;
  private final TemplatesConstructor constructor;
  private final List<ExpectedParameter> expectedParameters = new ArrayList<>();

  public TemplatesDefinition(Block block, List<MatchTemplate> matchTemplates,
      TemplatesConstructor constructor) {
    this.block = block;
    this.matchTemplates = matchTemplates;
    this.constructor = constructor;
  }

  public Templates define(Scope definingScope) {
    Templates templates = constructor.create(definingScope, block, matchTemplates);
    templates.expectParameters(expectedParameters);
    return templates;
  }

  public void expectParameters(List<ExpectedParameter> parameters) {
    expectedParameters.addAll(parameters);
  }
}
