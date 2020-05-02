package tailspin.matchers.composer;

import java.util.ArrayDeque;
import java.util.Queue;
import tailspin.interpreter.Scope;
import tailspin.matchers.RangeMatch;

public class MultiplierSubComposer implements SubComposer {

  private final SubComposer subComposer;
  private final RangeMatch multiplier;
  private final Scope scope;
  private Queue<Object> values;
  private long repetitions = 0;

  MultiplierSubComposer(SubComposer subComposer, RangeMatch multiplier, Scope scope) {
    this.subComposer = subComposer;
    this.multiplier = multiplier;
    this.scope = scope;
  }

  @Override
  public String nibble(String s) {
    values = new ArrayDeque<>();
    while (!multiplier.isMet(repetitions, null, scope)) {
      s = subComposer.nibble(s);
      if (subComposer.isSatisfied()) {
        repetitions++;
        values.addAll(subComposer.getValues());
      } else {
        break;
      }
    }
    while (multiplier.isMet(repetitions+1, null, scope)) {
      s = subComposer.nibble(s);
      if (subComposer.isSatisfied()) {
        repetitions++;
        values.addAll(subComposer.getValues());
      } else {
        break;
      }
    }
    return s;
  }

  @Override
  public Queue<Object> getValues() {
    Queue<Object> result = values;
    values = null;
    repetitions = 0;
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return multiplier.isMet(repetitions, null, scope);
  }
}
