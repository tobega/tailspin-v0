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
  public boolean matches(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
    if (basicMembrane != null && !basicMembrane.matches(toMatch, it, scope, typeBound)) {
      return false;
    }
    for (Condition condition : suchThatMatchers) {
      if (!condition.isFulfilled(toMatch, scope)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public String toString() {
    return (basicMembrane == null ? "" : basicMembrane.toString()) + suchThatMatchers.stream().map(Object::toString).collect(
        Collectors.joining());
  }
}
