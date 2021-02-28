package tailspin.interpreter;

import java.util.List;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.control.Value;

public class Test implements Expression {
  private final Value description;
  private final List<ModuleProvider> injectedModules;
  private final List<Expression> expressions;
  private final ProgramModification programModification;

  public Test(Value description, List<ModuleProvider> injectedModules, List<Expression> expressions,
      ProgramModification programModification) {
    this.description = description;
    this.injectedModules = injectedModules;
    this.expressions = expressions;
    this.programModification = programModification;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    Object result = null;
    for (Expression expression : expressions) {
      result = ResultIterator.appendResultValue(result, expression.getResults(null, blockScope));
    }
    if (result != null) {
      result =  ResultIterator.appendResultValue(
          "" + description.getResults(null, blockScope) + " failed:", result);
    }
    return result;
  }

  public List<ModuleProvider> getInjectedModules() {
    return injectedModules;
  }

  public List<DefinitionStatement> overrideDefinitions(List<DefinitionStatement> programDefinitions) {
    return programModification.overrideDefinitions(programDefinitions);
  }
}
