package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexpSubComposer implements SubComposer {
  private final Pattern pattern;
  private final Function<? super String, Object> valueCreator;
  private String latestValue;

  RegexpSubComposer(Pattern pattern, Function<? super String, Object> valueCreator) {
    this.pattern = pattern;
    this.valueCreator = valueCreator;
  }

  @Override
  public String nibble(String s) {
    Matcher matcher = pattern.matcher(s);
    if (matcher.lookingAt()) {
      latestValue = matcher.group();
      return s.substring(matcher.end());
    }
    return s;
  }

  @Override
  public Queue<Object> getValues() {
    Queue<Object> result = new ArrayDeque<>();
    result.add(valueCreator.apply(latestValue));
    latestValue = null;
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return latestValue != null;
  }
}
