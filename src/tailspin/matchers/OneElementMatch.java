package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Criterion;
import tailspin.types.TailspinArray;

public class OneElementMatch implements CollectionSegmentCriterion {
  private final Criterion criterion;

  public OneElementMatch(Criterion criterion) {
    this.criterion = criterion;
  }

  @Override
  public int isMetAt(TailspinArray.Tail tail, Object it, Scope scope) {
    if (criterion.isMet(tail.get(1), it, scope)) {
      return 1;
    }
    return 0;
  }
}
