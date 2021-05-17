package tailspin.types;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Unit {
  private static final Pattern POWER = Pattern.compile("\\A(\\D+)(\\d*)");
  private Unit() {}

  public static String validate(String unit) {
    if (unit == null) return null;
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
    return unit;
  }

  private static Stream<String> powers(String product) {
    return Arrays.stream(product.split(" ")).map(power -> {
      Matcher matcher = POWER.matcher(power);
      if (!matcher.matches())
        throw new IllegalArgumentException("Cannot understand measure " + power);
      return matcher.group(1);
    });
  }
}
