package tailspin.ast;

import tailspin.interpreter.Scope;

public class CodedCharacter implements Value {
  private final Value code;

  public CodedCharacter(Value code) {
    this.code = code;
  }

  @Override
  public Object evaluate(Object it, Scope scope) {
    return Character.toString(((Number) code.evaluate(it, scope)).intValue());
  }
}
