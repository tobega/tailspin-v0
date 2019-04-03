package tailspin.interpreter;

import java.util.Queue;

public interface SubComposer<T> {

  String nibble(String s);

  Queue<T> getValues();

  boolean isSatisfied();
}
