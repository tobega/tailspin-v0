package tailspin.interpreter;
import java.util.Set;
import tailspin.control.Expression;

public class DefinitionStatement {
    final Expression statement;
    final Set<String> requiredDefinitions;

    DefinitionStatement(Expression statement, Set<String> requiredDefinitions) {
        this.statement = statement;
        this.requiredDefinitions = requiredDefinitions;
    }
}