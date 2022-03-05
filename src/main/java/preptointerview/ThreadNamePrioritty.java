package preptointerview;

/**
 * @author ArvikV
 * @version 1.0
 * @since 05.03.2022
 */
public class ThreadNamePrioritty {
    public static void main(String[] args) {
        MyThread5 thread5 = new MyThread5();
        System.out.println(thread5.getName());
        System.out.println(thread5.getPriority());
        thread5.setName("mythread");
        thread5.setPriority(9);
        System.out.println(thread5.getName());
        System.out.println(thread5.getPriority());
        System.out.println(Thread.currentThread());
    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("MyThread5");
    }
}
