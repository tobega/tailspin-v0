import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import som.Random;


public final class RadixSort extends Benchmark {

  @Override
  public Object benchmark() {
    Random random = new Random();
    ArrayList<Integer> toSort = new ArrayList<>();
    for (int i = 0; i < 1000; i++) {
      toSort.add(random.next() - 32768);
    }
    java.util.List<Integer> sorted = radixsort(toSort, 16);
    return fingerprint(sorted);
  }

  private java.util.List<Integer> radixsort(java.util.List<Integer> toSort, int base) {
    class Buckets {
      boolean done = false;
      int magnitude = 1;
      final ArrayList<Integer> positives = new ArrayList<>();
      // Negatives get completed in wrong length-order, we need to collect by length and correct at the end
      final ArrayList<ArrayList<Integer>> negatives = new ArrayList<>();

      ArrayList<Integer>[] buckets;

      public java.util.List<Integer> sort() {
        Stream<Integer> numbers = toSort.stream();
        while (!done) {
          done = true;
          buckets = new ArrayList[base];
          for (int i = 0; i < base; i++) {
            buckets[i] = new ArrayList<>();
          }
          negatives.add(0, new ArrayList<>());
          numbers.forEach(this::bucketize);
          magnitude *= base;
          numbers = Arrays.stream(buckets).flatMap(Collection::stream);
        }
        return Stream.concat(negatives.stream().flatMap(Collection::stream), positives.stream())
            .collect(Collectors.toList());
      }

      private void bucketize(Integer number) {
        int remaining = number / magnitude;
        if (remaining == 0) {
          if (number >= 0) {
            positives.add(number);
          } else {
            negatives.get(0).add(number);
          }
        } else {
          done = false;
          int bucket = remaining % base;
          if (number < 0) {
            bucket = base + bucket - 1;
          }
          buckets[bucket].add(number);
        }
      }
    }
    return new Buckets().sort();
  }

  private Long fingerprint(java.util.List<Integer> sorted) {
    long sum = 0;
    for (int i = 0; i < sorted.size(); i++) {
      sum += (i+1L) * sorted.get(i);
    }
    return sum;
  }

  @Override
  public boolean verifyResult(final Object result) {
    return 6023830600L == (long) result;
  }

  public static void main(String[] args) {
    System.out.println(new RadixSort().radixsort(java.util.List.of(170, 45, 75, 91, 90, 92, 802, 24, 2, 66), 10));
    System.out.println(new RadixSort().radixsort(java.util.List.of(-170, -45, -91, -90, -92, -802, -24, -2, -76), 10));
    System.out.println(new RadixSort().radixsort(java.util.List.of(170, 45, 75, -91, -90, -92, -802, 24, 2, 66), 10));
    System.out.println(new RadixSort().radixsort(java.util.List.of(170, 45, 75, -91, -90, -92, -802, 24, 2, 6), 10));
  }
}
