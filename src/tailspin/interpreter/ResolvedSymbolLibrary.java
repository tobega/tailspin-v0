package tailspin.interpreter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ResolvedSymbolLibrary implements SymbolLibrary {

  private final BasicScope resolvedScope;

  public ResolvedSymbolLibrary(BasicScope resolvedScope) {
    this.resolvedScope = resolvedScope;
  }

  @Override
  public Set<String> installSymbols(Set<String> requiredSymbols, Scope scope,
      List<SymbolLibrary> providedModules) {
    Set<String> unprovidedSymbols = new HashSet<>();
    for (String symbol : requiredSymbols) {
      if (resolvedScope.hasDefinition(symbol)) {
        scope.defineValue(symbol, resolvedScope.resolveValue(symbol));
      } else {
        unprovidedSymbols.add(symbol);
      }
    }
    return unprovidedSymbols;
  }
}
