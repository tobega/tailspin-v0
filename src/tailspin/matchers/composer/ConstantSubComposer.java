package tailspin.matchers.composer;

class ConstantSubComposer implements SubComposer {
  private final String value;

  ConstantSubComposer(String value) {
    this.value = value;
  }

  @Override
  public String nibble(String s) {
    return s;
  }

  @Override
  public Object getValues() {
    return value;
  }

  @Override
  public boolean isSatisfied() {
    return true;
  }
}
