package tailspin.ast;

import static tailspin.ast.Value.oneValue;

import java.util.ArrayDeque;
import java.util.Queue;
import tailspin.interpreter.RunTemplateBlock;

public class SuchThatMatch {
  private final Value lhs;
  private final Matcher matcher;

  public SuchThatMatch(Value lhs, Matcher matcher) {
    this.lhs = lhs;
    this.matcher = matcher;
  }

  public boolean resolveValue(RunTemplateBlock runner) {
    Queue<Object> originalIt = runner.scope.getIt();
    runner.scope.setIt(queueOf(runner.toMatch));
    try{
      Object value = lhs.evaluate(runner.toMatch, runner.scope);
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
