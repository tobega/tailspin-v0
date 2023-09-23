package tailspin.interpreter;

import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Module extends SymbolResolver {
  protected final List<DefinitionStatement> definitions;

  class Installer implements SymbolLibrary.Installer {
    private final BasicScope depScope;
    private final String prefix;
    private List<SymbolLibrary> providedDependencies;

    Installer(String prefix, Path basePath,
        List<SymbolLibrary> providedDependencies) {
      this.prefix = prefix;
      depScope = new BasicScope(basePath);
      this.providedDependencies = providedDependencies;
    }

    @Override
    public Set<String> resolveSymbols(Set<String> neededSymbols, BasicScope scope) {
      // We might be shadowing a module, so don't try to register what we don't define.
      Set<String> internalSymbols = new HashSet<>();
      for (DefinitionStatement ds : definitions) {
        if (neededSymbols.contains(ds.getDefinedSymbol())) {
          internalSymbols.add(ds.getDefinedSymbol());
        }
      }
      if (internalSymbols.isEmpty()) return neededSymbols;
      Module.this.resolveSymbols(internalSymbols, depScope, providedDependencies);
      neededSymbols.stream()
          .filter(internalSymbols::contains)
          .forEach(s -> scope.defineValue(prefix + s, depScope.resolveValue(s)));
      return neededSymbols.stream()
          .filter(s -> !internalSymbols.contains(s))
          .collect(Collectors.toSet());
    }

    @Override
    public void injectMocks(List<SymbolLibrary> mocks) {
      providedDependencies = mocks;
    }
  }

  public Module(
      List<DefinitionStatement> definitions, List<IncludedFile> includedFiles) {
    super(includedFiles);
    this.definitions = definitions;
  }

  @Override
  public List<DefinitionStatement> getDefinitions() {
    return definitions;
  }

  void resolveSymbols(Set<String> internalSymbols, BasicScope scope,
                      List<SymbolLibrary> providedDependencies) {
    Set<String> localDefinitionsNeeded = resolveSymbolDependencies(internalSymbols, scope, providedDependencies);
    getDefinitions().stream()
        .filter(d -> d.alwaysRun() || localDefinitionsNeeded.contains(d.getDefinedSymbol()))
        .forEach(d -> d.getResults(scope));
  }

  public void installAll(BasicScope scope) {
    resolveSymbols(
        definitions.stream()
            .map(DefinitionStatement::getDefinedSymbol).collect(Collectors.toSet()),
        scope, List.of());
  }

  static List<SymbolLibrary> getModules(List<ModuleProvider> injectedModules,
      List<SymbolLibrary> inheritedModules, Path basePath) {
    List<SymbolLibrary> libs = new ArrayList<>();
    for (ModuleProvider provider : injectedModules) {
      SymbolLibrary provided = provider.installDependencies(
          Stream.concat(libs.stream(), inheritedModules.stream()).collect(Collectors.toList()),
          basePath);
      libs.add(0, provided);
    }
    return libs;
  }
}
