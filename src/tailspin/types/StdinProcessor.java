package tailspin.types;

import static tailspin.ast.Expression.queueOf;

import java.util.Map;
import java.util.Queue;
import tailspin.interpreter.BasicScope;

public class StdinProcessor extends ProcessorInstance {
  public StdinProcessor(BasicScope scope) {
    super(scope);
  }

  @Override
  public Queue<Object> receiveMessage(String message, Object it,
      Map<String, Object> parameters) {
    if (message.equals("lines")) {
      return queueOf(scope.getInput().lines());
    } else {
      throw new UnsupportedOperationException("Unknown IN message " + message);
    }
  }
}
