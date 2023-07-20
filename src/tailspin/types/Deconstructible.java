package tailspin.types;

public interface Deconstructible {
    /**
     * Returns a single object or a ResultIterator (or null for no values)
     */
    Object deconstruct();
}
