package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

class Composer implements Transform {
  private static final HashMap<String, SubComposerFactory> namedComposers = new HashMap<>();
  static {
    namedComposers.put("INT", new RegexpComposerFactory("[+-]?[1-9][0-9]*", Integer::valueOf));
  }
  private final String namedPattern;

  Composer(String namedPattern) {
    this.namedPattern = namedPattern;
  }

  @Override
  public Queue<Object> run(Scope scope) {
    ArrayDeque<Object> result = new ArrayDeque<>();
    Queue<Object> it = scope.getIt();
    String s = (String) scope.getIt().peek();
    SubComposer subComposer = namedComposers.get(namedPattern).newSubComposer();
    for (s = subComposer.accept(s); subComposer.hasNewValue(); s = subComposer.accept(s)) {
      result.add(subComposer.getValue());
    }
    return result;
  }
}
