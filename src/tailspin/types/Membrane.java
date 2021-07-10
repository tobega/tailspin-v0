package tailspin.types;

import tailspin.interpreter.Scope;

/**
 * Returns acceptable candidates, possibly transformed, or null if candidate is not acceptable.
 */
public interface Membrane {
  Object permeate(Object candidate, Scope scope);
}
