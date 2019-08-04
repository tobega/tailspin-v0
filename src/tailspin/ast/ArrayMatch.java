package tailspin.ast;

import java.util.List;
import tailspin.interpreter.Scope;

public class ArrayMatch implements Condition {
  // @Nullable
  private final Condition lengthCondition;
  private final List<Condition> contentMatchers;

  public ArrayMatch(Condition lengthCondition,
      List<Condition> contentMatchers) {
    this.lengthCondition = lengthCondition;
    this.contentMatchers = contentMatchers;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope) {
    if (!(toMatch instanceof List)) return false;
    List<?> listToMatch = (List<?>) toMatch;
    if (lengthCondition != null && !lengthCondition.matches((long) listToMatch.size(), it, scope)) {
      return false;
    }
    for (Condition contentMatcher : contentMatchers) {
      if (!listToMatch.stream().anyMatch(e -> contentMatcher.matches(e, it, scope))) {
        return false;
      }
    }
    return true;
  }
}
