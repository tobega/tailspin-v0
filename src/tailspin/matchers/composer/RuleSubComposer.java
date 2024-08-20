package tailspin.matchers.composer;

import java.util.List;
import tailspin.interpreter.NestedScope;
import tailspin.interpreter.Scope;

class RuleSubComposer implements SubComposer {
  private final String name;
  private final List<CompositionSpec> compositionSpecs;
  private final Scope scope;
  private final CompositionSpec.Resolver resolver;
  SubComposer sequenceSubComposer;

  RuleSubComposer(String name, List<CompositionSpec> compositionSpecs, Scope scope,
      CompositionSpec.Resolver resolver) {
    this.name = name;
    this.compositionSpecs = compositionSpecs;
    this.scope = scope;
    this.resolver = resolver;
  }

  @Override
  public Memo nibble(String s, Memo memo) {
    String precedingLeftRecursion = null;
    if (memo.leftRecursionResult == null) {
      precedingLeftRecursion = memo.caughtLeftRecursion;
      memo.caughtLeftRecursion = null;
    }
    if (name.equals(memo.caughtLeftRecursion)) {
       sequenceSubComposer = memo.leftRecursionResult;
       return memo.withoutLeftRecursionResult();
    }
    if (memo.namedRulesStack.contains(name)) {
      throw new LeftRecursionException(name);
    }
    memo.namedRulesStack.add(name);
    sequenceSubComposer = new SequenceSubComposer(compositionSpecs, new NestedScope(scope),
        resolver);
    Memo result = sequenceSubComposer.nibble(s, memo);
    result = resolveLeftRecursion(s, result);
    if (!result.namedRulesStack.isEmpty()
        && !name.equals(result.namedRulesStack.remove(result.namedRulesStack.size() - 1))) {
      throw new AssertionError("left recursion detection mismatch");
    }
    if (precedingLeftRecursion != null) result.caughtLeftRecursion = precedingLeftRecursion;
    return result;
  }

  private Memo resolveLeftRecursion(String s, Memo result) {
    Memo memo = result;
    try {
      while (name.equals(result.caughtLeftRecursion) && sequenceSubComposer.isSatisfied()){
        memo = result;
        memo.leftRecursionResult = sequenceSubComposer;
        memo.namedRulesStack.add(name);
        sequenceSubComposer = new SequenceSubComposer(compositionSpecs, new NestedScope(scope),
            resolver);
        result = sequenceSubComposer.nibble(s, memo);
      }
    } catch (PoppedLeftRecursionException e){
      memo = unravelLeftRecursion(e);
    }
    return memo;
  }

  private Memo unravelLeftRecursion(PoppedLeftRecursionException e) {
    Memo memo = e.getMemo();
    sequenceSubComposer = memo.leftRecursionResult;
    memo.leftRecursionResult = null;
    memo.caughtLeftRecursion = null;
    while (!memo.namedRulesStack.isEmpty() && !name.equals(memo.namedRulesStack.get(memo.namedRulesStack.size() - 1))) {
      memo.namedRulesStack.remove(memo.namedRulesStack.size() - 1);
    }
    return memo;
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    if (name.equals(memo.caughtLeftRecursion)) {
      throw new PoppedLeftRecursionException(memo.previous);
    } else {
      try {
        memo = sequenceSubComposer.backtrack(s, memo);
      } catch (PoppedLeftRecursionException e){
        memo = unravelLeftRecursion(e);
      }
      memo = resolveLeftRecursion(s, memo);
    }
    if (!memo.namedRulesStack.isEmpty()
        && !name.equals(memo.namedRulesStack.remove(memo.namedRulesStack.size() - 1))) {
      throw new AssertionError("left recursion detection mismatch");
    }
    return memo;
  }

  @Override
  public Object getValues() {
    return sequenceSubComposer.getValues();
  }

  @Override
  public boolean isSatisfied() {
    return sequenceSubComposer.isSatisfied();
  }
}
