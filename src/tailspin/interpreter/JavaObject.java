package tailspin.interpreter;

import java.util.Map;
import tailspin.types.Processor;
import tailspin.types.Transform;

public class JavaObject implements Processor {

  private final Object o;

  public JavaObject(Object o) {
    this.o = o;
  }

  public Object getRealObject() {
    return o;
  }

  @Override
  public String toString() {
    return o.toString();
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    return new JavaInvocation(o.getClass(), o, message);
  }
}
