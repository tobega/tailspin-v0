package tailspin.interpreter;

import java.util.Queue;

public interface SubComposer {

  String nibble(String s);

  Queue<Object> getValues();
}
