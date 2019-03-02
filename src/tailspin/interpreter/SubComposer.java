package tailspin.interpreter;

public interface SubComposer {

  String accept(String s);

  boolean hasNewValue();

  Object getValue();
}
