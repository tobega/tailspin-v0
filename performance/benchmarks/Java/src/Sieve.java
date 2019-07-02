/* This code is based on the SOM class library.
 *
 * Copyright (c) 2001-2016 see AUTHORS.md file
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the 'Software'), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
import java.util.Arrays;


public class Sieve extends Benchmark {

  @Override
  public Object benchmark() {
    boolean[] flags = new boolean[5000];
    Arrays.fill(flags, true);
    return sieve(flags, 5000);
  }

  int sieve(final boolean[] flags, final int size) {
    int primeCount = 0;

    for (int i = 2; i <= size; i++) {
      if (flags[i - 1]) {
        primeCount++;
        int k = i + i;
        while (k <= size) {
          flags[k - 1] = false;
          k += i;
        }
      }
    }
    return primeCount;
  }

  @Override
  public boolean verifyResult(final Object result) {
    return 669 == (int) result;
  }
}
