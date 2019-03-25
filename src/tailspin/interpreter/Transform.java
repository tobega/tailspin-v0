package tailspin.interpreter;

import java.util.Queue;

public interface Transform {
  Queue<Object> run(TransformScope scope);
}
