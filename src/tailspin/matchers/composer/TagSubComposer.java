package tailspin.matchers.composer;

import tailspin.types.TaggedIdentifier;

public class TagSubComposer implements SubComposer {

  private final String tag;
  private final SubComposer value;

  public TagSubComposer(String tag, SubComposer value) {
    this.tag = tag;
    this.value = value;
  }

  @Override
  public Memo nibble(String s, Memo memo) {
    return value.nibble(s, memo);
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    return value.backtrack(s, memo);
  }

  @Override
  public Object getValues() {
    return new TaggedIdentifier(tag, value.getValues());
  }

  @Override
  public boolean isSatisfied() {
    return value.isSatisfied();
  }
}
