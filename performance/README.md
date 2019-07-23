Performance benchmarks based on (copied from) https://github.com/smarr/are-we-fast-yet

Progress measured in how many times slower than Java. The variance on tailspin runs seems crazy, so I don't know what this really says.

|Date|Json|List|Permute|Queens|Sieve|
|---|---|---|---|---|---|
|[2019-07-12](#2019-07-12)|136|2129|
|[2019-07-16](#2019-07-16)|132|2030|4631|    |2169|
|[2019-07-23](#2019-07-23)|118|3259|4176|6646|1064|


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
