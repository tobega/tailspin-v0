package tailspin.types;

import tailspin.interpreter.Scope;

public interface Membrane {
  Object permeate(Object toMatch, Object it, Scope scope);
}
