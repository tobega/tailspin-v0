package tailspin.ast;

import java.util.List;
import tailspin.interpreter.RunTemplateBlock;
import tailspin.parser.TailspinParser;

public class Matcher {
  private final List<TailspinParser.ConditionContext> alternativeConditions;

  public Matcher(
      List<TailspinParser.ConditionContext> alternativeConditions) {
    this.alternativeConditions = alternativeConditions;
  }

  public boolean matches(Object value, RunTemplateBlock runner) {
    Object originalToMatch = runner.toMatch;
    runner.toMatch = value;
    try{
      for (TailspinParser.ConditionContext condition : alternativeConditions) {
        if (runner.visitCondition(condition)) {
          return true;
        }
      }
      return false;
    } finally{
      runner.toMatch = originalToMatch;
    }
  }
}
