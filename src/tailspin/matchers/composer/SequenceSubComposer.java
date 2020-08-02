package tailspin.matchers.composer;

import java.util.List;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.matchers.composer.CompositionSpec.Resolver;

public class SequenceSubComposer implements SubComposer {
  private final List<CompositionSpec> sequence;
  private final Scope scope;
  private final Resolver resolver;
  private Object value;
  private boolean satisfied = false;

  public SequenceSubComposer(List<CompositionSpec> sequence, Scope scope, CompositionSpec.Resolver resolver) {
    this.sequence = sequence;
    this.scope = scope;
    this.resolver = resolver;
  }

  @Override
  public Memo nibble(Memo s) {
    Memo original = s;
    value = null;
    satisfied = true;
    for (CompositionSpec spec : sequence) {
      SubComposer subComposer = resolver.resolveSpec(spec, scope);
      s = subComposer.nibble(s);
      satisfied &= subComposer.isSatisfied();
      if (subComposer.isSatisfied()) {
        value = ResultIterator.appendResultValue(value, subComposer.getValues());
      } else {
        return original;
      }
    }
    return s;
  }

  @Override
  public Object getValues() {
    Object result = value;
    value = null;
    satisfied = false;
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
