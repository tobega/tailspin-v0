package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.Queue;

public class CountSubComposer implements SubComposer {

  private final SubComposer subComposer;
  private final Integer count;
  private final String identifier;
  private final Scope scope;
  private Queue<Object> values;
  private int required;

  public CountSubComposer(SubComposer subComposer, Integer count, String identifier, Scope scope) {
    this.subComposer = subComposer;
    this.count = count;
    this.identifier = identifier;
    this.scope = scope;
  }

  @Override
  public String nibble(String s) {
    if (count == null) {
      required = (Integer) scope.resolveValue(identifier);
    } else {
      required = count;
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
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return values.size() == required;
  }
}
