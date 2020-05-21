package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public interface CollectionCriterion extends Criterion {

  @Override
  boolean isMet(Object toMatch, Object it, Scope scope);

  boolean isSatisfied(Object it, Scope scope);
}
