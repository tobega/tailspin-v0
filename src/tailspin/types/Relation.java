package tailspin.types;

import java.util.HashSet;
import java.util.Set;

public class Relation {
  Set<Structure> contents;
  Set<String> keys;

  public Relation(Iterable<Structure> lines) {
    contents = new HashSet<>();
    for (Structure structure : lines) {
      if (keys == null) {
        keys = structure.keySet();
      } else if (!keys.equals(structure.keySet())) {
        throw new IllegalArgumentException("Relation member " + structure + " does not match " + keys);
      }
      contents.add(structure);
    }
  }

  @Override
  public String toString() {
    return "{" + contents.toString() + "}";
  }
}
