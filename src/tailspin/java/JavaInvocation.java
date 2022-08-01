package tailspin.java;

import java.lang.reflect.Array;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import tailspin.control.ResultIterator;
import tailspin.types.DataDictionary;
import tailspin.types.Processor;
import tailspin.types.TailspinArray;
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

  private static final Map<Class<?>, Function<Object, Object>> tsToJavaTypeConversions = new HashMap<>();

  static {
    tsToJavaTypeConversions.put(long.class, Function.identity());
    tsToJavaTypeConversions.put(Long.class, Function.identity());
    tsToJavaTypeConversions.put(int.class, (o) -> ((Number) o).intValue());
    tsToJavaTypeConversions.put(Integer.class, (o) -> ((Number) o).intValue());
    tsToJavaTypeConversions.put(short.class, (o) -> ((Number) o).shortValue());
    tsToJavaTypeConversions.put(Short.class, (o) -> ((Number) o).shortValue());
    tsToJavaTypeConversions.put(byte.class, (o) -> ((Number) o).byteValue());
    tsToJavaTypeConversions.put(Byte.class, (o) -> ((Number) o).byteValue());
    tsToJavaTypeConversions.put(double.class, (o) -> ((Number) o).doubleValue());
    tsToJavaTypeConversions.put(Double.class, (o) -> ((Number) o).doubleValue());
    tsToJavaTypeConversions.put(float.class, (o) -> ((Number) o).floatValue());
    tsToJavaTypeConversions.put(Float.class, (o) -> ((Number) o).floatValue());
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
  public Object getResults(Object it, Map<String, Object> unused,
      DataDictionary callingDictionary) {
    List<Object> params = it == null ? List.of() :
        ((it instanceof TailspinArray) ? toList((TailspinArray) it) : List.of(it));
    Executable[] methods = c.getMethods();
    Executable bestM = getBestExecutable(params, methods, message);
    if (bestM == null)
      throw new IllegalStateException(
          "Unknown method "
              + message
              + " on class "
              + c.getName()
              + " for parameters "
              + params.stream().map(Object::getClass).map(Class::getName).toList());
    Object[] invokeParams = getInvocationParameters(params, bestM);
    try {
      bestM.trySetAccessible();
      return JavaTypeConverter.tailspinTypeOf(((Method) bestM).invoke(o, invokeParams));
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
        if (p.isVarArgs() && (params.get(i) instanceof TailspinArray t)) {
          List<Object> list = toList(t);
          for (Object param : list) {
            penalty += getPenalty(param, p.getType().getComponentType());
          }
          continue;
        }
        penalty += getPenalty(params.get(i), p.getType());
      }
      if (penalty < leastPenalty) {
        leastPenalty = penalty;
        bestM = m;
      }
    }
    return bestM;
  }

  private static int getPenalty(Object param, Class<?> type) {
    if (param instanceof JavaObject j) {
      return calculatePenalty(j, type);
    }
    if (param instanceof Processor && Object.class.isAssignableFrom(type)) return 0; // Will proxy
    if ((param instanceof Number) && numberTypePenalties.containsKey(type)) {
      return numberTypePenalties.get(type);
    } else if (!type.isAssignableFrom(param.getClass())) {
      return  999;
    }
    return 0;
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
    Class<?> cls = obj.getRealObject().getClass();
    if (!type.isAssignableFrom(cls)) return 999;
    while(!Object.class.equals(cls) && type.isAssignableFrom(cls.getSuperclass())) {
      penalty++;
      cls = cls.getSuperclass();
    }
    return penalty;
  }

  static Object[] getInvocationParameters(List<Object> params, Executable bestM) {
    List<Object> invokeParams = new ArrayList<>();
    for (Parameter p : bestM.getParameters()) {
      Object param = params.get(invokeParams.size());
      if (p.isVarArgs() && (param instanceof TailspinArray list)) {
        param = Array.newInstance(p.getType().getComponentType(), list.length());
        for (int i = 0; i < list.length(); i++) {
          setArrayValue(param, i, toJavaType(p.getType().getComponentType(), list.getNative(i)));
        }
      } else {
        param = toJavaType(p.getType(), param);
      }
      invokeParams.add(param);
    }
    return invokeParams.toArray();
  }

  private static void setArrayValue(Object array, int index, Object value) {
    Class<?> componentType = array.getClass().getComponentType();
    if (componentType.equals(long.class)) {
      Array.setLong(array, index, ((Number) value).longValue());
    } else if (componentType.equals(int.class)) {
      Array.setInt(array, index, ((Number) value).intValue());
    } else if (componentType.equals(short.class)) {
      Array.setShort(array, index, ((Number) value).shortValue());
    } else if (componentType.equals(byte.class)) {
      Array.setByte(array, index, ((Number) value).byteValue());
    } else if (componentType.equals(float.class)) {
      Array.setFloat(array, index, ((Number) value).floatValue());
    } else if (componentType.equals(double.class)) {
      Array.setDouble(array, index, ((Number) value).doubleValue());
    } else if (componentType.equals(boolean.class)) {
      Array.setBoolean(array, index, (Boolean) value);
    } else {
      Array.set(array, index, value);
    }
  }

  private static Object toJavaType(Class<?> type, Object param) {
    if (param instanceof JavaObject j) {
      param = j.getRealObject();
    } else if (param instanceof TailspinArray a) {
      param = toList(a);
    } else if (param instanceof Processor p) {
      param = JavaProxy.of(type, p);
    } else if (tsToJavaTypeConversions.containsKey(type)) {
      param = tsToJavaTypeConversions.get(type).apply(param);
    }
    return param;
  }

  public static List<Object> toList(TailspinArray param) {
    List<Object> result = new ArrayList<>();
    ResultIterator.forEach(param.deconstruct(), result::add);
    return result;
  }
}
