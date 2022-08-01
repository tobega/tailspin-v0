package tailspin.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import tailspin.types.TailspinArray;

public class JavaTypeConverter {

  static final Map<Class<?>, Function<Object, Object>> javaToTsTypeConversions = new HashMap<>();

  static {
    javaToTsTypeConversions.put(long.class, Function.identity());
    javaToTsTypeConversions.put(Long.class, Function.identity());
    javaToTsTypeConversions.put(int.class, (o) -> ((Number) o).longValue());
    javaToTsTypeConversions.put(Integer.class, (o) -> ((Number) o).longValue());
    javaToTsTypeConversions.put(short.class, (o) -> ((Number) o).longValue());
    javaToTsTypeConversions.put(Short.class, (o) -> ((Number) o).longValue());
    javaToTsTypeConversions.put(byte.class, (o) -> ((Number) o).longValue());
    javaToTsTypeConversions.put(Byte.class, (o) -> ((Number) o).longValue());
    javaToTsTypeConversions.put(double.class, JavaObject::new);
    javaToTsTypeConversions.put(Double.class, JavaObject::new);
    javaToTsTypeConversions.put(float.class, JavaObject::new);
    javaToTsTypeConversions.put(Float.class, JavaObject::new);
    javaToTsTypeConversions.put(String.class, Function.identity());
    javaToTsTypeConversions.put(byte[].class, Function.identity());
  }

  private JavaTypeConverter() {}

  public static Object tailspinTypeOf(Object result) {
    if (result == null) return null;
    if (javaToTsTypeConversions.containsKey(result.getClass())) {
      return javaToTsTypeConversions.get(result.getClass()).apply(result);
    }
    if (List.class.isAssignableFrom(result.getClass())) {
      @SuppressWarnings("unchecked")
      List<Object> list = (List<Object>) result;
      return TailspinArray.value(list.stream().map(JavaTypeConverter::tailspinTypeOf).collect(
          Collectors.toList()), 1L);
    }
    return new JavaObject(result);
  }
}
