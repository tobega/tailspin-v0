package tailspin.control;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import org.junit.jupiter.api.Test;

class ResultIteratorTest {
  @Test
  void resolveResult_nullResult() {
    assertEquals("a", ResultIterator.resolveResult(null, "a"));
  }

  @Test
  void resolveResult_nullValue() {
    assertEquals("a", ResultIterator.resolveResult("a", null));
  }

  @Test
  void resolveResult_simpleIterate() {
    ResultIterator result = (ResultIterator) ResultIterator.resolveResult("a", "b");
    assertEquals("a", result.getNextResult());
    assertEquals("b", result.getNextResult());
    assertNull(result.getNextResult());
  }

  @Test
  void resolveResult_embeddedResultIterator() {
    ResultIterator result = (ResultIterator) ResultIterator.resolveResult("a",
        ResultIterator.ofIterator(List.of(1,5,7).iterator()));
    result = (ResultIterator) ResultIterator.resolveResult(result, "b");
    assertEquals("a", result.getNextResult());
    assertEquals(1, result.getNextResult());
    assertEquals(5, result.getNextResult());
    assertEquals(7, result.getNextResult());
    assertEquals("b", result.getNextResult());
    assertNull(result.getNextResult());
  }

  @Test
  void resolveResult_embeddedPrefixedResultIterator() {
    ResultIterator result = (ResultIterator) ResultIterator.resolveResult("a",
        ResultIterator.prefix(ResultIterator.ofIterator(List.of(1,5,7).iterator()),
            ResultIterator.ofIterator(List.of("g").iterator())));
    result = (ResultIterator) ResultIterator.resolveResult(result, "b");
    assertEquals("a", result.getNextResult());
    assertEquals(1, result.getNextResult());
    assertEquals(5, result.getNextResult());
    assertEquals(7, result.getNextResult());
    assertEquals("g", result.getNextResult());
    assertEquals("b", result.getNextResult());
    assertNull(result.getNextResult());
  }
}
