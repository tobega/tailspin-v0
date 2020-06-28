package tailspin.interpreter;

import java.util.List;
import java.util.stream.Collectors;

import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.testing.Test;

public class Program {
    private List<Expression> statements;

    public Program(List<Expression> statements) {
        this.statements = statements;
    }

	public void run(BasicScope scope) {
        statements.forEach(s -> {
            if (s instanceof Test) {
                return;
            }
            s.getResults(null, scope);
        });
	}
    
    public String runTests(BasicScope scope) {
        return statements.stream().map(s -> s.getResults(null, scope))
        .flatMap(ri -> ResultIterator.toQueue(ResultIterator.flat(ri)).stream())
              .map(Object::toString).collect(Collectors.joining("\n"));
    }
}