package tailspin.matchers.composer;

public class InvertSubComposer implements SubComposer {
  private final SubComposer subComposer;
  private StringBuilder result;

  public InvertSubComposer(SubComposer subComposer) {
    this.subComposer = subComposer;
  }

  @Override
  public String nibble(String s) {
    result = new StringBuilder();
    for (subComposer.nibble(s); !s.isEmpty() && !subComposer.isSatisfied(); subComposer.nibble(s)) {
      result.append(s.charAt(0));
      s = s.substring(1);
    }
    return s;
  }

  @Override
  public String getValues() {
    if (subComposer.isSatisfied()) {
      subComposer.getValues(); // flush
    }
    String value = result.toString();
    result = null;
    return value;
  }

  @Override
  public boolean isSatisfied() {
    return result != null && result.length() > 0;
  }
}
