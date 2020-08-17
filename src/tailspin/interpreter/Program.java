package tailspin.interpreter;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import tailspin.control.ResultIterator;

public class Program extends Module {
  private final List<TopLevelStatement> statements;
  private final List<TestStatement> tests;
  protected final List<ModuleProvider> injectedModules;

  public Program(
      List<TopLevelStatement> statements,
      List<DefinitionStatement> definitions,
      List<TestStatement> tests,
      List<IncludedFile> includedFiles,
      List<ModuleProvider> injectedModules) {
    super(definitions, includedFiles);
    this.statements = statements;
    this.tests = tests;
    this.injectedModules = Stream.concat(Stream.of(new ModuleInheritance("")),
        injectedModules.stream()).collect(Collectors.toList());
  }

  public void run(Path basePath, SymbolLibrary coreSystemProvider) {
    BasicScope scope = new BasicScope(basePath);
    Set<String> requiredSymbols =
        statements.stream()
            .flatMap(t -> t.requiredDefinitions.stream())
            .collect(Collectors.toSet());
    resolveSymbols(requiredSymbols, scope, getModules(injectedModules, List.of(coreSystemProvider), scope));
    statements.forEach(t -> t.statement.getResults(null, scope));
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
    resolveSymbols(testStatement.requiredDefinitions, scope, testModules);
    return testStatement.test.getResults(null, scope);
  }

  public List<SymbolLibrary> getMocksAndModules(List<ModuleProvider> providedLibraries,
      SymbolLibrary coreSystemProvider, BasicScope scope) {
    List<SymbolLibrary> mocks = new ArrayList<>();
    mocks.add(coreSystemProvider);
    for (ModuleProvider provider : providedLibraries) {
      SymbolLibrary provided = provider.installDependencies(getModules(injectedModules, mocks, scope), scope);
      mocks.add(0, provided);
    }
    mocks.addAll(getModules(injectedModules, mocks, scope));
    return mocks;
  }
}
