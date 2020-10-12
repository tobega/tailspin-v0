package tailspin.control;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tailspin.java.JavaObject;
import tailspin.java.JavaTypeConverter;
import tailspin.types.KeyValue;
import tailspin.interpreter.Scope;

public class Deconstructor implements Expression {
  public static final Deconstructor INSTANCE = new Deconstructor();

  private static final char ZERO_WIDTH_JOINER = 8205;

  private Deconstructor() {}

  @Override
  public ResultIterator getResults(Object it, Scope blockScope) {
    return getDeconstructedStream(it);
  }

  @SuppressWarnings("unchecked")
  ResultIterator getDeconstructedStream(Object it) {
    if (it instanceof List) {
      if (((List<?>) it).isEmpty()) {
        return null;
      }
      Iterator<Object> iterator = ((List<Object>) it).iterator();
      return () -> {
        if (!iterator.hasNext()) return null;
        return iterator.next();
      };
    } else if (it instanceof String) {
      if (((String) it).isEmpty()) {
        return null;
      }
      ArrayDeque<String> deconstructed = new ArrayDeque<>();
      String pending = null;
      for (char c : ((String) it).toCharArray()) {
        if (pending != null) {
          deconstructed.add(pending + c);
          pending = null;
          continue;
        }
        if (c == ZERO_WIDTH_JOINER) {
          pending = deconstructed.removeLast() + c;
          continue;
        }
        int type = Character.getType(c);
        if (Character.isLowSurrogate(c)
            || type == Character.COMBINING_SPACING_MARK
            || type == Character.ENCLOSING_MARK
            || type == Character.NON_SPACING_MARK) {
          deconstructed.add(deconstructed.removeLast() + c);
        } else {
          deconstructed.add(String.valueOf(c));
        }
      }
      return deconstructed::poll;
    } else if (it instanceof Map) {
      @SuppressWarnings("unchecked")
      Map<String, Object> map = (Map<String, Object>) it;
      if (map.isEmpty()) {
        return null;
      }
      Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
      return () -> {
        if (!iterator.hasNext()) {
          return null;
        }
        Map.Entry<String, Object> e = iterator.next();
        return new KeyValue(e.getKey(), e.getValue());
      };
    } else if (it instanceof JavaObject) {
      Object realObject = ((JavaObject) it).getRealObject();
      if (realObject instanceof Iterable) {
        Iterator<Object> iterator = ((Iterable<Object>) realObject).iterator();
        return () -> {
          if (!iterator.hasNext()) return null;
          return JavaTypeConverter.tailspinTypeOf(iterator.next());
        };
      } else {
        throw new UnsupportedOperationException("Cannot deconstruct java object " + realObject.getClass());
      }
    } else {
      throw new UnsupportedOperationException("Cannot deconstruct " + it.getClass());
    }
  }
}
