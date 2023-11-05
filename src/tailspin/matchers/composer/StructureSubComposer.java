package tailspin.matchers.composer;

import tailspin.control.ResultIterator;
import tailspin.types.Structure;

class StructureSubComposer implements SubComposer {
  private final SequenceSubComposer keyValues;

  StructureSubComposer(SequenceSubComposer keyValues) {
    this.keyValues = keyValues;
  }

  @Override
  public Memo nibble(String s, Memo memo) {
    return keyValues.nibble(s, memo);
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    return keyValues.backtrack(s, memo);
  }

  @Override
  public Structure getValues() {
    return Structure.value(ResultIterator.wrap(ResultIterator.resolveSideEffects(keyValues.getValues())));
  }

  @Override
  public boolean isSatisfied() {
    return  keyValues.isSatisfied();
  }
}
