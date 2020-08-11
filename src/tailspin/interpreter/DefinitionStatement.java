package tailspin.interpreter;
import java.util.Set;
import tailspin.control.Definition;

public class DefinitionStatement {
    final Definition statement;
    final Set<String> requiredDefinitions;

    DefinitionStatement(Definition statement, Set<String> requiredDefinitions) {
        this.statement = statement;
        this.requiredDefinitions = requiredDefinitions;
    }
}