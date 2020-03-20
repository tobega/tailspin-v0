package tailspin.literals;

import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class CodedCharacter implements Value {
  private final Value code;

  public CodedCharacter(Value code) {
    this.code = code;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    return Character.toString(((Number) code.getResults(it, scope)).intValue());
  }
}
