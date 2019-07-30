package tailspin.types;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import tailspin.interpreter.BasicScope;
import tailspin.interpreter.Transform;

public class SystemProcessor extends ProcessorInstance {

  public SystemProcessor(BasicScope scope) {
    super(scope);
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    return (it, params) -> {
      Queue<Object> result = new ArrayDeque<>();
      if (message.equals("nanoCount")) {
        // TODO: make long the number used
        result.add((int) (System.nanoTime() & (0x8fffffff)));
      } else {
        throw new UnsupportedOperationException("Unknown SYS message " + message);
      }
      return result;
    };
  }
}
