package com.company.oop.generics;

public class Printer {
    public <T> void print(T[] items){
        for (T item: items) {
            System.out.println(item);
        }
    }
}
