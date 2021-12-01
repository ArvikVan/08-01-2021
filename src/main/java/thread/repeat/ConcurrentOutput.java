package thread.repeat;

/**
 * @author ArvikV
 * @version 1.0
 * @since 01.12.2021
 */
public class ConcurrentOutput {
    public static void main(String[] args) {
        Thread another = new Thread(
                () -> {
                    System.out.println("First");
                }
        );
        //System.out.println(Thread.currentThread().getName());
        another.start();
        System.out.println(Thread.currentThread().getName());

        Thread runnn = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Runnable");
                    }
                }
        );
        runnn.start();
        System.out.println(Thread.currentThread().getName());
    }
}
