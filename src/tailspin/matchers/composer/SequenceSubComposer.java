package tailspin.matchers.composer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.matchers.composer.CompositionSpec.Resolver;

public class SequenceSubComposer implements SubComposer {
  private final List<CompositionSpec> sequence;
  private final Scope scope;
  private final Resolver resolver;
  private List<SubComposer> value;
  private boolean satisfied = false;

  public SequenceSubComposer(List<CompositionSpec> sequence, Scope scope, CompositionSpec.Resolver resolver) {
    this.sequence = sequence;
    this.scope = scope;
    this.resolver = resolver;
  }

  @Override
  public Memo nibble(Memo s) {
    value = new ArrayList<>();
    return resolveRemaining(s);
  }

  private Memo resolveRemaining(Memo s) {
    satisfied = true;
    for (CompositionSpec spec : sequence.subList(value.size(), sequence.size())) {
      SubComposer subComposer = resolver.resolveSpec(spec, scope);
      s = subComposer.nibble(s);
      satisfied &= subComposer.isSatisfied();
      if (subComposer.isSatisfied()) {
        value.add(subComposer);
      } else {
        return goBack(s);
      }
    }
    return new Memo(s.s, value, s);
  }

  @Override
  @SuppressWarnings("unchecked")
  public Memo backtrack(Memo memo) {
    value = (List<SubComposer>) memo.backtrackNote;
    memo = memo.previous;
    return goBack(memo);
  }

  private Memo goBack(Memo memo) {
    satisfied = false;
    while (!value.isEmpty()) {
      SubComposer subComposer = value.remove(value.size() - 1);
      memo = subComposer.backtrack(memo);
      if (subComposer.isSatisfied()) {
        value.add(subComposer);
        return resolveRemaining(memo);
      }
    }
    return memo;
  }

  @Override
  public Object getValues() {
    AtomicReference<Object> result = new AtomicReference<>();
    value.forEach(v -> result.set(ResultIterator.appendResultValue(result.get(), v.getValues())));
    value = null;
    satisfied = false;
    return result.get();
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
