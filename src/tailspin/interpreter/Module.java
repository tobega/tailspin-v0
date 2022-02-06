package tailspin.interpreter;

import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import tailspin.control.DataDefinition;
import tailspin.control.Definition;
import tailspin.interpreter.lang.Lang;

public class Module {
  protected final List<DefinitionStatement> definitions;
  protected final List<IncludedFile> includedFiles;

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
    this.definitions = definitions;
    this.includedFiles = includedFiles;
  }

  void resolveSymbols(Set<String> internalSymbols, BasicScope scope,
      List<SymbolLibrary> providedDependencies) {
    Map<String, Set<String>> definedSymbols = definitions.stream()
        .filter(d -> (d.statement instanceof Definition))
        .collect(Collectors
            .toMap(d -> ((Definition) d.statement).getIdentifier(), d -> d.requiredDefinitions));
    Queue<String> neededDefinitions = new ArrayDeque<>(internalSymbols);
    definitions.stream()
        .filter(d -> (d.statement instanceof DataDefinition))
        .forEach(d -> neededDefinitions.addAll(d.requiredDefinitions));
    Set<String> transientDefinitions = new HashSet<>();
    Set<String> externalDefinitions = new HashSet<>();
    while (!neededDefinitions.isEmpty()) {
      String def = neededDefinitions.poll();
      if (scope.hasDefinition(def)) {
        continue;
      }
      if (!definedSymbols.containsKey(def)) {
        externalDefinitions.add(def);
        continue;
      }
      if (transientDefinitions.add(def)) {
        neededDefinitions.addAll(definedSymbols.get(def));
      }
    }
    for (IncludedFile dependency : includedFiles) {
      externalDefinitions = dependency.installSymbols(externalDefinitions, scope, providedDependencies);
    }
    for (SymbolLibrary lib : providedDependencies) {
      externalDefinitions = lib.installSymbols(externalDefinitions, scope);
    }
    if (!externalDefinitions.isEmpty())
      Lang.installBuiltins(externalDefinitions, scope);
    definitions.stream()
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
