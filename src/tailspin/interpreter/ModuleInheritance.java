package tailspin.interpreter;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ModuleInheritance implements ModuleProvider {

  private final String prefix;

  public ModuleInheritance(String prefix) {
    this.prefix = prefix;
  }

  class Provided implements SymbolLibrary {

    private final List<SymbolLibrary> providedModules;

    Provided(List<SymbolLibrary> providedModules) {
      this.providedModules = providedModules;
    }

    @Override
    public Set<String> installSymbols(
        Set<String> requiredSymbols, BasicScope scope) {
      Set<String> providedSymbols;
      if (prefix.isEmpty()) {
        providedSymbols =
            requiredSymbols.stream().filter(s -> !s.contains("/")).collect(Collectors.toSet());
      } else {
        providedSymbols =
            requiredSymbols.stream().filter(s -> s.startsWith(prefix)).collect(Collectors.toSet());
      }
      for (SymbolLibrary lib : providedModules) {
        Set<String> remaining = lib.installSymbols(providedSymbols, scope);
        if (!remaining.isEmpty() && remaining.size() != providedSymbols.size()) {
          throw new IllegalStateException(
              "Some symbols not provided: " + remaining);
        }
        if (remaining.isEmpty()) break;
      }
      return requiredSymbols.stream()
          .filter(s -> !providedSymbols.contains(s))
          .collect(Collectors.toSet());
    }
  }

  @Override
  public SymbolLibrary installDependencies(List<SymbolLibrary> providedDependencies) {
    return new Provided(providedDependencies);
  }
}
