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
    if (tag == null) return value;
    Object result = scope.getLocalDictionary().checkDataDefinition(tag, value);
    if (result instanceof TaggedIdentifier t) {
      if (t.getTag().equals(tag)) return result;
      throw new IllegalArgumentException("Assigned tag " + tag + " does not match " + t.getTag() + "´" + t.getValue());
    }
    throw new IllegalArgumentException("Bad tag " + tag + " assigned for " + value);
  }

  @Override
  public String toString() {
    return stringLiteral.stream().map(Object::toString).collect(Collectors.joining());
  }
}
