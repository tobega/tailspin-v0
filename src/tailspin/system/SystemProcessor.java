package tailspin.system;

import tailspin.types.Processor;
import tailspin.types.Transform;

import java.util.Map;
import java.util.Random;

public class SystemProcessor implements Processor {

  private Random random = new Random();

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
