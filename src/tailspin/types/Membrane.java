package tailspin.types;

import tailspin.interpreter.Scope;
import tailspin.matchers.TypeBound;

public interface Membrane {
  /** Returns the matching object, possibly with added or removed type information */
  Object permeate(Object toMatch, Object it, Scope scope, TypeBound typeBound);
}
