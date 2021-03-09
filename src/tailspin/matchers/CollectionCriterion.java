package tailspin.matchers;

import tailspin.interpreter.Scope;

public interface CollectionCriterion extends CollectionSegmentCriterion {
  boolean isSatisfied(Object it, Scope scope);
}
