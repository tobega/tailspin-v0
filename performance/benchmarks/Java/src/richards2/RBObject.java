/*
 * This benchmark is derived from Mario Wolczko's Java and Smalltalk version of
 * Richards.
 * 
 * It is modified based on the SOM version and to use Java 8 features.
 * License details:
 *   http://web.archive.org/web/20050825101121/http://www.sunlabs.com/people/mario/java_benchmarking/index.html
 */
package richards2;


abstract class RBObject {
  public static final int WORKER    = 0;
  public static final int HANDLER_A = 1;
  public static final int HANDLER_B = 2;
  public static final int DEVICE_A  = 3;
  public static final int DEVICE_B  = 4;
  public static final int NUM_TYPES = 5;

  public static final int DEVICE_PACKET_KIND = 0;
  public static final int WORK_PACKET_KIND   = 1;

  public static final Packet NO_WORK = null;
  public static final TaskControlBlock NO_TASK = null;
}
