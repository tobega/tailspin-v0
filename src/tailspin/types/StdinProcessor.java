package tailspin.types;

import static tailspin.ast.Expression.queueOf;

import java.util.Map;
import tailspin.ast.ResultIterator;
import tailspin.interpreter.BasicScope;
import tailspin.interpreter.Transform;

public class StdinProcessor extends ProcessorInstance {
  public StdinProcessor(BasicScope scope) {
    super(scope);
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    return (it, params) -> {
      if (message.equals("lines")) {
        return (ResultIterator) queueOf(scope.getInput().lines())::poll;
      } else {
        throw new UnsupportedOperationException("Unknown IN message " + message);
      }
    };
  }
}
