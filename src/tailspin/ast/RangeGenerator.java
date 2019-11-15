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

  public Stream<Long> stream(Function<Long, Long> boundTransform, Object it, Scope scope) {
    long increment = step == null ? 1 : ((Number) step.getResults(it, scope)).longValue();
    if (increment == 0) {
      throw new IllegalArgumentException("Cannot produce range with zero increment");
    }
    Long start = boundTransform.apply(((Number) lowerBound.value.getResults(it, scope)).longValue());
    Long end = boundTransform.apply(((Number) upperBound.value.getResults(it, scope)).longValue());
    if (start == null || end == null || (increment > 0 && start > end) || (increment < 0 && start < end)) {
      return Stream.empty();
    }
    return Stream.iterate(
        lowerBound.inclusive ? start : start + increment,
        i -> (increment > 0 && i < end) || (increment < 0 && i > end) || (upperBound.inclusive && i.equals(end)),
        i -> i + increment);
  }
}
