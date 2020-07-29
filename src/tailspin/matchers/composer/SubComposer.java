package tailspin.matchers.composer;

public interface SubComposer {

  String nibble(String s);

  Object getValues();

  boolean isSatisfied();
}
