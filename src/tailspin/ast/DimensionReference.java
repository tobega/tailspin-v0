package tailspin.ast;

import tailspin.interpreter.Scope;

public interface DimensionReference {
  /* Returns a stream of ints resolved according to resolveIndex */
  Object getIndices(int size, Object it, Scope scope);

  static Long resolveIndex(int index, int size) {
    if (index == 0 || index > size) return null;
    if (index < 0) {
      long fromEnd = (index + size);
      return fromEnd < 0 ? null : fromEnd;
    } else {
      return (long) (index - 1);
    }
  }
}
