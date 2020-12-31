package tailspin.interpreter;

import java.nio.file.Path;
import java.util.ArrayDeque;
import tailspin.arithmetic.ArithmeticContextKeywordResolver;

public abstract class Scope {

  private ArrayDeque<ArithmeticContextKeywordResolver> arithmeticContextKeywordResolvers = new ArrayDeque<>();

  public abstract Object resolveValue(String identifier);

  public abstract void defineValue(String identifier, Object value);

  public abstract Path basePath();

  public abstract void setState(String stateContext, Object value);

  public abstract Object getState(String stateContext);

  public abstract Scope getParentScope();

  public abstract boolean hasDefinition(String def);

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
}
