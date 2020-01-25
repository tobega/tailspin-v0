package tailspin.ast;

import java.util.List;
import tailspin.interpreter.Scope;

public interface DimensionReference {
  /* Returns a stream of ints resolved according to resolveIndex */
  Object getIndices(List<?> dimension, Object it, Scope scope);

  static Long resolveIndex(int index, List<?> dimension) {
    if (index == 0 || index > dimension.size()) return null;
    if (index < 0) {
      long fromEnd = (index + dimension.size());
      return fromEnd < 0 ? null : fromEnd;
    } else {
      return (long) (index - 1);
    }
  }
}
