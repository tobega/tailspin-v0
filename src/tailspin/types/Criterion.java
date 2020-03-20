package tailspin.types;

import tailspin.interpreter.Scope;

public interface Criterion {
  boolean isMet(Object toMatch, Object it, Scope scope);
}
