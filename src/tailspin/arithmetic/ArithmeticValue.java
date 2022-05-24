package tailspin.arithmetic;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;
import tailspin.types.Unit;

public class ArithmeticValue implements Value {

  private final String tag;
  private final Value value;

  public ArithmeticValue(String tag, Value value) {
    this.tag = tag;
    this.value = value;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    Object result = value.getResults(it, scope);
    if (result instanceof Measure m && m.getUnit().equals(Unit.UNKNOWN)) {
      throw new ArithmeticException("Cannot infer unit of measure for expression " + value);
    }
    return tag == null ? result : scope.getLocalDictionary().checkDataDefinition(tag, result);
  }

  @Override
  public String toString() {
    return value.toString();
  }
}
