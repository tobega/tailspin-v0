package tailspin.system;

import static tailspin.control.Expression.queueOf;

import java.util.Map;
import tailspin.control.ResultIterator;
import tailspin.interpreter.BasicScope;
import tailspin.types.Transform;
import tailspin.types.ProcessorInstance;

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
