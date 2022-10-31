package tailspin.matchers;

import java.util.List;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.types.Membrane;
import tailspin.types.TailspinArray;

public class SequenceMatch implements CollectionSegmentCriterion {

  private final List<Membrane> sequence;

  public SequenceMatch(List<Membrane> sequence) {
    this.sequence = sequence;
  }

  @Override
  public int isMetAt(TailspinArray.Tail tail, Object it, Scope scope) {
    for (int i = 0; i < sequence.size(); i++) {
      if (i >= tail.length()) return 0;
      if (null == sequence.get(i).permeate(tail.getNative(i), it, scope)) return 0;
    }
    return sequence.size();
  }

  @Override
  public String toString() {
    return "(" + sequence.stream().map(c -> "<" + c + ">").collect(Collectors.joining(":")) + ")";
  }
}
