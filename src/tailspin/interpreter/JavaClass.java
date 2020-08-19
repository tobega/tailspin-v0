package tailspin.interpreter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
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
    return new Invocation(message);
  }

  private class Invocation implements Transform {

    private final String message;

    public Invocation(String message) {

      this.message = message;
    }

    @Override
    public Object getResults(Object it, Map<String, Object> unused) {
      @SuppressWarnings("unchecked")
      List<Object> params = (List<Object>) it;
      for (Method m : c.getMethods()) {
        if (!m.getName().equals(message)) continue;
        if (m.getParameterCount() != params.size()) continue;
        List<Object> invokeParams = new ArrayList<>();
        for (Parameter p : m.getParameters()) {
          invokeParams.add(params.get(invokeParams.size()));
        }
        try {
          return m.invoke(null, invokeParams.toArray());
        } catch (IllegalAccessException| InvocationTargetException e) {
          throw new RuntimeException(e);
        }
      }
      throw new IllegalStateException("Unknown method " + message + " on class " + c.getCanonicalName() + " for parameters " + params);
    }
  }
}
