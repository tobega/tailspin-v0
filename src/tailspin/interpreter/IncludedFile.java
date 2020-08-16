package tailspin.interpreter;

import tailspin.Tailspin;
import tailspin.control.Value;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class IncludedFile {
  // @Nullable
  final String prefix;
  final Value specifier;

  IncludedFile(/*@Nullable*/ String prefix, Value specifier) {
    this.prefix = prefix;
    this.specifier = specifier;
  }

  private Program getProgram(Path depPath) {
    try {
      Tailspin dep = Tailspin.parse(Files.newInputStream(depPath));
      return new RunMain().visitProgram(dep.programDefinition);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public Set<String> installSymbols(
      Set<String> requiredSymbols, BasicScope scope, List<SymbolLibrary> inheritedProviders) {
    String dependency = (String) specifier.getResults(null, scope);
    Path basePath = scope.basePath();
    String dependencyPrefix =
        prefix != null ? prefix : dependency.substring(dependency.lastIndexOf('/') + 1) + "/";
    Set<String> providedSymbols = new HashSet<>();
    Set<String> unresolvedSymbols = new HashSet<>();
    requiredSymbols.forEach(
        s -> {
          if (s.startsWith(dependencyPrefix)) {
            providedSymbols.add(s.substring(dependencyPrefix.length()));
          } else {
            unresolvedSymbols.add(s);
          }
        });
    Path depPath = basePath.resolve(dependency + ".tt");
    try {
      if (!depPath.toRealPath().startsWith(basePath.toRealPath())) {
        throw new IllegalArgumentException(
            "Attempt to include file " + depPath + " from outside hierarchy of " + basePath);
      }
    } catch (IOException e) {
      throw new IllegalArgumentException("Unable to resolve " + depPath);
    }
    Module module = getProgram(depPath);
    BasicScope depScope = new BasicScope(depPath.getParent());
    module.resolveSymbols(providedSymbols, depScope, inheritedProviders);
    providedSymbols.forEach(s -> scope.defineValue(dependencyPrefix + s, depScope.resolveValue(s)));
    return unresolvedSymbols;
  }
}
