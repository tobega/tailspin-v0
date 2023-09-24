package tailspin.interpreter;

import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import tailspin.control.ResultIterator;

public class Program extends SymbolResolver {
  private final List<Statement> statements;
  private final List<TestStatement> tests;
  private final List<ModuleProvider> injectedModules;

  public Program(
      List<Statement> statements,
      List<TestStatement> tests,
      List<IncludedFile> includedFiles,
      List<ModuleProvider> injectedModules) {
    super(includedFiles);
    this.statements = statements;
    this.tests = tests;
    this.injectedModules = Stream.concat(Stream.of(new ModuleInheritance("", "")),
        injectedModules.stream()).collect(Collectors.toList());
  }

  public void run(Path basePath, SymbolLibrary coreSystemProvider) {
    List<SymbolLibrary> resolvedModules = Module.getModules(injectedModules, List.of(coreSystemProvider),
        basePath);
    BasicScope scope = new BasicScope(basePath);
    resolveRequiredSymbols(scope, resolvedModules);
    statements.forEach(t -> t.getResults(scope));
  }

  private void resolveRequiredSymbols(BasicScope scope, List<SymbolLibrary> providedDependencies) {
    Set<String> requiredSymbols =
        statements.stream()
            .flatMap(t -> t.getRequiredDefinitions().stream())
            .collect(Collectors.toSet());
    resolveSymbolDependencies(requiredSymbols, scope, providedDependencies, new HashMap<>());
  }

  public Module asModule() {
    return new Module(getDefinitions(), getIncludedFiles());
  }

  @Override
  public List<DefinitionStatement> getDefinitions() {
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
    List<SymbolLibrary> testModules = getMocksAndModules(testStatement.test.getInjectedModules(), coreSystemProvider, basePath);
    Module module = new Module(testStatement.test.overrideDefinitions(getDefinitions()), getIncludedFiles());
    module.resolveSymbols(testStatement.requiredDefinitions, scope, testModules, new HashMap<>());
    return testStatement.test.getResults(null, scope);
  }

  public List<SymbolLibrary> getMocksAndModules(List<ModuleProvider> testLibs,
      SymbolLibrary coreSystemProvider, Path basePath) {
    List<SymbolLibrary> programLibs = Module.getModules(injectedModules, List.of(coreSystemProvider), basePath);
    List<SymbolLibrary> mocks = new ArrayList<>(programLibs);
    for (ModuleProvider provider : testLibs) {
      SymbolLibrary provided = provider.installDependencies(mocks, basePath);
      provided.setShared();
      mocks.add(0, provided);
    }
    for (SymbolLibrary lib : programLibs) {
      lib.injectMocks(mocks.subList(0, testLibs.size()));
    }
    return mocks;
  }
}
