package tailspin.interpreter;

import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import tailspin.control.DataDefinition;
import tailspin.control.Definition;

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
    public Set<String> resolveSymbols(Set<String> providedSymbols, BasicScope scope) {
      // We might be shadowing a module, so don't try to register what we don't define.
      Set<String> internalSymbols = new HashSet<>();
      for (DefinitionStatement ds : definitions) {
        if (ds.statement instanceof Definition d && providedSymbols.contains(d.getIdentifier())) {
          internalSymbols.add(d.getIdentifier());
        }
      }
      if (internalSymbols.isEmpty()) return providedSymbols;
      Module.this.resolveSymbols(internalSymbols, depScope, providedDependencies);
      providedSymbols.stream()
          .filter(depScope::hasDefinition)
          .forEach(s -> scope.defineValue(prefix + s, depScope.resolveValue(s)));
      return providedSymbols.stream()
          .filter(s -> !depScope.hasDefinition(s))
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
    Set<String> transientDefinitions = resolveSymbolDependencies(internalSymbols, scope, providedDependencies);
    getDefinitions().stream()
        .filter(d -> (d.statement instanceof DataDefinition) || transientDefinitions.contains(((Definition) d.statement).getIdentifier()))
        .forEach(d -> d.statement.getResults(null, scope));
  }

  public void installAll(BasicScope scope) {
    resolveSymbols(
        definitions.stream()
            .filter(d -> (d.statement instanceof Definition))
            .map(d -> ((Definition) d.statement).getIdentifier()).collect(Collectors.toSet()),
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
