package tailspin.interpreter;

public class JavaObject {

  private final Object o;

  public JavaObject(Object o) {
    this.o = o;
  }

  public Object getRealObject() {
    return o;
  }

  @Override
  public String toString() {
    return o.toString();
  }
}
