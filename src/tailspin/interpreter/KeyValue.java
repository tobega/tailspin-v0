package tailspin.interpreter;

import java.util.Map;

public class KeyValue implements Map.Entry<String, Object> {
  private final String key;
  private final Object value;

  public KeyValue(String key, Object value) {
    this.key = key;
    this.value = value;
  }

  @Override
  public String getKey() {
    return key;
  }

  @Override
  public Object getValue() {
    return value;
  }

  @Override
  public Object setValue(Object value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String toString() {
    return key + "=" + value.toString();
  }
}
