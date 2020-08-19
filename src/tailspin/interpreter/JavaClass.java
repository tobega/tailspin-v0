package tailspin.interpreter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import tailspin.types.Processor;
import tailspin.types.Transform;

public class JavaClass implements Processor, Transform {

  private final Class<?> c;

  public JavaClass(Class<?> c) {
    this.c = c;
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    return new JavaInvocation(c, null, message);
  }

  @Override
  public Object getResults(Object it, Map<String, Object> parameters) {
    @SuppressWarnings("unchecked")
    List<Object> params = (List<Object>) it;
    Executable[] methods = c.getConstructors();
    Executable bestM = JavaInvocation.getBestExecutable(params, methods, c.getName());
    if (bestM == null)
      throw new IllegalStateException(
          "No good constructor on class "
              + c.getName()
              + " for parameters "
              + params);
    Object[] invokeParams = JavaInvocation.getInvocationParameters(params, bestM);
    try {
      return new JavaObject(((Constructor<?>) bestM).newInstance(invokeParams));
    } catch (InstantiationException|IllegalAccessException e) {
      throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
      throw new RuntimeException(e.getCause());
    }
  }
}
