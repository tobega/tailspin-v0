package tailspin.matchers;

import java.util.regex.Pattern;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Membrane;
import tailspin.types.TaggedIdentifier;

public class RegexpMatch implements Membrane {
  private final Value patternValue;

  public RegexpMatch(Value patternValue) {
    this.patternValue = patternValue;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope) {
    Object value  = patternValue.getResults(it, scope);
    String tag = null;
    String pattern;
    if (value instanceof TaggedIdentifier t) {
      tag = t.getTag();
      pattern = (String) t.getValue();
    } else {
      pattern = (String) value;
    }
    String stringToMatch;
    if (tag == null && toMatch instanceof TaggedIdentifier t) toMatch = t.getValue();
    if (toMatch instanceof TaggedIdentifier t) {
      if (t.getTag().equals(tag) && t.getValue() instanceof String s) stringToMatch = s;
      else throw new IllegalArgumentException("Attempt to match (" + t.getTag() + ") with " + (tag == null ? "raw string" : tag));
    } else if (toMatch instanceof String s) {
      stringToMatch = s;
    } else return null;
    Pattern compiled =
        Pattern.compile(
            "\\A" + pattern + "\\z", Pattern.UNICODE_CHARACTER_CLASS + Pattern.CANON_EQ + Pattern.DOTALL);
    return compiled.matcher(stringToMatch).matches() ? toMatch : null;
  }

  @Override
  public String toString() {
    return "'" + patternValue + "'";
  }
}
