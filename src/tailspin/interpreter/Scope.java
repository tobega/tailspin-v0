package tailspin.interpreter;

import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.List;
import tailspin.arithmetic.ArithmeticContextKeywordResolver;
import tailspin.matchers.ArrayMatch;
import tailspin.types.Criterion;
import tailspin.types.TailspinArray;

public abstract class Scope {

  private ArrayDeque<ArithmeticContextKeywordResolver> arithmeticContextKeywordResolvers = new ArrayDeque<>();

  public abstract Object resolveValue(String identifier);

  public abstract void defineValue(String identifier, Object value);

  public abstract Path basePath();

  public abstract void setState(String stateContext, Object value);

  public abstract Object getState(String stateContext);

  public abstract Scope getParentScope();

  public abstract boolean hasDefinition(String def);

  public abstract boolean isLocallyDefined(String def);

  public abstract void undefineValue(String identifier);

  public ArithmeticContextKeywordResolver getArithmeticContextKeywordResolver() {
    return arithmeticContextKeywordResolvers.peek();
  }

  public void pushArithmeticContextKeywordResolver(ArithmeticContextKeywordResolver resolver) {
    arithmeticContextKeywordResolvers.push(resolver);
  }

  public void popArithmeticContextKeywordResolver() {
    arithmeticContextKeywordResolvers.pop();
  }

  public abstract void createDataDefinition(String identifier, Criterion def);

  public abstract Criterion getDataDefinition(String identifier);

  public abstract void checkDataDefinition(String key, Object data);

  private static Criterion stringMatch = new Criterion() {
    @Override
    public boolean isMet(Object toMatch, Object it, Scope scope) {
      return toMatch instanceof String;
    }
  };

  private static Criterion arrayMatch = new ArrayMatch((t, i, s) -> true, List.of(), false);

  public static Criterion getDefaultTypeCriterion(Object data) {
    if (data instanceof String) {
      return stringMatch;
    }
    if (data instanceof TailspinArray) {
      return arrayMatch;
    }
    return null;
  }
}
