package tailspin.ast;

import tailspin.interpreter.Scope;

public interface Condition {
  boolean matches(Object toMatch, Object it, Scope scope);
}
