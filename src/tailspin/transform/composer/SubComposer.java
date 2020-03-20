package tailspin.transform.composer;

import java.util.Queue;

public interface SubComposer {

  String nibble(String s);

  Queue<Object> getValues();

  boolean isSatisfied();
}
