package tailspin.control;

import java.util.Iterator;
import tailspin.interpreter.Scope;
import tailspin.types.TailspinArray;

public interface DimensionReference {

  Object resolveDimensionDereference(boolean forMutation,
      Iterator<DimensionReference> lowerDimensions,
      TailspinArray array, ArrayReference.ArrayOperation bottomOperation, Object it, Scope scope);
}
