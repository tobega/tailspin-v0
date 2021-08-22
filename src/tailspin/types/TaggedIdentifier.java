package tailspin.types;

import java.util.Map;
import java.util.Objects;

public class TaggedIdentifier implements Processor {

  private final String tag;
  private final Object value;

  public TaggedIdentifier(String tag, Object value) {
    this.tag = tag;
    this.value = value;
  }

  @Override
  public String toString() {
    return value.toString();
  }

  public Object getValue() {
    return value;
  }

  public String getTag() {
    return tag;
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    if (message.equals("hashCode")) {
      return (it, params, callingDictionary) -> ((Number) value.hashCode()).longValue();
    } else if (message.equals("raw")) {
      return (it, params, callingDictionary) -> value;
    } else {
      throw new UnsupportedOperationException("Unknown tagged identifier message " + message);
    }
  }

  // This is for use in relations
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o instanceof TaggedIdentifier t) {
      return tag.equals(t.getTag()) && value.equals(t.getValue());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, value);
  }
}
