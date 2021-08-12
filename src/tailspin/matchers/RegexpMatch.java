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
    Object result = toMatch;
    if (toMatch instanceof TaggedIdentifier t) toMatch = t.getValue();
    if (!(toMatch instanceof String stringToMatch)) return null;
    String pattern = (String) patternValue.getResults(it, scope);
    Pattern compiled =
        Pattern.compile(
            "\\A" + pattern + "\\z", Pattern.UNICODE_CHARACTER_CLASS + Pattern.CANON_EQ + Pattern.DOTALL);
    return compiled.matcher(stringToMatch).matches() ? result : null;
  }

  @Override
  public String toString() {
    return "'" + patternValue + "'";
  }
}
