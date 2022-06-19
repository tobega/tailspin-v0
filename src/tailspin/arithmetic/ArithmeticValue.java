package tailspin.arithmetic;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.DataDictionary;
import tailspin.types.Measure;
import tailspin.types.TaggedIdentifier;
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
    if (tag == null) return result;
    Object tagged = scope.getLocalDictionary().checkDataDefinition(tag, result, scope);
    if (tagged instanceof TaggedIdentifier t) {
      if (t.getTag().equals(tag)) return tagged;
      throw new IllegalArgumentException("Tag " + tag + " does not match " + DataDictionary.formatErrorValue(t));
    }
    throw new IllegalArgumentException("Bad tag " + tag + " for " + result);
  }

  @Override
  public String toString() {
    return value.toString();
  }
}
