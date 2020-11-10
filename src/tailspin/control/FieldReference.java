package tailspin.control;

import java.util.Map;
import tailspin.interpreter.Scope;

class FieldReference extends Reference {

  private final Reference parent;
  private final String fieldIdentifier;

  FieldReference(Reference parent, String fieldIdentifier) {
    this.parent = parent;
    this.fieldIdentifier = fieldIdentifier;
  }

  @Override
  public Object getValue(Object it, Scope scope) {
    try {
      @SuppressWarnings("unchecked")
      Map<String, Object> structure = (Map<String, Object>) parent.getValue(it, scope);
      if (structure == null) {
        throw new IllegalStateException("Unknown structure " + parent);
      }
      return structure.get(fieldIdentifier);
    } catch (ClassCastException e) {
      throw new IllegalStateException(
          parent.toString() + " is not a structure. Tried to get " + fieldIdentifier, e);
    } catch (Exception e) {
      throw new IllegalStateException("Error trying to get field " + fieldIdentifier, e);
    }
  }

  @Override
  public Object deleteValue(Object it, Scope scope) {
    if (!isMutable()) {
      throw new UnsupportedOperationException("Not deletable");
    }
    @SuppressWarnings("unchecked")
    Map<String, Object> structure = (Map<String, Object>) parent.getValue(it, scope);
    if (structure == null) {
      throw new IllegalStateException("Unknown structure " + parent);
    }
    return structure.remove(fieldIdentifier);
  }

  @Override
  public boolean isMutable() {
    return parent.isMutable();
  }

  @Override
  public void setValue(boolean merge, Object value, Object it, Scope scope) {
    if (!isMutable()) {
      throw new UnsupportedOperationException("Not mutable");
    }
    if (merge) {
      collect(value, getValue(it, scope));
    } else {
      @SuppressWarnings("unchecked")
      Map<String, Object> structure = (Map<String, Object>) parent.getValue(it, scope);
      if (structure == null) {
        throw new IllegalStateException("Unknown structure " + parent);
      }
      structure.put(fieldIdentifier, Reference.copy(value));
    }
  }

  @Override
  public String toString() {
    return parent.toString() + "." + fieldIdentifier;
  }
}
