package com.company.oop.incapsulation;

public class AccessDemo {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setAlpha(2);//можем поменять приватную переменную через сеттер
        System.out.println(myClass.getAlpha());//доступ только через метод геттер
        myClass.betta = 12;//можем поменять переменную , которая в другом классе публична
        System.out.println(myClass.betta);
        System.out.println(myClass.gamma);
    }
}
