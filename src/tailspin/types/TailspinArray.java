package tailspin.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import tailspin.control.ResultIterator;

public class TailspinArray implements Processor, Freezable<TailspinArray> {

  private final List<Object> array;
  private final boolean isMutable;

  private TailspinArray(List<Object> array, boolean isMutable) {
    this.array = array;
    this.isMutable = isMutable;
  }

  public static TailspinArray value(List<Object> array) {
    return new TailspinArray(array, false);
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    if (message.equals("hashCode")) {
      return (it, params) -> array.hashCode();
    } else if (message.equals("length")) {
      return (it, params) -> ((Number)array.size()).longValue();
    } else {
      throw new UnsupportedOperationException("Unknown array message " + message);
    }
  }

  @Override
  public String toString() {
    return array.toString();
  }

  @Override
  public int hashCode() {
    return array.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof TailspinArray)) return false;
    TailspinArray ta = (TailspinArray) obj;
    return array.equals(ta.array);
  }

  public int length() {
    return array.size();
  }

  public Object get(int i) {
    return array.get(i-1);
  }

  public Object set(int i, Object obj) {
    if (!isMutable) throw new IllegalStateException();
    array.set(i-1, obj);
    return null;
  }

  public Object remove(int i) {
    if (!isMutable) throw new IllegalStateException();
    return array.remove(i-1);
  }

  public Object deconstruct() {
    if (array.isEmpty()) {
      return null;
    }
    Iterator<Object> iterator = array.iterator();
    return (ResultIterator.Flat) () -> {
      if (!iterator.hasNext()) return null;
      return iterator.next();
    };
  }

  public Stream<Object> stream() {
    return array.stream();
  }

  public void append(Object result) {
    array.add(result);
  }

  @Override
  public void freeze() {
    array.stream().filter(Freezable.class::isInstance).forEach(o -> ((Freezable<?>) o).freeze());
  }

  @Override
  public TailspinArray thawedCopy() {
    return new TailspinArray(new ArrayList<>(array), true);
  }

  @Override
  public boolean isThawed() {
    return isMutable;
  }
}
