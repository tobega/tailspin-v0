package tailspin.literals;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;
import tailspin.types.Unit;

public class CodedCharacter implements Value {
  private final Value code;

  public CodedCharacter(Value code) {
    this.code = code;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    Object value = code.getResults(it, scope);
    if (value instanceof Measure m && m.getUnit().equals(Unit.SCALAR)) {
      value = m.getValue();
    }
    return Character.toString(((Number) value).intValue());
  }

  @Override
  public String toString() {
    return "$#" + code + ";";
  }
}
