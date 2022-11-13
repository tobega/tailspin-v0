package tailspin.matchers;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import tailspin.TypeError;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.DataDictionary;
import tailspin.types.Measure;
import tailspin.types.Membrane;
import tailspin.types.TaggedIdentifier;
import tailspin.types.TailspinArray;
import tailspin.types.Unit;

public class ArrayMatch implements Membrane {
  private static final Membrane arrayType = (Object toMatch, Object it, Scope scope, TypeBound bound) -> toMatch instanceof TailspinArray;
  private final Object offset;
  // @Nullable
  private final Membrane lengthMembrane;
  private final List<CollectionCriterionFactory> contentMatcherFactories;
  private final boolean nothingElseAllowed;

  public ArrayMatch(Object offset, Membrane lengthMembrane,
      List<CollectionCriterionFactory> contentMatcherFactories, boolean nothingElseAllowed) {
    this.offset = offset;
    this.lengthMembrane = lengthMembrane;
    this.contentMatcherFactories = contentMatcherFactories;
    this.nothingElseAllowed = nothingElseAllowed;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
    if (typeBound == null) {
      if (offset == null && lengthMembrane == null && contentMatcherFactories.isEmpty()) {
        typeBound = TypeBound.any();
      } else {
        typeBound = TypeBound.of(arrayType);
      }
    }
    if (typeBound.outOfBound(toMatch, it, scope)) {
      throw new TypeError("Cannot compare " + DataDictionary.formatErrorValue(toMatch) + " as an array in " + this);
    }
    if (!(toMatch instanceof TailspinArray listToMatch)) return false;
    if (offset != null) {
      if (listToMatch.getOffset() == null) return false;
      if (offset instanceof Value v && !Objects.equals(v.getResults(it, scope), listToMatch.getOffset())) return false;
      if (offset instanceof Unit u && (!(listToMatch.getOffset() instanceof Measure m) || !m.getUnit().equals(u))) return false;
      if (offset instanceof String s && (!(listToMatch.getOffset() instanceof TaggedIdentifier t) || !t.getTag().equals(s))) return false;
    }
    if (lengthMembrane != null
        && (!lengthMembrane.matches((long) listToMatch.length(), it, scope, null))) {
      return false;
    }
    if (contentMatcherFactories.isEmpty()) {
      return true;
    }
    List<CollectionCriterion> criteria = contentMatcherFactories.stream()
        .map(CollectionCriterionFactory::newCriterion).toList();
    TailspinArray.Tail tail = listToMatch.tailFromNative(0);
    nextElement:
    while(!tail.isEmpty()) {
      for (CollectionCriterion c : criteria) {
        int chop = c.isMetAt(tail, it, scope);
        if (chop != 0) {
          tail = tail.tailFromNative(chop);
          continue nextElement;
        }
      }
      if (nothingElseAllowed) {
        return false;
      }
      tail = tail.tailFromNative(1);
    }
    return criteria.stream().allMatch(c -> c.isSatisfied(it, scope));
  }

  @Override
  public String toString() {
    return (offset == null ? "" : offset + ":") + "[" + contentMatcherFactories.stream().map(Object::toString).collect(Collectors.joining(",")) + (nothingElseAllowed ? "VOID" : "") + "]"
        + (lengthMembrane != null ? "(" + lengthMembrane + ")" : "");
  }
}
