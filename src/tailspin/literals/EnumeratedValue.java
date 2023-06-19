package tailspin.literals;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.matchers.DefinedEnumeration;

public class EnumeratedValue implements Value {
    private final String enumeration;
    private final String value;

    public EnumeratedValue(String enumeration, String value) {
        this.enumeration = enumeration;
        this.value = value;
    }

    @Override
    public Object getResults(Object it, Scope scope) {
        if (scope.getLocalDictionary().getDataDefinition(enumeration) instanceof DefinedEnumeration e) {
            return e.getValue(value);
        }
        throw new IllegalArgumentException("There is no enumeration defined for " + enumeration);
    }
}
