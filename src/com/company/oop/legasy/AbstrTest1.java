package com.company.oop.legasy;

public class AbstrTest1 {
    public static void main(String[] args) {
        System.out.println("Обращаемся к объекту Doberman d = new Doberman();");
        System.out.println("И через него обращаемся к методу класса Dog");
        Doberman d = new Doberman();
        d.bark();
        System.out.println("Обращаемся к объекту StreetDog str = new StreetDog();");
        System.out.println("И через него обращаемся к методу абстрактного класса Dog");
        StreetDog str = new StreetDog();
        str.bark();
    }
}
