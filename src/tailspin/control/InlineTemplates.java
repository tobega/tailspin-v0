package tailspin.control;

import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.transform.Templates;

public class InlineTemplates implements Expression {
  private final TemplatesDefinition templatesDefinition;

  public InlineTemplates(TemplatesDefinition templatesDefinition) {
    this.templatesDefinition = templatesDefinition;
  }

  @Override
  public Object getResults(Object it, Scope definingScope) {
    Templates templates = templatesDefinition.define(definingScope);
    return templates.getResults(it, Map.of());
  }
}
