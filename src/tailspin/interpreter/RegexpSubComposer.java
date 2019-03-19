package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexpSubComposer implements SubComposer {
  private final Pattern pattern;
  private final Function<? super String, Object> valueCreator;
  private final boolean invert;
  String latestValue;

  RegexpSubComposer(Pattern pattern, Function<? super String, Object> valueCreator, boolean invert) {
    this.pattern = pattern;
    this.valueCreator = valueCreator;
    this.invert = invert;
  }

  @Override
  public String nibble(String s) {
    Matcher matcher = pattern.matcher(s);
    if (invert) {
      if (matcher.find()) {
        latestValue = s.substring(0, matcher.start());
        s = s.substring(matcher.start());
      } else {
        latestValue = s;
        s = "";
      }
    } else if (matcher.lookingAt()) {
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
