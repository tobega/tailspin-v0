package tailspin.ast;

import tailspin.interpreter.Scope;

public interface DimensionReference {
  /* Returns a stream of ints resolved according to resolveIndex */
  Object getIndices(int size, Object it, Scope scope);

  static Long resolveIndex(int index, int size) {
    if (index == 0) return null;
    if (index < 0) {
      return (long) (index + size);
    } else {
      return (long) (index - 1);
    }
  }
}
