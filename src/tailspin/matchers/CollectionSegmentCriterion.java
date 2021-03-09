package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.TailspinArray;

public interface CollectionSegmentCriterion {

  /**
   * Returns the number of elements consumed by the match, 0 if it didn't match
   */
  int isMetAt(TailspinArray.Tail toMatch, Object it, Scope scope);
}
