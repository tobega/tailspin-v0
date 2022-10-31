package tailspin.matchers;

import java.util.regex.Pattern;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Membrane;
import tailspin.types.TaggedIdentifier;

public class RegexpMatch implements Membrane {

  public static final Membrane stringType = new Membrane() {
    @Override
    public Object permeate(Object toMatch, Object it, Scope scope) {
      Object baseValue = toMatch;
      if (baseValue instanceof TaggedIdentifier t) baseValue = t.getValue();
      return (baseValue instanceof String) ? toMatch : null;
    }

    @Override
    public String toString() {
      return "string type";
    }
  };

  private final String tag;
  private final Value patternValue;

  public RegexpMatch(String tag, Value patternValue) {
    this.tag = tag;
    this.patternValue = patternValue;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope) {
    String pattern = (String) patternValue.getResults(it, scope);

    String stringToMatch;
    if (toMatch instanceof TaggedIdentifier t) {
      if (tag == null && t.getValue() instanceof String s) {
        toMatch = s;
        stringToMatch = s;
      } else if (t.getTag().equals(tag) && t.getValue() instanceof String s) stringToMatch = s;
      else return null;
    } else if (toMatch instanceof String s) {
      if (tag != null) return null;
      stringToMatch = s;
    } else return null;
    Pattern compiled =
        Pattern.compile(
            "\\A" + pattern + "\\z", Pattern.UNICODE_CHARACTER_CLASS + Pattern.CANON_EQ + Pattern.DOTALL);
    return compiled.matcher(stringToMatch).matches() ? toMatch : null;
  }

  @Override
  public String toString() {
    return (tag == null ? "" : (tag + "´")) + "'" + patternValue + "'";
  }
}
