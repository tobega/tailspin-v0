package tailspin.ast;

import java.util.ArrayDeque;
import java.util.Queue;
import tailspin.interpreter.RunTemplateBlock;
import tailspin.parser.TailspinParser;

public class SuchThatMatch {
  private final TailspinParser.ValueChainContext lhs;
  private final Matcher matcher;

  public SuchThatMatch(TailspinParser.ValueChainContext lhs, Matcher matcher) {
    this.lhs = lhs;
    this.matcher = matcher;
  }

  public boolean resolveValue(RunTemplateBlock runner) {
    Queue<Object> originalIt = runner.scope.getIt();
    runner.scope.setIt(queueOf(runner.toMatch));
    try{
      Queue<Object> values = runner.visitValueChain(lhs);
      if (values.size() != 1) {
        throw new IllegalStateException("Wrong number of values " + values.size() + " at " + lhs.getText());
      }
      Object value = values.peek();
      return matcher.matches(value,runner);
    } finally{
      runner.scope.setIt(originalIt);
    }
  }

  private Queue<Object> queueOf(Object object) {
    Queue<Object> queue = new ArrayDeque<>();
    queue.add(object);
    return queue;
  }
}
