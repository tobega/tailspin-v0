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
  public Memo nibble(String s, Memo memo) {
    values = new ArrayList<>();
    return addRepetitions(s, memo);
  }

  private Memo addRepetitions(String s, Memo memo) {
    while (memo.pos < s.length() &&
        (null == multiplier.permeate(values.size(), null, scope)
            || null != multiplier.permeate(values.size()+1, null, scope))) {
      SubComposer subComposer = resolver.resolveSpec(compositionSpec, scope);
      memo = subComposer.nibble(s, memo);
      if (subComposer.isSatisfied()) {
        values.add(subComposer);
      } else {
        break;
      }
    }
    if (!isSatisfied()) {
      memo = rewind(s, memo);
    }
    return memo;
  }

  private Memo rewind(String s, Memo memo) {
    while (!values.isEmpty()) {
      SubComposer last = values.remove(values.size() - 1);
      do {
        memo = last.backtrack(s, memo);
      } while (last.isSatisfied());
    }
    values = null;
    return memo;
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    if (values.isEmpty()) {
      values = null;
      return memo;
    }
    SubComposer last = values.remove(values.size() - 1);
    memo = last.backtrack(s, memo);
    if (last.isSatisfied()) {
      values.add(last);
      return addRepetitions(s, memo);
    }
    // See if we can accept just one less repetition
    if (!isSatisfied()) {
      memo = rewind(s, memo);
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
    return values != null && null != multiplier.permeate(values.size(), null, scope);
  }
}
