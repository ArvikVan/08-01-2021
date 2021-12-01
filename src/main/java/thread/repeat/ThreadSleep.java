package thread.repeat;

/**
 * @author ArvikV
 * @version 1.0
 * @since 01.12.2021
 */
public class ThreadSleep {
 public static void main(String[] args) {
    Thread thread = new Thread(
            () -> {
             try {
              System.out.println("Start Loading...");
              Thread.sleep(3000);
              System.out.println("Loading");
             } catch (InterruptedException e) {
              e.printStackTrace();
             }
            }
    );
    thread.start();
    System.out.println("MAIN");
 }
}
