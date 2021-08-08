package tailspin.matchers;

import java.util.regex.Pattern;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class RegexpMatch implements Criterion {
  private final Value patternValue;

  public RegexpMatch(Value patternValue) {
    this.patternValue = patternValue;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    if (!(toMatch instanceof String stringToMatch)) return false;
    String pattern = (String) patternValue.getResults(it, scope);
    Pattern compiled =
        Pattern.compile(
            "\\A" + pattern + "\\z", Pattern.UNICODE_CHARACTER_CLASS + Pattern.CANON_EQ + Pattern.DOTALL);
    return compiled.matcher(stringToMatch).matches();
  }

  @Override
  public String toString() {
    return "'" + patternValue + "'";
  }
}
