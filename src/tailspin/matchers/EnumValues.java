package tailspin.matchers;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.EnumSymbol;
import tailspin.types.Membrane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnumValues implements Membrane {
    private final String enumName;
    private final List<Map.Entry<String, Value>> values;
    private final Membrane type;

    public EnumValues(String enumName, List<Map.Entry<String, Value>> values, Membrane type) {
        this.enumName = enumName;
        this.values = values;
        this.type = type;
    }

    public Membrane defineValues(Object it, Scope blockScope) {
        Map<String, EnumSymbol> symbols = new HashMap<>();
        List<Object> result = new ArrayList<>();
        for (int i = 0; i < values.size(); i ++) {
            Map.Entry<String, Value> e = values.get(i);
            symbols.put(e.getKey(), new EnumSymbol(enumName, e.getKey(), i));
            Value value = e.getValue();
            result.add(value == null ? null : value.getResults(it, blockScope));
        }
        return new DefinedEnumeration(enumName, type, symbols, result, blockScope);
    }

    @Override
    public boolean matches(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
        throw new AssertionError();
    }
}
