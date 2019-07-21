package tailspin.ast;

import tailspin.interpreter.Scope;

public interface Condition {
  boolean evaluate(Object it, Scope scope);
}
