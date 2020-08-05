package tailspin.matchers.composer;

public interface SubComposer {

  Memo nibble(Memo s);

  Memo backtrack(Memo memo);

  Object getValues();

  boolean isSatisfied();
}
