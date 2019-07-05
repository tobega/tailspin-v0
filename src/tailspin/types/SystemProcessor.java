package tailspin.types;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import tailspin.interpreter.BasicScope;

public class SystemProcessor extends ProcessorInstance {

  public SystemProcessor(BasicScope scope) {
    super(scope);
  }

  @Override
  public Queue<Object> receiveMessage(String message, Queue<Object> it,
      Map<String, Object> parameters) {
    Queue<Object> result = new ArrayDeque<>();
    if (message.equals("nanoCount")) {
      // TODO: make long the number used
      result.add((int) (System.nanoTime() & (0x8fffffff)));
    }
    return result;
  }
}
