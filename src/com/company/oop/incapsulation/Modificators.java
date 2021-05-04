package com.company.oop.incapsulation;

public class Modificators {
    /*
    * public - поля и методы видны всем классам в пакете и за его пределами
    * private - поля и методы доступны только в классе
    * protected - поля и методы доступны в классе, а также в наследниках в том же пакете
    * По умолчанию
    * */

    public static void main(String[] args) {
        Person jack = new Person("Jack", 25, "Unarokovo", "333225255");
        jack.displayName();
        jack.displayAge();
        //jack.displayAddress(); ошибка доступа, поскольку метод displayAddress private
        jack.displayPhone();

        System.out.println(jack.age);
        System.out.println(jack.address); //переменная address доступна поскольку public String address;
        //System.out.println(jack.phone); ошибка доступа поскольку private String phone;
    }
}
