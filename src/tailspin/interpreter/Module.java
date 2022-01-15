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

  public void resolveAll(BasicScope scope, List<SymbolLibrary> providedDependencies) {
    resolveSymbols(
        definitions.stream()
            .filter(d -> (d.statement instanceof Definition))
            .map(d -> ((Definition) d.statement).getIdentifier()).collect(Collectors.toSet()),
        scope, providedDependencies);
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
