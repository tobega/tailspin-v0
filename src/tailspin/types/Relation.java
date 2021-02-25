package tailspin.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.literals.KeyValueExpression;

public class Relation implements Processor {
  private final Set<Structure> contents;
  private final Set<String> keys;

  public Relation(Iterable<Structure> lines) {
    contents = new HashSet<>();
    Set<String> keys = null;
    for (Structure structure : lines) {
      if (keys == null) {
        keys = structure.keySet();
      } else if (!keys.equals(structure.keySet())) {
        throw new IllegalArgumentException("Relation member " + structure + " does not match " + keys);
      }
      contents.add(structure);
    }
    this.keys = keys == null ? Set.of() : keys;
  }

  private Relation(Set<String> keys, Set<Structure> contents) {
    this.keys = keys;
    this.contents = contents;
  }

  @Override
  public String toString() {
    return "{|" + contents.stream().map(Objects::toString).collect(Collectors.joining(", ")) + "|}";
  }

  public Relation union(Relation other) {
    // Under some conditions we cannot calculate header for empty relations
    if (other.keys.isEmpty() && other.contents.isEmpty()) return this;
    if (keys.isEmpty() && contents.isEmpty()) return other;
    if (!keys.equals(other.keys)) throw new IllegalArgumentException("Can't union " + keys + " with " + other.keys);
    return new Relation(keys, Stream.concat(contents.stream(), other.contents.stream()).collect(
        Collectors.toSet()));
  }

  public Relation join(Relation other) {
    Set<String> newKeys = new HashSet<>(keys);
    newKeys.addAll(other.keys);
    Set<String> commonKeys = new HashSet<>(keys);
    commonKeys.retainAll(other.keys);
    return new Relation(newKeys, contents.stream()
        .flatMap(left -> other.contents.stream()
            .filter(right -> commonKeys.stream().allMatch(key -> left.get(key).equals(right.get(key))))
            .map(right -> Structure.value(
                ResultIterator.wrap(ResultIterator.appendResultValue(left.deconstruct(), right.deconstruct()))))
        ).collect(Collectors.toSet()));
  }

  public Relation project(List<KeyValueExpression> projections, Object it, Scope scope) {
    Set<String> newKeys = projections.stream().map(KeyValueExpression::getKey).collect(Collectors.toSet());
    Set<Structure> tuples = contents.stream().map(tuple -> tuple.project(projections, it, scope))
        .collect(Collectors.toSet());
    return new Relation(newKeys, tuples);
  }

  public Object deconstruct() {
    if (contents.isEmpty()) {
      return null;
    }
    Iterator<Structure> iterator = contents.iterator();
    return (ResultIterator.Flat) () -> {
      if (!iterator.hasNext()) return null;
      return iterator.next();
    };
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    if (message.equals("count")) return (it, params) -> (long) contents.size();
    if (message.equals("list")) return (it, params) -> TailspinArray.value(new ArrayList<>(contents));
    throw new UnsupportedOperationException("Unknown relation message " + message);
  }
}
