package tailspin.interpreter;

import java.util.Set;
import tailspin.control.DataDefinition;
import tailspin.control.Definition;

public class DefinitionStatement implements Statement {
    private final DefinitionExpression definition;
    private final Set<String> requiredDefinitions;

    DefinitionStatement(DefinitionExpression definition, Set<String> requiredDefinitions) {
        this.definition = definition;
        this.requiredDefinitions = requiredDefinitions;
    }

    @Override
    public Set<String> getRequiredDefinitions() {
        return requiredDefinitions;
    }

    @Override
    public void getResults(BasicScope scope) {
        if (definition.getResults(null, scope) != null) {
            throw new AssertionError("Non-empty statement result");
        }
    }

    public String getDefinedSymbol() {
        if (definition instanceof Definition d) {
            return d.getIdentifier();
        }
        return null;
    }

    public DefinitionStatement renamed(String newName) {
        if (definition instanceof Definition d) {
            return new DefinitionStatement(d.renamed(newName), requiredDefinitions);
        }
        throw new UnsupportedOperationException();
    }

    public boolean alwaysRun() {
        return definition instanceof DataDefinition;
    }
}