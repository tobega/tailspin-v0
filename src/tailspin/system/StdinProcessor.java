package tailspin.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import tailspin.control.ResultIterator;
import tailspin.types.Processor;
import tailspin.types.Transform;

public class StdinProcessor implements Processor {
  private final BufferedReader input;

  public StdinProcessor(BufferedReader input) {
    this.input = input;
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    return (it, params) -> {
      if (message.equals("lines")) {
        return (ResultIterator) () -> {
          try {
            return input.readLine();
          } catch (IOException e) {
            throw new RuntimeException(e);
          }
        };
      } else {
        throw new UnsupportedOperationException("Unknown IN message " + message);
      }
    };
  }
}
