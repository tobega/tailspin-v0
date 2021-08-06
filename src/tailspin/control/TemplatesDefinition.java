package tailspin.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.transform.ExpectedParameter;
import tailspin.transform.MatchTemplate;
import tailspin.transform.Templates;
import tailspin.types.Criterion;

public class TemplatesDefinition {

  public interface TemplatesConstructor {
    Templates create(String name, Scope definingScope, List<Map.Entry<String, Criterion>> localDatatypes,
        /*@Nullable*/ Block block, List<MatchTemplate> matchTemplates);
  }

  private final String name;
  private final List<Map.Entry<String, Criterion>> localDatatypes;
  private final Block block;
  private final List<MatchTemplate> matchTemplates;
  private final TemplatesConstructor constructor;
  private final List<ExpectedParameter> expectedParameters = new ArrayList<>();

  public TemplatesDefinition(String name, List<Map.Entry<String, Criterion>> localDatatypes,
      Block block, List<MatchTemplate> matchTemplates,
      TemplatesConstructor constructor) {
    this.name = name;
    this.localDatatypes = localDatatypes;
    this.block = block;
    this.matchTemplates = matchTemplates;
    this.constructor = constructor;
  }

  public Templates define(Scope definingScope) {
    Templates templates = constructor.create(name, definingScope, localDatatypes, block, matchTemplates);
    templates.expectParameters(expectedParameters);
    return templates;
  }

  public void expectParameters(List<ExpectedParameter> parameters) {
    expectedParameters.addAll(parameters);
  }
}
