package tailspin.control;

import java.util.ArrayList;
import java.util.List;
import tailspin.interpreter.Scope;
import tailspin.transform.ExpectedParameter;
import tailspin.transform.MatchTemplate;
import tailspin.transform.Templates;

public class TemplatesDefinition {

  public interface TemplatesConstructor {
    Templates create(String name, Scope definingScope, List<DataDefinition> localDatatypes,
        /*@Nullable*/ Block block, List<MatchTemplate> matchTemplates);
  }

  private final String name;
  private final List<DataDefinition> localDatatypes;
  private final Block block;
  private final List<MatchTemplate> matchTemplates;
  private final TemplatesConstructor constructor;
  private final List<ExpectedParameter> expectedParameters = new ArrayList<>();

  public TemplatesDefinition(String name, List<DataDefinition> localDatatypes,
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
