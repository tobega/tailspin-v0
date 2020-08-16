package tailspin.interpreter;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import tailspin.control.ResultIterator;

public class Program extends Module {
  private final List<TopLevelStatement> statements;
  private final List<TestStatement> tests;
  private final List<ModuleProvider> modules;

  public Program(
      List<TopLevelStatement> statements,
      List<DefinitionStatement> definitions,
      List<TestStatement> tests,
      List<IncludedFile> includedFiles,
      List<ModuleProvider> modules) {
    super(definitions, includedFiles);
    this.statements = statements;
    this.tests = tests;
    this.modules = modules;
  }

  public void run(Path basePath, SymbolLibrary coreSystemProvider) {
    BasicScope scope = new BasicScope(basePath);
    Set<String> requiredSymbols =
        statements.stream()
            .flatMap(t -> t.requiredDefinitions.stream())
            .collect(Collectors.toSet());
    resolveSymbols(requiredSymbols, scope, getModules(coreSystemProvider));
    statements.forEach(t -> t.statement.getResults(null, scope));
  }

  private List<SymbolLibrary> getModules(SymbolLibrary coreSystemProvider) {
    List<SymbolLibrary> libs = new ArrayList<>();
    libs.add(coreSystemProvider);
    for (ModuleProvider provider : modules) {
      SymbolLibrary provided = provider.installDependencies(List.copyOf(libs));
      libs.add(provided);
    }
    return libs;
  }

  public String runTests(Path basePath, SymbolLibrary coreSystemProvider) {
    StringBuilder result = new StringBuilder();
    tests.stream()
        .map(t -> executeTest(t, basePath, coreSystemProvider))
        .forEach(r -> ResultIterator.forEach(r, obj -> result.append(obj).append("\n")));
    return result.toString();
  }

  private Object executeTest(TestStatement testStatement, Path basePath, SymbolLibrary coreSystemProvider) {
    List<SymbolLibrary> testMocks = testStatement.test.getMocks(getModules(coreSystemProvider));
    BasicScope scope = new BasicScope(basePath);
    resolveSymbols(testStatement.requiredDefinitions, scope, testMocks);
    return testStatement.test.getResults(null, scope);
  }
}
