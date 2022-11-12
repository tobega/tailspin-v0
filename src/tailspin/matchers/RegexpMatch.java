package tailspin.matchers;

import java.util.regex.Pattern;
import tailspin.TypeError;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.DataDictionary;
import tailspin.types.Membrane;
import tailspin.types.TaggedIdentifier;

public class RegexpMatch implements Membrane {

  public static final Membrane stringType = new Membrane() {
    @Override
    public Object permeate(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
      Object baseValue = toMatch;
      if (baseValue instanceof TaggedIdentifier t) baseValue = t.getValue();
      return (baseValue instanceof String) ? toMatch : null;
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
  public Object permeate(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
    String pattern = (String) patternValue.getResults(it, scope);
    if (typeBound == null) {
      typeBound = TypeBound.of(tag == null ? DataDictionary.getDefaultTypeCriterion(null, "", scope.getLocalDictionary())
          : scope.getLocalDictionary().getDataDefinition(tag));
    }
    if (typeBound != null && typeBound.outOfBound(toMatch, it, scope)) {
      throw new TypeError("Value " + DataDictionary.formatErrorValue(toMatch) + " not matching expected type bound " + typeBound + " in " + this);
    }

    String stringToMatch;
    if (toMatch instanceof TaggedIdentifier t) {
      if (t.getTag().equals(tag) && t.getValue() instanceof String s) stringToMatch = s;
      else if (t.getTag().equals(typeBound.contextTag()) && t.getValue() instanceof String s) stringToMatch = s;
      else return null;
    } else if (toMatch instanceof String s) {
      if (tag != null) return null;
      stringToMatch = s;
    } else return null;
    Pattern compiled =
        Pattern.compile(
            "\\A" + pattern + "\\z", Pattern.UNICODE_CHARACTER_CLASS + Pattern.CANON_EQ + Pattern.DOTALL);
    return compiled.matcher(stringToMatch).matches() ? toMatch : null;
  }

  @Override
  public String toString() {
    return (tag == null ? "" : (tag + "´")) + "'" + patternValue + "'";
  }
}
