package tailspin.interpreter;

import java.util.Map;
import tailspin.types.Processor;
import tailspin.types.Transform;

public class JavaClass implements Processor {

  private final Class<?> c;

  public JavaClass(Class<?> c) {
    this.c = c;
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    return new JavaInvocation(c, null, message);
  }

}
