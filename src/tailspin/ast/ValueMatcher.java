package tailspin.ast;

import java.util.List;
import tailspin.interpreter.Scope;

public class ValueMatcher implements Condition {
  // @Nullable
  private final Condition basicCondition;
  private final List<SuchThatMatch> suchThatMatchers;

  public ValueMatcher(Condition basicCondition, List<SuchThatMatch> suchThatMatchers) {
    this.basicCondition = basicCondition;
    this.suchThatMatchers = suchThatMatchers;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope) {
    if (basicCondition != null && !basicCondition.matches(toMatch, it, scope)) {
      return false;
    }
    for (SuchThatMatch suchThatMatch : suchThatMatchers) {
      if (!suchThatMatch.resolveValue(toMatch, scope)) {
        return false;
      }
    }
    return true;
  }
}
