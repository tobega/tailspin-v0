package tailspin.interpreter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.control.Value;

public class Test implements Expression {
  private final Value description;
  private final List<SymbolLibrary> injectedModules;
  private final List<Expression> expressions;

  public Test(Value description, List<SymbolLibrary> injectedModules, List<Expression> expressions) {
    this.description = description;
    this.injectedModules = injectedModules;
    this.expressions = expressions;
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

  public List<SymbolLibrary> getMocks(List<SymbolLibrary> providedLibraries) {
    return Stream.concat(injectedModules.stream(), providedLibraries.stream()).collect(Collectors.toList());
  }
}
