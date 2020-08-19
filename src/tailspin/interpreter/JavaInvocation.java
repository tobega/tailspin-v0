package tailspin.interpreter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import tailspin.types.Transform;

class JavaInvocation implements Transform {
  private static final Map<Class<?>, Integer> numberTypePenalties = new HashMap<>();

  static {
    numberTypePenalties.put(long.class, 0);
    numberTypePenalties.put(Long.class, 0);
    numberTypePenalties.put(int.class, 3);
    numberTypePenalties.put(Integer.class, 3);
    numberTypePenalties.put(short.class, 4);
    numberTypePenalties.put(Short.class, 4);
    numberTypePenalties.put(byte.class, 5);
    numberTypePenalties.put(Byte.class, 5);
    numberTypePenalties.put(double.class, 1);
    numberTypePenalties.put(Double.class, 1);
    numberTypePenalties.put(float.class, 2);
    numberTypePenalties.put(Float.class, 2);
  }

  private static final Map<Class<?>, Function<Object, Object>> numberTypeConversions = new HashMap<>();

  static {
    numberTypeConversions.put(long.class, Function.identity());
    numberTypeConversions.put(Long.class, Function.identity());
    numberTypeConversions.put(int.class, (o) -> ((Number) o).intValue());
    numberTypeConversions.put(Integer.class, (o) -> ((Number) o).intValue());
    numberTypeConversions.put(short.class, (o) -> ((Number) o).shortValue());
    numberTypeConversions.put(Short.class, (o) -> ((Number) o).shortValue());
    numberTypeConversions.put(byte.class, (o) -> ((Number) o).byteValue());
    numberTypeConversions.put(Byte.class, (o) -> ((Number) o).byteValue());
    numberTypeConversions.put(double.class, (o) -> ((Number) o).doubleValue());
    numberTypeConversions.put(Double.class, (o) -> ((Number) o).doubleValue());
    numberTypeConversions.put(float.class, (o) -> ((Number) o).floatValue());
    numberTypeConversions.put(Float.class, (o) -> ((Number) o).floatValue());
  }

  private final Class<?> c;
  private final Object o;
  private final String message;

  public JavaInvocation(Class<?> c, Object o, String message) {
    this.c = c;
    this.o = o;
    this.message = message;
  }

  @Override
  public Object getResults(Object it, Map<String, Object> unused) {
    @SuppressWarnings("unchecked")
    List<Object> params = (List<Object>) it;
    Method bestM = null;
    int leastPenalty = 1000;
    for (Method m : c.getMethods()) {
      if (!m.getName().equals(message)) {
        continue;
      }
      if (m.getParameterCount() != params.size()) {
        continue;
      }
      int penalty = 0;
      for (Parameter p : m.getParameters()) {
        if (!numberTypePenalties.containsKey(p.getType())) continue;
        penalty += numberTypePenalties.get(p.getType());
      }
      if (penalty < leastPenalty) {
        leastPenalty = penalty;
        bestM = m;
      }
    }
    if (bestM == null)
      throw new IllegalStateException(
          "Unknown method "
              + message
              + " on class "
              + c.getCanonicalName()
              + " for parameters "
              + params);
    List<Object> invokeParams = new ArrayList<>();
    for (Parameter p : bestM.getParameters()) {
      Object param = params.get(invokeParams.size());
      if (numberTypeConversions.containsKey(p.getType())) {
        param = numberTypeConversions.get(p.getType()).apply(param);
      }
      invokeParams.add(param);
    }
    try {
      return bestM.invoke(o, invokeParams.toArray());
    } catch (IllegalAccessException | InvocationTargetException e) {
      throw new RuntimeException(e.getCause());
    }
  }
}
