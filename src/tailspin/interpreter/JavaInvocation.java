package tailspin.interpreter;

import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import tailspin.types.Processor;
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

  private static final Map<Class<?>, Function<Object, Object>> resultTypeConversions = new HashMap<>();

  static {
    resultTypeConversions.put(long.class, Function.identity());
    resultTypeConversions.put(Long.class, Function.identity());
    resultTypeConversions.put(int.class, (o) -> ((Number) o).longValue());
    resultTypeConversions.put(Integer.class, (o) -> ((Number) o).longValue());
    resultTypeConversions.put(short.class, (o) -> ((Number) o).longValue());
    resultTypeConversions.put(Short.class, (o) -> ((Number) o).longValue());
    resultTypeConversions.put(byte.class, (o) -> ((Number) o).longValue());
    resultTypeConversions.put(Byte.class, (o) -> ((Number) o).longValue());
    resultTypeConversions.put(double.class, JavaObject::new);
    resultTypeConversions.put(Double.class, JavaObject::new);
    resultTypeConversions.put(float.class, JavaObject::new);
    resultTypeConversions.put(Float.class, JavaObject::new);
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
    List<Object> params = it == null ? List.of() : (List<Object>) it;
    Executable[] methods = c.getMethods();
    Executable bestM = getBestExecutable(params, methods, message);
    if (bestM == null)
      throw new IllegalStateException(
          "Unknown method "
              + message
              + " on class "
              + c.getName()
              + " for parameters "
              + params);
    Object[] invokeParams = getInvocationParameters(params, bestM);
    try {
      return tailspinTypeOf(((Method) bestM).invoke(o, invokeParams));
    } catch (IllegalAccessException | InvocationTargetException e) {
      throw new RuntimeException(e.getCause());
    }
  }

  static Executable getBestExecutable(List<Object> params, Executable[] methods, String message) {
    Executable bestM = null;
    int leastPenalty = 999;
    for (Executable m : methods) {
      if (!m.getName().equals(message)) {
        continue;
      }
      if (m.getParameterCount() != params.size()) {
        continue;
      }
      int penalty = 0;
      Parameter[] methodParameters = m.getParameters();
      for (int i = 0; i < methodParameters.length; i++) {
        Parameter p = methodParameters[i];
        if (params.get(i) instanceof JavaObject) {
          penalty += calculatePenalty((JavaObject) params.get(i), p.getType());
          continue;
        }
        if (!numberTypePenalties.containsKey(p.getType())) continue;
        penalty += numberTypePenalties.get(p.getType());
      }
      if (penalty < leastPenalty) {
        leastPenalty = penalty;
        bestM = m;
      }
    }
    return bestM;
  }

  static Object[] getInvocationParameters(List<Object> params, Executable bestM) {
    List<Object> invokeParams = new ArrayList<>();
    for (Parameter p : bestM.getParameters()) {
      Object param = params.get(invokeParams.size());
      if (param instanceof JavaObject) {
        param = ((JavaObject) param).getRealObject();
      } else if (param instanceof Processor) {
        param = JavaProxy.of(p.getType(), (Processor) param);
      } else if (numberTypeConversions.containsKey(p.getType())) {
        param = numberTypeConversions.get(p.getType()).apply(param);
      }
      invokeParams.add(param);
    }
    return invokeParams.toArray();
  }

  private static int calculatePenalty(JavaObject obj, Class<?> type) {
    if (type.equals(float.class)) {
      if (obj.getRealObject().getClass().equals(Float.class)) return 0;
      if (obj.getRealObject().getClass().equals(Double.class)) return 2;
      if (Number.class.isAssignableFrom(obj.getRealObject().getClass())) return 1;
      return 999;
    }
    if (type.equals(double.class)) {
      if (obj.getRealObject().getClass().equals(Double.class)) return 0;
      if (Number.class.isAssignableFrom(obj.getRealObject().getClass())) return 1;
      return 999;
    }
    int penalty = 0;
    Class<?> cls = obj.getClass();
    if (!type.isAssignableFrom(cls)) return 999;
    while(!Object.class.equals(cls) && type.isAssignableFrom(cls.getSuperclass())) {
      penalty++;
      cls = cls.getSuperclass();
    }
    return penalty;
  }

  private Object tailspinTypeOf(Object result) {
    if (result == null) return null;
    if (resultTypeConversions.containsKey(result.getClass())) {
      return resultTypeConversions.get(result.getClass()).apply(result);
    }
    return result;
  }
}
