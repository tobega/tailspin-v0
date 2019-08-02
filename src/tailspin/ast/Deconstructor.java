package tailspin.ast;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import tailspin.interpreter.KeyValue;
import tailspin.interpreter.Scope;

public class Deconstructor implements Expression {
  public static final Deconstructor INSTANCE = new Deconstructor();

  private Deconstructor() {}

  @Override
  public Queue<Object> run(Object it, Scope blockScope) {
    return getDeconstructedStream(it).collect(Collectors.toCollection(ArrayDeque::new));
  }

  Stream<?> getDeconstructedStream(Object it) {
    if (it instanceof List) {
      return ((List<?>) it).stream();
    } else if (it instanceof String) {
      ArrayDeque<String> deconstructed = new ArrayDeque<>();
      for (char c : ((String) it).toCharArray()) {
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
      return deconstructed.stream();
    } else if (it instanceof Map) {
      @SuppressWarnings("unchecked")
      Map<String, ?> map = (Map<String, ?>) it;
      return map.entrySet().stream().map(e -> new KeyValue(e.getKey(), e.getValue()));
    } else {
      throw new UnsupportedOperationException("Cannot deconstruct " + it.getClass());
    }
  }
}
