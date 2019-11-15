package tailspin.ast;

import java.util.Map;
import tailspin.interpreter.Scope;

public class InlineTemplates implements Expression {
  private final TemplatesDefinition templatesDefinition;

  public InlineTemplates(TemplatesDefinition templatesDefinition) {
    this.templatesDefinition = templatesDefinition;
  }

  @Override
  public Object getResults(Object it, Scope definingScope) {
    return templatesDefinition.define(definingScope).getResults(it, Map.of());
  }
}
