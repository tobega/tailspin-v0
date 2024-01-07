package tailspin.types;

import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.literals.KeyValueExpression;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Relation implements Processor, Deconstructible {
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

  public Relation matching(Relation other) {
    Set<String> commonKeys = new HashSet<>(keys);
    commonKeys.retainAll(other.keys);
    return new Relation(keys, contents.stream()
        .filter(left -> other.contents.stream()
            .anyMatch(right -> commonKeys.stream().allMatch(key -> left.get(key).equals(right.get(key))))
        ).collect(Collectors.toSet()));
  }

  public Relation notMatching(Relation other) {
    Set<String> commonKeys = new HashSet<>(keys);
    commonKeys.retainAll(other.keys);
    return new Relation(keys, contents.stream()
        .filter(left -> other.contents.stream()
            .noneMatch(right -> commonKeys.stream().allMatch(key -> left.get(key).equals(right.get(key))))
        ).collect(Collectors.toSet()));
  }

  public Relation project(List<KeyValueExpression> projections, Object it, Scope scope) {
    Set<String> newKeys = projections.stream().map(KeyValueExpression::getKey).collect(Collectors.toSet());
    Set<Structure> tuples = contents.stream().map(tuple -> tuple.project(projections, it, scope))
        .collect(Collectors.toSet());
    return new Relation(newKeys, tuples);
  }

  public ResultIterator.Flat deconstruct() {
    if (contents.isEmpty()) {
      return null;
    }
    Iterator<Structure> iterator = contents.iterator();
    return () -> {
      if (!iterator.hasNext()) return null;
      return iterator.next();
    };
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    if (message.equals("raw")) return (it, params) -> this;
    if (message.equals("count")) return (it, params) -> (long) contents.size();
    throw new UnsupportedOperationException("Unknown relation message " + message);
  }

  public Relation minus(Relation right) {
    // Under some conditions we cannot calculate header for empty relations
    if (right.keys.isEmpty() && right.contents.isEmpty()) return this;
    if (keys.isEmpty() && contents.isEmpty()) return new Relation(right.keys, Set.of());
    if (!keys.equals(right.keys)) throw new IllegalArgumentException("Can't subtract " + right.keys + " from " + keys);
    Set<Structure> result = new HashSet<>(contents);
    result.removeAll(right.contents);
    return new Relation(keys, result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys, contents);
  }

  @Override
  public boolean equals(Object obj) {
    return (obj instanceof Relation r) && Objects.equals(keys, r.keys) && Objects.equals(contents, r.contents);
  }
}
