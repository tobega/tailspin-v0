package tailspin.system;

import tailspin.types.Processor;
import tailspin.types.Transform;

import java.util.Map;
import java.util.Random;

public class SystemProcessor implements Processor {

  private final Random random = new Random();

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    return (it, params) -> switch (message) {
      case "nanoCount" -> System.nanoTime();
      case "randomInt" -> Math.abs(random.nextLong() % ((Number) it).longValue());
      case "property" -> System.getenv(it.toString());
      default -> throw new UnsupportedOperationException("Unknown SYS message " + message);
    };
  }
}
