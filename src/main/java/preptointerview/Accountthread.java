package preptointerview;

/**
 * @author ArvikV
 * @version 1.0
 * @since 05.03.2022
 */
public class Accountthread {
    private int balance;

    public Accountthread(int initBalance) {
        this.balance = initBalance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
