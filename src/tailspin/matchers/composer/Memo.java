package tailspin.matchers.composer;

import java.util.ArrayList;
import java.util.List;

public class Memo {
  public final int pos;
  public final Memo previous;
  public final List<String> namedRulesStack = new ArrayList<>();
  public String caughtLeftRecursion;
  public SubComposer leftRecursionResult;

  private Memo(int pos, Memo previous, String caughtLeftRecursion, SubComposer leftRecursionResult) {
    this.pos = pos;
    this.previous = previous;
    this.caughtLeftRecursion = caughtLeftRecursion;
    this.leftRecursionResult = leftRecursionResult;
  }

  public static Memo root(int pos) {
    return new Memo(pos, null, null, null);
  }

  public Memo next(int pos) {
    namedRulesStack.clear();
    return new Memo(pos, this, caughtLeftRecursion, leftRecursionResult);
  }

  public Memo withoutLeftRecursionResult() {
    return new Memo(pos, this, caughtLeftRecursion, null);
  }
}
