package tailspin.ast;

import java.util.regex.Pattern;
import tailspin.interpreter.Scope;

public class RegexpMatch implements Condition {
  private final Value patternValue;

  public RegexpMatch(Value patternValue) {
    this.patternValue = patternValue;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope) {
    if (!(toMatch instanceof String)) return false;
    String stringToMatch = (String) toMatch;
    String pattern = (String) patternValue.getResults(it, scope);
    Pattern compiled =
        Pattern.compile(
            "\\A" + pattern + "\\z", Pattern.UNICODE_CHARACTER_CLASS + Pattern.CANON_EQ + Pattern.DOTALL);
    return compiled.matcher(stringToMatch).matches();
  }
}
