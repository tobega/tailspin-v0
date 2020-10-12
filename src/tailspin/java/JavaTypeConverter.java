package tailspin.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaTypeConverter {

  static final Map<Class<?>, Function<Object, Object>> javaToTsTypeConversions = new HashMap<>();

  private JavaTypeConverter() {}

  public static Object tailspinTypeOf(Object result) {
    if (result == null) return null;
    if (javaToTsTypeConversions.containsKey(result.getClass())) {
      return javaToTsTypeConversions.get(result.getClass()).apply(result);
    }
    if (List.class.isAssignableFrom(result.getClass())) {
      @SuppressWarnings("unchecked")
      List<Object> list = (List<Object>) result;
      return list.stream().map(JavaTypeConverter::tailspinTypeOf).collect(
          Collectors.toList());
    }
    return new JavaObject(result);
  }
}
