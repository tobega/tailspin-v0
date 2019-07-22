package tailspin.interpreter;

import java.util.Map;
import java.util.Queue;

public interface Transform {
  Queue<Object> run(Object it, Map<String, Object> parameters);
}
