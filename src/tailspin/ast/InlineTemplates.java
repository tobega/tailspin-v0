package tailspin.ast;

import java.util.Map;
import java.util.Queue;
import tailspin.interpreter.Scope;

public class InlineTemplates implements Expression {
  private final TemplatesDefinition templatesDefinition;

  public InlineTemplates(TemplatesDefinition templatesDefinition) {
    this.templatesDefinition = templatesDefinition;
  }

  @Override
  public Queue<Object> run(Object it, Scope definingScope) {
    return templatesDefinition.define(definingScope).run(it, Map.of());
  }
}
