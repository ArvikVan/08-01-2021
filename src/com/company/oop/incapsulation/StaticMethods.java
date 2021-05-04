package com.company.oop.incapsulation;

public class StaticMethods {
    private int id;
    private static int counter = 1;

    StaticMethods() {
        id = counter++;
    }

    public static void displayCounter() {
        System.out.printf("Counter : %d \n", counter);
    }

    public void displayId() {
        System.out.printf("ID : %d \n", id);
    }

}
