package tailspin.control;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayDeque;
import java.util.List;
import org.junit.jupiter.api.Test;

class ResultIteratorTest {
  @Test
  void resolveResult_nullResult() {
    assertEquals("a", ResultIterator.appendResultValue(null, "a"));
  }

  @Test
  void resolveResult_nullValue() {
    assertEquals("a", ResultIterator.appendResultValue("a", null));
  }

  @Test
  void resolveResult_simpleIterate() {
    ResultIterator result = (ResultIterator) ResultIterator.appendResultValue("a", "b");
    assertEquals("a", result.getNextResult());
    assertEquals("b", result.getNextResult());
    assertNull(result.getNextResult());
  }

  @Test
  void resolveResult_embeddedResultIterator() {
    ResultIterator result = (ResultIterator) ResultIterator.appendResultValue("a",
        (ResultIterator) new ArrayDeque<>(List.of(1,5,7))::poll);
    result = (ResultIterator) ResultIterator.appendResultValue(result, "b");
    assertEquals("a", result.getNextResult());
    assertEquals(1, result.getNextResult());
    assertEquals(5, result.getNextResult());
    assertEquals(7, result.getNextResult());
    assertEquals("b", result.getNextResult());
    assertNull(result.getNextResult());
  }

  @Test
  void resolveResult_embeddedPrefixedResultIterator() {
    assertThrows(AssertionError.class, () -> ResultIterator.appendResultValue("a",
        DelayedExecution.prefix(new ArrayDeque<>(List.of(1,5,7))::poll,
            new ArrayDeque<>(List.of("g"))::poll)));
  }

  @Test
  void forEach_nullInputDoesNotCallConsumer() {
    ResultIterator.forEach(null, r -> fail());
  }
}
