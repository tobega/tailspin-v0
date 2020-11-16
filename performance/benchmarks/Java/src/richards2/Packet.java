/*
 * This benchmark is derived from Mario Wolczko's Java and Smalltalk version of
 * Richards.
 *
 * It is modified based on the SOM version and to use Java 8 features.
 * License details:
 *   http://web.archive.org/web/20050825101121/http://www.sunlabs.com/people/mario/java_benchmarking/index.html
 */
package richards2;


final class Packet extends RBObject {
  public static final int DATA_SIZE = 4;

  Packet(final int identity, final int kind) {
    this(identity, kind, 0, new int[DATA_SIZE]);
  }

  Packet(final int identity, final int kind, int datum, int[] data) {
    this.identity = identity;
    this.kind     = kind;
    this.datum    = datum;
    this.data     = data;
  }

  private final int         identity;
  private final int   kind;
  private final int         datum;
  private final int[] data;

  public int getData(int i) {
    return data[i];
  }

  public int   getDatum() { return datum; }

  public int  getIdentity() { return identity; }

  public int getKind() { return kind; }

  @Override
  public String toString() {
    return "Packet id: " + identity + " kind: " + kind;
  }

  public Packet withIdentity(int identity) {
    return new Packet(identity, kind, datum, data);
  }

  public Packet withDatum(int datum) {
    return new Packet(identity, kind, datum, data);
  }
}
