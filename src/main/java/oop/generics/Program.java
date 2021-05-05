package com.company.oop.generics;

public class Program {
    public static void main(String[] args) {
        Account acc1 = new Account(25, 5455);
        System.out.println("ID: " + acc1.getId() + " sum: " + acc1.getSum());

        Account acc2 = new Account("id25", 455454);
        System.out.println("ID: " + acc2.getId() + " sum: " + acc2.getSum());
    }
}
