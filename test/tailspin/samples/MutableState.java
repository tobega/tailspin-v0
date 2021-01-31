package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

/**
 * This is the complex cases, basic state operations are tested in Templates.java
 */
public class MutableState {
  @Test
  void mutateStateField() throws Exception {
    String program =
        "templates state\n@: { a: 0, b: 0};\n@.b: $;\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=0, b=1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mergeStateStructure() throws Exception {
    String program =
        "templates state\n@: { a: 0, b: 0};\n..|@: {b: $, c: 2};\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=0, b=1, c=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mergeKeyValueToStateArrayElementStructure() throws Exception {
    String program =
        "templates state\n@: [{ a: 0, b: 0 }];\n..|@(1): (b: $);\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{a=0, b=1}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mergeStateField() throws Exception {
    String program =
        "templates state\n@: { a: []};\n..|@.a: 1..3;\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=[1, 2, 3]}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mergedStructureStateFieldArray_mutationOnlyOnState() throws Exception {
    String program =
        "templates state\n@: { };\n"
            + "def in: $;\n"
            + "..|@: {a:$in, b:0};\n@.a(1): 2; $in !\nend state\n" + "[1] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mergedStateFieldArray_mutationOnlyOnState() throws Exception {
    String program =
        "templates state\n@: { };\n"
            + "def in: $;\n"
            + "..|@: (a:$in);\n@.a(1): 2; $in !\nend state\n" + "[1] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mergedStateStructureFieldArray_mutationOnlyOnState() throws Exception {
    String program =
        "templates state\n@: { foo: {} };\n"
            + "def in: $;\n"
            + "..|@.foo: (a:$in);\n@.foo.a(1): 2; $in !\nend state\n" + "[1] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mergeStateArrayElementArray() throws Exception {
    String program =
        "templates state\n@: [[],[]];\n..|@(2): 1..3;\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[], [1, 2, 3]]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mergeStateArrayElementArray_mutationOnlyOnState() throws Exception {
    String program =
        "templates state\n@: [[],[]];\n"
            + "def foo: [{a:0}, {a:2}];\n"
            + "..|@(2): $foo...;\n"
            + "@(2;1).a: 1;"
            + "$foo !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{a=0}, {a=2}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mergeStateArrayElementStructure() throws Exception {
    String program =
        "templates state\n@: [{a:0}, {a:1}];\n..|@(2): {b: $, c: 2};\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{a=0}, {a=1, b=1, c=2}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mutateStateArray() throws Exception {
    String program =
        "templates state\n@: [1..3];\n@(2): $;\n$@ !\nend state\n" + "0 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 0, 3]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mutateTwoDimensionalStateArray() throws Exception {
    String program =
        "templates state\n@: [[1..3],[4..6],[7..9]];\n@(2;3): $;\n$@ !\nend state\n" + "0 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[1, 2, 3], [4, 5, 0], [7, 8, 9]]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mutateStateArraySlice() throws Exception {
    String program =
        "templates state\n@: [1..5];\n@(2..4): $..$+2;\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 1, 2, 3, 5]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mutateStateArraySlice_tooFewValues() throws Exception {
    String program =
        "templates state\n@: [1..5];\n@(2..4): $..$+1;\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void mutateStateArraySlice_tooManyValues() throws Exception {
    String program =
        "templates state\n@: [1..5];\n@(2..4): $..$+3;\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void mergeStateArray() throws Exception {
    String program =
        "templates state\n@: [];\n..|@: $..$+2;\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 2, 3]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void preserveItAfterMergeState() throws Exception {
    String program =
        "templates state\n@: [];\n..|@: $..$+2;\n$ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void preserveItAfterMutateState() throws Exception {
    String program =
        "templates state\n@: [0];\n@(1): $;\n$ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void immutableItArrayInMutableState() throws Exception {
    String program =
        "templates state\n@: $;\n@(1): 0;\n$ !\nend state\n" + "[1..3] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 2, 3]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void immutableItStructureInMutableState() throws Exception {
    String program =
        "templates state\n@: $;\n@.a: 0;\n$ !\nend state\n" + "{a:1} -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deeplyImmutableItArrayInMutableState() throws Exception {
    String program =
        "templates state\n@: $;\n@(1).a(2): 0;\n$ !\nend state\n" + "[{a:[1..3]}] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{a=[1, 2, 3]}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deeplyImmutableItStructureInMutableState() throws Exception {
    String program =
        "templates state\n@: $;\n@.a(1).b(2): 0;\n$ !\nend state\n" + "{a:[{b:[1..3]}]} -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=[{b=[1, 2, 3]}]}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deeplyImmutableItStructureInMutableStateField() throws Exception {
    String program =
        "templates state\n@: {a:{b:1}};\n@.a: $;\n@.a.b: 0;\n$ !\nend state\n" + "{b:2} -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{b=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deeplyImmutableItStructureInMutableStateArray() throws Exception {
    String program =
        "templates state\n@: [{b:1}];\n@(1): $;\n@(1).b: 0; $ !\nend state\n" + "{b:2} -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{b=2}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void immutableDefArrayFromMutableState() throws Exception {
    String program =
        "templates state\n@: $;\ndef var: $@;\n@(1): 0;\n$var !\nend state\n" + "[1..3] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 2, 3]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void immutableDefStructureFromMutableState() throws Exception {
    String program =
        "templates state\n@: $;\ndef var: $@;\n@.a: 0;\n$var !\nend state\n" + "{a:1} -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=1}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deeplyImmutableDefArrayFromMutableState() throws Exception {
    String program =
        "templates state\n@: $;\ndef var: $@;\n@(1).a(1): 0;\n$var !\nend state\n" + "[{a:[1..3]}] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{a=[1, 2, 3]}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void sharedMutatedStateArrayBecomesImmutable() throws Exception {
    String program =
        "templates state\n"
            + "@: $;\n"
            + "..|@: 4;\n"
            + "def var: $@;\n"
            + "^@(1) -> !VOID\n"
            + "$var !\n"
            + "end state\n"
            + "[1..3] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[1, 2, 3, 4]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void sharedMutatedStateStructureBecomesImmutable() throws Exception {
    String program =
        "templates state\n"
            + "@: $;\n"
            + "@.b: 4;\n"
            + "def var: $@;\n"
            + "@.a: 2;\n"
            + "$var !\n"
            + "end state\n"
            + "{a: 1, b: 2} -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=1, b=4}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deeplyImmutableDefStructureFromMutableState() throws Exception {
    String program =
        "templates state\n@: $;\ndef var: $@;\n@.a(1).b: 0;\n$var !\nend state\n" + "{a:[{b:1}]} -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=[{b=1}]}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deeplyImmutableDefStructureFromMutableStateKeyLens() throws Exception {
    String program =
        "templates state\n@: $;\ndef var: $@;\n@.a(1; b:): 0;\n$var !\nend state\n" + "{a:[{b:1}]} -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=[{b=1}]}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deleteStateField() throws Exception {
    String program =
        "templates state\n@: { a: 0, b: $};\n^@.b !\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1{a=0}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deleteStateFieldKeyLens() throws Exception {
    String program =
        "templates state\n@: { a: 0, b: $};\n^@(b:) !\n$@ !\nend state\n" + "1 -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1{a=0}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deleteStateArrayElement() throws Exception {
    String program =
        "templates state\n@: $;\n^@(2) !\n$@ !\nend state\n" + "[4,5,6] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("5[4, 6]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deleteStateArrayElements() throws Exception {
    String program =
        "templates state\n@: $;\n^@([1,3]) !\n$@ !\nend state\n" + "[4,5,6] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[4, 6][5]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deleteSameStateArrayElements() throws Exception {
    String program =
        "templates state\n@: $;\n^@([1,1]) !\n$@ !\nend state\n" + "[4,5,6] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[4, 4][5, 6]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deleteStateMultiDimensionalArrayElements() throws Exception {
    String program =
        "templates state\n@: $;\n^@([1,3];[3,1]) !\n$@ !\nend state\n" + "[[1,2,3],[4,5,6],[7,8,9]] -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[3, 1], [9, 7]][[2], [4, 5, 6], [8]]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deleteStateKeyLensArrayElements() throws Exception {
    String program =
        "templates state\n@: $;\n^@(foo:;[3,1]) !\n$@ !\nend state\n"
            + "{foo:[6,7,8]} -> state -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[8, 6]{foo=[7]}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void streamMergeStateArray() throws Exception {
    String program =
        "templates bar\n@: [5..7];\n1..3 -> ..|@: $;\n$@!\nend bar\n"
            + "3 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[5, 6, 7, 1, 2, 3]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMergeStateArray() throws Exception {
    String program =
        "templates bar\n@: [5..7];\n[1..3] -> ..|@: $...;\n$@!\nend bar\n"
            + "3 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[5, 6, 7, 1, 2, 3]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMergeStateSliceArrays() throws Exception {
    String program =
        "templates bar\n@: [[5],[6],[7]];\n[1..3] -> ..|@(1..3): $...;\n$@!\nend bar\n"
            + "3 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[[5, 1], [6, 2], [7, 3]]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMergeStateSliceStructures() throws Exception {
    String program =
        "templates bar\n@: [{},{},{}];\n[{x:1},{y:2}] -> ..|@(2..3): $...;\n$@!\nend bar\n"
            + "3 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{}, {x=1}, {y=2}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void arrayMergeStateSliceValuesFails() throws Exception {
    String program =
        "templates bar\n@: [5..7];\n[1..3] -> ..|@(1..3): $...;\n$@!\nend bar\n"
            + "3 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void streamMergeStateSliceArraysFails() throws Exception {
    String program =
        "templates bar\n@: [[5],[6],[7]];\n1..3 -> ..|@(1..3): $;\n$@!\nend bar\n"
            + "3 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void keyLensSetStateSlices() throws Exception {
    String program =
        "templates bar\n@: {foo:[6,7,8]};\n[$, $+1] -> @(foo:; 2..3): $...;\n$@!\nend bar\n"
            + "3 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{foo=[6, 3, 4]}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void keyLensMerge() throws Exception {
    String program =
        "templates bar\n@: {foo:[6,7,8]};\n[$, $+1] -> ..|@(foo:): $...;\n$@!\nend bar\n"
            + "3 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{foo=[6, 7, 8, 3, 4]}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void keyLensDeepMerge() throws Exception {
    String program =
        "templates bar\n@: {foo:[[6],[7],[8]]};\n[$, $+1] -> ..|@(foo:; 2..3): $...;\n$@!\nend bar\n"
            + "3 -> bar -> !OUT::write";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{foo=[[6], [7, 3], [8, 4]]}", output.toString(StandardCharsets.UTF_8));
  }
}
