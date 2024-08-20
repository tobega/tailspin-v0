package tailspin.matchers.composer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import tailspin.control.ResultIterator;
import tailspin.control.ResultIterator.QueueResult;
import tailspin.interpreter.Scope;
import tailspin.matchers.composer.CompositionSpec.Resolver;

public class SequenceSubComposer implements SubComposer {
  private final List<CompositionSpec> sequence;
  private final Scope scope;
  private final Resolver resolver;
  private List<SubComposer> value;

  public SequenceSubComposer(List<CompositionSpec> sequence, Scope scope, CompositionSpec.Resolver resolver) {
    this.sequence = sequence;
    this.scope = scope;
    this.resolver = resolver;
  }

  @Override
  public Memo nibble(String s, Memo memo) {
    value = new ArrayList<>();
    return resolveRemaining(s, memo);
  }

  private Memo resolveRemaining(String s, Memo memo) {
    for (CompositionSpec spec : sequence.subList(value.size(), sequence.size())) {
      SubComposer subComposer = resolver.resolveSpec(spec, scope);
      memo = subComposer.nibble(s, memo);
      if (subComposer.isSatisfied()) {
        value.add(subComposer);
      } else {
        return backtrack(s, memo);
      }
    }
    return memo;
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    while (!value.isEmpty()) {
      SubComposer subComposer = value.remove(value.size() - 1);
      memo = subComposer.backtrack(s, memo);
      if (subComposer.isSatisfied()) {
        value.add(subComposer);
        return resolveRemaining(s, memo);
      }
    }
    value = null;
    return memo;
  }

  @Override
  public Object getValues() {
    AtomicReference<Object> result = new AtomicReference<>(new QueueResult());
    value.forEach(v -> result.set(ResultIterator.appendResultValue(result.get(), v.getValues())));
    QueueResult collected = (QueueResult) result.get();
    return collected.simplifiedResultIterator();
  }

  @Override
  public boolean isSatisfied() {
    if (sequence.isEmpty()) return true;
    return  value != null && !value.isEmpty() && value.stream().allMatch(SubComposer::isSatisfied);
  }
}
