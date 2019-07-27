package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Arrays {

  @Test
  void arrayLiteral() throws IOException {
    String program = "[1,2,3] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 2, 3]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayLiteralWithoutComma() {
    String program = "[1 2 3] -> !OUT::write";
    assertThrows(Exception.class, () -> Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8))));
  }

  @Test
  void arrayOfRange() throws IOException {
    String program = "[1..3] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 2, 3]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayOfString() throws IOException {
    String program = "['one', 'two', 'three'] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[one, two, three]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deconstruct() throws IOException {
    String program = "['one', 'two', 'three']... -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("onetwothree", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deconstructToTransform() throws IOException {
    String program = "[1, 4, 3]... -> (<4> 2 !) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("2", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void literalTransform() throws IOException {
    String program = "5 -> [$it - 1, $it, $it +1] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[4, 5, 6]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void simpleDereference() throws IOException {
    String program = "[1,3,4,7,11] -> $it(3)  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("4", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void simpleDereferenceBackward() throws IOException {
    String program = "[1,3,4,7,11] -> $it(-3)  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("4", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void simpleDereferenceDereference() throws IOException {
    String program = "def i: 3;\n [1,3,4,7,11] -> $it($i)  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("4", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeDereference() throws IOException {
    String program = "[1,3,4,7,11] -> $it(2..4)  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[3, 4, 7]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeDereferenceBackward() throws IOException {
    String program = "[1,3,4,7,11] -> $it(-4..-2)  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[3, 4, 7]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeDereferenceMixed() throws IOException {
    String program = "[1,3,4,7,11] -> $it(2..-2)  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[3, 4, 7]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeDereferenceStepping() throws IOException {
    String program = "[1,3,4,7,11] -> $it(1..-1:2)  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 4, 11]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void permutationDereference() throws IOException {
    String program = "[1,3,4,7,11] -> $it([3,1,4])  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[4, 1, 7]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void permutationDereferenceDereference() throws IOException {
    String program = "def order: [3,1,4];\n [1,3,4,7,11] -> $it($order) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[4, 1, 7]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void elementStructureDereference() throws IOException {
    String program = "[{}, {a: 5}] -> $it(2).a -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayLiteralInterpolationArrayDereferenceValueChain() throws IOException {
    String program = "def a: [5];\n 1 -> [ $a(1) -> 'foo$it;' ] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[foo5]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayLiteralInterpolationFieldArrayDereferenceValueChain() throws IOException {
    String program = "def a: { b: [5]};\n 1 -> [ $a.b(1) -> 'foo$it;' ] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[foo5]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayLiteralValueChainResetIt() throws IOException {
    String program = "1 -> [ 5 -> 'foo$it;', $it ] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[foo5, 1]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void emptyArrayLiteral() throws IOException {
    String program = "[] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayCollector() throws IOException {
    String program = "def original: [5];\n [$original..., 1..3] -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[5, 1, 2, 3]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void twoDimensionalSingleValue() throws IOException {
    String program = "[['no','no'],['yes','no']] -> $it(2;1) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void twoDimensionalRangeOnSecond() throws IOException {
    String program = "[[1,2,3],[4,5,6]] -> $it(2;1..2) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[4, 5]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void twoDimensionalRangeOnFirst() throws IOException {
    String program = "[[1,2,3],[4,5,6]] -> $it(1..2;1) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 4]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void valueProductionViaTemplates() throws Exception {
    String program = "3 -> ([ 1..$it -> # ] ! <2> $it!) -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[2]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void length() throws Exception {
    String program = "[ 1..6 ] -> $it::length -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("6", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeDereferenceEmpty() throws IOException {
    String program = "[] -> $it(1..-1)  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeDereferenceLengthZero() throws IOException {
    String program = "[] -> $it(1..$it::length)  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeDereferenceBeyondLength() throws IOException {
    String program = "[1,2,3] -> $it($it::length+1..-1)  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeDereferenceEmptyBeyondLength() throws IOException {
    String program = "[] -> $it($it::length+1..-1)  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeDereferenceStartBeyondLast() throws IOException {
    String program = "def a: [1,2,3];\n -1 -> $a($it+1..-1)  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeDereferenceEndBeyondLast() throws IOException {
    String program = "def a: [1,2,3];\n -1 -> $a(1..$it+1)  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeDereferenceEndBeforeFirst() throws IOException {
    String program = "def a: [1,2,3];\n 1 -> $a(1..$it-1)  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void rangeDereferenceStartBeforeFirst() throws IOException {
    String program = "def a: [1,2,3];\n 1 -> $a($it-1..-1)  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arithmeticExpressionDereference() throws IOException {
    String program = "def a: [1,2,3];\n 1 -> $a($it+1)  -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("2", output.toString(StandardCharsets.UTF_8));
  }
}
