package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

public class JavaModules {
  @Test
  void callUnaryStaticMethod() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "[-2] -> lang/Math::abs -> $ + 1 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void callBinaryStaticMethod() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "[-2, 5] -> lang/Math::max -> $ + 1 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("6", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void stringParam() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "['255'] -> lang/Long::parseLong -> $ + 1 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("256", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void byteReturnValue() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "['127'] -> lang/Byte::parseByte -> $ + 1 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("128", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void integerArgument() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "['7f', 16] -> lang/Byte::parseByte -> $ + 1 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("128", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void doubleResultCannotBeUsedInArithmetic() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "[30] -> lang/Math::toRadians -> $ + 1 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void doubleResultReusedAsParameter() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "[[90] -> lang/Math::toRadians] -> lang/Math::toDegrees -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("90.0", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void useMostSpecificMethodForDoubles() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "[[[90] -> lang/Math::toRadians, [180] -> lang/Math::toRadians] -> lang/Math::max] -> lang/Math::toDegrees -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("180.0", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void createObject() throws Exception {
    String program = "use 'java:java.util' stand-alone\n"
        + "[] -> util/HashMap -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void callObjectMethod() throws Exception {
    String program = "use 'java:java.util' stand-alone\n"
        + "def map: [] -> util/HashMap; [] -> map::isEmpty -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("true", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void callVoidMethod() throws Exception {
    String program = "use 'java:java.util' stand-alone\n"
        + "def map: [] -> util/HashMap; ['foo', 'bar'] -> !map::put $map -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{foo=bar}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void useZeroParameterMethodsAsSources() throws Exception {
    String program = "use 'java:java.util' stand-alone\n"
        + "def map: $util/HashMap; $map::isEmpty -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("true", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void tailspinConsumer() throws Exception {
    String program = "use 'java:java.util' stand-alone\n"
        + "processor Consumer\n"
        + "  sink accept\n"
        + "    $ * 4 -> '$;,' -> !OUT::write\n"
        + "  end accept\n"
        + "end Consumer\n"
        + "def list: [[1,2,3]] -> util/ArrayList; [$Consumer] -> list::forEach -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("4,8,12,", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void returnObject() throws Exception {
    String program = "use 'java:java.util' stand-alone\n"
        + "def map: ['foo', 1] -> util/Map::of; $map::size -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void javaStringsAreTailspinStrings() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "[314] -> lang/Long::toString -> [$...] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[3, 1, 4]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void tailspinConsumerGetsTailspinStrings() throws Exception {
    String program = "use 'java:java.util' stand-alone\n"
        + "processor Consumer\n"
        + "  sink accept\n"
        + "    [$...] -> !OUT::write\n"
        + "  end accept\n"
        + "end Consumer\n"
        + "def list: [['abc']] -> util/ArrayList; [$Consumer] -> list::forEach -> !VOID";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[a, b, c]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void tailspinConsumerGetsConvertedInputObjects() throws Exception {
    String program = "use 'java:java.util' stand-alone\n"
        + "processor Consumer\n"
        + "  sink accept\n"
        + "    $::size -> !OUT::write\n"
        + "  end accept\n"
        + "end Consumer\n"
        + "def list: [] -> util/ArrayList; [[] -> util/HashSet] -> list::add -> !VOID [$Consumer] -> list::forEach -> !VOID";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("0", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void javaListsAreTailspinLists() throws Exception {
    String program = "use 'java:java.util' stand-alone\n"
        + "[1,3,5] -> util/List::of -> [$...] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 3, 5]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void javaConstructorGivesJavaList() throws Exception {
    String program = "use 'java:java.util' stand-alone\n"
        + "def list: [[1,3,5]] -> util/ArrayList; [1] -> list::get -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void javaConstructorGivesJavaString() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "def string: ['hello'] -> lang/String; $string::toUpperCase -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("HELLO", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void tailspinListsContainTailspinObjects() throws Exception {
    String program = "use 'java:java.util' stand-alone\n" + "use 'java:java.lang' stand-alone\n"
        + "[['8.5'] -> lang/Double::valueOf] -> util/List::of -> $(1)::isNaN -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("false", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void tailspinMultiParameterFunctionGetsAList() throws Exception {
    String program = "use 'java:java.util.stream' stand-alone\n"
        + "processor BinaryOperator\n"
        + "  templates applyAsLong\n"
        + "    $(1) + $(2)!\n"
        + "  end applyAsLong\n"
        + "end BinaryOperator\n"
        + "def stream: [[3,7,9]] -> stream/LongStream::of;\n"
        + "[$BinaryOperator] -> stream::reduce -> $::getAsLong -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("19", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void javaObjectParameters() throws Exception {
    // The string constructor will wrap the string as a java object, which needs to be properly
    // matched when used as a parameter
    String program = "use 'java:java.lang' stand-alone\n"
        + "def string: ['7b'] -> lang/String; [$string, 16] -> lang/Integer::parseInt -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("123", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void singleArgumentMethodCanBeCalledWithoutWrappingArray() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "-2 -> lang/Math::abs -> $ + 1 -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("3", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void singleArgumentConstructorCanBeCalledWithoutWrappingArray() throws Exception {
    String program = "use 'java:java.lang' stand-alone\n"
        + "'hello' -> lang/String -> $::toUpperCase -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("HELLO", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void javaIterablesCanDeconstruct() throws Exception {
    String program = "use 'java:java.util' stand-alone\n"
        + "[1,3,5] -> util/Set::of -> [$...] -> \\(<[<=1>,<=3>,<=5> VOID]> 'ok'! \\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deconstructedJavaIterablesSupplyTailspinObjects() throws Exception {
    String program = "use 'java:java.util' stand-alone\n"
        + "use 'java:java.lang' stand-alone\n"
        + "['ok' -> lang/StringBuilder, 'bye' -> lang/StringBuilder] -> util/Set::of"
        + "  -> [$... -> $::reverse -> $::toString] -> \\(<[<='ko'>,<='eyb'> VOID]> 'ok'! \\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("ok", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void javaObjectEquality() throws Exception {
    String program = "use 'java:java.math' stand-alone\n"
        + "def five: 5 -> math/BigInteger::valueOf;\n"
        + "5 -> math/BigInteger::valueOf -> \\(<=$five> $!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void javaObjectRangeMatch() throws Exception {
    String program = "use 'java:java.math' stand-alone\n"
        + "def three: 3 -> math/BigInteger::valueOf;\n"
        + "def five: 5 -> math/BigInteger::valueOf;\n"
        + "4 -> math/BigInteger::valueOf -> \\(<$three..$five> $!\\) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("4", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void byteArrayIsTailspinBytes() throws Exception {
    String program = "use 'java:java.math' stand-alone\n"
        + "3147 -> math/BigInteger::valueOf -> $::toByteArray -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("0c4b", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void tailspinBytesIsByteArray() throws Exception {
    String program = "use 'java:java.math' stand-alone\n"
        + "[x 0c4b x] -> math/BigInteger -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("3147", output.toString(StandardCharsets.UTF_8));
  }
}
