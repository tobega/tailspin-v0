package tailspin.matchers.composer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.matchers.RangeMatch;
import tailspin.matchers.composer.CompositionSpec.Resolver;

public class MultiplierSubComposer implements SubComposer {

  private final CompositionSpec compositionSpec;
  private final RangeMatch multiplier;
  private final Scope scope;
  private final Resolver resolver;
  private List<SubComposer> values;

  public MultiplierSubComposer(CompositionSpec compositionSpec, RangeMatch multiplier, Scope scope,
      Resolver resolver) {
    this.compositionSpec = compositionSpec;
    this.multiplier = multiplier;
    this.scope = scope;
    this.resolver = resolver;
  }

  @Override
  public Memo nibble(Memo memo) {
    values = new ArrayList<>();
    return addRepetitions(memo);
  }

  private Memo addRepetitions(Memo memo) {
    while (!multiplier.isMet(values.size(), null, scope) || multiplier.isMet(values.size()+1, null, scope)) {
      SubComposer subComposer = resolver.resolveSpec(compositionSpec, scope);
      memo = subComposer.nibble(memo);
      if (subComposer.isSatisfied()) {
        values.add(subComposer);
      } else {
        break;
      }
    }
    if (!isSatisfied()) {
      memo = rewind(memo);
    }
    return memo;
  }

  private Memo rewind(Memo memo) {
    while (!values.isEmpty()) {
      SubComposer last = values.remove(values.size() - 1);
      do {
        memo = last.backtrack(memo);
      } while (last.isSatisfied());
    }
    values = null;
    return memo;
  }

  @Override
  public Memo backtrack(Memo memo) {
    if (values.isEmpty()) {
      values = null;
      return memo;
    }
    SubComposer last = values.remove(values.size() - 1);
    memo = last.backtrack(memo);
    if (last.isSatisfied()) {
      values.add(last);
      return addRepetitions(memo);
    }
    // See if we can accept just one less repetition
    if (!isSatisfied()) {
      memo = rewind(memo);
    }
    return memo;
  }

  @Override
  public Object getValues() {
    AtomicReference<Object> result = new AtomicReference<>();
    values.forEach(v -> result.set(ResultIterator.appendResultValue(result.get(), v.getValues())));
    return result.get();
  }

  @Override
  public boolean isSatisfied() {
    return values != null && multiplier.isMet(values.size(), null, scope);
  }
}
