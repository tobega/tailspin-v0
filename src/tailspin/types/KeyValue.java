package tailspin.types;

import java.util.Map;
import java.util.Objects;
import tailspin.literals.StringInterpolation;

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
    StringBuilder builder = new StringBuilder();
    StringInterpolation.appendStringValue(builder.append(key).append(": "), value);
    return builder.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyValue keyValue = (KeyValue) o;
    return key.equals(keyValue.key) &&
        value.equals(keyValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }
}
