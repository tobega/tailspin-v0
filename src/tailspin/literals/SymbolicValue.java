package tailspin.literals;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.matchers.DefinedSymbolSet;

public class SymbolicValue implements Value {
    private final String symbolSet;
    private final String value;

    public SymbolicValue(String symbolSet, String value) {
        this.symbolSet = symbolSet;
        this.value = value;
    }

    @Override
    public Object getResults(Object it, Scope scope) {
        if (scope.getLocalDictionary().getDataDefinition(symbolSet) instanceof DefinedSymbolSet e) {
            return e.getValue(value);
        }
        throw new IllegalArgumentException("There is no symbol set defined for " + symbolSet);
    }
}
