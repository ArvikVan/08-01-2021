package concurency;

public class DebugConcurrentDemo {
    public static void main(String[] args) {
        String name = "first thread";
        String name2 = "second thread";
        Thread thread = new Thread(() -> {
            try {
                for (int i = 3; i > 0; i--) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " прерван ");
                }
            System.out.println(Thread.currentThread().getName() + " завершен.");
        }, name);
        Thread thread2 = new Thread(() -> {
            try {
                for (int i = 10; i < 13; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " прерван ");
            }
            System.out.println(Thread.currentThread().getName() + " завершен.");
        }, name2);
        thread.start();
        thread2.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван ");
        }
        System.out.println("Главный поток завершен.");
    }
}
