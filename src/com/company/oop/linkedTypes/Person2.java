package com.company.oop.linkedTypes;

public class Person2 implements Cloneable {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display(){
        System.out.printf("Person : %s \n", name);
    }
    public Person2 clone() throws CloneNotSupportedException{
        return (Person2) super.clone();
    }
}
