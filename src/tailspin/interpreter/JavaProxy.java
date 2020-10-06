package tailspin.interpreter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Map;
import tailspin.control.ResultIterator;
import tailspin.types.Processor;

public class JavaProxy implements InvocationHandler {

  private final Processor processor;

  public JavaProxy(Processor processor) {
    this.processor = processor;
  }

  public static <T> T of(Class<? extends T> type, Processor param) {
    return type.cast(Proxy.newProxyInstance(
        JavaProxy.class.getClassLoader(),
        new Class[] { type },
        new JavaProxy(param)));
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) {
    Object convertedArgs = null;
    if (args.length == 1) {
      convertedArgs = JavaInvocation.tailspinTypeOf(args[0]);
    } else if (args.length > 1) {
      convertedArgs = JavaInvocation.tailspinTypeOf(Arrays.asList(args));
    }
    Object results = processor.resolveMessage(method.getName(), Map.of())
        .getResults(convertedArgs, Map.of());
    return ResultIterator.resolveSideEffects(results);
  }
}
