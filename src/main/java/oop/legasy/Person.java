package com.company.oop.legasy;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void dispaly() {
        System.out.println("Name: " + name);
    }
}
