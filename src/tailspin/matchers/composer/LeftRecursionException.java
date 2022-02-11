package tailspin.matchers.composer;

/**
 * Handling left recursion is a complicated interplay.
 * Left recursion can only happen on a user-defined rule. These are RuleSubComposers and have names.
 * The only thing that can solve a left recursion is a choice.
 *
 * <p>First we make a note of all the user-defined rules we pass through without consuming any input.
 * When we try to call the same rule again, throw a LeftRecursionException to be caught by a choice.
 * If that choice lies between the first and second call to the recursed rule, we can handle it, otherwise it is a fatal error.</p>
 *
 * <p>To handle, make a different choice and note the recursion option in the result.
 * This must be propagated up to the recursed rule, which will add its result to the memo and push down again.
 * Then when the left recursion is hit, return the left recursed result.</p>
 */
public class LeftRecursionException extends RuntimeException {

  public LeftRecursionException(String recursedRule) {
    super(recursedRule);
  }

  public String getRecursedRuleName() {
    return getMessage();
  }
}
