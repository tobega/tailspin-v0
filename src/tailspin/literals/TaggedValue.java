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
    Object result = scope.getLocalDictionary().checkDataDefinition(tag, value.getResults(it, scope), scope);
    if (result instanceof TaggedIdentifier t) {
      if (t.getTag().equals(tag)) return result;
      throw new IllegalArgumentException("Assigned tag " + tag + " does not match " + DataDictionary.formatErrorValue(t));
    }
    throw new IllegalArgumentException("Bad tag " + tag + " assigned for " + value);
  }

  @Override
  public String toString() {
    return tag + "´ " + value;
  }
}
