package tailspin.ast;

import tailspin.interpreter.KeyValue;
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
    return new KeyValue(key, value.getResults(it, scope));
  }
}
