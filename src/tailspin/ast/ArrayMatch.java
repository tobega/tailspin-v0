package tailspin.ast;

import java.util.List;
import tailspin.interpreter.Scope;

public class ArrayMatch implements Condition {
  // @Nullable
  private final Condition lengthCondition;

  public ArrayMatch(Condition lengthCondition) {
    this.lengthCondition = lengthCondition;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope) {
    if (!(toMatch instanceof List)) return false;
    List<?> listToMatch = (List<?>) toMatch;
    if (lengthCondition != null && !lengthCondition.matches((long) listToMatch.size(), it, scope)) {
      return false;
    }
    return true;
  }
}
