package tailspin.types;

public record Symbol(String set, String value) {
    @Override
    public String toString() {
        return value;
    }
}
