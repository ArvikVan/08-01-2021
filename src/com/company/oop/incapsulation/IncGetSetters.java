package com.company.oop.incapsulation;

public class IncGetSetters {
    public static void main(String[] args) {
        PersonInc castiel = new PersonInc("Castiel", 39);
        System.out.println(castiel.getAge()); //39
        castiel.setAge(49);
        System.out.println(castiel.getAge()); //49
        castiel.setAge(125);
        System.out.println(castiel.getAge()); //49 поскольку 125 не влазиет в условие

    }
}
