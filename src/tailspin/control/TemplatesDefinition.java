package tailspin.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import tailspin.interpreter.Scope;
import tailspin.transform.ExpectedParameter;
import tailspin.transform.MatchTemplate;
import tailspin.transform.Templates;

public class TemplatesDefinition {

  public interface TemplatesConstructor {
    Templates create(String name, Scope definingScope, Set<String> localDatatypes,
        /*@Nullable*/ Block block, List<MatchTemplate> matchTemplates);
  }

  private final String name;
  private final Set<String> localDatatypes;
  private final Block block;
  private final List<MatchTemplate> matchTemplates;
  private final TemplatesConstructor constructor;
  private final List<ExpectedParameter> expectedParameters = new ArrayList<>();

  public TemplatesDefinition(String name, Set<String> localDatatypes,
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
