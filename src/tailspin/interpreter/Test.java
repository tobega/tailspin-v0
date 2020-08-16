package tailspin.interpreter;

import java.util.ArrayList;
import java.util.List;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.control.Value;

public class Test implements Expression {
  private final Value description;
  private final List<ModuleProvider> injectedModules;
  private final List<Expression> expressions;

  public Test(Value description, List<ModuleProvider> injectedModules, List<Expression> expressions) {
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
    List<SymbolLibrary> mocks = new ArrayList<>(providedLibraries);
    for (ModuleProvider provider : injectedModules) {
      SymbolLibrary provided = provider.installDependencies(List.copyOf(mocks));
      mocks.add(0, provided);
    }
    return mocks;
  }
}
