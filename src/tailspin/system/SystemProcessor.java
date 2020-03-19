package tailspin.system;

import java.util.Map;
import java.util.Random;
import tailspin.interpreter.BasicScope;
import tailspin.types.Transform;
import tailspin.types.ProcessorInstance;

public class SystemProcessor extends ProcessorInstance {

  private Random random = new Random();

  public SystemProcessor(BasicScope scope) {
    super(scope);
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    return (it, params) -> {
      if (message.equals("nanoCount")) {
        return System.nanoTime();
      } else if (message.equals("randomInt")) {
        return Math.abs(random.nextLong() % ((Number) it).longValue());
      } else {
        throw new UnsupportedOperationException("Unknown SYS message " + message);
      }
    };
  }
}
