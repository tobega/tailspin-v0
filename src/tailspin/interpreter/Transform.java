package tailspin.interpreter;

import java.util.Map;
import java.util.Queue;

public interface Transform {
  Queue<Object> run(Queue<Object> it, Map<String, Object> parameters);
}
