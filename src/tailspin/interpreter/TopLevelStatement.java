package tailspin.interpreter;
import java.util.Set;
import tailspin.control.Expression;

public class TopLevelStatement implements Statement {
    final Expression statement;
    final Set<String> requiredDefinitions;

    TopLevelStatement(Expression statement, Set<String> requiredDefinitions) {
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