package preptointerview;

/**
 * @author ArvikV
 * @version 1.0
 * @since 05.03.2022
 */
public class ThreadEx1 {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        thread1.start();
        thread2.start();
    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}