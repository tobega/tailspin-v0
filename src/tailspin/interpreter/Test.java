package tailspin.interpreter;

import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.control.Value;

import java.util.List;
import java.util.Set;

public class Test implements Expression {
  private final Value description;
  private final List<DependencyProvider> dependencyProviders;
  private final List<Expression> expressions;

  public Test(Value description, List<DependencyProvider> dependencyProviders, List<Expression> expressions) {
    this.description = description;
    this.dependencyProviders = dependencyProviders;
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

  public Set<String> installOverrides(Set<String> requiredSymbols, Scope scope) {
    for (DependencyProvider provider : dependencyProviders) {
      requiredSymbols = provider.installSymbols(requiredSymbols, scope, List.of());
    }
    return requiredSymbols;
  }
}
