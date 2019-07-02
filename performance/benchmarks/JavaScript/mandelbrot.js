// This benchmark is adapted to match the SOM version.
//
// Copyright © 2004-2013 Brent Fulgham
//
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are met:
//
//   * Redistributions of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistributions in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * Neither the name of "The Computer Language Benchmarks Game" nor the name
//     of "The Computer Language Shootout Benchmarks" nor the names of its
//     contributors may be used to endorse or promote products derived from this
//     software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
// DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
// FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
// DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
// SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
// CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
// OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

// The Computer Language Benchmarks Game
// http://benchmarksgame.alioth.debian.org
//
//  contributed by Karl von Laudermann
//  modified by Jeremy Echols
//  modified by Detlef Reichl
//  modified by Joseph LaFata
//  modified by Peter Zotov

// http://benchmarksgame.alioth.debian.org/u64q/program.php?test=mandelbrot&lang=yarv&id=3
'use strict';

var benchmark = require('./benchmark.js');

function Mandelbrot() {
  benchmark.Benchmark.call(this);

  function verifyResult(result, innerIterations) {
    if (innerIterations === 500) { return result === 191; }
    if (innerIterations === 750) { return result === 50;  }
    if (innerIterations ===   1) { return result === 128; }

    process.stdout.write("No verification result for " + innerIterations + " found\n");
    process.stdout.write("Result is: " + result + "\n");
    return false;
  }

  function mandelbrot(size) {
    var sum     = 0;
    var byteAcc = 0;
    var bitNum  = 0;

    var y = 0;

    while (y < size) {
      var ci = (2.0 * y / size) - 1.0,
        x = 0;

      while (x < size) {
        var zr   = 0.0,
          zrzr = 0.0,
          zi   = 0.0,
          zizi = 0.0,
          cr = (2.0 * x / size) - 1.5;

        var z = 0,
          notDone = true,
          escape = 0;
        while (notDone && z < 50) {
          zr = zrzr - zizi + cr;
          zi = 2.0 * zr * zi + ci;

          // preserve recalculation
          zrzr = zr * zr;
          zizi = zi * zi;

          if (zrzr + zizi > 4.0) {
            notDone = false;
            escape  = 1;
          }
          z += 1;
        }

        byteAcc = (byteAcc << 1) + escape;
        bitNum += 1;

        // Code is very similar for these cases, but using separate blocks
        // ensures we skip the shifting when it's unnecessary, which is most cases.
        if (bitNum === 8) {
          sum ^= byteAcc;
          byteAcc = 0;
          bitNum  = 0;
        } else if (x === size - 1) {
          byteAcc <<= (8 - bitNum);
          sum ^= byteAcc;
          byteAcc = 0;
          bitNum  = 0;
        }
        x += 1;
      }
      y += 1;
    }
    return sum;
  }

  this.innerBenchmarkLoop = function (innerIterations) {
    return verifyResult(mandelbrot(innerIterations), innerIterations);
  };
}
// not sure why this would be necessary? was in old code of mine
// Mandelbrot.prototype = Object.create(benchmark.Benchmark.prototype);

exports.newInstance = function () {
  return new Mandelbrot();
};
