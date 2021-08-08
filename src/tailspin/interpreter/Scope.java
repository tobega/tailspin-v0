package tailspin.interpreter;

import java.nio.file.Path;
import java.util.ArrayDeque;
import tailspin.arithmetic.ArithmeticContextKeywordResolver;
import tailspin.types.Criterion;

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

  /**
   * Returns the data with the possibly annotated correct type.
   * Throws if data does not match the type definition.
   */
  public abstract Object checkDataDefinition(String key, Object data);

}
