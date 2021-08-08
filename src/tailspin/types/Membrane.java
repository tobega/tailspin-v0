package tailspin.types;

/**
 * Returns acceptable candidates, possibly transformed, or null if candidate is not acceptable.
 */
public interface Membrane {
  Object permeate(Object candidate);
}
