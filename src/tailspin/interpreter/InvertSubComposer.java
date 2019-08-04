package tailspin.interpreter;

import static tailspin.ast.Expression.queueOf;

import java.util.Queue;

public class InvertSubComposer implements SubComposer {
  private final SubComposer subComposer;
  private StringBuilder result;

  public InvertSubComposer(SubComposer subComposer) {
    this.subComposer = subComposer;
  }

  @Override
  public String nibble(String s) {
    result = new StringBuilder();
    for (subComposer.nibble(s); !s.isEmpty() && !subComposer.isSatisfied(); subComposer.nibble(s)) {
      result.append(s.charAt(0));
      s = s.substring(1);
    }
    return s;
  }

  @Override
  public Queue<Object> getValues() {
    if (subComposer.isSatisfied()) {
      subComposer.getValues(); // flush
    }
    Queue<Object> values = queueOf(result.toString());
    result = null;
    return values;
  }

  @Override
  public boolean isSatisfied() {
    return result != null && result.length() > 0;
  }
}
