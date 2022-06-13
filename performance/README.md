Performance benchmarks based on (copied from) https://github.com/smarr/are-we-fast-yet

Progress measured in how many times slower than Java, from the latest runs. The Richards2 benchmark is
a better-designed version of Richards with immutable packets.

| Date                                                               |Implementation| Bounce | Json | List | Permute | Queens | RadixSort | Richards | Richards2 | Sieve | Storage | Towers |
|--------------------------------------------------------------------|---|--------|------|------|---------|--|------|---|-----------|-------|---------|--------|
| [2020-07-30 jdk14 result iterator cleanup](#2020-07-30)            |Interpreted| 839    | 136  | 291  | 526     | 833 |      |   |           | 140   |         | 541    |
| [2020-07-31 jdk14 bug fixes, result iterator cleanup](#2020-07-31) |Interpreted| 741    | 131  | 273  | 605     | 672 |      |   |           | 148   |         | 524    |
| [2020-08-05 jdk14 composer backtracking](#2020-08-05)              |Interpreted| 686    | 162  | 259  | 530     | 784 |      |   |           | 160   |         | 556    |
| [2020-11-11 jdk14 regression test](#2020-11-11)                    |Interpreted| 732    | 118  | 256  | 564     | 688 |      |   |           | 152   |         | 586    |
| [2020-11-14 jdk14 Richards benchmark](#2020-11-14)                 |Interpreted| 746    | 120  | 252  | 561     | 755 |      | 911 |           | 163   |         | 585    |
| [2020-11-16 jdk14 Richards2 benchmark](#2020-11-16)                |Interpreted| 686    | 129  | 268  | 555     | 747 |      | 798 | 642       | 150   |         | 602    |
| [2020-11-28 jdk14 TailspinArray](#2020-11-28)                      |Interpreted| 750    | 121  | 231  | 527     | 848 |      | 806 | 628       | 164   |         | 659    |
| [2020-11-29 jdk14 Storage+RadixSort benchmarks](#2020-11-29)       |Interpreted| 734    | 123  | 259  | 489     | 794 | 67   | 819 | 585       | 160   | 173     | 642    |
| [2020-11-30 jdk14 freezable structures](#2020-11-30)               |Interpreted| 626    | 108  | 275  | 449     | 898 | 61   | 785 | 785       | 177   | 133     | 525    |
| [2021-02-01 jdk15 relations and lenses](#2021-02-01)               |Interpreted| 782    | 109  | 315  | 551     | 796 | 63   | 757 | 642       | 162   | 194     | 570    |
| [2021-09-12 jdk16 simple autotyping](#2021-09-12)                  |Interpreted| 910    | 73   | 390  | 613     | 1014 | 79   | 917 | 643       | 205   | 158     | 870    |
| [2021-09-12 jdk16 tagged identifiers](#2021-09-12b)                |Interpreted| 1265   | 136  | 305  | 613     | 847 | 47   | 1041 | 655       | 182   | 230     | 1001   |
| [2022-06-11 jdk18 baseline, no sudo](#2022-06-11)                  |Interpreted| 1207   | 148  | 432  | 1085    | 986 | 166  | 1069 | 811       | 757   | 192     | 978    |
| [2022-06-12 jdk18 stricter typing](#2022-06-12)                    |Interpreted|1283|116|468|904|1227|166|1127|893|807|208|823|

## 2022-06-12
machine 3, stricter typing
openjdk18

|Benchmark|Mean runtime us|
|---|---|
|Bounce Java|14|
|Bounce Tailspin|17959|
|Json Java|78|
|Json Tailspin|9042|
|List Java|23|
|List Tailspin|10766|
|Permute Java|23|
|Permute Tailspin|20786|
|Queens Java|21|
|Queens Tailspin|25766|
|RadixSort Java|58|
|RadixSort Tailspin|9645|
|Richards Java|15|
|Richards Tailspin|16904|
|Richards2 Java|16|
|Richards2 Tailspin|14284|
|Sieve Java|8|
|Sieve Tailspin|6454|
|Storage Java|93|
|Storage Tailspin|19367|
|Towers Java|25|
|Towers Tailspin|20570|

## 2022-06-11
machine 3, baseline, no sudo
openjdk18

|Benchmark|Mean runtime us|
|---|---|
|Bounce Java|14|
|Bounce Tailspin|16905|
|Json Java|72|
|Json Tailspin|10637|
|List Java|24|
|List Tailspin|10363|
|Permute Java|21|
|Permute Tailspin|22787|
|Queens Java|22|
|Queens Tailspin|21699|
|RadixSort Java|65|
|RadixSort Tailspin|10763|
|Richards Java|15|
|Richards Tailspin|16033|
|Richards2 Java|16|
|Richards2 Tailspin|12983|
|Sieve Java|8|
|Sieve Tailspin|6056|
|Storage Java|93|
|Storage Tailspin|17863|
|Towers Java|23|
|Towers Tailspin|22497|

## 2021-09-12b
machine 3, tagged identifiers
HotSpot jdk16 JVMCI

|Benchmark|Mean runtime us|
|---|---|
|Bounce      Java  |   12  |
|Bounce      Tailspin |  15175|  
|Json        Java   |    65  |
|Json        Tailspin  |   8854|  
|List        Java  |  23  |
|List        Tailspin | 7022|  
|Permute     Java  |   22  |
|Permute     Tailspin  |  13489|  
|Queens      Java   |  16  |
|Queens      Tailspin | 13555|  
|RadixSort   Java  |  113  |
|RadixSort   Tailspin | 5319|  
|Richards    Java  |  14  |
|Richards    Tailspin |  14572|  
|Richards2   Java  |   17  |
|Richards2   Tailspin |  11138|  
|Sieve       Java  |   17  |
|Sieve       Tailspin  | 3094|  
|Storage     Java |   50  |
|Storage     Tailspin |  11514 | 
|Towers      Java | 19  |
|Towers      Tailspin | 19012|

## 2021-09-12
machine 3, simple autotyping
HotSpot jdk16 JVMCI

|Benchmark|Mean runtime us|
|---|---|
Bounce      Java  |    12  
Bounce      Tailspin |  10921  
Json        Java  |  104  
Json        Tailspin  |   7571  
List        Java   |    23  
List        Tailspin |  8967  
Permute     Java  |    21  
Permute     Tailspin | 12865  
Queens      Java  |   14  
Queens      Tailspin |  14194  
RadixSort   Java  |  83  
RadixSort   Tailspin |  6531  
Richards    Java  |   13  
Richards    Tailspin | 11926  
Richards2   Java |  17  
Richards2   Tailspin |  10929  
Sieve       Java  | 16  
Sieve       Tailspin | 3282  
Storage     Java  |   66  
Storage     Tailspin | 10452  
Towers      Java |   19  
Towers      Tailspin | 16534

## 2021-02-01
machine 3, relations and lenses
HotSpot jdk15 JVMCI

|Benchmark|Mean runtime us|
|---|---|
Bounce Java|12
Bounce Tailspin|9379
Json Java|74
Json Tailspin|8032
List Java|22
List Tailspin|6935
Permute Java|22
Permute Tailspin|12114
Queens Java|14
Queens Tailspin|11146
RadixSort Java|82
RadixSort Tailspin|5186
Richards Java|14
Richards Tailspin|10596
Richards2 Java|16
Richards2 Tailspin|10266
Sieve Java|16
Sieve Tailspin|2594
Storage Java|50
Storage Tailspin|9695
Towers Java|21
Towers Tailspin|11976

## 2020-11-30
machine 3, freezable tailspin data structures, not an obvious win
HotSpot jdk14 JVMCI

|Benchmark|Mean runtime us|
|---|---|
Bounce Java|14
Bounce Tailspin|8765
Json Java|74
Json Tailspin|8010
List Java|24
List Tailspin|6607
Permute Java|25
Permute Tailspin|11229
Queens Java|14
Queens Tailspin|12574
RadixSort Java|81
RadixSort Tailspin|4966
Richards Java|13
Richards Tailspin|10202
Richards2 Java|18
Richards2 Tailspin|10446
Sieve Java|16
Sieve Tailspin|2825
Storage Java|67
Storage Tailspin|8904
Towers Java|21
Towers Tailspin|11029

## 2020-11-29
machine 3, add benchmarks Storage and RadixSort for list performance
HotSpot jdk14 JVMCI

|Benchmark|Mean runtime us|
|---|---|
Bounce Java|12
Bounce Tailspin|8804
Json Java|62
Json Tailspin|7597
List Java|21
List Tailspin|5442
Permute Java|23
Permute Tailspin|11242
Queens Java|14
Queens Tailspin|11115
RadixSort Java|83
RadixSort Tailspin|5589
Richards Java|12
Richards Tailspin|9832
Richards2 Java|16
Richards2 Tailspin|9359
Sieve Java|17
Sieve Tailspin|2715
Storage Java|50
Storage Tailspin|8630
Towers Java|18
Towers Tailspin|11560

## 2020-11-28
machine 3, wrapped Lists in TailspinArray
HotSpot jdk14 JVMCI

|Benchmark|Mean runtime us|
|---|---|
Bounce Java|12
Bounce Tailspin|8994
Json Java|63
Json Tailspin|7654
List Java|24
List Tailspin|5555
Permute Java|21
Permute Tailspin|11073
Queens Java|14
Queens Tailspin|11873
Richards Java|13
Richards Tailspin|10476
Richards2 Java|15
Richards2 Tailspin|9419
Sieve Java|17
Sieve Tailspin|2782
Towers Java|18
Towers Tailspin|11861

## 2020-11-16
machine 3, added Richards2, a better-designed version
HotSpot jdk14 JVMCI

|Benchmark|Mean runtime us|
|---|---|
Bounce Java|14
Bounce Tailspin|9607
Json Java|65
Json Tailspin|8372
List Java|22
List Tailspin|5888
Permute Java|22
Permute Tailspin|12200
Queens Java|15
Queens Tailspin|11212
Richards Java|14
Richards Tailspin|11170
Richards2 Java|16
Richards2 Tailspin|10272
Sieve Java|19
Sieve Tailspin|2846
Towers Java|20
Towers Tailspin|12043

## 2020-11-14
machine 3, added Richards
HotSpot jdk14 JVMCI

|Benchmark|Mean runtime us|
|---|---|
  Bounce      Java  |   13  
  Bounce      Tailspin | 9700  
  Json        Java  |   70  
  Json        Tailspin |  8409  
  List        Java  |    22  
  List        Tailspin |  5537  
  Permute     Java  |  20  
  Permute     Tailspin | 11213  
  Queens      Java |  14  
  Queens      Tailspin |  10575  
  Richards    Java  |  65  
  Richards    Tailspin |  59206  
  Sieve       Java  |   17  
  Sieve       Tailspin |   2763  
  Towers      Java   |   19  
  Towers      Tailspin | 11113  

## 2020-11-11
machine 3, regression test
HotSpot jdk14 JVMCI

|Benchmark|Mean runtime us|
|---|---|
  Bounce      Java   |    12  
  Bounce      Tailspin | 8782  
  Json        Java  |   63  
  Json        Tailspin |  7421  
  List        Java   |  20  
  List        Tailspin |  5122  
  Permute     Java   |   20  
  Permute     Tailspin |  11286  
  Queens      Java   |   14  
  Queens      Tailspin  |  9628  
  Sieve       Java   |    17  
  Sieve       Tailspin |  2576  
  Towers      Java  |  19  
  Towers      Tailspin | 11130  

## 2020-08-05
machine 3, backtracking in composers
HotSpot jdk14 JVMCI

|Benchmark|Mean runtime us|
|---|---|
  Bounce      Java  |  14  
  Bounce      Tailspin |  9601  
  Json        Java  |   64  
  Json        Tailspin | 10380  
  List        Java  |   22  
  List        Tailspin | 5687  
  Permute     Java  |   20  
  Permute     Tailspin |  10595  
  Queens      Java  |  14  
  Queens      Tailspin |  10978  
  Sieve       Java  |  17  
  Sieve       Tailspin  | 2716  
  Towers      Java  | 20  
  Towers      Tailspin | 11111  

## 2020-07-31
machine 3, fix bugs, more clean up result iterator usage
HotSpot jdk14 JVMCI

|Benchmark|Mean runtime us|
|---|---|
  Bounce      Java  |    14  
  Bounce      Tailspin |  10378  
  Json        Java  |    69  
  Json        Tailspin | 9047  
  List        Java   |   23  
  List        Tailspin | 6290  
  Permute     Java   |  20  
  Permute     Tailspin | 12095  
  Queens      Java  |    16  
  Queens      Tailspin  | 10751  
  Sieve       Java  | 19  
  Sieve       Tailspin |  2804  
  Towers      Java   |   22  
  Towers      Tailspin  |  11519  

## 2020-07-30
machine 3, clean up result iterator usages
HotSpot jdk14 JVMCI

|Benchmark|Mean runtime us|
|---|---|
  Bounce      Java | 12  
  Bounce      Tailspin | 10062  
  Json        Java  |   64  
  Json        Tailspin  |   8674  
  List        Java  |   21  
  List        Tailspin |  6115  
  Permute     Java  |  19  
  Permute     Tailspin |  9995  
  Queens      Java  | 14  
  Queens      Tailspin  | 11663  
  Sieve       Java |   17  
  Sieve       Tailspin |   2379  
  Towers      Java |  21  
  Towers      Tailspin | 11369  

## 2020-07-29
machine 3, use result iterator for composer
HotSpot jdk14 JVMCI

|Benchmark|Mean runtime us|
|---|---|
  Bounce      Java  | 13  
  Bounce      Tailspin | 11479  
  Json        Java  | 64  
  Json        Tailspin | 8942  
  List        Java  |  22  
  List        Tailspin |  6444  
  Permute     Java  |  19  
  Permute     Tailspin | 12623  
  Queens      Java  | 14  
  Queens      Tailspin | 12404  
  Sieve       Java  | 17  
  Sieve       Tailspin | 2299  
  Towers      Java  | 21  
  Towers      Tailspin | 11701  

## 2020-06-22
machine 3, calibrate baseline for new machine and new rebench version
HotSpot jdk14 JVMCI

|Benchmark|Mean runtime us|
|---|---|
  Bounce      Java  | 13  
  Bounce      Tailspin | 11534  
  Json        Java | 63  
  Json        Tailspin | 10031  
  List        Java  |  23  
  List        Tailspin | 7611  
  Permute     Java  | 20  
  Permute     Tailspin | 12373  
  Queens      Java | 14  
  Queens      Tailspin | 12895  
  Sieve       Java | 18  
  Sieve       Tailspin |  2428  
  Towers      Java  |  21  
  Towers      Tailspin |  11943  

## 2020-05-02f
machine 1
HotSpot jdk14 JVMCI

|Benchmark|Mean runtime us|
|---|---|
Bounce   Java | 2.2
Bounce   Tailspin | 1479.8
Json     Java | 12.7
Json     Tailspin | 2035.0
List     Java | 2.4
List     Tailspin | 851.6
Permute  Java  | 1.5
Permute  Tailspin | 932.5
Queens   Java | 2.0
Queens   Tailspin | 1678.4
Sieve    Java | 2.7
Sieve    Tailspin | 799.2
Towers   Java | 2.3
Towers   Tailspin | 1348.9

## 2020-05-02e
machine 1
J9 jdk14 JVMCI

|Benchmark|Mean runtime us|
|---|---|
Bounce   Java | 1.3
Bounce   Tailspin | 1136.0
Json     Java | 9.7
Json     Tailspin | 2806.8
List     Java | 3.8
List     Tailspin | 777.2
Permute  Java | 1.1
Permute  Tailspin| 678.0
Queens   Java | 1.6
Queens   Tailspin | 1137.7
Sieve    Java | 1.6
Sieve    Tailspin | 512.9
Towers   Java |  2.4
Towers   Tailspin | 1004.4

## 2020-05-02d
machine 1
Triangulation with J9 jdk11

|Benchmark|Mean runtime us|
|---|---|
Bounce   Java | 1.2
Bounce   Tailspin | 1176.7
Json     Java  | 10.3
Json     Tailspin | 3135.1
List     Java  |  3.9
List     Tailspin |  759.4
Permute  Java  | 1.1
Permute  Tailspin | 628.6
Queens   Java  | 1.5
Queens   Tailspin |  1052.6
Sieve    Java  | 1.5
Sieve    Tailspin | 482.2
Towers   Java | 2.2
Towers   Tailspin | 983.1

## 2020-05-02c
machine 1
Just for fun to compare with zulu jdk11

|Benchmark|Mean runtime us|
|---|---|
Bounce   Java  |   1.3
Bounce   Tailspin |1330.4
Json     Java  |  13.4
Json     Tailspin | 1851.7
List     Java  |  1.5
List     Tailspin | 738.2
Permute  Java  | 0.7
Permute  Tailspin | 781.4
Queens   Java  |1.5
Queens   Tailspin | 1333.3
Sieve    Java | 1.3
Sieve    Tailspin | 654.9
Towers   Java | 1.4
Towers   Tailspin | 1122.7

## 2020-05-02b
machine 1
Sanity checking on HotSpot OpenJdk12

|Benchmark|Mean runtime us|
|---|---|
Bounce   Java |1.2
Bounce   Tailspin |  1406.0
Json     Java  | 12.8
Json     Tailspin| 1846.4
List     Java | 2.0
List     Tailspin |747.0
Permute  Java | 0.7
Permute  Tailspin | 819.4
Queens   Java | 1.2
Queens   Tailspin | 1359.7
Sieve    Java | 1.2
Sieve    Tailspin | 660.2
Towers   Java | 1.5
Towers   Tailspin | 1141.6

## 2020-05-02
Checking for regressions. machine 1
Wild differences probably because I am now running OpenJdk14 on J9

|Benchmark|Mean runtime us|
|---|---|
Bounce   Java |1.1
Bounce   Tailspin | 1072.0
Json     Java | 8.6
Json     Tailspin | 2791.3
List     Java | 3.7
List     Tailspin | 703.6
Permute  Java | 1.1
Permute  Tailspin | 616.0
Queens   Java | 1.6
Queens   Tailspin | 1032.9
Sieve    Java | 1.3
Sieve    Tailspin | 469.6
Towers   Java | 2.2
Towers   Tailspin | 910.4

## 2020-04-18
Just checking for regressions. machine 1

|Benchmark|Mean runtime us|
|---|---|
Bounce   Java | 1.3
Bounce   Tailspin |1390.8
Json     Java |13.0
Json     Tailspin | 1904.0
List     Java | 1.7
List     Tailspin | 729.5
Permute  Java | 0.7
Permute  Tailspin | 837.5
Queens   Java | 1.2
Queens   Tailspin | 1393.1
Sieve    Java | 1.2
Sieve    Tailspin | 654.6
Towers   Java | 1.6
Towers   Tailspin | 1120.1

## 2020-01-26
Just checking for regressions. machine 1

|Benchmark|Mean runtime us|
|---|---|
Bounce   Java | 1.2
Bounce   Tailspin|1407.5
Json     Java  | 12.7
Json     Tailspin | 1989.9
List     Java | 1.8
List     Tailspin|807.8
Permute  Java | 0.8
Permute  Tailspin | 950.9
Queens   Java | 1.3
Queens   Tailspin |1412.3
Sieve    Java  |  1.3
Sieve    Tailspin | 677.5
Towers   Java |1.5
Towers   Tailspin | 1174.3

## 2019-11-27
No more queues as expression results. machine 1

|Benchmark|Mean runtime us|
|---|---|
Bounce   Java | 1.0
Bounce   Tailspin | 1371.4
Json     Java  | 12.2
Json     Tailspin | 1921.6
List     Java  | 1.7
List     Tailspin | 748.0
Permute  Java  | 0.8
Permute  Tailspin | 909.1
Queens   Java | 1.3
Queens   Tailspin | 1449.0
Sieve    Java | 1.3
Sieve    Tailspin | 635.8
Towers   Java | 1.5
Towers   Tailspin | 1343.0

## 2019-11-24
Fix the slowdown, simplify some stuff. Run on machine 1.

|Benchmark|Mean runtime us|
|---|---|
Bounce   Java | 1.0
Bounce   Tailspin |1539.7
Json     Java  | 12.5
Json     Tailspin |1996.1
List     Java |1.5
List     Tailspin | 903.1
Permute  Java | 0.7
Permute  Tailspin | 933.4
Queens   Java | 1.2
Queens   Tailspin | 1741.7
Sieve    Java | 1.2
Sieve    Tailspin | 750.4
Towers   Java | 1.5
Towers   Tailspin| 1387.0

## 2019-11-21
Even more refactoring to result iterators. Run on machine 1. Need to look into what happened
to performance on Towers.

|Benchmark|Mean runtime us|
|---|---|
Bounce   Java | 1.1
Bounce   Node | 1.8
Bounce   Tailspin |1379.1
Json     Java  |12.4
Json     Node  | 15.8
Json     Tailspin | 1959.7
List     Java | 1.7
List     Node | 2.8
List     Tailspin | 1023.9
Permute  Java  |  0.8
Permute  Node  | 1.4
Permute  Tailspin |1019.4
Queens   Java | 1.2
Queens   Node | 2.4
Queens   Tailspin | 1729.8
Sieve    Java | 1.2
Sieve    Node | 2.3
Sieve    Tailspin|736.6
Towers   Java | 1.5
Towers   Node | 2.4
Towers   Tailspin| 17246.6

## 2019-11-16
Continued refactoring to result iterators. Run on machine 2.

|Benchmark|Mean runtime us|
|---|---|
Bounce   Java|0.9
Bounce   Node |5.6
Bounce   Tailspin |1218.2
Json     Java  |10.9
Json     Node | 14.6
Json     Tailspin|1674.7
List     Java | 1.2
List     Node | 2.4
List     Tailspin |696.2
Permute  Java | 0.7
Permute  Node | 1.2
Permute  Tailspin | 728.8
Queens   Java |1.1
Queens   Node | 2.1
Queens   Tailspin|1397.6
Sieve    Java | 1.0
Sieve    Node | 2.5
Sieve    Tailspin| 627.5
Towers   Java| 1.2
Towers   Node | 2.2
Towers   Tailspin|1124.5

## 2019-11-03
After applying some tail-call-flattening code. Run on machine 1.

|Benchmark|Mean runtime us|
|---|---|
Bounce   Java| 1.2
Bounce   Node |2.1
Bounce   Tailspin|1678.9
Json     Java | 12.0
Json     Node | 13.7
Json     Tailspin |1878.8
List     Java | 1.5
List     Node | 2.6
List     Tailspin |1048.6
Permute  Java | 0.7
Permute  Node  | 1.4
Permute  Tailspin |1016.5
Queens   Java | 1.2
Queens   Node | 2.4
Queens   Tailspin | 1718.1
Sieve    Java | 1.2
Sieve    Node | 2.4
Sieve    Tailspin | 730.7
Towers   Java | 1.4
Towers   Node | 2.4
Towers   Tailspin |1380.3

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
