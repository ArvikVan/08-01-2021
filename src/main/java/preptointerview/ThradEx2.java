package preptointerview;

/**
 * @author ArvikV
 * @version 1.0
 * @since 05.03.2022
 */
public class ThradEx2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread4());
        thread1.start();
        thread2.start();
    }
}

class MyThread3 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class MyThread4 implements Runnable {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}
