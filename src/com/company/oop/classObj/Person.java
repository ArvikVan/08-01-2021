package com.company.oop.classObj;

class Person {
    String name;
    int age;
    int height;
    String hair;

    void walk(){
        System.out.printf("Действие из Person, Name %s, %d Age, %d Height, %s Hair  ", name, age, height, hair);
        System.out.println();
    }

    Person() {
        name = "Undefined";
        age = 11;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name) {
        this.name = name;
    }
}
