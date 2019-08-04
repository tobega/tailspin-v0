Performance benchmarks based on (copied from) https://github.com/smarr/are-we-fast-yet

Progress measured in how many times slower than Java. The variance on tailspin runs seems crazy, so I don't know what this really says.

|Date|Json|List|Permute|Queens|Sieve|
|---|---|---|---|---|---|
|[2019-07-12](#2019-07-12)|136|2129|
|[2019-07-16](#2019-07-16)|132|2030|4631|    |2169|
|[2019-07-23](#2019-07-23)|118|3259|4176|6646|1064|
|[2019-07-24](#2019-07-24)|149|1865|2546|4185|1197|
|[2019-07-24b](#2019-07-24b)|144|590|1495|847|940|
|[2019-08-04](#2019-08-04)|179|877|1010|1195|605|

## 2019-08-04
No specific performance-related work but lots of syntax updates/improvements

|Benchmark|Mean runtime us|
|---|---|
Json     Java| 12.1
Json     Node | 13.6
Json     Tailspin | 2170.3
List     Java  | 1.5
List     Node |2.7
List     Tailspin |1316.2
Permute  Java| 0.7
Permute  Node |1.4
Permute  Tailspin | 706.7
Queens   Java |1.2
Queens   Node | 2.3
Queens   Tailspin |1433.9
Sieve    Java | 1.1
Sieve    Node | 2.4
Sieve    Tailspin | 665.8

## 2019-07-24b
After matchers were converted to AST and with increased number of iterations in benchmarks

|Benchmark|Mean runtime us|
|---|---|
Json     Java | 14.5
Json     Node  | 16.3
Json     Tailspin | 2094.3
List     Java | 0.8
List     Node  | 1.6
List     Tailspin | 472.0
Permute  Java | 0.8
Permute  Node  | 1.6
Permute  Tailspin | 1196.3
Queens   Java | 0.7
Queens   Node | 1.4
Queens   Tailspin | 593.0
Sieve    Java | 1.3
Sieve    Node | 2.8
Sieve    Tailspin | 1221.4

## 2019-07-24
|Benchmark|Mean runtime us|
|---|---|
Json     Java | 12.9
Json     Node |  14.1
Json     Tailspin |1926.5
List     Java |  0.4
List     Node  | 0.8
List     Tailspin | 745.8
Permute  Java | 0.4
Permute  Node | 0.8
Permute  Tailspin | 1018.6
Queens   Java  | 0.3
Queens   Node  | 0.6
Queens   Tailspin | 1255.4
Sieve    Java  | 0.6
Sieve    Node  |  1.3
Sieve    Tailspin | 718.0

## 2019-07-23
|Benchmark|Mean runtime us|
|---|---|
Json     Java|14.5
Json     Node|16.3
Json     Tailspin|1714.5
List     Java | 0.4
List     Node  | 0.8
List     Tailspin | 1303.7
Permute  Java  | 0.4
Permute  Node  |  0.8
Permute  Tailspin | 1670.2
Queens   Java | 0.3
Queens   Node | 0.7
Queens   Tailspin | 1993.8
Sieve    Java | 0.7
Sieve    Node  | 1.4
Sieve    Tailspin | 745.1

## 2019-07-16
|Benchmark|Mean runtime us|
|---|---|
Json     Java|14.3
Json     Node|16.6
Json     Tailspin|1891.9
List     Java|0.4
List     Node|0.7
List     Tailspin|812.0
Permute  Java|0.4
Permute  Node|0.8
Permute  Tailspin|1852.2
Sieve    Java|0.6
Sieve    Node|1.3
Sieve    Tailspin|1301.2

## 2019-07-12
|Benchmark|Mean runtime us|
|---|---|
|Json  Java|12.7|
|Json  Node|13.8|
|Json  Tailspin|1729.5|
|List  Java|0.4|
|List  Node|0.8|
|List  Tailspin|851.7|
