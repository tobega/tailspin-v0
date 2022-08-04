package tailspin.matchers;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;
import tailspin.types.Membrane;
import tailspin.types.TaggedIdentifier;
import tailspin.types.TailspinArray;
import tailspin.types.Unit;

public class ArrayMatch implements Membrane {

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
  public Object permeate(Object toMatch, Object it, Scope scope, String contextTag) {
    if (!(toMatch instanceof TailspinArray listToMatch)) return null;
    if (offset != null) {
      if (listToMatch.getOffset() == null) return null;
      if (offset instanceof Value v && !Objects.equals(v.getResults(it, scope), listToMatch.getOffset())) return null;
      if (offset instanceof Unit u && (!(listToMatch.getOffset() instanceof Measure m) || !m.getUnit().equals(u))) return null;
      if (offset instanceof String s && (!(listToMatch.getOffset() instanceof TaggedIdentifier t) || !t.getTag().equals(s))) return null;
    }
    if (lengthMembrane != null && (null == lengthMembrane.permeate((long) listToMatch.length(), it, scope,
        contextTag))) {
      return null;
    }
    if (contentMatcherFactories.isEmpty()) {
      return toMatch;
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
        return null;
      }
      tail = tail.tailFromNative(1);
    }
    return criteria.stream().allMatch(c -> c.isSatisfied(it, scope)) ? toMatch : null;
  }

  @Override
  public String toString() {
    return (offset == null ? "" : offset + ":") + "[" + contentMatcherFactories.stream().map(Object::toString).collect(Collectors.joining(",")) + (nothingElseAllowed ? "VOID" : "") + "]"
        + (lengthMembrane != null ? "(" + lengthMembrane + ")" : "");
  }
}
