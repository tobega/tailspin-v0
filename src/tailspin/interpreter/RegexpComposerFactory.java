package tailspin.interpreter;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexpComposerFactory implements SubComposerFactory {
  private final Pattern pattern;
  private final Function<String, Object> valueCreator;

  RegexpComposerFactory(String pattern, Function<String, Object> valueCreator) {
    this.pattern = Pattern.compile(pattern);
    this.valueCreator = valueCreator;
  }

  @Override
  public SubComposer newSubComposer() {
    return new RegexpComposer();
  }

  private class RegexpComposer implements SubComposer {
    String latestValue;
    boolean ready = true;

    @Override
    public String accept(String s) {
      if (!ready) {
        return s;
      }
      Matcher matcher = pattern.matcher(s);
      if (matcher.lookingAt()) {
        latestValue = matcher.group();
        ready = false;
      }
      return s.substring(matcher.end());
    }

    @Override
    public boolean hasNewValue() {
      return latestValue != null;
    }

    @Override
    public Object getValue() {
      Object result = valueCreator.apply(latestValue);
      latestValue = null;
      return result;
    }
  }
}
