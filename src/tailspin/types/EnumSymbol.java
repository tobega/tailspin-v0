package tailspin.types;

public record EnumSymbol(String enumeration, String value, int ordinal) {
    @Override
    public String toString() {
        return enumeration + "#" + value;
    }
}
