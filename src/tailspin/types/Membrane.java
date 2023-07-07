package tailspin.types;

import tailspin.interpreter.Scope;
import tailspin.matchers.TypeBound;

public interface Membrane {
  boolean matches(Object toMatch, Object it, Scope scope, TypeBound typeBound);

  default Object inContext(Object value) {
    return value;
  }
}
