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
        """
            templates state
            @: { a: 0, b: 0};
            @.b: $;
            $@ !
            end state
            1 -> state -> !OUT::write""";
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
        """
            templates state
            @: { a: 0, b: 0};
            ..|@: {b: $, c: 2};
            $@ !
            end state
            1 -> state -> !OUT::write""";
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
        """
            templates state
            @: [{ a: 0, b: 0 }];
            ..|@(1): (b: $);
            $@ !
            end state
            1 -> state -> !OUT::write""";
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
        """
            templates state
            @: { a: []};
            ..|@.a: 1..3;
            $@ !
            end state
            1 -> state -> !OUT::write""";
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
        """
            templates state
            @: { };
            def in: $;
            ..|@: {a:$in, b:0};
            @.a(1): 2; $in !
            end state
            [1] -> state -> !OUT::write""";
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
        """
            templates state
            @: { };
            def in: $;
            ..|@: (a:$in);
            @.a(1): 2; $in !
            end state
            [1] -> state -> !OUT::write""";
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
        """
            templates state
            @: { foo: {} };
            def in: $;
            ..|@.foo: (a:$in);
            @.foo.a(1): 2; $in !
            end state
            [1] -> state -> !OUT::write""";
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
        """
            templates state
            @: [[],[]];
            ..|@(2): 1..3;
            $@ !
            end state
            1 -> state -> !OUT::write""";
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
        """
            templates state
            @: [[],[]];
            def foo: [{a:0}, {a:2}];
            ..|@(2): $foo...;
            @(2;1).a: 1;$foo !
            end state
            1 -> state -> !OUT::write""";
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
        """
            templates state
            @: [{a:0}, {a:1}];
            ..|@(2): {b: $, c: 2};
            $@ !
            end state
            1 -> state -> !OUT::write""";
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
        """
            templates state
            @: [1..3];
            @(2): $;
            $@ !
            end state
            0 -> state -> !OUT::write""";
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
        """
            templates state
            @: [[1..3],[4..6],[7..9]];
            @(2;3): $;
            $@ !
            end state
            0 -> state -> !OUT::write""";
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
        """
            templates state
            @: [1..5];
            @(2..4): $..$+2;
            $@ !
            end state
            1 -> state -> !OUT::write""";
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
        """
            templates state
            @: [1..5];
            @(2..4): $..$+1;
            $@ !
            end state
            1 -> state -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void mutateStateArraySlice_tooManyValues() throws Exception {
    String program =
        """
            templates state
            @: [1..5];
            @(2..4): $..$+3;
            $@ !
            end state
            1 -> state -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void mergeStateArray() throws Exception {
    String program =
        """
            templates state
            @: [];
            ..|@: $..$+2;
            $@ !
            end state
            1 -> state -> !OUT::write""";
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
        """
            templates state
            @: [];
            ..|@: $..$+2;
            $ !
            end state
            1 -> state -> !OUT::write""";
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
        """
            templates state
            @: [0];
            @(1): $;
            $ !
            end state
            1 -> state -> !OUT::write""";
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
        """
            templates state
            @: $;
            @(1): 0;
            $ !
            end state
            [1..3] -> state -> !OUT::write""";
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
        """
            templates state
            @: $;
            @.a: 0;
            $ !
            end state
            {a:1} -> state -> !OUT::write""";
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
        """
            templates state
            @: $;
            @(1).a(2): 0;
            $ !
            end state
            [{a:[1..3]}] -> state -> !OUT::write""";
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
        """
            templates state
            @: $;
            @.a(1).b(2): 0;
            $ !
            end state
            {a:[{b:[1..3]}]} -> state -> !OUT::write""";
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
        """
            templates state
            @: {a:{b:1}};
            @.a: $;
            @.a.b: 0;
            $ !
            end state
            {b:2} -> state -> !OUT::write""";
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
        """
            templates state
            @: [{b:1}];
            @(1): $;
            @(1).b: 0; $ !
            end state
            {b:2} -> state -> !OUT::write""";
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
        """
            templates state
            @: $;
            def var: $@;
            @(1): 0;
            $var !
            end state
            [1..3] -> state -> !OUT::write""";
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
        """
            templates state
            @: $;
            def var: $@;
            @.a: 0;
            $var !
            end state
            {a:1} -> state -> !OUT::write""";
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
        """
            templates state
            @: $;
            def var: $@;
            @(1).a(1): 0;
            $var !
            end state
            [{a:[1..3]}] -> state -> !OUT::write""";
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
        """
            templates state
            @: $;
            ..|@: 4;
            def var: $@;
            ^@(1) -> !VOID
            $var !
            end state
            [1..3] -> state -> !OUT::write""";
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
        """
            templates state
            @: $;
            @.b: 4;
            def var: $@;
            @.a: 2;
            $var !
            end state
            {a: 1, b: 2} -> state -> !OUT::write""";
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
        """
            templates state
            @: $;
            def var: $@;
            @.a(1).b: 0;
            $var !
            end state
            {a:[{b:1}]} -> state -> !OUT::write""";
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
        """
            templates state
            @: $;
            def var: $@;
            @.a(1; b:): 0;
            $var !
            end state
            {a:[{b:1}]} -> state -> !OUT::write""";
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
        """
            templates state
            @: { a: 0, b: $};
            ^@.b !
            $@ !
            end state
            1 -> state -> !OUT::write""";
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
        """
            templates state
            @: { a: 0, b: $};
            ^@(b:) !
            $@ !
            end state
            1 -> state -> !OUT::write""";
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
        """
            templates state
            @: $;
            ^@(2) !
            $@ !
            end state
            [4,5,6] -> state -> !OUT::write""";
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
        """
            templates state
            @: $;
            ^@([1,3]) !
            $@ !
            end state
            [4,5,6] -> state -> !OUT::write""";
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
        """
            templates state
            @: $;
            ^@([1,1]) !
            $@ !
            end state
            [4,5,6] -> state -> !OUT::write""";
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
        """
            templates state
            @: $;
            ^@([1,3];[3,1]) !
            $@ !
            end state
            [[1,2,3],[4,5,6],[7,8,9]] -> state -> !OUT::write""";
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
        """
          templates state
            @: $;
            ^@(foo:;[3,1]) !
            $@ !
          end state
          {foo:[6,7,8]} -> state -> !OUT::write
        """;
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
        """
            templates bar
            @: [5..7];
            1..3 -> ..|@: $;
            $@!
            end bar
            3 -> bar -> !OUT::write""";
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
        """
            templates bar
            @: [5..7];
            [1..3] -> ..|@: $...;
            $@!
            end bar
            3 -> bar -> !OUT::write""";
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
        """
            templates bar
            @: [[5],[6],[7]];
            [1..3] -> ..|@(1..3): $...;
            $@!
            end bar
            3 -> bar -> !OUT::write""";
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
        """
            templates bar
            @: [{},{},{}];
            [{x:1},{y:2}] -> ..|@(2..3): $...;
            $@!
            end bar
            3 -> bar -> !OUT::write""";
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
        """
            templates bar
            @: [5..7];
            [1..3] -> ..|@(1..3): $...;
            $@!
            end bar
            3 -> bar -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void streamMergeStateSliceArraysFails() throws Exception {
    String program =
        """
            templates bar
            @: [[5],[6],[7]];
            1..3 -> ..|@(1..3): $;
            $@!
            end bar
            3 -> bar -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void keyLensSetStateSlices() throws Exception {
    String program =
        """
            templates bar
            @: {foo:[6,7,8]};
            [$, $+1] -> @(foo:; 2..3): $...;
            $@!
            end bar
            3 -> bar -> !OUT::write""";
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
        """
            templates bar
            @: {foo:[6,7,8]};
            [$, $+1] -> ..|@(foo:): $...;
            $@!
            end bar
            3 -> bar -> !OUT::write""";
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
        """
            templates bar
            @: {foo:[[6],[7],[8]]};
            [$, $+1] -> ..|@(foo:; 2..3): $...;
            $@!
            end bar
            3 -> bar -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{foo=[[6], [7, 3], [8, 4]]}", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void setLensAsParameter() throws Exception {
    String program =
        """
            templates bar&{baz:}
            @: [{foo:5}, {foo:7}];
              @(baz): $; $@ !
            end bar
            1 -> bar&{baz: :(2; foo:)} -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{foo=5}, {foo=1}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void setLensAsParameterComposes() throws Exception {
    String program =
        """
            templates bar&{baz:}
            @: [{foo:[5]}, {foo:[7]}];
              @(baz; 1): $; $@ !
            end bar
            1 -> bar&{baz: :(2; foo:)} -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{foo=[5]}, {foo=[1]}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deleteLensAsParameter() throws Exception {
    String program =
        """
            templates bar&{baz:}
            @: [{foo:5}, {foo:7}];
              ^@(baz)! $@ !
            end bar
            1 -> bar&{baz: :(2; foo:)} -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("7[{foo=5}, {}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void deleteLensAsParameterComposes() throws Exception {
    String program =
        """
            templates bar&{baz:}
            @: [{foo:[5]}, {foo:[7]}];
              ^@(baz; 1) ! $@ !
            end bar
            1 -> bar&{baz: :(2; foo:)} -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("7[{foo=[5]}, {foo=[]}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mergeLensAsParameter() throws Exception {
    String program =
        """
            templates bar&{baz:}
            @: [{foo:[5]}, {foo:[7]}];
              (fum:$) -> ..|@(baz): $; $@ !
            end bar
            1 -> bar&{baz: :(2; foo:)} -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{foo=[5]}, {foo=[7, fum=1]}]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mergeLensAsParameterComposes() throws Exception {
    String program =
        """
            templates bar&{baz:}
            @: [{foo:[[5]]}, {foo:[[7]]}];
              (fum:$) -> ..|@(baz; 1): $; $@ !
            end bar
            1 -> bar&{baz: :(2; foo:)} -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("[{foo=[[5]]}, {foo=[[7, fum=1]]}]", output.toString(StandardCharsets.UTF_8));
  }
}
