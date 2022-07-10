package tailspin.types;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Unit {
  /** This is a bit dangerous, but needed to allow coercion of an "unknown" expression to a measure */
  public static final Unit UNKNOWN = new Unit("");

  public static final Unit SCALAR = new Unit("1");

  private static final Pattern POWER = Pattern.compile("\\A(\\D+)(\\d*)");

  private final String unit;

  private Unit(String unit) {
    this.unit = unit;
  }

  public static Unit validate(String unit) {
    if (unit == null) return null;
    if (unit.equals("1")) return SCALAR;
    String[] division = unit.split("/");
    Set<String> measures = new HashSet<>();
    Stream.concat(
            powers(division[0]),
            division.length == 1
                ? Stream.empty()
                : powers(division[1]))
        .forEach(
            m -> {
              if (!measures.add(m))
                throw new IllegalArgumentException("Same measure given twice in " + unit);
            });
    return new Unit(unit);
  }

  private static Stream<String> powers(String product) {
    return Arrays.stream(product.split(" ")).map(power -> {
      Matcher matcher = POWER.matcher(power);
      if (!matcher.matches())
        throw new IllegalArgumentException("Cannot understand measure " + power);
      return matcher.group(1);
    });
  }

  @Override
  public String toString() {
    return "\"" + unit + "\"";
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(unit);
  }

  @Override
  public boolean equals(Object obj) {
    return (obj instanceof Unit u) && Objects.equals(unit, u.unit);
  }
}
