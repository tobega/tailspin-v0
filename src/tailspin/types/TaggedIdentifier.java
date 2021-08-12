package tailspin.types;

public class TaggedIdentifier {

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
}
