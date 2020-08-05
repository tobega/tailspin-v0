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
    latestValue = null;
    Matcher matcher = pattern.matcher(memo.s);
    if (matcher.lookingAt()) {
      latestValue = matcher.group();
      return new Memo(memo.s.substring(matcher.end()), null, memo);
    }
    return memo;
  }

  @Override
  public Memo backtrack(Memo memo) {
    latestValue = null;
    return memo.previous;
  }

  @Override
  public Object getValues() {
    return valueCreator.apply(latestValue);
  }

  @Override
  public boolean isSatisfied() {
    return latestValue != null;
  }
}
