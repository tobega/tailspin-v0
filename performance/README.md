Performance benchmarks based on (copied from) https://github.com/smarr/are-we-fast-yet

Progress measured in how many times slower than Java. The variance on tailspin runs seems crazy, so I don't know what this really says.

|Date|Implementation|Bounce|Json|List|Permute|Queens|Sieve|Towers|
|---|---|---|---|---|---|---|---|---|
|[2019-07-12](#2019-07-12)| | |136|2129|
|[2019-07-16](#2019-07-16)| | |132|2030|4631|    |2169|
|[2019-07-23](#2019-07-23)| | |118|3259|4176|6646|1064|
|[2019-07-24](#2019-07-24)| | |149|1865|2546|4185|1197|
|[2019-07-24b](#2019-07-24b)| | |144|590|1495|847|940|
|[2019-08-04](#2019-08-04)| | |179|877|1010|1195|605|
|[2019-08-18](#2019-08-18)|Interpreted| |136|561|2087|1205|725|
|[2019-08-18](#2019-08-18)|Truffle| |158|798|1172|1382|748|
|[2019-09-08](#2019-09-08)|Interpreted| |156|846|1001|1206|558|
|[2019-09-08](#2019-09-08)|Truffle| |158|1371|1459|1574|945|
|[2019-09-15](#2019-09-15)|Truffle| |158|1483|1672|1462|966|
|[2019-09-24](#2019-09-24)|Interpreted|1543|151|786|1289|1351|575|
|[2019-09-24](#2019-09-24)|Truffle|2563|162|1441|1941|1977|1081|
|[2019-10-20](#2019-10-20)|Interpreted|1636|157|659|1307|1381|621|1034|
|[2019-10-27](#2019-10.27)|Truffle|1958.3|166.7|1044|1499|1452|921|1183|

## 2019-10-27
Actually doing -XX:+UseJVMCICompiler makes truffle suck less. Run on machine 1.

|Benchmark|Mean runtime us|
|---|---|
Bounce   Java |1.2
Bounce   Node |  2.3
Bounce   Tailspin | 1844.7
Bounce   Tailspin-truffle |  2350.5
Json     Java  |  13.0
Json     Node  | 16.8
Json     Tailspin  | 2014.3
Json     Tailspin-truffle |  2167.1
List     Java | 1.7
List     Node | 3.2
List     Tailspin | 1071.9
List     Tailspin-truffle | 1774.1
Permute  Java | 0.8
Permute  Node | 1.5
Permute  Tailspin | 1084.2
Permute  Tailspin-truffle | 1199.5
Queens   Java  | 1.5
Queens   Node  | 2.5
Queens   Tailspin | 1843.4
Queens   Tailspin-truffle | 2178.4
Sieve    Java | 1.3
Sieve    Node | 3.0
Sieve    Tailspin | 773.9
Sieve    Tailspin-truffle| 1197.0
Towers   Java  | 1.5
Towers   Node  | 2.6
Towers   Tailspin  | 1484.2
Towers   Tailspin-truffle | 1774.0

## 2019-10-20
Added Towers benchmark. Better tailspin code in List benchmark. Run on machine 1.

|Benchmark|Mean runtime us|
|---|---|
Bounce   Java|1.2
Bounce   Node |2.2
Bounce   Tailspin |1962.7
Bounce   Tailspin-truffle|3011.5
Json     Java | 12.3
Json     Node |16.4
Json     Tailspin | 1936.3
Json     Tailspin-truffle | 2061.4
List     Java | 1.7
List     Node | 3.2
List     Tailspin | 1120.3
List     Tailspin-truffle | 2029.7
Permute  Java  | 0.8
Permute  Node  |1.4
Permute  Tailspin |1045.6
Permute  Tailspin-truffle | 1542.9
Queens   Java |1.4
Queens   Node |2.7
Queens   Tailspin |1933.9
Queens   Tailspin-truffle | 2651.7
Sieve    Java | 1.3
Sieve    Node |2.8
Sieve    Tailspin | 807.1
Sieve    Tailspin-truffle | 1461.8
Towers   Java | 1.5
Towers   Node | 2.9
Towers   Tailspin |1551.6
Towers   Tailspin-truffle |2060.3

## 2019-09-24
Added Bounce benchmark. Recompiled truffle. Run on machine 1.

|Benchmark|Mean runtime us|
|---|---|
Bounce   Java |1.1
Bounce   Node |2.2
Bounce   Tailspin |1697.8
Bounce   Tailspin-truffle|2819.6
Json     Java |12.0
Json     Node | 14.0
Json     Tailspin |1809.4
Json     Tailspin-truffle | 1942.1
List     Java |1.5
List     Node | 2.9
List     Tailspin | 1178.8
List     Tailspin-truffle |2161.8
Permute  Java | 0.7
Permute  Node |1.4
Permute  Tailspin | 902.5
Permute  Tailspin-truffle | 1359.0
Queens   Java  |1.2
Queens   Node | 2.4
Queens   Tailspin |1621.1
Queens   Tailspin-truffle | 2372.4
Sieve    Java | 1.2
Sieve    Node | 2.4
Sieve    Tailspin | 689.6
Sieve    Tailspin-truffle | 1297.5

## 2019-09-15
Truffle-ized arithmetic operations. Run on machine 2.

|Benchmark|Mean runtime us|
|---|---|
Json     Java|10.9
Json     Node|14.4
Json     Tailspin|1653.8
Json     Tailspin-truffle|1727.0
List     Java | 1.2
List     Node |2.5
List     Tailspin| 1032.0
List     Tailspin-truffle|1779.4
Permute  Java | 0.7
Permute  Node | 1.2
Permute  Tailspin  | 717.9
Permute  Tailspin-truffle| 1170.6
Queens   Java  | 1.2
Queens   Node  | 2.1
Queens   Tailspin|1417.2
Queens   Tailspin-truffle|1754.4
Sieve    Java|1.0
Sieve    Node |2.5
Sieve    Tailspin |560.7
Sieve    Tailspin-truffle|966.1

## 2019-09-08
Converted the truffle version to fully use truffle frames. No optimizations yet. Run on another machine.

|Benchmark|Mean runtime us|
|---|---|
Json     Java|10.8
Json     Node |14.4
Json     Tailspin|1684.5
Json     Tailspin-truffle| 1711.1
List     Java | 1.2
List     Node | 2.4
List     Tailspin | 1015.1
List     Tailspin-truffle|1645.2
Permute  Java |0.7
Permute  Node |1.2
Permute  Tailspin | 700.4
Permute  Tailspin-truffle|1021.3
Queens   Java | 1.1
Queens   Node | 2.1
Queens   Tailspin|1326.5
Queens   Tailspin-truffle|1731.3
Sieve    Java|1.0
Sieve    Node|2.4
Sieve    Tailspin|558.0
Sieve    Tailspin-truffle|945.0

## 2019-08-18
No changes, but added an implementation running on truffle/graalvm, no optimizations yet

|Benchmark|Mean runtime us|
|---|---|
Json     Java | 12.8
Json     Node | 13.6
Json     Tailspin | 1739.9
Json     Tailspin-truffle | 2026.1
List     Java  | 1.7
List     Node  |  3.0
List     Tailspin  |  954.3
List     Tailspin-truffle | 1357.0
Permute  Java  |  0.8
Permute  Node  |  1.4
Permute  Tailspin  | 1669.2
Permute  Tailspin-truffle | 937.7
Queens   Java  |  1.4
Queens   Node   | 2.4
Queens   Tailspin  | 1686.5
Queens   Tailspin-truffle |  1934.9
Sieve    Java  |  1.1
Sieve    Node  | 2.5
Sieve    Tailspin  | 797.2
Sieve    Tailspin-truffle | 823.0

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
