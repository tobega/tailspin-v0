package tailspin.matchers;

import tailspin.TypeError;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.DataDictionary;
import tailspin.types.Membrane;
import tailspin.types.TaggedIdentifier;

import java.util.regex.Pattern;

public class RegexpMatch implements Membrane {

  public static final Membrane stringType = new Membrane() {
    @Override
    public boolean matches(Object toMatch, Object it, Scope scope, Membrane typeBound) {
      Object baseValue = toMatch;
      if (baseValue instanceof TaggedIdentifier t) baseValue = t.getValue();
      return (baseValue instanceof String);
    }

    @Override
    public String toString() {
      return "string type";
    }
  };

  private final String tag;
  private final Value patternValue;

  public RegexpMatch(String tag, Value patternValue) {
    this.tag = tag;
    this.patternValue = patternValue;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope, Membrane typeBound) {
    String pattern = (String) patternValue.getResults(it, scope);
//TODO    if (typeBound != null) {
//      toMatch = typeBound.inContext(toMatch);
//    }
    if (typeBound == null) {
      typeBound = tag == null ? DataDictionary.getDefaultTypeCriterion("", scope.getLocalDictionary())
          : scope.getLocalDictionary().getDataDefinition(tag);
    }
    if (typeBound != null && !typeBound.matches(toMatch, it, scope, Membrane.ALWAYS_TRUE)) {
      throw new TypeError("Value " + DataDictionary.formatErrorValue(toMatch) + " not matching expected type bound " + typeBound + " in " + this);
    }

    String stringToMatch;
    if (toMatch instanceof TaggedIdentifier t) {
      if (t.getTag().equals(tag) && t.getValue() instanceof String s) stringToMatch = s;
      else if (typeBound != null && t.equals(typeBound.inContext(t.getValue())) && t.getValue() instanceof String s) stringToMatch = s;
      else return false;
    } else if (toMatch instanceof String s) {
      if (tag != null) return false;
      stringToMatch = s;
    } else return false;
    Pattern compiled =
        Pattern.compile(
            "\\A" + pattern + "\\z", Pattern.UNICODE_CHARACTER_CLASS + Pattern.CANON_EQ + Pattern.DOTALL);
    return compiled.matcher(stringToMatch).matches();
  }

  @Override
  public String toString() {
    return (tag == null ? "" : (tag + "´")) + "'" + patternValue + "'";
  }
}
