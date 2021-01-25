package com.company.oop.classObj;

public class CreateClass {
    public static void main(String[] args) {
        Person tom = new Person("Thomas", 39); // инициализация конструктора
/*        tom.name = "Thomas";
        tom.age = 39;
        tom.height = 185;
        tom.hair = "Black";*/
        tom.walk();

        Person nick = new Person("Nick", 49);
        nick.walk();
        Person yaromir = new Person();
        yaromir.walk();
    }
}
