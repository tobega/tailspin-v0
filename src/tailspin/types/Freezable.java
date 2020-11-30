package tailspin.types;

public interface Freezable<T extends Freezable<T>> {
  void freeze();
  T thawedCopy();
  boolean isThawed();
}
