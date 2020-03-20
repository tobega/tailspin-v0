package tailspin.matchers;

import java.util.List;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class ValueMatcher implements Criterion {
  // @Nullable
  private final Criterion basicCriterion;
  private final List<Condition> suchThatMatchers;

  public ValueMatcher(Criterion basicCriterion, List<Condition> suchThatMatchers) {
    this.basicCriterion = basicCriterion;
    this.suchThatMatchers = suchThatMatchers;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    if (basicCriterion != null && !basicCriterion.isMet(toMatch, it, scope)) {
      return false;
    }
    for (Condition condition : suchThatMatchers) {
      if (!condition.isFulfilled(toMatch, scope)) {
        return false;
      }
    }
    return true;
  }
}
