package tailspin.ast;

import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.interpreter.Templates;

public class InlineTemplates implements Expression {
  private final TemplatesDefinition templatesDefinition;
  private final String name;

  public InlineTemplates(TemplatesDefinition templatesDefinition, String name) {
    this.templatesDefinition = templatesDefinition;
    this.name = name;
  }

  @Override
  public Object getResults(Object it, Scope definingScope) {
    Templates templates = templatesDefinition.define(definingScope);
    templates.setScopeContext(name);
    return templates.getResults(it, Map.of());
  }
}
