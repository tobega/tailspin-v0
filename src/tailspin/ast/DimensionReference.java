package tailspin.ast;

import java.util.List;
import tailspin.interpreter.Scope;

public interface DimensionReference {
  /* Returns a stream of ints resolved according to resolveIndex */
  Object getIndices(DimensionContextKeywordResolver.Context dimension, Object it, Scope scope);
}
