package tailspin.literals;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.DataDictionary;
import tailspin.types.TaggedIdentifier;

public class TaggedValue implements Value {

  private final String tag;
  private final Value value;

  public TaggedValue(String tag, Value value) {
    this.tag = tag;
    this.value = value;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    Object resolved = value.getResults(it, scope);
    Object result = scope.getLocalDictionary().checkDataDefinition(tag, resolved, scope);
    if (result == null) {
      throw new IllegalArgumentException("Assigned tag " + tag + " does not match " + DataDictionary.formatErrorValue(resolved));
    }
    return new TaggedIdentifier(tag, resolved);
  }

  @Override
  public String toString() {
    return tag + "´ " + value;
  }
}
