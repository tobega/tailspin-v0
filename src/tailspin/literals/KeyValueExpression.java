package tailspin.literals;

import tailspin.control.Value;
import tailspin.types.KeyValue;
import tailspin.interpreter.Scope;

public class KeyValueExpression implements Value {
  private final String key;
  private final Value value;

  public KeyValueExpression(String key, Value value) {
    this.key = key;
    this.value = value;
  }

  @Override
  public KeyValue getResults(Object it, Scope scope) {
    Object data = value.getResults(it, scope);
    scope.checkDataDefinition(key, data);
    return new KeyValue(key, data);
  }

  public String getKey() {
    return key;
  }
}
