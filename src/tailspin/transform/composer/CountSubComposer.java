package tailspin.transform.composer;

import java.util.ArrayDeque;
import java.util.Queue;
import tailspin.ast.Value;
import tailspin.interpreter.Scope;

public class CountSubComposer implements SubComposer {

  private final SubComposer subComposer;
  private final Value count;
  private final Scope scope;
  private Queue<Object> values;
  private Long required;

  CountSubComposer(SubComposer subComposer, Value count, Scope scope) {
    this.subComposer = subComposer;
    this.count = count;
    this.scope = scope;
  }

  @Override
  public String nibble(String s) {
    if (required == null) {
      required = ((Number) count.getResults(null, scope)).longValue();
    }
    values = new ArrayDeque<>();
    for (int i = 0; !s.isEmpty() && i < required; i++) {
      s = subComposer.nibble(s);
      if (subComposer.isSatisfied()) {
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
    required = null;
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return values.size() == required;
  }
}
