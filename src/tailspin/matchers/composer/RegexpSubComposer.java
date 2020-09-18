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
  public Memo nibble(String s, Memo memo) {
    latestValue = null;
    Matcher matcher = pattern.matcher(s);
    matcher.useTransparentBounds(true).useAnchoringBounds(false).region(memo.pos, s.length());
    if (matcher.lookingAt()) {
      latestValue = matcher.group();
      return new Memo(matcher.end(), memo);
    }
    return memo;
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
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
