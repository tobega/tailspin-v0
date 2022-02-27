package tailspin.matchers.composer;

public class PoppedLeftRecursionException extends RuntimeException {
  private final Memo memo;

  public PoppedLeftRecursionException(Memo memo) {
    this.memo = memo;
  }

  public Memo getMemo() {
    return memo;
  }
}
