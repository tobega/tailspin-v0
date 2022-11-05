package tailspin.matchers;

import java.util.List;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.types.Membrane;

public class ValueMatcher implements Membrane {
  // @Nullable
  final Membrane basicMembrane;
  private final List<Condition> suchThatMatchers;

  public ValueMatcher(Membrane basicMembrane, List<Condition> suchThatMatchers) {
    this.basicMembrane = basicMembrane;
    this.suchThatMatchers = suchThatMatchers;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
    Object baseValue = basicMembrane == null ? toMatch : basicMembrane.permeate(toMatch, it, scope, typeBound);
    if (baseValue == null) {
      return null;
    }
    for (Condition condition : suchThatMatchers) {
      if (!condition.isFulfilled(toMatch, scope)) {
        return null;
      }
    }
    return baseValue;
  }

  @Override
  public String toString() {
    return (basicMembrane == null ? "" : basicMembrane.toString()) + suchThatMatchers.stream().map(Object::toString).collect(
        Collectors.joining());
  }
}
