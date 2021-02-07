package com.company.oop.generics;

public class Account2G <T, S>{
    private T id;
    private S sum;

    public Account2G(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public S getSum() {
        return sum;
    }

    public void setSum(S sum) {
        this.sum = sum;
    }
}
