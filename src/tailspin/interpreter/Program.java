package tailspin.interpreter;

import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import tailspin.control.ResultIterator;

public class Program extends Module {
    private final List<TopLevelStatement> statements;
    private final List<TestStatement> tests;

    public Program(List<TopLevelStatement> statements,
        List<DefinitionStatement> definitions,
        List<TestStatement> tests, List<IncludedFile> includedFiles) {
        super(definitions, includedFiles);
        this.statements = statements;
        this.tests = tests;
    }

    public void run(Path basePath, SymbolLibrary coreSystemProvider) {
        BasicScope scope = new BasicScope(basePath);
        Set<String> requiredSymbols = statements.stream()
        .flatMap(t -> t.requiredDefinitions.stream())
        .collect(Collectors.toSet());
        resolveSymbols(requiredSymbols, scope, List.of(coreSystemProvider));
        statements.forEach(t -> t.statement.getResults(null, scope));
    }

    public String runTests(Path basePath, SymbolLibrary coreSystemProvider) {
        StringBuilder result = new StringBuilder();
        tests.stream().map(t -> t.executeTest(this, basePath, coreSystemProvider))
            .forEach(r -> ResultIterator.forEach(r, obj -> result.append(obj).append("\n")));
        return result.toString();
    }
}