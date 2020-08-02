package tailspin.matchers.composer;

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
  public Memo nibble(Memo memo) {
    Matcher matcher = pattern.matcher(memo.s);
    if (matcher.lookingAt()) {
      latestValue = matcher.group();
      return new Memo(memo.s.substring(matcher.end()), null, memo);
    }
    return memo;
  }

  @Override
  public Object getValues() {
    Object result = valueCreator.apply(latestValue);
    latestValue = null;
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return latestValue != null;
  }
}
