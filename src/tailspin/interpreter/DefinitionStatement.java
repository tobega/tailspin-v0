package tailspin.interpreter;

import tailspin.control.Expression;

import java.util.Set;

public class DefinitionStatement implements Statement {
    final Expression statement;
    private final Set<String> requiredDefinitions;

    DefinitionStatement(Expression statement, Set<String> requiredDefinitions) {
        this.statement = statement;
        this.requiredDefinitions = requiredDefinitions;
    }

    @Override
    public Set<String> getRequiredDefinitions() {
        return requiredDefinitions;
    }

    @Override
    public void getResults(BasicScope scope) {
        if (statement.getResults(null, scope) != null) {
            throw new AssertionError("Non-empty statement result");
        }
    }
}