package preptointerview;

/**
 * @author ArvikV
 * @version 1.0
 * @since 05.03.2022
 */
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread begins");
        Thread thread = new Thread(new ThreadRunStateJpb());
        System.out.println("Thread thread = new Thread(new ThreadRunStateJpb()); -  " + thread.getState());
        thread.start();
        System.out.println("thread.start(); - " + thread.getState());
        thread.join(5000);
        System.out.println(thread.getState());
        System.out.println("Method main ends");
    }
}

class ThreadRunStateJpb implements Runnable {

    @Override
    public void run() {
        System.out.println("class ThreadRunStateJpb implements Runnable ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
