package tailspin.literals;

import java.util.List;
import java.util.stream.Collectors;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.TaggedIdentifier;

public class StringLiteral implements Value {

  private final String tag;
  private final List<Value> stringLiteral;

  public StringLiteral(String tag, List<Value> stringLiteral) {
    this.tag = tag;
    this.stringLiteral = stringLiteral;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    String value = stringLiteral.stream()
        .map(v -> v.getResults(it, scope))
        .map(Object::toString)
        .collect(Collectors.joining());
    return tag == null ? value : new TaggedIdentifier(tag, value);
  }

  @Override
  public String toString() {
    return stringLiteral.stream().map(Object::toString).collect(Collectors.joining());
  }
}
