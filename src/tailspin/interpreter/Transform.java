package tailspin.interpreter;

import java.util.Map;
import java.util.Queue;

public interface Transform {
  Queue<Object> run(TransformScope scope, Map<String, Object> parameters);
}
