package tailspin.ast;

import java.util.Queue;
import java.util.function.Function;
import java.util.stream.Stream;
import tailspin.interpreter.Scope;

public class RangeGenerator implements Expression {

  private final Bound lowerBound;
  private final Bound upperBound;
  private final Value step;

  public RangeGenerator(Bound lowerBound, Bound upperBound, Value step) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
    this.step = step;
  }

  @Override
  public Queue<Object> run(Object it, Scope blockScope) {
    return Expression.queueOf(stream(Function.identity(), it, blockScope));
  }

  public Stream<Integer> stream(Function<Integer, Integer> boundTransform, Object it, Scope scope) {
    int increment = step == null ? 1 : (int) step.evaluate(it, scope);
    if (increment == 0) {
      throw new IllegalArgumentException("Cannot produce range with zero increment");
    }
    int start = boundTransform.apply((int) lowerBound.value.evaluate(it, scope));
    int end = boundTransform.apply((int) upperBound.value.evaluate(it, scope));
    if (start < 0 || (increment > 0 && start > end) || (increment < 0 && start < end)) {
      return Stream.empty();
    }
    return Stream.iterate(
        lowerBound.inclusive ? start : start + increment,
        i -> (increment > 0 && i < end) || (increment < 0 && i > end) || (upperBound.inclusive && i.equals(end)),
        i -> i + increment);
  }
}
