package tailspin.types;

import tailspin.interpreter.Scope;

public interface Membrane {
  boolean matches(Object toMatch, Object it, Scope scope, Membrane typeBound);

  default Object inContext(Object value) {
    return value;
  }

  Membrane ALWAYS_TRUE = new Membrane() {
    @Override
    public boolean matches(Object toMatch, Object it, Scope scope, Membrane typeBound) {
      return true;
    }

    @Override
    public String toString() {
      return "true";
    }
  };

  Membrane ALWAYS_FALSE = new Membrane() {
    @Override
    public boolean matches(Object toMatch, Object it, Scope scope, Membrane typeBound) {
      return false;
    }

    @Override
    public String toString() {
      return "false";
    }
  };
}
