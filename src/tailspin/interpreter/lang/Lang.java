package tailspin.interpreter.lang;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tailspin.Tailspin;
import tailspin.interpreter.BasicScope;
import tailspin.interpreter.Program;
import tailspin.interpreter.RunMain;

public class Lang {
  private static Map<String, Object> builtIns;

  private Lang() {}

  private synchronized static Map<String, Object> getBuiltIns() {
    if (builtIns != null) {
      return builtIns;
    }
    builtIns = new HashMap<>();
    builtIns.put("and", new BitwiseOperator.And());
    builtIns.put("or", new BitwiseOperator.Or());
    builtIns.put("xor", new BitwiseOperator.Xor());
    builtIns.put("union", new UnionOperator());
    builtIns.put("join", new JoinOperator());
    builtIns.put("minus", new MinusOperator());
    builtIns.put("matching", new MatchingOperator());
    builtIns.put("notMatching", new NotMatchingOperator());

    try {
      Tailspin dep = Tailspin.parse(Lang.class.getResourceAsStream("/lang.tt"));
      Program lang = new RunMain().visitProgram(dep.programDefinition);
      BasicScope langScope = new BasicScope(Path.of("-"));
      lang.asModule().resolveAll(langScope, List.of());
      langScope.copyDefinitions(builtIns);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return builtIns;
  }

  public static void installBuiltins(Set<String> remaining, BasicScope scope) {
    Set<String> unresolved = new HashSet<>();
    Map<String, Object> builtIns = getBuiltIns();
    for (String symbol : remaining) {
      if (builtIns.containsKey(symbol)) {
        scope.defineValue(symbol, builtIns.get(symbol));
      } else {
        unresolved.add(symbol);
      }
    }
    remaining = unresolved;
    if (!remaining.isEmpty()) throw new IllegalStateException("Some symbols not provided: " + remaining);
  }
}
