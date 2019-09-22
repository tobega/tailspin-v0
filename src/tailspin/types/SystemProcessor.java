package tailspin.types;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import tailspin.interpreter.BasicScope;
import tailspin.interpreter.Transform;

public class SystemProcessor extends ProcessorInstance {

  private Random random = new Random();

  public SystemProcessor(BasicScope scope) {
    super(scope);
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    return (it, params) -> {
      Queue<Object> result = new ArrayDeque<>();
      if (message.equals("nanoCount")) {
        result.add(System.nanoTime());
      } else if (message.equals("randomInt")) {
        result.add(Math.abs(random.nextLong() % ((Number) it).longValue()));
      } else {
        throw new UnsupportedOperationException("Unknown SYS message " + message);
      }
      return result;
    };
  }
}
