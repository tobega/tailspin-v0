package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Membrane;
import tailspin.types.TailspinArray;

public class OneElementMatch implements CollectionSegmentCriterion {
  private final Membrane membrane;

  public OneElementMatch(Membrane membrane) {
    this.membrane = membrane;
  }

  @Override
  public int isMetAt(TailspinArray.Tail tail, Object it, Scope scope) {
    if (membrane.matches(tail.getNative(0), it, scope, null)) {
      return 1;
    }
    return 0;
  }

  @Override
  public String toString() {
    return membrane.toString();
  }
}
