package tailspin.interpreter;

import java.nio.file.Path;
import java.util.List;
import java.util.Set;

public class TestStatement {
    final Test test;
    final Set<String> requiredDefinitions;

    TestStatement(Test test, Set<String> requiredDefinitions) {
        this.test = test;
        this.requiredDefinitions = requiredDefinitions;
    }

    public Object executeTest(Program program, Path basePath, SymbolLibrary coreSystemProvider) {
        List<SymbolLibrary> testMocks = test.getMocks(List.of(coreSystemProvider));
        BasicScope scope = new BasicScope(basePath);
        program.installInternal(scope, testMocks, requiredDefinitions);
        return test.getResults(null, scope);
    }
}