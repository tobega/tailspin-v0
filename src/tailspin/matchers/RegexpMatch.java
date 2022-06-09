package tailspin.matchers;

import java.util.regex.Pattern;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Membrane;
import tailspin.types.TaggedIdentifier;

public class RegexpMatch implements Membrane {

  private final String tag;
  private final Value patternValue;

  public RegexpMatch(String tag, Value patternValue) {
    this.tag = tag;
    this.patternValue = patternValue;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope, String contextTag) {
    String pattern = (String) patternValue.getResults(it, scope);

    String stringToMatch;
    if (tag == null && toMatch instanceof TaggedIdentifier t) {
      if (contextTag == null) throw new IllegalArgumentException("Cannot compare (" + t.getTag() + ") " + t.getValue() + " with raw string pattern " + pattern);
      if (!t.getTag().equals(contextTag)) return null;
      toMatch = t.getValue();
    }
    if (toMatch instanceof TaggedIdentifier t) {
      if (t.getTag().equals(tag) && t.getValue() instanceof String s) stringToMatch = s;
      else return null;
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
