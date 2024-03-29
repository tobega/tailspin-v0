package tailspin.types;

import tailspin.control.Reference;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.literals.KeyValueExpression;
import tailspin.literals.StringInterpolation;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Structure implements Freezable<Structure>, Deconstructible {

  private final Map<String, Object> map;
  private boolean isMutable;

  private Structure(Map<String, Object> map, boolean isMutable) {
    if (isMutable && !(map instanceof TreeMap)) throw new AssertionError();
    this.map = map;
    this.isMutable = isMutable;
  }

  public static Structure value(List<KeyValue> fields) {
    return new Structure(fields.stream().collect(Collectors.toMap(KeyValue::getKey, KeyValue::getValue)),
        false);
  }

  public static Structure value(ResultIterator.Flat resultIterator) {
    Map<String, Object> fields = new TreeMap<>();
    ResultIterator.forEach(resultIterator, o -> {
      KeyValue kv = (KeyValue) o;
      fields.put(kv.getKey(), kv.getValue());
    });
    return new Structure(fields, false);
  }

  public Structure project(List<KeyValueExpression> expansions, Object it, Scope scope) {
    return Structure.value(expansions.stream()
        .map(e -> e.getResults(Reference.pairedReflexive(it, this), scope))
        .toList());
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
    if (!(obj instanceof Structure s)) return false;
    return map.equals(s.map);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append('{');
    Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
    if (it.hasNext()) {
      Entry<String, Object> next = it.next();
      builder.append(next.getKey()).append(": ");
      StringInterpolation.appendStringValue(builder, next.getValue());
    }
    while (it.hasNext()) {
      Entry<String, Object> next = it.next();
      builder.append(", ").append(next.getKey()).append(": ");
      StringInterpolation.appendStringValue(builder, next.getValue());
    }
    builder.append('}');
    return builder.toString();
  }

  public boolean containsKey(String key) {
    return map.containsKey(key);
  }

  public boolean contains(Structure s) {
    for (Map.Entry<String, Object> entry : s.map.entrySet()) {
      if (!Objects.deepEquals(entry.getValue(), map.get(entry.getKey()))) return false;
    }
    return true;
  }

  public Set<String> keySet() {
    return map.keySet();
  }

  @Override
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
