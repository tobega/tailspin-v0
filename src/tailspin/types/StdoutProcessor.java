package tailspin.types;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.interpreter.Transform;

public class StdoutProcessor extends ProcessorInstance {
  public StdoutProcessor(Scope scope) {
    super(scope);
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    return (it, params) -> {
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
    };
  }
}
