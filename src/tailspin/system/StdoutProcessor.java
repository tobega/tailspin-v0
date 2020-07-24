package tailspin.system;

import tailspin.types.Processor;
import tailspin.types.Transform;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class StdoutProcessor implements Processor {
  private final OutputStream output;

  public StdoutProcessor(OutputStream output) {
    this.output = output;
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    return (it, params) -> {
      if (message.equals("write")) {
        try {
          output.write(it.toString().getBytes(StandardCharsets.UTF_8));
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
