package tailspin.interpreter;
import java.util.Set;
import tailspin.control.Expression;

public class TopLevelStatement {
    final Expression statement;
    final Set<String> requiredDefinitions;

    TopLevelStatement(Expression statement, Set<String> requiredDefinitions) {
        this.statement = statement;
        this.requiredDefinitions = requiredDefinitions;
    }
}