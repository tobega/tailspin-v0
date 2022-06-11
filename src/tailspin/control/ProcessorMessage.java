package tailspin.control;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.types.DataDictionary;
import tailspin.types.KeyValue;
import tailspin.types.Processor;
import tailspin.types.TailspinArray;
import tailspin.types.Transform;

public class ProcessorMessage extends Reference {
  private final Reference reference;
  private final String message;
  private final Map<String, Value> parameters;

  public ProcessorMessage(Reference reference, String message, Map<String, Value> parameters) {
    this.reference = reference;
    this.message = message;
    this.parameters = parameters;
  }

  @Override
  public String toString() {
    return reference + "::" + message;
  }

  @Override
  public Transform getValue(Object it, Scope scope) {
    Map<String, Object> resolvedParams = parameters.entrySet().stream()
        .map(e -> new AbstractMap.SimpleEntry<>(e.getKey(), e.getValue().getResults(it, scope)))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    Object receiver = reference.getValue(it, scope);
    if (receiver == null) {
      throw new IllegalStateException("Unknown processor " + reference + ". Cannot send message " + message);
    }
    return resolveMessage(receiver, resolvedParams);
  }

  private Transform resolveMessage(Object receiver, Map<String, Object> resolvedParams) {
    if (receiver instanceof Processor) {
      return  ((Processor) receiver).resolveMessage(message, resolvedParams);
    } else if (message.equals("hashCode")) {
      if (receiver instanceof byte[]) return (it, parameters, callingDictionary) -> ((Number)Arrays.hashCode((byte[]) receiver)).longValue();
      return (it, params, callingDictionary) -> ((Number) receiver.hashCode()).longValue();
    } else if (receiver instanceof Long) {
      if (message.equals("asBytes")) {
        return (it, params, callingDictionary) -> BigInteger.valueOf((Long) receiver).toByteArray();
      } else if (message.equals("raw")) {
        return (it, params, callingDictionary) -> receiver;
      } else {
        throw new UnsupportedOperationException("Unknown number message " + message);
      }
    } else if (receiver instanceof String) {
      if (message.equals("asCodePoints")) {
        return (it, params, callingDictionary) -> TailspinArray.value(
            ((String) receiver).codePoints().asLongStream().boxed().collect(Collectors.toList()));
      } if (message.equals("asUtf8Bytes")) {
        return (it, params, callingDictionary) -> ((String) receiver).getBytes(StandardCharsets.UTF_8);
      } else if (message.equals("raw")) {
        return (it, params, callingDictionary) -> receiver;
      } else {
        throw new UnsupportedOperationException("Unknown string message " + message);
      }
    } else if (receiver instanceof KeyValue) {
      if (message.equals("key")) {
        return (it, params, callingDictionary) -> ((KeyValue) receiver).getKey();
      } else if (message.equals("value")) {
        return (it, params, callingDictionary) -> ((KeyValue) receiver).getValue();
      } else {
        throw new UnsupportedOperationException("Unknown keyValue message " + message);
      }
    } else if (receiver instanceof byte[]) {
      return switch (message) {
        case "inverse" -> (it, params, callingDictionary) -> {
          byte[] in = (byte[]) receiver;
          byte[] result = new byte[in.length];
          for (int i = 0; i < in.length; i++) {
            result[i] = (byte) ~in[i];
          }
          return result;
        };
        case "length" -> (it, parameters, callingDictionary) -> ((byte[]) receiver).length;
        case "asUtf8String" -> (it, parameters, callingDictionary) -> new String((byte[]) receiver,
            StandardCharsets.UTF_8);
        case "asInteger" -> (it, parameters, callingDictionary) -> new BigInteger((byte[]) receiver).longValue();
        case "shift" -> new ByteShift(receiver, resolvedParams);
        default -> throw new UnsupportedOperationException("Unknown bytes message " + message);
      };
    } else {
      throw new UnsupportedOperationException("Unimplemented message " + message + " on  processor type " + receiver.getClass().getSimpleName());
    }
  }

  @Override
  public Object deleteValue(Object it, Scope scope) {
    throw new IllegalStateException();
  }

  @Override
  public boolean isMutable() {
    return false;
  }

  @Override
  public void setValue(boolean merge, Object value, Object it, Scope scope) {
    throw new IllegalStateException();
  }

  private static class ByteShift implements Transform {

    final byte[] original;
    private final Map<String, Object> resolvedParams;

    public ByteShift(Object receiver, Map<String, Object> resolvedParams) {
      this.resolvedParams = resolvedParams;
      original = (byte[]) receiver;
    }

    @Override
    public Object getResults(Object it, Map<String, Object> parameters,
        DataDictionary callingDictionary) {
      long amount = (long) resolvedParams.get("left");
      if (amount == 0) return original;
      byte[] fill = (byte[]) resolvedParams.get("fill");
      if (amount < 0) return shiftRight(-amount, fill);
      return shiftLeft(amount, fill);
    }

    private byte[] shiftLeft(long amount, byte[] fill) {
      byte[] result = new byte[original.length];
      for (int i = 0; i < result.length; i ++) {
        int byteShift = (int) (i + amount / 8);
        long bitShift = amount % 8;
        result[i] = (byte) ((getLeftShiftedByte(byteShift, fill) << bitShift)
            | getLeftFill(byteShift+1, bitShift, fill));
      }
      return result;
    }

    private byte getLeftShiftedByte(int byteShift, byte[] fill) {
      if (byteShift < original.length) return original[byteShift];
      byteShift -= original.length;
      return fill[byteShift % fill.length];
    }

    private int getLeftFill(int i, long amount, byte[] fill) {
      return (getLeftShiftedByte(i, fill) & 0xff) >>> (8 - amount);
    }

    private byte[] shiftRight(long amount, byte[] fill) {
      byte[] result = new byte[original.length];
      for (int i = 0; i < result.length; i ++) {
        int byteShift = (int) (i - amount / 8);
        long bitShift = amount % 8;
        result[i] = (byte) (((getRightShiftedByte(byteShift, fill) & 0xff) >>> bitShift)
            | getRightFill(byteShift-1, bitShift, fill));
      }
      return result;
    }

    private byte getRightShiftedByte(int byteShift, byte[] fill) {
      if (byteShift >= 0) return original[byteShift];
      byteShift = (fill.length + byteShift) % fill.length;
      if (byteShift < 0) byteShift += fill.length;
      return fill[byteShift];
    }

    private int getRightFill(int i, long amount, byte[] fill) {
      return (getRightShiftedByte(i, fill) & 0xff) << (8 - amount);
    }
  }
}
