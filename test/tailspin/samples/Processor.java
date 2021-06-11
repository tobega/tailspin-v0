package tailspin.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;
import tailspin.Tailspin;

class Processor {
  @Test
  void simple() throws Exception {
    String program =
        """
            processor Holder
            @: $;
            templates add
              $ + $@Holder !
            end add
            end Holder
            def five: 5 -> Holder;
            1..3 -> five::add -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("678", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void noHiddenThisAccess() throws Exception {
    String program =
        """
            processor Holder
            @: $;
            templates add
              $ + $@Holder !
            end add
            end Holder
            def five: 5 -> Holder;
            templates bad
              $five::add !
            end bad
            1..3 -> bad -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    assertThrows(Exception.class, () -> runner.run(input, output, List.of()));
  }

  @Test
  void explicitThisAccessOK() throws Exception {
    String program =
        """
            processor Holder
            @: $;
            templates add
              $ + $@Holder !
            end add
            end Holder
            def five: 5 -> Holder;
            templates good
              $->five::add !
            end good
            1..3 -> good -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("678", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void noThisAccessAtStartOfChainOK() throws Exception {
    String program =
        """
            processor Holder
            @: $;
            templates value
              $@Holder !
            end value
            end Holder
            def five: 5 -> Holder;
            templates good
              $five::value !
            end good
            1..3 -> good -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("555", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void stringInterpolateMessage() throws Exception {
    String program =
        """
            processor Holder
            @: $;
            templates add
              $ + $@Holder !
            end add
            end Holder
            def five: 5 -> Holder;
            1..3 -> '$->five::add;' -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("678", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void parametrizedProcessor() throws Exception {
    String program =
        """
            templates add&{x:}
              $ + $x !
            end add
            processor Holder&{op:}
            @: $;
            templates do
              $ -> op&{x:$@Holder} !
            end do
            end Holder
            def addFive: 5 -> Holder&{op:add};
            1..3 -> addFive::do -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("678", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void parametrizedMessage() throws Exception {
    String program =
        """
            templates add&{x:}
              $ + $x !
            end add
            processor Holder
            @: $;
            templates do&{op:}
              $ -> op&{x:$@Holder} !
            end do
            end Holder
            def five: 5 -> Holder;
            1..3 -> five::do&{op:add} -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("678", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void sink() throws Exception {
    String program =
        """
            processor Holder
            @: $;
            sink add
              $ + $@Holder -> !OUT::write
            end add
            end Holder
            def five: 5 -> Holder;
            1..3 -> !five::add""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("678", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void source() throws Exception {
    String program =
        """
            processor Holder
            @: $;
            source value
              $@Holder !
            end value
            end Holder
            def five: 5 -> Holder;
            1..3 -> $five::value -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("555", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void bespokeCollector() throws Exception {
    String program =
        """
            processor TimesPlus
            @: 0;
            sink accumulate
              @TimesPlus: $@TimesPlus * $ + $;
            end accumulate
            source result
              $@TimesPlus !
            end result
            end TimesPlus
            1..3 -> ..=TimesPlus -> !OUT::write""";
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("15", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void bespokeCollectorSubtotalling() throws Exception {
    String program =
        """
            processor TimesPlus
            @: 0;
            sink accumulate
              @TimesPlus: $@TimesPlus * $ + $;
            end accumulate
            source result
              $@TimesPlus !
            end result
            end TimesPlus
            def tp: $TimesPlus;
            source acc $tp! end acc
            1 -> ..=acc -> !OUT::write
            2 -> ..=acc -> !OUT::write
            3 -> ..=acc -> !OUT::write
            """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("1415", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mutableVariable() throws Exception {
    String program =
        """
            processor Var
            @: $;
            sink set&{lens:}
              @Var(lens): $;
            end set
            sink merge&{lens:}
              ..|@Var(lens): $;
            end merge
            source get&{lens:}
              $@Var(lens) !
            end get
            source delete&{lens:}
              ^@Var(lens) !
            end delete
            end Var
            def var: {a:1} -> Var;
            $var::get&{lens: :()} -> !OUT::write
            $var::get&{lens: :(a:)} -> !OUT::write
            2 -> !var::set&{lens: :(a:)}
            $var::get&{lens: :()} -> !OUT::write
            [3] -> !var::set&{lens: :()}
            $var::get&{lens: :()} -> !OUT::write
            $var::get&{lens: :(1)} -> !OUT::write
            4 -> !var::merge&{lens: :()}
            $var::get&{lens: :()} -> !OUT::write
            $var::delete&{lens: :(1)} -> !OUT::write
            $var::delete&{lens: :()} -> !OUT::write
            """
            ;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=1}1{a=2}[3]3[3, 4]3[4]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mutableVariableInArray() throws Exception {
    String program =
        """
            processor Var
            @: [$];
            sink set&{lens:}
              @Var(1; lens): $;
            end set
            sink merge&{lens:}
              ..|@Var(1; lens): $;
            end merge
            source get&{lens:}
              $@Var(1; lens) !
            end get
            source delete&{lens:}
              ^@Var(1; lens) !
            end delete
            end Var
            def var: {a:1} -> Var;
            $var::get&{lens: :()} -> !OUT::write
            $var::get&{lens: :(a:)} -> !OUT::write
            2 -> !var::set&{lens: :(a:)}
            $var::get&{lens: :()} -> !OUT::write
            [3] -> !var::set&{lens: :()}
            $var::get&{lens: :()} -> !OUT::write
            $var::get&{lens: :(1)} -> !OUT::write
            4 -> !var::merge&{lens: :()}
            $var::get&{lens: :()} -> !OUT::write
            $var::delete&{lens: :(1)} -> !OUT::write
            $var::delete&{lens: :()} -> !OUT::write
            """
            ;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=1}1{a=2}[3]3[3, 4]3[4]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void mutableVariableInStructure() throws Exception {
    String program =
        """
            processor Var
            @: {a: $};
            sink set&{lens:}
              @Var(a:; lens): $;
            end set
            sink merge&{lens:}
              ..|@Var(a:; lens): $;
            end merge
            source get&{lens:}
              $@Var(a:; lens) !
            end get
            source delete&{lens:}
              ^@Var(a:; lens) !
            end delete
            end Var
            def var: {a:1} -> Var;
            $var::get&{lens: :()} -> !OUT::write
            $var::get&{lens: :(a:)} -> !OUT::write
            2 -> !var::set&{lens: :(a:)}
            $var::get&{lens: :()} -> !OUT::write
            [3] -> !var::set&{lens: :()}
            $var::get&{lens: :()} -> !OUT::write
            $var::get&{lens: :(1)} -> !OUT::write
            4 -> !var::merge&{lens: :()}
            $var::get&{lens: :()} -> !OUT::write
            $var::delete&{lens: :(1)} -> !OUT::write
            $var::delete&{lens: :()} -> !OUT::write
            """
            ;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("{a=1}1{a=2}[3]3[3, 4]3[4]", output.toString(StandardCharsets.UTF_8));
  }

  @Test
  void typestatesInitial() throws Exception {
    String program =
        """
        processor Blink
          @Light: 1;
          state Light
            templates off
              @Dark: 0;
            end off
            source shine
              'yes' !
            end shine
          end Light
          state Dark
            templates on
              @Light: 1;
            end on
            source shine
              'no' !
            end shine
          end Dark
        end Blink
        
        $Blink -> $::shine -> !OUT::write
        """;
    Tailspin runner =
        Tailspin.parse(new ByteArrayInputStream(program.getBytes(StandardCharsets.UTF_8)));

    ByteArrayInputStream input = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    runner.run(input, output, List.of());

    assertEquals("yes", output.toString(StandardCharsets.UTF_8));
  }
}
