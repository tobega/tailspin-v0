package tailspin.matchers;

import java.util.List;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.types.TailspinArray;

public class SequenceMatch implements CollectionSegmentCriterion {

  private final List<CollectionCriterionFactory> sequence;

  public SequenceMatch(List<CollectionCriterionFactory> sequence) {
    this.sequence = sequence;
  }

  @Override
  public int isMetAt(TailspinArray.Tail tail, Object it, Scope scope) {
    List<CollectionCriterion> criteria = sequence.stream()
        .map(CollectionCriterionFactory::newCriterion).toList();
    int consumed = 0;
    for (CollectionCriterion c : criteria) {
      int chop;
      while (!tail.isEmpty() && !c.isSatisfied(it, scope) && (chop = c.isMetAt(tail, it, scope)) != 0) {
        consumed += chop;
        tail = tail.tailFromNative(chop);
      }
      if (!c.isSatisfied(it, scope)) {
        return 0;
      }
      while (!tail.isEmpty() && (chop = c.isMetAt(tail, it, scope)) != 0 && c.isSatisfied(it, scope)) {
        consumed += chop;
        tail = tail.tailFromNative(chop);
      }
    }
    return consumed;
  }

  @Override
  public String toString() {
    return "(" + sequence.stream().map(c -> "<" + c + ">").collect(Collectors.joining(":")) + ")";
  }
}
