package tailspin.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import tailspin.control.ResultIterator;

public class TailspinArray implements Processor, Freezable<TailspinArray> {

  private final List<Object> array;
  private boolean isMutable;
  private final Object offset;

  private TailspinArray(List<Object> array, boolean isMutable, Object offset) {
    this.array = array;
    this.isMutable = isMutable;
    this.offset = offset;
  }

  public static TailspinArray value(List<Object> array, Object offset) {
    return new TailspinArray(array, false, offset);
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    if (message.equals("hashCode")) {
      return (it, params, callingDictionary) -> ((Number)array.hashCode()).longValue();
    } else if (message.equals("length")) {
      return (it, params, callingDictionary) -> ((Number)array.size()).longValue();
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
    if (!(obj instanceof TailspinArray ta)) return false;
    return array.equals(ta.array);
  }

  public int length() {
    return array.size();
  }

  public Object getOffset() {
    return offset;
  }

  public Object getOffsetDescription() {
    if (offset instanceof Measure m) {
      return "" + m.getValue() + m.getUnit();
    } else if (offset instanceof TaggedIdentifier t) {
      return t.getTag() + "´" + t.getValue();
    } else {
      return "untyped " + offset;
    }
  }

  public Object getNative(int i) {
    return array.get(i);
  }

  public Object getTailspinIndex(int i) {
    if (offset instanceof Measure m) {
      return new Measure(m.getValue() + i, m.getUnit());
    }
    if (offset instanceof TaggedIdentifier t) {
      return new TaggedIdentifier(t.getTag(), (Long) t.getValue() + i);
    }
    return (Long) offset + i;
  }

  public Void setNative(int i, Object obj) {
    if (!isMutable) throw new IllegalStateException();
    array.set(i, obj);
    return null;
  }

  public void removeNative(int i) {
    if (!isMutable) throw new IllegalStateException();
    array.remove(i);
  }

  public Object deconstruct() {
    if (array.isEmpty()) {
      return null;
    }
    if (array.size() == 1) {
      return array.get(0);
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

  public void prepend(Object result) {
    array.add(0, result);
  }

  @Override
  public void freeze() {
    array.stream().filter(Freezable.class::isInstance).forEach(o -> ((Freezable<?>) o).freeze());
    isMutable = false;
  }

  @Override
  public TailspinArray thawedCopy() {
    return new TailspinArray(new ArrayList<>(array), true, offset);
  }

  @Override
  public boolean isThawed() {
    return isMutable;
  }

  public Tail tailFromNative(int index) {
    return new Tail(index);
  }

  public class Tail {
    private final int startIndex;

    private Tail(int startIndex) {
      this.startIndex = startIndex;
    }

    public Object getNative(int i) {
      return TailspinArray.this.getNative(i+startIndex);
    }

    public Tail tailFromNative(int index) {
      return new Tail(index + startIndex);
    }

    public boolean isEmpty() {
      return startIndex >= array.size();
    }

    public int length() {
      return array.size() - startIndex;
    }
  }
}
