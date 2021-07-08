package tailspin.types;

public class TaggedIdentifier {
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
}
