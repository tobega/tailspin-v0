package tailspin.matchers.composer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.matchers.composer.CompositionSpec.Resolver;

public class SequenceSubComposer implements SubComposer {
  private final List<CompositionSpec> sequence;
  private final Scope scope;
  private final Resolver resolver;
  private Deque<SubComposer> value;
  private boolean satisfied = false;

  public SequenceSubComposer(List<CompositionSpec> sequence, Scope scope, CompositionSpec.Resolver resolver) {
    this.sequence = sequence;
    this.scope = scope;
    this.resolver = resolver;
  }

  @Override
  public Memo nibble(Memo s) {
    Memo original = s;
    value = new ArrayDeque<>();
    satisfied = true;
    for (CompositionSpec spec : sequence) {
      SubComposer subComposer = resolver.resolveSpec(spec, scope);
      s = subComposer.nibble(s);
      satisfied &= subComposer.isSatisfied();
      if (subComposer.isSatisfied()) {
        value.add(subComposer);
      } else {
        return original;
      }
    }
    return s;
  }

  @Override
  public Memo backtrack(Memo memo) {
    satisfied = false;
    // TODO: actually handle backtracking
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
