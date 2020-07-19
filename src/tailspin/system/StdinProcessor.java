package tailspin.system;

import tailspin.control.ResultIterator;
import tailspin.types.Processor;
import tailspin.types.Transform;

import java.io.BufferedReader;
import java.util.Map;

import static tailspin.control.Expression.queueOf;

public class StdinProcessor implements Processor {
  private final BufferedReader input;

  public StdinProcessor(BufferedReader input) {
    this.input = input;
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    return (it, params) -> {
      if (message.equals("lines")) {
        return (ResultIterator) queueOf(input.lines())::poll;
      } else {
        throw new UnsupportedOperationException("Unknown IN message " + message);
      }
    };
  }
}
