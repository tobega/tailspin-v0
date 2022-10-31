package tailspin.types;

import tailspin.interpreter.Scope;

public interface Membrane {
  /** Returns the matching object, possibly with added or removed type information */
  Object permeate(Object toMatch, Object it, Scope scope);
}
