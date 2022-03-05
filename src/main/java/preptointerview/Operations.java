package preptointerview;


import javax.naming.InsufficientResourcesException;

/**
 * @author ArvikV
 * @version 1.0
 * @since 05.03.2022
 */
public class Operations {
    public static void main(String[] args) throws InterruptedException {
        final Accountthread accountthread = new Accountthread(1000);
        final Accountthread accountthread1 = new Accountthread(2000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    transfer(accountthread, accountthread1, 500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        transfer(accountthread1, accountthread, 300);
    }

    private static void transfer(Accountthread accountthread, Accountthread accountthread1, int amount)
            throws InterruptedException {
        if (accountthread.getBalance() > amount) {
            try {
                throw new InsufficientResourcesException();
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
            synchronized (accountthread) {
             synchronized (accountthread1) {
                 accountthread.withdraw(amount);
                 Thread.sleep(10000);
                 System.out.println("accountthread.withdraw(amount);");
                 accountthread1.deposit(amount);
                 System.out.println("accountthread1.deposit(amount);");
             }
            }
        }
    }
}
