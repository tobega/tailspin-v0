package tailspin.types;

import java.util.Map;

public class TaggedIdentifier implements Processor {
  private final String tag;
  private final Object value;

  public TaggedIdentifier(String tag, Object value) {
    this.tag = tag;
    this.value = value;
  }

  public String getTag() {
    return tag;
  }

  public Object getValue() {
    return value;
  }

  @Override
  public String toString() {
    return value.toString();
  }

  @Override
  public int hashCode() {
    return value.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof TaggedIdentifier t) {
      return tag.equals(t.tag) && value.equals(t.value);
    }
    return value.equals(obj);
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    if (message.equals("hashCode")) {
      return (it, params) -> value.hashCode();
    } else if (message.equals("raw")) {
      return (it, params) -> value;
    } else {
      throw new UnsupportedOperationException("Unknown array message " + message);
    }
  }
}
