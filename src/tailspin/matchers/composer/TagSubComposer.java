package tailspin.matchers.composer;

import tailspin.interpreter.Scope;
import tailspin.types.TaggedIdentifier;

public class TagSubComposer implements SubComposer {

  private final Scope scope;
  private final String tag;
  private final SubComposer subComposer;

  private TaggedIdentifier value;

  public TagSubComposer(Scope scope, String tag, SubComposer subComposer) {
    this.scope = scope;
    this.tag = tag;
    this.subComposer = subComposer;
  }

  @Override
  public Memo nibble(String s, Memo memo) {
    value = null;
    Memo original = memo;
    memo = subComposer.nibble(s, memo);
    trySetValue();
    return value == null ? original : memo;
  }

  private void trySetValue() {
    if (subComposer.isSatisfied()) {
      Object parsed = subComposer.getValues();
      if (!(parsed instanceof Long) && !(parsed instanceof String)) {
        throw new IllegalStateException("Cannot assign tag " + tag + " to value " + parsed.toString());
      }
      parsed = scope.getLocalDictionary().checkDataDefinition(tag, parsed, scope);
      if (parsed instanceof TaggedIdentifier t && tag.equals(t.getTag())) {
        value = t;
      }
    }
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    value = null;
    while (value == null) {
      memo = subComposer.backtrack(s, memo);
      if (!subComposer.isSatisfied()) return memo;
      trySetValue();
    }
    return memo;
  }

  @Override
  public Object getValues() {
    return value;
  }

  @Override
  public boolean isSatisfied() {
    return value != null;
  }
}
