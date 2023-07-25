package tailspin.literals;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.matchers.DefinedSymbolSet;

public class SymbolicValue implements Value {
    private final String enumeration;
    private final String value;

    public SymbolicValue(String enumeration, String value) {
        this.enumeration = enumeration;
        this.value = value;
    }

    @Override
    public Object getResults(Object it, Scope scope) {
        if (scope.getLocalDictionary().getDataDefinition(enumeration) instanceof DefinedSymbolSet e) {
            return e.getValue(value);
        }
        throw new IllegalArgumentException("There is no enumeration defined for " + enumeration);
    }
}
