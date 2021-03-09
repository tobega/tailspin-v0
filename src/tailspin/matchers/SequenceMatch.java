package tailspin.matchers;

import java.util.List;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;
import tailspin.types.TailspinArray;

public class SequenceMatch implements CollectionSegmentCriterion {

  private final List<Criterion> sequence;

  public SequenceMatch(List<Criterion> sequence) {
    this.sequence = sequence;
  }

  @Override
  public int isMetAt(TailspinArray.Tail tail, Object it, Scope scope) {
    for (int i = 0; i < sequence.size(); i++) {
      if (i >= tail.length()) return 0;
      if (!sequence.get(i).isMet(tail.get(i+1), it, scope)) return 0;
    }
    return sequence.size();
  }
}
