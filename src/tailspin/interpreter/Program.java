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
import tailspin.control.ResultIterator;
import tailspin.interpreter.lang.Lang;

public class Program {
  private final List<Statement> statements;
  private final List<TestStatement> tests;
  private final List<IncludedFile> includedFiles;
  private final List<ModuleProvider> injectedModules;

  public Program(
      List<Statement> statements,
      List<TestStatement> tests,
      List<IncludedFile> includedFiles,
      List<ModuleProvider> injectedModules) {
    this.statements = statements;
    this.tests = tests;
    this.includedFiles = includedFiles;
    this.injectedModules = Stream.concat(Stream.of(new ModuleInheritance("", "")),
        injectedModules.stream()).collect(Collectors.toList());
  }

  public void run(Path basePath, SymbolLibrary coreSystemProvider) {
    BasicScope scope = new BasicScope(basePath);
    resolveRequiredSymbols(scope, Module.getModules(injectedModules, List.of(coreSystemProvider), scope));
    statements.forEach(t -> t.getResults(scope));
  }

  private void resolveRequiredSymbols(BasicScope scope, List<SymbolLibrary> providedDependencies) {
    Set<String> requiredSymbols =
        statements.stream()
            .flatMap(t -> t.getRequiredDefinitions().stream())
            .collect(Collectors.toSet());
    Map<String, Set<String>> definedSymbols = getDefinitions().stream()
        .filter(d -> (d.statement instanceof Definition))
        .collect(Collectors
            .toMap(d -> ((Definition) d.statement).getIdentifier(), d -> d.requiredDefinitions));
    Queue<String> neededDefinitions = new ArrayDeque<>(requiredSymbols);
    getDefinitions().stream()
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
  }

  public Module asModule() {
    return new Module(getDefinitions(), includedFiles);
  }

  private List<DefinitionStatement> getDefinitions() {
    return statements.stream().filter(DefinitionStatement.class::isInstance).map(DefinitionStatement.class::cast)
        .collect(Collectors.toList());
  }

  public String runTests(Path basePath, SymbolLibrary coreSystemProvider) {
    StringBuilder result = new StringBuilder();
    tests.stream()
        .map(t -> executeTest(t, basePath, coreSystemProvider))
        .forEach(r -> ResultIterator.forEach(r, obj -> result.append(obj).append("\n")));
    return result.toString();
  }

  private Object executeTest(TestStatement testStatement, Path basePath, SymbolLibrary coreSystemProvider) {
    BasicScope scope = new BasicScope(basePath);
    List<SymbolLibrary> testModules = getMocksAndModules(testStatement.test.getInjectedModules(), coreSystemProvider, scope);
    new Module(testStatement.test.overrideDefinitions(getDefinitions()), includedFiles)
      .resolveSymbols(testStatement.requiredDefinitions, scope, testModules);
    return testStatement.test.getResults(null, scope);
  }

  public List<SymbolLibrary> getMocksAndModules(List<ModuleProvider> providedLibraries,
      SymbolLibrary coreSystemProvider, BasicScope scope) {
    List<SymbolLibrary> mocks = new ArrayList<>();
    mocks.add(coreSystemProvider);
    for (ModuleProvider provider : providedLibraries) {
      SymbolLibrary provided = provider.installDependencies(Module.getModules(injectedModules, mocks, scope), scope);
      mocks.add(0, provided);
    }
    mocks.addAll(Module.getModules(injectedModules, mocks, scope));
    return mocks;
  }
}
