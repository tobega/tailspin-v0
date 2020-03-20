package tailspin.matchers;

import java.util.List;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class ArrayMatch implements Criterion {
  // @Nullable
  private final Criterion lengthCriterion;
  private final List<Criterion> contentMatchers;

  public ArrayMatch(Criterion lengthCriterion,
      List<Criterion> contentMatchers) {
    this.lengthCriterion = lengthCriterion;
    this.contentMatchers = contentMatchers;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    if (!(toMatch instanceof List)) return false;
    List<?> listToMatch = (List<?>) toMatch;
    if (lengthCriterion != null && !lengthCriterion.isMet((long) listToMatch.size(), it, scope)) {
      return false;
    }
    for (Criterion contentMatcher : contentMatchers) {
      if (listToMatch.stream().noneMatch(e -> contentMatcher.isMet(e, it, scope))) {
        return false;
      }
    }
    return true;
  }
}
