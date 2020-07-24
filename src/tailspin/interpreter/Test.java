package tailspin.interpreter;

import java.util.stream.Stream;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.control.Value;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Test implements Expression {
  private final Value description;
  private final List<ModuleProvision> injectedModules;
  private final List<Expression> expressions;

  public Test(Value description, List<ModuleProvision> injectedModules, List<Expression> expressions) {
    this.description = description;
    this.injectedModules = injectedModules;
    this.expressions = expressions;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    Object result = null;
    for (Expression expression : expressions) {
      result = ResultIterator.resolveResult(result, expression.getResults(null, blockScope));
    }
    if (result != null) {
      result =  ResultIterator.resolveResult(
          "" + description.getResults(null, blockScope) + " failed:", result);
    }
    return result;
  }

  public List<SymbolLibrary> createMocks(Path basePath, List<SymbolLibrary> providedLibraries) {
    return Stream.concat(injectedModules.stream().map(m -> m.resolveDefinitions(basePath, providedLibraries)),
        providedLibraries.stream()).collect(Collectors.toList());
  }
}
