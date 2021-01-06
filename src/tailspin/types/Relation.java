package tailspin.types;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import tailspin.control.ResultIterator;

public class Relation {
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
    this.keys = keys;
  }

  private Relation(Set<String> keys, Set<Structure> contents) {
    this.keys = keys;
    this.contents = contents;
  }

  @Override
  public String toString() {
    return "{" + contents.toString() + "}";
  }

  public Relation union(Relation other) {
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

  public Relation project(Set<String> ontoKeys) {
    if (!keys.containsAll(ontoKeys)) throw new IllegalArgumentException("Cannot project onto unknown keys " + ontoKeys);
    return new Relation(ontoKeys, contents.stream().map(s -> {
      Structure projected = s.thawedCopy();
      for (String key : s.keySet()) {
        if (!ontoKeys.contains(key)) projected.remove(key);
      }
      projected.freeze();
      return projected;
    }).collect(Collectors.toSet()));
  }
}
