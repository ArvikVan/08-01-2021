package preptointerview;

/**
 * @author ArvikV
 * @version 1.0
 * @since 05.03.2022
 */
public class ThreadEx4 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("first thread ");
            }
        }).start();

        new Thread(() -> System.out.println("second thread ")).start();
    }
}
