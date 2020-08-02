package tailspin.matchers.composer;

public interface SubComposer {

  Memo nibble(Memo s);

  Object getValues();

  boolean isSatisfied();
}
