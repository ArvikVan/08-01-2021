package com.company.oop.incapsulation;

public class StaticProgram {
    public static void main(String[] args) {
/*        StaticPerson tom = new StaticPerson();
        StaticPerson bob = new StaticPerson();
        StaticPerson tob = new StaticPerson();

        tom.displayId();// ID : 1
        bob.displayId();// ID : 2
        tob.displayId();// ID : 3

        System.out.println(StaticPerson.counter);// counter = 4
        StaticPerson.counter = 10;

        StaticPerson clark = new StaticPerson();
        clark.displayId();//10*/
        StaticMethods.displayCounter();// Counter = 1

        StaticMethods bob = new StaticMethods();//2
        StaticMethods tom = new StaticMethods();//3

        bob.displayCounter(); //Counter = 3
        tom.displayCounter();// Counter = 3


    }
}
