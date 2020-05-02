package tailspin.matchers.composer;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import tailspin.interpreter.Scope;
import tailspin.matchers.composer.CompositionSpec.Resolver;

public class SequenceSubComposer implements SubComposer {
  private final List<CompositionSpec> sequence;
  private final Scope scope;
  private final Resolver resolver;
  private Queue<Object> value;
  private boolean satisfied = false;

  public SequenceSubComposer(List<CompositionSpec> sequence, Scope scope, CompositionSpec.Resolver resolver) {
    this.sequence = sequence;
    this.scope = scope;
    this.resolver = resolver;
  }

  @Override
  public String nibble(String s) {
    String originalS = s;
    value = new ArrayDeque<>();
    satisfied = true;
    for (CompositionSpec spec : sequence) {
      SubComposer subComposer = resolver.resolveSpec(spec, scope);
      s = subComposer.nibble(s);
      satisfied &= subComposer.isSatisfied();
      if (subComposer.isSatisfied()) {
        value.addAll(subComposer.getValues());
      } else {
        return originalS;
      }
    }
    return s;
  }

  @Override
  public Queue<Object> getValues() {
    Queue<Object> result = value;
    value = null;
    satisfied = false;
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
