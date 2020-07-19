package tailspin.interpreter;

import java.util.Set;

public class TestStatement {
    final Test test;
    final Set<String> requiredDefinitions;

    TestStatement(Test test, Set<String> requiredDefinitions) {
        this.test = test;
        this.requiredDefinitions = requiredDefinitions;
    }

    public Set<String> installOverrides(Scope scope) {
        return test.installOverrides(requiredDefinitions, scope);
    }
}