package com.company.oop.incapsulation;

class StaticPerson {
    private int id;
    static int counter = 1;

    StaticPerson() {//при создании конструктора static поле не предлагалось ide
        id = counter++;

    }
    public void displayId(){
        System.out.printf("ID: %d \n", id);
    }
}
