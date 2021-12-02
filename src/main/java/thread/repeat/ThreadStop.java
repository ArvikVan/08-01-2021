package thread.repeat;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.12.2021
 */
public class ThreadStop {
    public static void main(String[] args) throws InterruptedException {
        Thread threadStop = new Thread(
                () -> {
                    while (!Thread.currentThread().isInterrupted()) {
                        try {
                            System.out.println("start...");
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );
        threadStop.start();
        Thread.sleep(1000);
        threadStop.interrupt();
        threadStop.join();

    }
}
