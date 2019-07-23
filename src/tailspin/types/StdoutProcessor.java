package tailspin.types;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Queue;
import tailspin.interpreter.Scope;

public class StdoutProcessor extends ProcessorInstance {
  public StdoutProcessor(Scope scope) {
    super(scope);
  }

  @Override
  public Queue<Object> receiveMessage(String message, Object it,
      Map<String, Object> parameters) {
    if (message.equals("write")) {
      try {
        scope.getOutput().write(it.toString().getBytes(StandardCharsets.UTF_8));
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    } else {
      throw new UnsupportedOperationException("Unknown OUT message " + message);
    }
    return null;
  }
}
