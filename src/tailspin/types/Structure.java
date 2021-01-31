package tailspin.types;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import tailspin.control.ResultIterator;

public class Structure implements Freezable<Structure> {

  private final Map<String, Object> map;
  private boolean isMutable;

  public Structure(Map<String, Object> map, boolean isMutable) {
    if (isMutable && !(map instanceof TreeMap)) throw new AssertionError();
    this.map = map;
    this.isMutable = isMutable;
  }

  public static Structure value(Map<String, Object> map) {
    return new Structure(map, false);
  }

  public static Structure value(ResultIterator.Flat resultIterator) {
    Map<String, Object> fields = new TreeMap<>();
    ResultIterator.forEach(resultIterator, o -> {
      KeyValue kv = (KeyValue) o;
      fields.put(kv.getKey(), kv.getValue());
    });
    return new Structure(fields, false);
  }

  public Object get(String fieldIdentifier) {
    return map.get(fieldIdentifier);
  }

  @Override
  public int hashCode() {
    return map.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Structure)) return false;
    Structure s = (Structure) obj;
    return map.equals(s.map);
  }

  @Override
  public String toString() {
    return map.toString();
  }

  public boolean containsKey(String key) {
    return map.containsKey(key);
  }

  public Set<String> keySet() {
    return map.keySet();
  }

  public ResultIterator.Flat deconstruct() {
    if (map.isEmpty()) {
      return null;
    }
    Iterator<Entry<String, Object>> iterator = map.entrySet().iterator();
    return () -> {
      if (!iterator.hasNext()) {
        return null;
      }
      Map.Entry<String, Object> e = iterator.next();
      return new KeyValue(e.getKey(), e.getValue());
    };
  }

  public Object remove(String fieldIdentifier) {
    if (!isMutable) throw new IllegalStateException();
    return map.remove(fieldIdentifier);
  }

  public void put(String key, Object value) {
    if (value == null) throw new NullPointerException("Try to set null");
    if (!isMutable) throw new IllegalStateException();
    map.put(key, value);
  }

  @Override
  public void freeze() {
    map.values().stream().filter(Freezable.class::isInstance).forEach(o -> ((Freezable<?>) o).freeze());
    isMutable = false;
  }

  @Override
  public Structure thawedCopy() {
    return new Structure(new TreeMap<>(map), true);
  }

  @Override
  public boolean isThawed() {
    return isMutable;
  }
}
