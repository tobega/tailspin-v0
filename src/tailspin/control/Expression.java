package tailspin.control;

import tailspin.interpreter.Scope;

public interface Expression {
  /**
   * Returns null if there are no results, a ResultIterator if there are more than one result,
   * else the single result.
   */
  Object getResults(Object it, Scope blockScope);
}
