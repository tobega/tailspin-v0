package tailspin.matchers.composer;

import tailspin.types.DataDictionary;
import tailspin.types.TaggedIdentifier;

public class TagSubComposer implements SubComposer {

  private final DataDictionary localDictionary;
  private final String tag;
  private final SubComposer subComposer;

  private TaggedIdentifier value;

  public TagSubComposer(DataDictionary localDictionary, String tag, SubComposer subComposer) {
    this.localDictionary = localDictionary;
    this.tag = tag;
    this.subComposer = subComposer;
  }

  @Override
  public Memo nibble(String s, Memo memo) {
    return subComposer.nibble(s, memo);
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    value = null;
    return subComposer.backtrack(s, memo);
  }

  @Override
  public Object getValues() {
    return value;
  }

  @Override
  public boolean isSatisfied() {
    if (value != null) return true;
    if (!subComposer.isSatisfied()) return false;
    try {
      Object parsed = subComposer.getValues();
      if (!(parsed instanceof Long) && !(parsed instanceof String)) {
        throw new IllegalStateException("Cannot assign tag " + tag + " to value " + parsed.toString());
      }
      parsed = localDictionary.checkDataDefinition(tag, parsed);
      if (parsed instanceof TaggedIdentifier t && tag.equals(t.getTag())) {
        value = t;
        return true;
      }
      return false;
    } catch (IllegalArgumentException e) {
      return false;
    }
  }
}
