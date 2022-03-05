package oop.generics;

public class AccountG<T> {
    private T id;
    private int sum;

    public AccountG(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }
}
